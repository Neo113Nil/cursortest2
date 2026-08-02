package com.vk.crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.f;
import com.vk.crop.widget.AdjusterView;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import xsna.bfk;
import xsna.bn10;
import xsna.gs20;
import xsna.is20;
import xsna.n23;
import xsna.u11;

/* compiled from: CropController.java */
/* loaded from: classes17.dex */
public final class b implements f.a, AdjusterView.a {
    public final bfk c;
    public final WeakReference<ImageView> d;
    public final g e;
    public a h;
    public final gs20 a = new gs20();
    public final is20 b = new is20();
    public final Matrix f = new Matrix();
    public final Matrix g = new Matrix();
    public final float[] i = new float[8];
    public final PointF[] j = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final PointF[] k = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* compiled from: CropController.java */
    public class a implements Runnable {
        public final ValueAnimator b;
        public float c = 1.0f;
        public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public final float f;

        /* compiled from: CropController.java */
        /* renamed from: com.vk.crop.b$a$a, reason: collision with other inner class name */
        public class C0891a extends AnimatorListenerAdapter {
            public C0891a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                onAnimationEnd(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                b.this.getClass();
            }
        }

        /* compiled from: CropController.java */
        /* renamed from: com.vk.crop.b$a$b, reason: collision with other inner class name */
        public class C0892b implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;

            public C0892b(float f, float f2, float f3) {
                this.b = f;
                this.c = f2;
                this.d = f3;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a aVar = a.this;
                b bVar = b.this;
                if (bVar.e == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float b = u11.b(this.b, 1.0f, floatValue, 1.0f);
                float f = aVar.c;
                float f2 = b / f;
                aVar.c = f * f2;
                bVar.e.a(f2, bVar.c.getCenterX(), bVar.c.getCenterY(), false);
                float f3 = this.c * floatValue;
                float f4 = floatValue * this.d;
                float f5 = f3 - aVar.d;
                float f6 = f4 - aVar.e;
                g gVar = bVar.e;
                float f7 = gVar.e;
                float f8 = aVar.f;
                gVar.b((f5 * f7) / f8, (f6 * f7) / f8, false);
                aVar.d = f3;
                aVar.e = f4;
                bVar.e();
            }
        }

        public a(float f, float f2, float f3) {
            this.f = b.this.e.e * f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(600L);
            ofFloat.setInterpolator(new DecelerateInterpolator(3.0f));
            ofFloat.addListener(new C0891a());
            ofFloat.addUpdateListener(new C0892b(f, f2, f3));
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public b(ImageView imageView, bfk bfkVar, float f, float f2) {
        this.c = bfkVar;
        this.e = new g(f, f2);
        this.d = new WeakReference<>(imageView);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static float a(float f, float f2) {
        float f3 = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f / f2;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f3 > 1.0f) {
            return 1.0f;
        }
        return f3;
    }

    @NonNull
    public final RectF b() {
        bfk bfkVar = this.c;
        RectF rectF = new RectF(bfkVar.getX0(), bfkVar.getY0(), bfkVar.getX1(), bfkVar.getY1());
        g gVar = this.e;
        float f = gVar.b;
        float f2 = gVar.c;
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2};
        Matrix matrix = gVar.a;
        Matrix matrix2 = this.g;
        matrix2.set(matrix);
        matrix2.mapPoints(fArr);
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[4], fArr[5]);
        rectF.offset(-rectF2.left, -rectF2.top);
        return new RectF(a(rectF.left, rectF2.width()), a(rectF.top, rectF2.height()), a(rectF.right, rectF2.width()), a(rectF.bottom, rectF2.height()));
    }

