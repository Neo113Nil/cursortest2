package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.pagergrid.PagerGridLayoutManager;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.ListDataSet;
import com.vk.superapp.ui.PagerIndicatorView;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ab90;
import xsna.ayn0;
import xsna.bwt0;
import xsna.cb90;
import xsna.cca;
import xsna.dhr0;
import xsna.ef90;
import xsna.epx;
import xsna.fnj;
import xsna.fr20;
import xsna.iah0;
import xsna.if7;
import xsna.k7z;
import xsna.lca;
import xsna.nca;
import xsna.qcy;
import xsna.qda;
import xsna.r820;
import xsna.u4a;
import xsna.v1d0;
import xsna.vha;
import xsna.w910;

/* compiled from: PagerGridListVh.kt */
/* loaded from: classes16.dex */
public final class PagerGridListVh implements CatalogListViewHolder {
    public final com.vk.catalog2.common.ui.mvp.configuration.a b;
    public final Pair<Integer, Integer> c;
    public final u4a e;
    public final Pair<Integer, Integer> f;
    public final ListDataSet<UIBlock> h;
    public final cca i;
    public final vha j;
    public qda k;
    public final lca l;
    public RecyclerView m;
    public View n;
    public PagerIndicatorView o;
    public boolean p;
    public UIBlockList q;
    public final int d = R.dimen.community_catalog_pager_grid_page_height;
    public final int g = R.layout.catalog_pager_grid;

    public PagerGridListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, Pair pair, u4a u4aVar, Pair pair2) {
        this.b = aVar;
        this.c = pair;
        this.e = u4aVar;
        this.f = pair2;
        ListDataSet<UIBlock> listDataSet = new ListDataSet<>();
        this.h = listDataSet;
        this.i = new cca(new k7z(this, 17), aVar, new r820(this, 8), new w910(this, 11));
        this.j = aVar.A(CatalogConfiguration$Companion$ContainerType.GRID, u4aVar);
        this.k = new ab90();
        this.l = new lca(null, aVar, listDataSet, u4aVar, new fr20(this, 12));
        this.p = true;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        List list;
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = this.q;
            boolean f = epx.f(uIBlockList != null ? uIBlockList.b : null, uIBlock.b);
            vha vhaVar = this.j;
            ListDataSet<UIBlock> listDataSet = this.h;
            if (f) {
                UIBlockList uIBlockList2 = this.q;
                if (uIBlockList2 == null || (list = uIBlockList2.y) == null) {
                    list = EmptyList.b;
                }
                ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
                m.d a2 = m.a(new if7(list, arrayList), true);
                listDataSet.d.clear();
                listDataSet.d.addAll(arrayList);
                a2.b(this.l);
            } else {
                listDataSet.setItems(((UIBlockList) uIBlock).y);
                vhaVar.q();
            }
            vhaVar.r(listDataSet.d);
            if (this.k.a(uIBlock, true)) {
                s();
            }
            this.q = (UIBlockList) uIBlock;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final ayn0 Pa() {
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return this.b.W(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Pl(qda qdaVar) {
        this.k = qdaVar;
    }

    public final void a(boolean z) {
        if (this.p != z) {
            this.p = z;
            RecyclerView recyclerView = this.m;
            RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView2.setLayoutManager(b(recyclerView.getContext(), z));
            RecyclerView recyclerView3 = this.m;
            (recyclerView3 != null ? recyclerView3 : null).setAdapter(this.l);
        }
    }

    public final PagerGridLayoutManager b(Context context, boolean z) {
        if (!z) {
            Pair<Integer, Integer> pair = this.f;
            PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(pair.i().intValue(), pair.j().intValue());
            pagerGridLayoutManager.s = this;
            return pagerGridLayoutManager;
        }
        HashSet hashSet = iah0.a;
        boolean c = fnj.c(context);
        Pair<Integer, Integer> pair2 = this.c;
        PagerGridLayoutManager pagerGridLayoutManager2 = new PagerGridLayoutManager(pair2.i().intValue(), c ? pair2.j().intValue() : pair2.j().intValue() + 1);
        pagerGridLayoutManager2.s = this;
        return pagerGridLayoutManager2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.g, viewGroup, false);
        this.n = inflate.findViewById(R.id.pager_indicator_container);
        PagerIndicatorView pagerIndicatorView = (PagerIndicatorView) inflate.findViewById(R.id.pager_indicator);
        pagerIndicatorView.setSelectedDotColor(dhr0.t.c(R.attr.vk_ui_icon_accent));
        this.o = pagerIndicatorView;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.paginated_list);
        qcy<Object>[] qcyVarArr = bwt0.a;
        bwt0.c0((int) inflate.getResources().getDimension(this.d), recyclerView);
        cca ccaVar = this.i;
        recyclerView.addOnAttachStateChangeListener(ccaVar);
        recyclerView.setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        this.p = iah0.s(inflate.getContext());
        recyclerView.setLayoutManager(b(inflate.getContext(), this.p));
        recyclerView.setItemAnimator(new nca(true));
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType = CatalogConfiguration$Companion$ContainerType.GRID;
        u4a u4aVar = this.e;
        com.vk.catalog2.common.ui.mvp.configuration.a aVar = this.b;
        recyclerView.addItemDecoration(aVar.F(catalogConfiguration$Companion$ContainerType, u4aVar));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.l);
        this.j.s(recyclerView);
        recyclerView.addOnScrollListener(new ef90(new v1d0(aVar.R(), ccaVar)));
        new cb90().attachToRecyclerView(recyclerView);
        recyclerView.addOnAttachStateChangeListener(new a());
        this.m = recyclerView;
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        a(configuration.orientation == 1);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.j.q();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.j.r(this.h.d);
    }

    @Override // xsna.rda
    public final void s() {
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final qda td() {
        throw null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    /* compiled from: PagerGridListVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            PagerGridListVh.this.a(iah0.s(view.getContext()));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
