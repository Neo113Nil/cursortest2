package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.r;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.util.CatalogOnOutsideTouchState;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bwt0;
import xsna.c5g;
import xsna.ee8;
import xsna.epx;
import xsna.gqh0;
import xsna.hbt0;
import xsna.hda;
import xsna.ib80;
import xsna.izs;
import xsna.j5g;
import xsna.k5a;
import xsna.lca;
import xsna.nba;
import xsna.nca;
import xsna.ow90;
import xsna.ozf0;
import xsna.qoy;
import xsna.qte;
import xsna.s3q0;
import xsna.tba;
import xsna.tca;
import xsna.tnk;
import xsna.to2;
import xsna.u4a;
import xsna.u6b0;
import xsna.uba;
import xsna.v6b0;
import xsna.vha;
import xsna.w6b0;
import xsna.wci;
import xsna.wia;
import xsna.wni;
import xsna.y5b0;
import xsna.y7a;
import xsna.z3v;

/* compiled from: VerticalListVh.kt */
/* loaded from: classes16.dex */
public class VerticalListVh extends CatalogBasePaginatedListVh implements nba {
    public boolean A;
    public MobileOfficialAppsCoreNavStat$EventScreen B;
    public w6b0<lca> C;
    public u6b0<lca> D;
    public v6b0<lca> E;
    public final ScrollScreenType F;
    public final tba<hda> p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final vha t;
    public final a u;
    public final y7a v;
    public hbt0 w;
    public final ib80 x;
    public final Handler y;
    public final to2 z;

    /* compiled from: VerticalListVh.kt */
    public static final class a {
        public final boolean a;
        public final RecyclerView.t b;
        public final boolean c;
        public final izs<View, s3q0> d;
        public final CatalogConfiguration.AutoPlayEntryPoint e;

        public a() {
            this(null, null, null, 63);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 961, 31, this.c);
            izs<View, s3q0> izsVar = this.d;
            int hashCode = (b + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
            CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint = this.e;
            return hashCode + (autoPlayEntryPoint != null ? autoPlayEntryPoint.hashCode() : 0);
        }

        public final String toString() {
            return "ExtraParameters(isRecycleOnDetachEnabled=" + this.a + ", hideKeyboardScrollListener=" + this.b + ", recyclerPool=null, isTransitiveScrollToTopStrategy=" + this.c + ", onDataBinded=" + this.d + ", autoPlayEntryPoint=" + this.e + ')';
        }

        public a(z3v z3vVar, ee8 ee8Var, CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint, int i) {
            boolean z = (i & 1) != 0;
            z3vVar = (i & 2) != 0 ? new z3v(true) : z3vVar;
            boolean z2 = (i & 8) != 0;
            ee8Var = (i & 16) != 0 ? null : ee8Var;
            autoPlayEntryPoint = (i & 32) != 0 ? null : autoPlayEntryPoint;
            this.a = z;
            this.b = z3vVar;
            this.c = z2;
            this.d = ee8Var;
            this.e = autoPlayEntryPoint;
        }
    }

