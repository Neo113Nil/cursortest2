package com.vk.photos.root.photoflow.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.content.design.view.photo.flow.PhotoFlowSkeletonView;
import com.vk.content.design.view.photo.tags.PhotoTagsPreviewView;
import com.vk.content.tool.view.photo.NestedOrderedCoordinatorLayout;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.views.PhotoFlowRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.bwt0;
import xsna.bxj;
import xsna.cn70;
import xsna.cxj;
import xsna.d920;
import xsna.dga0;
import xsna.dhr0;
import xsna.e9a0;
import xsna.eha0;
import xsna.f5z;
import xsna.f9a0;
import xsna.fa00;
import xsna.fnj;
import xsna.gm50;
import xsna.gzs;
import xsna.iah0;
import xsna.jfi0;
import xsna.jgu;
import xsna.kdg0;
import xsna.m130;
import xsna.n13;
import xsna.n7a0;
import xsna.or20;
import xsna.or50;
import xsna.pn00;
import xsna.qe3;
import xsna.too0;
import xsna.x4u;
import xsna.y7a0;
import xsna.yhu;
import xsna.zf1;

/* compiled from: PhotoFlowView.kt */
/* loaded from: classes4.dex */
public final class j implements gm50, too0 {
    public final Context b;
    public final kdg0 c;
    public final eha0 d;
    public final PhotoFlowFragment.a e;
    public final f5z f;
    public final View g;
    public final PhotoFlowSkeletonView h;
    public final NestedOrderedCoordinatorLayout i;
    public final AppBarLayout j;
    public final PhotoFlowHeaderView k;
    public final PhotoFlowRecyclerPaginatedView l;
    public final LinearLayout m;
    public final PhotoTagsPreviewView n;
    public final jfi0<f9a0, y7a0> o;
    public final k p;
    public final n7a0 q;
    public final bxj r;
    public final d920 s;
    public final Object t;
    public final com.vk.lists.c u;
    public final e9a0 v;

    /* compiled from: PhotoFlowView.kt */
    public static final class a {
        public static int a(Context context) {
            HashSet hashSet = iah0.a;
            return (fnj.c(context) || iah0.s(context)) ? 3 : 6;
        }
    }

