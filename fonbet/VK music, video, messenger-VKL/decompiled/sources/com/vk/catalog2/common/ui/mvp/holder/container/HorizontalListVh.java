package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.r;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bai0;
import xsna.btf0;
import xsna.bwt0;
import xsna.dca;
import xsna.dmi;
import xsna.duu;
import xsna.epx;
import xsna.g5g;
import xsna.hbt0;
import xsna.j5g;
import xsna.jpf;
import xsna.kfv;
import xsna.lca;
import xsna.ldi;
import xsna.nca;
import xsna.oda;
import xsna.ozf0;
import xsna.pca;
import xsna.pev;
import xsna.phj0;
import xsna.u4a;
import xsna.u6b0;
import xsna.vha;
import xsna.w6b0;
import xsna.wia;
import xsna.xtw;
import xsna.y1a;
import xsna.y5b0;
import xsna.y7a;
import xsna.ztw;

/* compiled from: HorizontalListVh.kt */
/* loaded from: classes16.dex */
public class HorizontalListVh extends CatalogBasePaginatedListVh {
    public final y1a p;
    public final vha q;
    public final y7a r;
    public final r s;
    public phj0 t;
    public u6b0<lca> u;
    public hbt0 v;

    /* compiled from: HorizontalListVh.kt */
    public static final class a extends RecyclerView.t {
        public final y1a b;

        public a(y1a y1aVar) {
            this.b = y1aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int intValue;
            View findViewByPosition;
            if (i != 0) {
                return;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int v = linearLayoutManager.v();
            Integer valueOf = v != -1 ? Integer.valueOf(v) : null;
            if (valueOf == null || (findViewByPosition = linearLayoutManager.findViewByPosition((intValue = valueOf.intValue()))) == null) {
                return;
            }
            int x = (int) findViewByPosition.getX();
            y1a y1aVar = this.b;
            UIBlockList uIBlockList = y1aVar.k;
            if (uIBlockList == null) {
                return;
            }
            btf0 btf0Var = new btf0(intValue, x);
            oda<UIBlockList> odaVar = y1aVar.j;
            if (odaVar != null) {
                odaVar.a(uIBlockList, btf0Var);
            }
        }
    }

