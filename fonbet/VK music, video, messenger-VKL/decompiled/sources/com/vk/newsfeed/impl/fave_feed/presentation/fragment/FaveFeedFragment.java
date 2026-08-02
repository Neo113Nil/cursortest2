package com.vk.newsfeed.impl.fave_feed.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.a;
import com.vk.fave.api.FaveLoadState;
import com.vk.fave.entities.FaveType;
import com.vk.newsfeed.common.views.fave.FavesAllEmptyView;
import com.vk.newsfeed.common.views.fave.FavesEmptyListView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
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
import xsna.bfm;
import xsna.bin0;
import xsna.boq;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c5r;
import xsna.cn70;
import xsna.coq;
import xsna.doq;
import xsna.drg;
import xsna.dui;
import xsna.dv2;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ehv;
import xsna.ek40;
import xsna.eoq;
import xsna.epx;
import xsna.fb80;
import xsna.fh9;
import xsna.fo60;
import xsna.fpf0;
import xsna.fto0;
import xsna.fxc0;
import xsna.g0t;
import xsna.gqo;
import xsna.gzs;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.ho60;
import xsna.hux;
import xsna.j6f0;
import xsna.ju4;
import xsna.jz60;
import xsna.l370;
import xsna.lmc;
import xsna.lpq;
import xsna.lxd;
import xsna.m1o;
import xsna.m7m;
import xsna.mo60;
import xsna.moq;
import xsna.msy;
import xsna.n3i;
import xsna.n6f;
import xsna.n7;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.ocg;
import xsna.ohh0;
import xsna.omf;
import xsna.oqq;
import xsna.or60;
import xsna.oz50;
import xsna.p90;
import xsna.pds;
import xsna.pn60;
import xsna.puq0;
import xsna.pvh;
import xsna.qcy;
import xsna.qhh0;
import xsna.qn60;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.s1c0;
import xsna.s3q0;
import xsna.sje;
import xsna.sm60;
import xsna.soq;
import xsna.sqq;
import xsna.sr60;
import xsna.srq;
import xsna.sw60;
import xsna.tc60;
import xsna.tr60;
import xsna.uoq;
import xsna.uq60;
import xsna.voq;
import xsna.vq60;
import xsna.wjs0;
import xsna.wq60;
import xsna.wt60;
import xsna.x3i;
import xsna.x5i;
import xsna.xa80;
import xsna.xah0;
import xsna.xl60;
import xsna.xn60;
import xsna.xq60;
import xsna.xu0;
import xsna.xzs;
import xsna.y22;
import xsna.y3i;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.z1h0;
import xsna.zjf0;
import xsna.zqq;

/* compiled from: FaveFeedFragment.kt */
/* loaded from: classes4.dex */
public final class FaveFeedFragment extends FragmentImpl implements pds, qhh0, ohh0 {
    public static final /* synthetic */ qcy<Object>[] s0;
    public final AtomicReference<String> N = new AtomicReference<>("FAVE");
    public final AtomicReference<String> O = new AtomicReference<>("FAVE");
    public final Object P;
    public final Object Q;
    public qn60 R;
    public pn60 S;
    public final bpn0 T;
    public final nzw U;
    public final wt60 V;
    public final bpn0 W;
    public final bpn0 X;
    public final c Y;
    public final d Z;
    public AppBarLayout a0;
    public RecyclerView b0;
    public SwipeDrawableRefreshLayout c0;
    public View d0;
    public VkErrorView e0;
    public FavesEmptyListView f0;
    public FavesAllEmptyView g0;
    public View h0;
    public final io.reactivex.rxjava3.disposables.b i0;
    public bin0<Context> j0;
    public boolean k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public ek40 o0;
    public gzs<s3q0> p0;
    public final lxd q0;
    public coq r0;

    /* compiled from: FaveFeedFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: FaveFeedFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[FaveType.values().length];
    }

    /* compiled from: FaveFeedFragment.kt */
    public static final class c implements fo60 {
        public c() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            uoq voqVar;
            qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
            boq boqVar = (boq) FaveFeedFragment.this.W.getValue();
            if (xn60Var instanceof xn60.a) {
                voqVar = new uoq.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                voqVar = new uoq.c((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                voqVar = new uoq.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                voqVar = new voq((xn60.c) xn60Var);
            }
            boqVar.a(voqVar);
        }
    }

