package com.vk.newsfeed.impl.presentation.postponed.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a4r;
import xsna.ad0;
import xsna.asu0;
import xsna.aw60;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c230;
import xsna.c5r;
import xsna.crc0;
import xsna.doq;
import xsna.dui;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.erc0;
import xsna.f1s;
import xsna.fh9;
import xsna.fm20;
import xsna.fo60;
import xsna.fpf0;
import xsna.frc0;
import xsna.fxc0;
import xsna.g0t;
import xsna.gd70;
import xsna.gqo;
import xsna.grc0;
import xsna.gzs;
import xsna.h3p0;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.hp30;
import xsna.hrc0;
import xsna.hux;
import xsna.io60;
import xsna.irc0;
import xsna.j5b0;
import xsna.j6f0;
import xsna.jrc0;
import xsna.ju4;
import xsna.jw30;
import xsna.jz60;
import xsna.l6s;
import xsna.l960;
import xsna.lj50;
import xsna.lmc;
import xsna.lxd;
import xsna.m7m;
import xsna.mo60;
import xsna.msy;
import xsna.nl30;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.or60;
import xsna.osc0;
import xsna.oz50;
import xsna.pds;
import xsna.pn60;
import xsna.puq0;
import xsna.qcy;
import xsna.qn60;
import xsna.ra6;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.s3q0;
import xsna.s7c0;
import xsna.sm60;
import xsna.so40;
import xsna.sr60;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.trc0;
import xsna.ubw;
import xsna.uq60;
import xsna.vq60;
import xsna.wjs0;
import xsna.wq60;
import xsna.wrc0;
import xsna.wv0;
import xsna.xl60;
import xsna.xn60;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.zjf0;

/* compiled from: PostponedPostsFragment.kt */
/* loaded from: classes4.dex */
public final class PostponedPostsFragment extends FragmentImpl implements pds {
    public static final /* synthetic */ qcy<Object>[] q0;
    public final Object N;
    public final Object O;
    public qn60 P;
    public pn60 Q;
    public final bpn0 R;
    public final nzw S;
    public final erc0 T;
    public final bpn0 U;
    public final bpn0 V;
    public final b W;
    public final c X;
    public VkTopBar Y;
    public RecyclerView Z;
    public SwipeDrawableRefreshLayout a0;
    public View b0;
    public DefaultErrorView c0;
    public DefaultEmptyView d0;
    public View e0;
    public final io.reactivex.rxjava3.disposables.b f0;
    public bin0<Context> g0;
    public boolean h0;
    public final Object i0;
    public final Object j0;
    public ek40 k0;
    public gzs<s3q0> l0;
    public final AtomicReference<String> m0;
    public final AtomicReference<String> n0;
    public final lxd o0;
    public frc0 p0;