    public final boolean c(float f) {
        g gVar = this.e;
        float f2 = gVar.b;
        float f3 = gVar.c;
        if (f2 / f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        float[] fArr = this.i;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = f2;
        fArr[3] = 0.0f;
        fArr[4] = f2;
        fArr[5] = f3;
        fArr[6] = 0.0f;
        fArr[7] = f3;
        Matrix matrix = gVar.a;
        Matrix matrix2 = this.g;
        matrix2.set(matrix);
        bfk bfkVar = this.c;
        matrix2.postScale(f, f, bfkVar.getCenterX(), bfkVar.getCenterY());
        matrix2.mapPoints(fArr);
        PointF[] pointFArr = this.k;
        PointF pointF = pointFArr[0];
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        PointF pointF2 = pointFArr[1];
        pointF2.x = fArr[2];
        pointF2.y = fArr[3];
        PointF pointF3 = pointFArr[2];
        pointF3.x = fArr[4];
        pointF3.y = fArr[5];
        PointF pointF4 = pointFArr[3];
        pointF4.x = fArr[6];
        pointF4.y = fArr[7];
        float x0 = bfkVar.getX0();
        float x1 = bfkVar.getX1();
        float y0 = bfkVar.getY0();
        float y1 = bfkVar.getY1();
        PointF[] pointFArr2 = this.j;
        pointFArr2[0].set(x0, y0);
        pointFArr2[1].set(x1, y0);
        pointFArr2[2].set(x1, y1);
        pointFArr2[3].set(x0, y1);
        return bn10.g(pointFArr, pointFArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float abs;
        float f5;
        PointF pointF;
        ImageView imageView = this.d.get();
        if (imageView == null) {
            return;
        }
        bfk bfkVar = this.c;
        float cropAspectRatio = bfkVar.getCropAspectRatio();
        g gVar = this.e;
        gVar.j = cropAspectRatio;
        float a2 = this.a.a(gVar.f, gVar.b, gVar.c, bfkVar.getCropWidth(), bfkVar.getCropHeight(), gVar.g % 180.0f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (gVar.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && gVar.i == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = gVar.e;
        } else {
            f = gVar.e;
            if (f >= a2) {
                float f6 = gVar.d;
                float f7 = gVar.k;
                if (f <= f6 * f7) {
                    f2 = 1.0f;
                    L.e(n23.a(f2, "scale = "));
                    f3 = 0.0f;
                    f4 = 0.0f;
                    while (!c(f2) && Math.abs(f3) < 0.001f && Math.abs(f4) < 0.001f) {
                        float cropWidth = bfkVar.getCropWidth();
                        float cropHeight = bfkVar.getCropHeight();
                        float x0 = bfkVar.getX0();
                        float y0 = bfkVar.getY0();
                        float f8 = gVar.f;
                        is20 is20Var = this.b;
                        float[] fArr = is20Var.c;
                        float[] fArr2 = is20Var.e;
                        RectF rectF = is20Var.a;
                        Matrix matrix = is20Var.b;
                        PointF pointF2 = is20Var.d;
                        pointF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        abs = Math.abs(f8);
                        PointF[] pointFArr = this.k;
                        if (abs >= 0.001f) {
                            is20.a(pointFArr, cropWidth, cropHeight, x0, y0, pointF2);
                            f5 = 0.001f;
                            pointF = pointF2;
                        } else {
                            f5 = 0.001f;
                            rectF.set(x0, y0, x0 + cropWidth, y0 + cropHeight);
                            matrix.reset();
                            matrix.postRotate(-f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            PointF pointF3 = pointFArr[0];
                            fArr[0] = pointF3.x;
                            fArr[1] = pointF3.y;
                            PointF pointF4 = pointFArr[1];
                            fArr[2] = pointF4.x;
                            fArr[3] = pointF4.y;
                            PointF pointF5 = pointFArr[2];
                            fArr[4] = pointF5.x;
                            fArr[5] = pointF5.y;
                            PointF pointF6 = pointFArr[3];
                            fArr[6] = pointF6.x;
                            fArr[7] = pointF6.y;
                            matrix.mapPoints(fArr);
                            PointF pointF7 = pointFArr[0];
                            pointF7.x = fArr[0];
                            pointF7.y = fArr[1];
                            PointF pointF8 = pointFArr[1];
                            pointF8.x = fArr[2];
                            pointF8.y = fArr[3];
                            PointF pointF9 = pointFArr[2];
                            pointF9.x = fArr[4];
                            pointF9.y = fArr[5];
                            PointF pointF10 = pointFArr[3];
                            pointF10.x = fArr[6];
                            pointF10.y = fArr[7];
                            matrix.mapRect(rectF);
                            is20.a(pointFArr, rectF.width(), rectF.height(), rectF.left, rectF.top, pointF2);
                            pointF = pointF2;
                            fArr2[0] = pointF.x;
                            fArr2[1] = pointF.y;
                            matrix.postRotate(f8 * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            matrix.mapPoints(fArr2);
                            pointF.x = fArr2[0];
                            pointF.y = fArr2[1];
                        }
                        f3 = pointF.x;
                        f4 = pointF.y;
                        if (Math.abs(f3) < f5 && Math.abs(f4) < f5) {
                            f2 *= 1.01f;
                        }
                    }
                    if (f2 != 1.0f && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        e();
                        return;
                    }
                    if (!z) {
                        a aVar = new a(f2, -f3, -f4);
                        this.h = aVar;
                        imageView.post(aVar);
                        return;
                    } else {
                        boolean z2 = !z;
                        gVar.a(f2, bfkVar.getCenterX(), bfkVar.getCenterY(), z2);
                        gVar.b(-f3, -f4, z2);
                        e();
                        return;
                    }
                }
                a2 = f6 * f7;
            }
        }
        f2 = a2 / f;
        L.e(n23.a(f2, "scale = "));
        f3 = 0.0f;
        f4 = 0.0f;
        while (!c(f2)) {
            float cropWidth2 = bfkVar.getCropWidth();
            float cropHeight2 = bfkVar.getCropHeight();
            float x02 = bfkVar.getX0();
            float y02 = bfkVar.getY0();
            float f82 = gVar.f;
            is20 is20Var2 = this.b;
            float[] fArr3 = is20Var2.c;
            float[] fArr22 = is20Var2.e;
            RectF rectF2 = is20Var2.a;
            Matrix matrix2 = is20Var2.b;
            PointF pointF22 = is20Var2.d;
            pointF22.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            abs = Math.abs(f82);
            PointF[] pointFArr2 = this.k;
            if (abs >= 0.001f) {
            }
            f3 = pointF.x;
            f4 = pointF.y;
            if (Math.abs(f3) < f5) {
                f2 *= 1.01f;
            }
        }
        if (f2 != 1.0f) {
        }
        if (!z) {
        }
    }

    public final void e() {
        Matrix matrix = this.e.a;
        Matrix matrix2 = this.f;
        matrix2.set(matrix);
        ImageView imageView = this.d.get();
        if (imageView != null) {
            imageView.setImageMatrix(matrix2);
        }
    }
}
