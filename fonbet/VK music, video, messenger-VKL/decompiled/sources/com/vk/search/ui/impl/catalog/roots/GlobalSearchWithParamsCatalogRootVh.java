package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.GlobalSearchMarketCatalogFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bxz;
import xsna.c5f;
import xsna.dko;
import xsna.dne;
import xsna.f4m;
import xsna.gko;
import xsna.gzs;
import xsna.hvt0;
import xsna.iah0;
import xsna.k1u0;
import xsna.msy;
import xsna.o5a;
import xsna.sm;
import xsna.tlo0;
import xsna.tq;
import xsna.wcg;
import xsna.x0;
import xsna.x7g;
import xsna.xda;
import xsna.xut0;
import xsna.ywz;

/* compiled from: GlobalSearchWithParamsCatalogRootVh.kt */
/* loaded from: classes5.dex */
public abstract class GlobalSearchWithParamsCatalogRootVh extends GlobalSearchCatalogRootVh implements xda {
    public View A;
    public TextView B;
    public View C;
    public VkCell D;
    public final bpn0 E;
    public final Object x;
    public SearchParams y;
    public xut0 z;

    public GlobalSearchWithParamsCatalogRootVh(Bundle bundle, Activity activity, o5a o5aVar, GlobalSearchMarketCatalogFragment globalSearchMarketCatalogFragment) {
        super(bundle, activity, o5aVar, globalSearchMarketCatalogFragment);
        this.x = msy.a(LazyThreadSafetyMode.NONE, new x0(16));
        this.E = new bpn0(new dne(this, 28));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bxz a;
        RecyclerPaginatedView l;
        RecyclerView recyclerView;
        String str = null;
        View X = super.X(layoutInflater, viewGroup, null);
        SearchResultsVh j0 = j0();
        SearchResultsImplVh searchResultsImplVh = j0 instanceof SearchResultsImplVh ? (SearchResultsImplVh) j0 : null;
        if (searchResultsImplVh != null && (l = searchResultsImplVh.d.l()) != null && (recyclerView = l.getRecyclerView()) != null) {
            recyclerView.setClipToPadding(false);
        }
        layoutInflater.inflate(R.layout.catalog_search_params_bottom_panel, this.q, true);
        this.A = hvt0.a(R.id.ll_bottom_parameters_container, X, new sm(28));
        if (((Boolean) this.x.getValue()).booleanValue()) {
            bwt0.p0(X.findViewById(R.id.old_params), false);
            VkCell vkCell = (VkCell) X.findViewById(R.id.rich_cell_params);
            vkCell.setVisibility(0);
            vkCell.setAlpha(1.0f);
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_filter_24, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_stroke_accent_themed)), (tlo0.h) null, 8), null));
            gko.b bVar = gko.Companion;
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.accessibility_clear), false, (gzs) new c5f(this, 22), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
            this.D = vkCell;
        } else {
            bwt0.p0(X.findViewById(R.id.rich_cell_params), false);
            this.C = hvt0.a(R.id.iv_close, X, new wcg(this, 20));
            this.B = (TextView) X.findViewById(R.id.tv_subtitle);
        }
        this.z = new xut0(this.A);
        SearchParams searchParams = this.y;
        if (searchParams != null && (a = ((ywz) this.E.getValue()).a(searchParams)) != null) {
            str = a.a(this.b);
        }
        SearchParams searchParams2 = this.y;
        p0(str, searchParams2 != null ? searchParams2.I() : true);
        return X;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, xsna.wda
    public final void d0(String str, String str2, SearchInputMethod searchInputMethod) {
        v(str, null, str2, false, searchInputMethod);
    }

    public abstract Object o0();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void p0(String str, boolean z) {
        SearchResultsImplVh searchResultsImplVh;
        RecyclerPaginatedView l;
        RecyclerView recyclerView;
        RecyclerPaginatedView l2;
        RecyclerView recyclerView2;
        if (z) {
            xut0 xut0Var = this.z;
            if (xut0Var != null) {
                xut0Var.a(true);
            }
            SearchResultsVh j0 = j0();
            searchResultsImplVh = j0 instanceof SearchResultsImplVh ? (SearchResultsImplVh) j0 : null;
            if (searchResultsImplVh == null || (l2 = searchResultsImplVh.d.l()) == null || (recyclerView2 = l2.getRecyclerView()) == null) {
                return;
            }
            f4m.v(iah0.a(4), recyclerView2);
            return;
        }
        if (((Boolean) this.x.getValue()).booleanValue()) {
            VkCell vkCell = this.D;
            if (vkCell != null) {
                VkCell.Middle.e eVar = new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vk_discover_search_parameters), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
                if (str == null) {
                    str = "";
                }
                vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            }
        } else {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(str);
            }
        }
        xut0 xut0Var2 = this.z;
        if (xut0Var2 != null) {
            xut0Var2.b();
        }
        SearchResultsVh j02 = j0();
        searchResultsImplVh = j02 instanceof SearchResultsImplVh ? (SearchResultsImplVh) j02 : null;
        if (searchResultsImplVh == null || (l = searchResultsImplVh.d.l()) == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        f4m.v(iah0.a(64), recyclerView);
    }

    public void v(String str, SearchParams searchParams, String str2, boolean z, SearchInputMethod searchInputMethod) {
        bxz a;
        n0(searchInputMethod);
        this.p = str;
        this.y = searchParams;
        String str3 = null;
        if (searchParams != null && (a = ((ywz) this.E.getValue()).a(searchParams)) != null) {
            str3 = a.a(this.b);
        }
        p0(str3, searchParams != null ? searchParams.I() : true);
        SearchResultsVh.cb(j0(), str, str2, searchParams, z, null, false, 48);
    }
}
