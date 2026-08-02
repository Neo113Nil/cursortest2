package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LoopingLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.y;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ayn0;
import xsna.bwt0;
import xsna.cca;
import xsna.ef90;
import xsna.epx;
import xsna.g5g;
import xsna.if7;
import xsna.k6k;
import xsna.lca;
import xsna.nca;
import xsna.nj;
import xsna.nq2;
import xsna.nyp0;
import xsna.o63;
import xsna.ozh;
import xsna.qda;
import xsna.qev;
import xsna.qj80;
import xsna.qzg;
import xsna.rev;
import xsna.u4a;
import xsna.v1d0;
import xsna.vha;
import xsna.w6b0;
import xsna.x2e;
import xsna.y5b0;

/* compiled from: HorizontalLoopVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalLoopVh implements CatalogListViewHolder {
    public final com.vk.catalog2.common.ui.mvp.configuration.a b;
    public final u4a c;
    public final long d;
    public final nyp0 e;
    public final cca f;
    public final vha g;
    public qda h;
    public final lca i;
    public RecyclerView j;
    public LoopingLinearLayoutManager k;
    public UIBlockList l;
    public final y m;

    /* compiled from: HorizontalLoopVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            HorizontalLoopVh.this.m.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            y yVar = HorizontalLoopVh.this.m;
            yVar.d.removeCallbacks(yVar.g);
        }
    }

    public HorizontalLoopVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, u4a u4aVar, int i) {
        long j = (i & 16) != 0 ? 4000L : 0L;
        this.b = aVar;
        this.c = u4aVar;
        this.d = j;
        nyp0 nyp0Var = new nyp0();
        this.e = nyp0Var;
        this.f = new cca(new qzg(this, 23), aVar, new ozh(this, 22), new x2e(this, 20));
        this.g = aVar.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar);
        this.h = new qev();
        this.i = new lca(null, aVar, nyp0Var, u4aVar, new k6k(this, 20));
        this.m = new y(j);
    }

    public static void a(UIBlockList uIBlockList) {
        int size = uIBlockList.y.size();
        if (1 > size || size >= 8) {
            return;
        }
        int i = ((8 / size) + 1) * size;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < i; i2++) {
            UIBlock zb = uIBlockList.y.get(i2 % size).zb();
            String Fb = zb.Fb();
            Object obj = linkedHashMap.get(Fb);
            if (obj == null) {
                obj = -1;
                linkedHashMap.put(Fb, obj);
            }
            int intValue = ((Number) obj).intValue() + 1;
            linkedHashMap.put(zb.Fb(), Integer.valueOf(intValue));
            uIBlockList.y.add(new UIBlockCustomItemUniqueIdWrapper("custom_id_" + zb.Fb() + '_' + intValue, zb));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        List list;
        String str = uIBlock.b;
        if (uIBlock instanceof UIBlockList) {
            RecyclerView recyclerView = this.j;
            if (recyclerView == null) {
                recyclerView = null;
            }
            bwt0.Q(recyclerView, R.id.catalog_ui_test_list, str);
            UIBlockList zb = ((UIBlockList) uIBlock).zb();
            UIBlockList uIBlockList = this.l;
            boolean f = epx.f(uIBlockList != null ? uIBlockList.b : null, str);
            vha vhaVar = this.g;
            nyp0 nyp0Var = this.e;
            if (f) {
                UIBlockList uIBlockList2 = this.l;
                if (uIBlockList2 == null || (list = uIBlockList2.y) == null) {
                    list = EmptyList.b;
                }
                g5g.D(zb.y, true, new nj(25));
                a(zb);
                m.d a2 = m.a(new if7(list, zb.y), true);
                nyp0Var.d.clear();
                nyp0Var.d.addAll(zb.y);
                a2.b(this.i);
                RecyclerView recyclerView2 = this.j;
                RecyclerView recyclerView3 = recyclerView2 != null ? recyclerView2 : null;
                qj80.a(recyclerView3, new rev(0, recyclerView3, this));
            } else {
                a(zb);
                nyp0Var.setItems(zb.y);
                vhaVar.q();
            }
            vhaVar.r(nyp0Var.d);
            if (this.h.a(uIBlock, true)) {
                s();
            }
            this.l = zb;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final ayn0 Pa() {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return new ayn0(recyclerView, null, 30);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Pl(qda qdaVar) {
        this.h = qdaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup != null) {
            viewGroup.getContext();
        }
        this.k = new LoopingLinearLayoutManager();
        View inflate = layoutInflater.inflate(R.layout.catalog_looper, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.paginated_list);
        cca ccaVar = this.f;
        recyclerView.addOnAttachStateChangeListener(ccaVar);
        recyclerView.setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        LoopingLinearLayoutManager loopingLinearLayoutManager = this.k;
        if (loopingLinearLayoutManager == null) {
            loopingLinearLayoutManager = null;
        }
        recyclerView.setLayoutManager(loopingLinearLayoutManager);
        recyclerView.setItemAnimator(new nca(true));
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType = CatalogConfiguration$Companion$ContainerType.HORIZONTAL;
        com.vk.catalog2.common.ui.mvp.configuration.a aVar = this.b;
        u4a u4aVar = this.c;
        recyclerView.addItemDecoration(aVar.F(catalogConfiguration$Companion$ContainerType, u4aVar));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        lca lcaVar = this.i;
        recyclerView.setAdapter(lcaVar);
        this.g.s(recyclerView);
        this.m.attachToRecyclerView(recyclerView);
        recyclerView.post(new o63(recyclerView, 5));
        recyclerView.addOnScrollListener(new ef90(new v1d0(aVar.R(), ccaVar)));
        w6b0 w6b0Var = new w6b0(recyclerView, u4aVar.b.i, lcaVar, new nq2((byte) 0, 5));
        this.j = recyclerView;
        inflate.addOnAttachStateChangeListener(new y5b0(w6b0Var));
        if (this.d > 0) {
            inflate.addOnAttachStateChangeListener(new a());
        }
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            recyclerView = null;
        }
        qj80.a(recyclerView, new rev(0, recyclerView, this));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.g.q();
        y yVar = this.m;
        yVar.d.removeCallbacks(yVar.g);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.g.r(this.e.d);
        this.m.h();
    }

    @Override // xsna.rda
    public final void s() {
        RecyclerView recyclerView = this.j;
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
