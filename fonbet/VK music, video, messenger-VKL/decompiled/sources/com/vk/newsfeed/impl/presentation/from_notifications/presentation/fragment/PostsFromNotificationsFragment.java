package com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment;

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
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
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
import xsna.avc0;
import xsna.aw60;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.br8;
import xsna.bs60;
import xsna.bw60;
import xsna.c5r;
import xsna.c950;
import xsna.cf00;
import xsna.doq;
import xsna.dui;
import xsna.dvc0;
import xsna.e2e0;
import xsna.e7q0;
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
import xsna.hj60;
import xsna.hl60;
import xsna.hm60;
import xsna.hux;
import xsna.i440;
import xsna.i750;
import xsna.j6f0;
import xsna.ju4;
import xsna.jz60;
import xsna.k170;
import xsna.lj50;
import xsna.lmc;
import xsna.ln20;
import xsna.luc0;
import xsna.lva0;
import xsna.lxd;
import xsna.m130;
import xsna.m7m;
import xsna.mg;
import xsna.ml50;
import xsna.mo60;
import xsna.msy;
import xsna.muc0;
import xsna.nr60;
import xsna.nuc0;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.oe40;
import xsna.oey;
import xsna.oq;
import xsna.or60;
import xsna.ouc0;
import xsna.oz50;
import xsna.p5y;
import xsna.pds;
import xsna.pn60;
import xsna.puc0;
import xsna.puq0;
import xsna.qcy;
import xsna.qn60;
import xsna.quc0;
import xsna.qz40;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.ruc0;
import xsna.s3q0;
import xsna.sg0;
import xsna.sm60;
import xsna.sr60;
import xsna.t970;
import xsna.tc60;
import xsna.tlo0;
import xsna.tq;
import xsna.tr60;
import xsna.ul50;
import xsna.uq60;
import xsna.vvc0;
import xsna.wjs0;
import xsna.wz70;
import xsna.wzb0;
import xsna.xl60;
import xsna.xn60;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.zjf0;

/* compiled from: PostsFromNotificationsFragment.kt */
/* loaded from: classes4.dex */
public final class PostsFromNotificationsFragment extends FragmentImpl implements pds {
    public static final /* synthetic */ qcy<Object>[] p0;
    public final Object N;
    public final Object O;
    public qn60 P;
    public pn60 Q;
    public final bpn0 R;
    public final nzw S;
    public final ml50 T;
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
    public final Object m0;
    public final lxd n0;
    public nuc0 o0;

