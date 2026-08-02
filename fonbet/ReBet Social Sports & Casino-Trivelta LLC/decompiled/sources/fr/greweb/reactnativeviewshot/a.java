package fr.greweb.reactnativeviewshot;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class a implements UIBlock, com.facebook.react.fabric.interop.UIBlock {

    /* renamed from: o, reason: collision with root package name */
    public static final String f46792o = "a";
    private static byte[] outputBuffer = new byte[PKIFailureInfo.notAuthorized];

    /* renamed from: p, reason: collision with root package name */
    public static final Object f46793p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final Set f46794q = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final int f46795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46797c;

    /* renamed from: d, reason: collision with root package name */
    public final double f46798d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f46799e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f46800f;

    /* renamed from: g, reason: collision with root package name */
    public final File f46801g;

    /* renamed from: h, reason: collision with root package name */
    public final String f46802h;

    /* renamed from: i, reason: collision with root package name */
    public final Promise f46803i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f46804j;

    /* renamed from: k, reason: collision with root package name */
    public final ReactApplicationContext f46805k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f46806l;

    /* renamed from: m, reason: collision with root package name */
    public final Activity f46807m;

    /* renamed from: n, reason: collision with root package name */
    public final Executor f46808n;

    /* renamed from: fr.greweb.reactnativeviewshot.a$a, reason: collision with other inner class name */
    public class RunnableC0677a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UIBlockViewResolver f46809a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NativeViewHierarchyManager f46810b;

        public RunnableC0677a(UIBlockViewResolver uIBlockViewResolver, NativeViewHierarchyManager nativeViewHierarchyManager) {
            this.f46809a = uIBlockViewResolver;
            this.f46810b = nativeViewHierarchyManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            View resolveView;
            try {
                if (a.this.f46795a == -1) {
                    resolveView = a.this.f46807m.getWindow().getDecorView().findViewById(R.id.content);
                } else {
                    UIBlockViewResolver uIBlockViewResolver = this.f46809a;
                    resolveView = uIBlockViewResolver != null ? uIBlockViewResolver.resolveView(a.this.f46795a) : this.f46810b.resolveView(a.this.f46795a);
                }
                if (resolveView == null) {
                    Log.e(a.f46792o, "No view found with reactTag: " + a.this.f46795a, new AssertionError());
                    a.this.f46803i.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + a.this.f46795a);
                    return;
                }
                d dVar = new d(a.outputBuffer);
                dVar.J(a.x(resolveView));
                a.outputBuffer = dVar.B();
                if ("tmpfile".equals(a.this.f46802h) && -1 == a.this.f46797c) {
                    a.this.B(resolveView);
                    return;
                }
                if ("tmpfile".equals(a.this.f46802h) && -1 != a.this.f46797c) {
                    a.this.C(resolveView);
                    return;
                }
                if (!"base64".equals(a.this.f46802h) && !"zip-base64".equals(a.this.f46802h)) {
                    if ("data-uri".equals(a.this.f46802h)) {
                        a.this.A(resolveView);
                        return;
                    }
                    return;
                }
                a.this.z(resolveView);
            } catch (Throwable th2) {
                Log.e(a.f46792o, "Failed to capture view snapshot", th2);
                a.this.f46803i.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
            }
        }
    }

    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Canvas f46812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f46813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f46814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bitmap f46815d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Paint f46816e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f46817f;

        public b(Canvas canvas, View view, View view2, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
            this.f46812a = canvas;
            this.f46813b = view;
            this.f46814c = view2;
            this.f46815d = bitmap;
            this.f46816e = paint;
            this.f46817f = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            int save = this.f46812a.save();
            a.this.p(this.f46812a, this.f46813b, this.f46814c);
            this.f46812a.drawBitmap(this.f46815d, 0.0f, 0.0f, this.f46816e);
            this.f46812a.restoreToCount(save);
            a.y(this.f46815d);
            this.f46817f.countDown();
        }
    }

    public @interface c {
        public static final Bitmap.CompressFormat[] mapping = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public static class d extends ByteArrayOutputStream {
        public d(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        public static int r(int i10) {
            if (i10 >= 0) {
                return i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            throw new OutOfMemoryError();
        }

        public byte[] B() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void J(int i10) {
            ((ByteArrayOutputStream) this).count = i10;
        }

        public ByteBuffer d(int i10) {
            if (((ByteArrayOutputStream) this).buf.length < i10) {
                k(i10);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        public void k(int i10) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i10 < 0) {
                length = i10;
            }
            if (length - 2147483639 > 0) {
                length = r(i10);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }
    }

    public a(int i10, String str, int i11, double d10, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z10, Promise promise, Executor executor) {
        this.f46795a = i10;
        this.f46796b = str;
        this.f46797c = i11;
        this.f46798d = d10;
        this.f46799e = num;
        this.f46800f = num2;
        this.f46801g = file;
        this.f46802h = str2;
        this.f46804j = bool;
        this.f46805k = reactApplicationContext;
        this.f46807m = activity;
        this.f46806l = z10;
        this.f46803i = promise;
        this.f46808n = executor;
    }

    public static Object s(Object obj) {
        return obj;
    }

    public static Bitmap v(int i10, int i11) {
        synchronized (f46793p) {
            try {
                for (Bitmap bitmap : f46794q) {
                    if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                        f46794q.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Bitmap w(int i10, int i11) {
        synchronized (f46793p) {
            try {
                for (Bitmap bitmap : f46794q) {
                    if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                        f46794q.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int x(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    public static void y(Bitmap bitmap) {
        synchronized (f46793p) {
            f46794q.add(bitmap);
        }
    }

    public final void A(View view) {
        d dVar = new d(outputBuffer);
        q(view, dVar);
        outputBuffer = dVar.B();
        String encodeToString = Base64.encodeToString(outputBuffer, 0, dVar.size(), 2);
        String str = "jpg".equals(this.f46796b) ? "jpeg" : this.f46796b;
        this.f46803i.resolve("data:image/" + str + ";base64," + encodeToString);
    }

    public final void B(View view) {
        String uri = Uri.fromFile(this.f46801g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f46801g);
        d dVar = new d(outputBuffer);
        Point q10 = q(view, dVar);
        outputBuffer = dVar.B();
        int size = dVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(q10.x), Integer.valueOf(q10.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(outputBuffer, 0, size);
        fileOutputStream.close();
        this.f46803i.resolve(uri);
    }

    public final void C(View view) {
        q(view, new FileOutputStream(this.f46801g));
        this.f46803i.resolve(Uri.fromFile(this.f46801g).toString());
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        t(nativeViewHierarchyManager, null);
    }

    public final Matrix p(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int i10 = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i10 = view4.getPaddingTop();
            }
            float translationY = top + i10 + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    public final Point q(View view, OutputStream outputStream) {
        try {
            return r(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    public final Point r(View view, OutputStream outputStream) {
        int i10;
        View view2 = view;
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z10 = false;
        if (this.f46804j.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int i11 = 0;
            for (int i12 = 0; i12 < scrollView.getChildCount(); i12++) {
                i11 += scrollView.getChildAt(i12).getHeight();
            }
            i10 = i11;
        } else {
            i10 = height;
        }
        Point point = new Point(width, i10);
        Bitmap v10 = v(width, i10);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(v10);
        view2.draw(canvas);
        for (View view3 : u(view)) {
            if (view3 instanceof TextureView) {
                if (view3.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view3;
                    textureView.setOpaque(z10);
                    Bitmap bitmap = textureView.getBitmap(w(view3.getWidth(), view3.getHeight()));
                    int save = canvas.save();
                    p(canvas, view2, view3);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    canvas.restoreToCount(save);
                    y(bitmap);
                }
            } else if ((view3 instanceof SurfaceView) && this.f46806l) {
                SurfaceView surfaceView = (SurfaceView) view3;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Bitmap w10 = w(view3.getWidth(), view3.getHeight());
                try {
                    PixelCopy.request(surfaceView, w10, new b(canvas, view2, view3, w10, paint, countDownLatch), new Handler(Looper.getMainLooper()));
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (Exception e10) {
                    Log.e(f46792o, "Cannot PixelCopy for " + surfaceView, e10);
                }
            }
            view2 = view;
            z10 = false;
        }
        Integer num = this.f46799e;
        if (num != null && this.f46800f != null && (num.intValue() != width || this.f46800f.intValue() != i10)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(v10, this.f46799e.intValue(), this.f46800f.intValue(), true);
            y(v10);
            v10 = createScaledBitmap;
        }
        int i13 = this.f46797c;
        if (-1 == i13 && (outputStream instanceof d)) {
            int i14 = width * i10 * 4;
            d dVar = (d) s(outputStream);
            v10.copyPixelsToBuffer(dVar.d(i14));
            dVar.J(i14);
        } else {
            v10.compress(c.mapping[i13], (int) (this.f46798d * 100.0d), outputStream);
        }
        y(v10);
        return point;
    }

    public final void t(NativeViewHierarchyManager nativeViewHierarchyManager, UIBlockViewResolver uIBlockViewResolver) {
        this.f46808n.execute(new RunnableC0677a(uIBlockViewResolver, nativeViewHierarchyManager));
    }

    public final List u(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            arrayList2.addAll(u(viewGroup.getChildAt(i10)));
        }
        return arrayList2;
    }

    public final void z(View view) {
        String str;
        boolean z10 = -1 == this.f46797c;
        boolean equals = "zip-base64".equals(this.f46802h);
        d dVar = new d(outputBuffer);
        Point q10 = q(view, dVar);
        outputBuffer = dVar.B();
        int size = dVar.size();
        String format = String.format(Locale.US, "%d:%d|", Integer.valueOf(q10.x), Integer.valueOf(q10.y));
        if (!z10) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(outputBuffer, 0, size);
            deflater.finish();
            d dVar2 = new d(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                dVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(dVar2.B(), 0, dVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(outputBuffer, 0, size, 2);
        }
        this.f46803i.resolve(str);
    }

    @Override // com.facebook.react.fabric.interop.UIBlock
    public void execute(UIBlockViewResolver uIBlockViewResolver) {
        t(null, uIBlockViewResolver);
    }
}
