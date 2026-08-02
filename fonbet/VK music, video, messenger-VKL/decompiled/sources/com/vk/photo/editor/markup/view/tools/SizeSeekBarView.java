package com.vk.photo.editor.markup.view.tools;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;
import java.util.NoSuchElementException;
import xsna.asp;
import xsna.d0w;
import xsna.gyt0;
import xsna.iut0;
import xsna.n8g;
import xsna.s9b;
import xsna.swe0;
import xsna.x9;
import xsna.zrp;

/* compiled from: SizeSeekBarView.kt */
/* loaded from: classes4.dex */
public final class SizeSeekBarView extends View {
    public static final /* synthetic */ int p = 0;
    public final float b;
    public final float c;
    public Anchor d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Path h;
    public boolean i;
    public float j;
    public a k;
    public ValueAnimator l;
    public float m;
    public float n;
    public float o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SizeSeekBarView.kt */
    public static final class Anchor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Anchor[] $VALUES;
        public static final Anchor Center;
        public static final Anchor End;
        public static final Anchor Start;
        private final int value;

        static {
            Anchor anchor = new Anchor("Start", 0, -1);
            Start = anchor;
            Anchor anchor2 = new Anchor("Center", 1, 0);
            Center = anchor2;
            Anchor anchor3 = new Anchor("End", 2, 1);
            End = anchor3;
            Anchor[] anchorArr = {anchor, anchor2, anchor3};
            $VALUES = anchorArr;
            $ENTRIES = new asp(anchorArr);
        }

        public Anchor(String str, int i, int i2) {
            this.value = i2;
        }

        public static Anchor valueOf(String str) {
            return (Anchor) Enum.valueOf(Anchor.class, str);
        }

        public static Anchor[] values() {
            return (Anchor[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* compiled from: SizeSeekBarView.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public float d;
        public int e;

        /* compiled from: SizeSeekBarView.kt */
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
            parcel.writeInt(this.e);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readFloat();
            this.e = parcel.readInt();
        }
    }

    public SizeSeekBarView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void a(float f) {
        if (f == this.m) {
            return;
        }
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.m = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f);
        this.l = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new s9b(this, 1));
        }
        ValueAnimator valueAnimator3 = this.l;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void b() {
        if (this.i) {
            int i = (int) (this.j * 100.0f);
            iut0.t(this, getResources().getQuantityString(R.plurals.editor_seekbar_percent, i, Integer.valueOf(i)));
        }
    }

    public final void c() {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float h = this.d.h() * this.b * 2;
        this.o = h;
        this.n = h;
        this.m = h;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.SeekBar";
    }

    public final Anchor getAnchor() {
        return this.d;
    }

    public final float getSize() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.b;
        float f2 = this.c;
        float measuredWidth = ((getMeasuredWidth() / 2.0f) - (f2 / 2.0f)) + this.n;
        int save = canvas.save();
        canvas.translate(measuredWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        try {
            canvas.drawPath(this.h, this.e);
            float measuredHeight = (getMeasuredHeight() - f) - ((getMeasuredHeight() - (2 * f)) * this.j);
            canvas.drawCircle(f2 / 2.0f, measuredHeight, f, this.g);
            canvas.drawCircle(f2 / 2.0f, measuredHeight, f, this.f);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            float f = this.j;
            if (f == 1.0f) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            } else {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(((int) this.b) * 4, i), i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            setSize(state.d);
            for (Anchor anchor : Anchor.values()) {
                if (state.e == anchor.h()) {
                    setAnchor(anchor);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.j;
        state.e = this.d.h();
        return state;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Path path = this.h;
        path.rewind();
        float f = this.c;
        float f2 = f / 4.0f;
        path.moveTo(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(f - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.quadTo(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        path.lineTo(f / 2.0f, i2);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        path.quadTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.close();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setSize(1.0f - swe0.f(motionEvent.getY() / getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            a aVar = this.k;
            if (aVar != null) {
                aVar.a();
            }
            a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            invalidate();
            return true;
        }
        if (action == 1) {
            a aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.F();
            }
            a(this.o);
            invalidate();
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return true;
            }
            a(this.o);
            invalidate();
            return true;
        }
        setSize(1.0f - swe0.f(motionEvent.getY() / getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        a aVar3 = this.k;
        if (aVar3 != null) {
            aVar3.h(this.j);
        }
        invalidate();
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
        float f = this.j;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f) {
            return false;
        }
        if (i == 4096) {
            setSize(f + 0.05f);
            a aVar = this.k;
            if (aVar != null) {
                aVar.h(this.j);
            }
            return true;
        }
        if (i != 8192) {
            return false;
        }
        setSize(f - 0.05f);
        a aVar2 = this.k;
        if (aVar2 != null) {
            aVar2.h(this.j);
        }
        return true;
    }

    public final void setAnchor(Anchor anchor) {
        this.d = anchor;
        c();
    }

    public final void setListener(a aVar) {
        this.k = aVar;
    }

    public final void setSize(float f) {
        this.j = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        invalidate();
        b();
    }

    public SizeSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public SizeSeekBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ SizeSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editorSizeSeekBarViewStyle : i, R.style.SizeSeekBarStyle);
    }

    public SizeSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b = 20.0f;
        this.c = 20.0f;
        this.d = Anchor.Center;
        Paint c = x9.c(true);
        c.setColor(n8g.l(10066329, 150));
        Paint.Style style = Paint.Style.FILL;
        c.setStyle(style);
        this.e = c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(style);
        this.f = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setShadowLayer((int) Math.floor(4 * Resources.getSystem().getDisplayMetrics().density), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 687865856);
        this.g = paint2;
        this.h = new Path();
        this.j = -1.0f;
        this.o = 2 * 20.0f * this.d.h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h, i, i2);
        this.b = obtainStyledAttributes.getDimension(3, 20.0f);
        setSize(swe0.f(obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        for (Anchor anchor : Anchor.values()) {
            if (obtainStyledAttributes.getInt(0, 0) == anchor.h()) {
                setAnchor(anchor);
                this.c = obtainStyledAttributes.getDimension(1, 20.0f);
                c();
                obtainStyledAttributes.recycle();
                d0w d0wVar = new d0w(this, 26);
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnPreDrawListener(new gyt0(this, d0wVar, true));
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* compiled from: SizeSeekBarView.kt */
    public interface a {
        default void F() {
        }

        default void a() {
        }

        default void h(float f) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SizeSeekBarView.this.l = null;
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
