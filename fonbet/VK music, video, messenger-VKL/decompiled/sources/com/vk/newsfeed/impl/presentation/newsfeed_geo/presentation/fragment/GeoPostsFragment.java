package com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment;

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
import com.vk.movika.sdk.base.ui.g0;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
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
import xsna.akh;
import xsna.asu0;
import xsna.aw60;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c5r;
import xsna.dgm;
import xsna.dlt;
import xsna.doq;
import xsna.dui;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.fh9;
import xsna.flt;
import xsna.fo60;
import xsna.fpf0;
import xsna.fto0;
import xsna.fxc0;
import xsna.g0t;
import xsna.glt;
import xsna.gqo;
import xsna.gzs;
import xsna.h2m0;
import xsna.h3p0;
import xsna.h6g;
import xsna.h9h;
import xsna.his0;
import xsna.hl60;
import xsna.hlt;
import xsna.hm60;
import xsna.hmt;
import xsna.hux;
import xsna.hy2;
import xsna.ilt;
import xsna.j6f0;
import xsna.jlt;
import xsna.ju4;
import xsna.jz60;
import xsna.k6k;
import xsna.klt;
import xsna.l370;
import xsna.lj50;
import xsna.lmc;
import xsna.lxd;
import xsna.m7m;
import xsna.mag;
import xsna.mo60;
import xsna.msy;
import xsna.mxj;
import xsna.n5i;
import xsna.nfj;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.o6;
import xsna.oc60;
import xsna.ohh0;
import xsna.ol60;
import xsna.olt;
import xsna.or60;
import xsna.ot;
import xsna.oz50;
import xsna.p90;
import xsna.pds;
import xsna.pn60;
import xsna.puq0;
import xsna.qcy;
import xsna.qhh0;
import xsna.qn60;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.s3q0;
import xsna.sm60;
import xsna.sr60;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.tt0;
import xsna.ufk;
import xsna.ult;
import xsna.uq60;
import xsna.uy60;
import xsna.v3o;
import xsna.vam;
import xsna.vlt;
import xsna.wjs0;
import xsna.wt60;
import xsna.xl60;
import xsna.xlt;
import xsna.xn60;
import xsna.xyh;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.zjf0;

/* compiled from: GeoPostsFragment.kt */
/* loaded from: classes4.dex */
public final class GeoPostsFragment extends FragmentImpl implements pds, qhh0, ohh0 {
    public static final /* synthetic */ qcy<Object>[] q0;
    public final Object N;
    public final Object O;
    public qn60 P;
    public pn60 Q;
    public final bpn0 R;
    public final nzw S;
    public final wt60 T;
    public final bpn0 U;
    public final bpn0 V;
    public final c W;
    public final d X;
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
    public flt p0;

    /* compiled from: GeoPostsFragment.kt */
    public static final class a extends oz50 {
        public a(int i) {
            super(GeoPostsFragment.class, null, null);
            this.j.putInt("arg_place_id", i);
        }
    }

    /* compiled from: GeoPostsFragment.kt */
    public static final class c implements fo60 {
        public c() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 vltVar;
            qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
            dlt dltVar = (dlt) GeoPostsFragment.this.U.getValue();
            if (xn60Var instanceof xn60.a) {
                vltVar = new ult.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                vltVar = new ult.c((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                vltVar = new ult.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                vltVar = new vlt((xn60.c) xn60Var);
            }
            hmt hmtVar = (hmt) dltVar.a.invoke();
            if (hmtVar != null) {
                hmtVar.b(vltVar);
            }
        }
    }

    /* compiled from: GeoPostsFragment.kt */
    public static final class d implements bq60 {
        public d() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
            ilt iltVar = (ilt) GeoPostsFragment.this.V.getValue();
            jlt.a((flt) iltVar.a.invoke(), (GeoPostsFragment) iltVar.b.c, iltVar.c.invoke(), iltVar.d.invoke(), new xlt.a(yo60Var));
        }
    }

