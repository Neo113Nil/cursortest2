package com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
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
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.recyclerview.ReactionsFeedLinearLayoutManager;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a4f0;
import xsna.a4r;
import xsna.ad0;
import xsna.asu0;
import xsna.aw60;
import xsna.b4f0;
import xsna.bin0;
import xsna.bj6;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c230;
import xsna.c5r;
import xsna.d4f0;
import xsna.doq;
import xsna.dui;
import xsna.e2e0;
import xsna.e7q0;
import xsna.e810;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.fh9;
import xsna.fo60;
import xsna.fpf0;
import xsna.fr20;
import xsna.fto0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.g0t;
import xsna.gqo;
import xsna.gzs;
import xsna.h3p0;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.hux;
import xsna.io60;
import xsna.irc0;
import xsna.j6f0;
import xsna.jrc0;
import xsna.ju4;
import xsna.jz60;
import xsna.jz70;
import xsna.k3f0;
import xsna.k6c0;
import xsna.l370;
import xsna.lmc;
import xsna.lxd;
import xsna.m3f0;
import xsna.m7m;
import xsna.mo60;
import xsna.msy;
import xsna.n3f0;
import xsna.nh40;
import xsna.nr60;
import xsna.o170;
import xsna.o3f0;
import xsna.o4f0;
import xsna.oc60;
import xsna.ohh0;
import xsna.ol60;
import xsna.or60;
import xsna.oz50;
import xsna.p90;
import xsna.pb00;
import xsna.pds;
import xsna.pf40;
import xsna.pn60;
import xsna.puq0;
import xsna.q3f0;
import xsna.qbe0;
import xsna.qcy;
import xsna.qhh0;
import xsna.qn60;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.s3q0;
import xsna.sm60;
import xsna.sr60;
import xsna.t210;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.u1h0;
import xsna.uh80;
import xsna.uq60;
import xsna.vq60;
import xsna.w100;
import xsna.wjs0;
import xsna.wq60;
import xsna.wt60;
import xsna.wwf0;
import xsna.wx30;
import xsna.xa80;
import xsna.xl60;
import xsna.xn60;
import xsna.xv0;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.z4d0;
import xsna.zjf0;

/* compiled from: ReactionsFeedFragment.kt */
/* loaded from: classes4.dex */
public final class ReactionsFeedFragment extends FragmentImpl implements pds, qhh0, ohh0 {
    public static final /* synthetic */ qcy<Object>[] q0;
    public final Object N;
    public final Object O;
    public qn60 P;
    public pn60 Q;
    public final bpn0 R;
    public final u1h0 S;
    public final wt60 T;
    public final bpn0 U;
    public final bpn0 V;
    public final d W;
    public final e X;
    public VkTopBar Y;
    public RecyclerView Z;
    public SwipeDrawableRefreshLayout a0;
    public View b0;
    public DefaultErrorView c0;
    public DefaultEmptyView d0;
    public AppBarLayout e0;
    public View f0;
    public final io.reactivex.rxjava3.disposables.b g0;
    public bin0<Context> h0;
    public boolean i0;
    public final Object j0;
    public final Object k0;
    public ek40 l0;
    public gzs<s3q0> m0;
    public final Object n0;
    public final lxd o0;
    public m3f0 p0;

    /* compiled from: ReactionsFeedFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ReactionsFeedFragment.kt */
    public static final class c {
        public final RecyclerView a;
        public final bpn0 b;

        public c(RecyclerView recyclerView, bpn0 bpn0Var) {
            this.a = recyclerView;
            this.b = bpn0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(int i) {
            List<ol60> list = ((ReactionsFeedMviState) ((o4f0) this.b.getValue()).getCurrentState()).c.b.a;
            return i < list.size() && list.get(i).b == 1109;
        }
    }

