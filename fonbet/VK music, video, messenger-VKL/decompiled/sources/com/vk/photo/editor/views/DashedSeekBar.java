package com.vk.photo.editor.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.api.R$styleable;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.an10;
import xsna.c4i0;
import xsna.epx;
import xsna.gzs;
import xsna.hg10;
import xsna.iut0;
import xsna.izs;
import xsna.lb80;
import xsna.mtk;
import xsna.otk;
import xsna.rl3;
import xsna.s3q0;
import xsna.sl9;
import xsna.swe0;
import xsna.unb;
import xsna.vnb;
import xsna.xi2;

/* compiled from: DashedSeekBar.kt */
/* loaded from: classes4.dex */
public final class DashedSeekBar extends FrameLayout implements c4i0 {
    public static final /* synthetic */ int M = 0;
    public a A;
    public float B;
    public float C;
    public int D;
    public AnimatorSet E;
    public boolean F;
    public boolean G;
    public float H;
    public lb80 I;
    public final Paint J;
    public final Paint K;
    public final GestureDetector L;
    public izs<? super Float, String> b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final int k;
    public final float l;
    public final float m;
    public final long n;
    public final long o;
    public final float p;
    public final a q;
    public final a r;
    public final a s;
    public final Drawable t;
    public final View u;
    public final View v;
    public final float w;
    public final float x;
    public float y;
    public ValueAnimator z;

