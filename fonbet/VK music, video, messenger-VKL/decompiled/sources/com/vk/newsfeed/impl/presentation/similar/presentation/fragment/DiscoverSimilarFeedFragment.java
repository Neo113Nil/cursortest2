package com.vk.newsfeed.impl.presentation.similar.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a4r;
import xsna.a7n;
import xsna.ad0;
import xsna.asu0;
import xsna.aw60;
import xsna.b7n;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c5r;
import xsna.c7n;
import xsna.d1;
import xsna.dhr0;
import xsna.dne;
import xsna.doq;
import xsna.drg;
import xsna.dui;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ee;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.fb80;
import xsna.fh9;
import xsna.fo60;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g0t;
import xsna.g4g;
import xsna.gqo;
import xsna.gzs;
import xsna.h3p0;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.hux;
import xsna.j6f0;
import xsna.j7n;
import xsna.ju4;
import xsna.jz60;
import xsna.k7f;
import xsna.lbs;
import xsna.ldl;
import xsna.lmc;
import xsna.lpj;
import xsna.lxd;
import xsna.m1k;
import xsna.m7m;
import xsna.m8n;
import xsna.ml7;
import xsna.mo60;
import xsna.msy;
import xsna.nr60;
import xsna.nu0;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.ohh0;
import xsna.or60;
import xsna.oz50;
import xsna.p90;
import xsna.pce;
import xsna.pd4;
import xsna.pds;
import xsna.pn60;
import xsna.pr1;
import xsna.puq0;
import xsna.q7n;
import xsna.qcy;
import xsna.qn60;
import xsna.r5i;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.s3q0;
import xsna.sm60;
import xsna.sr60;
import xsna.t7n;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.uq60;
import xsna.v16;
import xsna.v6n;
import xsna.w6n;
import xsna.wjs0;
import xsna.wqf;
import xsna.x4;
import xsna.x5i;
import xsna.x6n;
import xsna.xl60;
import xsna.xn60;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.y6n;
import xsna.yl60;
import xsna.yo60;
import xsna.z0h;
import xsna.z6n;
import xsna.zjf0;
import xsna.zkh;

/* compiled from: DiscoverSimilarFeedFragment.kt */
/* loaded from: classes4.dex */
public final class DiscoverSimilarFeedFragment extends FragmentImpl implements pds, ohh0 {
    public static final /* synthetic */ qcy<Object>[] s0;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public qn60 R;
    public pn60 S;
    public final bpn0 T;
    public final nzw U;
    public final x6n V;
    public final bpn0 W;
    public final bpn0 X;
    public final d Y;
    public final e Z;
    public VkTopBar a0;
    public RecyclerView b0;
    public SwipeDrawableRefreshLayout c0;
    public View d0;
    public ee e0;
    public AppBarLayout f0;
    public View g0;
    public final io.reactivex.rxjava3.disposables.b h0;
    public bin0<Context> i0;
    public boolean j0;
    public final Object k0;
    public final Object l0;
    public ek40 m0;
    public gzs<s3q0> n0;
    public final Object o0;
    public final lxd p0;
    public y6n q0;
    public final b r0;

    /* compiled from: DiscoverSimilarFeedFragment.kt */
    public static final class a extends oz50 {
        public a(String str) {
            super(DiscoverSimilarFeedFragment.class, null, null);
            this.j.putString("feed_id", str);
            this.j.putString(X3.a.t, "empty");
        }

