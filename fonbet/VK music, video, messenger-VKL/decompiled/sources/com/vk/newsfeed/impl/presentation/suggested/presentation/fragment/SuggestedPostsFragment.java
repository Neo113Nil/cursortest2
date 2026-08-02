package com.vk.newsfeed.impl.presentation.suggested.presentation.fragment;

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
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
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
import xsna.ajd0;
import xsna.asu0;
import xsna.aw60;
import xsna.b3m0;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c5r;
import xsna.d4n0;
import xsna.doq;
import xsna.dui;
import xsna.e20;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ece0;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.fh9;
import xsna.fo60;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g0t;
import xsna.gqo;
import xsna.gzs;
import xsna.h3p0;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.hux;
import xsna.j6f0;
import xsna.ju4;
import xsna.jz60;
import xsna.k4n0;
import xsna.l370;
import xsna.l4n0;
import xsna.lbc0;
import xsna.lj50;
import xsna.lmc;
import xsna.lxd;
import xsna.m7m;
import xsna.mlf0;
import xsna.mo60;
import xsna.msy;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.or50;
import xsna.or60;
import xsna.oyt;
import xsna.oz50;
import xsna.pds;
import xsna.pn60;
import xsna.puq0;
import xsna.pvh0;
import xsna.qc00;
import xsna.qcy;
import xsna.qn60;
import xsna.rka0;
import xsna.rl60;
import xsna.rm60;
import xsna.rme0;
import xsna.rru;
import xsna.s3q0;
import xsna.sm60;
import xsna.sr60;
import xsna.sw60;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.uq60;
import xsna.utg0;
import xsna.v3n0;
import xsna.vq60;
import xsna.w4n0;
import xsna.wjs0;
import xsna.wq60;
import xsna.wt30;
import xsna.wt60;
import xsna.x3n0;
import xsna.x550;
import xsna.xa80;
import xsna.xl60;
import xsna.xn60;
import xsna.xq60;
import xsna.xzs;
import xsna.y22;
import xsna.y3l0;
import xsna.y3n0;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.zjf0;
import xsna.zlm0;

/* compiled from: SuggestedPostsFragment.kt */
/* loaded from: classes4.dex */
public final class SuggestedPostsFragment extends FragmentImpl implements pds {
    public static final /* synthetic */ qcy<Object>[] r0;
    public final AtomicReference<String> N = new AtomicReference<>("postponed");
    public final AtomicReference<String> O = new AtomicReference<>("");
    public final Object P;
    public final Object Q;
    public qn60 R;
    public pn60 S;
    public final bpn0 T;
    public final nzw U;
    public final wt60 V;
    public final bpn0 W;
    public final bpn0 X;
    public final b Y;
    public final c Z;
    public VkTopBar a0;
    public RecyclerView b0;
    public SwipeDrawableRefreshLayout c0;
    public View d0;
    public DefaultErrorView e0;
    public DefaultEmptyView f0;
    public View g0;
    public final io.reactivex.rxjava3.disposables.b h0;
    public bin0<Context> i0;
    public boolean j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public ek40 n0;
    public gzs<s3q0> o0;
    public final lxd p0;
    public x3n0 q0;

    /* compiled from: SuggestedPostsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: SuggestedPostsFragment.kt */
    public static final class b implements fo60 {
        public b() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 l4n0Var;
            qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
            v3n0 v3n0Var = (v3n0) SuggestedPostsFragment.this.W.getValue();
            if (xn60Var instanceof xn60.a) {
                l4n0Var = new k4n0.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                l4n0Var = new k4n0.c((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                l4n0Var = new k4n0.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                l4n0Var = new l4n0((xn60.c) xn60Var);
            }
            w4n0 w4n0Var = (w4n0) v3n0Var.a.invoke();
            if (w4n0Var != null) {
                w4n0Var.b(l4n0Var);
            }
        }
    }

    /* compiled from: SuggestedPostsFragment.kt */
    public static final class c implements bq60 {
        public c() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
            xq60 xq60Var = (xq60) SuggestedPostsFragment.this.X.getValue();
            sw60 invoke = xq60Var.a.invoke();
            invoke.a().b(invoke.b(), xq60Var.b.invoke(), xq60Var.c.invoke(), xq60Var.d.invoke(), yo60Var);
        }
    }

