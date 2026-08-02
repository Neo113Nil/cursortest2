package com.vk.core.drawable;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.movika.sdk.base.logic.interactor.m;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.movika.sdk.base.ui.o0;
import java.util.Arrays;
import xsna.bih;
import xsna.bpn0;
import xsna.epx;
import xsna.iy2;
import xsna.lk;
import xsna.qe3;
import xsna.t61;

/* compiled from: IndeterminateHorizontalProgressDrawable.kt */
/* loaded from: classes17.dex */
public final class IndeterminateHorizontalProgressDrawable extends Drawable implements Animatable {
    public final RectF b = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    public final RectF c = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);
    public final AnimatorUtils.RectTransformX d = new AnimatorUtils.RectTransformX(-522.6f, 0.1f);
    public final AnimatorUtils.RectTransformX e = new AnimatorUtils.RectTransformX(-197.6f, 0.1f);
    public final bpn0 f = new bpn0(new t61(26));
    public final bpn0 g = new bpn0(new bih(this, 21));

    /* compiled from: IndeterminateHorizontalProgressDrawable.kt */
    public static final class AnimatorUtils {
        public static final bpn0 a = new bpn0(new g0(24));
        public static final bpn0 b = new bpn0(new iy2(23));
        public static final bpn0 c = new bpn0(new g(21));
        public static final bpn0 d = new bpn0(new qe3(28));
        public static final bpn0 e = new bpn0(new o0(21));
        public static final bpn0 f = new bpn0(new lk(19));
        public static final bpn0 g = new bpn0(new l(20));
        public static final bpn0 h = new bpn0(new m(16));

        /* compiled from: IndeterminateHorizontalProgressDrawable.kt */
        @Keep
        public static final class RectTransformX {
            private float scaleX;
            private float translateX;

            public RectTransformX(float f, float f2) {
                this.translateX = f;
                this.scaleX = f2;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getTranslateX() {
                return this.translateX;
            }

            public final void setScaleX(float f) {
                this.scaleX = f;
            }

            public final void setTranslateX(float f) {
                this.translateX = f;
            }
        }

        public static ObjectAnimator a(Object obj, String str, String str2, Path path) {
            float[] fArr = new float[201];
            float[] fArr2 = new float[201];
            PathMeasure pathMeasure = new PathMeasure(path, false);
            float length = pathMeasure.getLength();
            float[] fArr3 = new float[2];
            for (int i = 0; i < 201; i++) {
                pathMeasure.getPosTan((i * length) / 200, fArr3, null);
                fArr[i] = fArr3[0];
                fArr2[i] = fArr3[1];
            }
            return ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat(str, Arrays.copyOf(fArr, 201)), PropertyValuesHolder.ofFloat(str2, Arrays.copyOf(fArr2, 201)));
        }
    }

    public final Paint a() {
        return (Paint) this.f.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().width() == 0 || getBounds().height() == 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        int width = getBounds().width();
        int height = getBounds().height();
        Paint a = a();
        RectF rectF = this.b;
        canvas.scale(width / rectF.width(), height / rectF.height());
        float f = 2;
        canvas.translate(rectF.width() / f, rectF.height() / f);
        int save2 = canvas.save();
        AnimatorUtils.RectTransformX rectTransformX = this.e;
        canvas.translate(rectTransformX.getTranslateX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.scale(rectTransformX.getScaleX(), 1.0f);
        RectF rectF2 = this.c;
        canvas.drawRect(rectF2, a);
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        AnimatorUtils.RectTransformX rectTransformX2 = this.d;
        canvas.translate(rectTransformX2.getTranslateX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.scale(rectTransformX2.getScaleX(), 1.0f);
        canvas.drawRect(rectF2, a);
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
        for (Animator animator : (Animator[]) this.g.getValue()) {
            if (animator.isStarted()) {
                invalidateSelf();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return a().getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return a().getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        for (Animator animator : (Animator[]) this.g.getValue()) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (a().getAlpha() != i) {
            a().setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (epx.f(a().getColorFilter(), colorFilter)) {
            return;
        }
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        bpn0 bpn0Var = this.g;
        for (Animator animator : (Animator[]) bpn0Var.getValue()) {
            if (animator.isStarted()) {
                return;
            }
        }
        for (Animator animator2 : (Animator[]) bpn0Var.getValue()) {
            animator2.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        for (Animator animator : (Animator[]) this.g.getValue()) {
            animator.end();
        }
    }
}
