package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$animator;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.a48;
import xsna.b0u0;
import xsna.bdl;
import xsna.iut0;
import xsna.lv1;
import xsna.rq2;
import xsna.t1u0;
import xsna.tb30;
import xsna.w38;
import xsna.x38;
import xsna.y38;
import xsna.z38;

/* loaded from: classes13.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int j0 = R$attr.motionDurationLong2;
    public static final int k0 = R$attr.motionEasingEmphasizedInterpolator;

    @Nullable
    public Integer V;

    @Nullable
    public AnimatorSet W;

    @Nullable
    public AnimatorSet a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public Behavior i0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;
        public boolean e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public a(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.c;
            boolean z = this.d;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.b.setTranslationX(bottomAppBar.A(r3, i, z));
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return tb30.c(j0, 300, getContext());
    }

    private float getFabTranslationX() {
        return B(this.b0);
    }

    private float getFabTranslationY() {
        if (this.d0 == 1) {
            return -getTopEdgeTreatment().e;
        }
        return z() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    @NonNull
    private a48 getTopEdgeTreatment() {
        throw null;
    }

    public final int A(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.f0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean d = t1u0.d(this);
        int measuredWidth = d ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = d ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.m3_bottomappbar_horizontal_padding);
            i2 = d ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i2);
    }

    public final float B(int i) {
        boolean d = t1u0.d(this);
        if (i != 1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return ((getMeasuredWidth() / 2) - ((this.e0 == -1 || z() == null) ? 0 : (r5.getMeasuredWidth() / 2) + this.e0)) * (d ? -1 : 1);
    }

    public final boolean C() {
        View z = z();
        FloatingActionButton floatingActionButton = z instanceof FloatingActionButton ? (FloatingActionButton) z : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void D() {
        a48 topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.h0 && C()) {
            int i = this.d0;
        }
        throw null;
    }

    public final void E(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().d) {
            return;
        }
        getTopEdgeTreatment().d = f;
        throw null;
    }

    public final void F(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        a aVar = new a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e;
    }

    public int getFabAlignmentMode() {
        return this.b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.e0;
    }

    public int getFabAnchorMode() {
        return this.d0;
    }

    public int getFabAnimationMode() {
        return this.c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().b;
    }

    public boolean getHideOnScroll() {
        return this.g0;
    }

    public int getMenuAlignmentMode() {
        return this.f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.e(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.W;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            D();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (C()) {
            F(actionMenuView, this.b0, this.h0, false);
        } else {
            F(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        this.b0 = savedState.d;
        this.h0 = savedState.e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.b0;
        savedState.e = this.h0;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            a48 topEdgeTreatment = getTopEdgeTreatment();
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                topEdgeTreatment.e = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        boolean z = this.h0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int i3 = 0;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (C()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    ofFloat2.addListener(new z38(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.a0 = animatorSet3;
            animatorSet3.addListener(new y38(this));
            this.a0.start();
        }
        if (this.b0 != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.W;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.c0 == 1) {
                View z2 = z();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z2 instanceof FloatingActionButton ? (FloatingActionButton) z2 : null, "translationX", B(i));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View z3 = z();
                FloatingActionButton floatingActionButton = z3 instanceof FloatingActionButton ? (FloatingActionButton) z3 : null;
                if (floatingActionButton != null && !floatingActionButton.h()) {
                    floatingActionButton.g(new x38(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(tb30.d(getContext(), k0, rq2.a));
            this.W = animatorSet5;
            animatorSet5.addListener(new w38(this, i3));
            this.W.start();
        }
        this.b0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.e0 == i) {
            return;
        }
        this.e0 = i;
        D();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.d0 = i;
        D();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.c0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().f) {
            return;
        }
        getTopEdgeTreatment().f = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().c = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().b = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.g0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                F(actionMenuView, this.b0, C(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.V != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Nullable
    public final View z() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        Iterator it = ((CoordinatorLayout) getParent()).F(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.i0 == null) {
            this.i0 = new Behavior();
        }
        return this.i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        public final Rect m;
        public WeakReference<BottomAppBar> n;
        public int o;
        public final a p;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                Rect rect = behavior.m;
                BottomAppBar bottomAppBar = behavior.n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.j(rect);
                    int height2 = rect.height();
                    bottomAppBar.E(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                    height = height2;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.o == 0) {
                    if (bottomAppBar.d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (t1u0.d(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i9 = BottomAppBar.j0;
                bottomAppBar.D();
                throw null;
            }
        }

        public Behavior() {
            this.p = new a();
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.n = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.j0;
            View z = bottomAppBar.z();
            if (z != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!z.isLaidOut()) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z.getLayoutParams();
                    fVar.d = 17;
                    int i3 = bottomAppBar.d0;
                    int i4 = 1;
                    if (i3 == 1) {
                        fVar.d = 49;
                    }
                    if (i3 == 0) {
                        fVar.d |= 80;
                    }
                    this.o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) z.getLayoutParams())).bottomMargin;
                    if (z instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R$animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R$animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new lv1(bottomAppBar, i4));
                        floatingActionButton.e();
                    }
                    z.addOnLayoutChangeListener(this.p);
                    bottomAppBar.D();
                    throw null;
                }
            }
            coordinatorLayout.R(i, bottomAppBar);
            super.n(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.z(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new a();
            this.m = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