    /* compiled from: PostsFromNotificationsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PostsFromNotificationsFragment.kt */
    public static final class b implements fo60 {
        public b() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 aVar;
            qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
            luc0 luc0Var = (luc0) PostsFromNotificationsFragment.this.U.getValue();
            if (xn60Var instanceof xn60.a) {
                aVar = new avc0.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d.a) {
                aVar = avc0.d.a.b;
            } else if (xn60Var instanceof xn60.d.c) {
                aVar = avc0.d.c.b;
            } else if (xn60Var instanceof xn60.d.b) {
                aVar = avc0.d.b.b;
            } else if (xn60Var instanceof xn60.b) {
                aVar = new avc0.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new avc0.c.a((xn60.c) xn60Var);
            }
            vvc0 vvc0Var = (vvc0) luc0Var.a.invoke();
            if (vvc0Var != null) {
                vvc0Var.b(aVar);
            }
        }
    }

    /* compiled from: PostsFromNotificationsFragment.kt */
    public static final class c implements bq60 {
        public c() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
            puc0 puc0Var = (puc0) PostsFromNotificationsFragment.this.V.getValue();
            quc0.a((nuc0) puc0Var.a.invoke(), (PostsFromNotificationsFragment) puc0Var.b.c, puc0Var.c.invoke(), puc0Var.d.invoke(), new dvc0.a(yo60Var));
        }
    }

    /* compiled from: PostsFromNotificationsFragment.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PostsFromNotificationsFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/from_notifications/presentation/feature/PostsFromNotificationsMviStore;", 0);
        fpf0.a.getClass();
        p0 = new qcy[]{propertyReference1Impl};
    }

    public PostsFromNotificationsFragment() {
        cf00 cf00Var = new cf00(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, cf00Var);
        this.O = msy.a(lazyThreadSafetyMode, new mg(24));
        this.R = new bpn0(new ln20(this, 17));
        this.S = new nzw(fpf0.d(vvc0.class).toString(), this, new m130(this, 26));
        this.T = new ml50(0);
        this.U = new bpn0(new p5y(this, 28));
        this.V = new bpn0(new i440(this, 22));
        this.W = new b();
        this.X = new c();
        this.f0 = new io.reactivex.rxjava3.disposables.b();
        this.g0 = new bin0() { // from class: xsna.uuc0
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return PostsFromNotificationsFragment.this.mo2getContext();
            }
        };
        this.i0 = msy.a(lazyThreadSafetyMode, new hj60(this, 13));
        this.j0 = msy.a(lazyThreadSafetyMode, new t970(4));
        this.m0 = msy.a(lazyThreadSafetyMode, new wzb0(this, 3));
        this.n0 = new lxd(null);
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

    public final nuc0 eo() {
        nuc0 nuc0Var = this.o0;
        if (nuc0Var != null) {
            return nuc0Var;
        }
        bin0<Context> bin0Var = this.g0;
        ju4 ju4Var = new ju4(go(), go());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, false, null, null, null, null, 505), this.W, this.X, this.f0, msy.a(LazyThreadSafetyMode.NONE, new lva0(this, 7)), new ruc0(), null);
        mo60Var.e = this.g0;
        nuc0 nuc0Var2 = new nuc0(bin0Var, mo60Var);
        if (!this.h0) {
            this.o0 = nuc0Var2;
        }
        return nuc0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 fo() {
        return (uq60) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AtomicReference<String> go() {
        return (AtomicReference) this.m0.getValue();
    }

    public final vvc0 ho() {
        qcy<Object> qcyVar = p0[0];
        return (vvc0) this.S.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.l0 = gzsVar;
        }
    }

    public final void io(VkTopBar vkTopBar) {
        if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
            vkTopBar.setBack(null);
            return;
        }
        vkTopBar.setBack(new VkTopBar.b(new c950(this, 20), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new oey(18), 3), 12));
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
        this.k0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_posts_from_notifications, viewGroup, false);
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
        nuc0 nuc0Var = this.o0;
        if (nuc0Var != null) {
            nuc0Var.a.a();
        }
        this.o0 = null;
        this.h0 = true;
        puc0 puc0Var = (puc0) this.V.getValue();
        puc0Var.c = ouc0.b;
        puc0Var.d = br8.d;
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
        this.n0.a();
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
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
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
        int i = 15;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, ((muc0) this.N.getValue()).a), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            vkTopBar.setOnClickListener(new sg0(this, i));
            io(vkTopBar);
        }
        RecyclerView recyclerView = this.Z;
        int i2 = 1;
        if (recyclerView != null) {
            nuc0 eo = eo();
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
        int i3 = 13;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(new oe40(this, 4));
            this.f0.b(new e2e0().a(new k170(swipeDrawableRefreshLayout, i3)));
        }
        DefaultErrorView defaultErrorView = this.c0;
        if (defaultErrorView != null) {
            defaultErrorView.setRetryClickListener(new wz70(i2, this));
        }
        DefaultEmptyView defaultEmptyView = this.d0;
        if (defaultEmptyView != null) {
            defaultEmptyView.a();
        }
        BuildInfo.h();
        ((ul50) this.T.c).g.a(new qz40(this, i3));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new i750(this, i));
        fo().i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_SUBSCRIPTIONS;
    }
}