    /* compiled from: HorizontalListVh.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            HorizontalListVh horizontalListVh = HorizontalListVh.this;
            y1a y1aVar = horizontalListVh.p;
            if (y1aVar.g()) {
                return;
            }
            y1aVar.b(horizontalListVh);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            HorizontalListVh horizontalListVh = HorizontalListVh.this;
            horizontalListVh.p.d(horizontalListVh);
        }
    }

    public HorizontalListVh(CatalogConfiguration catalogConfiguration, c.h hVar, y1a y1aVar, u4a u4aVar, wia wiaVar, vha vhaVar) {
        super(wiaVar, catalogConfiguration, hVar, u4aVar, true);
        this.p = y1aVar;
        this.q = vhaVar;
        y7a z = catalogConfiguration.z(this.i, CatalogConfiguration$Companion$ContainerType.HORIZONTAL);
        this.r = z;
        this.s = new r(z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public void N5(UIBlock uIBlock) {
        super.N5(uIBlock);
        this.q.r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        List list;
        com.vk.lists.c cVar;
        boolean z;
        RecyclerView recyclerView;
        UIBlockActionOpenSection uIBlockActionOpenSection;
        phj0 phj0Var = this.t;
        if (phj0Var != null) {
            if ((uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null) != null) {
                Object k0 = j5g.k0(((UIBlockList) uIBlock).y);
                if (k0 instanceof UIBlockActionOpenSection) {
                    uIBlockActionOpenSection = (UIBlockActionOpenSection) k0;
                    phj0Var.f = uIBlockActionOpenSection;
                    phj0Var.c.setEdgeEffectFactory((uIBlockActionOpenSection == null && uIBlockActionOpenSection.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS) ? phj0Var.e : phj0Var.d);
                }
            }
            uIBlockActionOpenSection = null;
            phj0Var.f = uIBlockActionOpenSection;
            phj0Var.c.setEdgeEffectFactory((uIBlockActionOpenSection == null && uIBlockActionOpenSection.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS) ? phj0Var.e : phj0Var.d);
        }
        if (uIBlock instanceof UIBlockList) {
            y1a y1aVar = this.p;
            if (!y1aVar.g()) {
                y1aVar.b(this);
            }
            RecyclerPaginatedView recyclerPaginatedView = this.n;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
            }
            if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                bwt0.Q(recyclerView, R.id.catalog_ui_test_list, uIBlock.b);
            }
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            UIBlockList uIBlockList2 = y1aVar.k;
            boolean z2 = false;
            if (epx.f(uIBlockList2 != null ? uIBlockList2.b : null, uIBlockList.b)) {
                UIBlockList uIBlockList3 = y1aVar.k;
                if (uIBlockList3 == null || (list = uIBlockList3.y) == null) {
                    list = EmptyList.b;
                }
                y1aVar.q(list, uIBlockList.y, uIBlockList);
            } else {
                y1aVar.e();
                y1aVar.k = uIBlockList;
                com.vk.lists.c cVar2 = y1aVar.d;
                if (cVar2 != null) {
                    cVar2.v();
                }
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = y1aVar.c;
                if (catalogPaginatedListViewHolder != null) {
                    String str = uIBlockList.A;
                    if (str != null) {
                        int i = y1a.a.$EnumSwitchMapping$0[uIBlockList.d.ordinal()];
                        if (i != 1 && i != 2 && i != 3) {
                            z = true;
                            cVar = catalogPaginatedListViewHolder.Wi(str, false, z, uIBlockList, false, null, false);
                        }
                    }
                    z = false;
                    cVar = catalogPaginatedListViewHolder.Wi(str, false, z, uIBlockList, false, null, false);
                } else {
                    cVar = null;
                }
                y1aVar.d = cVar;
                z2 = true;
            }
            oda<UIBlockList> odaVar = y1aVar.j;
            btf0 b2 = odaVar != null ? odaVar.b(uIBlockList) : null;
            CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = y1aVar.c;
            if (catalogPaginatedListViewHolder2 != null) {
                if (epx.f(b2, btf0.c)) {
                    catalogPaginatedListViewHolder2.s();
                } else if (b2 != null) {
                    catalogPaginatedListViewHolder2.g(b2.a, b2.b);
                }
            }
            if (z2) {
                this.q.q();
                if (this.m.a(uIBlock, true)) {
                    s();
                }
            }
            v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        xtw xtwVar;
        super.dj(dVar, list, list2, uIBlockList);
        boolean z = true;
        if (list.size() == list2.size()) {
            Iterable W0 = j5g.W0(list);
            if (!(W0 instanceof Collection) || !((Collection) W0).isEmpty()) {
                Iterator it = W0.iterator();
                do {
                    ztw ztwVar = (ztw) it;
                    if (ztwVar.b.hasNext()) {
                        xtwVar = (xtw) ztwVar.next();
                    }
                } while (list2.get(xtwVar.a).Bb((UIBlock) xtwVar.b));
            }
            z = false;
            break;
        }
        if (this.m.a(uIBlockList, z)) {
            s();
        }
        this.q.r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final List<ozf0> gi() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.r.q());
        arrayList.addAll(j5g.O0(this.i.l));
        return arrayList;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final lca k() {
        return this.i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kfv kfvVar = new kfv(layoutInflater.getContext(), null);
        kfvVar.i = kfv.O;
        kfvVar.j = kfv.N;
        kfvVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        o(kfvVar);
        q(kfvVar);
        RecyclerView recyclerView = kfvVar.getRecyclerView();
        CatalogConfiguration catalogConfiguration = this.c;
        u4a u4aVar = this.e;
        this.t = new phj0(catalogConfiguration, u4aVar, recyclerView);
        kfvVar.getRecyclerView().setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        RecyclerView recyclerView2 = kfvVar.getRecyclerView();
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        recyclerView2.setRecycledViewPool(aVar.g.getValue());
        byte b2 = 0;
        kfvVar.getRecyclerView().setItemAnimator(new nca(false));
        kfvVar.getRecyclerView().setHasFixedSize(true);
        RecyclerView recyclerView3 = kfvVar.getRecyclerView();
        RecyclerView.n F = catalogConfiguration.F(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar);
        if (F instanceof pca) {
            ((pca) F).c = new jpf(this, 26);
        }
        recyclerView3.addItemDecoration(F);
        RecyclerView.o layoutManager = kfvVar.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.l = catalogConfiguration.L();
        }
        kfvVar.setSwipeRefreshEnabled(false);
        kfvVar.getRecyclerView().setNestedScrollingEnabled(false);
        lca lcaVar = this.i;
        kfvVar.setAdapter(lcaVar);
        RecyclerView recyclerView4 = kfvVar.getRecyclerView();
        boolean isAttachedToWindow = kfvVar.isAttachedToWindow();
        r rVar = this.s;
        if (isAttachedToWindow) {
            lcaVar.j = rVar;
            rVar.l(recyclerView4);
        } else {
            kfvVar.addOnAttachStateChangeListener(new pev(kfvVar, lcaVar, rVar, recyclerView4));
        }
        y1a y1aVar = this.p;
        y1aVar.b(this);
        this.q.s(kfvVar.getRecyclerView());
        kfvVar.getRecyclerView().addOnScrollListener(new a(y1aVar));
        this.u = new u6b0<>(kfvVar.getRecyclerView(), aVar2.i, lcaVar, new dmi((byte) 0, 3));
        w6b0 w6b0Var = new w6b0(kfvVar.getRecyclerView(), aVar2.i, lcaVar, new ldi(b2, 3));
        u6b0<lca> u6b0Var = this.u;
        kfvVar.addOnAttachStateChangeListener(new y5b0(u6b0Var != null ? u6b0Var : null, w6b0Var));
        kfvVar.addOnAttachStateChangeListener(new dca(this, y1aVar));
        kfvVar.addOnAttachStateChangeListener(new b());
        return kfvVar;
    }

    @Override // xsna.eca
    public final void n(EditorMode editorMode) {
        this.i.n(editorMode);
        this.r.g = editorMode == EditorMode.ENTER_EDITOR_MODE;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.g380
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
        RecyclerPaginatedView recyclerPaginatedView2 = this.n;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        recyclerPaginatedView2.getRecyclerView().setLayoutManager(null);
        RecyclerPaginatedView recyclerPaginatedView3 = this.n;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        recyclerPaginatedView3.getRecyclerView().setLayoutManager(layoutManager);
        RecyclerPaginatedView recyclerPaginatedView4 = this.n;
        (recyclerPaginatedView4 != null ? recyclerPaginatedView4 : null).getRecyclerView().getRecycledViewPool().clear();
        v();
        r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        super.onPause();
        y1a y1aVar = this.p;
        y1aVar.getClass();
        y1aVar.d(this);
        this.q.q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onResume() {
        super.onResume();
        y1a y1aVar = this.p;
        if (!y1aVar.g()) {
            y1aVar.b(this);
        }
        y1aVar.getClass();
        this.q.r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void p(UIBlockList uIBlockList) {
        super.p(uIBlockList);
        r(uIBlockList.y);
    }

    public void q(AbstractPaginatedView abstractPaginatedView) {
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, abstractPaginatedView);
        dVar.f = 0;
        dVar.a();
    }

    public final void r(List<? extends UIBlock> list) {
        RecyclerView recyclerView;
        if (this.c.P()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof bai0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((bai0) it.next()).p()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            RecyclerPaginatedView recyclerPaginatedView = this.n;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
            }
            if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
                return;
            }
            recyclerView.post(new duu(this, i, 1));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void um() {
        this.r.i.clear();
        this.i.l.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if ((r1 != null ? r1.d : null) == com.vk.catalog2.common.dto.api.CatalogViewType.SEARCH_FLOOR_CLIPS) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        List list;
        UIBlockList uIBlockList = this.p.k;
        if (uIBlockList == null || (list = uIBlockList.y) == null) {
            return;
        }
        UIBlock uIBlock = (UIBlock) j5g.a0(list);
        if ((uIBlock != null ? uIBlock.d : null) != CatalogViewType.FLOOR_CLIPS) {
            UIBlock uIBlock2 = (UIBlock) j5g.a0(list);
        }
        VideoItemListSettings videoItemListSettings = VideoItemListSettings.i;
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        int a2 = VideoItemListSettings.a.a((recyclerPaginatedView != null ? recyclerPaginatedView : null).getContext());
        if (a2 < 6) {
            if (a2 * 2 >= 6) {
                ArrayList U0 = j5g.U0(list, 6, 6, true);
                List arrayList = new ArrayList();
                Iterator it = U0.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    if (list2.size() >= 6) {
                        list2 = j5g.H0(list2, a2);
                    }
                    g5g.y(list2, arrayList);
                }
                list = arrayList;
            } else {
                list = j5g.H0(list, (list.size() / a2) * a2);
            }
        }
        lca lcaVar = this.i;
        lcaVar.clear();
        lcaVar.setItems(list);
    }

    public /* synthetic */ HorizontalListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, c.h hVar, y1a y1aVar, u4a u4aVar) {
        this(aVar, hVar, y1aVar, u4aVar, null, aVar.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
    }
}
