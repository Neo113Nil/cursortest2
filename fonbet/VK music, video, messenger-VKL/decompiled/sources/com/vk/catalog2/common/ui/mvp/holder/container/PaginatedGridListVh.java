package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
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
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
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
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a3a;
import xsna.awt0;
import xsna.c5g;
import xsna.cc5;
import xsna.dca;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.gb80;
import xsna.hb80;
import xsna.hbt0;
import xsna.hda;
import xsna.hrr0;
import xsna.iah0;
import xsna.ib80;
import xsna.izs;
import xsna.j5g;
import xsna.k5a;
import xsna.kea;
import xsna.lb;
import xsna.lca;
import xsna.nba;
import xsna.nca;
import xsna.nh3;
import xsna.nly;
import xsna.ow90;
import xsna.ozf0;
import xsna.pue;
import xsna.rel0;
import xsna.s3q0;
import xsna.sb;
import xsna.si5;
import xsna.tba;
import xsna.tca;
import xsna.tjj0;
import xsna.tnk;
import xsna.u4a;
import xsna.u6b0;
import xsna.uba;
import xsna.v6b0;
import xsna.vex;
import xsna.vha;
import xsna.vou;
import xsna.vuk;
import xsna.w4b;
import xsna.w6b0;
import xsna.wia;
import xsna.wrl;
import xsna.wzs;
import xsna.y5b0;
import xsna.y7a;
import xsna.z3v;

/* compiled from: PaginatedGridListVh.kt */
/* loaded from: classes16.dex */
public final class PaginatedGridListVh extends CatalogBasePaginatedListVh implements a3a, nba {
    public si5 A;
    public final ib80 B;
    public final Handler C;
    public final sb D;
    public final hb80 E;
    public boolean F;
    public w6b0<lca> G;
    public u6b0<lca> H;
    public v6b0<lca> I;
    public final rel0 J;
    public final long K;
    public final hrr0 L;
    public final tba<hda> p;
    public final c q;
    public final d r;
    public final boolean s;
    public final int t;
    public final vha u;
    public final a v;
    public final VideoGrowthComponent w;
    public int x;
    public final y7a y;
    public hbt0 z;

    /* compiled from: PaginatedGridListVh.kt */
    public static final class a {
        public final boolean a;
        public final RecyclerView.t b;
        public final b c;
        public final vou d;
        public final boolean e;

        public a() {
            this(null, null, null, false, 63);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtraParameters(isRecycleOnDetachEnabled=");
            sb.append(this.a);
            sb.append(", hideKeyboardScrollListener=");
            sb.append(this.b);
            sb.append(", viewMargins=");
            sb.append(this.c);
            sb.append(", dialogStackChangedHelperFactory=");
            sb.append(this.d);
            sb.append(", autoPlayEntryPoint=null, ignoreRequestChildRectangleOnScreen=");
            return q0.a(sb, this.e, ')');
        }

        public a(RecyclerView.t tVar, e eVar, vou vouVar, boolean z, int i) {
            tVar = (i & 2) != 0 ? new z3v(true) : tVar;
            eVar = (i & 4) != 0 ? new e(0, 0, 15) : eVar;
            vouVar = (i & 8) != 0 ? new vou() : vouVar;
            z = (i & 32) != 0 ? false : z;
            this.a = true;
            this.b = tVar;
            this.c = eVar;
            this.d = vouVar;
            this.e = z;
        }
    }

    /* compiled from: PaginatedGridListVh.kt */
    public interface b {
        int L();

        int a();

        int b();

        int g0();
    }

    /* compiled from: PaginatedGridListVh.kt */
    public interface c {
        int a(int i, boolean z);
    }

    /* compiled from: PaginatedGridListVh.kt */
    public interface d {
        int a(UIBlock uIBlock, int i, boolean z);
    }

    /* compiled from: PaginatedGridListVh.kt */
    public static final class e implements b {
        public final int a;
        public final int b;

