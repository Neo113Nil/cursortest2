package com.vk.newsfeed.impl.newsfeed.presentation.base.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.X3;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.fullscreen.promo.core.FullscreenPromoEvent;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.metrics.logging.PerfLogger;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a4r;
import xsna.ad0;
import xsna.ad60;
import xsna.asu0;
import xsna.at60;
import xsna.atm;
import xsna.atx;
import xsna.aw60;
import xsna.awt0;
import xsna.awy;
import xsna.b010;
import xsna.b410;
import xsna.bin0;
import xsna.bpn0;
import xsna.bq60;
import xsna.bs60;
import xsna.btm;
import xsna.bw60;
import xsna.bwt0;
import xsna.by20;
import xsna.c5r;
import xsna.c63;
import xsna.c9x;
import xsna.ce60;
import xsna.cht;
import xsna.ct60;
import xsna.cvk;
import xsna.d070;
import xsna.d2e0;
import xsna.d9x;
import xsna.dhr0;
import xsna.dj60;
import xsna.dui;
import xsna.dx90;
import xsna.e070;
import xsna.e3m;
import xsna.e43;
import xsna.e550;
import xsna.e7q0;
import xsna.ee;
import xsna.efs;
import xsna.ehv;
import xsna.ek40;
import xsna.ekq;
import xsna.en50;
import xsna.epx;
import xsna.et60;
import xsna.f170;
import xsna.f4m;
import xsna.f5z;
import xsna.fb80;
import xsna.fh9;
import xsna.fj60;
import xsna.fkq;
import xsna.fll;
import xsna.fo60;
import xsna.fpf0;
import xsna.fq1;
import xsna.ft60;
import xsna.fwx;
import xsna.fxc0;
import xsna.g13;
import xsna.gkq;
import xsna.gom0;
import xsna.gqo;
import xsna.gsr;
import xsna.gt60;
import xsna.gzs;
import xsna.gzv;
import xsna.h7m;
import xsna.his0;
import xsna.hl60;
import xsna.hm60;
import xsna.ho60;
import xsna.hux;
import xsna.i0q0;
import xsna.i21;
import xsna.ig;
import xsna.iou;
import xsna.it60;
import xsna.iur;
import xsna.j6f0;
import xsna.js60;
import xsna.ju4;
import xsna.jz60;
import xsna.kr50;
import xsna.ku1;
import xsna.lbs;
import xsna.lj50;
import xsna.lj60;
import xsna.lmc;
import xsna.ln20;
import xsna.lpj;
import xsna.lur;
import xsna.lz2;
import xsna.m170;
import xsna.m7m;
import xsna.mbs;
import xsna.mj60;
import xsna.mo60;
import xsna.msy;
import xsna.mt60;
import xsna.mzp0;
import xsna.n0n;
import xsna.nj60;
import xsna.nr60;
import xsna.ntz;
import xsna.nzw;
import xsna.o0u0;
import xsna.o170;
import xsna.obh;
import xsna.oc60;
import xsna.ods;
import xsna.ohh0;
import xsna.oj60;
import xsna.ol60;
import xsna.or60;
import xsna.ow90;
import xsna.oz50;
import xsna.ozl;
import xsna.p90;
import xsna.pds;
import xsna.pn60;
import xsna.pp00;
import xsna.puq0;
import xsna.pwc0;
import xsna.qcy;
import xsna.qhh0;
import xsna.qn60;
import xsna.re40;
import xsna.rkt;
import xsna.rl60;
import xsna.rm60;
import xsna.rov;
import xsna.rql0;
import xsna.rru;
import xsna.rw60;
import xsna.rwc0;
import xsna.rz60;
import xsna.rzp0;
import xsna.s3q0;
import xsna.s6y;
import xsna.sm60;
import xsna.sr60;
import xsna.sv60;
import xsna.tc60;
import xsna.ths;
import xsna.too0;
import xsna.tr60;
import xsna.tv60;
import xsna.ul50;
import xsna.uq60;
import xsna.vhs;
import xsna.vi0;
import xsna.vrk0;
import xsna.vs60;
import xsna.w3r;
import xsna.w8q;
import xsna.wc60;
import xsna.wc60.a;
import xsna.wd60;
import xsna.wjs0;
import xsna.wo60;
import xsna.wv0;
import xsna.x4u;
import xsna.xa80;
import xsna.xh60;
import xsna.xif0;
import xsna.xl60;
import xsna.xn60;
import xsna.xsx;
import xsna.xu0;
import xsna.xv0;
import xsna.y1q0;
import xsna.y22;
import xsna.y3v;
import xsna.yl60;
import xsna.yo60;
import xsna.yw90;
import xsna.z00;
import xsna.zds;
import xsna.zjf0;
import xsna.zrd0;

