package com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment;

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
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.DefaultEmptyView;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ad0;
import xsna.af60;
import xsna.asu0;
import xsna.b1z;
import xsna.bf60;
import xsna.bfm;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.cf00;
import xsna.cty;
import xsna.dhr0;
import xsna.doq;
import xsna.dui;
import xsna.dw60;
import xsna.e2e0;
import xsna.e7q0;
import xsna.ee;
import xsna.ehv;
import xsna.ek40;
import xsna.el30;
import xsna.epx;
import xsna.f20;
import xsna.f4m;
import xsna.fb80;
import xsna.fm20;
import xsna.fo60;
import xsna.fpf0;
import xsna.fto0;
import xsna.g0t;
import xsna.gf60;
import xsna.gqo;
import xsna.gzs;
import xsna.his0;
import xsna.hl60;
import xsna.hux;
import xsna.jjx;
import xsna.js00;
import xsna.js60;
import xsna.ju4;
import xsna.lmc;
import xsna.lpj;
import xsna.lxd;
import xsna.m7m;
import xsna.mo60;
import xsna.msy;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.odq;
import xsna.ohh0;
import xsna.or60;
import xsna.oz50;
import xsna.p90;
import xsna.pds;
import xsna.pf60;
import xsna.pn60;
import xsna.puq0;
import xsna.qcy;
import xsna.qfj;
import xsna.qhh0;
import xsna.qn60;
import xsna.rf60;
import xsna.rl60;
import xsna.s3q0;
import xsna.sr60;
import xsna.tc60;
import xsna.te60;
import xsna.tr60;
import xsna.ue60;
import xsna.uq60;
import xsna.vx6;
import xsna.w4u;
import xsna.we60;
import xsna.wjs0;
import xsna.xe60;
import xsna.xn60;
import xsna.xsw;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.ye60;
import xsna.yf60;
import xsna.yl60;
import xsna.yo60;
import xsna.zds;
import xsna.ze60;
import xsna.zjf0;

/* compiled from: NewsfeedCustomFragment2.kt */
/* loaded from: classes4.dex */
public final class NewsfeedCustomFragment2 extends FragmentImpl implements pds, qhh0, ohh0, dw60, zds {
    public static final /* synthetic */ qcy<Object>[] r0;
    public final Object N;
    public final Object O;
    public qn60 P;
    public pn60 Q;
    public final bpn0 R;
    public final AtomicBoolean S;
    public final nzw T;
    public final we60 U;
    public final bpn0 V;
    public final bpn0 W;
    public final d X;
    public final e Y;
    public RecyclerView Z;
    public SwipeDrawableRefreshLayout a0;
    public View b0;
    public ee c0;
    public View d0;
    public AppBarLayout e0;
    public View f0;
    public int g0;
    public final io.reactivex.rxjava3.disposables.b h0;
    public bin0<Context> i0;
    public boolean j0;
    public final Object k0;
    public ek40 l0;
    public gzs<s3q0> m0;
    public final Object n0;
    public final lxd o0;
    public xe60 p0;
    public final b q0;

    /* compiled from: NewsfeedCustomFragment2.kt */
    public static final class a extends oz50 {
        public a(String str) {
            super(NewsfeedCustomFragment2.class, null, null);
            this.j.putString("feed_id", str);
        }
    }

    /* compiled from: NewsfeedCustomFragment2.kt */
    public static final class b extends FragmentImpl.b {
        public b() {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
            if (NewsfeedCustomFragment2.this.eo().j) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: NewsfeedCustomFragment2.kt */
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
            return new FunctionReferenceImpl(0, NewsfeedCustomFragment2.this, NewsfeedCustomFragment2.class, "getCurrentScreenName", "getCurrentScreenName()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.fb80.a
        public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
            String str = NewsfeedCustomFragment2.this.eo().c;
            return epx.f(str, "discover_category_trends") ? MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_FULL_TABS : epx.f(str, "shops_posts") ? MobileOfficialAppsCoreNavStat$EventScreen.SHOPS_FEED_POSTS : MobileOfficialAppsCoreNavStat$EventScreen.FEED_EXTERNAL;
        }
    }

    /* compiled from: NewsfeedCustomFragment2.kt */
    public static final class d implements fo60 {
        public d() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            pf60 aVar;
            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
            te60 te60Var = (te60) NewsfeedCustomFragment2.this.V.getValue();
            if (xn60Var instanceof xn60.a) {
                aVar = new pf60.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                aVar = new pf60.d((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                aVar = new pf60.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new pf60.c.a((xn60.c) xn60Var);
            }
            te60Var.a(aVar);
        }
    }

