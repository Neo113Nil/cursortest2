package com.vk.catalog2.common.ui.mvp.holder;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.o0;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ayn0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cca;
import xsna.f5z;
import xsna.g380;
import xsna.gr3;
import xsna.gzs;
import xsna.h20;
import xsna.hg;
import xsna.k5a;
import xsna.lca;
import xsna.msy;
import xsna.p1a;
import xsna.qda;
import xsna.qro0;
import xsna.s350;
import xsna.s3q0;
import xsna.tca;
import xsna.u4a;
import xsna.wia;
import xsna.zx;

/* compiled from: CatalogBasePaginatedListVh.kt */
/* loaded from: classes16.dex */
public abstract class CatalogBasePaginatedListVh implements CatalogPaginatedListViewHolder {
    public final wia b;
    public final CatalogConfiguration c;
    public final c.h d;
    public final u4a e;
    public final boolean f;
    public o0 g;
    public final ListDataSet<UIBlock> h = new ListDataSet<>();
    public final lca i;
    public final lca j;
    public final Object k;
    public final Object l;
    public qda m;
    public RecyclerPaginatedView n;
    public final cca o;

    /* compiled from: CatalogBasePaginatedListVh.kt */
    public static final class a implements f5z {
        public final bpn0 b;

        public a(CatalogBasePaginatedListVh catalogBasePaginatedListVh) {
            this.b = new bpn0(new i(catalogBasePaginatedListVh, 8));
        }

        @Override // xsna.f5z
        public final Lifecycle getLifecycle() {
            return (Lifecycle) this.b.getValue();
        }
    }