    /* compiled from: VerticalListVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ResumableViewHolder, s3q0> {
        public static final b b = new b(1, ResumableViewHolder.class, X3.i.t0, "onPause()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(ResumableViewHolder resumableViewHolder) {
            resumableViewHolder.onPause();
            return s3q0.a;
        }
    }

    /* compiled from: VerticalListVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ResumableViewHolder, s3q0> {
        public static final c b = new c(1, ResumableViewHolder.class, X3.i.u0, "onResume()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(ResumableViewHolder resumableViewHolder) {
            resumableViewHolder.onResume();
            return s3q0.a;
        }
    }

    public /* synthetic */ VerticalListVh(CatalogConfiguration catalogConfiguration, c.h hVar, tba tbaVar, u4a u4aVar, wia wiaVar, boolean z, int i, a aVar, int i2) {
        this(catalogConfiguration, hVar, tbaVar, u4aVar, (i2 & 16) != 0 ? null : wiaVar, (i2 & 32) != 0 ? true : z, (i2 & 64) == 0, (i2 & 128) != 0 ? R.layout.catalog_list_vertical : i, catalogConfiguration.A(CatalogConfiguration$Companion$ContainerType.VERTICAL, u4aVar), (i2 & 512) != 0 ? new a(null, null, null, 63) : aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void Cm(Integer num) {
        RecyclerPaginatedView l = l();
        if (l != null) {
            l.w.a(num);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<tca> a2;
        this.x.n();
        this.p.d(this);
        RecyclerPaginatedView l = l();
        if (l != null && (recyclerView2 = l.getRecyclerView()) != null && (a2 = k5a.a(recyclerView2)) != null) {
            List<tca> list = a2;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((tca) it.next()).l);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((CatalogViewHolder) it2.next()).L();
            }
        }
        hbt0 hbt0Var = this.w;
        if (hbt0Var != null) {
            RecyclerPaginatedView l2 = l();
            if (l2 != null && (recyclerView = l2.getRecyclerView()) != null) {
                recyclerView.removeOnScrollListener(hbt0Var);
            }
            hbt0Var.u();
            this.w = null;
        }
        this.t.q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public void N5(UIBlock uIBlock) {
        super.N5(uIBlock);
        this.t.r(this.h.d);
        this.y.postDelayed(this.z, 300L);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        RecyclerView recyclerView;
        super.N6(uIBlock);
        izs<View, s3q0> izsVar = this.u.d;
        if (izsVar != null) {
            RecyclerPaginatedView l = l();
            izsVar.invoke(l != null ? l.getRecyclerView() : null);
        }
        RecyclerPaginatedView l2 = l();
        if (l2 != null && (recyclerView = l2.getRecyclerView()) != null) {
            bwt0.Q(recyclerView, R.id.catalog_ui_test_list, "friends");
        }
        this.t.r(this.h.d);
    }

    @Override // xsna.nba
    public final void c(CatalogOnOutsideTouchState catalogOnOutsideTouchState) {
        if (catalogOnOutsideTouchState != CatalogOnOutsideTouchState.IDLE) {
            this.x.n();
        } else {
            this.y.postDelayed(this.z, 300L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void clear() {
        super.clear();
        ListDataSet.ArrayListImpl<UIBlock> arrayListImpl = this.h.d;
        vha vhaVar = this.t;
        vhaVar.r(arrayListImpl);
        vhaVar.q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        super.dj(dVar, list, list2, uIBlockList);
        this.t.r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final List<ozf0> gi() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.v.q());
        arrayList.addAll(j5g.O0(this.i.l));
        return arrayList;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final lca k() {
        return this.i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.s, viewGroup, false);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.paginated_list);
        o(recyclerPaginatedView);
        Context context = layoutInflater.getContext();
        a aVar = this.u;
        CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint = aVar.e;
        CatalogConfiguration catalogConfiguration = this.c;
        hbt0 hbt0Var = new hbt0(context, this.i, m(), catalogConfiguration.M(autoPlayEntryPoint), null, 131056);
        lca lcaVar = this.i;
        lcaVar.n = hbt0Var;
        this.w = hbt0Var;
        q(recyclerPaginatedView);
        recyclerPaginatedView.getRecyclerView().setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        u4a u4aVar = this.e;
        recyclerView.setRecycledViewPool(u4aVar.b.g.getValue());
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new nca(this.r));
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(this.w);
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(aVar.b);
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(this.x);
        ScrollScreenType scrollScreenType = this.F;
        if (scrollScreenType != null) {
            ow90 ow90Var = ow90.a;
            ow90.c(scrollScreenType, recyclerPaginatedView.getRecyclerView());
        }
        recyclerPaginatedView.getRecyclerView().addItemDecoration(catalogConfiguration.F(CatalogConfiguration$Companion$ContainerType.VERTICAL, u4aVar));
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.l = aVar.a;
        }
        recyclerPaginatedView.o = true;
        recyclerPaginatedView.setSwipeRefreshEnabled(this.q);
        recyclerPaginatedView.setAdapter(lcaVar);
        this.t.s(recyclerPaginatedView.getRecyclerView());
        if (recyclerPaginatedView instanceof CatalogRecyclerPaginatedView) {
            ((CatalogRecyclerPaginatedView) recyclerPaginatedView).setUiTrackingScreenProvider(this);
        }
        r rVar = new r(this.v);
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            rVar.l(recyclerView2);
        }
        lcaVar.j = rVar;
        RecyclerView recyclerView3 = recyclerPaginatedView.getRecyclerView();
        u4a.a aVar2 = u4aVar.b;
        u4a.a aVar3 = u4aVar.b;
        this.C = new w6b0<>(recyclerView3, aVar2.i, lcaVar, new wni(11));
        this.D = new u6b0<>(recyclerPaginatedView.getRecyclerView(), aVar3.i, lcaVar, new wci(5));
        this.E = new v6b0<>(recyclerPaginatedView.getRecyclerView(), aVar3.i, lcaVar, new qte(9));
        this.p.b(this);
        w6b0<lca> w6b0Var = this.C;
        if (w6b0Var == null) {
            w6b0Var = null;
        }
        u6b0<lca> u6b0Var = this.D;
        if (u6b0Var == null) {
            u6b0Var = null;
        }
        v6b0<lca> v6b0Var = this.E;
        inflate.addOnAttachStateChangeListener(new y5b0(w6b0Var, u6b0Var, v6b0Var != null ? v6b0Var : null));
        return inflate;
    }

