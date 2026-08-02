package com.vk.core.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKTabLayout;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.cn70;
import xsna.dhr0;
import xsna.pkk;
import xsna.zyj0;

/* compiled from: SkeletonTabLayout.kt */
/* loaded from: classes.dex */
public final class SkeletonTabLayout extends VKTabLayout {
    public a A0;
    public boolean B0;
    public int C0;
    public float D0;
    public final float E0;
    public final float F0;
    public final float G0;
    public float H0;
    public final float I0;
    public final float J0;
    public final float K0;
    public final Paint L0;
    public final Paint M0;
    public final zyj0 N0;
    public boolean O0;
    public boolean P0;
    public int z0;

    /* compiled from: SkeletonTabLayout.kt */
    /* loaded from: classes17.dex */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;
        public boolean e;

        /* compiled from: SkeletonTabLayout.kt */
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

        public final boolean e() {
            return this.d;
        }

        public final boolean f() {
            return this.e;
        }

        public final void g(boolean z) {
            this.d = z;
        }

        public final void i(boolean z) {
            this.e = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt() != 0;
        }
    }

    /* compiled from: SkeletonTabLayout.kt */
    public static abstract class a {
        public int a;

        /* compiled from: SkeletonTabLayout.kt */
        /* renamed from: com.vk.core.tabs.SkeletonTabLayout$a$a, reason: collision with other inner class name */
        public static final class C0776a extends a {
        }

        /* compiled from: SkeletonTabLayout.kt */
        /* loaded from: classes17.dex */
        public static final class b extends a {
            public b() {
                super(3);
            }
        }

        public a(int i) {
            this.a = i;
        }
    }

    public SkeletonTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0 = new a.C0776a(5);
        this.B0 = true;
        this.C0 = cn70.b(2);
        this.D0 = cn70.a() * 12.0f;
        this.E0 = cn70.a() * 8.0f;
        this.F0 = cn70.a() * 40.0f;
        this.G0 = cn70.a() * 6.0f;
        this.H0 = cn70.a() * 4.0f;
        this.I0 = cn70.a() * 28.0f;
        this.J0 = cn70.a() * 8.0f;
        float a2 = cn70.a() * 1.0f;
        this.K0 = a2 / 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        abg0 abg0Var = dhr0.t;
        paint.setColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        this.L0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(abg0Var.c(R.attr.vk_ui_write_bar_input_border_alpha));
        paint2.setStrokeWidth(a2);
        this.M0 = paint2;
        zyj0 zyj0Var = new zyj0();
        this.N0 = zyj0Var;
        setWillNotDraw(false);
        zyj0Var.setCallback(this);
        B();
        setLayerType(2, new Paint());
    }

    private final float getSkeletonOuterShapeWidth() {
        return (this.D0 * 2.0f) + this.F0;
    }

    private final float getSkeletonTabWidth() {
        return (this.H0 * 2.0f) + getSkeletonOuterShapeWidth();
    }

    private final float getTabFitWidthSize() {
        float f = 2;
        return ((getWidth() / 3) - (this.D0 * f)) - (f * this.H0);
    }

    public final void A() {
        ValueAnimator valueAnimator;
        if (this.O0) {
            zyj0 zyj0Var = this.N0;
            zyj0Var.g = false;
            ValueAnimator valueAnimator2 = zyj0Var.e;
            if ((valueAnimator2 == null || !valueAnimator2.isStarted()) && zyj0Var.getCallback() != null && (valueAnimator = zyj0Var.e) != null) {
                valueAnimator.start();
            }
            invalidate();
        }
    }

    public final void B() {
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).j();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_background_secondary));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_text_muted);
        Shimmer.c e = ((Shimmer.c) cVar.d(1.0f).h(0.08f).g(cn70.b(40)).i()).e(800L);
        e.a.q = new pkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
        Shimmer a2 = e.a();
        zyj0 zyj0Var = this.N0;
        zyj0Var.f = a2;
        zyj0Var.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        zyj0Var.b();
        ValueAnimator valueAnimator = zyj0Var.e;
        boolean isStarted = valueAnimator != null ? valueAnimator.isStarted() : false;
        ValueAnimator valueAnimator2 = zyj0Var.e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = zyj0Var.e;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        Shimmer shimmer = zyj0Var.f;
        if (shimmer != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(shimmer.o);
            ofFloat.addUpdateListener(zyj0Var.a);
            ofFloat.setInterpolator(shimmer.q);
            ofFloat.setStartDelay(0L);
            ofFloat.addListener(zyj0Var.h);
            zyj0Var.e = ofFloat;
            if (isStarted) {
                ofFloat.start();
            }
        }
        zyj0Var.invalidateSelf();
    }

    @Override // com.vk.core.view.VKTabLayout, xsna.too0
    public final void Ng() {
        super.Ng();
        abg0 abg0Var = dhr0.t;
        this.L0.setColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        this.M0.setColor(abg0Var.c(R.attr.vk_ui_write_bar_input_border_alpha));
        B();
        invalidate();
    }

    @Override // com.vk.core.view.VKTabLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        if (this.O0 && this.P0 && (i = this.A0.a) > 0) {
            float f2 = this.z0 + this.H0;
            for (int i2 = 0; i2 < i; i2++) {
                float f3 = f2 + this.D0;
                float height = getHeight();
                float f4 = this.E0;
                float f5 = ((height - f4) / 2.0f) - this.C0;
                a aVar = this.A0;
                if (aVar instanceof a.b) {
                    ((a.b) aVar).getClass();
                    f = getTabFitWidthSize();
                } else {
                    f = this.F0;
                }
                float f6 = f + f3;
                float f7 = f5 + f4;
                float f8 = this.G0;
                canvas.drawRoundRect(f3, f5, f6, f7, f8, f8, this.L0);
                zyj0 zyj0Var = this.N0;
                zyj0Var.setBounds((int) f3, (int) f5, (int) f6, (int) f7);
                zyj0Var.draw(canvas);
                if (this.B0) {
                    float height2 = getHeight();
                    float f9 = this.I0;
                    float f10 = ((height2 - f9) / 2.0f) - this.C0;
                    float f11 = this.K0;
                    float f12 = f10 + f11;
                    float skeletonOuterShapeWidth = (getSkeletonOuterShapeWidth() + f2) - f11;
                    float f13 = (f10 + f9) - f11;
                    float f14 = this.J0;
                    canvas.drawRoundRect(f2 + f11, f12, skeletonOuterShapeWidth, f13, f14, f14, this.M0);
                }
                f2 += ((this.D0 + this.H0) * 2.0f) + (f6 - f3);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.O0) {
            this.N0.a();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zyj0 zyj0Var = this.N0;
        ValueAnimator valueAnimator = zyj0Var.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        zyj0Var.g = true;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.z0 = 0;
        View childAt = getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            this.A0.a = 0;
            return;
        }
        this.z0 = viewGroup.getPaddingLeft() + getPaddingLeft();
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = viewGroup.getChildAt(i6);
            if (childAt2 != null) {
                i5 = Math.max(i5, childAt2.getRight());
            }
        }
        this.z0 += i5;
        a aVar = this.A0;
        if (aVar instanceof a.b) {
            return;
        }
        aVar.a = Math.max(0, ((int) ((getWidth() - this.z0) / getSkeletonTabWidth())) + 1);
    }

    @Override // com.vk.core.view.VKTabLayout, android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.d());
            setShimmerAvailable(state.e());
            setShimmerVisible(state.f());
        }
    }

    @Override // com.vk.core.view.VKTabLayout, android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.g(this.O0);
        state.i(this.P0);
        return state;
    }

    public final void setShimmerAvailable(boolean z) {
        this.O0 = z;
        if (z) {
            if (this.P0) {
                A();
            } else {
                zyj0 zyj0Var = this.N0;
                ValueAnimator valueAnimator = zyj0Var.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zyj0Var.g = true;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setShimmerVisible(boolean z) {
        this.P0 = z;
        if (z) {
            A();
            return;
        }
        zyj0 zyj0Var = this.N0;
        ValueAnimator valueAnimator = zyj0Var.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        zyj0Var.g = true;
    }

    public final void setSkeletonInnerHorizontalPadding(float f) {
        if (this.D0 == f) {
            return;
        }
        this.D0 = f;
        invalidate();
    }

    public final void setSkeletonMarginBottom(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            invalidate();
        }
    }

    public final void setSkeletonOuterHorizontalPadding(float f) {
        if (this.H0 == f) {
            return;
        }
        this.H0 = f;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.N0;
    }
}
