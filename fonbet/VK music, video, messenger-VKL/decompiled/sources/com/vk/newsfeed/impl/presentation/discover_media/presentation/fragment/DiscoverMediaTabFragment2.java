package com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.X3;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.DefaultEmptyView;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import defpackage.b0;
import java.io.Serializable;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a3n;
import xsna.a50;
import xsna.ad0;
import xsna.asu0;
import xsna.aw60;
import xsna.awy;
import xsna.b0g;
import xsna.b5n;
import xsna.bin0;
import xsna.bk1;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.bw60;
import xsna.c2n;
import xsna.c5f;
import xsna.c5r;
import xsna.c7;
import xsna.cip;
import xsna.d1;
import xsna.dhr0;
import xsna.dne;
import xsna.dnh;
import xsna.doq;
import xsna.dui;
import xsna.dw60;
import xsna.e3n;
import xsna.e6n;
import xsna.e7q0;
import xsna.ee;
import xsna.ehv;
import xsna.ek40;
import xsna.enh;
import xsna.epx;
import xsna.ewx;
import xsna.f3n;
import xsna.f4m;
import xsna.fh9;
import xsna.fo60;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g0t;
import xsna.g3n;
import xsna.g5n;
import xsna.gjf0;
import xsna.gqo;
import xsna.gzs;
import xsna.h3n;
import xsna.hai0;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.hux;
import xsna.i3n;
import xsna.j6f0;
import xsna.j9n;
import xsna.jrh;
import xsna.jse0;
import xsna.ju4;
import xsna.jz60;
import xsna.kbe;
import xsna.krh;
import xsna.lbs;
import xsna.ldl;
import xsna.lmc;
import xsna.lpj;
import xsna.m1q0;
import xsna.m2g;
import xsna.m2n;
import xsna.m7m;
import xsna.maj;
import xsna.ml7;
import xsna.mo60;
import xsna.msy;
import xsna.mtz;
import xsna.myh;
import xsna.n2n;
import xsna.nr60;
import xsna.nzw;
import xsna.o170;
import xsna.oc60;
import xsna.ohh0;
import xsna.or60;
import xsna.ow90;
import xsna.oz50;
import xsna.ozl;
import xsna.p2n;
import xsna.p5h;
import xsna.p90;
import xsna.pd4;
import xsna.pds;
import xsna.puq0;
import xsna.q5f;
import xsna.qcy;
import xsna.qhh0;
import xsna.r3n;
import xsna.rl3;
import xsna.rl60;
import xsna.rru;
import xsna.s200;
import xsna.s3n;
import xsna.s3q0;
import xsna.sbg;
import xsna.sr60;
import xsna.t3h;
import xsna.tbg;
import xsna.tc60;
import xsna.too0;
import xsna.tr60;
import xsna.u4n;
import xsna.uq60;
import xsna.wjs0;
import xsna.wo60;
import xsna.wsx;
import xsna.ww50;
import xsna.x3n;
import xsna.x5n;
import xsna.xa80;
import xsna.xl60;
import xsna.xn60;
import xsna.xzs;
import xsna.y22;
import xsna.y3v;
import xsna.yce;
import xsna.yl60;
import xsna.yo60;
import xsna.yw90;
import xsna.z2n;
import xsna.zds;
import xsna.zjf0;
import xsna.zrd0;
import xsna.zsx;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Direct setArg is forbidden for PHI insn, bindArg must be used
    	at jadx.core.dex.instructions.PhiInsn.setArg(PhiInsn.java:129)
    	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
    	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
    	at jadx.core.dex.visitors.ClassModifier.removeFieldUsageFromConstructor(ClassModifier.java:140)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:93)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:64)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class DiscoverMediaTabFragment2 extends FragmentImpl implements pds, qhh0, ohh0, too0, hai0, zds, dw60 {
    public static final /* synthetic */ qcy<Object>[] C0;
    public gzs<s3q0> A0;
    public final c B0;
    public final Object N;
    public final io.reactivex.rxjava3.disposables.b O;
    public final z2n P;
    public final Object Q;
    public final bpn0 R;
    public final nzw S;
    public final bpn0 T;
    public final bpn0 U;
    public final x3n V;
    public final d W;
    public final Object X;
    public bin0<Context> Y;
    public a3n Z;
    public ek40 a0;
    public final bpn0 b0;
    public final bpn0 c0;
    public final x5n d0;
    public final Object e0;
    public final mtz f0;
    public final zsx g0;
    public final wsx h0;
    public final cip i0;
    public c2n j0;
    public b k0;
    public final e l0;
    public boolean m0;
    public RecyclerView n0;
    public SwipeDrawableRefreshLayout o0;
    public ViewGroup p0;
    public ThemableShimmer q0;
    public View r0;
    public View s0;
    public AppBarLayout t0;
    public View u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public final Object y0;
    public final Object z0;

    /* compiled from: DiscoverMediaTabFragment2.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DiscoverMediaTabFragment2.kt */
    public final class b implements m1q0 {
        public final Class<? extends FragmentImpl> a;
        public boolean b;
        public final /* synthetic */ DiscoverMediaTabFragment2 c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.core.fragments.FragmentImpl] */
        public b() {
            while (true) {
                Fragment parentFragment = r3.getParentFragment();
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                if (discoverMediaTabFragment2 == null) {
                    this.a = r3.getClass();
                    return;
                }
                r3 = discoverMediaTabFragment2;
            }
        }

        @Override // xsna.m1q0
        public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
            Class<? extends FragmentImpl> cls;
            FragmentImpl u;
            DiscoverMediaTabFragment2 discoverMediaTabFragment2 = this.c;
            FragmentActivity activity = discoverMediaTabFragment2.getActivity();
            ww50 v = activity != null ? s200.v(activity) : null;
            if (v == null || (u = v.u()) == null) {
                cls = null;
            } else {
                while (true) {
                    Fragment parentFragment = u.getParentFragment();
                    FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                    if (fragmentImpl == null) {
                        break;
                    } else {
                        u = fragmentImpl;
                    }
                }
                cls = v.x(u);
            }
            boolean f = epx.f(this.a, cls);
            boolean z = !f;
            if (this.b != z) {
                this.b = z;
                c2n c2nVar = discoverMediaTabFragment2.j0;
                if (c2nVar != null) {
                    if (f) {
                        io.reactivex.rxjava3.disposables.c cVar = c2nVar.d;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        c2nVar.d = null;
                        c2nVar.e = null;
                        return;
                    }
                    io.reactivex.rxjava3.disposables.c cVar2 = c2nVar.d;
                    if (cVar2 == null || cVar2.h()) {
                        c2nVar.b();
                    }
                }
            }
        }
    }

    /* compiled from: DiscoverMediaTabFragment2.kt */
    public static final class c extends FragmentImpl.b {
        public final /* synthetic */ DiscoverMediaTabFragment2 b;

        public c(DiscoverMediaTabFragment2 discoverMediaTabFragment2) {
            this.b = discoverMediaTabFragment2;
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
            if (this.b.eo().e) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: DiscoverMediaTabFragment2.kt */
    public static final class d implements fo60 {
        public final /* synthetic */ DiscoverMediaTabFragment2 a;

        public d(DiscoverMediaTabFragment2 discoverMediaTabFragment2) {
            this.a = discoverMediaTabFragment2;
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
            DiscoverMediaTabFragment2 discoverMediaTabFragment2 = this.a;
            u4n ho = discoverMediaTabFragment2.ho();
            discoverMediaTabFragment2.V.getClass();
            ho.b(x3n.a(xn60Var));
        }
    }

    /* compiled from: DiscoverMediaTabFragment2.kt */
    public static final class e implements bq60 {
        public final /* synthetic */ DiscoverMediaTabFragment2 a;

        public e(DiscoverMediaTabFragment2 discoverMediaTabFragment2) {
            this.a = discoverMediaTabFragment2;
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
            h3n h3nVar = (h3n) this.a.U.getValue();
            e3n.a aVar = new e3n.a(yo60Var);
            a3n a3nVar = (a3n) h3nVar.a.invoke();
            i3n i3nVar = (i3n) h3nVar.e.getValue();
            DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) h3nVar.b.c;
            Activity invoke = h3nVar.c.invoke();
            RecyclerView invoke2 = h3nVar.d.invoke();
            i3nVar.getClass();
            i3n.a(a3nVar, discoverMediaTabFragment2, invoke, invoke2, aVar);
        }
    }

    /* compiled from: DiscoverMediaTabFragment2.kt */
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
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DiscoverMediaTabFragment2.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/discover_media/presentation/feature/DiscoverMediaStore;", 0);
        fpf0.a.getClass();
        C0 = new qcy[]{propertyReference1Impl};
    }

    public DiscoverMediaTabFragment2() {
        sbg sbgVar = new sbg(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, sbgVar);
        this.O = new io.reactivex.rxjava3.disposables.b();
        this.P = new z2n(0);
        this.Q = msy.a(lazyThreadSafetyMode, new ml7(6));
        this.R = new bpn0(new m2g(this, 12));
        this.S = new nzw(fpf0.d(u4n.class).toString(), this, new dnh(this, 13));
        this.T = new bpn0(new p5h(this, 11));
        this.U = new bpn0(new q5f(this, 14));
        this.V = new x3n();
        this.W = new d(this);
        this.X = msy.a(lazyThreadSafetyMode, new enh(this, 9));
        this.Y = new bin0() { // from class: xsna.c5n
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return DiscoverMediaTabFragment2.this.mo2getContext();
            }
        };
        this.b0 = new bpn0(new yce(this, 14));
        this.c0 = new bpn0(new kbe(this, 15));
        this.d0 = new x5n(new tbg(this, 15));
        this.e0 = msy.a(lazyThreadSafetyMode, new c5f(this, 12));
        jrh jrhVar = new jrh(this, 5);
        mtz mtzVar = new mtz();
        mtzVar.b = jrhVar;
        this.f0 = mtzVar;
        myh myhVar = new myh(this, 8);
        dne dneVar = new dne(this, 16);
        zsx zsxVar = new zsx();
        zsxVar.b = myhVar;
        zsxVar.c = dneVar;
        this.g0 = zsxVar;
        krh krhVar = new krh(this, 7);
        wsx wsxVar = new wsx();
        wsxVar.b = krhVar;
        this.h0 = wsxVar;
        ldl ldlVar = new ldl(this, 2);
        cip cipVar = new cip();
        cipVar.b = ldlVar;
        this.i0 = cipVar;
        this.l0 = new e(this);
        this.y0 = msy.a(lazyThreadSafetyMode, new d1(10));
        this.z0 = msy.a(lazyThreadSafetyMode, new pd4(10));
        this.B0 = new c(this);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        c2n c2nVar = this.j0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_PAUSE);
        }
        ((tc60) fo().a.U.getValue()).c();
        fo().b().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        go().g();
        ((o170) fo().a.V.getValue()).c();
        this.x0 = false;
        ThemableShimmer themableShimmer = this.q0;
        if (themableShimmer != null) {
            themableShimmer.c();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.B0;
    }

    @Override // xsna.dw60
    public final void Nb(boolean z) {
        ho().b(new m2n.e.a(false));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ((aw60) fo().a.e0.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        wo60 wo60Var = (wo60) fo().a.R.getValue();
        VkContextMenu vkContextMenu = wo60Var.g;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        wo60Var.g = null;
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
            AppBarLayout appBarLayout = this.t0;
            if (appBarLayout != null) {
                appBarLayout.g(false, false, true);
            }
            RecyclerView recyclerView = this.n0;
            if (recyclerView != null) {
                recyclerView.post(new Runnable() { // from class: xsna.f5n
                    @Override // java.lang.Runnable
                    public final void run() {
                        qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                        DiscoverMediaTabFragment2 discoverMediaTabFragment2 = DiscoverMediaTabFragment2.this;
                        discoverMediaTabFragment2.fo().h.j(i, i2, discoverMediaTabFragment2.u0);
                    }
                });
            }
        }
    }

    @Override // xsna.hai0
    public final void c3() {
        jse0 jse0Var = this.d0.c;
        if (jse0Var != null) {
            jse0Var.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final p2n eo() {
        return (p2n) this.N.getValue();
    }

    public final a3n fo() {
        a3n a3nVar = this.Z;
        if (a3nVar != null) {
            return a3nVar;
        }
        ju4 ju4Var = new ju4((AtomicReference) this.b0.getValue(), (AtomicReference) this.c0.getValue());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.R, this.D, new tr60(Kn != null ? Kn.d : null, true, null, FullSourceJoinApi.EntryServiceType.DISCOVER, null, VideoAutoPlayDelayType.FEED, 392), this.W, this.l0, this.O, msy.a(LazyThreadSafetyMode.NONE, new maj(this, 5)), new g5n(), null);
        bin0<Context> bin0Var = this.Y;
        mo60Var.e = bin0Var;
        a3n a3nVar2 = new a3n(mo60Var, bin0Var, (n2n) this.T.getValue());
        if (!this.m0) {
            this.Z = a3nVar2;
        }
        return a3nVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 go() {
        return (uq60) this.X.getValue();
    }

    public final u4n ho() {
        qcy<Object> qcyVar = C0[0];
        return (u4n) this.S.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.A0 = gzsVar;
        }
    }

    public final void io() {
        if (eo().e) {
            int i = this.v0;
            if (i < 0) {
                i = 0;
            }
            RecyclerView recyclerView = this.n0;
            if (recyclerView != null) {
                recyclerView.setClipToPadding(false);
                f4m.y(i, recyclerView);
            }
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.o0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setInContentTopInset(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) fo().a.U.getValue()).d();
        fo().b().k(getActivity(), fo().h);
        go().h();
        c2n c2nVar = this.j0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_RESUME);
        }
        ((o170) fo().a.V.getValue()).b(this.n0);
        this.x0 = true;
        if (this.w0) {
            b0g.a(new b5n(this));
            return;
        }
        ThemableShimmer themableShimmer = this.q0;
        if (themableShimmer != null) {
            themableShimmer.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @ozl
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            fo().a().x0(((ModerationComponent) m7m.d(this).mo408a(fpf0.a(ModerationComponent.class))).pa().b(activity, this, false));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D.a(new nr60(this, this.W));
        go().b();
        Bundle arguments = getArguments();
        x5n x5nVar = this.d0;
        jse0 jse0Var = x5nVar.c;
        Serializable serializable = arguments != null ? arguments.getSerializable("com.vk.newsfeed.impl.discover.media.UI_MEASURING_UUID_ARG") : null;
        UUID uuid = serializable instanceof UUID ? (UUID) serializable : null;
        if (uuid != null) {
            x5nVar.b = uuid;
        }
        if (jse0Var != null && jse0Var.d) {
            jse0Var.init();
            jse0Var.d = false;
        }
        if (jse0Var != null) {
            jse0Var.start();
        }
        Bundle arguments2 = getArguments();
        Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("com.vk.newsfeed.impl.discover.media.PRODUCT_SCORE_UUID_ARG") : null;
        UUID uuid2 = serializable2 instanceof UUID ? (UUID) serializable2 : null;
        if (uuid2 != null) {
            zrd0 zrd0Var = zrd0.a;
            this.L = zrd0.e.get(uuid2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fo().h.g(hux.f.a.a);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("DiscoverMediaFragmentWasCreated", true);
        }
        his0.d++;
        if (his0.c == null || !(!r4.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.a0 = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.fragment_discover_media, viewGroup, false);
        b bVar = new b();
        UiTracker uiTracker = UiTracker.a;
        UiTracker.a(bVar);
        this.k0 = bVar;
        c2n c2nVar = new c2n(rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS}), new bk1(this, 14));
        this.j0 = c2nVar;
        c2nVar.a(Lifecycle.Event.ON_CREATE);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        doq doqVar = lmc.c;
        ek40 ek40Var = this.a0;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.a0 = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        fo().b().e();
        ehv ehvVar = (ehv) fo().g.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        fo().g.b = null;
        this.A0 = null;
        this.O.e();
        ho().clear();
        a3n a3nVar = this.Z;
        if (a3nVar != null) {
            a3nVar.a.a();
        }
        this.Z = null;
        this.m0 = true;
        ewx ewxVar = (ewx) this.e0.getValue();
        ewxVar.b = null;
        ewxVar.c = null;
        ewxVar.d = null;
        ewxVar.f = null;
        ewxVar.e = null;
        ewxVar.h.a();
        zsx zsxVar = this.g0;
        zsxVar.b = null;
        zsxVar.c = null;
        this.f0.b = null;
        this.h0.b = null;
        this.i0.b = null;
        h3n h3nVar = (h3n) this.U.getValue();
        h3nVar.c = f3n.b;
        h3nVar.d = g3n.b;
        this.Y = doqVar;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
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
        this.P.clear();
        ((awy) fo().a.y.getValue()).a();
        RecyclerView recyclerView3 = this.n0;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.n0;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) fo().a.T.getValue());
        }
        if (((Boolean) this.y0.getValue()).booleanValue() && (recyclerView2 = this.n0) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.z0.getValue());
        }
        RecyclerView recyclerView5 = this.n0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) fo().g.b;
        if (ehvVar != null && (recyclerView = this.n0) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        fo().h.b();
        fo().a().F0((or60) fo().a.t.getValue());
        fo().a().F0((oc60) fo().a.z.getValue());
        fo().a().G0((rl60) fo().a.A.getValue());
        fo().a().G0(((sr60) fo().a.o.getValue()).c);
        fo().a().G0((zjf0) fo().a.B.getValue());
        fo().a().k = null;
        fo().a().E0();
        fo().a().clear();
        fo().b().f();
        ehv ehvVar2 = (ehv) fo().g.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) fo().a.b0.getValue()).d();
        ((tc60) fo().a.U.getValue()).b();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.o0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.r0 = null;
        this.t0 = null;
        this.u0 = null;
        ThemableShimmer themableShimmer = this.q0;
        if (themableShimmer != null) {
            themableShimmer.c();
        }
        this.q0 = null;
        go().c();
        fo().h.c();
        fo().h.f = null;
        b bVar = this.k0;
        if (bVar != null) {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.g(bVar);
        }
        this.k0 = null;
        c2n c2nVar = this.j0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_DESTROY);
        }
        this.j0 = null;
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
        ehv ehvVar = (ehv) fo().g.b;
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
        ehv ehvVar = (ehv) fo().g.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) fo().a.b0.getValue()).b();
        gzs<s3q0> gzsVar = this.A0;
        if (gzsVar != null) {
            this.A0 = null;
            gzsVar.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        ehv ehvVar;
        super.onViewCreated(view, bundle);
        x5n x5nVar = this.d0;
        if (bundle == null) {
            jse0 jse0Var = x5nVar.c;
            if (jse0Var != null) {
                jse0Var.e(view);
            }
            ((yw90) x5nVar.a.invoke()).d3(view);
        } else {
            x5nVar.getClass();
        }
        go().i();
        FragmentActivity activity = getActivity();
        this.u0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        fo().h.h(recyclerView);
        int i = lbs.o(this) ? R.attr.vk_ui_background_content : R.attr.vk_ui_background;
        a3n fo = fo();
        mo60 mo60Var = fo.a;
        fh9 fh9Var = fo.g;
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
        ((aw60) mo60Var.e0.getValue()).a();
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
        recyclerView.addOnScrollListener((or60) mo60Var.t.getValue());
        fo.a().C0((or60) mo60Var.t.getValue());
        fo.a().C0((oc60) mo60Var.z.getValue());
        fo.a().D0(((sr60) mo60Var.o.getValue()).c);
        fo.a().D0((rl60) mo60Var.A.getValue());
        fo.a().D0((zjf0) mo60Var.B.getValue());
        dui duiVar = (dui) mo60Var.T.getValue();
        yl60 yl60Var = (yl60) mo60Var.b0.getValue();
        yl60Var.getClass();
        duiVar.l(new xl60(yl60Var));
        ((yl60) mo60Var.b0.getValue()).c();
        com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) mo60Var.C.getValue();
        if (dVar != null) {
            fo.a().k = dVar;
        }
        recyclerView.setAdapter(fo.a());
        View rootView = recyclerView.getRootView();
        AppBarLayout appBarLayout = rootView != null ? (AppBarLayout) rootView.findViewById(R.id.app_bar_layout) : null;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        this.t0 = appBarLayout;
        fo.a();
        BuildInfo.h();
        bs60 b2 = fo.b();
        getActivity();
        b2.i(recyclerView, fo.a());
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.DISCOVER, recyclerView);
        fo().h.f = new s3n(recyclerView, new r3n(recyclerView, i));
        fo().h.g(hux.c.b.a);
        fo().h.g(hux.f.a.a);
        if (((Boolean) this.y0.getValue()).booleanValue()) {
            recyclerView.addOnScrollListener((y3v) this.z0.getValue());
        }
        this.n0 = recyclerView;
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        if (swipeDrawableRefreshLayout != null) {
            view.getContext();
            swipeDrawableRefreshLayout.setOnRefreshListener(new c7(this, 27));
        } else {
            swipeDrawableRefreshLayout = null;
        }
        this.o0 = swipeDrawableRefreshLayout;
        io();
        View findViewById = view.findViewById(R.id.discover_media_error);
        if (findViewById != null) {
            ee eeVar = findViewById instanceof ee ? (ee) findViewById : null;
            if (eeVar != null) {
                eeVar.setRetryClickListener(new xa80() { // from class: xsna.d5n
                    @Override // xsna.xa80
                    public final void b() {
                        qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                        ((n2n) DiscoverMediaTabFragment2.this.T.getValue()).a(new m2n.d(xn60.d.a.b));
                    }
                });
            } else {
                findViewById.findViewById(R.id.error_retry).setOnClickListener(new a50(this, 4));
            }
            this.r0 = findViewById;
        }
        this.s0 = view.findViewById(R.id.discover_media_empty);
        View findViewById2 = view.findViewById(R.id.discover_media_empty_view);
        if (findViewById2 != null) {
            DefaultEmptyView defaultEmptyView = findViewById2 instanceof DefaultEmptyView ? (DefaultEmptyView) findViewById2 : null;
            if (defaultEmptyView != null) {
                defaultEmptyView.a();
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.discover_media_skeleton);
        if (viewGroup != null) {
            this.p0 = viewGroup;
            Pair a2 = j9n.a(view.getContext());
            RecyclerView recyclerView2 = (RecyclerView) a2.d();
            this.q0 = (ThemableShimmer) a2.g();
            gjf0.d(recyclerView2, view.getContext(), 0, 12);
            viewGroup.addView(recyclerView2);
        }
        this.P.b.g.a(new t3h(this, 9));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(this), new b0(17, this, new e6n()));
    }

    @Override // xsna.hai0
    public final void q1() {
        jse0 jse0Var = this.d0.c;
        if (jse0Var != null) {
            jse0Var.init();
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView = this.n0;
        if (recyclerView == null) {
            return false;
        }
        boolean z = recyclerView.computeVerticalScrollOffset() != 0;
        if (z) {
            recyclerView.scrollToPosition(0);
        }
        return z;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (eo().d) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.DISCOVER_CATEGORY, null, null, null, null, null, 46, null);
        }
    }

    @Override // xsna.zds
    public final void zm(int i) {
        if (eo().e) {
            this.v0 = i;
            io();
        }
    }

    @Override // xsna.dw60
    public final void nd(boolean z) {
    }
}
