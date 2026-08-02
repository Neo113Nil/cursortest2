package com.vk.newsfeed.impl.presentation.search.presentation.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.X3;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.DefaultErrorView;
import com.vk.movika.sdk.base.ui.o0;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ad0;
import xsna.ar60;
import xsna.ax60;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bx60;
import xsna.cx60;
import xsna.d02;
import xsna.doq;
import xsna.dx60;
import xsna.e2e0;
import xsna.ehv;
import xsna.epx;
import xsna.ex60;
import xsna.f540;
import xsna.fb80;
import xsna.fkq0;
import xsna.fnj;
import xsna.fo60;
import xsna.fpf0;
import xsna.fto0;
import xsna.g0t;
import xsna.gqo;
import xsna.gzs;
import xsna.h2m0;
import xsna.hcw0;
import xsna.ho60;
import xsna.hux;
import xsna.hvz;
import xsna.iah0;
import xsna.js60;
import xsna.ju4;
import xsna.ko00;
import xsna.l0i0;
import xsna.l1i;
import xsna.lj50;
import xsna.lmc;
import xsna.lx60;
import xsna.lxz;
import xsna.m7m;
import xsna.mo60;
import xsna.msy;
import xsna.nr60;
import xsna.nzw;
import xsna.odq;
import xsna.ohh0;
import xsna.ol60;
import xsna.orl;
import xsna.oz50;
import xsna.p90;
import xsna.pds;
import xsna.px60;
import xsna.qc00;
import xsna.qcy;
import xsna.qhh0;
import xsna.qu50;
import xsna.qx60;
import xsna.rkt;
import xsna.s3q0;
import xsna.sl30;
import xsna.sx60;
import xsna.sy50;
import xsna.tr60;
import xsna.tzv;
import xsna.u210;
import xsna.ul50;
import xsna.uy60;
import xsna.wic;
import xsna.wp40;
import xsna.wt30;
import xsna.ww60;
import xsna.xa80;
import xsna.xd40;
import xsna.xn60;
import xsna.xrj;
import xsna.xw60;
import xsna.xzs;
import xsna.y22;
import xsna.yl60;
import xsna.yo60;
import xsna.yx60;
import xsna.zjf0;
import xsna.zl20;

