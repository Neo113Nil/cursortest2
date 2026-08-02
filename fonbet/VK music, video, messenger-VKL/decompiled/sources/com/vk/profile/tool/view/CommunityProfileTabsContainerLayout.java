package com.vk.profile.tool.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer;

/* compiled from: CommunityProfileTabsContainerLayout.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileTabsContainerLayout extends ConstraintLayout implements NestedVerticalRecyclerViewContainer.b {
    public ViewPager2 t;
    public a u;
    public b v;
    public int w;
    public final Rect x;

    /* compiled from: CommunityProfileTabsContainerLayout.kt */
    public interface a {
        void j(int i);

        boolean m0(int i);

        void s0(int i);

        void t0(int i, int i2, int[] iArr);
    }

    /* compiled from: CommunityProfileTabsContainerLayout.kt */
    public interface b {
        void A3(int i, int i2);
    }

    public CommunityProfileTabsContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new Rect();
    }

    @Override // com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer.b
    public final void B4(int i) {
        a aVar = this.u;
        if (aVar != null) {
            aVar.s0(i);
        }
    }

    @Override // com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer.b
    public final void L() {
        P4();
    }

    public final void P4() {
        ViewPager2 viewPager2 = this.t;
        Rect rect = this.x;
        if (viewPager2 != null) {
            viewPager2.getGlobalVisibleRect(rect);
        }
        a aVar = this.u;
        if (aVar != null) {
            aVar.j(rect.height());
        }
        b bVar = this.v;
        if (bVar != null) {
            bVar.A3(getTop(), 0);
        }
    }

    @Override // com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer.b
    public final void c(int i, int[] iArr) {
        ViewPager2 viewPager2 = this.t;
        if (viewPager2 != null) {
            int currentItem = viewPager2.getCurrentItem();
            a aVar = this.u;
            if (aVar != null) {
                aVar.t0(i, currentItem, iArr);
            }
        }
    }

    @Override // com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer.b
    public final boolean d() {
        return getTop() - this.w <= 0;
    }

    public final ViewPager2 getPager() {
        return this.t;
    }

    public final a getPagerAdapter() {
        return this.u;
    }

    public final b getTabLayoutHolder() {
        return this.v;
    }

    public final int getTopInsets() {
        return this.w;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + (view != null ? view.getPaddingTop() : 0), 1073741824));
    }

    public final void setPager(ViewPager2 viewPager2) {
        this.t = viewPager2;
    }

    public final void setPagerAdapter(a aVar) {
        this.u = aVar;
    }

    public final void setTabLayoutHolder(b bVar) {
        this.v = bVar;
    }

    public final void setTopInsets(int i) {
        int i2 = this.w;
        this.w = i;
        if (i2 != i) {
            requestLayout();
        }
    }

    @Override // com.vk.profile.core.tabs.ui.view.NestedVerticalRecyclerViewContainer.b
    public final void w() {
        P4();
    }
}