        public e(int i, int i2, int i3) {
            i = (i3 & 1) != 0 ? 0 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            this.a = i;
            this.b = i2;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.b
        public final int L() {
            return 0;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.b
        public final int a() {
            return this.a;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.b
        public final int b() {
            return this.b;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.b
        public final int g0() {
            return 0;
        }
    }

    /* compiled from: PaginatedGridListVh.kt */
    public static final class f extends GridLayoutManager.c {
        public final /* synthetic */ View e;

        public f(View view) {
            this.e = view;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            PaginatedGridListVh paginatedGridListVh = PaginatedGridListVh.this;
            return paginatedGridListVh.r.a((UIBlock) paginatedGridListVh.i.c.c(i), paginatedGridListVh.x, iah0.r(this.e.getContext()));
        }
    }

    /* compiled from: PaginatedGridListVh.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<CatalogListViewHolder, s3q0> {
        public static final g b = new g(1, CatalogListViewHolder.class, X3.i.t0, "onPause()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(CatalogListViewHolder catalogListViewHolder) {
            catalogListViewHolder.onPause();
            return s3q0.a;
        }
    }

    /* compiled from: PaginatedGridListVh.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<CatalogListViewHolder, s3q0> {
        public static final h b = new h(1, CatalogListViewHolder.class, X3.i.u0, "onResume()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(CatalogListViewHolder catalogListViewHolder) {
            catalogListViewHolder.onResume();
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaginatedGridListVh(CatalogConfiguration catalogConfiguration, c.h hVar, tba tbaVar, u4a u4aVar, c cVar, d dVar, wia wiaVar, boolean z, int i, a aVar, VideoGrowthComponent videoGrowthComponent, int i2) {
        super(r4, catalogConfiguration, hVar, u4aVar, true);
        tnk tnkVar;
        tnk tnkVar2 = null;
        wia wiaVar2 = (i2 & 64) != 0 ? null : wiaVar;
        boolean z2 = (i2 & 128) != 0 ? true : z;
        int i3 = (i2 & 256) != 0 ? R.layout.catalog_list_vertical : i;
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType = CatalogConfiguration$Companion$ContainerType.VERTICAL;
        vha A = catalogConfiguration.A(catalogConfiguration$Companion$ContainerType, u4aVar);
        a aVar2 = (i2 & 1024) != 0 ? new a(null, null, null, false, 63) : aVar;
        VideoGrowthComponent videoGrowthComponent2 = (i2 & 2048) != 0 ? null : videoGrowthComponent;
        this.p = tbaVar;
        this.q = cVar;
        this.r = dVar;
        this.s = z2;
        this.t = i3;
        this.u = A;
        this.v = aVar2;
        this.w = videoGrowthComponent2;
        this.x = 1;
        this.y = catalogConfiguration.z(this.i, catalogConfiguration$Companion$ContainerType);
        u4a.a aVar3 = u4aVar.b;
        this.B = new ib80(aVar3.r, aVar3.e, aVar3.E);
        this.C = new Handler(Looper.getMainLooper());
        this.D = new sb(this, 9);
        this.E = new hb80(new nh3(21, this, catalogConfiguration), new vex(this, 16));
        this.J = new rel0(new com.vk.catalog2.common.ui.mvp.holder.container.b(this, catalogConfiguration, u4aVar));
        this.K = SystemClock.elapsedRealtime();
        this.L = new hrr0();
        hVar.r = new nly(this, 22);
        if (tbaVar instanceof tnk) {
            tnkVar2 = (tnk) tbaVar;
        } else if ((tbaVar instanceof uba) && (tnkVar = ((uba) tbaVar).i) != null) {
            tnkVar2 = tnkVar;
        }
        if (tnkVar2 != null) {
            this.i.m = tnkVar2;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void Cm(Integer num) {
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.w.a(num);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<tca> a2;
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        if (recyclerPaginatedView != null && (recyclerView2 = recyclerPaginatedView.getRecyclerView()) != null && (a2 = k5a.a(recyclerView2)) != null) {
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
        this.B.n();
        this.p.d(this);
        hbt0 hbt0Var = this.z;
        if (hbt0Var != null) {
            RecyclerPaginatedView recyclerPaginatedView2 = this.n;
            if (recyclerPaginatedView2 == null) {
                recyclerPaginatedView2 = null;
            }
            if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
                recyclerView.removeOnScrollListener(hbt0Var);
            }
            hbt0Var.u();
            this.z = null;
        }
        si5 si5Var = this.A;
        if (si5Var != null) {
            vuk vukVar = si5Var.a;
            vukVar.b = null;
            vukVar.a.q(vukVar.c);
            MessageQueue queue = Looper.getMainLooper().getQueue();
            ArrayList arrayList2 = si5Var.b;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                queue.removeIdleHandler((MessageQueue.IdleHandler) it3.next());
            }
            arrayList2.clear();
        }
        this.A = null;
        this.u.q();
        RecyclerPaginatedView recyclerPaginatedView3 = this.n;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        hb80 hb80Var = this.E;
        ComposeView composeView = hb80Var.d;
        if (composeView != null && recyclerPaginatedView3 != null) {
            recyclerPaginatedView3.removeView(composeView);
        }
        hb80Var.d = null;
        hb80Var.f = false;
        RecyclerView recyclerView3 = recyclerPaginatedView3 != null ? recyclerPaginatedView3.getRecyclerView() : null;
        gb80 gb80Var = hb80Var.e;
        if (recyclerView3 != null && gb80Var != null) {
            recyclerView3.removeOnScrollListener(gb80Var);
        }
        hb80Var.e = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void N5(UIBlock uIBlock) {
        super.N5(uIBlock);
        this.u.r(this.h.d);
        this.C.postDelayed(this.D, 300L);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        tjj0 tjj0Var;
        this.u.r(this.h.d);
        super.N6(uIBlock);
        this.J.b();
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null || (tjj0Var = this.e.b.T) == null) {
            return;
        }
        RecyclerPaginatedView l = l();
        tjj0Var.a(uIBlockList, l != null ? l.getRecyclerView() : null);
    }

    @Override // xsna.nba
    public final void c(CatalogOnOutsideTouchState catalogOnOutsideTouchState) {
        if (catalogOnOutsideTouchState != CatalogOnOutsideTouchState.IDLE) {
            this.B.n();
        } else {
            this.C.postDelayed(this.D, 300L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void clear() {
        super.clear();
        ListDataSet.ArrayListImpl<UIBlock> arrayListImpl = this.h.d;
        vha vhaVar = this.u;
        vhaVar.r(arrayListImpl);
        vhaVar.q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        super.dj(dVar, list, list2, uIBlockList);
        this.u.r(this.h.d);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final List<ozf0> gi() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.y.q());
        arrayList.addAll(j5g.O0(this.i.l));
        return arrayList;
    }

    @Override // xsna.a3a
    public final void h(UIBlock uIBlock, wzs<? super String, ? super kea, s3q0> wzsVar) {
        tba<hda> tbaVar = this.p;
        if (tbaVar instanceof kea) {
            wzsVar.invoke(uIBlock.b, tbaVar);
        } else {
            N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final lca k() {
        return this.i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        ScrollScreenType valueOf;
        View inflate = layoutInflater.inflate(this.t, viewGroup, false);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.paginated_list);
        o(recyclerPaginatedView);
        Context context = layoutInflater.getContext();
        a aVar = this.v;
        aVar.getClass();
        CatalogConfiguration catalogConfiguration = this.c;
        hbt0 hbt0Var = new hbt0(context, this.i, m(), catalogConfiguration.M(null), aVar.d, 122864);
        lca lcaVar = this.i;
        lcaVar.n = hbt0Var;
        this.z = hbt0Var;
        if (fxc0.B().J().O()) {
            ListDataSet<UIBlock> listDataSet = this.h;
            vuk vukVar = new vuk(listDataSet);
            si5 si5Var = new si5();
            si5Var.a = vukVar;
            si5Var.b = new ArrayList();
            vukVar.b = new lb(si5Var, 8);
            ArrayList<RecyclerView.i> arrayList = listDataSet.b;
            vuk.a aVar2 = vukVar.c;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
            this.A = si5Var;
        }
        b bVar = aVar.c;
        if (aVar.e) {
            recyclerPaginatedView.setIgnoreRequestChildRectangleOnScreen(Boolean.TRUE);
        }
        f4m.s(bVar.a(), recyclerPaginatedView);
        f4m.r(bVar.b(), recyclerPaginatedView);
        f4m.t(bVar.g0(), recyclerPaginatedView);
        f4m.q(bVar.L(), recyclerPaginatedView);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.f = 1;
        dVar.d(new wrl(recyclerPaginatedView, this, inflate));
        dVar.e = new f(inflate);
        dVar.a();
        recyclerPaginatedView.getRecyclerView().setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        u4a u4aVar = this.e;
        u4a.a aVar3 = u4aVar.b;
        u4a.a aVar4 = u4aVar.b;
        recyclerView.setRecycledViewPool(aVar3.g.getValue());
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new nca(false));
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(this.z);
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(aVar.b);
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(this.B);
        if (bundle != null && (string = bundle.getString("vk_video_scroll_perf_screen_type")) != null && (valueOf = ScrollScreenType.valueOf(string)) != null) {
            ow90 ow90Var = ow90.a;
            ow90.c(valueOf, recyclerPaginatedView.getRecyclerView());
        }
        recyclerPaginatedView.getRecyclerView().addItemDecoration(catalogConfiguration.F(CatalogConfiguration$Companion$ContainerType.GRID, u4aVar));
        awt0.g(recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.l = aVar.a;
        }
        recyclerPaginatedView.o = true;
        recyclerPaginatedView.setSwipeRefreshEnabled(this.s);
        recyclerPaginatedView.setAdapter(lcaVar);
        this.u.s(recyclerPaginatedView.getRecyclerView());
        if (recyclerPaginatedView instanceof CatalogRecyclerPaginatedView) {
            ((CatalogRecyclerPaginatedView) recyclerPaginatedView).setUiTrackingScreenProvider(this);
        }
        r rVar = new r(this.y);
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            rVar.l(recyclerView2);
        }
        lcaVar.j = rVar;
        this.G = new w6b0<>(recyclerPaginatedView.getRecyclerView(), aVar4.i, lcaVar, new w4b(4));
        this.H = new u6b0<>(recyclerPaginatedView.getRecyclerView(), aVar4.i, lcaVar, new pue(6));
        this.I = new v6b0<>(recyclerPaginatedView.getRecyclerView(), aVar4.i, lcaVar, new cc5(7));
        if (fxc0.B().J().L()) {
            rel0 rel0Var = this.J;
            rel0Var.getClass();
            FrameLayout frameLayout = new FrameLayout(recyclerPaginatedView.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
            rel0Var.c = frameLayout;
            recyclerPaginatedView.addView(frameLayout);
            RecyclerView recyclerView3 = recyclerPaginatedView.getRecyclerView();
            rel0Var.b = recyclerView3;
            rel0Var.b();
            recyclerView3.addOnScrollListener(rel0Var.f);
        }
        Context context2 = recyclerPaginatedView.getContext();
        RecyclerView recyclerView4 = recyclerPaginatedView.getRecyclerView();
        RecyclerPaginatedView recyclerPaginatedView2 = (RecyclerPaginatedView) inflate;
        hb80 hb80Var = this.E;
        gb80 gb80Var = hb80Var.e;
        if (gb80Var == null) {
            gb80Var = new gb80(hb80Var, recyclerPaginatedView2, context2);
            hb80Var.e = gb80Var;
        }
        recyclerView4.addOnScrollListener(gb80Var);
        tba<hda> tbaVar = this.p;
        tbaVar.b(this);
        hbt0 hbt0Var2 = this.z;
        if (hbt0Var2 != null) {
            hbt0Var2.l();
        }
        w6b0<lca> w6b0Var = this.G;
        if (w6b0Var == null) {
            w6b0Var = null;
        }
        u6b0<lca> u6b0Var = this.H;
        if (u6b0Var == null) {
            u6b0Var = null;
        }
        v6b0<lca> v6b0Var = this.I;
        inflate.addOnAttachStateChangeListener(new y5b0(w6b0Var, u6b0Var, v6b0Var != null ? v6b0Var : null));
        inflate.addOnAttachStateChangeListener(new dca(this, tbaVar));
        this.L.a("PaginatedGridListVh", inflate, this.K);
        return inflate;
    }

    @Override // xsna.eca
    public final void n(EditorMode editorMode) {
        boolean z = false;
        boolean z2 = editorMode == EditorMode.ENTER_EDITOR_MODE;
        this.i.n(editorMode);
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        if (recyclerPaginatedView != null) {
            if (!z2 && this.s) {
                z = true;
            }
            recyclerPaginatedView.setSwipeRefreshEnabled(z);
        }
        this.y.g = z2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B.n();
        if (this.F) {
            this.C.postDelayed(this.D, 300L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        super.onPause();
        this.F = false;
        this.B.n();
        vha vhaVar = this.u;
        vhaVar.t(false);
        vhaVar.q();
        this.p.l();
        q(g.b);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        super.onResume();
        this.F = true;
        this.C.postDelayed(this.D, 300L);
        this.p.n();
        vha vhaVar = this.u;
        vhaVar.t(true);
        vhaVar.r(this.h.d);
        q(h.b);
    }

    public final void q(izs<? super CatalogListViewHolder, s3q0> izsVar) {
        RecyclerView recyclerView;
        List<tca> a2;
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (a2 = k5a.a(recyclerView)) == null) {
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
            if (obj instanceof CatalogListViewHolder) {
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
        this.y.i.clear();
        this.i.l.clear();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CATALOG;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, this.p.f(), null, 46, null);
    }
}