/* compiled from: NewsfeedFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedFragment extends FragmentImpl implements pds, qhh0, ohh0, o0u0, ods, zds, too0 {
    public static final /* synthetic */ qcy<Object>[] J0;
    public c9x A0;
    public gzs<s3q0> B0;
    public gkq C0;
    public final bpn0 D0;
    public final b E0;
    public final fwx F0;
    public final ntz G0;
    public final atx H0;
    public final xsx I0;
    public final Object N;
    public final bpn0 O;
    public ek40 P;
    public final io.reactivex.rxjava3.disposables.b Q;
    public final wd60 R;
    public pn60 S;
    public qn60 T;
    public final Object U;
    public final nzw V;
    public final bpn0 W;
    public final bpn0 X;
    public final mt60 Y;
    public final c Z;
    public final Object a0;
    public bin0<Context> b0;
    public bin0<Boolean> c0;
    public final AtomicInteger d0;
    public final AtomicReference<String> e0;
    public final bpn0 f0;
    public final vrk0 g0;
    public final d h0;
    public ct60 i0;
    public boolean j0;
    public RecyclerView k0;
    public int l0;
    public SwipeDrawableRefreshLayout m0;
    public View n0;
    public ee o0;
    public AppBarLayout p0;
    public View q0;
    public final Object r0;
    public final Object s0;
    public final bpn0 t0;
    public final bpn0 u0;
    public final Object v0;
    public final Object w0;
    public int x0;
    public int y0;
    public List<? extends ol60> z0;

    /* compiled from: NewsfeedFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(NewsfeedFragment.class, null, null);
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.FEED, null, false, 62);
            UUID uuid = (UUID) c.d();
            mzp0 mzp0Var = (mzp0) c.g();
            this.j.putSerializable("com.vk.newsfeed.impl.fragments.UI_MEASURING_UUID_ARG", uuid);
            mzp0Var.init();
            zrd0 zrd0Var = zrd0.a;
            Pair a = zrd0.a(PerformanceScoreProduct.FEED);
            UUID uuid2 = (UUID) a.d();
            yw90 yw90Var = (yw90) a.g();
            zrd0.d(this.j, uuid2);
            yw90Var.init();
        }

        public final void y(int i, long j) {
            Bundle bundle = this.j;
            bundle.putLong("initial_post_owner_id", j);
            bundle.putInt("initial_post_id", i);
        }
    }

    /* compiled from: NewsfeedFragment.kt */
    public static final class b extends FragmentImpl.b {
        public b() {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
            if (NewsfeedFragment.this.jo()) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: NewsfeedFragment.kt */
    public static final class c implements fo60 {
        public c() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 aVar;
            qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
            NewsfeedFragment newsfeedFragment = NewsfeedFragment.this;
            rz60 io2 = newsfeedFragment.io();
            newsfeedFragment.Y.getClass();
            if (xn60Var instanceof xn60.a) {
                aVar = new vs60.b((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d.a) {
                aVar = vs60.g.a.b;
            } else if (xn60Var instanceof xn60.d.c) {
                aVar = vs60.g.c.b;
            } else if (xn60Var instanceof xn60.d.b) {
                aVar = vs60.g.b.b;
            } else if (xn60Var instanceof xn60.b) {
                aVar = new vs60.e((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new vs60.f.a((xn60.c) xn60Var);
            }
            io2.b(aVar);
        }
    }

    /* compiled from: NewsfeedFragment.kt */
    public static final class d implements bq60 {
        public d() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
            gt60 gt60Var = (gt60) NewsfeedFragment.this.X.getValue();
            xh60.e eVar = new xh60.e(yo60Var);
            ((it60) gt60Var.e.getValue()).b((ct60) gt60Var.a.invoke(), (NewsfeedFragment) gt60Var.b.c, gt60Var.c.invoke(), gt60Var.d.invoke(), eVar);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedFragment.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/presentation/newsfeed_backstage/NewsfeedStore;", 0);
        fpf0.a.getClass();
        J0 = new qcy[]{propertyReference1Impl};
    }

    public NewsfeedFragment() {
        wv0 wv0Var = new wv0(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, wv0Var);
        this.O = new bpn0(new b010(this, 15));
        this.Q = new io.reactivex.rxjava3.disposables.b();
        this.R = new wd60(0);
        this.U = msy.a(lazyThreadSafetyMode, new ln20(this, 6));
        this.V = new nzw(fpf0.d(rz60.class).toString(), this, new e550(this, 2));
        this.W = new bpn0(new s6y(this, 15));
        this.X = new bpn0(new gzv(this, 20));
        this.Y = new mt60();
        this.Z = new c();
        this.a0 = msy.a(lazyThreadSafetyMode, new x4u(this, 22));
        this.b0 = new fj60(0, this);
        this.c0 = new bin0() { // from class: xsna.gj60
            @Override // xsna.bin0
            public final Object get() {
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return Boolean.valueOf(NewsfeedFragment.this.isAdded());
            }
        };
        this.d0 = new AtomicInteger(0);
        this.e0 = new AtomicReference<>("news");
        this.f0 = new bpn0(new xu0(24));
        this.g0 = new vrk0();
        this.h0 = new d();
        this.r0 = msy.a(lazyThreadSafetyMode, new xv0(15));
        this.s0 = msy.a(lazyThreadSafetyMode, new vi0(27));
        this.t0 = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(25));
        this.u0 = new bpn0(new g13(17));
        this.v0 = msy.a(lazyThreadSafetyMode, new ig(21));
        this.w0 = msy.a(lazyThreadSafetyMode, new i21(22));
        this.D0 = new bpn0(new lz2(20));
        this.E0 = new b();
        this.F0 = new fwx(new atm(this, 26), new dj60(this, 0), new btm(this, 29), new kr50(this, 3), new iou(this, 24), new re40(this, 3), ho());
        w8q w8qVar = new w8q(this, 28);
        ntz ntzVar = new ntz();
        ntzVar.b = w8qVar;
        this.G0 = ntzVar;
        by20 by20Var = new by20(this, 11);
        b410 b410Var = new b410(this, 7);
        atx atxVar = new atx();
        atxVar.b = by20Var;
        atxVar.c = b410Var;
        this.H0 = atxVar;
        pp00 pp00Var = new pp00(this, 14);
        xsx xsxVar = new xsx();
        xsxVar.b = pp00Var;
        this.I0 = xsxVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ods
    public final void Dm(int i, int i2) {
        hl60 hl60Var = hl60.a;
        hl60.c(i - this.x0);
        ad60 ad60Var = (ad60) fo().r.getValue();
        ad60Var.h = i;
        ad60Var.g = i2;
        gsr gsrVar = ad60Var.d;
        if (gsrVar != null) {
            gsrVar.setTranslationY((-i2) - i);
        }
        Kg(i, i2);
        rwc0<? extends pwc0> rwc0Var = fo().e().p;
        if (rwc0Var != null) {
            rwc0Var.setOffset(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        ((tc60) fo().c.U.getValue()).c();
        fo().e().h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        go().g();
        ((o170) fo().c.V.getValue()).c();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.E0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ods
    public final void Kg(int i, int i2) {
        this.x0 = i;
        ad60 ad60Var = (ad60) fo().r.getValue();
        ad60Var.h = i;
        ad60Var.g = i2;
        wc60 c2 = fo().c();
        boolean z = this.x0 != 0;
        if (z != c2.m) {
            c2.m = z;
            c2.d.a(new vs60.c.b(z));
        }
        lo();
        ko();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.E0.b();
        ((aw60) fo().c.e0.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        wo60 wo60Var = (wo60) fo().c.R.getValue();
        VkContextMenu vkContextMenu = wo60Var.g;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        wo60Var.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0016, B:10:0x0022, B:15:0x002d, B:17:0x003b, B:18:0x0041, B:22:0x0049), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0016, B:10:0x0022, B:15:0x002d, B:17:0x003b, B:18:0x0041, B:22:0x0049), top: B:2:0x0001 }] */
    @Override // xsna.o0u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T5() {
        boolean z;
        boolean z2;
        try {
            if (isDetached()) {
                return false;
            }
            wc60 c2 = fo().c();
            RecyclerView recyclerView = this.k0;
            vs60.c.a aVar = vs60.c.a.b;
            if (recyclerView != null) {
                c2.getClass();
                if (recyclerView.computeVerticalScrollOffset() == 0) {
                    z = true;
                    z2 = !c2.n && z;
                    if (z2) {
                        if (c2.b.get().booleanValue()) {
                            c2.d.a(aVar);
                        } else {
                            c2.p.add(aVar);
                        }
                    }
                    if (z2) {
                        return s();
                    }
                    return true;
                }
            }
            z = false;
            if (c2.n) {
            }
            if (z2) {
            }
            if (z2) {
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            return false;
        }
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
            AppBarLayout appBarLayout = this.p0;
            if (appBarLayout != null) {
                appBarLayout.g(false, false, true);
            }
            RecyclerView recyclerView = this.k0;
            if (recyclerView != null) {
                recyclerView.post(new Runnable() { // from class: xsna.jj60
                    @Override // java.lang.Runnable
                    public final void run() {
                        qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                        NewsfeedFragment newsfeedFragment = NewsfeedFragment.this;
                        newsfeedFragment.fo().k.j(i, i2, newsfeedFragment.q0);
                    }
                });
            }
        }
    }

    public final void eo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Integer valueOf = arguments.containsKey("list_id") ? Integer.valueOf(arguments.getInt("list_id", 0)) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                this.d0.set(intValue);
                ho().set(ce60.k(ce60.b, intValue));
            }
        }
    }

    public final ct60 fo() {
        ct60 ct60Var = this.i0;
        if (ct60Var != null) {
            return ct60Var;
        }
        bin0<Boolean> bin0Var = this.c0;
        at60 at60Var = (at60) this.W.getValue();
        ju4 ju4Var = new ju4(this.e0, ho());
        FragmentEntry Kn = Kn();
        mo60 mo60Var = new mo60(ju4Var, this.O, this.D, new tr60(Kn != null ? Kn.d : null, true, null, FullSourceJoinApi.EntryServiceType.FEED, null, VideoAutoPlayDelayType.FEED, 441), this.Z, this.h0, this.Q, msy.a(LazyThreadSafetyMode.NONE, new obh(this, 26)), new fb80.a() { // from class: xsna.ej60
            @Override // xsna.fb80.a
            public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
                NewsfeedFragment newsfeedFragment = NewsfeedFragment.this;
                vrk0 vrk0Var = newsfeedFragment.g0;
                int i = newsfeedFragment.d0.get();
                ce60.b.getClass();
                boolean m = ce60.m();
                vrk0Var.getClass();
                return vrk0.a(i, m);
            }
        }, null);
        mo60Var.e = this.b0;
        ct60 ct60Var2 = new ct60(this.d0, this.D, bin0Var, at60Var, this.Q, mo60Var);
        if (!this.j0) {
            this.i0 = ct60Var2;
        }
        return ct60Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 go() {
        return (uq60) this.a0.getValue();
    }

    public final AtomicReference<String> ho() {
        return (AtomicReference) this.f0.getValue();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.B0 = gzsVar;
        }
    }

    public final rz60 io() {
        qcy<Object> qcyVar = J0[0];
        return (rz60) this.V.getValue();
    }

    public final boolean jo() {
        return ((Boolean) this.D0.getValue()).booleanValue();
    }

    public final void ko() {
        if (jo()) {
            int i = this.y0 + this.x0;
            if (i < 0) {
                i = 0;
            }
            RecyclerView recyclerView = this.k0;
            if (recyclerView != null) {
                recyclerView.setClipToPadding(false);
                f4m.y(i, recyclerView);
            }
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.m0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setInContentTopInset(i);
            }
        }
    }

    public final void lo() {
        RecyclerView recyclerView = this.k0;
        if (recyclerView != null) {
            int i = this.l0 + 0;
            if (jo() || recyclerView.getPaddingBottom() != i) {
                int i2 = 0;
                recyclerView.setClipToPadding(false);
                if (jo()) {
                    int i3 = this.y0 + this.x0;
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                } else {
                    i2 = recyclerView.getPaddingTop();
                }
                awt0.x(recyclerView, 0, i2, 0, i, 5);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        ((tc60) fo().c.U.getValue()).d();
        fo().e().k(getActivity(), fo().k);
        go().h();
        ((o170) fo().c.V.getValue()).b(this.k0);
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
        String string;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            rw60 d2 = fo().d();
            d2.getClass();
            if (arguments.containsKey("save_state_list_ref") && (string = arguments.getString("save_state_list_ref")) != null) {
                d2.c.set(string);
            }
            if (arguments.containsKey("save_state_list_id")) {
                d2.b.set(arguments.getInt("save_state_list_id"));
            }
        }
        this.D.a(new nr60(this, this.Z));
        f170 g = fo().g();
        Bundle arguments2 = getArguments();
        g.getClass();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable("com.vk.newsfeed.impl.fragments.UI_MEASURING_UUID_ARG") : null;
        UUID uuid = serializable instanceof UUID ? (UUID) serializable : null;
        if (uuid != null) {
            g.c = uuid;
        }
        mzp0 a2 = g.a();
        if (a2 != null) {
            a2.start();
        }
        go().b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fo().k.g(hux.f.b.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            rw60 d2 = fo().d();
            d2.getClass();
            d2.d = Integer.valueOf(bundle.getInt("save_state_first_visible"));
            d2.e = Integer.valueOf(bundle.getInt("save_state_offset"));
            String string = bundle.getString("save_state_list_ref");
            if (string != null) {
                d2.c.set(string);
            }
            d2.b.set(bundle.getInt("save_state_list_id"));
        }
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.i = System.currentTimeMillis();
        dx90Var.r();
        new PerfLogger().a(PerfLogger.Event.NEWSFEED_CREATED);
        super.onCreate(bundle);
        ((y1q0) fo().n.getValue()).b();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            d070 f = fo().f();
            f.getClass();
            if (!p90.e(activity)) {
                d070.a aVar = new d070.a(activity, f);
                c63 c63Var = c63.a;
                c63.a(aVar);
                f.v = aVar;
            }
        }
        ad0.c(y22.a(this), new ku1(23, this, new m170(new js60())));
        his0.d++;
        if (his0.c == null || !(!r4.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.P = new ek40();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext();
        return layoutInflater.inflate(R.layout.fragment_newsfeed, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        ek40 ek40Var = this.P;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.P = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        d070 f = fo().f();
        d070.a aVar = f.v;
        if (aVar != null) {
            c63 c63Var = c63.a;
            c63.c(aVar);
            f.v = null;
        }
        fo().e().e();
        ehv ehvVar = (ehv) fo().m.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        fo().m.b = null;
        this.B0 = null;
        this.Q.e();
        io().clear();
        pn60 pn60Var = this.S;
        if (pn60Var != null) {
            pn60Var.a();
        }
        this.S = null;
        qn60 qn60Var = this.T;
        if (qn60Var != null) {
            qn60Var.a();
        }
        this.T = null;
        ct60 ct60Var = this.i0;
        if (ct60Var != null) {
            ct60Var.c.a();
        }
        this.i0 = null;
        this.j0 = true;
        fwx fwxVar = this.F0;
        fwxVar.b = null;
        fwxVar.c = null;
        fwxVar.d = null;
        fwxVar.e = null;
        fwxVar.f = null;
        fwxVar.g = null;
        fwxVar.i.a();
        atx atxVar = this.H0;
        atxVar.b = null;
        atxVar.c = null;
        this.G0.b = null;
        this.I0.b = null;
        gt60 gt60Var = (gt60) this.X.getValue();
        gt60Var.c = et60.b;
        gt60Var.d = ft60.b;
        this.b0 = lmc.c;
        this.c0 = cvk.b;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        ee eeVar;
        FragmentImpl fragmentImpl;
        mbs mbsVar;
        f5z f5zVar;
        Lifecycle lifecycle;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.R.clear();
        ((awy) fo().c.y.getValue()).a();
        RecyclerView recyclerView3 = this.k0;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.k0;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener(fo().b());
        }
        if (((Boolean) this.s0.getValue()).booleanValue() && (recyclerView2 = this.k0) != null) {
            recyclerView2.removeOnScrollListener((y3v) this.w0.getValue());
        }
        RecyclerView recyclerView5 = this.k0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) fo().m.b;
        if (ehvVar != null && (recyclerView = this.k0) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        fo().k.b();
        d070 f = fo().f();
        f.a().stop();
        WeakReference<f5z> weakReference = f.h;
        if (weakReference != null && (f5zVar = weakReference.get()) != null && (lifecycle = f5zVar.getLifecycle()) != null) {
            lifecycle.removeObserver(f.i);
        }
        f.h = null;
        WeakReference<FragmentImpl> weakReference2 = f.g;
        if (weakReference2 != null && (fragmentImpl = weakReference2.get()) != null && (mbsVar = fragmentImpl.D) != null) {
            mbsVar.d(f.j);
        }
        f.g = null;
        fo().a().F0((or60) fo().c.t.getValue());
        fo().a().F0((oc60) fo().c.z.getValue());
        fo().a().G0((rl60) fo().c.A.getValue());
        fo().a().G0(((sr60) fo().c.o.getValue()).c);
        fo().a().G0((zjf0) fo().c.B.getValue());
        fo().a().k = null;
        fo().a().E0();
        d070 f2 = fo().f();
        fo().a().G0(f2.r);
        xif0 xif0Var = f2.w;
        if (xif0Var != null) {
            xif0Var.b();
        }
        f2.w = null;
        f2.x = null;
        f2.s = null;
        f2.t = null;
        fo().a().clear();
        fo().e().f();
        ehv ehvVar2 = (ehv) fo().m.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) fo().c.b0.getValue()).d();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.m0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setOnRefreshListener(null);
        }
        View view = getView();
        if (view != null && (eeVar = (ee) view.findViewById(R.id.error_view)) != null) {
            eeVar.setRetryClickListener(null);
        }
        this.k0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        go().c();
        ad60 ad60Var = (ad60) fo().r.getValue();
        ad60Var.e = null;
        ad60Var.g = 0;
        ad60Var.h = 0;
        ad60Var.b();
        gsr gsrVar = ad60Var.d;
        if (gsrVar != null) {
            gsrVar.setIsVisible(false);
        }
        ad60Var.d = null;
        fo().k.c();
        fo().k.f = null;
        super.onDestroyView();
        View view2 = getView();
        if (view2 != null) {
            gqo.f(view2, null);
        }
        gkq gkqVar = this.C0;
        if (gkqVar != null) {
            iur iurVar = gkqVar.d;
            if (iurVar != null && (viewGroup = iurVar.c) != null) {
                viewGroup.removeView(iurVar.d);
            }
            gkqVar.d = null;
        }
        this.C0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        iur iurVar;
        fo().e().g();
        ((yl60) fo().c.b0.getValue()).a();
        if (((Boolean) this.t0.getValue()).booleanValue()) {
            sv60 sv60Var = (sv60) fo().c.c0.getValue();
            sv60.a aVar = sv60Var.c;
            if (aVar != null) {
                sv60Var.b.removeCallbacks(aVar);
                sv60Var.c = null;
            }
            sv60Var.e = true;
        }
        super.onPause();
        go().d();
        ehv ehvVar = (ehv) fo().m.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
        ((at60) this.W.getValue()).a(vs60.a.C3901a.b);
        gkq gkqVar = this.C0;
        if (gkqVar == null || (iurVar = gkqVar.d) == null) {
            return;
        }
        lur lurVar = iurVar.d;
        lurVar.b.l0();
        lurVar.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        AppBarLayout appBarLayout;
        super.onResume();
        go().e();
        if (((Boolean) this.r0.getValue()).booleanValue() && (appBarLayout = this.p0) != null) {
            appBarLayout.g(true, false, true);
        }
        fo().e().j();
        ehv ehvVar = (ehv) fo().m.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) fo().c.b0.getValue()).b();
        if (((Boolean) this.t0.getValue()).booleanValue()) {
            ((sv60) fo().c.c0.getValue()).e = false;
        }
        gzs<s3q0> gzsVar = this.B0;
        if (gzsVar != null) {
            this.B0 = null;
            gzsVar.invoke();
        }
        if (((Boolean) this.v0.getValue()).booleanValue()) {
            hl60 hl60Var = hl60.a;
            hl60.k();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        View findViewByPosition;
        super.onSaveInstanceState(bundle);
        rw60 d2 = fo().d();
        Bundle arguments = getArguments();
        RecyclerView recyclerView = this.k0;
        AtomicReference<String> atomicReference = d2.c;
        AtomicInteger atomicInteger = d2.b;
        bundle.putLong("save_state_inactive_time", ((AtomicLong) d2.a.b).get());
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int i = 0;
        int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(v)) != null) {
            i = findViewByPosition.getTop();
        }
        bundle.putInt("save_state_first_visible", v);
        bundle.putInt("save_state_offset", i);
        bundle.putInt("save_state_list_id", atomicInteger.get());
        bundle.putString("save_state_list_ref", atomicReference.get());
        if (arguments != null) {
            arguments.putInt("save_state_list_id", atomicInteger.get());
        }
        if (arguments != null) {
            arguments.putString("save_state_list_ref", atomicReference.get());
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView.u rruVar;
        ehv ehvVar;
        d2e0 fllVar;
        super.onViewCreated(view, bundle);
        ul50<s3q0, State> ul50Var = ul50.this;
        gom0 gom0Var = new gom0();
        gom0.a(gom0Var, lj60.b, this.F0);
        gom0.a(gom0Var, mj60.b, this.G0);
        gom0.a(gom0Var, nj60.b, this.H0);
        gom0.a(gom0Var, oj60.b, this.I0);
        s3q0 s3q0Var = s3q0.a;
        ul50Var.f = new en50(gom0Var.a, gom0Var.b, gom0Var.c);
        s3q0 s3q0Var2 = s3q0.a;
        go().i();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            ((ad60) fo().r.getValue()).e = viewGroup;
        }
        FragmentActivity activity = getActivity();
        this.q0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        this.l0 = recyclerView.getPaddingBottom();
        fo().k.h(recyclerView);
        ct60 fo = fo();
        mo60 mo60Var = fo.c;
        fh9 fh9Var = fo.m;
        h7m h7mVar = fo.B;
        recyclerView.setHasFixedSize(true);
        EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(recyclerView.getContext(), this, (com.vk.stat.recycler.d) mo60Var.C.getValue());
        focusableLinearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(focusableLinearLayoutManager);
        FragmentActivity activity2 = getActivity();
        FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
        feedFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (!bVar.a(feedFeatures)) {
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
        recyclerView.addOnScrollListener(new c5r((ClipsViewerComponent) h7mVar.a(fpf0.a(ClipsViewerComponent.class)), (NewsfeedOptionalAdsComponent) h7mVar.mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class))));
        recyclerView.addOnScrollListener(fo.b());
        ((tc60) mo60Var.U.getValue()).a(recyclerView);
        ((o170) mo60Var.V.getValue()).a(recyclerView);
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            wc60 c2 = fo.c();
            c2.getClass();
            Activity h = e3m.h(mo2getContext);
            if (h != null) {
                c2.f.f(h);
            }
            wc60.a aVar = c2.new a();
            c2.c.l(aVar);
            c2.j = aVar;
        }
        ((aw60) mo60Var.e0.getValue()).a();
        fo.b().l(new j6f0(((sr60) mo60Var.o.getValue()).a()));
        bw60 bw60Var = new bw60(recyclerView);
        Context mo2getContext2 = mo2getContext();
        if (mo2getContext2 != null) {
            ehvVar = new ehv(mo2getContext2, bw60Var, fh9Var.a());
            recyclerView.addOnScrollListener(ehvVar);
        } else {
            ehvVar = null;
        }
        fh9Var.b = ehvVar;
        recyclerView.setItemAnimator((hm60) mo60Var.f0.getValue());
        fo.a().C0((or60) mo60Var.t.getValue());
        fo.a().C0((oc60) mo60Var.z.getValue());
        fo.a().D0(((sr60) mo60Var.o.getValue()).c);
        fo.a().D0((rl60) mo60Var.A.getValue());
        fo.a().D0((zjf0) mo60Var.B.getValue());
        d070 f = fo().f();
        ho60 a2 = fo.a();
        f.x = recyclerView;
        a2.D0(f.r);
        f.w = new xif0(recyclerView);
        recyclerView.addOnScrollListener(new e070(f));
        dui b2 = fo.b();
        yl60 yl60Var = (yl60) mo60Var.b0.getValue();
        yl60Var.getClass();
        b2.l(new xl60(yl60Var));
        ((yl60) mo60Var.b0.getValue()).c();
        if (((Boolean) this.t0.getValue()).booleanValue()) {
            dui b3 = fo.b();
            sv60 sv60Var = (sv60) mo60Var.c0.getValue();
            sv60Var.getClass();
            b3.l(new tv60(sv60Var));
        }
        com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) mo60Var.C.getValue();
        if (dVar != null) {
            fo.a().k = dVar;
        }
        ow90 ow90Var = ow90.a;
        ScrollScreenType scrollScreenType = ScrollScreenType.FEED;
        ow90.c(scrollScreenType, recyclerView);
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            ((efs) ow90.n.getValue()).b(activity3, this.D, scrollScreenType, dx90.V);
        }
        recyclerView.setAdapter(fo.a());
        View rootView = recyclerView.getRootView();
        AppBarLayout appBarLayout = rootView != null ? (AppBarLayout) rootView.findViewById(R.id.app_bar_layout) : null;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        this.p0 = appBarLayout;
        fo.a();
        if (BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
        }
        bs60 e = fo.e();
        getActivity();
        e.i(recyclerView, fo.a());
        List<? extends ol60> list = this.z0;
        List<? extends ol60> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            fo.e().l();
            ho60 a3 = fo.a();
            c9x c9xVar = this.A0;
            if (c9xVar == null) {
                c9xVar = d9x.a;
            }
            a3.z0().d(list, c9xVar);
            ((o170) mo60Var.V.getValue()).b(recyclerView);
            fo.e().a(list);
            fo.g().c(list, getView(), On());
            xif0 xif0Var = fo().f().w;
            if (xif0Var != null) {
                xif0Var.a();
            }
            ehv ehvVar2 = (ehv) fo().m.b;
            if (ehvVar2 != null) {
                ehvVar2.r();
            }
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.m0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setRefreshing(false);
            }
            f170 g = fo.g();
            if (!g.d) {
                g.d = true;
                i0q0.f(new rkt(g, 17));
            }
            View view2 = this.n0;
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
            ee eeVar = this.o0;
            if (eeVar != null) {
                bwt0.p0(eeVar, false);
            }
            this.z0 = null;
        }
        fo().k.f = new sm60(recyclerView, new rm60(recyclerView, this.Z));
        if (((Boolean) this.u0.getValue()).booleanValue()) {
            a4r a4rVar = fo().k;
            w3r w3rVar = new w3r(recyclerView);
            RecyclerView recyclerView2 = a4rVar.c;
            if (recyclerView2 != null) {
                recyclerView2.setAccessibilityDelegateCompat(w3rVar);
            }
            n0n n0nVar = new n0n();
            FeedRecyclerView feedRecyclerView = recyclerView instanceof FeedRecyclerView ? (FeedRecyclerView) recyclerView : null;
            if (feedRecyclerView != null) {
                feedRecyclerView.setDisclaimerTouchHelper(n0nVar);
            }
        }
        fo().k.g(hux.c.C3024c.a);
        fo().k.g(hux.f.b.a);
        if (((Boolean) this.s0.getValue()).booleanValue()) {
            recyclerView.addOnScrollListener((y3v) this.w0.getValue());
        }
        this.k0 = recyclerView;
        lo();
        zm(this.y0);
        wc60 c3 = fo().c();
        c3.i = new vhs(new ths((ViewGroup) view.findViewById(R.id.list_container), new z00(c3, 8)), c3.e);
        fkq b4 = com.vk.toggle.d.C0.b();
        if (b4 == null) {
            fkq.h.getClass();
            b4 = fkq.j;
        }
        fkq.h.getClass();
        if (!epx.f(b4, fkq.j)) {
            gkq gkqVar = new gkq(b4);
            this.C0 = gkqVar;
            if (b4.a() && !b4.e) {
                iur iurVar = new iur(view, !b4.f);
                gkqVar.d = iurVar;
                iurVar.d.setAnimation(R.raw.lepestki);
                iur iurVar2 = gkqVar.d;
                if (iurVar2 != null) {
                    lur lurVar = iurVar2.d;
                    ViewGroup viewGroup2 = iurVar2.c;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(lurVar);
                    }
                    lurVar.setVisibility(8);
                }
            }
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout2 = (SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        view.getContext();
        swipeDrawableRefreshLayout2.setOnRefreshListener(new fq1(this, 27));
        RecyclerView recyclerView3 = this.k0;
        if (recyclerView3 != null) {
            d070 f2 = fo().f();
            cht chtVar = f2.k;
            if (chtVar != null) {
                recyclerView3.removeOnScrollListener(chtVar);
            }
            cht chtVar2 = f2.k;
            if (chtVar2 != null) {
                recyclerView3.addOnScrollListener(chtVar2);
            }
        }
        gkq gkqVar2 = this.C0;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
        coreFeatures.getClass();
        if (bVar.a(coreFeatures)) {
            fllVar = new fll(context);
        } else {
            if (gkqVar2 != null) {
                fkq fkqVar = gkqVar2.a;
                if (fkqVar.a() && !fkqVar.g) {
                    fllVar = new ekq(context, gkqVar2);
                }
            }
            fllVar = new fll(context);
        }
        swipeDrawableRefreshLayout2.setProgressDrawableFactory(fllVar);
        this.m0 = swipeDrawableRefreshLayout2;
        ko();
        View findViewById = view.findViewById(R.id.progressbar);
        this.n0 = findViewById;
        ee eeVar2 = (ee) view.findViewById(R.id.error_view);
        eeVar2.setRetryClickListener(new xa80() { // from class: xsna.kj60
            @Override // xsna.xa80
            public final void b() {
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                ((at60) NewsfeedFragment.this.W.getValue()).a(vs60.g.a.b);
            }
        });
        this.o0 = eeVar2;
        f170 g2 = fo().g();
        if (bundle == null) {
            mzp0 a4 = g2.a();
            if (a4 != null) {
                a4.e(view);
            }
        } else {
            g2.getClass();
        }
        ce60.b.getClass();
        if (!ce60.e) {
            g2.b = SystemClock.uptimeMillis();
            dx90 dx90Var = ow90.e;
            dx90Var.getClass();
            dx90Var.j = System.currentTimeMillis();
            dx90Var.r();
        }
        rw60 d2 = fo().d();
        d2.getClass();
        if (bundle != null) {
            ((AtomicLong) d2.a.b).set(bundle.getLong("save_state_inactive_time", 0L));
        }
        if (bundle == null) {
            FragmentActivity activity4 = getActivity();
            NavigationDelegateActivity navigationDelegateActivity = activity4 instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) activity4 : null;
            if (navigationDelegateActivity != null && navigationDelegateActivity.Y().b.n().p() == 1) {
                ((FullscreenPromoComponent) m7m.d(this).a(fpf0.a(FullscreenPromoComponent.class))).n().c(FullscreenPromoEvent.FeedStart.c, null);
            }
        }
        d070 f3 = fo().f();
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        f3.s = findViewById;
        f3.t = eeVar2;
        f3.a.a(vs60.i.b.b);
        viewLifecycleOwner.getLifecycle().addObserver(f3.i);
        this.D.a(f3.j);
        f3.h = new WeakReference<>(viewLifecycleOwner);
        f3.g = new WeakReference<>(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        rw60 d2 = fo().d();
        d2.getClass();
        if (bundle != null) {
            ((AtomicLong) d2.a.b).set(bundle.getLong("save_state_inactive_time", 0L));
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        try {
            if (!isDetached()) {
                d070 f = fo().f();
                f.getClass();
                Iterator<rov> it = f.o.iterator();
                while (it.hasNext()) {
                    rov next = it.next();
                    if (next != null) {
                        if (next instanceof rql0) {
                            ((rql0) next).t6();
                        } else {
                            f.n = true;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        RecyclerView recyclerView = this.k0;
        if (recyclerView != null && recyclerView.computeVerticalScrollOffset() == 0) {
            return false;
        }
        RecyclerView recyclerView2 = this.k0;
        if (recyclerView2 != null) {
            recyclerView2.scrollToPosition(0);
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        eo();
        int i = this.d0.get();
        ce60.b.getClass();
        boolean m = ce60.m();
        this.g0.getClass();
        uiTrackingScreen.a = vrk0.a(i, m);
    }

    @Override // xsna.zds
    public final void zm(int i) {
        if (jo()) {
            this.y0 = i;
            ko();
            lo();
        }
    }
}
