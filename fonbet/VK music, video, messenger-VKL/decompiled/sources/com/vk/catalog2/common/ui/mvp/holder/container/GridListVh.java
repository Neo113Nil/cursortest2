package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ayn0;
import xsna.bwt0;
import xsna.cca;
import xsna.dof;
import xsna.ef90;
import xsna.epx;
import xsna.if7;
import xsna.lca;
import xsna.m1k;
import xsna.mf40;
import xsna.nca;
import xsna.noi;
import xsna.qda;
import xsna.r5i;
import xsna.u4a;
import xsna.v1d0;
import xsna.vha;
import xsna.w6b0;
import xsna.y5b0;
import xsna.zkh;

/* compiled from: GridListVh.kt */
/* loaded from: classes16.dex */
public final class GridListVh implements CatalogListViewHolder {
    public final com.vk.catalog2.common.ui.mvp.configuration.a b;
    public final int c;
    public final u4a d;
    public final int e;
    public final RecyclerView.n f;
    public final boolean g;
    public final a h;
    public final ListDataSet<UIBlock> i;
    public final cca j;
    public final vha k;
    public qda l;
    public final lca m;
    public RecyclerView n;
    public RecyclerView.o o;
    public UIBlockList p;

    /* compiled from: GridListVh.kt */
    public interface a {
        int a(int i, UIBlock uIBlock);
    }

    /* compiled from: GridListVh.kt */
    public static final class b extends GridLayoutManager.c {
        public final /* synthetic */ a e;
        public final /* synthetic */ GridLayoutManager f;

        public b(a aVar, GridLayoutManager gridLayoutManager) {
            this.e = aVar;
            this.f = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            UIBlock uIBlock = (UIBlock) GridListVh.this.m.c.c(i);
            return this.e.a(this.f.s, uIBlock);
        }
    }

    public GridListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, int i, u4a u4aVar, int i2, mf40.c cVar, a aVar2, int i3) {
        i2 = (i3 & 16) != 0 ? R.layout.catalog_slider_item_view : i2;
        cVar = (i3 & 32) != 0 ? null : cVar;
        boolean z = (i3 & 64) == 0;
        aVar2 = (i3 & 128) != 0 ? null : aVar2;
        this.b = aVar;
        this.c = i;
        this.d = u4aVar;
        this.e = i2;
        this.f = cVar;
        this.g = z;
        this.h = aVar2;
        ListDataSet<UIBlock> listDataSet = new ListDataSet<>();
        this.i = listDataSet;
        this.j = new cca(new dof(this, 28), aVar, new zkh(this, 20), new m1k(this, 13));
        this.k = aVar.A(CatalogConfiguration$Companion$ContainerType.GRID, u4aVar);
        this.l = new com.vk.catalog2.common.ui.mvp.holder.container.a();
        this.m = new lca(null, aVar, listDataSet, u4aVar, new r5i(this, 19));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        List list;
        String str = uIBlock.b;
        if (uIBlock instanceof UIBlockList) {
            RecyclerView recyclerView = this.n;
            if (recyclerView == null) {
                recyclerView = null;
            }
            bwt0.Q(recyclerView, R.id.catalog_ui_test_list, str);
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            int size = uIBlockList.y.size();
            int i = this.c;
            if (size < i) {
                a(size);
            } else {
                a(i);
            }
            UIBlockList uIBlockList2 = this.p;
            boolean f = epx.f(uIBlockList2 != null ? uIBlockList2.b : null, str);
            vha vhaVar = this.k;
            ListDataSet<UIBlock> listDataSet = this.i;
            if (f) {
                UIBlockList uIBlockList3 = this.p;
                if (uIBlockList3 == null || (list = uIBlockList3.y) == null) {
                    list = EmptyList.b;
                }
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                m.d a2 = m.a(new if7(list, arrayList), true);
                listDataSet.d.clear();
                listDataSet.d.addAll(arrayList);
                a2.b(this.m);
            } else {
                listDataSet.setItems(uIBlockList.y);
                vhaVar.q();
            }
            vhaVar.r(listDataSet.d);
            if (this.l.a(uIBlock, true)) {
                s();
            }
            this.p = uIBlockList;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final ayn0 Pa() {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return this.b.W(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Pl(qda qdaVar) {
        this.l = qdaVar;
    }

    public final void a(int i) {
        if (this.g) {
            RecyclerView.o oVar = this.o;
            ((StaggeredGridLayoutManager) (oVar != null ? oVar : null)).setSpanCount(i);
        } else {
            if (i < 1) {
                return;
            }
            RecyclerView.o oVar2 = this.o;
            ((GridLayoutManager) (oVar2 != null ? oVar2 : null)).setSpanCount(i);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView.o oVar;
        boolean z = this.g;
        int i = this.c;
        byte b2 = 0;
        if (z) {
            oVar = new StaggeredGridLayoutManager(i, 0);
        } else {
            if (viewGroup != null) {
                viewGroup.getContext();
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(i, 0);
            a aVar = this.h;
            oVar = gridLayoutManager;
            if (aVar != null) {
                gridLayoutManager.x = new b(aVar, gridLayoutManager);
                oVar = gridLayoutManager;
            }
        }
        this.o = oVar;
        View inflate = layoutInflater.inflate(this.e, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.paginated_list);
        cca ccaVar = this.j;
        recyclerView.addOnAttachStateChangeListener(ccaVar);
        recyclerView.setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        RecyclerView.o oVar2 = this.o;
        if (oVar2 == null) {
            oVar2 = null;
        }
        recyclerView.setLayoutManager(oVar2);
        recyclerView.setItemAnimator(new nca(true));
        u4a u4aVar = this.d;
        com.vk.catalog2.common.ui.mvp.configuration.a aVar2 = this.b;
        RecyclerView.n nVar = this.f;
        if (nVar == null) {
            nVar = aVar2.F(CatalogConfiguration$Companion$ContainerType.GRID, u4aVar);
        }
        recyclerView.addItemDecoration(nVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        lca lcaVar = this.m;
        recyclerView.setAdapter(lcaVar);
        this.k.s(recyclerView);
        recyclerView.addOnScrollListener(new ef90(new v1d0(aVar2.R(), ccaVar)));
        w6b0 w6b0Var = new w6b0(recyclerView, u4aVar.b.i, lcaVar, new noi(b2, 3));
        this.n = recyclerView;
        inflate.addOnAttachStateChangeListener(new y5b0(w6b0Var));
        return inflate;
    }

    @Override // xsna.rda
    public final void s() {
        RecyclerView recyclerView = this.n;
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

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
