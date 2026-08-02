package com.vk.photo.editor.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.api.R$styleable;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.an10;
import xsna.awf;
import xsna.iut0;
import xsna.jex;
import xsna.swe0;

/* compiled from: RotatingView.kt */
/* loaded from: classes4.dex */
public final class RotatingView extends View {
    public static final /* synthetic */ int B = 0;
    public final Paint A;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final awf l;
    public final float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public ValueAnimator u;
    public final GestureDetector v;
    public final CopyOnWriteArrayList<a> w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* compiled from: RotatingView.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public float d;

        /* compiled from: RotatingView.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<State> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new State(parcel, classLoader);
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeFloat(this.d);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readFloat();
        }
    }

    /* compiled from: RotatingView.kt */
    public interface a {
        void c();

        void d(float f, boolean z);

        void e();

        void f();
    }

    public RotatingView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void a() {
        iut0.t(this, an10.b(this.o) + "°");
    }

    public final boolean b(float f) {
        float floatValue = ((Number) swe0.k(Float.valueOf(f), this.l)).floatValue();
        if (floatValue == this.o) {
            return false;
        }
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = floatValue;
        invalidate();
        a();
        Iterator<a> it = this.w.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.d(floatValue, false);
            next.c();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(this.o, this.r, this.s);
        int i = this.b;
        float f2 = 360.0f / i;
        float f3 = 2;
        float f4 = this.d / f3;
        int i2 = 0;
        while (true) {
            f = this.j;
            if (i2 >= i) {
                break;
            }
            if (i2 % this.c == 0) {
                float f5 = this.r;
                float f6 = this.s;
                float f7 = this.t;
                float f8 = this.e;
                canvas.drawLine(f5, (((f6 + f7) - f8) - f4) - ((f / f3) - (f8 / f3)), f5, ((f6 + f7) - f4) - ((f / f3) - (f8 / f3)), this.y);
            } else {
                canvas.drawCircle(this.r, ((this.s + this.t) - f4) - (f / f3), f4, this.x);
            }
            canvas.rotate(f2, this.r, this.s);
            i2++;
        }
        canvas.restore();
        int b2 = an10.b(this.o);
        if (b2 != 0) {
            float f9 = this.r;
            float f10 = this.s;
            float f11 = this.t;
            float f12 = this.n;
            canvas.drawLine(f9, (((f10 + f11) - f12) - f4) - ((f / f3) - (f12 / f3)), f9, ((f10 + f11) - f4) - ((f / f3) - (f12 / f3)), this.z);
        }
        String valueOf = String.valueOf(b2);
        Paint paint = this.A;
        canvas.drawText(valueOf, this.r - (paint.measureText(valueOf) / 2.0f), (((this.s + this.t) - f) - (this.k / f3)) - (this.g / f3), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            float f = this.o;
            awf awfVar = this.l;
            if (f == awfVar.c) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (f == awfVar.b) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            } else {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            this.o = state.d;
            a();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.o;
        return state;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.t = Math.max(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f) * 1.2f;
        this.r = getMeasuredWidth() / 2.0f;
        this.s = (getMeasuredHeight() / 2.0f) - (this.t / 1.2f);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator = this.u;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && !this.v.onTouchEvent(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            CopyOnWriteArrayList<a> copyOnWriteArrayList = this.w;
            if (actionMasked == 0) {
                this.q = (float) Math.toDegrees((float) Math.atan2(motionEvent.getX(), getWidth() / 2.0f));
                invalidate();
                Iterator<a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
            } else if (actionMasked == 2) {
                float degrees = (float) Math.toDegrees((float) Math.atan2(motionEvent.getX(), getWidth() / 2.0f));
                float f = (degrees - this.q) * this.f;
                this.q = degrees;
                float f2 = this.o - f;
                float abs = Math.abs(f2);
                float f3 = this.m;
                if (abs < f3) {
                    float f4 = this.p - f;
                    this.p = f4;
                    if (Math.abs(f4) >= f3) {
                        f2 = Math.signum(this.p) * 1.0f;
                        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        f2 = 0.0f;
                    }
                }
                float floatValue = ((Number) swe0.k(Float.valueOf(f2), this.l)).floatValue();
                if (an10.b(floatValue) != an10.b(this.o)) {
                    performHapticFeedback(4);
                }
                this.o = floatValue;
                invalidate();
                Iterator<a> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().d(this.o, true);
                }
            } else if (actionMasked != 5 && actionMasked != 6) {
                a();
                Iterator<a> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().c();
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        if (i == 4096) {
            return b(this.o + 5.0f);
        }
        if (i != 8192) {
            return false;
        }
        return b(this.o - 5.0f);
    }

    public RotatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    @Override // android.view.View
    public String getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public RotatingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ RotatingView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editorRotatingViewStyle : i, R.style.EditorRotatingViewStyle);
    }