    /* compiled from: SuggestedPostsFragment.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuggestedPostsFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/suggested/presentation/feature/SuggestedPostsMviStore;", 0);
        fpf0.a.getClass();
        r0 = new qcy[]{propertyReference1Impl};
    }

    public SuggestedPostsFragment() {
        lbc0 lbc0Var = new lbc0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, lbc0Var);
        this.Q = msy.a(lazyThreadSafetyMode, new qc00(13));
        this.T = new bpn0(new pvh0(this, 5));
        this.U = new nzw(fpf0.d(w4n0.class).toString(), this, new rme0(this, 9));
        this.V = l370.t();
        this.W = new bpn0(new wt30(this, 24));
        this.X = new bpn0(new ajd0(this, 11));
        this.Y = new b();
        this.Z = new c();
        this.h0 = new io.reactivex.rxjava3.disposables.b();
        this.i0 = new bin0() { // from class: xsna.z3n0
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return SuggestedPostsFragment.this.mo2getContext();
            }
        };
        this.k0 = msy.a(lazyThreadSafetyMode, new x550(this, 29));
        this.l0 = msy.a(lazyThreadSafetyMode, new y3l0(this, 7));
        this.m0 = msy.a(lazyThreadSafetyMode, new e20(27));
        this.p0 = new lxd(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        ((tc60) eo().q.getValue()).c();
        eo().d().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        fo().g();
        ((o170) eo().r.getValue()).c();
    }

    public final x3n0 eo() {
        x3n0 x3n0Var = this.q0;
        if (x3n0Var != null) {
            return x3n0Var;
        }
        bin0<Context> bin0Var = this.i0;
        ju4 ju4Var = new ju4(this.N, this.O);
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.T, this.D, new tr60(Kn != null ? Kn.d : null, false, null, null, null, null, 505), this.Y, this.Z, this.h0, msy.a(LazyThreadSafetyMode.NONE, new rka0(this, 22)), new d4n0(), null);
        mo60Var.e = this.i0;
        x3n0 x3n0Var2 = new x3n0(bin0Var, mo60Var);
        if (!this.j0) {
            this.q0 = x3n0Var2;
        }
        return x3n0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.k0.getValue();
    }

    public final w4n0 go() {
        qcy<Object> qcyVar = r0[0];
        return (w4n0) this.U.getValue();
    }

    public final void ho(VkTopBar vkTopBar) {
        if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
            vkTopBar.setBack(null);
            return;
        }
        vkTopBar.setBack(new VkTopBar.b(new mlf0(this, 6), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new zlm0(2), 3), 12));
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.o0 = gzsVar;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        VkTopBar vkTopBar = this.a0;
        if (vkTopBar != null) {
            ho(vkTopBar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) eo().q.getValue()).d();
        eo().d().k(getActivity(), eo().a.n);
        fo().h();
        ((o170) eo().r.getValue()).b(this.b0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.Y));
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
        this.n0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_postponed_posts, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.n0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.n0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        eo().d().e();
        ehv ehvVar = (ehv) eo().g.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        eo().g.b = null;
        this.o0 = null;
        this.h0.e();
        go().clear();
        pn60 pn60Var = this.S;
        if (pn60Var != null) {
            pn60Var.a();
        }
        this.S = null;
        qn60 qn60Var = this.R;
        if (qn60Var != null) {
            qn60Var.a();
        }
        this.R = null;
        x3n0 x3n0Var = this.q0;
        if (x3n0Var != null) {
            x3n0Var.a.a();
        }
        this.q0 = null;
        this.j0 = true;
        xq60 xq60Var = (xq60) this.X.getValue();
        xq60Var.c = vq60.c;
        xq60Var.d = wq60.c;
        this.i0 = doqVar;
        y3n0 y3n0Var = (y3n0) this.l0.getValue();
        y3n0Var.b = doqVar;
        y3n0Var.e = new doq();
        y3n0Var.c = new doq();
        y3n0Var.d = new doq();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        io.reactivex.rxjava3.disposables.c cVar;
        this.p0.a();
        ek40 ek40Var = this.n0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.n0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        this.V.clear();
        eo().a.d().a();
        RecyclerView recyclerView3 = this.b0;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.b0;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) eo().p.getValue());
        }
        if (((Boolean) this.Q.getValue()).booleanValue() && (recyclerView2 = this.b0) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.m0.getValue());
        }
        RecyclerView recyclerView5 = this.b0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) eo().g.b;
        if (ehvVar != null && (recyclerView = this.b0) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        eo().a.n.b();
        eo().c().F0((or60) eo().j.getValue());
        eo().c().F0((oc60) eo().k.getValue());
        eo().c().G0((rl60) eo().l.getValue());
        eo().c().G0(((sr60) eo().f.getValue()).c);
        eo().c().G0((zjf0) eo().m.getValue());
        eo().c().k = null;
        eo().c().E0();
        eo().c().clear();
        eo().d().f();
        ehv ehvVar2 = (ehv) eo().g.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) eo().u.getValue()).d();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        DefaultErrorView defaultErrorView = this.e0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(null);
        }
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

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        eo().d().g();
        ((yl60) eo().u.getValue()).a();
        super.onPause();
        J0();
        fo().d();
        ehv ehvVar = (ehv) eo().g.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o1();
        fo().e();
        eo().d().j();
        ehv ehvVar = (ehv) eo().g.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) eo().u.getValue()).b();
        gzs<s3q0> gzsVar = this.o0;
        if (gzsVar != null) {
            this.o0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        RecyclerView.t tVar;
        super.onViewCreated(view, bundle);
        this.a0 = (VkTopBar) view.findViewById(R.id.toolbar);
        this.b0 = (RecyclerView) view.findViewById(R.id.list);
        this.c0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.d0 = view.findViewById(R.id.progressbar);
        this.e0 = (DefaultErrorView) view.findViewById(R.id.error_view);
        this.f0 = (DefaultEmptyView) view.findViewById(R.id.empty_view);
        FragmentActivity activity = getActivity();
        this.g0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        VkTopBar vkTopBar = this.a0;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.suggested_posts_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            vkTopBar.setOnClickListener(new oyt(this, 8));
            ho(vkTopBar);
        }
        RecyclerView recyclerView = this.b0;
        if (recyclerView != null) {
            x3n0 eo = eo();
            ?? r1 = eo.u;
            ?? r2 = eo.f;
            ?? r3 = eo.t;
            ?? r4 = eo.p;
            fh9 fh9Var = eo.g;
            mo60 mo60Var = eo.a;
            eo().a.n.h(recyclerView);
            recyclerView.setHasFixedSize(true);
            EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(recyclerView.getContext(), this, (com.vk.stat.recycler.d) r3.getValue());
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
            recyclerView.addOnScrollListener((dui) r4.getValue());
            ((tc60) eo.q.getValue()).a(recyclerView);
            ((o170) eo.r.getValue()).a(recyclerView);
            aw60 e = mo60Var.e();
            a4r a4rVar = mo60Var.n;
            e.a();
            ((dui) r4.getValue()).l(new j6f0(((sr60) r2.getValue()).a()));
            bw60 bw60Var = new bw60(recyclerView);
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                tVar = new ehv(mo2getContext, bw60Var, fh9Var.a());
                recyclerView.addOnScrollListener(tVar);
            } else {
                tVar = null;
            }
            fh9Var.b = tVar;
            recyclerView.setItemAnimator((hm60) eo.w.getValue());
            eo.c().C0((or60) eo.j.getValue());
            eo.c().C0((oc60) eo.k.getValue());
            eo.c().D0(((sr60) r2.getValue()).c);
            eo.c().D0((rl60) eo.l.getValue());
            eo.c().D0((zjf0) eo.m.getValue());
            dui duiVar = (dui) r4.getValue();
            yl60 yl60Var = (yl60) r1.getValue();
            yl60Var.getClass();
            duiVar.l(new xl60(yl60Var));
            ((yl60) r1.getValue()).c();
            com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) r3.getValue();
            if (dVar != null) {
                eo.c().k = dVar;
            }
            recyclerView.setAdapter(eo.c());
            bs60 d2 = eo.d();
            getActivity();
            d2.i(recyclerView, eo.c());
            a4rVar.f = new sm60(recyclerView, new rm60(recyclerView, null));
            a4rVar.g(hux.c.C3024c.a);
            a4rVar.g(hux.f.b.a);
            if (((Boolean) this.Q.getValue()).booleanValue()) {
                recyclerView.addOnScrollListener((y3v) this.m0.getValue());
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new utg0(this, 5));
            this.h0.b(new e2e0().a(new ece0(swipeDrawableRefreshLayout, 10)));
        }
        DefaultErrorView defaultErrorView = this.e0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.c4n0
                @Override // xsna.xa80
                public final void b() {
                    qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                    v3n0 v3n0Var = (v3n0) SuggestedPostsFragment.this.W.getValue();
                    k4n0.c cVar = new k4n0.c(xn60.d.a.b);
                    w4n0 w4n0Var = (w4n0) v3n0Var.a.invoke();
                    if (w4n0Var != null) {
                        w4n0Var.b(cVar);
                    }
                }
            });
        }
        DefaultEmptyView defaultEmptyView = this.f0;
        if (defaultEmptyView != null) {
            defaultEmptyView.setImage(0);
            defaultEmptyView.setText(R.string.no_suggested_posts);
        }
        BuildInfo.h();
        this.V.b.g.a(new b3m0(this, 2));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new or50(this, 28));
        fo().i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_SUGGESTED_POSTS;
    }
}
