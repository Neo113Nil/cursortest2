package com.vk.im.ui.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.R$styleable;
import xsna.hp10;
import xsna.l8g;
import xsna.lhg;

/* loaded from: classes2.dex */
public class WaveFormView extends View {
    public Paint b;
    public Paint c;
    public ObjectAnimator d;
    public ViewConfiguration e;
    public byte[] f;
    public float[] g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public float l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float q;
    public boolean r;
    public float s;
    public byte[] t;
    public int u;
    public a v;

    public interface a {
        void a(float f, boolean z);
    }

    public WaveFormView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    private void setSecondaryColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setColor(-16777216);
        this.b.setFilterBitmap(false);
        Paint paint2 = this.b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = this.b;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.c = paint4;
        paint4.setAntiAlias(true);
        this.c.setColor(-16777216);
        this.c.setFilterBitmap(false);
        this.c.setStyle(style);
        this.c.setStrokeCap(cap);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "indeterminateAnimatorProgress", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = ofFloat;
        ofFloat.setDuration(2000L);
        this.d.setRepeatCount(-1);
        this.d.setInterpolator(new LinearInterpolator());
        this.e = ViewConfiguration.get(context);
        this.f = null;
        this.g = null;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = -1.0f;
        this.j = false;
        this.k = false;
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, i, i2);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setBarWidth(obtainStyledAttributes.getDimensionPixelSize(3, 2));
        setSpaceWidth(obtainStyledAttributes.getDimensionPixelSize(6, 2));
        setAmplifyThreshold(obtainStyledAttributes.getFloat(2, 0.5f));
        setPrimaryColor(obtainStyledAttributes.getColor(5, Color.parseColor("#88000000")));
        setIndeterminate(obtainStyledAttributes.getBoolean(4, true));
        obtainStyledAttributes.recycle();
    }

    public final boolean b(float f) {
        int measuredWidth = getMeasuredWidth();
        if (!this.j) {
            return false;
        }
        this.j = false;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            float f2 = measuredWidth;
            if (f > f2) {
                this.s = 1.0f;
            } else {
                this.s = f / f2;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        a aVar = this.v;
        if (aVar != null) {
            aVar.a(this.s, true);
            this.v.getClass();
        }
        invalidate();
        return true;
    }

    public final void c(int i, byte[] bArr) {
        if (this.t == null && bArr == null) {
            return;
        }
        this.t = bArr;
        this.u = i;
        this.f = null;
        requestLayout();
        invalidate();
        requestLayout();
        invalidate();
    }

    public final void d() {
        if (this.d.isStarted()) {
            return;
        }
        this.d.setFloatValues(0.15f, 1.0f, 0.15f);
        this.d.setStartDelay(500L);
        this.d.start();
    }

    public final void e() {
        if (this.d.isStarted()) {
            this.d.cancel();
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public float getAmplifyThreshold() {
        return this.q;
    }

    public int getBarWidth() {
        return this.o;
    }

    public int getMaximumHeight() {
        return this.n;
    }

    public int getMaximumWidth() {
        return this.m;
    }

    public int getPrimaryColor() {
        return this.b.getColor();
    }

    public float getProgress() {
        return this.j ? this.l : this.s;
    }

    public int getSpaceWidth() {
        return this.p;
    }

    @Nullable
    public byte[] getWaveForm() {
        return this.t;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r) {
            d();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte[] bArr = this.f;
        if (bArr != null) {
            if (!this.r) {
                int length = (int) ((this.j ? this.l : this.s) * bArr.length);
                int length2 = bArr.length - length;
                int i = length * 4;
                canvas.drawLines(this.g, 0, i, this.b);
                canvas.drawLines(this.g, i, length2 * 4, this.c);
                return;
            }
            float f = this.h;
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - 0.15f);
            int length3 = (int) (max * r3.length);
            int length4 = ((int) (f * r3.length)) - length3;
            int i2 = length3 + length4;
            int length5 = this.f.length - i2;
            int i3 = length3 * 4;
            canvas.drawLines(this.g, 0, i3, this.c);
            canvas.drawLines(this.g, i3, length4 * 4, this.b);
            canvas.drawLines(this.g, i2 * 4, length5 * 4, this.c);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth = getMaximumWidth();
        int maximumHeight = getMaximumHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int a2 = hp10.a(i, suggestedMinimumWidth, maximumWidth, paddingRight);
        int a3 = hp10.a(i2, suggestedMinimumHeight, maximumHeight, paddingBottom);
        int i3 = a2 - paddingRight;
        int i4 = a3 - paddingBottom;
        byte[] bArr3 = this.t;
        if (bArr3 != null && this.f == null) {
            int i5 = i3 / (this.o + this.p);
            int i6 = this.u;
            if (bArr3 == null) {
                throw new IllegalArgumentException("source is null");
            }
            int i7 = 0;
            if (i6 == 0) {
                bArr2 = new byte[0];
            } else if (i6 == i5) {
                bArr2 = new byte[i6];
                System.arraycopy(bArr3, 0, bArr2, 0, i6);
            } else {
                if (i6 < i5) {
                    bArr = new byte[i5];
                    float f = i6 / i5;
                    for (int i8 = 0; i8 < i5; i8++) {
                        bArr[i8] = bArr3[(int) (i8 * f)];
                    }
                } else {
                    bArr = new byte[i5];
                    float f2 = i6 / i5;
                    int i9 = 0;
                    float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (i9 < i6) {
                        byte b = bArr3[i9];
                        int i10 = i6;
                        float min = Math.min(f4 + 1.0f, f2) - f4;
                        float f5 = b;
                        float f6 = (f5 * min) + f3;
                        f4 += min;
                        if (f4 >= f2 - 0.001f) {
                            int i11 = i7 + 1;
                            bArr[i7] = (byte) Math.round(f6 / f2);
                            if (min < 1.0f) {
                                float f7 = 1.0f - min;
                                i7 = i11;
                                f4 = f7;
                                f3 = f5 * f7;
                            } else {
                                f4 = 0.0f;
                                i7 = i11;
                                f3 = 0.0f;
                            }
                        } else {
                            f3 = f6;
                        }
                        i9++;
                        i6 = i10;
                    }
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i7 < i5) {
                        bArr[i7] = (byte) Math.round(f3 / f2);
                    }
                }
                bArr2 = bArr;
            }
            byte b2 = Byte.MIN_VALUE;
            for (byte b3 : bArr2) {
                if (b3 > b2) {
                    b2 = b3;
                }
            }
            if (32 != b2 && b2 != 0) {
                if (bArr2 == bArr3) {
                    bArr2 = (byte[]) bArr3.clone();
                }
                float f8 = 32.0f / b2;
                int i12 = (int) (this.q * 32.0f);
                for (int i13 = 0; i13 < bArr2.length; i13++) {
                    if (bArr2[i13] > i12) {
                        byte b4 = (byte) (r12 * f8);
                        if (b4 > 32) {
                            b4 = 32;
                        }
                        bArr2[i13] = b4;
                    }
                }
            }
            this.f = bArr2;
            this.g = new float[bArr2.length * 4];
            int i14 = this.o / 2;
            int i15 = (i4 / 2) + paddingTop;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                byte[] bArr4 = this.f;
                if (i17 >= bArr4.length) {
                    break;
                }
                byte b5 = bArr4[i17];
                int i18 = this.o;
                int i19 = ((this.p + i18) * i17) + paddingLeft;
                int i20 = ((i18 + i19) - i19) + i19;
                int i21 = ((int) ((b5 / 32.0f) * i4)) / 2;
                int i22 = (i15 - i21) + i14;
                int i23 = (i21 + i15) - i14;
                if (i22 + i14 > i15) {
                    i22 = i15 - 1;
                }
                if (i23 - i14 < i15) {
                    i23 = i15;
                }
                float[] fArr = this.g;
                int i24 = i16 * 4;
                float f9 = i20;
                fArr[i24] = f9;
                fArr[i24 + 1] = i22;
                fArr[i24 + 2] = f9;
                fArr[i24 + 3] = i23;
                i16++;
                i17++;
            }
        }
        setMeasuredDimension(a2, a3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        motionEvent.getY();
        int action = motionEvent.getAction();
        if (!this.r && isEnabled()) {
            if (action == 0) {
                int measuredWidth = getMeasuredWidth();
                if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x <= measuredWidth) {
                    this.i = x;
                    this.j = true;
                    this.k = false;
                    z = true;
                }
            } else if (action == 1 || action == 3) {
                z = b(x);
            } else if (action == 2) {
                int measuredWidth2 = getMeasuredWidth();
                if (this.j) {
                    if (this.k) {
                        if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            float f = measuredWidth2;
                            if (x > f) {
                                this.l = 1.0f;
                            } else {
                                this.l = x / f;
                            }
                        }
                        a aVar = this.v;
                        if (aVar != null) {
                            aVar.a(this.l, true);
                        }
                        invalidate();
                    } else if (Math.abs(this.i - x) > this.e.getScaledTouchSlop()) {
                        this.k = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    z = true;
                }
            }
            return !z || super.onTouchEvent(motionEvent);
        }
        z = false;
        if (z) {
        }
    }

    public void setAmplifyThreshold(float f) {
        this.q = f;
        this.f = null;
        requestLayout();
        invalidate();
        requestLayout();
        invalidate();
    }

    public void setBarWidth(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "barWidth must be > 0. Given: "));
        }
        if (this.o != i) {
            this.o = i;
            this.b.setStrokeWidth(i);
            this.c.setStrokeWidth(this.o);
            this.f = null;
            requestLayout();
            invalidate();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        boolean z2 = z != isEnabled();
        super.setEnabled(z);
        if (z2) {
            if (!z && this.j) {
                b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            invalidate();
        }
    }

    public void setIndeterminate(boolean z) {
        this.r = z;
        if (this.j) {
            b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.r) {
            d();
        } else {
            e();
        }
        invalidate();
    }

    @Keep
    public void setIndeterminateAnimatorProgress(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (f > 1.0f) {
            this.h = 1.0f;
        } else {
            this.h = f;
        }
        invalidate();
    }

    public void setMaximumHeight(int i) {
        this.n = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumWidth(int i) {
        this.m = i;
        requestLayout();
        invalidate();
    }

    public void setOnWaveFormChangeListener(a aVar) {
        this.v = aVar;
    }

    public void setPrimaryColor(int i) {
        this.b.setColor(i);
        invalidate();
        setSecondaryColor(l8g.f(0.4f, i));
    }

    public void setProgress(float f) {
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f, 1.0f));
        this.s = max;
        a aVar = this.v;
        if (aVar != null) {
            aVar.a(max, false);
        }
        if (this.r) {
            this.r = false;
            e();
        }
        invalidate();
    }

    public void setSpaceWidth(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "spaceWidth must be >= 0. Given: "));
        }
        if (this.p != i) {
            this.p = i;
            this.f = null;
            requestLayout();
            invalidate();
            requestLayout();
            invalidate();
        }
    }

    public void setWaveForm(@Nullable byte[] bArr) {
        c(bArr == null ? 0 : bArr.length, bArr);
    }

    public WaveFormView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public WaveFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public WaveFormView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }
}