    /* compiled from: CatalogBasePaginatedListVh.kt */
    public static final class b implements qda {
        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            return false;
        }
    }

    public CatalogBasePaginatedListVh(wia wiaVar, CatalogConfiguration catalogConfiguration, c.h hVar, u4a u4aVar, boolean z) {
        this.b = wiaVar;
        this.c = catalogConfiguration;
        this.d = hVar;
        this.e = u4aVar;
        this.f = z;
        lca j = j();
        this.i = j;
        this.j = j;
        h20 h20Var = new h20(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, h20Var);
        this.l = msy.a(lazyThreadSafetyMode, new d(this, 7));
        this.m = new b();
        this.o = new cca(new hg(this, 10), catalogConfiguration, new zx(this, 14), new gr3(this, 7));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Bl(boolean z) {
        lca k = k();
        if (z) {
            k.notifyItemRangeChanged(0, k.E0());
        } else {
            k.notifyDataSetChanged();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public void N5(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            this.h.n0(((UIBlockList) uIBlock).y);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            p((UIBlockList) uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final ayn0 Pa() {
        RecyclerPaginatedView l = l();
        return this.c.W(l != null ? l.getRecyclerView() : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Pl(qda qdaVar) {
        this.m = qdaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final c Wi(String str, boolean z, boolean z2, UIBlockList uIBlockList, boolean z3, gzs<s3q0> gzsVar, boolean z4) {
        if (uIBlockList != null) {
            p(uIBlockList);
        }
        c.h hVar = this.d;
        hVar.k = str;
        hVar.g = z2;
        hVar.t = this.o;
        CatalogConfiguration catalogConfiguration = this.c;
        hVar.s = catalogConfiguration.R();
        hVar.c = catalogConfiguration.v();
        hVar.l = z;
        hVar.m = z3;
        hVar.u = gzsVar;
        hVar.q = z4;
        hVar.w = catalogConfiguration.y();
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        return f.a(hVar, recyclerPaginatedView);
    }

    public void clear() {
        this.h.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r4.getRecyclerView().canScrollHorizontally(1) == false) goto L12;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        final RecyclerPaginatedView l = l();
        final boolean z = (l == null || l.getRecyclerView().canScrollVertically(-1) || l.getRecyclerView().canScrollHorizontally(-1)) ? false : true;
        ListDataSet<UIBlock> listDataSet = this.h;
        listDataSet.d.clear();
        listDataSet.d.addAll(list2);
        dVar.b(k());
        if (l != null) {
            qro0.c(new gzs() { // from class: xsna.o1a
                @Override // xsna.gzs
                public final Object invoke() {
                    RecyclerPaginatedView.this.getRecyclerView().requestLayout();
                    if (z) {
                        this.s();
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.wca
    public final void g(int i, int i2) {
        RecyclerView recyclerView;
        RecyclerPaginatedView l = l();
        RecyclerView.o layoutManager = (l == null || (recyclerView = l.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.K(i, i2);
    }

    public lca j() {
        CatalogBasePaginatedListVh catalogBasePaginatedListVh;
        p1a p1aVar;
        if (this.f) {
            p1aVar = new p1a(this, CatalogBasePaginatedListVh.class, "scrollToTopStrategy", "getScrollToTopStrategy()Lcom/vk/catalog2/common/ui/holders/api/CatalogScrollToTopStrategy;", 0);
            catalogBasePaginatedListVh = this;
        } else {
            catalogBasePaginatedListVh = this;
            p1aVar = null;
        }
        return new lca(catalogBasePaginatedListVh.b, catalogBasePaginatedListVh.c, catalogBasePaginatedListVh.h, catalogBasePaginatedListVh.e, p1aVar);
    }

    public abstract lca k();

    public final RecyclerPaginatedView l() {
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null || recyclerPaginatedView == null) {
            return null;
        }
        return recyclerPaginatedView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final androidx.lifecycle.m m() {
        return (androidx.lifecycle.m) this.k.getValue();
    }

    public void o(RecyclerPaginatedView recyclerPaginatedView) {
        this.n = recyclerPaginatedView;
        recyclerPaginatedView.addOnAttachStateChangeListener(this.o);
    }

    @Override // xsna.g380
    public void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        new s350(recyclerView, null, 6);
        List<tca> a2 = k5a.a(recyclerView);
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tca) it.next()).l);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof g380) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((g380) it3.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onPause() {
        m().c(Lifecycle.Event.ON_PAUSE);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onResume() {
        m().c(Lifecycle.Event.ON_RESUME);
    }

    public void p(UIBlockList uIBlockList) {
        RecyclerView recyclerView;
        RecyclerPaginatedView l = l();
        if (l != null && (recyclerView = l.getRecyclerView()) != null) {
            bwt0.Q(recyclerView, R.id.catalog_ui_test_list, uIBlockList.b);
        }
        o0 B = this.c.B(uIBlockList.d);
        if (B != null) {
            o0 o0Var = this.g;
            if (o0Var != null) {
                o0Var.attachToRecyclerView(null);
            }
            RecyclerPaginatedView l2 = l();
            B.attachToRecyclerView(l2 != null ? l2.getRecyclerView() : null);
            this.g = B;
        }
        this.h.setItems(uIBlockList.y);
    }

    @Override // xsna.rda
    public void s() {
        RecyclerView recyclerView;
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // xsna.rda
    public void t() {
        s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final qda td() {
        return this.m;
    }

    @Override // xsna.rda
    public final void x(int i) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.e0 findViewHolderForAdapterPosition;
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        int v0 = bwt0.v0(recyclerView);
        RecyclerPaginatedView l2 = l();
        View view = (l2 == null || (recyclerView3 = l2.getRecyclerView()) == null || (findViewHolderForAdapterPosition = recyclerView3.findViewHolderForAdapterPosition(i)) == null) ? null : findViewHolderForAdapterPosition.itemView;
        float f = 2;
        float v02 = (((view != null ? bwt0.v0(view) : 0) / f) + (view != null ? view.getLeft() : 0)) - (v0 / f);
        RecyclerPaginatedView l3 = l();
        if (l3 == null || (recyclerView2 = l3.getRecyclerView()) == null) {
            return;
        }
        recyclerView2.smoothScrollBy((int) v02, 0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public void Cm(Integer num) {
    }

    @Override // xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
    }
}