    /* compiled from: PostponedPostsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PostponedPostsFragment.kt */
    public static final class b implements fo60 {
        public b() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 aVar;
            qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
            crc0 crc0Var = (crc0) PostponedPostsFragment.this.U.getValue();
            if (xn60Var instanceof xn60.a) {
                aVar = new trc0.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d.a) {
                aVar = trc0.d.a.b;
            } else if (xn60Var instanceof xn60.d.c) {
                aVar = trc0.d.c.b;
            } else if (xn60Var instanceof xn60.d.b) {
                aVar = trc0.d.b.b;
            } else if (xn60Var instanceof xn60.b) {
                aVar = new trc0.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new trc0.c.a((xn60.c) xn60Var);
            }
            osc0 osc0Var = (osc0) crc0Var.a.invoke();
            if (osc0Var != null) {
                osc0Var.b(aVar);
            }
        }
    }

    /* compiled from: PostponedPostsFragment.kt */
    public static final class c implements bq60 {
        public c() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
            grc0 grc0Var = (grc0) PostponedPostsFragment.this.V.getValue();
            hrc0.a((frc0) grc0Var.a.invoke(), (PostponedPostsFragment) grc0Var.b.c, grc0Var.c.invoke(), grc0Var.d.invoke(), new wrc0.a(yo60Var));
        }
    }

    /* compiled from: PostponedPostsFragment.kt */
    public static final /* synthetic */ class d implements bin0, g0t {
        public final /* synthetic */ AtomicReference<String> b;

        public d(AtomicReference<String> atomicReference) {
            this.b = atomicReference;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bin0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.bin0
        public final Object get() {
            return this.b.get();
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, this.b, AtomicReference.class, "get", "get()Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PostponedPostsFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/postponed/presentation/feature/PostponedPostsMviStore;", 0);
        fpf0.a.getClass();
        q0 = new qcy[]{propertyReference1Impl};
    }

    public PostponedPostsFragment() {
        ubw ubwVar = new ubw(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, ubwVar);
        this.O = msy.a(lazyThreadSafetyMode, new s7c0(1));
        this.R = new bpn0(new fm20(this, 19));
        this.S = new nzw(fpf0.d(osc0.class).toString(), this, new hp30(this, 14));
        this.T = new erc0(0);
        this.U = new bpn0(new jw30(this, 19));
        this.V = new bpn0(new so40(this, 15));
        this.W = new b();
        this.X = new c();
        this.f0 = new io.reactivex.rxjava3.disposables.b();
        this.g0 = new bin0() { // from class: xsna.nrc0
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                return PostponedPostsFragment.this.mo2getContext();
            }
        };
        this.i0 = msy.a(lazyThreadSafetyMode, new gd70(this, 15));
        this.j0 = msy.a(lazyThreadSafetyMode, new wv0(28));
        this.m0 = new AtomicReference<>("postponed");
        this.n0 = new AtomicReference<>("");
        this.o0 = new lxd(null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        ((tc60) eo().a.U.getValue()).c();
        eo().b().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        fo().g();
        ((o170) eo().a.V.getValue()).c();
    }

    public final frc0 eo() {
        frc0 frc0Var = this.p0;
        if (frc0Var != null) {
            return frc0Var;
        }
        bin0<Context> bin0Var = this.g0;
        ju4 ju4Var = new ju4(this.m0, this.n0);
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, false, null, null, null, null, 505), this.W, this.X, this.f0, msy.a(LazyThreadSafetyMode.NONE, new irc0(this, 0)), new jrc0(0), null);
        mo60Var.e = this.g0;
        frc0 frc0Var2 = new frc0(bin0Var, mo60Var);
        if (!this.h0) {
            this.p0 = frc0Var2;
        }
        return frc0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.i0.getValue();
    }

    public final osc0 go() {
        qcy<Object> qcyVar = q0[0];
        return (osc0) this.S.getValue();
    }

    public final void ho(VkTopBar vkTopBar) {
        if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
            vkTopBar.setBack(null);
            return;
        }
        vkTopBar.setBack(new VkTopBar.b(new io60(this, 16), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new f1s(21), 3), 12));
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.l0 = gzsVar;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar != null) {
            ho(vkTopBar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) eo().a.U.getValue()).d();
        eo().b().k(getActivity(), eo().a.n);
        fo().h();
        ((o170) eo().a.V.getValue()).b(this.Z);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.W));
        fo().b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        eo().a.n.g(hux.f.b.a);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        his0.d++;
        if (his0.c == null || !(!r4.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.k0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_postponed_posts, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.k0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.k0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        eo().b().e();
        ehv ehvVar = (ehv) eo().e.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        eo().e.b = null;
        this.l0 = null;
        this.f0.e();
        go().clear();
        pn60 pn60Var = this.Q;
        if (pn60Var != null) {
            pn60Var.a();
        }
        this.Q = null;
        qn60 qn60Var = this.P;
        if (qn60Var != null) {
            qn60Var.a();
        }
        this.P = null;
        frc0 frc0Var = this.p0;
        if (frc0Var != null) {
            frc0Var.a.a();
        }
        this.p0 = null;
        this.h0 = true;
        grc0 grc0Var = (grc0) this.V.getValue();
        grc0Var.c = vq60.d;
        grc0Var.d = wq60.d;
        this.g0 = doqVar;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        io.reactivex.rxjava3.disposables.c cVar;
        this.o0.a();
        ek40 ek40Var = this.k0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.k0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        this.T.clear();
        eo().a.d().a();
        RecyclerView recyclerView3 = this.Z;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.Z;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) eo().a.T.getValue());
        }
        if (((Boolean) this.O.getValue()).booleanValue() && (recyclerView2 = this.Z) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.j0.getValue());
        }
        RecyclerView recyclerView5 = this.Z;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) eo().e.b;
        if (ehvVar != null && (recyclerView = this.Z) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        eo().a.n.b();
        eo().a().F0((or60) eo().a.t.getValue());
        eo().a().F0((oc60) eo().a.z.getValue());
        eo().a().G0((rl60) eo().a.A.getValue());
        eo().a().G0(((sr60) eo().a.o.getValue()).c);
        eo().a().G0((zjf0) eo().a.B.getValue());
        eo().a().k = null;
        eo().a().E0();
        eo().a().clear();
        eo().b().f();
        ehv ehvVar2 = (ehv) eo().e.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) eo().a.b0.getValue()).d();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        DefaultErrorView defaultErrorView = this.c0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(null);
        }
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        fo().c();
        eo().a.n.c();
        eo().a.n.f = null;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            gqo.f(view, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        eo().b().g();
        ((yl60) eo().a.b0.getValue()).a();
        super.onPause();
        J0();
        fo().d();
        ehv ehvVar = (ehv) eo().e.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o1();
        fo().e();
        eo().b().j();
        ehv ehvVar = (ehv) eo().e.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) eo().a.b0.getValue()).b();
        gzs<s3q0> gzsVar = this.l0;
        if (gzsVar != null) {
            this.l0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        RecyclerView.t tVar;
        super.onViewCreated(view, bundle);
        this.Y = (VkTopBar) view.findViewById(R.id.toolbar);
        this.Z = (RecyclerView) view.findViewById(R.id.list);
        this.a0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.b0 = view.findViewById(R.id.progressbar);
        this.c0 = (DefaultErrorView) view.findViewById(R.id.error_view);
        this.d0 = (DefaultEmptyView) view.findViewById(R.id.empty_view);
        FragmentActivity activity = getActivity();
        this.e0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.postponed_posts_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            vkTopBar.setOnClickListener(new ra6(this, 7));
            ho(vkTopBar);
        }
        RecyclerView recyclerView = this.Z;
        int i = 1;
        if (recyclerView != null) {
            frc0 eo = eo();
            mo60 mo60Var = eo.a;
            fh9 fh9Var = eo.e;
            eo().a.n.h(recyclerView);
            recyclerView.setHasFixedSize(true);
            EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(recyclerView.getContext(), this, (com.vk.stat.recycler.d) mo60Var.C.getValue());
            focusableLinearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(focusableLinearLayoutManager);
            FragmentActivity activity2 = getActivity();
            FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
            feedFeatures.getClass();
            if (!com.vk.toggle.b.A.a(feedFeatures)) {
                rruVar = new rru();
            } else if (activity2 != null) {
                WeakHashMap<Activity, RecyclerView.u> weakHashMap = jz60.a;
                RecyclerView.u uVar = weakHashMap.get(activity2);
                if (uVar == null) {
                    uVar = new rru();
                    weakHashMap.put(activity2, uVar);
                }
                rruVar = uVar;
            } else {
                rruVar = new rru();
            }
            recyclerView.setRecycledViewPool(rruVar);
            recyclerView.setItemViewCacheSize(fxc0.B().N().a);
            recyclerView.addOnScrollListener(new c5r((ClipsViewerComponent) m7m.d(this).a(fpf0.a(ClipsViewerComponent.class)), (NewsfeedOptionalAdsComponent) m7m.d(this).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class))));
            recyclerView.addOnScrollListener((dui) mo60Var.T.getValue());
            ((tc60) mo60Var.U.getValue()).a(recyclerView);
            ((o170) mo60Var.V.getValue()).a(recyclerView);
            aw60 e = mo60Var.e();
            a4r a4rVar = mo60Var.n;
            e.a();
            ((dui) mo60Var.T.getValue()).l(new j6f0(((sr60) mo60Var.o.getValue()).a()));
            bw60 bw60Var = new bw60(recyclerView);
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                tVar = new ehv(mo2getContext, bw60Var, fh9Var.a());
                recyclerView.addOnScrollListener(tVar);
            } else {
                tVar = null;
            }
            fh9Var.b = tVar;
            recyclerView.setItemAnimator((hm60) mo60Var.f0.getValue());
            eo.a().C0((or60) mo60Var.t.getValue());
            eo.a().C0((oc60) mo60Var.z.getValue());
            eo.a().D0(((sr60) mo60Var.o.getValue()).c);
            eo.a().D0((rl60) mo60Var.A.getValue());
            eo.a().D0((zjf0) mo60Var.B.getValue());
            dui duiVar = (dui) mo60Var.T.getValue();
            yl60 yl60Var = (yl60) mo60Var.b0.getValue();
            yl60Var.getClass();
            duiVar.l(new xl60(yl60Var));
            ((yl60) mo60Var.b0.getValue()).c();
            com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) mo60Var.C.getValue();
            if (dVar != null) {
                eo.a().k = dVar;
            }
            recyclerView.setAdapter(eo.a());
            bs60 b2 = eo.b();
            getActivity();
            b2.i(recyclerView, eo.a());
            a4rVar.f = new sm60(recyclerView, new rm60(recyclerView, null));
            a4rVar.g(hux.c.C3024c.a);
            a4rVar.g(hux.f.b.a);
            if (((Boolean) this.O.getValue()).booleanValue()) {
                recyclerView.addOnScrollListener((y3v) this.j0.getValue());
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new l960(this, 5));
            this.f0.b(new e2e0().a(new c230(swipeDrawableRefreshLayout, 18)));
        }
        DefaultErrorView defaultErrorView = this.c0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(new l6s(this, i));
        }
        DefaultEmptyView defaultEmptyView = this.d0;
        if (defaultEmptyView != null) {
            defaultEmptyView.setImage(0);
            defaultEmptyView.setText(R.string.no_postponed_posts);
        }
        BuildInfo.h();
        this.T.b.g.a(new nl30(this, 17));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new j5b0(this, i));
        fo().i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_POSTPONED_POSTS;
    }
}
