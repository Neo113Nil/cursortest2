package com.vk.photos.ui.base;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.ui.t;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.a920;
import xsna.aq2;
import xsna.bd70;
import xsna.bwt0;
import xsna.ca;
import xsna.cj1;
import xsna.daa0;
import xsna.e43;
import xsna.epx;
import xsna.fj6;
import xsna.hj6;
import xsna.iah0;
import xsna.io3;
import xsna.j1;
import xsna.j34;
import xsna.jj6;
import xsna.mj6;
import xsna.msy;
import xsna.ob9;
import xsna.oz50;
import xsna.p870;
import xsna.rwi;
import xsna.t5;
import xsna.tlo0;
import xsna.tq;
import xsna.v40;
import xsna.vj6;
import xsna.y6;
import xsna.yrn;
import xsna.zvw;

/* compiled from: BasePhotoListFragment.kt */
/* loaded from: classes3.dex */
public abstract class BasePhotoListFragment<P extends fj6> extends BaseMvpFragment<P> implements hj6<P> {
    public static final /* synthetic */ int m0 = 0;
    public GridLayoutManager T;
    public VkTopBar X;
    public aq2 Y;
    public a920 Z;
    public int a0;
    public int b0;
    public ImageViewer.c<Photo> c0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final c l0;
    public int U = 1;
    public final zvw V = new zvw(null);
    public final int W = iah0.a(1);
    public final io.reactivex.rxjava3.disposables.b d0 = new io.reactivex.rxjava3.disposables.b();
    public final jj6 e0 = new bd70() { // from class: xsna.jj6
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            BasePhotoListFragment basePhotoListFragment = BasePhotoListFragment.this;
            ?? r0 = basePhotoListFragment.f0;
            io.reactivex.rxjava3.disposables.b bVar = basePhotoListFragment.d0;
            Photo photo = (Photo) obj;
            if (i == 130) {
                hg1.e(bVar, ((kdg0) r0.getValue()).b(basePhotoListFragment.po().y0(), photo, new v5(basePhotoListFragment, 11)));
            } else if (i != 131) {
                int i3 = BasePhotoListFragment.m0;
            } else {
                hg1.e(bVar, ((kdg0) r0.getValue()).e(basePhotoListFragment.po().y0(), photo, new p1(basePhotoListFragment, 10)));
            }
        }
    };

    /* compiled from: BasePhotoListFragment.kt */
    public static abstract class a extends oz50 {
        public a(UserId userId, Class<? extends FragmentImpl> cls) {
            super(cls, null, null);
            this.j.putParcelable("uid", userId);
        }

        public final void y(String str) {
            if (str != null) {
                this.j.putString("source", str);
            }
        }
    }

    /* compiled from: BasePhotoListFragment.kt */
    public static final class b extends RecyclerView.n {
        public final /* synthetic */ BasePhotoListFragment<P> b;

        public b(BasePhotoListFragment<P> basePhotoListFragment) {
            this.b = basePhotoListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            BasePhotoListFragment<P> basePhotoListFragment = this.b;
            if (childAdapterPosition == 1) {
                rect.top = basePhotoListFragment.W;
            }
            int i = basePhotoListFragment.W;
            rect.right = i;
            rect.left = i;
            if (childAdapterPosition < basePhotoListFragment.b0) {
                return;
            }
            rect.right = i;
            rect.left = i;
            rect.top = i;
            rect.bottom = i;
        }
    }

    /* compiled from: BasePhotoListFragment.kt */
    public static final class c extends ob9 {
        public final /* synthetic */ BasePhotoListFragment<P> a;

        public c(BasePhotoListFragment<P> basePhotoListFragment) {
            this.a = basePhotoListFragment;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            BasePhotoListFragment<P> basePhotoListFragment = this.a;
            if (i < basePhotoListFragment.po().getItemCount()) {
                Photo photo = (Photo) basePhotoListFragment.po().c.c(i);
                aq2 aq2Var = basePhotoListFragment.Y;
                if (aq2Var == null) {
                    aq2Var = null;
                }
                RecyclerView recyclerView = aq2Var.getRecyclerView();
                for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (epx.f(childAt.getTag(), photo)) {
                        return (ImageView) childAt;
                    }
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            BasePhotoListFragment<P> basePhotoListFragment = this.a;
            a920 a920Var = basePhotoListFragment.Z;
            if (a920Var == null) {
                a920Var = null;
            }
            int indexOf = a920Var.e.indexOf(basePhotoListFragment.po());
            for (int i2 = 0; i2 < indexOf; i2++) {
                a920 a920Var2 = basePhotoListFragment.Z;
                if (a920Var2 == null) {
                    a920Var2 = null;
                }
                i += a920Var2.e.get(i2).getItemCount();
            }
            aq2 aq2Var = basePhotoListFragment.Y;
            if (aq2Var == null) {
                aq2Var = null;
            }
            RecyclerView.o layoutManager = aq2Var.getRecyclerView().getLayoutManager();
            if ((layoutManager != null ? layoutManager.findViewByPosition(i) : null) == null) {
                aq2 aq2Var2 = basePhotoListFragment.Y;
                (aq2Var2 != null ? aq2Var2 : null).getRecyclerView().scrollToPosition(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return Integer.valueOf(this.a.qo());
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final Rect g() {
            aq2 aq2Var = this.a.Y;
            if (aq2Var == null) {
                aq2Var = null;
            }
            return bwt0.F(aq2Var.getRecyclerView());
        }

        @Override // xsna.ob9
        public final boolean k(Photo photo) {
            PhotoAlbum photoAlbum;
            P io2 = this.a.io();
            return io2 != null && (photoAlbum = ((vj6) io2).g) != null && epx.f(photo.e, photoAlbum.c) && photo.d == photoAlbum.b;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void o() {
            P io2;
            BasePhotoListFragment<P> basePhotoListFragment = this.a;
            if (basePhotoListFragment.po().getItemCount() >= basePhotoListFragment.a0 || (io2 = basePhotoListFragment.io()) == null) {
                return;
            }
            com.vk.lists.c cVar = ((vj6) io2).d;
            if (cVar == null) {
                cVar = null;
            }
            cVar.n(false);
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            this.a.c0 = null;
        }
    }

    /* compiled from: BasePhotoListFragment.kt */
    public static final class d extends GridLayoutManager.c {
        public final /* synthetic */ BasePhotoListFragment<P> d;

        public d(BasePhotoListFragment<P> basePhotoListFragment) {
            this.d = basePhotoListFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            BasePhotoListFragment<P> basePhotoListFragment = this.d;
            a920 a920Var = basePhotoListFragment.Z;
            if (a920Var == null) {
                a920Var = null;
            }
            if (a920Var.L0(i) instanceof daa0) {
                return 1;
            }
            return basePhotoListFragment.U;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.jj6] */
    public BasePhotoListFragment() {
        t5 t5Var = new t5(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, t5Var);
        this.g0 = msy.a(lazyThreadSafetyMode, new v40(this, 7));
        this.h0 = msy.a(lazyThreadSafetyMode, new ca(this, 11));
        int i = 8;
        this.i0 = msy.a(lazyThreadSafetyMode, new t(this, i));
        this.j0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, i));
        this.k0 = msy.a(lazyThreadSafetyMode, new y6(this, 6));
        this.l0 = new c(this);
    }

    @Override // xsna.hj6
    public final void C1(PhotoAlbum photoAlbum) {
        zvw zvwVar = this.V;
        zvwVar.clear();
        lo();
        zvwVar.notifyDataSetChanged();
        this.b0 = zvwVar.E0();
    }

    public void I0() {
        C1(null);
    }

    @Override // xsna.hj6
    public final void T2(int i) {
        if (this.a0 != i) {
            this.a0 = i;
            C1(null);
        }
    }

    public void g1(Photo photo) {
        po().x0(photo);
        C1(null);
    }

    public final void jo() {
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        aq2Var.Mk();
    }

    public void ko() {
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            vkTopBar.setBack(new VkTopBar.b(new j1(this, 10), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new io3(1), 3), 14));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.photos), null, null, null, null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new cj1(3), 3), 6));
        }
    }

    public a920 mo() {
        a920 a920Var = new a920();
        a920Var.K0(this.V);
        a920Var.K0(po());
        return a920Var;
    }

    public aq2 no() {
        return new aq2(kn(), null, 6, 0);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        P io2 = io();
        if (io2 != null) {
            io2.onCreate(requireArguments());
        }
        this.Z = mo();
        ?? r4 = this.g0;
        p870 p870Var = (p870) r4.getValue();
        jj6 jj6Var = this.e0;
        p870Var.b(130, jj6Var);
        ((p870) r4.getValue()).b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jj6Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.photos_fragment, viewGroup, false);
        this.X = (VkTopBar) coordinatorLayout.findViewById(R.id.toolbar);
        ko();
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.U);
        gridLayoutManager.x = (d) this.i0.getValue();
        this.T = gridLayoutManager;
        aq2 no = no();
        RecyclerView recyclerView = no.getRecyclerView();
        recyclerView.addItemDecoration((b) this.j0.getValue());
        recyclerView.addItemDecoration((yrn) this.k0.getValue());
        GridLayoutManager gridLayoutManager2 = this.T;
        if (gridLayoutManager2 == null) {
            gridLayoutManager2 = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager2);
        int i = -this.W;
        recyclerView.setPadding(i, i, i, i);
        bwt0.R(no, new mj6(this, 0));
        no.setOnRefreshListener(new h(this, 8));
        no.setOnReloadRetryClickListener(new j(this, 11));
        a920 a920Var = this.Z;
        if (a920Var == null) {
            a920Var = null;
        }
        no.setAdapter(a920Var);
        no.e0();
        this.Y = no;
        P io2 = io();
        no.setSwipeRefreshEnabled(io2 != null ? io2.X6() : true);
        ViewGroup viewGroup2 = (ViewGroup) coordinatorLayout.findViewById(R.id.recycler_container);
        aq2 aq2Var = this.Y;
        viewGroup2.addView(aq2Var != null ? aq2Var : null);
        return coordinatorLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((p870) this.g0.getValue()).g(this.e0);
        this.d0.dispose();
    }

    public void oo(Photo photo) {
        Intent intent;
        Intent putExtra = new Intent().putExtra("photo", photo);
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            UserId userId = (UserId) intent.getParcelableExtra("owner_id");
            int intExtra = intent.getIntExtra("post_id", 0);
            putExtra.putExtra("owner_id", userId);
            putExtra.putExtra("post_id", intExtra);
        }
        j34 a2 = rwi.d().p().a(this);
        if (a2 != null) {
            a2.V2(putExtra);
        } else {
            Mf(-1, putExtra);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final daa0 po() {
        return (daa0) this.h0.getValue();
    }

    public int qo() {
        PhotoAlbum photoAlbum;
        P io2 = io();
        if (io2 == null || (photoAlbum = ((vj6) io2).g) == null) {
            return 0;
        }
        return photoAlbum.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r7 = r6.V;
        r7.notifyItemRangeChanged(0, r7.E0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r0(int i) {
        daa0 po = po();
        Iterator it = ((ArrayList) po.y0()).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (i == ((Photo) next).c) {
                po.D0(i2);
                break;
            }
            i2 = i3;
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    /* renamed from: ro, reason: merged with bridge method [inline-methods] */
    public P io() {
        return null;
    }

    public final void so(Throwable th) {
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        aq2Var.g0();
    }

    public void lo() {
    }
}