    /* compiled from: GeoPostsFragment.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GeoPostsFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/newsfeed_geo/presentation/feature/GeoPostsMviStore;", 0);
        fpf0.a.getClass();
        q0 = new qcy[]{propertyReference1Impl};
    }

    public GeoPostsFragment() {
        k6k k6kVar = new k6k(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, k6kVar);
        this.O = msy.a(lazyThreadSafetyMode, new o6(15));
        this.R = new bpn0(new akh(this, 21));
        this.S = new nzw(fpf0.d(hmt.class).toString(), this, new xyh(this, 16));
        this.T = l370.t();
        this.U = new bpn0(new mag(this, 25));
        this.V = new bpn0(new dgm(this, 11));
        this.W = new c();
        this.X = new d();
        this.g0 = new io.reactivex.rxjava3.disposables.b();
        this.h0 = new klt(0, this);
        this.j0 = msy.a(lazyThreadSafetyMode, new ufk(this, 7));
        this.k0 = msy.a(lazyThreadSafetyMode, new hy2(12));
        this.n0 = msy.a(lazyThreadSafetyMode, new g0(22));
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
                    recyclerView.post(new Runnable() { // from class: xsna.mlt
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                            GeoPostsFragment geoPostsFragment = GeoPostsFragment.this;
                            geoPostsFragment.eo().a.n.j(i, i2, geoPostsFragment.f0);
                        }
                    });
                }
            }
        }
    }

    public final flt eo() {
        flt fltVar = this.p0;
        if (fltVar != null) {
            return fltVar;
        }
        bin0<Context> bin0Var = this.h0;
        ju4 ju4Var = new ju4(go(), go());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, false, null, null, null, null, 505), this.W, this.X, this.g0, msy.a(LazyThreadSafetyMode.NONE, new mxj(this, 19)), new olt(), null);
        mo60Var.e = this.h0;
        flt fltVar2 = new flt(bin0Var, mo60Var);
        if (!this.i0) {
            this.p0 = fltVar2;
        }
        return fltVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AtomicReference<String> go() {
        return (AtomicReference) this.n0.getValue();
    }

    public final hmt ho() {
        qcy<Object> qcyVar = q0[0];
        return (hmt) this.S.getValue();
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
        vkTopBar.setBack(new VkTopBar.b(new n5i(this, 18), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new ot(27), 3), 12));
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
        return layoutInflater.inflate(R.layout.fragment_posts_from_notifications, viewGroup, false);
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
        flt fltVar = this.p0;
        if (fltVar != null) {
            fltVar.a.a();
        }
        this.p0 = null;
        this.i0 = true;
        ilt iltVar = (ilt) this.V.getValue();
        iltVar.c = glt.c;
        iltVar.d = hlt.b;
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
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
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
        this.e0 = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        FragmentActivity activity = getActivity();
        this.f0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.place), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            vkTopBar.setOnClickListener(new v3o(this, 3));
            io(vkTopBar);
        }
        RecyclerView recyclerView = this.Z;
        int i = 1;
        if (recyclerView != null) {
            flt eo = eo();
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
            eo.a().D0(new b());
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
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new tt0(this, 24));
            this.g0.b(new e2e0().a(new h6g(swipeDrawableRefreshLayout, 20)));
        }
        DefaultErrorView defaultErrorView = this.c0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(new h9h(this, i));
        }
        DefaultEmptyView defaultEmptyView = this.d0;
        if (defaultEmptyView != null) {
            defaultEmptyView.a();
        }
        BuildInfo.h();
        this.T.b.g.a(new nfj(this, 22));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new vam(this, 14));
        fo().i();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return fto0.u(this.Z);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_PLACE;
    }

    /* compiled from: GeoPostsFragment.kt */
    public static final class b implements zjf0<ol60> {
        @Override // xsna.zjf0
        public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
            ol60 ol60Var2 = ol60Var;
            if ((e0Var instanceof h2m0) && (ol60Var2 instanceof uy60)) {
                ((h2m0) e0Var).V5(((uy60) ol60Var2).h);
            }
        }

        @Override // xsna.zjf0
        public final void e(RecyclerView.e0 e0Var) {
            if (e0Var instanceof h2m0) {
                e0Var.itemView.setPadding(0, 0, 0, 0);
            }
        }

        @Override // xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
        }
    }
}
