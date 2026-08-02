package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.holders.EmptyScreenWithTextVh;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.alj;
import xsna.awm0;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.g3a;
import xsna.iah0;
import xsna.j5g;
import xsna.ltz;
import xsna.rda;
import xsna.tu80;
import xsna.u4a;
import xsna.vgb0;
import xsna.wia;
import xsna.wzs;

/* compiled from: TabsOrListVh.kt */
/* loaded from: classes16.dex */
public final class TabsOrListVh extends SectionWithSearchListVh implements rda, CatalogVh {
    public final SwitchCatalogVh A;
    public final CatalogViewHolder i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final g3a m;
    public final ViewPagerVh n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final TabLayoutViewHolder s;
    public View t;
    public View u;
    public AppBarShadowView v;
    public View w;
    public View x;
    public AppBarLayout y;
    public String z;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        if (r2 == null) goto L71;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabsOrListVh(u4a u4aVar, CatalogViewHolder catalogViewHolder, int i, Integer num, boolean z, g3a g3aVar, wia wiaVar, ViewPagerVh viewPagerVh, TabLayoutViewHolder tabLayoutViewHolder, EmptyScreenWithTextVh emptyScreenWithTextVh, boolean z2, wzs wzsVar, int i2) {
        super(u4aVar, r1, wiaVar, r15);
        boolean z3;
        boolean z4;
        SearchStatInfoProvider searchStatInfoProvider;
        ViewPagerVh viewPagerVh2;
        ErrorStateVh errorStateVh;
        Integer valueOf = Integer.valueOf(R.layout.stroke_tab_view);
        int i3 = (i2 & 4) != 0 ? R.layout.catalog_media_layout : i;
        Integer num2 = (i2 & 8) != 0 ? null : num;
        Integer num3 = (i2 & 16) != 0 ? null : valueOf;
        boolean z5 = num2 == null;
        boolean z6 = (i2 & 64) != 0 ? false : z;
        boolean z7 = (i2 & 128) == 0;
        SearchStatInfoProvider searchStatInfoProvider2 = (i2 & 1024) != 0 ? u4aVar.b.m : null;
        if ((i2 & 2048) != 0) {
            z3 = z5;
            z4 = z6;
            searchStatInfoProvider = searchStatInfoProvider2;
            viewPagerVh2 = new ViewPagerVh(u4aVar, false, null, false, null, null, null, null, null, null, 8190);
        } else {
            z3 = z5;
            z4 = z6;
            searchStatInfoProvider = searchStatInfoProvider2;
            viewPagerVh2 = viewPagerVh;
        }
        TabLayoutViewHolder tabLayoutViewHolder2 = (i2 & 4096) != 0 ? null : tabLayoutViewHolder;
        EmptyScreenWithTextVh emptyScreenWithTextVh2 = (i2 & 8192) != 0 ? null : emptyScreenWithTextVh;
        boolean z8 = (i2 & 16384) != 0;
        boolean z9 = (32768 & i2) == 0;
        boolean z10 = (65536 & i2) != 0 ? false : z2;
        wzs wzsVar2 = (131072 & i2) != 0 ? null : wzsVar;
        u4a.a aVar = u4aVar.b;
        this.i = catalogViewHolder;
        this.j = i3;
        this.k = z3;
        this.l = z4;
        this.m = g3aVar;
        this.n = viewPagerVh2;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = emptyScreenWithTextVh2 != null;
        this.s = tabLayoutViewHolder2 == null ? num2 == null ? new TabLayoutVh(viewPagerVh2, 0, null, false, aVar.r, 990) : new TabLayoutVh(viewPagerVh2, num2.intValue(), num3, z7, aVar.r, 968) : tabLayoutViewHolder2;
        if (wzsVar2 != null) {
            errorStateVh = (ErrorStateVh) wzsVar2.invoke(this, new vgb0(0, g3aVar, g3a.class, "reload", "reload()V", 0, 2));
        }
        errorStateVh = new ErrorStateVh(this, new tu80(this, 26));
        this.A = new SwitchCatalogVh(viewPagerVh2, this.e, errorStateVh, this.f, this, R.layout.catalog_frame_layout_with_scrolling, null, emptyScreenWithTextVh2, false, false, null, 1856);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        boolean A = this.n.A(str);
        this.z = str;
        return A;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.s.L();
        this.A.L();
        CatalogViewHolder catalogViewHolder = this.i;
        if (catalogViewHolder != null) {
            catalogViewHolder.L();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockCatalog) {
            ArrayList<UIBlock> arrayList = ((UIBlockCatalog) uIBlock).A;
            if (arrayList.size() > 1) {
                View view = this.u;
                if (view != null) {
                    bwt0.p0(view, this.l);
                }
                this.s.N6(uIBlock);
                View view2 = this.t;
                if (view2 == null) {
                    view2 = null;
                }
                bwt0.p0(view2, true);
                View view3 = this.x;
                if (view3 != null) {
                    bwt0.p0(view3, this.o);
                }
                View view4 = this.t;
                if (view4 == null) {
                    view4 = null;
                }
                if (view4.getMeasuredHeight() == 0) {
                    View view5 = this.t;
                    if (view5 == null) {
                        view5 = null;
                    }
                    view5.measure(0, 0);
                }
                View view6 = this.t;
                int measuredHeight = (view6 != null ? view6 : null).getMeasuredHeight();
                View view7 = this.w;
                if (view7 != null) {
                    f4m.t(measuredHeight, view7);
                }
                View view8 = this.x;
                if (view8 != null) {
                    f4m.t(measuredHeight, view8);
                }
            } else if (arrayList.size() == 1) {
                View view9 = this.u;
                if (view9 != null) {
                    bwt0.p0(view9, true);
                }
                View view10 = this.w;
                if (view10 != null) {
                    f4m.t(0, view10);
                }
                View view11 = this.t;
                bwt0.p0(view11 != null ? view11 : null, false);
                View view12 = this.x;
                if (view12 != null) {
                    bwt0.p0(view12, false);
                }
                CatalogViewHolder catalogViewHolder = this.i;
                if (catalogViewHolder != null) {
                    catalogViewHolder.N6((UIBlock) j5g.Y(arrayList));
                }
            }
            this.A.N6(uIBlock);
            i8(alj.a);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh
    public final CatalogStatesViewHolder a() {
        return this.A;
    }

    public final boolean a0() {
        View view = this.u;
        if (view == null || !bwt0.K(view)) {
            return false;
        }
        CatalogViewHolder catalogViewHolder = this.i;
        ToolbarVh toolbarVh = catalogViewHolder instanceof ToolbarVh ? (ToolbarVh) catalogViewHolder : null;
        return toolbarVh != null && toolbarVh.a0();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.j, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        SwitchCatalogVh switchCatalogVh = this.A;
        View k5 = switchCatalogVh.k5(layoutInflater, viewGroup2, bundle);
        this.w = k5;
        viewGroup2.addView(k5, 0);
        AppBarLayout appBarLayout = (AppBarLayout) viewGroup2.findViewById(R.id.vk_app_bar);
        this.y = appBarLayout;
        View k52 = this.s.k5(layoutInflater, appBarLayout, bundle);
        this.t = k52;
        if (k52 == null) {
            k52 = null;
        }
        bwt0.p0(k52, false);
        CatalogViewHolder catalogViewHolder = this.i;
        this.u = catalogViewHolder != null ? catalogViewHolder.k5(layoutInflater, this.y, bundle) : null;
        AppBarShadowView appBarShadowView = (AppBarShadowView) viewGroup2.findViewById(R.id.shadow_view);
        this.v = appBarShadowView;
        if (catalogViewHolder == null) {
            viewGroup2.removeView(appBarShadowView);
            viewGroup2.removeView(this.y);
            View view = this.t;
            if (view == null) {
                view = null;
            }
            viewGroup2.addView(view);
        } else {
            AppBarLayout appBarLayout2 = this.y;
            if (appBarLayout2 != null) {
                if (this.l) {
                    View view2 = this.u;
                    if (view2 != null) {
                        appBarLayout2.addView(view2);
                    }
                    View view3 = this.t;
                    if (view3 == null) {
                        view3 = null;
                    }
                    appBarLayout2.addView(view3);
                } else {
                    View view4 = this.t;
                    if (view4 == null) {
                        view4 = null;
                    }
                    appBarLayout2.addView(view4);
                    View view5 = this.u;
                    if (view5 != null) {
                        appBarLayout2.addView(view5);
                    }
                }
            }
        }
        if (this.k) {
            Context context = viewGroup2.getContext();
            View view6 = new View(context);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, iah0.a(0.5f));
            float f = 16;
            marginLayoutParams.setMargins(iah0.a(f), 0, iah0.a(f), 0);
            view6.setLayoutParams(marginLayoutParams);
            view6.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary, context));
            view6.setVisibility(8);
            this.x = view6;
            viewGroup2.addView(view6);
        }
        if (!this.r) {
            switchCatalogVh.i8(ltz.a);
        }
        ToolbarVh toolbarVh = catalogViewHolder instanceof ToolbarVh ? (ToolbarVh) catalogViewHolder : null;
        if (toolbarVh != null) {
            toolbarVh.q = this;
        }
        if (this.p) {
            g3a.a(this.m, this);
        }
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.A.onConfigurationChanged(configuration);
    }

    @Override // xsna.rda
    public final void s() {
        Se(this.y, "Call method \"setExpanded(..)\" only after \"createView(..)\"", new awm0(3));
        this.n.s();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.n.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh, com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        super.ya();
        if (this.q) {
            View view = this.w;
            if (view != null) {
                f4m.t(0, view);
            }
            View view2 = this.t;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.p0(view2, false);
            View view3 = this.x;
            if (view3 != null) {
                bwt0.p0(view3, false);
            }
        }
    }
}
