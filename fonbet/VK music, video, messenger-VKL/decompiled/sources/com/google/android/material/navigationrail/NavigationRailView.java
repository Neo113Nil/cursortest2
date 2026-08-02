package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.navigation.NavigationBarView;
import com.unity3d.services.UnityAdsConstants;
import xsna.cz50;
import xsna.dz50;
import xsna.fpo0;
import xsna.rq2;
import xsna.rw50;
import xsna.t1u0;
import xsna.yyo0;

/* loaded from: classes13.dex */
public class NavigationRailView extends NavigationBarView {
    public final int g;

    @Nullable
    public final View h;

    @Nullable
    public final Boolean i;

    @Nullable
    public final Boolean j;

    @Nullable
    public final Boolean k;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private cz50 getNavigationRailMenuView() {
        return (cz50) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    public final rw50 a(@NonNull Context context) {
        return new cz50(context);
    }

    @Nullable
    public View getHeaderView() {
        return this.h;
    }

    public int getItemMinimumHeight() {
        return ((cz50) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r4.J.gravity & 112) == 48) goto L13;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        cz50 navigationRailMenuView = getNavigationRailMenuView();
        int i5 = this.g;
        View view = this.h;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.h.getBottom() + i5;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
            i5 = 0;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.h;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.h.getMeasuredHeight()) - this.g, Integer.MIN_VALUE));
    }

    public void setItemMinimumHeight(int i) {
        ((cz50) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = null;
        this.j = null;
        this.k = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_rail_margin);
        this.g = dimensionPixelSize;
        Context context2 = getContext();
        yyo0 e = fpo0.e(context2, attributeSet, R$styleable.NavigationRailView, i, i2, new int[0]);
        int i3 = R$styleable.NavigationRailView_headerLayout;
        TypedArray typedArray = e.b;
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.h;
            if (view != null) {
                removeView(view);
                this.h = null;
            }
            this.h = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(inflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(R$styleable.NavigationRailView_menuGravity, 49));
        if (typedArray.hasValue(R$styleable.NavigationRailView_itemMinHeight)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(R$styleable.NavigationRailView_itemMinHeight, -1));
        }
        if (typedArray.hasValue(R$styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.i = Boolean.valueOf(typedArray.getBoolean(R$styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R$styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.j = Boolean.valueOf(typedArray.getBoolean(R$styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R$styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.k = Boolean.valueOf(typedArray.getBoolean(R$styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R$dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float b = rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float c = rq2.c(getItemPaddingTop(), dimensionPixelOffset, b);
        float c2 = rq2.c(getItemPaddingBottom(), dimensionPixelOffset2, b);
        setItemPaddingTop(Math.round(c));
        setItemPaddingBottom(Math.round(c2));
        e.f();
        t1u0.a(this, new dz50(this));
    }
}
