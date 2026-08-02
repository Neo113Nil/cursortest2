package com.vk.catalog2.common.ui.mvp.holder.header;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.aq0;
import xsna.awt0;
import xsna.b0u0;
import xsna.bwt0;
import xsna.c24;
import xsna.ccr0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.f5h0;
import xsna.gib0;
import xsna.gzs;
import xsna.hiv0;
import xsna.iah0;
import xsna.iut0;
import xsna.jjc;
import xsna.m33;
import xsna.mk5;
import xsna.o25;
import xsna.r9c0;
import xsna.rvt0;
import xsna.s3q0;
import xsna.stg0;
import xsna.tg;
import xsna.ug;
import xsna.vg;
import xsna.w2o0;
import xsna.yei0;
import xsna.zmp0;

/* compiled from: VkSearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class VkSearchQueryVh implements CatalogSearchQueryViewHolder, VkCatalogSearchQueryViewHolder {
    public final SearchQueryVh b;
    public final hiv0.a c;
    public final gzs<Boolean> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;
    public final long g;
    public final gzs<Boolean> h;
    public final boolean i;
    public ImageView j;
    public ImageView k;
    public FrameLayout l;
    public ImageView m;
    public TextView n;
    public ImageView o;
    public View p;
    public View q;
    public View r;
    public ccr0 s;

    public VkSearchQueryVh() {
        throw null;
    }

    public VkSearchQueryVh(SearchQueryVh searchQueryVh, gzs gzsVar, stg0 stg0Var, yei0 yei0Var, gzs gzsVar2, int i) {
        hiv0.a aVar = new hiv0.a(0);
        gzsVar = (i & 4) != 0 ? new c24(0) : gzsVar;
        stg0Var = (i & 8) != 0 ? null : stg0Var;
        yei0Var = (i & 16) != 0 ? null : yei0Var;
        gzsVar2 = (i & 256) != 0 ? new aq0(10) : gzsVar2;
        boolean z = (i & 512) == 0;
        this.b = searchQueryVh;
        this.c = aVar;
        this.d = gzsVar;
        this.e = stg0Var;
        this.f = yei0Var;
        this.g = 100L;
        this.h = gzsVar2;
        this.i = z;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Fb() {
        this.b.Fb();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void K6(boolean z) {
        this.b.K6(true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Kf(gzs<s3q0> gzsVar) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setOnClickListener(new vg(gzsVar, 11));
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Km(long j) {
        this.b.Km(j);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.r = null;
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void Ll() {
        d(this.l, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ml(int i, int i2) {
        ImageView imageView = this.m;
        if (imageView != null) {
            w2o0.a.a(i, i2).a(imageView, true);
            bwt0.p0(imageView, true);
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(String.valueOf(0));
            bwt0.p0(textView, false);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void N2() {
        d(this.j, true);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void P1(String str) {
        this.b.P1(str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ta() {
        this.b.Ta();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void Tk() {
        d(this.o, true);
    }

    public final void a() {
        d(this.k, false);
    }

    public final void b(int i) {
        View view = this.r;
        if (view != null) {
            awt0.x(view, i, 0, 0, 0, 14);
        }
    }

    public final void c(boolean z) {
        if (z) {
            d(this.r, true);
            return;
        }
        View view = this.r;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final Boolean c9() {
        return this.b.c9();
    }

    public final void d(View view, boolean z) {
        if (view == null || this.r == null) {
            return;
        }
        mk5 mk5Var = new mk5();
        mk5Var.e(this.g);
        zmp0.a((ViewGroup) this.r, mk5Var);
        bwt0.p0(view, z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void en() {
        d(this.m, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void fi() {
        d(this.o, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void hc() {
        d(this.q, true);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        View view = this.r;
        if (view != null) {
            f4m.j(view);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final String i() {
        return this.b.i();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void k3() {
        this.b.k3();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView;
        SearchQueryVh searchQueryVh = this.b;
        gzs<Boolean> gzsVar = searchQueryVh.c;
        searchQueryVh.c = null;
        View inflate = layoutInflater.inflate(R.layout.vk_catalog_search_query_view, viewGroup, false);
        this.r = inflate;
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.m = (ImageView) viewGroup2.findViewById(R.id.search_query_iv_icon_right);
        this.n = (TextView) viewGroup2.findViewById(R.id.tv_icon_right_badge);
        this.p = viewGroup2.findViewById(R.id.search_query_iv_icon_left);
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.iv_icon_search_expand);
        int i = 10;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new tg(this, i));
        } else {
            imageView2 = null;
        }
        this.o = imageView2;
        ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.title_slot_stub);
        hiv0.a aVar = this.c;
        viewStub.setLayoutResource(aVar.a);
        View inflate2 = viewStub.inflate();
        aVar.c = (TextView) inflate2.findViewById(aVar.b);
        inflate2.setClickable(false);
        inflate2.setFocusable(false);
        this.q = inflate2;
        ImageView imageView3 = (ImageView) viewGroup2.findViewById(R.id.back_btn);
        imageView3.setOnClickListener(new ug(gzsVar, 11));
        Context context = imageView3.getContext();
        e3m.a aVar2 = e3m.a;
        imageView3.setImageDrawable(m33.a(R.drawable.vk_icon_arrow_left_outline_28, context));
        this.j = imageView3;
        if (!this.h.invoke().booleanValue()) {
            y8();
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.search_container);
        searchQueryVh.c((ModernSearchView) frameLayout.findViewById(R.id.search));
        this.l = frameLayout;
        this.k = (ImageView) viewGroup2.findViewById(R.id.navigation_icon);
        gzs<Boolean> gzsVar2 = this.d;
        if (gzsVar2.invoke().booleanValue() && (imageView = this.k) != null) {
            bwt0.p0(imageView, gzsVar2.invoke().booleanValue());
            Context context2 = imageView.getContext();
            int i2 = ccr0.q;
            ccr0 a = ccr0.a.a(context2);
            a.g.o(f5h0.g.a);
            a.u(dhr0.t.a(R.drawable.user_placeholder));
            a.q(imageView);
            imageView.setImageDrawable(a);
            this.s = a;
            a.r(o25.a().o().c);
            ImageView imageView4 = this.k;
            if (imageView4 != null) {
                jjc.g(imageView4, new r9c0(this, 25));
            }
            ImageView imageView5 = this.k;
            if (imageView5 != null) {
                bwt0.k0(imageView5, new gib0(this, 29));
            }
        }
        if (this.i) {
            rvt0 rvt0Var = new rvt0();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(inflate, rvt0Var);
        }
        ModernSearchView modernSearchView = searchQueryVh.k;
        if (modernSearchView != null) {
            modernSearchView.setSearchBoxBackground(null);
            ViewGroup viewGroup3 = modernSearchView.n;
            if (viewGroup3 != null) {
                bwt0.p0(viewGroup3, true);
            }
        }
        ModernSearchView modernSearchView2 = searchQueryVh.k;
        if (modernSearchView2 != null) {
            modernSearchView2.i(iah0.a(16), iah0.a(10));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void om(boolean z) {
        this.b.om(true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final ModernSearchView pi() {
        return this.b.k;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void r9() {
        d(this.m, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        c(false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void sj(String str) {
        TextView textView = this.c.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void y8() {
        d(this.j, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        this.b.getClass();
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void zf(String str, boolean z) {
        this.b.zf(str, z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void j5() {
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void xi() {
    }
}