    /* compiled from: NewsfeedCustomFragment2.kt */
    public static final class e implements bq60 {
        public e() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
            af60 af60Var = (af60) NewsfeedCustomFragment2.this.W.getValue();
            bf60.a((xe60) af60Var.a.invoke(), (NewsfeedCustomFragment2) af60Var.b.c, af60Var.c.invoke(), af60Var.d.invoke(), new rf60.a(yo60Var));
        }
    }

    /* compiled from: NewsfeedCustomFragment2.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedCustomFragment2.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/newsfeed_custom/presentation/feature/NewsfeedCustomMviStore;", 0);
        fpf0.a.getClass();
        r0 = new qcy[]{propertyReference1Impl};
    }

    public NewsfeedCustomFragment2() {
        cf00 cf00Var = new cf00(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, cf00Var);
        int i = 25;
        this.O = msy.a(lazyThreadSafetyMode, new f20(i));
        this.R = new bpn0(new bfm(this, i));
        this.S = new AtomicBoolean(true);
        this.T = new nzw(fpf0.d(yf60.class).toString(), this, new qfj(this, 29));
        this.U = new we60(0);
        this.V = new bpn0(new w4u(this, 23));
        this.W = new bpn0(new cty(this, 15));
        this.X = new d();
        this.Y = new e();
        this.h0 = new io.reactivex.rxjava3.disposables.b();
        this.i0 = new bin0() { // from class: xsna.cf60
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return NewsfeedCustomFragment2.this.mo2getContext();
            }
        };
        this.k0 = msy.a(lazyThreadSafetyMode, new xsw(this, 15));
        this.n0 = msy.a(lazyThreadSafetyMode, new fm20(this, 6));
        this.o0 = new lxd(VideoAutoPlayDelayType.FEED);
        this.q0 = new b();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        ((tc60) fo().a.U.getValue()).c();
        fo().b().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        go().g();
        ((o170) fo().a.V.getValue()).c();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.q0;
    }

    @Override // xsna.dw60
    public final void Nb(boolean z) {
        io().b(new pf60.e.b());
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
                    recyclerView.post(new Runnable() { // from class: xsna.ef60
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                            NewsfeedCustomFragment2 newsfeedCustomFragment2 = NewsfeedCustomFragment2.this;
                            newsfeedCustomFragment2.fo().a.n.j(i, i2, newsfeedCustomFragment2.f0);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ue60 eo() {
        return (ue60) this.N.getValue();
    }

    public final xe60 fo() {
        xe60 xe60Var = this.p0;
        if (xe60Var != null) {
            return xe60Var;
        }
        bin0<Context> bin0Var = this.i0;
        ju4 ju4Var = new ju4(ho(), ho());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, true, null, null, null, VideoAutoPlayDelayType.FEED, 489), this.X, this.Y, this.h0, msy.a(LazyThreadSafetyMode.NONE, new b1z(this, 10)), new c(), null);
        mo60Var.e = this.i0;
        xe60 xe60Var2 = new xe60(bin0Var, mo60Var);
        if (!this.j0) {
            this.p0 = xe60Var2;
        }
        return xe60Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 go() {
        return (uq60) this.k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AtomicReference<String> ho() {
        return (AtomicReference) this.n0.getValue();
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

    public final yf60 io() {
        qcy<Object> qcyVar = r0[0];
        return (yf60) this.T.getValue();
    }

    public final void jo() {
        if (eo().j) {
            int i = this.g0;
            if (i < 0) {
                i = 0;
            }
            RecyclerView recyclerView = this.Z;
            if (recyclerView != null) {
                recyclerView.setClipToPadding(false);
                f4m.y(i, recyclerView);
            }
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setInContentTopInset(i);
            }
        }
    }

    @Override // xsna.dw60
    public final void nd(boolean z) {
        if (this.S.compareAndSet(!z, z) && z) {
            io().b(pf60.e.a.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) fo().a.U.getValue()).d();
        fo().b().k(getActivity(), fo().a.n);
        go().h();
        ((o170) fo().a.V.getValue()).b(this.Z);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.X));
        go().b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fo().a.n.g(hux.f.b.a);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("NewsfeedCustomFragmentWasCreated", true);
        }
        his0.d++;
        if (his0.c == null || !(!r4.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.l0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext();
        return layoutInflater.inflate(R.layout.fragment_newsfeed_custom, viewGroup, false);
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
        fo().b().e();
        ehv ehvVar = (ehv) fo().e.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        fo().e.b = null;
        this.m0 = null;
        this.h0.e();
        io().clear();
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
        xe60 xe60Var = this.p0;
        if (xe60Var != null) {
            xe60Var.a.a();
        }
        this.p0 = null;
        this.j0 = true;
        af60 af60Var = (af60) this.W.getValue();
        af60Var.c = ye60.b;
        af60Var.d = ze60.b;
        this.i0 = doqVar;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
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
        this.U.clear();
        fo().a.d().a();
        RecyclerView recyclerView3 = this.Z;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.Z;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) fo().a.T.getValue());
        }
        if (((Boolean) this.O.getValue()).booleanValue() && (recyclerView2 = this.Z) != null) {
            recyclerView2.removeOnScrollListener((y3v) fo().a.g0.getValue());
        }
        RecyclerView recyclerView5 = this.Z;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) fo().e.b;
        if (ehvVar != null && (recyclerView = this.Z) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        fo().a.n.b();
        fo().a().F0((or60) fo().a.t.getValue());
        fo().a().F0((oc60) fo().a.z.getValue());
        fo().a().G0((rl60) fo().a.A.getValue());
        fo().a().G0(((sr60) fo().a.o.getValue()).c);
        fo().a().G0((zjf0) fo().a.B.getValue());
        fo().a().k = null;
        fo().a().E0();
        fo().a().clear();
        fo().b().f();
        ehv ehvVar2 = (ehv) fo().e.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) fo().a.b0.getValue()).d();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        ee eeVar = this.c0;
        if (eeVar != null) {
            eeVar.setRetryClickListener(null);
        }
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.e0 = null;
        this.f0 = null;
        this.d0 = null;
        go().c();
        fo().a.n.c();
        fo().a.n.f = null;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            gqo.f(view, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        fo().b().g();
        ((yl60) fo().a.b0.getValue()).a();
        super.onPause();
        go().d();
        ehv ehvVar = (ehv) fo().e.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        go().e();
        fo().b().j();
        ehv ehvVar = (ehv) fo().e.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) fo().a.b0.getValue()).b();
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

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NewsfeedCustomFragment2 newsfeedCustomFragment2;
        View rootView;
        super.onViewCreated(view, bundle);
        this.Z = (RecyclerView) view.findViewById(R.id.list);
        this.a0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.b0 = view.findViewById(R.id.newsfeed_custom_progress);
        this.c0 = (ee) view.findViewById(R.id.newsfeed_custom_error);
        View findViewById = view.findViewById(R.id.newsfeed_custom_empty);
        if (findViewById != null) {
            DefaultEmptyView defaultEmptyView = findViewById instanceof DefaultEmptyView ? (DefaultEmptyView) findViewById : null;
            if (defaultEmptyView != null) {
                defaultEmptyView.a();
            }
        } else {
            findViewById = null;
        }
        this.d0 = findViewById;
        FragmentActivity activity = getActivity();
        this.f0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerView recyclerView = this.Z;
        AppBarLayout appBarLayout = (recyclerView == null || (rootView = recyclerView.getRootView()) == null) ? null : (AppBarLayout) rootView.findViewById(R.id.app_bar_layout);
        this.e0 = appBarLayout != null ? appBarLayout : null;
        RecyclerView recyclerView2 = this.Z;
        if (recyclerView2 != null) {
            newsfeedCustomFragment2 = this;
            odq.b(m7m.d(this), newsfeedCustomFragment2, getActivity(), mo2getContext(), recyclerView2, fo().a.j0, true, false);
        } else {
            newsfeedCustomFragment2 = this;
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = newsfeedCustomFragment2.a0;
        if (swipeDrawableRefreshLayout != null) {
            view.getContext();
            swipeDrawableRefreshLayout.setOnRefreshListener(new vx6(this, 25));
            newsfeedCustomFragment2.h0.b(new e2e0().a(new el30(swipeDrawableRefreshLayout, 7)));
        }
        jo();
        ee eeVar = newsfeedCustomFragment2.c0;
        if (eeVar != null) {
            eeVar.setRetryClickListener(new gf60(0, this));
        }
        BuildInfo.h();
        newsfeedCustomFragment2.U.b.g.a(new jjx(this, 19));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new js00(6, this, new js60()));
        go().i();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return fto0.u(this.Z);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        String str = eo().c;
        uiTrackingScreen.a = epx.f(str, "discover_category_trends") ? MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_FULL_TABS : epx.f(str, "shops_posts") ? MobileOfficialAppsCoreNavStat$EventScreen.SHOPS_FEED_POSTS : MobileOfficialAppsCoreNavStat$EventScreen.FEED_EXTERNAL;
        if (eo().g) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.DISCOVER_CATEGORY, null, null, null, eo().d, null, 46, null);
        }
    }

    @Override // xsna.zds
    public final void zm(int i) {
        if (eo().j) {
            this.g0 = i;
            jo();
        }
    }
}
