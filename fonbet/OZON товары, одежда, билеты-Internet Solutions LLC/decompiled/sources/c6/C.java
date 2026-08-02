package c6;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f56524a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f56525b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f56526c;

    /* renamed from: d, reason: collision with root package name */
    private static final Lock f56527d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f56528e = 0;

    /* loaded from: classes8.dex */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f56529a;

        a(int i11) {
            this.f56529a = i11;
        }

        public final void a(Canvas canvas, Paint paint, RectF rectF) {
            float f7 = this.f56529a;
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    private static final class b implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        f56527d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new b();
        Paint paint = new Paint(7);
        f56526c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f56527d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f56524a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f7 = 0.0f;
        if (bitmap.getWidth() * i12 > bitmap.getHeight() * i11) {
            width = i12 / bitmap.getHeight();
            f7 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f7 + 0.5f), (int) (height + 0.5f));
        Bitmap f11 = dVar.f(i11, i12, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        f11.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, f11, matrix);
        return f11;
    }

    public static Bitmap c(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        int min = Math.min(i11, i12);
        float f7 = min;
        float f11 = f7 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f7 / width, f7 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f7 - f12) / 2.0f;
        float f15 = (f7 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap e11 = e(dVar, bitmap);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap f16 = dVar.f(min, min, config);
        f16.setHasAlpha(true);
        Lock lock = f56527d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f16);
            canvas.drawCircle(f11, f11, f11, f56525b);
            canvas.drawBitmap(e11, (Rect) null, rectF, f56526c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e11.equals(bitmap)) {
                dVar.c(e11);
            }
            return f16;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static Bitmap d(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i12) {
            float min = Math.min(i11 / bitmap.getWidth(), i12 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                Bitmap f7 = dVar.f((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                f7.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i11 + "x" + i12);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + f7.getWidth() + "x" + f7.getHeight());
                    StringBuilder sb2 = new StringBuilder("minPct:   ");
                    sb2.append(min);
                    Log.v("TransformationUtils", sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                a(bitmap, f7, matrix);
                return f7;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    private static Bitmap e(@NonNull W5.d dVar, @NonNull Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f7 = dVar.f(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(f7).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f7;
    }

    public static Lock f() {
        return f56527d;
    }

    public static Bitmap g(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11) {
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i11) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap f7 = dVar.f(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                f7.setHasAlpha(bitmap.hasAlpha());
                a(bitmap, f7, matrix);
                return f7;
            default:
                return bitmap;
        }
    }

    public static Bitmap h(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11) {
        p6.k.a("roundingRadius must be greater than 0.", i11 > 0);
        a aVar = new a(i11);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e11 = e(dVar, bitmap);
        Bitmap f7 = dVar.f(e11.getWidth(), e11.getHeight(), config);
        f7.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(e11, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f7.getWidth(), f7.getHeight());
        Lock lock = f56527d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f7);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            aVar.a(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e11.equals(bitmap)) {
                dVar.c(e11);
            }
            return f7;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