    /* compiled from: PhotoFlowView.kt */
    public static final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            j.this.e.invoke(new a.o(i));
        }
    }

    /* compiled from: PhotoFlowView.kt */
    public static final class c extends GridLayoutManager.c {
        public final /* synthetic */ PhotoFlowRecyclerPaginatedView e;

        public c(PhotoFlowRecyclerPaginatedView photoFlowRecyclerPaginatedView) {
            this.e = photoFlowRecyclerPaginatedView;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            j jVar = j.this;
            RecyclerView.Adapter z0 = jVar.s.z0(i);
            if (z0 == null) {
                Context context = this.e.getContext();
                HashSet hashSet = iah0.a;
                return (fnj.c(context) || iah0.s(context)) ? 3 : 6;
            }
            gzs gzsVar = (gzs) jVar.t.get(z0);
            Integer num = gzsVar != null ? (Integer) gzsVar.invoke() : null;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public j(Context context, kdg0 kdg0Var, eha0 eha0Var, c.h hVar, PhotoFlowFragment.a aVar, f5z f5zVar) {
        this.b = context;
        this.c = kdg0Var;
        this.d = eha0Var;
        this.e = aVar;
        this.f = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.photo_flow_fragment, (ViewGroup) null);
        this.g = inflate;
        this.h = (PhotoFlowSkeletonView) inflate.findViewById(R.id.skeleton);
        this.i = (NestedOrderedCoordinatorLayout) inflate.findViewById(R.id.photo_flow_container);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        this.j = appBarLayout;
        PhotoFlowHeaderView photoFlowHeaderView = (PhotoFlowHeaderView) inflate.findViewById(R.id.photo_flow_header);
        this.k = photoFlowHeaderView;
        PhotoFlowRecyclerPaginatedView photoFlowRecyclerPaginatedView = (PhotoFlowRecyclerPaginatedView) inflate.findViewById(R.id.rpv_photo_flow);
        this.l = photoFlowRecyclerPaginatedView;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.photo_tags);
        this.m = linearLayout;
        this.n = (PhotoTagsPreviewView) inflate.findViewById(R.id.stack);
        this.o = new jfi0<>(photoFlowRecyclerPaginatedView.getRecyclerView(), f5zVar, new or50(this, 8), new yhu(this, 17));
        k kVar = new k(this);
        this.p = kVar;
        n7a0 n7a0Var = new n7a0(kVar, eha0Var);
        this.q = n7a0Var;
        bxj bxjVar = new bxj(cxj.a);
        this.r = bxjVar;
        d920 y0 = d920.y0(n7a0Var, bxjVar);
        this.s = y0;
        this.t = pn00.k(new Pair(n7a0Var, new qe3(15)), new Pair(bxjVar, new x4u(this, 27)));
        this.v = new e9a0();
        int i = 14;
        bwt0.i0(linearLayout, new fa00(this, i));
        d();
        photoFlowRecyclerPaginatedView.setAdapter(y0);
        this.u = com.vk.lists.f.a(hVar, photoFlowRecyclerPaginatedView);
        photoFlowHeaderView.setClickListener(new i(this));
        n13.a(appBarLayout, null, new m130(this, i));
    }

    public final void La() {
        this.j.g(true, true, true);
    }

    @Override // xsna.too0
    public final void Ng() {
        dhr0.W(this.m);
        dhr0.W(this.k);
        dhr0.W(this.l);
    }

    public final View a(int i) {
        RecyclerView.e0 findViewHolderForAdapterPosition = this.l.getRecyclerView().findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null) {
            return findViewHolderForAdapterPosition.itemView;
        }
        return null;
    }

    public final boolean a0() {
        if (!this.o.y) {
            return false;
        }
        this.e.invoke(a.c.b);
        return true;
    }

    public final void b() {
        com.vk.lists.c cVar = this.u;
        if (cVar != null) {
            cVar.v();
        }
    }

    public final void c(l lVar) {
        gm50.a.b(this, lVar.a, new zf1(25, this, new Ref$BooleanRef()));
    }

    public final void d() {
        PhotoFlowRecyclerPaginatedView photoFlowRecyclerPaginatedView = this.l;
        c cVar = new c(photoFlowRecyclerPaginatedView);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        photoFlowRecyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, photoFlowRecyclerPaginatedView);
        dVar.f = 1;
        dVar.c(a.a(photoFlowRecyclerPaginatedView.getContext()));
        dVar.e = cVar;
        dVar.a();
        photoFlowRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        photoFlowRecyclerPaginatedView.getRecyclerView().addItemDecoration(new jgu(a.a(photoFlowRecyclerPaginatedView.getContext()), cn70.b(2), false, 0));
        photoFlowRecyclerPaginatedView.getRecyclerView().addItemDecoration(new dga0(a.a(photoFlowRecyclerPaginatedView.getContext()), this.v));
        photoFlowRecyclerPaginatedView.getRecyclerView().setOverScrollMode(2);
        photoFlowRecyclerPaginatedView.getRecyclerView().addOnItemTouchListener(this.o);
        photoFlowRecyclerPaginatedView.setEmptyViewAddPhotoListener(new or20(this, 9));
        photoFlowRecyclerPaginatedView.getRecyclerView().addOnScrollListener(new b());
    }

    public final void e() {
        PhotoFlowRecyclerPaginatedView photoFlowRecyclerPaginatedView = this.l;
        int itemDecorationCount = photoFlowRecyclerPaginatedView.getRecyclerView().getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                d();
                return;
            }
            photoFlowRecyclerPaginatedView.getRecyclerView().removeItemDecorationAt(itemDecorationCount);
        }
    }

    public final RecyclerView getRecyclerView() {
        return this.l.getRecyclerView();
    }

    public final View getView() {
        return this.g;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.f;
    }

    public final void s() {
        this.l.getRecyclerView().smoothScrollToPosition(0);
    }

    public final AppBarLayout vh() {
        return this.j;
    }
}