        public final void y(List list) {
            if (list != null) {
                ArrayList<? extends Parcelable> arrayList = list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list);
                Bundle bundle = this.j;
                bundle.putParcelableArrayList("posts", arrayList);
                bundle.putString(X3.a.t, "prefilled");
            }
        }
    }

    /* compiled from: DiscoverSimilarFeedFragment.kt */
    public static final class b extends FragmentImpl.b {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
            if (((Boolean) DiscoverSimilarFeedFragment.this.Q.getValue()).booleanValue()) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: DiscoverSimilarFeedFragment.kt */
    public static final /* synthetic */ class c implements fb80.a, g0t {
        public c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, DiscoverSimilarFeedFragment.this, DiscoverSimilarFeedFragment.class, "getScreenName", "getScreenName()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.fb80.a
        public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
            qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
            return DiscoverSimilarFeedFragment.this.ho();
        }
    }

    /* compiled from: DiscoverSimilarFeedFragment.kt */
    public static final class d implements fo60 {
        public d() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            q7n aVar;
            qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
            v6n v6nVar = (v6n) DiscoverSimilarFeedFragment.this.W.getValue();
            if (xn60Var instanceof xn60.a) {
                aVar = new q7n.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d.a) {
                aVar = q7n.d.a.b;
            } else if (xn60Var instanceof xn60.d.c) {
                aVar = q7n.d.c.b;
            } else if (xn60Var instanceof xn60.d.b) {
                aVar = q7n.d.b.b;
            } else if (xn60Var instanceof xn60.b) {
                aVar = new q7n.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new q7n.c.a((xn60.c) xn60Var);
            }
            v6nVar.a(aVar);
        }
    }

    /* compiled from: DiscoverSimilarFeedFragment.kt */
    public static final class e implements bq60 {
        public e() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
            b7n b7nVar = (b7n) DiscoverSimilarFeedFragment.this.X.getValue();
            c7n.a((y6n) b7nVar.a.invoke(), (DiscoverSimilarFeedFragment) b7nVar.b.c, b7nVar.c.invoke(), b7nVar.d.invoke(), new t7n.a(yo60Var));
        }
    }

    /* compiled from: DiscoverSimilarFeedFragment.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DiscoverSimilarFeedFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/similar/presentation/feature/DiscoverSimilarFeedMviStore;", 0);
        fpf0.a.getClass();
        s0 = new qcy[]{propertyReference1Impl};
    }

    public DiscoverSimilarFeedFragment() {
        dne dneVar = new dne(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, dneVar);
        this.O = msy.a(lazyThreadSafetyMode, new d1(11));
        this.P = msy.a(lazyThreadSafetyMode, new pd4(11));
        this.Q = msy.a(lazyThreadSafetyMode, new ml7(7));
        this.T = new bpn0(new g4g(this, 9));
        this.U = new nzw(fpf0.d(m8n.class).toString(), this, new z0h(this, 7));
        this.V = new x6n(0);
        this.W = new bpn0(new drg(this, 10));
        this.X = new bpn0(new wqf(this, 15));
        this.Y = new d();
        this.Z = new e();
        this.h0 = new io.reactivex.rxjava3.disposables.b();
        this.i0 = new bin0() { // from class: xsna.e7n
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return DiscoverSimilarFeedFragment.this.mo2getContext();
            }
        };
        this.k0 = msy.a(lazyThreadSafetyMode, new pce(this, 20));
        this.l0 = msy.a(lazyThreadSafetyMode, new pr1(18));
        this.o0 = msy.a(lazyThreadSafetyMode, new ldl(this, 4));
        this.p0 = new lxd(null);
        this.r0 = new b();
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

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.r0;
    }

    @Override // xsna.ohh0
    public final void Y1(final int i, final int i2) {
        if (getParentFragment() != null) {
            if (lbs.r(this)) {
                return;
            }
        } else if (isHidden() || Mn()) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !p90.f(activity)) {
            AppBarLayout appBarLayout = this.f0;
            if (appBarLayout != null) {
                appBarLayout.g(false, false, true);
            }
            RecyclerView recyclerView = this.b0;
            if (recyclerView != null) {
                recyclerView.post(new Runnable() { // from class: xsna.g7n
                    @Override // java.lang.Runnable
                    public final void run() {
                        qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                        DiscoverSimilarFeedFragment discoverSimilarFeedFragment = DiscoverSimilarFeedFragment.this;
                        discoverSimilarFeedFragment.eo().a.n.j(i, i2, discoverSimilarFeedFragment.g0);
                    }
                });
            }
        }
    }

    public final y6n eo() {
        y6n y6nVar = this.q0;
        if (y6nVar != null) {
            return y6nVar;
        }
        bin0<Context> bin0Var = this.i0;
        ju4 ju4Var = new ju4(go(), go());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.T, this.D, new tr60(Kn != null ? Kn.d : null, false, new InitializedLazyImpl(Boolean.FALSE), FullSourceJoinApi.EntryServiceType.DISCOVER, null, null, 417), this.Y, this.Z, this.h0, msy.a(LazyThreadSafetyMode.NONE, new r5i(this, 8)), new c(), null);
        mo60Var.e = this.i0;
        y6n y6nVar2 = new y6n(bin0Var, mo60Var);
        if (!this.j0) {
            this.q0 = y6nVar2;
        }
        return y6nVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AtomicReference<String> go() {
        return (AtomicReference) this.o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final MobileOfficialAppsCoreNavStat$EventScreen ho() {
        String str = io().getCurrentState().f;
        if (str.length() == 0) {
            str = ((w6n) this.N.getValue()).e;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS;
        if (str.equals(t0.a(mobileOfficialAppsCoreNavStat$EventScreen))) {
            return mobileOfficialAppsCoreNavStat$EventScreen;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST_SIMILAR_NEWS;
        if (str.equals(t0.a(mobileOfficialAppsCoreNavStat$EventScreen2))) {
            return mobileOfficialAppsCoreNavStat$EventScreen2;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN;
        return str.equals(t0.a(mobileOfficialAppsCoreNavStat$EventScreen3)) ? mobileOfficialAppsCoreNavStat$EventScreen3 : MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST;
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.n0 = gzsVar;
        }
    }

    public final m8n io() {
        qcy<Object> qcyVar = s0[0];
        return (m8n) this.U.getValue();
    }

    public final void jo(VkTopBar vkTopBar) {
        if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
            vkTopBar.setBack(null);
            return;
        }
        vkTopBar.setBack(new VkTopBar.b(new x5i(this, 10), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new x4(29), 3), 12));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        VkTopBar vkTopBar = this.a0;
        if (vkTopBar != null) {
            jo(vkTopBar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) eo().a.U.getValue()).d();
        eo().b().k(getActivity(), eo().a.n);
        fo().h();
        ((o170) eo().a.V.getValue()).b(this.b0);
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
        this.m0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext();
        return layoutInflater.inflate(R.layout.fragment_similar_feed, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.m0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.m0 = null;
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
        this.n0 = null;
        this.h0.e();
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
        y6n y6nVar = this.q0;
        if (y6nVar != null) {
            y6nVar.a.a();
        }
        this.q0 = null;
        this.j0 = true;
        b7n b7nVar = (b7n) this.X.getValue();
        b7nVar.c = z6n.c;
        b7nVar.d = a7n.b;
        this.i0 = doqVar;
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
        this.p0.a();
        ek40 ek40Var = this.m0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.m0 = null;
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
            recyclerView4.removeOnScrollListener((dui) eo().a.T.getValue());
        }
        if (((Boolean) this.O.getValue()).booleanValue() && (recyclerView2 = this.b0) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.l0.getValue());
        }
        RecyclerView recyclerView5 = this.b0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) eo().e.b;
        if (ehvVar != null && (recyclerView = this.b0) != null) {
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
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        ee eeVar = this.e0;
        if (eeVar != null) {
            eeVar.setRetryClickListener(null);
        }
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
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
        gzs<s3q0> gzsVar = this.n0;
        if (gzsVar != null) {
            this.n0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
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
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        ehv ehvVar;
        super.onViewCreated(view, bundle);
        this.a0 = (VkTopBar) view.findViewById(R.id.toolbar);
        this.b0 = (RecyclerView) view.findViewById(R.id.list);
        this.c0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.d0 = view.findViewById(R.id.progressbar);
        this.e0 = (ee) view.findViewById(R.id.error_view);
        this.f0 = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        FragmentActivity activity = getActivity();
        this.g0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        VkTopBar vkTopBar = this.a0;
        if (vkTopBar != null) {
            vkTopBar.setOnClickListener(new v16(this, 3));
            jo(vkTopBar);
        }
        RecyclerView recyclerView = this.b0;
        if (recyclerView != null) {
            y6n eo = eo();
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
                recyclerView.addOnScrollListener((y3v) this.l0.getValue());
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.c0;
        if (swipeDrawableRefreshLayout != null) {
            view.getContext();
            swipeDrawableRefreshLayout.setOnRefreshListener(new nu0(this, 20));
            this.h0.b(new e2e0().a(new zkh(swipeDrawableRefreshLayout, 9)));
        }
        ee eeVar = this.e0;
        if (eeVar != null) {
            eeVar.setRetryClickListener(new j7n(this, 0));
        }
        BuildInfo.h();
        this.V.b.g.a(new k7f(this, 12));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new m1k(this, 4));
        fo().i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = ho();
    }
}