    @Override // xsna.eca
    public final void n(EditorMode editorMode) {
        boolean z = false;
        boolean z2 = editorMode == EditorMode.ENTER_EDITOR_MODE;
        this.i.n(editorMode);
        RecyclerPaginatedView l = l();
        if (l != null) {
            if (!z2 && this.q) {
                z = true;
            }
            l.setSwipeRefreshEnabled(z);
        }
        this.v.g = z2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.x.n();
        if (this.A) {
            this.y.postDelayed(this.z, 300L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        super.onPause();
        this.A = false;
        this.x.n();
        vha vhaVar = this.t;
        vhaVar.t(false);
        vhaVar.q();
        this.p.l();
        r(b.b);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onResume() {
        super.onResume();
        this.A = true;
        this.y.postDelayed(this.z, 300L);
        this.p.n();
        vha vhaVar = this.t;
        vhaVar.t(true);
        vhaVar.r(this.h.d);
        r(c.b);
    }

    public void q(AbstractPaginatedView abstractPaginatedView) {
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, abstractPaginatedView);
        dVar.f = 1;
        dVar.a();
    }

    public final void r(izs<? super ResumableViewHolder, s3q0> izsVar) {
        RecyclerView recyclerView;
        List<tca> a2;
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null || (a2 = k5a.a(recyclerView)) == null) {
            return;
        }
        List<tca> list = a2;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tca) it.next()).l);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ResumableViewHolder) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            izsVar.invoke(it2.next());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void um() {
        this.v.i.clear();
        this.i.l.clear();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        if (mobileOfficialAppsCoreNavStat$EventScreen != MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
            this.B = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        uiTrackingScreen.a = this.B;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, this.p.f(), null, 46, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerticalListVh(CatalogConfiguration catalogConfiguration, c.h hVar, tba<hda> tbaVar, u4a u4aVar, wia wiaVar, boolean z, boolean z2, int i, vha vhaVar, a aVar) {
        super(wiaVar, catalogConfiguration, hVar, u4aVar, aVar.c);
        tnk tnkVar;
        this.p = tbaVar;
        this.q = z;
        this.r = z2;
        this.s = i;
        this.t = vhaVar;
        this.u = aVar;
        this.v = catalogConfiguration.z(this.i, CatalogConfiguration$Companion$ContainerType.VERTICAL);
        u4a.a aVar2 = u4aVar.b;
        this.x = new ib80(aVar2.r, aVar2.e, aVar2.E);
        this.y = new Handler(Looper.getMainLooper());
        this.z = new to2(this, 13);
        this.B = MobileOfficialAppsCoreNavStat$EventScreen.CATALOG;
        this.F = aVar2.k;
        hVar.r = new gqh0(this, 12);
        if (tbaVar instanceof tnk) {
            tnkVar = (tnk) tbaVar;
        } else if (!(tbaVar instanceof uba) || (tnkVar = ((uba) tbaVar).i) == null) {
            tnkVar = null;
        }
        if (tnkVar != null) {
            this.i.m = tnkVar;
        }
    }
}
