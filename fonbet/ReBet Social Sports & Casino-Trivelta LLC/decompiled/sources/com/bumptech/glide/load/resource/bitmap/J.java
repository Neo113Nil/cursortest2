package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f30004a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f30005b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    public static final Paint f30006c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f30007d;

    /* renamed from: e, reason: collision with root package name */
    public static final Lock f30008e;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30009a;

        public a(int i10) {
            this.f30009a = i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.J.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f30009a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f30010a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f30011b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f30012c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f30013d;

        public b(float f10, float f11, float f12, float f13) {
            this.f30010a = f10;
            this.f30011b = f11;
            this.f30012c = f12;
            this.f30013d = f13;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.J.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f30010a;
            float f11 = this.f30011b;
            float f12 = this.f30012c;
            float f13 = this.f30013d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f30007d = hashSet;
        f30008e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f30006c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f30008e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f30004a);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f30008e.unlock();
            throw th2;
        }
    }

    public static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
        Bitmap d10 = dVar.d(i10, i11, k(bitmap));
        r(bitmap, d10);
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return f(dVar, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    public static Bitmap d(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        int min = Math.min(i10, i11);
        float f10 = min;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap g10 = g(dVar, bitmap);
        Bitmap d10 = dVar.d(min, min, h(bitmap));
        d10.setHasAlpha(true);
        Lock lock = f30008e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawCircle(f11, f11, f11, f30005b);
            canvas.drawBitmap(g10, (Rect) null, rectF, f30006c);
            e(canvas);
            lock.unlock();
            if (!g10.equals(bitmap)) {
                dVar.c(g10);
            }
            return d10;
        } catch (Throwable th2) {
            f30008e.unlock();
            throw th2;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap d10 = dVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        r(bitmap, d10);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            d10.getWidth();
            d10.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap g(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap) {
        Bitmap.Config h10 = h(bitmap);
        if (h10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d10 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), h10);
        new Canvas(d10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d10;
    }

    public static Bitmap.Config h(Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f30008e;
    }

    public static int j(int i10) {
        switch (i10) {
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

    public static Bitmap.Config k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void l(int i10, Matrix matrix) {
        switch (i10) {
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
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d10 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d10.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap o(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return q(dVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap p(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10) {
        com.bumptech.glide.util.k.a(i10 > 0, "roundingRadius must be greater than 0.");
        return q(dVar, bitmap, new a(i10));
    }

    public static Bitmap q(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, c cVar) {
        Bitmap.Config h10 = h(bitmap);
        Bitmap g10 = g(dVar, bitmap);
        Bitmap d10 = dVar.d(g10.getWidth(), g10.getHeight(), h10);
        d10.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g10, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, d10.getWidth(), d10.getHeight());
        Lock lock = f30008e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!g10.equals(bitmap)) {
                dVar.c(g10);
            }
            return d10;
        } catch (Throwable th2) {
            f30008e.unlock();
            throw th2;
        }
    }

    public static void r(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
