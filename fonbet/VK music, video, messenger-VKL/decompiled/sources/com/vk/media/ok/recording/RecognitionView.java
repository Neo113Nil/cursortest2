package com.vk.media.ok.recording;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.ok.recording.RecognitionView;
import ru.ok.tensorflow.customview.OverlayView;

/* compiled from: RecognitionView.kt */
/* loaded from: classes.dex */
public final class RecognitionView extends OverlayView {
    public final float b;
    public final float c;
    public final float d;
    public final RectF e;
    public final RectF f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public b k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public float o;
    public int p;
    public boolean q;
    public final ValueAnimator r;
    public boolean s;

    /* compiled from: RecognitionView.kt */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public RecognitionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = TypedValue.applyDimension(1, 0.00715f, getResources().getDisplayMetrics());
        this.c = TypedValue.applyDimension(1, 0.00547f, getResources().getDisplayMetrics());
        this.d = TypedValue.applyDimension(1, 2.1E-4f, getResources().getDisplayMetrics());
        this.e = new RectF();
        this.f = new RectF();
        this.g = 1;
        Paint paint = new Paint();
        this.l = paint;
        Paint paint2 = new Paint();
        this.m = paint2;
        Paint paint3 = new Paint();
        this.n = paint3;
        this.p = 8;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f);
        this.r = ofFloat;
        this.s = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.g);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.set(paint);
        paint3.set(paint);
        ofFloat.setDuration(650L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.z9f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RecognitionView recognitionView = RecognitionView.this;
                recognitionView.o = ((Float) recognitionView.r.getAnimatedValue()).floatValue();
                recognitionView.invalidate();
            }
        });
        ofFloat.addListener(new a());
    }

    public final void a() {
        this.r.cancel();
        int i = this.p;
        this.s = true;
        setVisibility(i);
        this.s = false;
        this.h = false;
    }

    @Override // ru.ok.tensorflow.customview.OverlayView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            float f = this.o;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.1f) {
                return;
            }
            if (System.currentTimeMillis() - this.i > 150) {
                a();
                return;
            }
            RectF rectF = this.f;
            float centerX = rectF.centerX();
            RectF rectF2 = this.e;
            if (centerX != rectF2.centerX() || rectF.centerY() != rectF2.centerY() || rectF.width() != rectF2.width()) {
                float f2 = 2;
                float min = Math.min((((System.currentTimeMillis() - this.j) * Math.max((Math.abs(rectF.centerY() - rectF2.centerY()) + Math.abs(rectF.centerX() - rectF2.centerX())) * this.d, this.b)) / f2) / (Math.abs(rectF.centerY() - rectF2.centerY()) + Math.abs(rectF.centerX() - rectF2.centerX())), 1.0f);
                float min2 = Math.min((((System.currentTimeMillis() - this.j) * this.c) * 1.0f) / Math.abs(rectF.width() - rectF2.width()), 1.0f);
                float centerX2 = ((rectF.centerX() - rectF2.centerX()) * min) + rectF2.centerX();
                float centerY = ((rectF.centerY() - rectF2.centerY()) * min) + rectF2.centerY();
                float width = (((rectF.width() / f2) - (rectF2.width() / f2)) * min2) + (rectF2.width() / f2);
                rectF2.set(centerX2 - width, centerY - width, centerX2 + width, centerY + width);
            }
            float f3 = this.o * 360;
            canvas.drawArc(rectF2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, this.n);
            canvas.drawArc(rectF2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, this.m);
            canvas.drawArc(rectF2, 270.0f, f3, false, this.l);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.m.setColor(i);
    }

    public final void setBorderColor(int i) {
        this.n.setColor(i);
    }

    public final void setDrawingLock(boolean z) {
        if (z) {
            this.s = true;
            setVisibility(8);
            this.s = false;
        } else if (this.h) {
            this.s = true;
            setVisibility(0);
            this.s = false;
        }
        this.q = z;
    }

    public final void setLineSizePx(int i) {
        this.g = i;
        float f = i;
        this.l.setStrokeWidth(f);
        this.m.setStrokeWidth(f);
        this.n.setStrokeWidth(f * 1.3333334f);
    }

    public final void setProgressColor(int i) {
        this.l.setColor(i);
    }

    public final void setRecognitionListener(b bVar) {
        this.k = bVar;
    }

    public final void setRecognitionsVisibility(boolean z) {
        int i = z ? 0 : 8;
        this.p = i;
        if (this.q) {
            return;
        }
        this.s = true;
        setVisibility(i);
        this.s = false;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.s) {
            super.setVisibility(i);
        }
    }

    /* compiled from: RecognitionView.kt */
    public final class a implements Animator.AnimatorListener {
        public boolean b;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            b bVar = RecognitionView.this.k;
            if (bVar != null) {
                ((GesturedRecording) bVar).g();
            }
            this.b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b bVar;
            boolean z = this.b;
            RecognitionView recognitionView = RecognitionView.this;
            if (!z && (bVar = recognitionView.k) != null) {
                ((GesturedRecording) bVar).f();
            }
            recognitionView.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            RecognitionView.this.j = System.currentTimeMillis();
            this.b = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