    /* compiled from: FaveFeedFragment.kt */
    public static final class d implements bq60 {
        public d() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
            xq60 xq60Var = (xq60) FaveFeedFragment.this.X.getValue();
            sw60 invoke = xq60Var.a.invoke();
            invoke.a().b(invoke.b(), xq60Var.b.invoke(), xq60Var.c.invoke(), xq60Var.d.invoke(), yo60Var);
        }
    }

    /* compiled from: FaveFeedFragment.kt */
    public static final /* synthetic */ class e implements bin0, g0t {
        public final /* synthetic */ AtomicReference<String> b;

        public e(AtomicReference<String> atomicReference) {
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FaveFeedFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/fave_feed/presentation/feature/FaveFeedMviStore;", 0);
        fpf0.a.getClass();
        s0 = new qcy[]{propertyReference1Impl};
    }

    public FaveFeedFragment() {
        drg drgVar = new drg(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, drgVar);
        this.Q = msy.a(lazyThreadSafetyMode, new xu0(14));
        this.T = new bpn0(new ocg(this, 16));
        this.U = new nzw(fpf0.d(lpq.class).toString(), this, new x3i(this, 9));
        this.V = l370.t();
        this.W = new bpn0(new y3i(this, 7));
        this.X = new bpn0(new x5i(this, 15));
        this.Y = new c();
        this.Z = new d();
        this.i0 = new io.reactivex.rxjava3.disposables.b();
        this.j0 = new bin0() { // from class: xsna.loq
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                return FaveFeedFragment.this.mo2getContext();
            }
        };
        this.l0 = msy.a(lazyThreadSafetyMode, new sje(this, 26));
        this.m0 = msy.a(lazyThreadSafetyMode, new bfm(this, 6));
        this.n0 = msy.a(lazyThreadSafetyMode, new dv2(17));
        this.q0 = new lxd(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        ((tc60) go().q.getValue()).c();
        go().d().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        ho().g();
    }

    @Override // xsna.ohh0
    public final void Y1(final int i, final int i2) {
        if (fto0.n(this)) {
            FragmentActivity activity = getActivity();
            if (activity == null || !p90.f(activity)) {
                AppBarLayout appBarLayout = this.a0;
                if (appBarLayout != null) {
                    appBarLayout.g(false, false, true);
                }
                RecyclerView recyclerView = this.b0;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable() { // from class: xsna.goq
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                            FaveFeedFragment faveFeedFragment = FaveFeedFragment.this;
                            faveFeedFragment.go().a.n.j(i, i2, faveFeedFragment.h0);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zqq eo() {
        return (zqq) this.P.getValue();
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen fo() {
        MobileOfficialAppsCoreNavStat$EventScreen i;
        FaveType faveType = eo().a;
        if ((faveType == null ? -1 : b.$EnumSwitchMapping$0[faveType.ordinal()]) == -1) {
            return MobileOfficialAppsCoreNavStat$EventScreen.FAVE;
        }
        FaveType faveType2 = eo().a;
        return (faveType2 == null || (i = faveType2.i()) == null) ? MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE : i;
    }

    public final coq go() {
        coq coqVar = this.r0;
        if (coqVar != null) {
            return coqVar;
        }
        bin0<Context> bin0Var = this.j0;
        ju4 ju4Var = new ju4(this.N, this.O);
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.T, this.D, new tr60(Kn != null ? Kn.d : null, true, null, null, null, null, 489), this.Y, this.Z, this.i0, msy.a(LazyThreadSafetyMode.NONE, new pvh(this, 6)), new fb80.a() { // from class: xsna.foq
            @Override // xsna.fb80.a
            public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                return FaveFeedFragment.this.fo();
            }
        }, null);
        mo60Var.e = this.j0;
        coq coqVar2 = new coq(bin0Var, mo60Var);
        if (!this.k0) {
            this.r0 = coqVar2;
        }
        return coqVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 ho() {
        return (uq60) this.l0.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        boolean isResumed = isResumed();
        gzs<s3q0> gzsVar2 = this.p0;
        if (isResumed) {
            gzsVar.invoke();
            gzsVar = gzsVar2;
        }
        this.p0 = gzsVar;
    }

    public final lpq io() {
        qcy<Object> qcyVar = s0[0];
        return (lpq) this.U.getValue();
    }

    public final void jo(FaveLoadState faveLoadState) {
        if (eo().a != null) {
            return;
        }
        z1h0 parentFragment = getParentFragment();
        srq srqVar = parentFragment instanceof srq ? (srq) parentFragment : null;
        if (srqVar != null) {
            srqVar.Im(faveLoadState);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) go().q.getValue()).d();
        go().d().k(getActivity(), go().a.n);
        ho().h();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.Y));
        ho().b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        go().a.n.g(hux.f.b.a);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        his0.d++;
        if (his0.c == null || !(!r4.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.o0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_fave_feed, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.o0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.o0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        go().d().e();
        ehv ehvVar = (ehv) go().g.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        go().g.b = null;
        this.p0 = null;
        this.i0.e();
        io().clear();
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
        coq coqVar = this.r0;
        if (coqVar != null) {
            coqVar.a.a();
        }
        this.r0 = null;
        this.k0 = true;
        xq60 xq60Var = (xq60) this.X.getValue();
        xq60Var.c = vq60.c;
        xq60Var.d = wq60.c;
        this.j0 = doqVar;
        eoq eoqVar = (eoq) this.m0.getValue();
        eoqVar.b = doqVar;
        eoqVar.e = new doq();
        eoqVar.c = new doq();
        eoqVar.d = new doq();
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
        this.q0.a();
        ek40 ek40Var = this.o0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.o0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        this.V.clear();
        go().a.d().a();
        RecyclerView recyclerView3 = this.b0;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.b0;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) go().p.getValue());
        }
        if (((Boolean) this.Q.getValue()).booleanValue() && (recyclerView2 = this.b0) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.n0.getValue());
        }
        RecyclerView recyclerView5 = this.b0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) go().g.b;
        if (ehvVar != null && (recyclerView = this.b0) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        go().a.n.b();
        go().c().F0((or60) go().j.getValue());
        go().c().F0((oc60) go().k.getValue());
        go().c().G0((rl60) go().l.getValue());
        go().c().G0(((sr60) go().f.getValue()).c);
        go().c().G0((zjf0) go().m.getValue());
        go().c().k = null;
        go().c().E0();
        go().c().clear();
        go().d().f();
        ehv ehvVar2 = (ehv) go().g.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) go().u.getValue()).d();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        VkErrorView vkErrorView = this.e0;
        if (vkErrorView != null) {
            vkErrorView.setRetryClickListener(null);
        }
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.h0 = null;
        ho().c();
        go().a.n.c();
        go().a.n.f = null;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            gqo.f(view, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        go().d().g();
        ((yl60) go().u.getValue()).a();
        super.onPause();
        ho().d();
        ehv ehvVar = (ehv) go().g.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ho().e();
        go().d().j();
        ehv ehvVar = (ehv) go().g.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) go().u.getValue()).b();
        gzs<s3q0> gzsVar = this.p0;
        if (gzsVar != null) {
            this.p0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager;
        RecyclerView.u rruVar;
        ehv ehvVar;
        super.onViewCreated(view, bundle);
        this.a0 = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        this.b0 = (RecyclerView) view.findViewById(R.id.list);
        this.c0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.d0 = view.findViewById(R.id.fave_feed_progress);
        this.e0 = (VkErrorView) view.findViewById(R.id.fave_feed_error);
        this.f0 = (FavesEmptyListView) view.findViewById(R.id.fave_feed_empty);
        this.g0 = (FavesAllEmptyView) view.findViewById(R.id.fave_feed_empty_all);
        FragmentActivity activity = getActivity();
        this.h0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerView recyclerView = this.b0;
        if (recyclerView != null) {
            coq go = go();
            ?? r1 = go.u;
            ?? r2 = go.f;
            ?? r3 = go.t;
            ?? r4 = go.p;
            fh9 fh9Var = go.g;
            mo60 mo60Var = go.a;
            go().a.n.h(recyclerView);
            recyclerView.setHasFixedSize(true);
            Context context = recyclerView.getContext();
            ho60 c2 = go.c();
            com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) r3.getValue();
            FaveType faveType = eo().a;
            FaveType faveType2 = FaveType.PRODUCT;
            if (faveType == faveType2) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
                gridLayoutManager.x = new moq(c2);
                focusableLinearLayoutManager = gridLayoutManager;
            } else {
                EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager2 = new EntriesListFragment.FocusableLinearLayoutManager(context, this, dVar);
                focusableLinearLayoutManager2.setOrientation(1);
                focusableLinearLayoutManager = focusableLinearLayoutManager2;
            }
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
            ((tc60) go.q.getValue()).a(recyclerView);
            ((o170) go.r.getValue()).a(recyclerView);
            aw60 e2 = mo60Var.e();
            a4r a4rVar = mo60Var.n;
            e2.a();
            ((dui) r4.getValue()).l(new j6f0(((sr60) r2.getValue()).a()));
            bw60 bw60Var = new bw60(recyclerView);
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                ehvVar = new ehv(mo2getContext, bw60Var, fh9Var.a());
                recyclerView.addOnScrollListener(ehvVar);
            } else {
                ehvVar = null;
            }
            fh9Var.b = ehvVar;
            if (eo().a != null) {
                xah0 xah0Var = ((s1c0) this.T.getValue()).q;
                recyclerView.addItemDecoration(new sqq((xah0Var == null || !xah0Var.c) ? 0 : cn70.b(8), cn70.b(8)));
                if (eo().a == faveType2) {
                    recyclerView.addItemDecoration(new oqq(cn70.b(4), cn70.b(0), cn70.b(10)));
                }
            } else {
                recyclerView.addItemDecoration(new soq());
            }
            recyclerView.setItemAnimator((hm60) go.w.getValue());
            go.c().C0((or60) go.j.getValue());
            go.c().C0((oc60) go.k.getValue());
            go.c().D0(((sr60) r2.getValue()).c);
            go.c().D0((rl60) go.l.getValue());
            go.c().D0((zjf0) go.m.getValue());
            dui duiVar = (dui) r4.getValue();
            yl60 yl60Var = (yl60) r1.getValue();
            yl60Var.getClass();
            duiVar.l(new xl60(yl60Var));
            ((yl60) r1.getValue()).c();
            com.vk.stat.recycler.d dVar2 = (com.vk.stat.recycler.d) r3.getValue();
            if (dVar2 != null) {
                go.c().k = dVar2;
            }
            recyclerView.setAdapter(go.c());
            bs60 d2 = go.d();
            getActivity();
            d2.i(recyclerView, go.c());
            a4rVar.f = new sm60(recyclerView, new rm60(recyclerView, null));
            a4rVar.g(hux.c.C3024c.a);
            a4rVar.g(hux.f.b.a);
            if (((Boolean) this.Q.getValue()).booleanValue()) {
                recyclerView.addOnScrollListener((y3v) this.n0.getValue());
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new n7(this, 24));
            this.i0.b(new e2e0().a(new n3i(swipeDrawableRefreshLayout, 18)));
        }
        VkErrorView vkErrorView = this.e0;
        if (vkErrorView != null) {
            vkErrorView.setRetryClickListener(new xa80() { // from class: xsna.hoq
                @Override // xsna.xa80
                public final void b() {
                    qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                    ((boq) FaveFeedFragment.this.W.getValue()).a(new uoq.c(xn60.d.a.b));
                }
            });
            vkErrorView.c(a.C0851a.a(vkErrorView.getContext(), new m1o(this, 3)));
        }
        BuildInfo.h();
        this.V.b.g.a(new omf(this, 13));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new n6f(this, 23));
        ho().i();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return fto0.u(this.b0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = fo();
    }
}
