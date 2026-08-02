package com.vk.photo.editor.markup.view.tools;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;
import kotlin.Result;
import xsna.n8g;
import xsna.swe0;
import xsna.x9;
import xsna.ypa0;
import xsna.yxb;

/* compiled from: PipetteView.kt */
/* loaded from: classes4.dex */
public final class PipetteView extends View {
    public static final /* synthetic */ int t = 0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public boolean g;
    public int h;
    public a i;
    public Bitmap j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public ValueAnimator s;

    /* compiled from: PipetteView.kt */
    public interface a {
        void A(int i);

        void v(int i);
    }

    public PipetteView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final int getColorFromBitmap() {
        Object failure;
        Bitmap bitmap = this.j;
        if (bitmap == null) {
            return -16777216;
        }
        try {
            failure = Integer.valueOf(bitmap.getPixel(swe0.g((int) (this.n * bitmap.getWidth()), 0, bitmap.getWidth()), swe0.g((int) (this.o * bitmap.getHeight()), 0, bitmap.getHeight())));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        Integer num2 = (Integer) ((num == null || num.intValue() != 0) ? failure : null);
        if (num2 != null) {
            return num2.intValue();
        }
        return -16777216;
    }

    public final void a() {
        float measuredHeight = ((this.o * getMeasuredHeight()) - this.c) - this.f;
        float f = this.b;
        float f2 = measuredHeight - (2 * f);
        float measuredWidth = (this.n * getMeasuredWidth()) - f;
        float measuredWidth2 = (this.n * getMeasuredWidth()) + f;
        boolean z = measuredWidth < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || measuredWidth2 > ((float) getMeasuredWidth());
        boolean z2 = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = measuredWidth2 > ((float) getMeasuredWidth()) ? -1 : 1;
        int i2 = this.n * ((float) getMeasuredWidth()) > ((float) getMeasuredWidth()) / 2.0f ? -1 : 1;
        if (i2 != this.r && !z) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator == null) {
                float f3 = -1;
                this.q *= f3;
                this.p *= f3;
            } else {
                valueAnimator.addListener(new ypa0(this));
            }
        }
        this.r = i2;
        if (z && z2) {
            b((i2 * 180.0f) - (i * 45.0f));
            return;
        }
        if (z) {
            b(i * 90.0f);
            return;
        }
        if (!z2) {
            b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f4 = i2 * 180.0f;
        if (Math.abs(this.p) == Math.abs(f4)) {
            return;
        }
        b(f4);
    }

    public final void b(float f) {
        if (f == this.p) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.p = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q, f);
        this.s = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new yxb(this, 2));
        }
        ValueAnimator valueAnimator3 = this.s;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void c(Bitmap bitmap) {
        this.j = bitmap;
        this.n = 0.5f;
        this.o = 0.5f;
        this.h = getColorFromBitmap();
        this.g = true;
        invalidate();
    }

    public final int getSelectedColor() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.g) {
            int i = n8g.e(this.h, -1) <= 1.5d ? -16777216 : -1;
            Paint paint = this.m;
            paint.setColor(i);
            Paint paint2 = this.l;
            paint2.setColor(i);
            int i2 = this.h;
            Paint paint3 = this.k;
            paint3.setColor(i2);
            float measuredWidth = this.n * getMeasuredWidth();
            float measuredHeight = this.o * getMeasuredHeight();
            float f = this.e / 2.0f;
            float f2 = this.c;
            float f3 = f2 - f;
            canvas.drawCircle(measuredWidth, measuredHeight, f3, paint3);
            canvas.drawCircle(this.n * getMeasuredWidth(), this.o * getMeasuredHeight(), f3, paint2);
            float measuredWidth2 = this.n * getMeasuredWidth();
            float measuredHeight2 = ((this.o * getMeasuredHeight()) - f2) - this.f;
            float f4 = this.b;
            float f5 = measuredHeight2 - f4;
            float f6 = this.q;
            float measuredWidth3 = this.n * getMeasuredWidth();
            float measuredHeight3 = this.o * getMeasuredHeight();
            int save = canvas.save();
            canvas.rotate(f6, measuredWidth3, measuredHeight3);
            float f7 = f4 - (this.d / 2.0f);
            try {
                canvas.drawCircle(measuredWidth2, f5, f7, paint3);
                canvas.drawCircle(measuredWidth2, f5, f7, paint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = x / getMeasuredWidth();
            this.o = y / getMeasuredHeight();
            this.h = getColorFromBitmap();
            a();
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            this.n = x / getMeasuredWidth();
            this.o = y / getMeasuredHeight();
            int colorFromBitmap = getColorFromBitmap();
            this.h = colorFromBitmap;
            a aVar = this.i;
            if (aVar != null) {
                aVar.v(colorFromBitmap);
            }
            a();
            invalidate();
            return true;
        }
        int colorFromBitmap2 = getColorFromBitmap();
        this.h = colorFromBitmap2;
        a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.A(colorFromBitmap2);
        }
        this.g = false;
        this.n = 0.5f;
        this.o = 0.5f;
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a();
        invalidate();
        return true;
    }

    public final void setColorSelectionListener(a aVar) {
        this.i = aVar;
    }

    public final void setSelecting(boolean z) {
        this.g = z;
    }

    public PipetteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PipetteView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PipetteView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editorPipetteViewStyle : i, R.style.PipetteViewStyle);
    }

    public PipetteView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b = 32.0f;
        this.c = 8.0f;
        this.d = 4.0f;
        this.e = 4.0f;
        this.f = 10.0f;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.FILL);
        this.k = c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(4.0f);
        this.l = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(4.0f);
        this.m = paint2;
        this.n = 0.5f;
        this.o = 0.5f;
        this.r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e, i, i2);
        this.b = obtainStyledAttributes.getDimension(0, 32.0f);
        this.c = obtainStyledAttributes.getDimension(3, 8.0f);
        float dimension = obtainStyledAttributes.getDimension(1, 2.0f);
        this.d = dimension;
        float dimension2 = obtainStyledAttributes.getDimension(4, 2.0f);
        this.e = dimension2;
        this.f = obtainStyledAttributes.getDimension(2, 20.0f);
        paint2.setColor(-1);
        paint2.setStrokeWidth(dimension);
        paint.setColor(-1);
        paint.setStrokeWidth(dimension2);
        obtainStyledAttributes.recycle();
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PipetteView.this.s = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