    public RotatingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b = 60;
        this.c = 5;
        this.d = 2.0f;
        this.e = 2.0f;
        this.f = 1.0f;
        this.g = 24.0f;
        this.h = 24.0f;
        this.i = 30.0f;
        this.j = 30.0f;
        this.k = 2.0f;
        this.l = new awf(-45.0f, 45.0f);
        this.m = 0.5f;
        this.n = 24.0f;
        this.v = new GestureDetector(context, new b());
        this.w = new CopyOnWriteArrayList<>();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-7829368);
        this.x = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(-16777216);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(2.0f);
        this.z = paint3;
        Paint paint4 = new Paint(1);
        paint4.setTextSize(30.0f);
        paint4.setColor(-16777216);
        this.A = paint4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, i, i2);
        this.b = obtainStyledAttributes.getInt(16, 60);
        float dimension = obtainStyledAttributes.getDimension(15, 10.0f);
        this.d = dimension;
        this.f = obtainStyledAttributes.getFloat(14, 0.8f);
        this.m = obtainStyledAttributes.getDimension(4, 0.5f);
        this.c = obtainStyledAttributes.getInteger(2, 5);
        this.e = obtainStyledAttributes.getDimension(1, 40.0f);
        paint2.setColor(obtainStyledAttributes.getColor(0, -16777216));
        paint2.setStrokeWidth(dimension);
        paint.setColor(obtainStyledAttributes.getColor(13, -7829368));
        paint.setStrokeWidth(dimension);
        int color = obtainStyledAttributes.getColor(5, -16776961);
        float dimension2 = obtainStyledAttributes.getDimension(8, dimension);
        this.k = dimension2;
        float dimension3 = obtainStyledAttributes.getDimension(11, 60.0f);
        this.h = dimension3;
        float dimension4 = obtainStyledAttributes.getDimension(12, 80.0f);
        this.i = dimension4;
        this.j = obtainStyledAttributes.getDimension(3, dimension4);
        this.n = dimension3;
        paint3.setColor(color);
        paint3.setStrokeWidth(dimension2);
        int color2 = obtainStyledAttributes.getColor(6, -16777216);
        float dimension5 = obtainStyledAttributes.getDimension(7, 60.0f);
        this.g = dimension5;
        paint4.setColor(color2);
        paint4.setTextSize(dimension5);
        this.l = new awf(obtainStyledAttributes.getInteger(10, -45), obtainStyledAttributes.getInteger(9, 45));
        obtainStyledAttributes.recycle();
    }

    /* compiled from: RotatingView.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            RotatingView rotatingView = RotatingView.this;
            int i = 1;
            if (rotatingView.u == null) {
                Iterator<a> it = rotatingView.w.iterator();
                while (it.hasNext()) {
                    it.next().e();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(rotatingView.o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                rotatingView.u = ofFloat;
                if (ofFloat != null) {
                    ofFloat.addUpdateListener(new jex(rotatingView, i));
                }
                ValueAnimator valueAnimator = rotatingView.u;
                if (valueAnimator != null) {
                    valueAnimator.addListener(new C1469b(rotatingView));
                }
                ValueAnimator valueAnimator2 = rotatingView.u;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new a(rotatingView));
                }
                ValueAnimator valueAnimator3 = rotatingView.u;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            return true;
        }

        /* compiled from: Animator.kt */
        public static final class a implements Animator.AnimatorListener {
            public final /* synthetic */ RotatingView b;

            public a(RotatingView rotatingView) {
                this.b = rotatingView;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i = RotatingView.B;
                RotatingView rotatingView = this.b;
                rotatingView.a();
                Iterator<T> it = rotatingView.w.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).c();
                }
                rotatingView.u = null;
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

        /* compiled from: Animator.kt */
        /* renamed from: com.vk.photo.editor.views.RotatingView$b$b, reason: collision with other inner class name */
        public static final class C1469b implements Animator.AnimatorListener {
            public final /* synthetic */ RotatingView b;

            public C1469b(RotatingView rotatingView) {
                this.b = rotatingView;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Iterator<T> it = this.b.w.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).f();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        }
    }
}
