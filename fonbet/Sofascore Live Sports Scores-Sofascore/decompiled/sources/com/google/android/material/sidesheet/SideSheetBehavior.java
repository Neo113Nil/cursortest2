package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a02;
import defpackage.a70;
import defpackage.bgh;
import defpackage.bsk;
import defpackage.e80;
import defpackage.eb;
import defpackage.i5b;
import defpackage.iyb;
import defpackage.jsk;
import defpackage.l4a;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.nx0;
import defpackage.pjf;
import defpackage.pn0;
import defpackage.q0;
import defpackage.qq7;
import defpackage.qzb;
import defpackage.rzb;
import defpackage.szb;
import defpackage.tz1;
import defpackage.us3;
import defpackage.w3a;
import defpackage.wah;
import defpackage.x9;
import defpackage.xah;
import defpackage.xs3;
import defpackage.xz1;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends us3 implements iyb {
    public l4a a;
    public final qzb b;
    public final ColorStateList c;
    public final xah d;
    public final a02 e;
    public final float f;
    public final boolean g;
    public int h;
    public jsk i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public szb t;
    public int u;
    public final LinkedHashSet v;
    public final xz1 w;

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.e = new a02(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new xz1(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.O);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = w3a.x(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = xah.h(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        xah xahVar = this.d;
        if (xahVar != null) {
            qzb qzbVar = new qzb(xahVar);
            this.b = qzbVar;
            qzbVar.p(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        bsk.n(262144, view);
        bsk.k(0, view);
        bsk.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view);
        bsk.k(0, view);
        int i = 4;
        int i2 = 5;
        if (this.h != 5) {
            bsk.o(view, x9.k, new tz1(this, i2, i));
        }
        int i3 = 3;
        if (this.h != 3) {
            bsk.o(view, x9.j, new tz1(this, i3, i));
        }
    }

    @Override // defpackage.iyb
    public final void a(nx0 nx0Var) {
        szb szbVar = this.t;
        if (szbVar == null) {
            return;
        }
        szbVar.f = nx0Var;
    }

    @Override // defpackage.iyb
    public final void b() {
        szb szbVar = this.t;
        if (szbVar == null) {
            return;
        }
        View view = szbVar.b;
        nx0 nx0Var = szbVar.f;
        szbVar.f = null;
        if (nx0Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(szbVar.e);
        animatorSet.start();
    }

    @Override // defpackage.iyb
    public final void c() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        szb szbVar = this.t;
        if (szbVar == null) {
            return;
        }
        nx0 nx0Var = szbVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        szbVar.f = null;
        int i2 = 5;
        if (nx0Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        l4a l4aVar = this.a;
        if (l4aVar != null && l4aVar.z() != 0) {
            i2 = 3;
        }
        eb ebVar = new eb(this, 10);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int p = this.a.p(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: agh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.S(marginLayoutParams, e80.c(valueAnimator.getAnimatedFraction(), p, 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = szbVar.b;
        boolean z = nx0Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new qq7(1));
        ofFloat.setDuration(e80.c(nx0Var.c, szbVar.c, szbVar.d));
        ofFloat.addListener(new rzb(szbVar, z, i2));
        ofFloat.addListener(ebVar);
        ofFloat.start();
    }

    @Override // defpackage.iyb
    public final void d(nx0 nx0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        szb szbVar = this.t;
        if (szbVar == null) {
            return;
        }
        l4a l4aVar = this.a;
        int i = (l4aVar == null || l4aVar.z() == 0) ? 5 : 3;
        nx0 nx0Var2 = szbVar.f;
        szbVar.f = nx0Var;
        if (nx0Var2 != null) {
            szbVar.a(i, nx0Var.c, nx0Var.d == 0);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.S(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.us3
    public final void g(xs3 xs3Var) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.us3
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.us3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        jsk jskVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && bsk.g(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTracker2 = this.s;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.s = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (jskVar = this.i) == null || !jskVar.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.us3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        qzb qzbVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new szb(view);
            if (qzbVar != null) {
                view.setBackground(qzbVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                qzbVar.s(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = bsk.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (bsk.g(view) == null) {
                bsk.r(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((xs3) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        l4a l4aVar = this.a;
        if (l4aVar == null || l4aVar.z() != i6) {
            xs3 xs3Var = null;
            xah xahVar = this.d;
            if (i6 == 0) {
                this.a = new i5b(this, i3);
                if (xahVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof xs3)) {
                        xs3Var = (xs3) view3.getLayoutParams();
                    }
                    if (xs3Var == null || ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin <= 0) {
                        wah m = xahVar.m();
                        m.f = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        m.g = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        xah a = m.a();
                        if (qzbVar != null) {
                            qzbVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    a70.p(lnb.k(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.a = new i5b(this, i4);
                if (xahVar != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof xs3)) {
                        xs3Var = (xs3) view2.getLayoutParams();
                    }
                    if (xs3Var == null || ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin <= 0) {
                        wah m2 = xahVar.m();
                        m2.e = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        m2.h = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        xah a2 = m2.a();
                        if (qzbVar != null) {
                            qzbVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new jsk(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int x = this.a.x(view);
        coordinatorLayout.p(i, view);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.y(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.f(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i4 = x - this.a.x(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                zzl.q(this.h, "Unexpected value: ");
                return false;
            }
            i4 = this.a.s();
        }
        WeakHashMap weakHashMap2 = bsk.a;
        view.offsetLeftAndRight(i4);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        for (bgh bghVar : this.v) {
        }
        return true;
    }

    @Override // defpackage.us3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.us3
    public final void r(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.us3
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // defpackage.us3
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTracker2 = this.s;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.s = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float abs = Math.abs(this.u - motionEvent.getX());
            jsk jskVar = this.i;
            if (abs > jskVar.b) {
                jskVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(mz1.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.p.get();
        pn0 pn0Var = new pn0(this, i, 16);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(pn0Var);
        } else {
            pn0Var.run();
        }
    }

    public final void x(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        for (bgh bghVar : this.v) {
            if (i == 5) {
                bghVar.a.cancel();
            } else {
                bghVar.getClass();
            }
        }
        A();
    }

    public final boolean y() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        x(2);
        r2.e.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, int i, boolean z) {
        int r;
        if (i == 3) {
            r = this.a.r();
        } else {
            if (i != 5) {
                a70.p(ljg.j(i, "Invalid state to get outer edge offset: "));
                return;
            }
            r = this.a.s();
        }
        jsk jskVar = this.i;
        if (jskVar != null) {
            if (!z) {
                int top = view.getTop();
                jskVar.r = view;
                jskVar.c = -1;
                boolean h = jskVar.h(r, top, 0, 0);
                if (!h && jskVar.a == 0 && jskVar.r != null) {
                    jskVar.r = null;
                }
            }
        }
        x(i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior() {
        this.e = new a02(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new xz1(this, 1);
    }
}
