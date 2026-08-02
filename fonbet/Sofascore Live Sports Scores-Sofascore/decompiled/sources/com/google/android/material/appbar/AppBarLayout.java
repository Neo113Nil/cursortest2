package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bsk;
import defpackage.c89;
import defpackage.e80;
import defpackage.eq3;
import defpackage.f4a;
import defpackage.fhh;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.o02;
import defpackage.o3a;
import defpackage.o9d;
import defpackage.oyn;
import defpackage.p6;
import defpackage.pjf;
import defpackage.qzb;
import defpackage.s6a;
import defpackage.sa0;
import defpackage.srk;
import defpackage.ta0;
import defpackage.td4;
import defpackage.ts3;
import defpackage.ua0;
import defpackage.us3;
import defpackage.w3a;
import defpackage.x2a;
import defpackage.x9l;
import defpackage.xs3;
import defpackage.y79;
import defpackage.yfa;
import defpackage.ytk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements ts3 {
    public static final /* synthetic */ int B = 0;
    public Behavior A;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public x9l g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ColorStateList m;
    public int n;
    public WeakReference o;
    public ValueAnimator p;
    public ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final LinkedHashSet s;
    public final long t;
    public final TimeInterpolator u;
    public int[] v;
    public int w;
    public Drawable x;
    public Integer y;
    public final float z;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(oyn.U(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        int i2 = 0;
        this.f = 0;
        this.r = new ArrayList();
        this.s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray Y = m6k.Y(context3, attributeSet, o02.g, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (Y.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, Y.getResourceId(0, 0)));
            }
            Y.recycle();
            TypedArray Y2 = m6k.Y(context2, attributeSet, pjf.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.m = w3a.x(context2, Y2, 6);
            this.t = x2a.M(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.u = yfa.E(context2, R.attr.motionEasingStandardInterpolator, e80.a);
            if (Y2.hasValue(4)) {
                g(Y2.getBoolean(4, false), false, false);
            }
            if (Y2.hasValue(3)) {
                o02.l0(this, Y2.getDimensionPixelSize(3, 0));
            }
            setBackground(Y2.getDrawable(0));
            if (Y2.hasValue(2)) {
                setKeyboardNavigationCluster(Y2.getBoolean(2, false));
            }
            if (Y2.hasValue(1)) {
                setTouchscreenBlocksFocus(Y2.getBoolean(1, false));
            }
            this.z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.l = Y2.getBoolean(5, false);
            this.n = Y2.getResourceId(7, -1);
            setStatusBarForeground(Y2.getDrawable(8));
            Y2.recycle();
            sa0 sa0Var = new sa0(this, i2);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(this, sa0Var);
        } catch (Throwable th) {
            Y.recycle();
            throw th;
        }
    }

    public static ta0 c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ta0 ta0Var = new ta0((LinearLayout.LayoutParams) layoutParams);
            ta0Var.a = 1;
            return ta0Var;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new ta0(layoutParams);
        }
        ta0 ta0Var2 = new ta0((ViewGroup.MarginLayoutParams) layoutParams);
        ta0Var2.a = 1;
        return ta0Var2;
    }

    public final void a(ua0 ua0Var) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        if (ua0Var == null || arrayList.contains(ua0Var)) {
            return;
        }
        this.h.add(ua0Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ta0 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ta0 ta0Var = new ta0(context, attributeSet);
        ta0Var.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.b);
        ta0Var.a = obtainStyledAttributes.getInt(1, 0);
        ta0Var.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new f4a((byte) 0, 17);
        if (obtainStyledAttributes.hasValue(2)) {
            ta0Var.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return ta0Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ta0;
    }

    public final void d() {
        Behavior behavior = this.A;
        BaseBehavior.SavedState E = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.E(AbsSavedState.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (E != null) {
            Behavior behavior2 = this.A;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = E;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.x == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.a);
        this.x.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ua0 ua0Var = (ua0) this.h.get(i2);
                if (ua0Var != null) {
                    ua0Var.a(this, i);
                }
            }
        }
    }

    public final void f(ua0 ua0Var) {
        ArrayList arrayList = this.h;
        if (arrayList == null || ua0Var == null) {
            return;
        }
        arrayList.remove(ua0Var);
    }

    public final void g(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ta0(-1);
    }

    @Override // defpackage.ts3
    @NonNull
    public us3 getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ta0 ta0Var = (ta0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ta0Var.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) ta0Var).topMargin + ((LinearLayout.LayoutParams) ta0Var).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ta0 ta0Var = (ta0) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) ta0Var).topMargin + ((LinearLayout.LayoutParams) ta0Var).bottomMargin + childAt.getMeasuredHeight();
                int i4 = ta0Var.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    @Nullable
    public qzb getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof qzb) {
            return (qzb) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.x;
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int getTopInset() {
        x9l x9lVar = this.g;
        if (x9lVar != null) {
            return x9lVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ta0 ta0Var = (ta0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ta0Var.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) ta0Var).topMargin + ((LinearLayout.LayoutParams) ta0Var).bottomMargin + i3;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(boolean z) {
        if (this.i || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!(getBackground() instanceof qzb)) {
            return true;
        }
        ColorStateList colorStateList = this.m;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (colorStateList != null) {
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            j(f2, f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        float f3 = this.z;
        float f4 = z ? 0.0f : f3;
        if (z) {
            f = f3;
        }
        j(f4, f);
        return true;
    }

    public final boolean i(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.p = ofFloat;
        ofFloat.setDuration(this.t);
        this.p.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof qzb) {
            l4a.I(this, (qzb) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.v;
        if (iArr == null) {
            iArr = new int[4];
            this.v = iArr;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        iArr[0] = z ? R.attr.state_liftable : -2130970175;
        iArr[1] = (z && this.k) ? R.attr.state_lifted : -2130970176;
        iArr[2] = z ? R.attr.state_collapsible : -2130970171;
        iArr[3] = (z && this.k) ? R.attr.state_collapsed : -2130970170;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = bsk.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((ta0) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((ta0) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.j != z2) {
            this.j = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = s6a.t(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final qzb qzbVar;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof qzb) {
            qzbVar = (qzb) drawable;
        } else {
            ColorStateList r = eq3.r(drawable);
            if (r == null) {
                qzbVar = null;
            } else {
                qzb qzbVar2 = new qzb();
                qzbVar2.t(r);
                qzbVar = qzbVar2;
            }
        }
        if (qzbVar != null && (colorStateList = qzbVar.b.c) != null) {
            this.w = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.m;
            if (colorStateList2 != null) {
                final Integer v = o3a.v(R.attr.colorSurface, getContext());
                this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: ra0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        int i = AppBarLayout.B;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.s;
                        ArrayList arrayList = appBarLayout.r;
                        int J = o3a.J(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.w, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(J);
                        qzb qzbVar3 = qzbVar;
                        qzbVar3.t(valueOf);
                        if (appBarLayout.x != null && (num = appBarLayout.y) != null && num.equals(v)) {
                            appBarLayout.x.setTint(J);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    pvd.j();
                                    return;
                                } else if (qzbVar3.b.c != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw lnb.i(it2);
                        }
                    }
                };
            } else {
                qzbVar.p(context);
                this.q = new p6(1, this, qzbVar);
            }
            drawable = qzbVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof qzb) {
            ((qzb) background).s(f);
        }
    }

    public void setExpanded(boolean z) {
        g(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollColor(@Nullable ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.n = -1;
        if (view != null) {
            this.o = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            a70.p("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.f = i;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.x = mutate;
            if (mutate instanceof qzb) {
                num = Integer.valueOf(((qzb) mutate).v);
            } else {
                ColorStateList r = eq3.r(mutate);
                if (r != null) {
                    num = Integer.valueOf(r.getDefaultColor());
                }
            }
            this.y = num;
            Drawable drawable3 = this.x;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                this.x.setLayoutDirection(getLayoutDirection());
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
            }
            if (this.x != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(td4.d0(i, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        o02.l0(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new ta0(-1);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class BaseBehavior<T extends AppBarLayout> extends y79 {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference n;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new c();
            public boolean c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readByte() != 0;
                this.d = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof o9d) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((ta0) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.l) {
                z2 = appBarLayout.i(C(coordinatorLayout));
            }
            boolean h = appBarLayout.h(z2);
            if (!z) {
                if (h) {
                    List list = (List) ((fhh) coordinatorLayout.b.c).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        us3 us3Var = ((xs3) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (us3Var instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) us3Var).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(y() - i);
            float abs2 = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int round = abs2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            ValueAnimator valueAnimator = this.l;
            if (y == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(e80.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(y, i);
            this.l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i, i4, i5);
                    if (appBarLayout2.l) {
                        return;
                    }
                    appBarLayout2.h(appBarLayout2.i(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.l) {
            }
        }

        public final SavedState E(Parcelable parcelable, AppBarLayout appBarLayout) {
            int w = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + w;
                if (childAt.getTop() + w <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = w == 0;
                    savedState.d = z;
                    savedState.c = !z && (-w) >= appBarLayout.getTotalScrollRange();
                    savedState.e = i;
                    savedState.g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int y = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                ta0 ta0Var = (ta0) childAt.getLayoutParams();
                if ((ta0Var.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) ta0Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) ta0Var).bottomMargin;
                }
                int i2 = -y;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ta0 ta0Var2 = (ta0) childAt2.getLayoutParams();
                int i3 = ta0Var2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (y < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) ta0Var2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) ta0Var2).bottomMargin;
                    }
                    if (y < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    B(coordinatorLayout, appBarLayout, s6a.t(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.xtk, defpackage.us3
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            B(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.d) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.e);
                int i3 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.m.g ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.m.f) + i3);
            }
            appBarLayout.f = 0;
            this.m = null;
            int t = s6a.t(w(), -appBarLayout.getTotalScrollRange(), 0);
            ytk ytkVar = this.a;
            if (ytkVar != null) {
                ytkVar.b(t);
            } else {
                this.b = t;
            }
            G(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.e(w());
            if (bsk.f(coordinatorLayout) != null) {
                return true;
            }
            bsk.q(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // defpackage.us3
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((xs3) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.q(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // defpackage.us3
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.us3
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.z(coordinatorLayout2, appBarLayout, y() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && bsk.f(coordinatorLayout2) == null) {
                bsk.q(coordinatorLayout2, new b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // defpackage.us3
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.m = (SavedState) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // defpackage.us3
        public final Parcelable s(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState E = E(absSavedState, (AppBarLayout) view);
            return E == null ? absSavedState : E;
        }

        @Override // defpackage.us3
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.l || appBarLayout.k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // defpackage.us3
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                F(coordinatorLayout, appBarLayout);
                if (appBarLayout.l) {
                    appBarLayout.h(appBarLayout.i(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // defpackage.y79
        public final int y() {
            return w() + this.j;
        }

        @Override // defpackage.y79
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            int i6 = 0;
            if (i2 == 0 || y < i2 || y > i3) {
                this.j = 0;
            } else {
                int t = s6a.t(i, i2, i3);
                if (y != t) {
                    if (appBarLayout.e) {
                        int abs = Math.abs(t);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            ta0 ta0Var = (ta0) childAt.getLayoutParams();
                            Interpolator interpolator = ta0Var.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = ta0Var.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) ta0Var).topMargin + ((LinearLayout.LayoutParams) ta0Var).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(t);
                                }
                            }
                        }
                    }
                    i4 = t;
                    ytk ytkVar = this.a;
                    if (ytkVar != null) {
                        z = ytkVar.b(i4);
                    } else {
                        this.b = i4;
                        z = false;
                    }
                    int i9 = y - t;
                    this.j = t - i4;
                    int i10 = 1;
                    if (z) {
                        int i11 = 0;
                        while (i11 < appBarLayout.getChildCount()) {
                            ta0 ta0Var2 = (ta0) appBarLayout.getChildAt(i11).getLayoutParams();
                            f4a f4aVar = ta0Var2.b;
                            if (f4aVar != null && (ta0Var2.a & i10) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                float w = w();
                                Rect rect = (Rect) f4aVar.c;
                                Rect rect2 = (Rect) f4aVar.b;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect2.top - Math.abs(w);
                                if (abs2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float s = 1.0f - s6a.s(Math.abs(abs2 / rect2.height()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (s * s)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-height));
                                    if (height >= rect.height()) {
                                        childAt2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i11++;
                            i10 = 1;
                        }
                    }
                    if (!z && appBarLayout.e) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.e(w());
                    G(coordinatorLayout, appBarLayout, t, t < y ? -1 : 1, false);
                    i6 = i9;
                }
            }
            if (bsk.f(coordinatorLayout) != null) {
                return i6;
            }
            bsk.q(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class ScrollingViewBehavior extends c89 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.L);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.us3
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.us3
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            us3 us3Var = ((xs3) view2.getLayoutParams()).a;
            if (us3Var instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) us3Var).j) + this.e) - y(view2);
                WeakHashMap weakHashMap = bsk.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.l) {
                return false;
            }
            appBarLayout.h(appBarLayout.i(view));
            return false;
        }

        @Override // defpackage.us3
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                bsk.q(coordinatorLayout, null);
            }
        }

        @Override // defpackage.us3
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout z2 = z(coordinatorLayout.k(view));
            if (z2 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    z2.g(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