    /* compiled from: ReactionsFeedFragment.kt */
    public static final class d implements fo60 {
        public d() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            a4f0 b4f0Var;
            qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
            k3f0 k3f0Var = (k3f0) ReactionsFeedFragment.this.U.getValue();
            if (xn60Var instanceof xn60.a) {
                b4f0Var = new a4f0.b((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                b4f0Var = new a4f0.d((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                b4f0Var = new a4f0.c((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                b4f0Var = new b4f0((xn60.c) xn60Var);
            }
            k3f0Var.a(b4f0Var);
        }
    }

    /* compiled from: ReactionsFeedFragment.kt */
    public static final class e implements bq60 {
        public e() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
            n3f0 n3f0Var = (n3f0) ReactionsFeedFragment.this.V.getValue();
            o3f0.a((m3f0) n3f0Var.a.invoke(), (ReactionsFeedFragment) n3f0Var.b.c, n3f0Var.c.invoke(), n3f0Var.d.invoke(), new d4f0.a(yo60Var));
        }
    }

    /* compiled from: ReactionsFeedFragment.kt */
    public static final /* synthetic */ class f implements bin0, g0t {
        public final /* synthetic */ AtomicReference<String> b;

        public f(AtomicReference<String> atomicReference) {
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ReactionsFeedFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/newsfeed_reactions/presentation/feature/ReactionsFeedMviStore;", 0);
        fpf0.a.getClass();
        q0 = new qcy[]{propertyReference1Impl};
    }

    public ReactionsFeedFragment() {
        z4d0 z4d0Var = new z4d0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, z4d0Var);
        this.O = msy.a(lazyThreadSafetyMode, new uh80(4));
        this.R = new bpn0(new fr20(this, 27));
        this.S = new u1h0(fpf0.d(o4f0.class).toString(), this, this, new pf40(this, 12));
        this.T = l370.t();
        this.U = new bpn0(new w100(this, 28));
        this.V = new bpn0(new fyd0(this, 2));
        this.W = new d();
        this.X = new e();
        this.g0 = new io.reactivex.rxjava3.disposables.b();
        this.h0 = new bin0() { // from class: xsna.w3f0
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return ReactionsFeedFragment.this.mo2getContext();
            }
        };
        this.j0 = msy.a(lazyThreadSafetyMode, new jz70(this, 16));
        this.k0 = msy.a(lazyThreadSafetyMode, new qbe0(2));
        this.n0 = msy.a(lazyThreadSafetyMode, new xv0(20));
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

    @Override // xsna.ohh0
    public final void Y1(final int i, final int i2) {
        if (fto0.n(this)) {
            FragmentActivity activity = getActivity();
            if (activity == null || !p90.f(activity)) {
                AppBarLayout appBarLayout = this.e0;
                if (appBarLayout != null) {
                    appBarLayout.g(false, false, true);
                }
                RecyclerView recyclerView = this.Z;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable() { // from class: xsna.t3f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                            ReactionsFeedFragment reactionsFeedFragment = ReactionsFeedFragment.this;
                            reactionsFeedFragment.eo().a.n.j(i, i2, reactionsFeedFragment.f0);
                        }
                    });
                }
            }
        }
    }

    public final m3f0 eo() {
        m3f0 m3f0Var = this.p0;
        if (m3f0Var != null) {
            return m3f0Var;
        }
        bin0<Context> bin0Var = this.h0;
        ju4 ju4Var = new ju4(go(), go());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, false, null, null, null, null, 489), this.W, this.X, this.g0, msy.a(LazyThreadSafetyMode.NONE, new irc0(this, 4)), new jrc0(1), null);
        mo60Var.e = this.h0;
        m3f0 m3f0Var2 = new m3f0(bin0Var, mo60Var);
        if (!this.i0) {
            this.p0 = m3f0Var2;
        }
        return m3f0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AtomicReference<String> go() {
        return (AtomicReference) this.n0.getValue();
    }

    public final o4f0 ho() {
        qcy<Object> qcyVar = q0[0];
        return (o4f0) this.S.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        boolean isResumed = isResumed();
        gzs<s3q0> gzsVar2 = this.m0;
        if (isResumed) {
            gzsVar.invoke();
            gzsVar = gzsVar2;
        }
        this.m0 = gzsVar;
    }

