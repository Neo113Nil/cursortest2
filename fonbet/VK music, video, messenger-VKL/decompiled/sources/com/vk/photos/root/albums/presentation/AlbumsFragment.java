package com.vk.photos.root.albums.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.content.design.view.photo.albums.AlbumsHeaderView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.AlbumsSkeletonView;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.albums.presentation.g;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.an1;
import xsna.ao50;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhk0;
import xsna.dhr0;
import xsna.f4m;
import xsna.fnj;
import xsna.fpf0;
import xsna.gm50;
import xsna.h6;
import xsna.hp1;
import xsna.hvt0;
import xsna.iah0;
import xsna.izs;
import xsna.kd;
import xsna.kga0;
import xsna.km50;
import xsna.kn1;
import xsna.ld;
import xsna.ln1;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.n13;
import xsna.oga0;
import xsna.oo;
import xsna.oz50;
import xsna.ozl;
import xsna.qfa0;
import xsna.rj1;
import xsna.rw;
import xsna.s1;
import xsna.s3q0;
import xsna.u40;
import xsna.ux0;
import xsna.vk50;
import xsna.we0;
import xsna.wm1;
import xsna.xm1;
import xsna.xn50;
import xsna.xp1;
import xsna.ysg0;
import xsna.ze1;

/* compiled from: AlbumsFragment.kt */
/* loaded from: classes.dex */
public final class AlbumsFragment extends MviImplFragment<com.vk.photos.root.albums.presentation.b, com.vk.photos.root.albums.presentation.g, com.vk.photos.root.albums.presentation.a> implements kga0 {
    public static final /* synthetic */ int j0 = 0;
    public com.vk.lists.c Q;
    public final bpn0 R = new bpn0(new rj1(this, 1));
    public final bpn0 S = new bpn0(new h(this, 4));
    public final bpn0 T = new bpn0(new wm1(this, 0));
    public final bpn0 U = new bpn0(new j(this, 5));
    public final bpn0 V = new bpn0(new xm1(this, 0));
    public final bpn0 W = new bpn0(new kd(this, 3));
    public final bpn0 X = new bpn0(new ld(this, 2));
    public final bpn0 Y = new bpn0(new h6(this, 3));
    public final bpn0 Z = new bpn0(new we0(this, 2));
    public final Object a0;
    public final c b0;
    public final ux0 c0;
    public final Object d0;
    public boolean e0;
    public an1 f0;
    public dhk0 g0;
    public final d h0;
    public int i0;

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public static int a(Context context) {
            HashSet hashSet = iah0.a;
            if (fnj.c(context)) {
                return 1;
            }
            return !iah0.s(context) ? 3 : 2;
        }
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class c implements ze1 {
        public c() {
        }

        @Override // xsna.ze1
        public final void a(PhotoAlbum photoAlbum) {
            int i = AlbumsFragment.j0;
            AlbumsFragment albumsFragment = AlbumsFragment.this;
            Context mo2getContext = albumsFragment.mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            albumsFragment.go().a(photoAlbum.b);
            oga0.a((oga0) albumsFragment.X.getValue(), mo2getContext, photoAlbum, null, 28);
        }

        @Override // xsna.ze1
        public final void b(PhotoAlbum photoAlbum, int i) {
            int i2 = AlbumsFragment.j0;
            AlbumsFragment albumsFragment = AlbumsFragment.this;
            albumsFragment.go().d(photoAlbum.b);
            xn50.a.c(albumsFragment, new a.l.b(photoAlbum, i));
        }
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class d implements AlbumsHeaderView.a {
        public d() {
        }

        @Override // com.vk.content.design.view.photo.albums.AlbumsHeaderView.a
        public final void a() {
            int i = AlbumsFragment.j0;
            AlbumsFragment albumsFragment = AlbumsFragment.this;
            albumsFragment.go().h();
            new xp1.a(albumsFragment.requireContext(), albumsFragment.ho()).I0(null);
        }

        @Override // com.vk.content.design.view.photo.albums.AlbumsHeaderView.a
        public final void b() {
            int i = AlbumsFragment.j0;
            AlbumsFragment albumsFragment = AlbumsFragment.this;
            albumsFragment.go().f();
            ((oga0) albumsFragment.X.getValue()).r(albumsFragment, albumsFragment.ho(), EmptyList.b);
        }
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.t {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            xn50.a.c(AlbumsFragment.this, new a.k(i));
        }
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<com.vk.photos.root.albums.presentation.a, s3q0> {
        public f(AlbumsFragment albumsFragment) {
            super(1, albumsFragment, AlbumsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(com.vk.photos.root.albums.presentation.a aVar) {
            AlbumsFragment albumsFragment = (AlbumsFragment) this.receiver;
            albumsFragment.getClass();
            xn50.a.c(albumsFragment, aVar);
            return s3q0.a;
        }
    }

    /* compiled from: AlbumsFragment.kt */
    /* loaded from: classes4.dex */
    public static final class g extends GridLayoutManager.c {
        public g() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            int i2 = AlbumsFragment.j0;
            AlbumsFragment albumsFragment = AlbumsFragment.this;
            ln1 ln1Var = (ln1) albumsFragment.d0.getValue();
            int a = b.a(albumsFragment.requireContext());
            kn1 item = ln1Var.getItem(i);
            if (!(item instanceof kn1.c)) {
                if (item instanceof kn1.a) {
                    return 1;
                }
                if (!(item instanceof kn1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return a;
        }
    }

    public AlbumsFragment() {
        s1 s1Var = new s1(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a0 = msy.a(lazyThreadSafetyMode, s1Var);
        this.b0 = new c();
        this.c0 = new ux0(this, 1);
        this.d0 = msy.a(lazyThreadSafetyMode, new oo(this, 2));
        this.h0 = new d();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.albums_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.photos.root.albums.presentation.g gVar = (com.vk.photos.root.albums.presentation.g) ao50Var;
        final AlbumsSkeletonView albumsSkeletonView = (AlbumsSkeletonView) hvt0.c(R.id.albums_skeleton, view);
        final View c2 = hvt0.c(R.id.albums_container, view);
        final AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        final View c3 = hvt0.c(R.id.albums_header, view);
        final View c4 = hvt0.c(R.id.albums_margin, view);
        xn50.a.b(this, gVar.b(), new rw(albumsSkeletonView, c2, this, 1));
        xn50.a.b(this, gVar.a(), new izs() { // from class: xsna.um1
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                g.a aVar = (g.a) obj;
                int i = AlbumsFragment.j0;
                AlbumsSkeletonView.this.setIsShow(false);
                c2.setVisibility(0);
                yzt0<Boolean> yzt0Var = aVar.a;
                int i2 = 1;
                u6 u6Var = new u6(i2, c3, c4);
                AlbumsFragment albumsFragment = this;
                gm50.a.a(albumsFragment, yzt0Var, u6Var);
                gm50.a.a(albumsFragment, aVar.b, new d50(i2, albumsFragment, albumsRecyclerPaginatedView));
                return s3q0.a;
            }
        });
        getFeature().U().a(new com.vk.movika.sdk.base.logic.interactor.d(this, 5), getViewLifecycleOwner());
    }

    @Override // xsna.kga0
    public final void La() {
        View view = getView();
        AppBarLayout appBarLayout = view != null ? (AppBarLayout) hvt0.c(R.id.app_bar_layout, view) : null;
        if (appBarLayout != null) {
            appBarLayout.g(true, true, true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView;
        AlbumsHeaderView albumsHeaderView;
        View view = getView();
        if (view != null && (albumsHeaderView = (AlbumsHeaderView) hvt0.c(R.id.albums_header, view)) != null) {
            dhr0.W(albumsHeaderView);
        }
        View view2 = getView();
        if (view2 == null || (albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) hvt0.c(R.id.albums_recycler, view2)) == null) {
            return;
        }
        dhr0.W(albumsRecyclerPaginatedView);
    }

    public final void fo(AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView, boolean z) {
        RecyclerView recyclerView = albumsRecyclerPaginatedView.getRecyclerView();
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            RecyclerView.n nVar = this.f0;
            if (nVar != null) {
                recyclerView.removeItemDecoration(nVar);
            }
            an1 an1Var = new an1(z ? 1 : 0, b.a(requireContext()));
            this.f0 = an1Var;
            recyclerView.addItemDecoration(an1Var);
            return;
        }
        RecyclerView.n nVar2 = this.g0;
        if (nVar2 != null) {
            recyclerView.removeItemDecoration(nVar2);
        }
        dhk0 dhk0Var = new dhk0(cn70.b(16), 0, cn70.b(16), cn70.b(8));
        dhk0Var.l(!z);
        this.g0 = dhk0Var;
        recyclerView.addItemDecoration(dhk0Var);
    }

    @Override // xsna.kga0
    public final RecyclerView getRecyclerView() {
        return ((AlbumsRecyclerPaginatedView) hvt0.c(R.id.albums_recycler, requireView())).getRecyclerView();
    }

    public final qfa0.j go() {
        return (qfa0.j) this.Y.getValue();
    }

    public final UserId ho() {
        return (UserId) this.R.getValue();
    }

    public final void io(AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView) {
        int itemDecorationCount = albumsRecyclerPaginatedView.getRecyclerView().getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                break;
            } else {
                albumsRecyclerPaginatedView.getRecyclerView().removeItemDecorationAt(itemDecorationCount);
            }
        }
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            g gVar = new g();
            AbstractPaginatedView.d o = albumsRecyclerPaginatedView.o(AbstractPaginatedView.LayoutType.GRID);
            o.b();
            o.c(b.a(requireContext()));
            o.e(gVar);
            o.a();
            f4m.l(cn70.b(16), cn70.b(16), albumsRecyclerPaginatedView);
            f4m.v(cn70.b(16), albumsRecyclerPaginatedView);
        } else {
            AbstractPaginatedView.d o2 = albumsRecyclerPaginatedView.o(AbstractPaginatedView.LayoutType.LINEAR);
            o2.b();
            o2.a();
        }
        fo(albumsRecyclerPaginatedView, this.e0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        PhotoAlbum photoAlbum;
        super.onActivityResult(i, i2, intent);
        if (i == 7647 && i2 == -1) {
            com.vk.lists.c cVar = this.Q;
            if (cVar != null) {
                cVar.p(true);
                return;
            }
            return;
        }
        if (i != 3241 || i2 != -1 || intent == null || (photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album")) == null) {
            return;
        }
        oga0.a((oga0) this.X.getValue(), requireContext(), photoAlbum, null, 28);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView;
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.i0 && (view = getView()) != null && (albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler)) != null) {
            io(albumsRecyclerPaginatedView);
            RecyclerView.o layoutManager = albumsRecyclerPaginatedView.getRecyclerView().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.s()) : null;
            if (valueOf != null && valueOf.intValue() == -1) {
                valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null;
            }
            albumsRecyclerPaginatedView.setAdapter((ln1) this.d0.getValue());
            if (valueOf != null && linearLayoutManager != null) {
                linearLayoutManager.scrollToPosition(valueOf.intValue());
            }
        }
        this.i0 = i;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.lists.c cVar = this.Q;
        if (cVar != null) {
            cVar.v();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        xn50.a.c(this, a.e.b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) hvt0.c(R.id.albums_recycler, view);
        bwt0.d(hvt0.c(R.id.albums_container, view), getResources().getDimension(R.dimen.photos_root_page_background_corner_radius), false, true);
        albumsRecyclerPaginatedView.setAdapter((ln1) this.d0.getValue());
        albumsRecyclerPaginatedView.getRecyclerView().addOnScrollListener(new e());
        io(albumsRecyclerPaginatedView);
        c.h e2 = com.vk.lists.c.e(new hp1(ho(), (AlbumsRepository) this.U.getValue(), getFeature().P(), new f(this)));
        e2.c();
        this.Q = com.vk.lists.f.a(e2, albumsRecyclerPaginatedView);
        ((AlbumsHeaderView) hvt0.c(R.id.albums_header, view)).setListener(this.h0);
        albumsRecyclerPaginatedView.getAlbumsEmptyView().setAddAlbumListener(this.c0);
        n13.a((AppBarLayout) hvt0.c(R.id.app_bar_layout, view), null, new u40(albumsRecyclerPaginatedView, 2));
    }

    @Override // xsna.kga0
    public final void s() {
        RecyclerView recyclerView;
        View view = getView();
        AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = view != null ? (AlbumsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler) : null;
        if (albumsRecyclerPaginatedView == null || (recyclerView = albumsRecyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // xsna.kga0
    public final AppBarLayout vh() {
        return (AppBarLayout) hvt0.c(R.id.app_bar_layout, requireView());
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.photos.root.albums.presentation.b(((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).z8(), (ysg0) this.W.getValue(), (AlbumsRepository) this.U.getValue(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).D7(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).d3(), go(), ho(), (String) this.S.getValue());
    }
}
