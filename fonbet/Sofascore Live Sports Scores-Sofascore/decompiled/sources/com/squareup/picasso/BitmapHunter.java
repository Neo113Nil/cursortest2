package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cwh;
import defpackage.fc6;
import defpackage.is8;
import defpackage.lof;
import defpackage.o6a;
import defpackage.oy1;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class BitmapHunter implements Runnable {
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    public BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    public static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final Transformation transformation = list.get(i);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final StringBuilder q = fc6.q("Transformation ");
                    q.append(transformation.key());
                    q.append(" returned null after ");
                    q.append(i);
                    q.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        q.append(it.next().key());
                        q.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(q.toString());
                        }
                    });
                    return null;
                }
                if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (transform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i++;
                bitmap = transform;
            } catch (RuntimeException e) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + Transformation.this.key() + " crashed with exception.", e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority computeNewPriority() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        Action action = this.action;
        if (action == null && !z) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority priority2 = this.actions.get(i).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap decodeStream(cwh cwhVar, Request request) throws IOException {
        lof o = o6a.o(cwhVar);
        boolean isWebPFile = Utils.isWebPFile(o);
        boolean z = request.purgeable;
        BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = RequestHandler.requiresInSampleSize(createBitmapOptions);
        if (isWebPFile) {
            byte[] q0 = o.q0();
            if (requiresInSampleSize) {
                BitmapFactory.decodeByteArray(q0, 0, q0.length, createBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            }
            return BitmapFactory.decodeByteArray(q0, 0, q0.length, createBitmapOptions);
        }
        oy1 oy1Var = new oy1(o, 4);
        if (requiresInSampleSize) {
            MarkableInputStream markableInputStream = new MarkableInputStream(oy1Var);
            markableInputStream.allowMarksToExpire(false);
            long savePosition = markableInputStream.savePosition(1024);
            BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            markableInputStream.reset(savePosition);
            markableInputStream.allowMarksToExpire(true);
            oy1Var = markableInputStream;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(oy1Var, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        is8.e("Failed to decode stream.");
        return null;
    }

    public static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i = 0; i < size; i++) {
            RequestHandler requestHandler = requestHandlers.get(i);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    public static int getExifRotation(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int getExifTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            return true;
        }
        if (i3 == 0 || i <= i3) {
            return i4 != 0 && i2 > i4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap transformResult(Request request, Bitmap bitmap, int i) {
        int i2;
        int i3;
        boolean z;
        Matrix matrix;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i5;
        float f9;
        float f10;
        float f11;
        float f12;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z2 = request.onlyScaleDown;
        Matrix matrix2 = new Matrix();
        if (request.needsMatrixTransform() || i != 0) {
            int i13 = request.targetWidth;
            int i14 = request.targetHeight;
            float f13 = request.rotationDegrees;
            if (f13 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                double d = f13;
                double cos = Math.cos(Math.toRadians(d));
                double sin = Math.sin(Math.toRadians(d));
                if (request.hasRotationPivot) {
                    matrix2.setRotate(f13, request.rotationPivotX, request.rotationPivotY);
                    float f14 = request.rotationPivotX;
                    double d2 = 1.0d - cos;
                    float f15 = request.rotationPivotY;
                    double d3 = (f15 * sin) + (f14 * d2);
                    double d4 = (f15 * d2) - (f14 * sin);
                    int i15 = request.targetWidth;
                    double d5 = (i15 * cos) + d3;
                    double d6 = (i15 * sin) + d4;
                    i3 = height;
                    z = z2;
                    int i16 = request.targetHeight;
                    double d7 = ((i15 * cos) + d3) - (i16 * sin);
                    i2 = width;
                    double d8 = (i16 * cos) + (i15 * sin) + d4;
                    double d9 = d3 - (i16 * sin);
                    double d10 = (i16 * cos) + d4;
                    double max = Math.max(d9, Math.max(d7, Math.max(d3, d5)));
                    double min = Math.min(d9, Math.min(d7, Math.min(d3, d5)));
                    double max2 = Math.max(d10, Math.max(d8, Math.max(d4, d6)));
                    double min2 = Math.min(d10, Math.min(d8, Math.min(d4, d6)));
                    i13 = (int) Math.floor(max - min);
                    i14 = (int) Math.floor(max2 - min2);
                } else {
                    i2 = width;
                    z = z2;
                    i3 = height;
                    matrix2.setRotate(f13);
                    int i17 = request.targetWidth;
                    double d11 = i17 * cos;
                    double d12 = i17 * sin;
                    int i18 = request.targetHeight;
                    double d13 = (i17 * cos) - (i18 * sin);
                    double d14 = (i18 * cos) + (i17 * sin);
                    double d15 = -(i18 * sin);
                    double d16 = i18 * cos;
                    matrix = matrix2;
                    double max3 = Math.max(d15, Math.max(d13, Math.max(0.0d, d11)));
                    double min3 = Math.min(d15, Math.min(d13, Math.min(0.0d, d11)));
                    double max4 = Math.max(d16, Math.max(d14, Math.max(0.0d, d12)));
                    double min4 = Math.min(d16, Math.min(d14, Math.min(0.0d, d12)));
                    int floor = (int) Math.floor(max3 - min3);
                    i14 = (int) Math.floor(max4 - min4);
                    i13 = floor;
                    if (i == 0) {
                        int exifRotation = getExifRotation(i);
                        int exifTranslation = getExifTranslation(i);
                        if (exifRotation != 0) {
                            matrix2 = matrix;
                            matrix2.preRotate(exifRotation);
                            if (exifRotation == 90 || exifRotation == 270) {
                                int i19 = i14;
                                i14 = i13;
                                i13 = i19;
                            }
                        } else {
                            matrix2 = matrix;
                        }
                        if (exifTranslation != 1) {
                            matrix2.postScale(exifTranslation, 1.0f);
                        }
                    } else {
                        matrix2 = matrix;
                    }
                    if (!request.centerCrop) {
                        if (i13 != 0) {
                            f9 = i13;
                            i5 = i2;
                            f10 = i5;
                        } else {
                            i5 = i2;
                            f9 = i14;
                            f10 = i3;
                        }
                        float f16 = f9 / f10;
                        if (i14 != 0) {
                            f11 = i14;
                            f12 = i3;
                        } else {
                            f11 = i13;
                            f12 = i5;
                        }
                        float f17 = f11 / f12;
                        if (f16 > f17) {
                            int ceil = (int) Math.ceil((f17 / f16) * i3);
                            int i20 = request.centerCropGravity;
                            i9 = (i20 & 48) == 48 ? 0 : (i20 & 80) == 80 ? i3 - ceil : (i3 - ceil) / 2;
                            i7 = ceil;
                            i6 = i5;
                            f17 = i14 / ceil;
                            i8 = 0;
                        } else if (f16 < f17) {
                            int ceil2 = (int) Math.ceil((f16 / f17) * i5);
                            int i21 = request.centerCropGravity;
                            int i22 = (i21 & 3) == 3 ? 0 : (i21 & 5) == 5 ? i5 - ceil2 : (i5 - ceil2) / 2;
                            i6 = ceil2;
                            f16 = i13 / ceil2;
                            i9 = 0;
                            i8 = i22;
                            i7 = i3;
                        } else {
                            f16 = f17;
                            i6 = i5;
                            i7 = i3;
                            i8 = 0;
                            i9 = 0;
                        }
                        if (shouldResize(z, i5, i3, i13, i14)) {
                            matrix2.preScale(f16, f17);
                        }
                        i10 = i7;
                        i11 = i8;
                        i12 = i9;
                        i4 = i6;
                        createBitmap = Bitmap.createBitmap(bitmap, i11, i12, i4, i10, matrix2, true);
                        if (createBitmap != bitmap) {
                            return bitmap;
                        }
                        bitmap.recycle();
                        return createBitmap;
                    }
                    i4 = i2;
                    if (request.centerInside) {
                        if (i13 != 0) {
                            f5 = i13;
                            f6 = i4;
                        } else {
                            f5 = i14;
                            f6 = i3;
                        }
                        float f18 = f5 / f6;
                        if (i14 != 0) {
                            f7 = i14;
                            f8 = i3;
                        } else {
                            f7 = i13;
                            f8 = i4;
                        }
                        float f19 = f7 / f8;
                        if (f18 >= f19) {
                            f18 = f19;
                        }
                        if (shouldResize(z, i4, i3, i13, i14)) {
                            matrix2.preScale(f18, f18);
                        }
                    } else if ((i13 != 0 || i14 != 0) && (i13 != i4 || i14 != i3)) {
                        if (i13 != 0) {
                            f = i13;
                            f2 = i4;
                        } else {
                            f = i14;
                            f2 = i3;
                        }
                        float f20 = f / f2;
                        if (i14 != 0) {
                            f3 = i14;
                            f4 = i3;
                        } else {
                            f3 = i13;
                            f4 = i4;
                        }
                        float f21 = f3 / f4;
                        if (shouldResize(z, i4, i3, i13, i14)) {
                            matrix2.preScale(f20, f21);
                        }
                    }
                }
            } else {
                i2 = width;
                i3 = height;
                z = z2;
            }
            matrix = matrix2;
            if (i == 0) {
            }
            if (!request.centerCrop) {
            }
        } else {
            i4 = width;
            i3 = height;
        }
        i10 = i3;
        i11 = 0;
        i12 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i11, i12, i4, i10, matrix2, true);
        if (createBitmap != bitmap) {
        }
    }

    public static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb = NAME_BUILDER.get();
        sb.ensureCapacity(name.length() + 8);
        sb.replace(8, sb.length(), name);
        Thread.currentThread().setName(sb.toString());
    }

    public void attach(Action action) {
        boolean z = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z) {
                List<Action> list = this.actions;
                if (list == null || list.isEmpty()) {
                    Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                } else {
                    Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        List list2 = this.actions;
        if (list2 == null) {
            list2 = new ArrayList(3);
            this.actions = list2;
        }
        list2.add(action);
        if (z) {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    public boolean cancel() {
        List<Action> list;
        Future<?> future;
        return this.action == null && ((list = this.actions) == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    public void detach(Action action) {
        boolean remove;
        if (this.action == action) {
            this.action = null;
            remove = true;
        } else {
            List<Action> list = this.actions;
            remove = list != null ? list.remove(action) : false;
        }
        if (remove && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Request getData() {
        return this.data;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getKey() {
        return this.key;
    }

    public Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.priority;
    }

    public Bitmap getResult() {
        return this.result;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap hunt() throws IOException {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i;
        RequestHandler.Result load = this.requestHandler.load(this.data, i);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                cwh source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    try {
                        if (!this.data.needsMatrixTransform()) {
                            if (this.exifOrientation != 0) {
                            }
                            if (this.data.hasCustomTransformations()) {
                                bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                                if (this.picasso.loggingEnabled) {
                                    Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId());
                        }
                        if (this.data.hasCustomTransformations()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean isCancelled() {
        Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        updateThreadName(this.data);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
                        }
                        Bitmap hunt = hunt();
                        this.result = hunt;
                        Dispatcher dispatcher = this.dispatcher;
                        if (hunt == null) {
                            dispatcher.dispatchFailed(this);
                        } else {
                            dispatcher.dispatchComplete(this);
                        }
                        Thread.currentThread().setName("Picasso-Idle");
                    } catch (IOException e) {
                        this.exception = e;
                        this.dispatcher.dispatchRetry(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (NetworkRequestHandler.ResponseException e2) {
                    if (!NetworkPolicy.isOfflineOnly(e2.networkPolicy) || e2.code != 504) {
                        this.exception = e2;
                    }
                    this.dispatcher.dispatchFailed(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (Exception e3) {
                this.exception = e3;
                this.dispatcher.dispatchFailed(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e4) {
                StringWriter stringWriter = new StringWriter();
                this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                this.exception = new RuntimeException(stringWriter.toString(), e4);
                this.dispatcher.dispatchFailed(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    public boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        int i = this.retryCount;
        if (i <= 0) {
            return false;
        }
        this.retryCount = i - 1;
        return this.requestHandler.shouldRetry(z, networkInfo);
    }

    public boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }
}