    /* compiled from: DashedSeekBar.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final int c;

        public a(TypedArray typedArray, int i, int i2, int i3) {
            hg10.d(typedArray, i);
            this.a = typedArray.getDimension(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            hg10.d(typedArray, i2);
            this.b = typedArray.getDimension(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            hg10.d(typedArray, i3);
            this.c = typedArray.getColor(i3, 0);
        }
    }

    /* compiled from: DashedSeekBar.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            DashedSeekBar.this.h(r0.getDefaultValue(), false, true, true, false);
            return true;
        }
    }

    /* compiled from: DashedSeekBar.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            DashedSeekBar dashedSeekBar = (DashedSeekBar) this.receiver;
            int i = DashedSeekBar.M;
            dashedSeekBar.c();
            return s3q0.a;
        }
    }

    public DashedSeekBar(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static final float d(DashedSeekBar dashedSeekBar, int i) {
        if (i % 2 == 1) {
            return (d(dashedSeekBar, i + 1) + d(dashedSeekBar, i - 1)) / 2.0f;
        }
        float f = dashedSeekBar.i;
        return ((f + dashedSeekBar.j) * (i / 2)) + ((dashedSeekBar.getWidth() / 2.0f) - (f / 2.0f)) + dashedSeekBar.y;
    }

    public static final float e(DashedSeekBar dashedSeekBar, float f, int i) {
        float width;
        float f2 = dashedSeekBar.i;
        if (dashedSeekBar.h) {
            width = d(dashedSeekBar, i);
        } else {
            width = dashedSeekBar.y + ((dashedSeekBar.j + f2) * i) + ((dashedSeekBar.getWidth() / 2.0f) - (f2 / 2.0f));
        }
        float f3 = f2 + width;
        return (width > f || f > f3) ? Math.min(Math.abs(f - width), Math.abs(f - f3)) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final int getDashIndexClosestToActiveDash() {
        float width = getWidth() / 2.0f;
        int i = 0;
        float e = e(this, width, 0);
        for (int i2 = 1; i2 < this.g; i2++) {
            float e2 = e(this, width, i2);
            if (e > e2) {
                i = i2;
                e = e2;
            }
        }
        return i;
    }

    private final void setSeeking(boolean z) {
        this.F = z;
        if (z) {
            ValueAnimator valueAnimator = this.z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.z = null;
        }
        f();
    }

    private final void setXShift(float f) {
        this.y = f;
        f();
    }

    @Override // xsna.c4i0
    public final void a(float f, boolean z) {
        h(f, true, false, true, z);
    }

    public final void b(int i, final boolean z, final boolean z2, final boolean z3, boolean z4, c cVar) {
        boolean z5 = this.h;
        float f = this.i;
        float width = ((getWidth() / 2.0f) - (f / 2.0f)) - (z5 ? d(this, i) : this.y + (((this.j + f) * i) + ((getWidth() / 2.0f) - (f / 2.0f))));
        if (!z4) {
            i(this.y + width, z, z2, z3);
            if (cVar != null) {
                cVar.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.z = null;
        float f2 = this.y;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, width + f2);
        ofFloat.setDuration(this.o);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ntk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = DashedSeekBar.M;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                DashedSeekBar dashedSeekBar = DashedSeekBar.this;
                dashedSeekBar.i(floatValue, z, z2, z3);
                dashedSeekBar.invalidate();
            }
        });
        if (cVar != null) {
            ofFloat.addListener(new otk(cVar));
        }
        ofFloat.start();
        this.z = ofFloat;
    }

    public final void c() {
        String quantityString;
        float currentValue = getCurrentValue();
        izs<? super Float, String> izsVar = this.b;
        if (izsVar == null || (quantityString = izsVar.invoke(Float.valueOf(currentValue))) == null) {
            int i = (int) currentValue;
            quantityString = getResources().getQuantityString(R.plurals.editor_seekbar_percent, i, Integer.valueOf(i));
        }
        iut0.t(this, quantityString);
    }

    public final void f() {
        if (!this.F) {
            if (getCurrentValue() == this.f) {
                g(this.s);
                return;
            } else {
                g(this.r);
                return;
            }
        }
        a aVar = this.A;
        a aVar2 = this.q;
        if (epx.f(aVar, aVar2)) {
            return;
        }
        g(aVar2);
    }

    public final void g(a aVar) {
        this.A = aVar;
        int i = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, aVar.a);
        ofFloat.addUpdateListener(new unb(this, i));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.C, aVar.b);
        ofFloat2.addUpdateListener(new xi2(this, i));
        ValueAnimator ofArgb = ValueAnimator.ofArgb(this.D, aVar.c);
        ofArgb.addUpdateListener(new vnb(this, i));
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.E = animatorSet2;
        animatorSet2.playTogether(ofFloat, ofFloat2, ofArgb);
        AnimatorSet animatorSet3 = this.E;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(this.n);
        }
        AnimatorSet animatorSet4 = this.E;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.SeekBar";
    }

    public float getCurrentValue() {
        return (getDashIndexClosestToActiveDash() * this.w) + this.c;
    }

    public final izs<Float, String> getCustomContentDescriptionProvider() {
        return this.b;
    }

    public final int getDefaultValue() {
        return this.e;
    }

    public final int getZeroEffectValue() {
        return this.f;
    }

    public final boolean h(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        float currentValue = getCurrentValue();
        float f2 = this.c;
        float f3 = swe0.f(f, f2, this.d);
        if (f3 == currentValue) {
            if (!z4) {
                return false;
            }
            f();
            return false;
        }
        if (Math.abs(currentValue - f3) > 1.0E-6d) {
            b(an10.b((f3 - f2) / this.w), z, z2, false, z3, new c(0, this, DashedSeekBar.class, "changeStateDescription", "changeStateDescription()V", 0));
        }
        f();
        return true;
    }

    public final void i(float f, boolean z, boolean z2, boolean z3) {
        lb80 lb80Var;
        int dashIndexClosestToActiveDash = getDashIndexClosestToActiveDash();
        setXShift(swe0.f(f, this.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (getDashIndexClosestToActiveDash() != dashIndexClosestToActiveDash && z3) {
            performHapticFeedback(4);
        }
        if (z) {
            return;
        }
        lb80 lb80Var2 = this.I;
        if (lb80Var2 != null) {
            lb80Var2.c(getCurrentValue());
        }
        if (!z2 || (lb80Var = this.I) == null) {
            return;
        }
        lb80Var.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.E = null;
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.z = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.g; i++) {
            boolean z = this.h;
            float f = this.i;
            float d = z ? d(this, i) : this.y + ((this.j + f) * i) + ((getWidth() / 2.0f) - (f / 2.0f));
            if (d >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d < getWidth() && (!z || i % 2 != 1)) {
                int i2 = i % this.k;
                Paint paint = this.J;
                if (i2 == 0) {
                    float height = getHeight() / 2.0f;
                    float f2 = this.l / 2.0f;
                    float f3 = this.m;
                    canvas.drawRoundRect(d, height - f2, d + f, height + f2, f3, f3, paint);
                } else {
                    float f4 = f / 2.0f;
                    canvas.drawCircle(d + f4, getHeight() / 2.0f, f4, paint);
                }
            }
        }
        float f5 = this.B;
        float f6 = this.C;
        int i3 = this.D;
        float width = (getWidth() / 2.0f) - (f5 / 2.0f);
        float height2 = getHeight() / 2.0f;
        Paint paint2 = this.K;
        paint2.setColor(i3);
        float f7 = f6 / 2.0f;
        float f8 = this.m;
        canvas.drawRoundRect(width, height2 - f7, width + f5, height2 + f7, f8, f8, paint2);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            float currentValue = getCurrentValue();
            if (currentValue == this.d) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (currentValue == this.c) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            } else {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new mtk(this, an10.b(i * this.p), 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent != null) {
            if (this.L.onTouchEvent(motionEvent)) {
                setSeeking(false);
                lb80 lb80Var = this.I;
                if (lb80Var != null) {
                    lb80Var.b();
                }
                c();
                return true;
            }
            float x = motionEvent.getX();
            if (motionEvent.getAction() == 3) {
                this.G = true;
                return true;
            }
            if (rl3.y0(new Integer[]{1, 6}).contains(Integer.valueOf(motionEvent.getAction())) && this.F) {
                setSeeking(false);
                lb80 lb80Var2 = this.I;
                if (lb80Var2 != null) {
                    lb80Var2.b();
                }
                c();
                b(getDashIndexClosestToActiveDash(), false, false, true, true, null);
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (this.G) {
                    this.G = false;
                }
                setSeeking(true);
                this.H = x;
                return true;
            }
            if (this.F) {
                float f = x - this.H;
                this.H = x;
                i(this.y + f, false, false, true);
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        float currentValue = getCurrentValue();
        if (i == 4096) {
            return h(5.0f + currentValue, false, false, false, false);
        }
        if (i != 8192) {
            return false;
        }
        return h(currentValue - 5.0f, false, false, false, false);
    }

    public final void setCustomContentDescriptionProvider(izs<? super Float, String> izsVar) {
        this.b = izsVar;
    }

    public final void setDefaultValue(int i) {
        int i2 = this.e;
        int i3 = this.c;
        int i4 = this.d;
        if (i3 > i2 || i2 > i4) {
            throw new IllegalStateException(sl9.c(i3, i4, "defaultValue must be in [", "; ", X3.j.e).toString());
        }
        this.e = i;
    }

    @Override // xsna.c4i0
    public void setOnSeekBarChangeListener(lb80 lb80Var) {
        this.I = lb80Var;
    }

    public final void setZeroEffectValue(int i) {
        this.f = i;
    }

    public DashedSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public DashedSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ DashedSeekBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public DashedSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        float width;
        this.e = 50;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, i, 0);
        try {
            int i3 = obtainStyledAttributes.getInt(11, 0);
            this.c = i3;
            int i4 = obtainStyledAttributes.getInt(10, 100);
            this.d = i4;
            setDefaultValue(obtainStyledAttributes.getInt(5, i4));
            if (i3 < i4) {
                int i5 = this.e;
                if (i3 <= i5 && i5 <= i4) {
                    boolean z = obtainStyledAttributes.getBoolean(6, false);
                    this.h = z;
                    int i6 = obtainStyledAttributes.getInt(2, 51);
                    int i7 = (z ? i6 * 2 : i6) + 1;
                    this.g = i7;
                    hg10.d(obtainStyledAttributes, 4);
                    float dimension = obtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.i = dimension;
                    hg10.d(obtainStyledAttributes, 3);
                    float dimension2 = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.j = dimension2;
                    hg10.d(obtainStyledAttributes, 18);
                    this.k = obtainStyledAttributes.getInt(18, 0);
                    hg10.d(obtainStyledAttributes, 19);
                    this.l = obtainStyledAttributes.getDimension(19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    hg10.d(obtainStyledAttributes, 17);
                    this.m = obtainStyledAttributes.getDimension(17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    hg10.d(obtainStyledAttributes, 0);
                    this.n = obtainStyledAttributes.getInt(0, 0);
                    hg10.d(obtainStyledAttributes, 1);
                    this.o = obtainStyledAttributes.getInt(1, 0);
                    this.q = new a(obtainStyledAttributes, 14, 13, 12);
                    a aVar = new a(obtainStyledAttributes, 9, 8, 7);
                    this.r = aVar;
                    this.s = new a(obtainStyledAttributes, 22, 21, 20);
                    hg10.d(obtainStyledAttributes, 16);
                    this.p = obtainStyledAttributes.getFloat(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Drawable drawable = obtainStyledAttributes.getDrawable(15);
                    this.t = drawable;
                    obtainStyledAttributes.recycle();
                    h(this.e, true, false, false, false);
                    View view = new View(context);
                    view.setBackground(drawable);
                    view.setLayoutParams(new FrameLayout.LayoutParams(0, -1, 3));
                    view.setRotation(180.0f);
                    this.u = view;
                    View view2 = new View(context);
                    view2.setBackground(drawable);
                    view2.setLayoutParams(new FrameLayout.LayoutParams(0, -1, 5));
                    this.v = view2;
                    addView(view);
                    addView(view2);
                    this.w = (i4 - i3) / (i7 - 1);
                    if (z) {
                        width = d(this, i7);
                    } else {
                        width = this.y + ((dimension + dimension2) * i7) + ((getWidth() / 2.0f) - (dimension / 2.0f));
                    }
                    this.x = (-width) - dimension;
                    this.A = aVar;
                    this.B = aVar.a;
                    this.C = aVar.b;
                    this.D = aVar.c;
                    Paint paint = new Paint(1);
                    Paint.Style style = Paint.Style.FILL;
                    paint.setStyle(style);
                    paint.setColor(-1);
                    this.J = paint;
                    Paint paint2 = new Paint(1);
                    paint2.setStyle(style);
                    this.K = paint2;
                    this.L = new GestureDetector(context, new b());
                    return;
                }
                throw new IllegalStateException(("defaultValue must be in [" + i3 + "; " + i4 + X3.j.e).toString());
            }
            throw new IllegalStateException(("minValue should be less than maxValue, got " + i3 + " <= " + i4).toString());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