    public final void io(VkTopBar vkTopBar) {
        if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
            vkTopBar.setBack(null);
            return;
        }
        vkTopBar.setBack(new VkTopBar.b(new t210(this, 27), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new wx30(9), 3), 12));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar != null) {
            io(vkTopBar);
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
        this.l0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_feed_reactions, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.l0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.l0 = null;
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
        this.m0 = null;
        this.g0.e();
        ho().clear();
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
        m3f0 m3f0Var = this.p0;
        if (m3f0Var != null) {
            m3f0Var.a.a();
        }
        this.p0 = null;
        this.i0 = true;
        n3f0 n3f0Var = (n3f0) this.V.getValue();
        n3f0Var.c = vq60.e;
        n3f0Var.d = wq60.e;
        this.h0 = doqVar;
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
        ek40 ek40Var = this.l0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.l0 = null;
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
            recyclerView2.removeOnScrollListener((y3v) this.k0.getValue());
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
        this.e0 = null;
        this.f0 = null;
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
        gzs<s3q0> gzsVar = this.m0;
        if (gzsVar != null) {
            this.m0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        ehv ehvVar;
        super.onViewCreated(view, bundle);
        this.Y = (VkTopBar) view.findViewById(R.id.toolbar);
        this.Z = (RecyclerView) view.findViewById(R.id.list);
        this.a0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.b0 = view.findViewById(R.id.progressbar);
        this.c0 = (DefaultErrorView) view.findViewById(R.id.error_view);
        this.d0 = (DefaultEmptyView) view.findViewById(R.id.empty_view);
        this.e0 = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        FragmentActivity activity = getActivity();
        this.f0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.sett_reactions), null, null, null, null, 30), new VkTopBar.Middle.Text.c(new tlo0.f(R.string.feed_reactions_privacy_description), null, null, 30), null, null, 12));
            vkTopBar.setOnClickListener(new bj6(this, 6));
            io(vkTopBar);
        }
        RecyclerView recyclerView = this.Z;
        int i = 1;
        if (recyclerView != null) {
            m3f0 eo = eo();
            mo60 mo60Var = eo.a;
            fh9 fh9Var = eo.e;
            eo().a.n.h(recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.getContext();
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = new ReactionsFeedLinearLayoutManager();
            reactionsFeedLinearLayoutManager.y = new c(recyclerView, new bpn0(new io60(this, 19)));
            recyclerView.setLayoutManager(reactionsFeedLinearLayoutManager);
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
            aw60 e2 = mo60Var.e();
            a4r a4rVar = mo60Var.n;
            e2.a();
            ((dui) mo60Var.T.getValue()).l(new j6f0(((sr60) mo60Var.o.getValue()).a()));
            bw60 bw60Var = new bw60(recyclerView);
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                ehvVar = new ehv(mo2getContext, bw60Var, fh9Var.a());
                recyclerView.addOnScrollListener(ehvVar);
            } else {
                ehvVar = null;
            }
            fh9Var.b = ehvVar;
            recyclerView.setItemAnimator((hm60) mo60Var.f0.getValue());
            eo.a().C0((or60) mo60Var.t.getValue());
            eo.a().C0((oc60) mo60Var.z.getValue());
            eo.a().D0(((sr60) mo60Var.o.getValue()).c);
            eo.a().D0((rl60) mo60Var.A.getValue());
            eo.a().D0((zjf0) mo60Var.B.getValue());
            eo.a().D0(new b((k3f0) this.U.getValue(), wwf0.q((ReactionsFeedMviState) ho().getCurrentState())));
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
                recyclerView.addOnScrollListener((y3v) this.k0.getValue());
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a0;
        int i2 = 22;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new k6c0(this, i));
            this.g0.b(new e2e0().a(new e810(swipeDrawableRefreshLayout, i2)));
        }
        DefaultErrorView defaultErrorView = this.c0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.u3f0
                @Override // xsna.xa80
                public final void b() {
                    qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                    ((k3f0) ReactionsFeedFragment.this.U.getValue()).a(new a4f0.d(xn60.d.a.b));
                }
            });
        }
        DefaultEmptyView defaultEmptyView = this.d0;
        if (defaultEmptyView != null) {
            defaultEmptyView.a();
        }
        BuildInfo.h();
        this.T.b.g.a(new pb00(this, 20));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new c230(this, i2));
        fo().i();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return fto0.u(this.Z);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES;
    }

    /* compiled from: ReactionsFeedFragment.kt */
    public static final class b implements zjf0<ol60> {
        public final k3f0 b;
        public final int c;

        public b(k3f0 k3f0Var, int i) {
            this.b = k3f0Var;
            this.c = i;
        }

        @Override // xsna.zjf0
        public final /* bridge */ /* synthetic */ void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        }

        @Override // xsna.zjf0
        public final void e(RecyclerView.e0 e0Var) {
            if (e0Var instanceof q3f0) {
                com.vk.newsfeed.impl.feedlikes.a aVar = ((q3f0) e0Var).E;
                aVar.a(this.c);
                aVar.setOnFilterSelectedListener(new nh40(this, 11));
            }
        }

        @Override // xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
        }
    }
}