/* compiled from: NewsfeedSearchFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedSearchFragment extends FragmentImpl implements pds, qhh0, ohh0 {
    public static final /* synthetic */ qcy<Object>[] p0;
    public final Object N;
    public final e O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public String S;
    public VkSearchView T;
    public io.reactivex.rxjava3.disposables.c U;
    public final c V;
    public final bpn0 W;
    public final AtomicBoolean X;
    public final nzw Y;
    public final wic Z;
    public final bpn0 a0;
    public final bpn0 b0;
    public final f c0;
    public RecyclerView d0;
    public SwipeDrawableRefreshLayout e0;
    public View f0;
    public DefaultErrorView g0;
    public DefaultEmptyView h0;
    public AppBarLayout i0;
    public View j0;
    public bin0<Context> k0;
    public boolean l0;
    public final Object m0;
    public ax60 n0;
    public final g o0;

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class b extends RecyclerView.t {
        public final tzv b;
        public boolean c;

        public b(tzv tzvVar) {
            this.b = tzvVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            this.c = i != 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.c) {
                this.c = false;
                this.b.invoke();
            }
        }
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final /* synthetic */ class d implements fb80.a, g0t {
        public d() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, NewsfeedSearchFragment.this, NewsfeedSearchFragment.class, "getCurrentScreenName", "getCurrentScreenName()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.fb80.a
        public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
            qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
            UserId userId = NewsfeedSearchFragment.this.eo().a;
            return (userId == null || !fkq0.d(userId)) ? (userId == null || !fkq0.b(userId)) ? MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS : MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS_COMMUNITY : MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS_PROFILE;
        }
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class e implements fo60 {
        public e() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 qx60Var;
            ww60 ww60Var = (ww60) NewsfeedSearchFragment.this.a0.getValue();
            if (xn60Var instanceof xn60.a) {
                qx60Var = new px60.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                qx60Var = new px60.c((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                qx60Var = new px60.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                qx60Var = new qx60((xn60.c) xn60Var);
            }
            yx60 yx60Var = (yx60) ww60Var.a.invoke();
            if (yx60Var != null) {
                yx60Var.b(qx60Var);
            }
        }
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class f implements bq60 {
        public f() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
            dx60 dx60Var = (dx60) NewsfeedSearchFragment.this.b0.getValue();
            ex60.a((ax60) dx60Var.a.invoke(), (NewsfeedSearchFragment) dx60Var.b.c, dx60Var.c.invoke(), dx60Var.d.invoke(), new sx60.a(yo60Var));
        }
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final /* synthetic */ class h implements bin0, g0t {
        public final /* synthetic */ AtomicReference<String> b;

        public h(AtomicReference<String> atomicReference) {
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedSearchFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/search/presentation/feature/NewsfeedSearchMviStore;", 0);
        fpf0.a.getClass();
        p0 = new qcy[]{propertyReference1Impl};
    }

    public NewsfeedSearchFragment() {
        l1i l1iVar = new l1i(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, l1iVar);
        this.O = new e();
        this.P = msy.a(lazyThreadSafetyMode, new o0(27));
        this.Q = msy.a(lazyThreadSafetyMode, new ko00(this, 11));
        this.R = msy.a(lazyThreadSafetyMode, new wt30(this, 5));
        this.V = new c(new hvz(this, 17));
        this.W = new bpn0(new f540(this, 6));
        this.X = new AtomicBoolean(true);
        this.Y = new nzw(fpf0.d(yx60.class).toString(), this, new sy50(this, 3));
        this.Z = new wic(0);
        this.a0 = new bpn0(new xrj(this, 25));
        this.b0 = new bpn0(new rkt(this, 16));
        this.c0 = new f();
        this.k0 = new bin0() { // from class: xsna.hx60
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return NewsfeedSearchFragment.this.mo2getContext();
            }
        };
        this.m0 = msy.a(lazyThreadSafetyMode, new qc00(5));
        this.o0 = new g();
    }

    @Override // xsna.pds
    public final void J0() {
        go().f(true);
    }

    @Override // xsna.ohh0
    public final void Y1(final int i, final int i2) {
        if (fto0.n(this)) {
            FragmentActivity activity = getActivity();
            if (activity == null || !p90.f(activity)) {
                AppBarLayout appBarLayout = this.i0;
                if (appBarLayout != null) {
                    appBarLayout.g(false, false, true);
                }
                RecyclerView recyclerView = this.d0;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable() { // from class: xsna.ix60
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                            NewsfeedSearchFragment newsfeedSearchFragment = NewsfeedSearchFragment.this;
                            newsfeedSearchFragment.fo().a.n.j(i, i2, newsfeedSearchFragment.j0);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xw60 eo() {
        return (xw60) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ax60 fo() {
        ax60 ax60Var = this.n0;
        if (ax60Var != null) {
            return ax60Var;
        }
        bin0<Context> bin0Var = this.k0;
        mo60 mo60Var = new mo60(new ju4((AtomicReference) this.m0.getValue(), (AtomicReference) this.P.getValue()), this.W, this.D, (tr60) this.Q.getValue(), this.O, this.c0, go().d, msy.a(LazyThreadSafetyMode.NONE, new u210(this, 10)), new d(), null);
        mo60Var.e = this.k0;
        ax60 ax60Var2 = new ax60(bin0Var, mo60Var);
        if (!this.l0) {
            this.n0 = ax60Var2;
        }
        return ax60Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ar60 go() {
        return (ar60) this.R.getValue();
    }

    public final yx60 ho() {
        qcy<Object> qcyVar = p0[0];
        return (yx60) this.Y.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        ar60 go = go();
        boolean isResumed = isResumed();
        gzs<s3q0> gzsVar2 = go.h;
        if (isResumed) {
            gzsVar.invoke();
            gzsVar = gzsVar2;
        }
        go.h = gzsVar;
    }

    @Override // xsna.pds
    public final void o1() {
        go().h(getActivity(), this.d0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.O));
        go().a().b();
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
            arguments.putBoolean("NewsfeedSearchFragmentWasCreated", true);
        }
        go().c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_newsfeed_search, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        doq doqVar = lmc.c;
        go().d();
        ho().clear();
        ax60 ax60Var = this.n0;
        if (ax60Var != null) {
            ax60Var.a.a();
        }
        this.n0 = null;
        this.l0 = true;
        dx60 dx60Var = (dx60) this.b0.getValue();
        dx60Var.c = bx60.b;
        dx60Var.d = cx60.b;
        this.k0 = doqVar;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((ho60) fo().a.s.getValue()).F0(this.V);
        this.Z.clear();
        go().e(this.d0);
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.e0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        DefaultErrorView defaultErrorView = this.g0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(null);
        }
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
        this.T = null;
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.U;
        if (cVar != null) {
            cVar.dispose();
        }
        this.U = null;
        View view = getView();
        if (view != null) {
            gqo.f(view, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        ar60 go = go();
        go.b().f().g();
        ((yl60) go.b().b0.getValue()).a();
        super.onPause();
        J0();
        ar60 go2 = go();
        go2.a().d();
        ehv ehvVar = (ehv) go2.b().p.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o1();
        go().g();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vkontakte.android.data.b.l();
    }

    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NewsfeedSearchFragment newsfeedSearchFragment;
        VkSearchView vkSearchView;
        View findViewById;
        VkSearchView vkSearchView2;
        hcw0 hcw0Var;
        View rootView;
        super.onViewCreated(view, bundle);
        this.d0 = (RecyclerView) view.findViewById(R.id.list);
        this.e0 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f0 = view.findViewById(R.id.newsfeed_search_progress);
        this.g0 = (DefaultErrorView) view.findViewById(R.id.newsfeed_search_error);
        DefaultEmptyView defaultEmptyView = (DefaultEmptyView) view.findViewById(R.id.newsfeed_search_empty);
        if (defaultEmptyView != null) {
            defaultEmptyView.setText(R.string.search_by_user_posts_placeholder);
        } else {
            defaultEmptyView = null;
        }
        this.h0 = defaultEmptyView;
        FragmentActivity activity = getActivity();
        this.j0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerView recyclerView = this.d0;
        AppBarLayout appBarLayout = (recyclerView == null || (rootView = recyclerView.getRootView()) == null) ? null : (AppBarLayout) rootView.findViewById(R.id.app_bar_layout);
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        this.i0 = appBarLayout;
        RecyclerView recyclerView2 = this.d0;
        if (recyclerView2 != null) {
            newsfeedSearchFragment = this;
            odq.b(m7m.d(this), newsfeedSearchFragment, getActivity(), mo2getContext(), recyclerView2, fo().a.j0, true, false);
            recyclerView2.addOnScrollListener(new b(new tzv(this, 17)));
        } else {
            newsfeedSearchFragment = this;
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = newsfeedSearchFragment.e0;
        if (swipeDrawableRefreshLayout != null) {
            ar60 go = go();
            go.getClass();
            swipeDrawableRefreshLayout.setOnRefreshListener(new qu50(go, 1));
            go.d.b(new e2e0().a(new lxz(swipeDrawableRefreshLayout, 10)));
        }
        DefaultErrorView defaultErrorView = newsfeedSearchFragment.g0;
        if (defaultErrorView != null) {
            final ar60 go2 = go();
            go2.getClass();
            defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.zq60
                @Override // xsna.xa80
                public final void b() {
                    ar60.this.b.a(xn60.d.a.b);
                }
            });
        }
        if (newsfeedSearchFragment.d0 != null) {
            go().getClass();
            BuildInfo.h();
        }
        VkSearchView vkSearchView3 = (VkSearchView) view.findViewById(R.id.search_view);
        newsfeedSearchFragment.T = vkSearchView3;
        if (vkSearchView3 != null) {
            orl.a(vkSearchView3);
        }
        VkSearchView vkSearchView4 = newsfeedSearchFragment.T;
        int i = 6;
        newsfeedSearchFragment.U = vkSearchView4 != null ? d02.y(vkSearchView4, 500L, 2).subscribe(new sl30(new zl20(this, 12), i)) : null;
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        int i2 = 0;
        if (fnj.d(context)) {
            VkSearchView vkSearchView5 = newsfeedSearchFragment.T;
            if (vkSearchView5 != null) {
                vkSearchView5.X4(false);
            }
        } else {
            VkSearchView vkSearchView6 = newsfeedSearchFragment.T;
            if (vkSearchView6 != null) {
                vkSearchView6.setOnBackClickListener(new wp40(this, 4));
            }
        }
        newsfeedSearchFragment.S = eo().d;
        String str = eo().d;
        g gVar = newsfeedSearchFragment.o0;
        if (str != null) {
            VkSearchView vkSearchView7 = newsfeedSearchFragment.T;
            if (vkSearchView7 != null) {
                vkSearchView7.setQuery(str);
            }
            gVar.getClass();
            VkSearchView vkSearchView8 = newsfeedSearchFragment.T;
            if (vkSearchView8 != null) {
                vkSearchView8.d0();
            }
        }
        if (eo().f && (vkSearchView2 = newsfeedSearchFragment.T) != null && (hcw0Var = vkSearchView2.S) != null) {
            hcw0Var.a();
        }
        if (eo().g != null) {
            VkSearchView vkSearchView9 = newsfeedSearchFragment.T;
            if (vkSearchView9 != null) {
                vkSearchView9.setQuery("");
            }
            gVar.getClass();
            VkSearchView vkSearchView10 = newsfeedSearchFragment.T;
            if (vkSearchView10 != null) {
                vkSearchView10.d0();
            }
        }
        DefaultEmptyView defaultEmptyView2 = newsfeedSearchFragment.h0;
        TextView textView = defaultEmptyView2 != null ? (TextView) defaultEmptyView2.findViewById(R.id.text) : null;
        if (textView != null) {
            textView.setText(getString(R.string.search_by_user_posts_placeholder));
        }
        DefaultEmptyView defaultEmptyView3 = newsfeedSearchFragment.h0;
        if (defaultEmptyView3 != null && (findViewById = defaultEmptyView3.findViewById(R.id.image)) != null) {
            findViewById.setVisibility(8);
        }
        if (eo().d == null && eo().g == null && (vkSearchView = newsfeedSearchFragment.T) != null) {
            vkSearchView.b5(200L);
        }
        ((ho60) fo().a.s.getValue()).D0(newsfeedSearchFragment.V);
        ((ul50) newsfeedSearchFragment.Z.c).g.a(new xd40(this, i));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new lx60(i2, this, new js60()));
        go().a().i();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return fto0.u(this.d0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UserId userId = eo().a;
        uiTrackingScreen.a = (userId == null || !fkq0.d(userId)) ? (userId == null || !fkq0.b(userId)) ? MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS : MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS_COMMUNITY : MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS_PROFILE;
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class c implements zjf0<ol60> {
        public final hvz b;

        public c(hvz hvzVar) {
            this.b = hvzVar;
        }

        @Override // xsna.zjf0
        public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
            ol60 ol60Var2 = ol60Var;
            if ((e0Var instanceof h2m0) && (ol60Var2 instanceof uy60)) {
                h2m0 h2m0Var = (h2m0) e0Var;
                h2m0Var.V5(((uy60) ol60Var2).h);
                h2m0Var.p.k = this.b;
            }
        }

        @Override // xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
        }

        @Override // xsna.zjf0
        public final void e(RecyclerView.e0 e0Var) {
        }
    }

    /* compiled from: NewsfeedSearchFragment.kt */
    public static final class g implements l0i0.b {
        public g() {
        }

        @Override // xsna.l0i0.b
        public final void a(String str) {
            c(str);
        }

        @Override // xsna.l0i0.b
        public final void c(String str) {
            NewsfeedSearchFragment newsfeedSearchFragment = NewsfeedSearchFragment.this;
            if (TextUtils.equals(newsfeedSearchFragment.S, str)) {
                return;
            }
            newsfeedSearchFragment.S = str;
            newsfeedSearchFragment.ho().b(new px60.d(str));
        }

        @Override // xsna.l0i0.b
        public final void b(String str) {
        }
    }
}
