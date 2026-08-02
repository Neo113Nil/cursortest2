package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c4;
import androidx.core.view.k2;
import androidx.transition.a0;
import androidx.transition.e0;
import androidx.transition.f;
import androidx.transition.h;
import androidx.transition.i0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import g0.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {
    static final int COLLAPSED_MAX_ITEM_COUNT = 7;
    private static final TimeInterpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    private static final int EXPAND_DURATION = 500;
    private static final int FADE_DURATION = 100;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private int collapsedIconGravity;
    private int collapsedItemGravity;
    private int collapsedItemMinHeight;
    private int collapsedItemSpacing;
    private NavigationRailFrameLayout contentContainer;
    private final int contentMarginTop;
    private boolean expanded;
    private int expandedIconGravity;
    private int expandedItemGravity;
    private int expandedItemMinHeight;
    private int expandedItemSpacing;
    private final int headerMarginBottom;
    private View headerView;
    private final int maxExpandedWidth;
    private final int minExpandedWidth;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingStartSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final boolean scrollingEnabled;
    private boolean submenuDividersEnabled;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private void addContentContainer() {
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.contentContainer = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(this.contentMarginTop);
        this.contentContainer.setScrollingEnabled(this.scrollingEnabled);
        this.contentContainer.setClipChildren(false);
        this.contentContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.contentContainer.addView(view);
        if (!this.scrollingEnabled) {
            addView(this.contentContainer);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.contentContainer);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public k2 onApplyWindowInsets(View view, @NonNull k2 k2Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                d f6 = k2Var.f1349a.f(519);
                d f10 = k2Var.f1349a.f(128);
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += f6.f9677b;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += f6.f9679d;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    if (ViewUtils.isLayoutRtl(view)) {
                        relativePadding.start = Math.max(f6.f9678c, f10.f9678c) + relativePadding.start;
                    } else {
                        relativePadding.start = Math.max(f6.f9676a, f10.f9676a) + relativePadding.start;
                    }
                }
                relativePadding.applyToView(view);
                return k2Var;
            }
        });
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int i5 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getNavigationRailMenuView().getChildAt(i10);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
        }
        return i5;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private int makeExpandedWidthMeasureSpec(int i5, int i10) {
        int min = Math.min(this.minExpandedWidth, View.MeasureSpec.getSize(i5));
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            return i5;
        }
        int max = Math.max(i10, min);
        View view = this.headerView;
        if (view != null) {
            max = Math.max(max, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(max, this.maxExpandedWidth)), 1073741824);
    }

    private int makeMinWidthSpec(int i5) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i5) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i5;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    private void setExpanded(boolean z5) {
        if (this.expanded == z5) {
            return;
        }
        startTransitionAnimation();
        this.expanded = z5;
        int i5 = this.collapsedIconGravity;
        int i10 = this.collapsedItemSpacing;
        int i11 = this.collapsedItemMinHeight;
        int i12 = this.collapsedItemGravity;
        if (z5) {
            i5 = this.expandedIconGravity;
            i10 = this.expandedItemSpacing;
            i11 = this.expandedItemMinHeight;
            i12 = this.expandedItemGravity;
        }
        getNavigationRailMenuView().setItemGravity(i12);
        super.setItemIconGravity(i5);
        getNavigationRailMenuView().setItemSpacing(i10);
        getNavigationRailMenuView().setItemMinimumHeight(i11);
        getNavigationRailMenuView().setExpanded(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    private void startTransitionAnimation() {
        if (isLaidOut()) {
            a0 interpolator = new f().setDuration(500L).setInterpolator(CUBIC_BEZIER_INTERPOLATOR);
            a0 duration = new h().setDuration(100L);
            a0 duration2 = new h().setDuration(100L);
            LabelMoveTransition labelMoveTransition = new LabelMoveTransition();
            a0 duration3 = new h().setDuration(100L);
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getNavigationRailMenuView().getChildAt(i5);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    interpolator.excludeTarget((View) navigationBarItemView.getLabelGroup(), true);
                    interpolator.excludeTarget((View) navigationBarItemView.getExpandedLabelGroup(), true);
                    if (this.expanded) {
                        duration2.addTarget(navigationBarItemView.getExpandedLabelGroup());
                        duration.addTarget(navigationBarItemView.getLabelGroup());
                    } else {
                        duration2.addTarget(navigationBarItemView.getLabelGroup());
                        duration.addTarget(navigationBarItemView.getExpandedLabelGroup());
                    }
                    labelMoveTransition.addTarget(navigationBarItemView.getExpandedLabelGroup());
                }
                duration3.addTarget(childAt);
            }
            i0 i0Var = new i0();
            i0Var.l(0);
            i0Var.g(interpolator);
            i0Var.g(duration);
            i0Var.g(labelMoveTransition);
            if (!this.expanded) {
                i0Var.g(duration3);
            }
            i0 i0Var2 = new i0();
            i0Var2.l(0);
            i0Var2.g(duration2);
            if (this.expanded) {
                i0Var2.g(duration3);
            }
            i0 i0Var3 = new i0();
            i0Var3.l(1);
            i0Var3.g(i0Var2);
            i0Var3.g(i0Var);
            e0.a((ViewGroup) getParent(), i0Var3);
        }
    }

    public void addHeaderView(int i5) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i5, (ViewGroup) this, false));
    }

    public void collapse() {
        if (this.expanded) {
            setExpanded(false);
            announceForAccessibility(getResources().getString(R.string.nav_rail_collapsed_a11y_label));
        }
    }

    public void expand() {
        if (this.expanded) {
            return;
        }
        setExpanded(true);
        announceForAccessibility(getResources().getString(R.string.nav_rail_expanded_a11y_label));
    }

    public int getCollapsedItemMinimumHeight() {
        return this.collapsedItemMinHeight;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.expandedItemMinHeight;
    }

    public View getHeaderView() {
        return this.headerView;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.submenuDividersEnabled;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public boolean isSubMenuSupported() {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        int makeMinWidthSpec = makeMinWidthSpec(i5);
        if (this.expanded) {
            measureChild(getNavigationRailMenuView(), i5, i10);
            View view = this.headerView;
            if (view != null) {
                measureChild(view, i5, i10);
            }
            makeMinWidthSpec = makeExpandedWidthMeasureSpec(i5, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().updateActiveIndicator(View.MeasureSpec.getSize(makeMinWidthSpec));
            }
        }
        super.onMeasure(makeMinWidthSpec, i10);
        if (this.contentContainer.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.contentContainer, makeMinWidthSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            this.contentContainer.removeView(view);
            this.headerView = null;
        }
    }

    public void setCollapsedItemMinimumHeight(int i5) {
        this.collapsedItemMinHeight = i5;
        if (this.expanded) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i5);
    }

    public void setCollapsedItemSpacing(int i5) {
        this.collapsedItemSpacing = i5;
        if (this.expanded) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i5);
    }

    public void setExpandedItemMinimumHeight(int i5) {
        this.expandedItemMinHeight = i5;
        if (this.expanded) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i5);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i5) {
        this.collapsedItemGravity = i5;
        this.expandedItemGravity = i5;
        super.setItemGravity(i5);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i5) {
        this.collapsedIconGravity = i5;
        this.expandedIconGravity = i5;
        super.setItemIconGravity(i5);
    }

    public void setItemMinimumHeight(int i5) {
        this.collapsedItemMinHeight = i5;
        this.expandedItemMinHeight = i5;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i5);
    }

    public void setItemSpacing(int i5) {
        this.collapsedItemSpacing = i5;
        this.expandedItemSpacing = i5;
        getNavigationRailMenuView().setItemSpacing(i5);
    }

    public void setMenuGravity(int i5) {
        getNavigationRailMenuView().setMenuGravity(i5);
    }

    public void setSubmenuDividersEnabled(boolean z5) {
        if (this.submenuDividersEnabled == z5) {
            return;
        }
        this.submenuDividersEnabled = z5;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z5);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public boolean shouldAddMenuView() {
        return true;
    }

    public NavigationRailView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(@NonNull View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.headerMarginBottom;
        this.contentContainer.addView(view, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    public NavigationRailMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(@NonNull Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.expanded = false;
        this.collapsedItemMinHeight = -1;
        this.collapsedIconGravity = 0;
        this.collapsedItemGravity = 49;
        Context context2 = getContext();
        this.expandedItemSpacing = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.expandedItemGravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.expandedIconGravity = 1;
        c4 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i5, i10, new int[0]);
        this.contentMarginTop = obtainTintedStyledAttributes.f722b.getDimensionPixelSize(R.styleable.NavigationRailView_contentMarginTop, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        int i11 = R.styleable.NavigationRailView_headerMarginBottom;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        TypedArray typedArray = obtainTintedStyledAttributes.f722b;
        this.headerMarginBottom = typedArray.getDimensionPixelSize(i11, dimensionPixelSize);
        this.scrollingEnabled = typedArray.getBoolean(R.styleable.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(R.styleable.NavigationRailView_submenuDividersEnabled, false));
        addContentContainer();
        int resourceId = typedArray.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(typedArray.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1);
        dimensionPixelSize2 = typedArray.hasValue(R.styleable.NavigationRailView_collapsedItemMinHeight) ? typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_collapsedItemMinHeight, -1) : dimensionPixelSize2;
        dimensionPixelSize3 = typedArray.hasValue(R.styleable.NavigationRailView_expandedItemMinHeight) ? typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedItemMinHeight, -1) : dimensionPixelSize3;
        setCollapsedItemMinimumHeight(dimensionPixelSize2);
        setExpandedItemMinimumHeight(dimensionPixelSize3);
        this.minExpandedWidth = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.maxExpandedWidth = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float lerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float lerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, lerp);
        float lerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, lerp);
        setItemPaddingTop(Math.round(lerp2));
        setItemPaddingBottom(Math.round(lerp3));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemSpacing, 0));
        setExpanded(typedArray.getBoolean(R.styleable.NavigationRailView_expanded, false));
        obtainTintedStyledAttributes.g();
        applyWindowInsets();
    }
}
