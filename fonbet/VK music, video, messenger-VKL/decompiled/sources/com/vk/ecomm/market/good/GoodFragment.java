package com.vk.ecomm.market.good;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.api.generated.market.dto.MarketGetItemCardItemTypeDto;
import com.vk.bridges.ImageViewer;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.Variant;
import com.vk.dto.market.VariantGroup;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;
import com.vk.ecomm.market.good.ui.c;
import com.vk.ecomm.market.good.ui.e;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.movika.sdk.base.logic.interactor.i;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketSwitchItemVariantItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMarketItem;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.CardRecyclerFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a4u;
import xsna.a8u;
import xsna.anj;
import xsna.asu0;
import xsna.at6;
import xsna.ay00;
import xsna.b510;
import xsna.ba40;
import xsna.bjc;
import xsna.bn7;
import xsna.bpn0;
import xsna.by9;
import xsna.c2y;
import xsna.cfl;
import xsna.cj1;
import xsna.cnh;
import xsna.cqf;
import xsna.cvk;
import xsna.cws;
import xsna.cxo;
import xsna.dg1;
import xsna.dgg;
import xsna.dhr0;
import xsna.dnh;
import xsna.e43;
import xsna.e4u;
import xsna.eeg;
import xsna.egg;
import xsna.ejd0;
import xsna.el30;
import xsna.eph;
import xsna.epx;
import xsna.ey00;
import xsna.eyi0;
import xsna.f4m;
import xsna.f5y;
import xsna.f5z;
import xsna.fbh;
import xsna.feg;
import xsna.fnd0;
import xsna.fnj;
import xsna.fpf0;
import xsna.frg;
import xsna.fy00;
import xsna.fyi0;
import xsna.fz7;
import xsna.g7s0;
import xsna.gc10;
import xsna.gnd0;
import xsna.gpu0;
import xsna.gwh0;
import xsna.h010;
import xsna.hf8;
import xsna.hg1;
import xsna.hnd0;
import xsna.i210;
import xsna.i22;
import xsna.i3u;
import xsna.iah0;
import xsna.ies;
import xsna.irc0;
import xsna.izs;
import xsna.j03;
import xsna.j3z;
import xsna.ja80;
import xsna.jai;
import xsna.jid0;
import xsna.jjv0;
import xsna.jo3;
import xsna.jw00;
import xsna.k5h;
import xsna.kdg0;
import xsna.kjf0;
import xsna.krd0;
import xsna.krh;
import xsna.kw00;
import xsna.kz00;
import xsna.l340;
import xsna.l4;
import xsna.l50;
import xsna.lbe;
import xsna.leg;
import xsna.lnd0;
import xsna.lrv0;
import xsna.m2g;
import xsna.m3a;
import xsna.m7u;
import xsna.maz;
import xsna.mgg;
import xsna.mnd0;
import xsna.mq;
import xsna.msy;
import xsna.mt00;
import xsna.myc0;
import xsna.myh;
import xsna.mzp0;
import xsna.n5g0;
import xsna.neg;
import xsna.nfj;
import xsna.nkd0;
import xsna.nmd0;
import xsna.nwk;
import xsna.nzw;
import xsna.o110;
import xsna.o3w;
import xsna.omd0;
import xsna.ow90;
import xsna.oz50;
import xsna.ozh;
import xsna.p0e0;
import xsna.p110;
import xsna.p2u;
import xsna.p3h;
import xsna.p5h;
import xsna.pd4;
import xsna.pff;
import xsna.pfg;
import xsna.pld0;
import xsna.po40;
import xsna.q530;
import xsna.q5f;
import xsna.q9;
import xsna.qcy;
import xsna.r310;
import xsna.r41;
import xsna.r7u;
import xsna.rsg0;
import xsna.rt0;
import xsna.rzp0;
import xsna.s3q0;
import xsna.s8w;
import xsna.sdz;
import xsna.se0;
import xsna.srg;
import xsna.sv9;
import xsna.sz00;
import xsna.t4u;
import xsna.t6g0;
import xsna.t9e;
import xsna.tfx;
import xsna.trf0;
import xsna.u4u;
import xsna.ubq;
import xsna.ueg;
import xsna.uld0;
import xsna.ur0;
import xsna.uy9;
import xsna.uz;
import xsna.uzp0;
import xsna.v4u;
import xsna.vds;
import xsna.vig0;
import xsna.w00;
import xsna.w110;
import xsna.w3v;
import xsna.w6e;
import xsna.w8i;
import xsna.wcg;
import xsna.wlb0;
import xsna.x110;
import xsna.xyh;
import xsna.y4u;
import xsna.yd10;
import xsna.yfb;
import xsna.yid0;
import xsna.ymd0;
import xsna.ymq;
import xsna.yo9;
import xsna.yq;
import xsna.yw90;
import xsna.z23;
import xsna.z4u;
import xsna.zfg;
import xsna.zid0;
import xsna.zqu;
import xsna.zrd0;
import xsna.zw5;
import xsna.zyt0;

/* compiled from: GoodFragment.kt */
/* loaded from: classes18.dex */
public final class GoodFragment extends CardRecyclerFragment<kjf0.a> implements ies, vds, ja80, w8i {
    public static final /* synthetic */ qcy<Object>[] U0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final nzw M0;
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final t4u Q0;
    public final Object R0;
    public d S0;
    public final GoodFragment$receiver$1 T0;

    /* compiled from: GoodFragment.kt */
    public static final class a extends oz50 {
        @Override // xsna.oz50
        public final void r(Intent intent) {
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams;
            Integer num;
            Long l;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
            CommonMarketStat$TypeRefSource valueOf;
            UserId userId;
            Parcelable parcelable;
            Object parcelable2;
            Bundle extras = intent.getExtras();
            Bundle bundle = extras != null ? extras.getBundle("args") : null;
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("analytics_params", GoodFragmentAnalyticsParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("analytics_params");
                    if (!(parcelable3 instanceof GoodFragmentAnalyticsParams)) {
                        parcelable3 = null;
                    }
                    parcelable = (GoodFragmentAnalyticsParams) parcelable3;
                }
                goodFragmentAnalyticsParams = (GoodFragmentAnalyticsParams) parcelable;
            } else {
                goodFragmentAnalyticsParams = null;
            }
            if (bundle != null) {
                num = bundle.containsKey("id") ? Integer.valueOf((int) bundle.getLong("id")) : null;
            } else {
                num = null;
            }
            if (bundle != null) {
                l = (!bundle.containsKey("owner_id") || (userId = (UserId) bundle.getParcelable("owner_id")) == null) ? null : Long.valueOf(userId.b);
            } else {
                l = null;
            }
            if (bundle != null) {
                String string = bundle.getString("source");
                if (string != null) {
                    try {
                        valueOf = CommonMarketStat$TypeRefSource.valueOf(string.toUpperCase(Locale.getDefault()));
                    } catch (Exception unused) {
                    }
                    commonMarketStat$TypeRefSource = valueOf;
                }
                valueOf = null;
                commonMarketStat$TypeRefSource = valueOf;
            } else {
                commonMarketStat$TypeRefSource = null;
            }
            mt00.i(new mt00.b(num, l, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.g : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.b : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.c : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.d : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.e : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.i : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.j : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.k : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.l : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.m : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.o : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.p : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.n : null));
            if (l == null || num == null) {
                return;
            }
            UserId userId2 = new UserId(l.longValue());
            int intValue = num.intValue();
            String obj = commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.toString() : null;
            tfx tfxVar = new tfx("market.setAsViewed", new yq(19), new j(17));
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
            tfx.l(tfxVar, "item_id", intValue, 0, 0, 12);
            if (obj != null) {
                tfx.o(tfxVar, "stat_source", obj, 0, 0, 12);
            }
            b0 m = rsg0.w0(yfb.x(tfxVar)).m(io.reactivex.rxjava3.android.schedulers.a.b());
            new p2u(27);
            m.subscribe(new eyi0(), new c2y(new fyi0(0), 28));
        }
    }

    /* compiled from: GoodFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ejd0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ejd0 ejd0Var) {
            ((omd0) this.receiver).b(ejd0Var);
            return s3q0.a;
        }
    }

    /* compiled from: GoodFragment.kt */
    public static final class c extends GridLayoutManager.c {
        public final /* synthetic */ GridLayoutManager e;

        public c(GridLayoutManager gridLayoutManager) {
            this.e = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            List<kjf0.a> list;
            qcy<Object>[] qcyVarArr = GoodFragment.U0;
            jid0 jid0Var = GoodFragment.this.Po().G;
            if (i >= ((jid0Var == null || (list = jid0Var.c) == null) ? 0 : list.size())) {
                return this.e.s;
            }
            return 2;
        }
    }

    /* compiled from: GoodFragment.kt */
    public static final class d implements r7u {
        public d() {
        }

        @Override // xsna.r7u
        public final void a() {
            cxo Po;
            ComposeView composeView;
            qcy<Object>[] qcyVarArr = GoodFragment.U0;
            GoodFragment goodFragment = GoodFragment.this;
            goodFragment.Po().f0 = false;
            goodFragment.Ho(true);
            ymd0 ymd0Var = goodFragment.Po().Y;
            if (ymd0Var != null && (composeView = (Po = goodFragment.Po()).e0) != null) {
                ymd0Var.a(composeView, gnd0.a(Po));
            }
            goodFragment.Qo().b(new ejd0.c.C2817c(ProductCardRestrictions.NO_RESTRICTIONS));
        }

        @Override // xsna.r7u
        public final void b() {
            ComposeView composeView;
            qcy<Object>[] qcyVarArr = GoodFragment.U0;
            GoodFragment goodFragment = GoodFragment.this;
            goodFragment.Po().f0 = true;
            goodFragment.Ho(false);
            ymd0 ymd0Var = goodFragment.Po().Y;
            if (ymd0Var == null || (composeView = goodFragment.Po().e0) == null) {
                return;
            }
            ymd0Var.a(composeView, fnd0.b.a);
        }

        @Override // xsna.r7u
        public final void c(Throwable th) {
            cvk.w(j03.g(GoodFragment.this.getActivity(), th, R.string.error), false);
        }

        @Override // xsna.r7u
        public final void d() {
            qcy<Object>[] qcyVarArr = GoodFragment.U0;
            GoodFragment.this.Ko();
        }

        @Override // xsna.r7u
        public final void e() {
            ComposeView composeView;
            qcy<Object>[] qcyVarArr = GoodFragment.U0;
            GoodFragment goodFragment = GoodFragment.this;
            jid0 jid0Var = goodFragment.Po().G;
            if (jid0Var != null) {
                jid0Var.c.clear();
                jid0Var.notifyDataSetChanged();
            }
            goodFragment.Po().f0 = true;
            goodFragment.Ro();
            goodFragment.Ho(false);
            goodFragment.Bo(EmptyList.b, false);
            ymd0 ymd0Var = goodFragment.Po().Y;
            if (ymd0Var == null || (composeView = goodFragment.Po().e0) == null) {
                return;
            }
            ymd0Var.a(composeView, fnd0.b.a);
        }

        @Override // xsna.r7u
        public final void finish() {
            GoodFragment.this.finish();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GoodFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/market/good/good2/presentation/ProductCardStore;", 0);
        fpf0.a.getClass();
        U0 = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [xsna.t4u] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.vk.ecomm.market.good.GoodFragment$receiver$1] */
    public GoodFragment() {
        super(R.layout.fragment_good, 20);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ITEM, null, false, 62).j();
        mzp0Var.init();
        this.J = mzp0Var;
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ITEM).j();
        yw90Var.init();
        this.L = yw90Var;
        pd4 pd4Var = new pd4(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.J0 = msy.a(lazyThreadSafetyMode, pd4Var);
        this.K0 = msy.a(lazyThreadSafetyMode, new pff(this, 28));
        int i = 22;
        this.L0 = msy.a(lazyThreadSafetyMode, new m2g(this, i));
        this.M0 = new nzw(fpf0.d(omd0.class).toString(), this, new fbh(this, i));
        this.N0 = msy.a(lazyThreadSafetyMode, new dnh(this, 27));
        this.O0 = msy.a(lazyThreadSafetyMode, new p5h(this, 20));
        this.P0 = msy.a(lazyThreadSafetyMode, new q5f(this, 25));
        this.Q0 = new lrv0.a() { // from class: xsna.t4u
            @Override // xsna.lrv0.a
            public final void xb() {
                com.vk.ecomm.market.good.ui.d dVar;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                GoodFragment goodFragment = GoodFragment.this;
                goodFragment.invalidateOptionsMenu();
                Good good = goodFragment.Po().r;
                com.vk.ecomm.market.good.ui.c a2 = good == null ? null : c.a.a(goodFragment.requireContext(), new com.vk.ecomm.market.good.ui.b(good, goodFragment.Po().v, goodFragment.Po().u, goodFragment.Po().O, goodFragment.Po().y, goodFragment.Po().W, goodFragment.Po().d0));
                if (a2 == null || (dVar = goodFragment.Po().D) == null) {
                    return;
                }
                dVar.a(a2);
            }
        };
        this.R0 = msy.a(lazyThreadSafetyMode, new se0(19));
        this.S0 = new d();
        this.T0 = new BroadcastReceiver() { // from class: com.vk.ecomm.market.good.GoodFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                GoodFragment goodFragment = GoodFragment.this;
                if (goodFragment.getActivity() != null && "com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED".equals(intent.getAction())) {
                    goodFragment.q();
                }
            }
        };
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment
    public final gpu0 Io(jjv0 jjv0Var) {
        gpu0 Io = super.Io(jjv0Var);
        jid0 jid0Var = Po().G;
        if (jid0Var != null) {
            Io.j = jid0Var;
        }
        return Io;
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment
    public final void Jo() {
        gpu0 gpu0Var = Po().l;
        if (gpu0Var != null) {
            this.n0.removeItemDecoration(gpu0Var);
        }
        o110 o110Var = Po().m;
        if (o110Var != null) {
            this.n0.removeItemDecoration(o110Var);
        }
        jid0 jid0Var = Po().G;
        if (jid0Var != null) {
            p110 p110Var = new p110(jid0Var);
            cxo Po = Po();
            gpu0 gpu0Var2 = new gpu0(requireContext());
            gpu0Var2.j = jid0Var;
            gpu0Var2.e = 0;
            Po.l = gpu0Var2;
            Po().m = new o110(p110.b, p110.c, p110Var.a);
            o110 o110Var2 = Po().m;
            if (o110Var2 != null) {
                this.n0.addItemDecoration(o110Var2);
            }
            gpu0 gpu0Var3 = Po().l;
            if (gpu0Var3 != null) {
                this.n0.addItemDecoration(gpu0Var3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void Ko() {
        Good good = Po().r;
        if (good == null) {
            return;
        }
        ((kz00) Lo().z.getValue()).a(requireContext(), good.V, new xyh(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y4u Lo() {
        return (y4u) this.O0.getValue();
    }

    public final long Mo() {
        Good good = Po().r;
        return good != null ? good.b : requireArguments().getLong("id");
    }

    public final UserId No() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("owner_id");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        return userId == null ? UserId.d : userId;
    }

    public final CommonMarketStat$TypeRefSource Oo() {
        String string = requireArguments().getString("source");
        if (string == null) {
            string = "";
        }
        return CommonMarketStat$TypeRefSource.valueOf(string);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cxo Po() {
        return (cxo) this.P0.getValue();
    }

    @Override // xsna.vds
    public final int Q0() {
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return fnj.d(requireContext) ? -1 : 1;
    }

    public final omd0 Qo() {
        qcy<Object> qcyVar = U0[0];
        return (omd0) this.M0.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        eeg eegVar = Po().E;
        if (eegVar != null) {
            eegVar.f(true);
        }
    }

    public final void Ro() {
        Po().getClass();
        View view = Po().o;
        if (view != null) {
            f4m.j(view);
        }
        View view2 = Po().p;
        if (view2 != null) {
            f4m.j(view2);
        }
    }

    public final void So(LoadingState loadingState) {
        if (Po().G != null) {
            if (this.n0.isComputingLayout() || this.n0.getScrollState() != 0) {
                this.n0.post(new at6(6, this, loadingState));
                return;
            }
            jid0 jid0Var = Po().G;
            if (jid0Var != null) {
                jid0Var.z0(loadingState);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01e9  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ja80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V3(krd0 krd0Var, krd0 krd0Var2) {
        boolean z;
        Object obj;
        Object obj2;
        Long l;
        Long l2;
        int i = krd0Var.a;
        Good good = Po().r;
        if (good != null) {
            List<VariantGroup> list = good.z;
            if (!((Boolean) this.R0.getValue()).booleanValue()) {
                z = true;
                ((v4u) Lo().m0.getValue()).getClass();
                Iterator<VariantGroup> it = list.iterator();
                int i2 = 0;
                loop3: while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    List<Variant> list2 = it.next().c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Variant) it2.next()).b == i) {
                                break loop3;
                            }
                        }
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = new SchemeStat$TypeMarketItem(SchemeStat$TypeMarketItem.Subtype.SWITCH_ITEM_VARIANT, Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262140, null);
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
                    Long valueOf = Long.valueOf(good.c.b);
                    long j = good.b;
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, valueOf, Long.valueOf((j > 2147483647L || j < -2147483648L) ? 0L : j), null, null, null, 56, null), SchemeStat$TypeMarketItem.a(schemeStat$TypeMarketItem, String.valueOf(j)), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c2, b2, uzp0Var.a).q();
                }
            } else if (list != null) {
                nmd0 currentState = Qo().getCurrentState();
                long j2 = currentState.c;
                long j3 = currentState.b.b;
                v4u v4uVar = (v4u) Lo().m0.getValue();
                pld0 pld0Var = currentState.l;
                String str = pld0Var != null ? pld0Var.n : null;
                v4uVar.getClass();
                Iterator<T> it3 = list.iterator();
                loop0: while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    List<Variant> list3 = ((VariantGroup) obj).c;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it4 = list3.iterator();
                        while (it4.hasNext()) {
                            if (((Variant) it4.next()).b == i) {
                                break loop0;
                            }
                        }
                    }
                }
                VariantGroup variantGroup = (VariantGroup) obj;
                if (variantGroup != null) {
                    List<Variant> list4 = variantGroup.c;
                    Iterator<T> it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z = true;
                            obj2 = null;
                            break;
                        } else {
                            Object next = it5.next();
                            z = true;
                            if (((Variant) next).b == i) {
                                obj2 = next;
                                break;
                            }
                        }
                    }
                    Variant variant = (Variant) obj2;
                    if (variant != null) {
                        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(j2), Long.valueOf(j3), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketSwitchItemVariantItem(Integer.valueOf(list.indexOf(variantGroup) + 1), Integer.valueOf(list4.indexOf(variant)), str), 63), 2);
                        UiTracker uiTracker2 = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                        uzp0 uzp0Var2 = UiTracker.h;
                        uzp0Var2.getClass();
                        new bjc(c3, b3, uzp0Var2.a).q();
                    }
                }
            }
            l = krd0Var.b;
            if (l == null) {
                long longValue = l.longValue();
                if (krd0Var2 == null || (l2 = krd0Var2.b) == null || longValue != l2.longValue()) {
                    h010 h010Var = Po().f;
                    if (h010Var != null) {
                        h010Var.b = longValue;
                    }
                    this.z0 = z;
                    Qo().b(ejd0.c.b.b);
                    po();
                    return;
                }
                return;
            }
            return;
        }
        z = true;
        l = krd0Var.b;
        if (l == null) {
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eeg eegVar = Po().E;
        return eegVar != null && eegVar.f(false);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
        super.h();
        Qo().b(ejd0.c.b.b);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void no(View view, Throwable th) {
        ComposeView composeView;
        ComposeView composeView2 = (ComposeView) view;
        ymd0 ymd0Var = Po().Y;
        if (ymd0Var != null && (composeView = Po().e0) != null) {
            ymd0Var.a(composeView, fnd0.b.a);
        }
        composeView2.setContent(new jai(-725217039, new zw5(3, th, this), true));
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Po().h0 = this.J;
        Po().i0 = On();
        this.E0 = R.layout.fr_good_new;
        setHasOptionsMenu(true);
        b.d dVar = new b.d("open_market_item");
        StringBuilder sb = new StringBuilder();
        sb.append(No());
        sb.append('_');
        sb.append(Mo());
        dVar.b(sb.toString(), "item_ids");
        dVar.b(Oo().name(), "source");
        dVar.e();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        int i = 23;
        Po().Y = new ymd0(Po(), new p3h(this, i));
        int i2 = 0;
        Po().C = Boolean.valueOf(requireArguments().getBoolean("is_closed", false));
        Po().M = new r310(requireContext(), Po(), Oo(), Lo().b());
        Po().P = new e4u(requireContext(), (neg) Lo().O.getValue(), Po().r, Po().C, new nwk(this, 11));
        int i3 = 18;
        Po().Q = new jo3(this, i3);
        Po().N = new i210(Lo(), requireContext(), Po());
        p0e0.b(No(), "product_group");
        Po().O = new yid0(Po(), Oo(), Mo(), No(), Lo().b(), (sv9) Lo().r.getValue());
        yid0 yid0Var = Po().O;
        int i4 = 10;
        if (yid0Var != null) {
            Context requireContext = requireContext();
            io.reactivex.rxjava3.disposables.b bVar = yid0Var.a.b;
            f<by9> fVar = yid0Var.g;
            i3u i3uVar = new i3u(new ba40(yid0Var, 16), i4);
            fVar.getClass();
            bVar.b(new i0(fVar, i3uVar).U(new l340(new el30(yid0Var, 22), 8)).y(300L, TimeUnit.MILLISECONDS).h0(Long.MAX_VALUE).subscribe(new j3z(new i(i, yid0Var, requireContext), 14)));
        }
        cxo Po = Po();
        maz b2 = Lo().b();
        cnh cnhVar = new cnh(this, 12);
        trf0 trf0Var = new trf0();
        trf0Var.a = b2;
        trf0Var.b = cnhVar;
        Po.b0 = trf0Var;
        cxo Po2 = Po();
        cxo Po3 = Po();
        CommonMarketStat$TypeRefSource Oo = Oo();
        w6e w6eVar = new w6e();
        w6eVar.b = Po3;
        w6eVar.c = Oo;
        Po2.T = w6eVar;
        cxo Po4 = Po();
        Bundle requireArguments = requireArguments();
        int i5 = Build.VERSION.SDK_INT;
        x110 x110Var = null;
        if (i5 >= 33) {
            parcelable4 = requireArguments.getParcelable("analytics_params", GoodFragmentAnalyticsParams.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = requireArguments.getParcelable("analytics_params");
            if (!(parcelable5 instanceof GoodFragmentAnalyticsParams)) {
                parcelable5 = null;
            }
            parcelable = (GoodFragmentAnalyticsParams) parcelable5;
        }
        Po4.g = (GoodFragmentAnalyticsParams) parcelable;
        gwh0 gwh0Var = (gwh0) Lo().k0.getValue();
        Bundle requireArguments2 = requireArguments();
        if (i5 >= 33) {
            parcelable3 = requireArguments2.getParcelable("search_stat_log_info", SearchStatsLoggingInfo.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = requireArguments2.getParcelable("search_stat_log_info");
            if (!(parcelable6 instanceof SearchStatsLoggingInfo)) {
                parcelable6 = null;
            }
            parcelable2 = (SearchStatsLoggingInfo) parcelable6;
        }
        gwh0Var.a = (SearchStatsLoggingInfo) parcelable2;
        Po().d0 = requireArguments().getString("ads_label");
        cxo Po5 = Po();
        cxo Po6 = Po();
        m3a m3aVar = new m3a();
        m3aVar.b = Po6;
        Po5.Z = m3aVar;
        cxo Po7 = Po();
        cxo Po8 = Po();
        CommonMarketStat$TypeRefSource Oo2 = Oo();
        long Mo = Mo();
        UserId No = No();
        m7u m7uVar = new m7u();
        m7uVar.a = Po8;
        m7uVar.b = Oo2;
        m7uVar.c = Mo;
        m7uVar.d = No;
        Po7.a0 = m7uVar;
        if (bundle != null) {
            Po().h = MobileOfficialAppsCoreNavStat$EventScreen.valueOf(bundle.getString("prev_screen_name_key", ""));
        }
        if (Po().h == null) {
            cxo Po9 = Po();
            UiTracker uiTracker = UiTracker.a;
            Po9.h = UiTracker.c();
        }
        cxo Po10 = Po();
        Bundle requireArguments3 = requireArguments();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = Po().h;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = Po().g;
        Po10.f = new h010(requireArguments3, mobileOfficialAppsCoreNavStat$EventScreen, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null);
        IntentFilter a2 = z23.a("com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.T0, a2, hf8.a, 4);
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        io.reactivex.rxjava3.disposables.b bVar2 = Po().b;
        gc10 gc10Var = (gc10) Lo().n0.getValue();
        cxo Po11 = Po();
        Context requireContext2 = requireContext();
        int i6 = 13;
        cfl cflVar = new cfl(this, i6);
        srg srgVar = new srg(this, i3);
        gc10Var.getClass();
        q<ay00> a3 = ((fy00) Po11.a.I.getValue()).a();
        asu0 asu0Var = asu0.a;
        m1 a0 = a3.r0(asu0Var.c()).a0(asu0Var.d());
        s8w s8wVar = new s8w(gc10Var, Po11, requireContext2, cflVar, srgVar, 1);
        int i7 = 1;
        bVar2.b(a0.subscribe(new f5y(s8wVar, i7)));
        gc10 gc10Var2 = (gc10) Lo().n0.getValue();
        cxo Po12 = Po();
        gc10Var2.getClass();
        ((kw00) Po12.a.p.getValue()).a("good_fragment_counters", new jw00.d[]{jw00.a.c, jw00.c.c}, new o3w(Po12, i4));
        io.reactivex.rxjava3.disposables.b bVar3 = Po().b;
        io.reactivex.rxjava3.subjects.d<com.vk.ecomm.market.good.b> dVar = Lo().a().c;
        dVar.getClass();
        int i8 = 27;
        q<R> L = new i0(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new q9(new cj1(i8), i6)).U(new com.vk.movika.sdk.base.ui.j(new u4u(i2), i3)).L(new r41(new lbe(this, 28), i8), false);
        int i9 = 21;
        bVar3.b(L.subscribe(new i22(new ozh(this, i9), 26), new w00(new cqf(this, i), i9)));
        dhr0.a.a(this.Q0);
        cxo Po13 = Po();
        h010 h010Var = Po().f;
        if (h010Var != null) {
            y4u Lo = Lo();
            Lo.getClass();
            b510 b510Var = new b510(new yd10(), new zqu());
            x110Var = new x110(new yo9(i7, b510Var, (fy00) Lo.I.getValue()), new wlb0(), new uy9(b510Var, h010Var), b510Var, h010Var);
        }
        Po13.e = x110Var;
        cxo Po14 = Po();
        cxo Po15 = Po();
        pfg pfgVar = new pfg();
        pfgVar.a = Po15;
        Po14.c0 = pfgVar;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.x = new c(gridLayoutManager);
        return gridLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Po().b.dispose();
        gc10 gc10Var = (gc10) Lo().n0.getValue();
        cxo Po = Po();
        gc10Var.getClass();
        ((kw00) Po.a.p.getValue()).b("good_fragment_counters");
        dhr0.a.d(this.Q0);
        super.onDestroy();
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        eeg eegVar = Po().E;
        if (eegVar != null) {
            eegVar.release();
        }
        Po().E = null;
        Po().o = null;
        Po().p = null;
        this.S0 = null;
        try {
            Context context = e43.a;
            (context != null ? context : null).unregisterReceiver(this.T0);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Po().k) {
            Po().k = false;
            Good good = Po().r;
            if (good != null) {
                ((fy00) Lo().I.getValue()).b(new ey00(good.c));
            }
        }
        Qo().b(ejd0.e.a.b);
        if (Po().j) {
            Po().j = false;
            Qo().b(ejd0.c.b.b);
            po();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("prev_screen_name_key", String.valueOf(Po().h));
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        zyt0 zyt0Var = new zyt0(view);
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        uld0 uld0Var = new uld0(zyt0Var, viewLifecycleOwner, new eph(this, 21), (mnd0) this.K0.getValue());
        po40.e(new fz7(3, uld0Var, new hnd0((RecyclerView) view.findViewById(R.id.list)))).a(new com.vk.mvi.binder.a(viewLifecycleOwner.getLifecycle(), Lifecycle.State.RESUMED), Qo(), (nkd0) uld0Var.e.getValue());
        this.n0.setClipToPadding(false);
        this.n0.setItemAnimator(null);
        qo();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserId userId;
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        Po().e0 = (ComposeView) viewGroup.findViewById(R.id.product_card_top_bar_compose_view);
        SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
        smbFeatures.getClass();
        if (com.vk.toggle.b.A.a(smbFeatures)) {
            View findViewById = ro.findViewById(R.id.product_card_cta);
            View findViewById2 = ro.findViewById(R.id.writeButtonShadow);
            ComposeView composeView = (ComposeView) ro.findViewById(R.id.product_card_cta_new);
            if (findViewById != null) {
                f4m.j(findViewById);
            }
            if (findViewById2 != null) {
                f4m.j(findViewById2);
            }
            if (composeView != null) {
                composeView.setVisibility(0);
            }
            Po().o = composeView;
            Po().D = new com.vk.ecomm.market.good.ui.j(composeView, new zid0(Po()));
        } else {
            Po().o = ro.findViewById(R.id.product_card_cta);
            View view = Po().o;
            if (view != null) {
                Po().D = new e(view);
            }
            Po().p = ro.findViewById(R.id.writeButtonShadow);
        }
        if (this.U) {
            View view2 = Po().o;
            if (view2 != null) {
                f4m.j(view2);
            }
            View view3 = Po().p;
            if (view3 != null) {
                f4m.j(view3);
            }
        }
        this.H0 = false;
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView != null) {
            usableRecyclerView.removeOnScrollListener(this.G0);
        }
        this.n0.addOnScrollListener(new w3v());
        cxo Po = Po();
        d dVar = this.S0;
        leg legVar = null;
        Po.F = dVar != null ? new z4u(dVar, Lo(), Po().b, requireContext(), ro.findViewById(R.id.restrictions_compose_view)) : null;
        int i = 18;
        int i2 = 13;
        mgg mggVar = new mgg(new mgg.a(new k5h(this, 20), new myh(viewGroup, i), new uz(i2), new uz(i2), new uz(i2), new uz(i2), new krh(Po().c0, i), new uz(i2)), false, epx.f(Po().C, Boolean.TRUE), new p2u(1));
        cxo Po2 = Po();
        h010 h010Var = Po().f;
        if (h010Var != null && (userId = h010Var.c) != null) {
            feg fegVar = (feg) Lo().Q.getValue();
            egg eggVar = (egg) Lo().q0.getValue();
            Context requireContext = requireContext();
            cxo Po3 = Po();
            n5g0 n5g0Var = (n5g0) Lo().H.getValue();
            eggVar.getClass();
            dgg dggVar = new dgg(Po3, requireContext, n5g0Var);
            y4u Lo = Lo();
            legVar = fegVar.a(new feg.a(userId, mggVar, dggVar, ((ueg) Lo.R.getValue()).a(new ueg.a(userId, "", 0L, null, ((zfg) Lo.N.getValue()).c(), null, null, null)), false, false), new ur0(27), new cws(this, 4), new wcg(this, 21), null);
        }
        Po2.E = legVar;
        eeg eegVar = Po().E;
        if (eegVar != null) {
            Po().H = new a4u(eegVar, (zfg) Lo().N.getValue());
        }
        cxo Po4 = Po();
        bpn0 bpn0Var = jid0.i;
        frg frgVar = new frg(this, 19);
        boolean z = this.U;
        cxo Po5 = Po();
        dg1 dg1Var = new dg1(this, 23);
        y4u y4uVar = Po5.a;
        vig0 vig0Var = (vig0) y4uVar.s.getValue();
        trf0 trf0Var = Po5.b0;
        m7u m7uVar = Po5.a0;
        r310 r310Var = Po5.M;
        i210 i210Var = Po5.N;
        m3a m3aVar = Po5.Z;
        e4u e4uVar = Po5.P;
        w6e w6eVar = Po5.T;
        kdg0 kdg0Var = (kdg0) y4uVar.E.getValue();
        jo3 jo3Var = Po5.Q;
        sz00 sz00Var = (sz00) y4uVar.F.getValue();
        a4u a4uVar = Po5.H;
        ((ymq) y4uVar.B.getValue()).a();
        irc0 irc0Var = new irc0(Po5, 2);
        q530 b2 = y4uVar.i.pa().b(requireContext(), this, false);
        g7s0 g7s0Var = (g7s0) y4uVar.d0.getValue();
        ImageViewer imageViewer = y4uVar.f0;
        if (Po5.g0 == null) {
            SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
            soccomFeatures.getClass();
            com.vk.toggle.b.A.a(soccomFeatures);
        }
        Po4.G = new jid0(new jid0.a(this, vig0Var, dg1Var, trf0Var, m7uVar, r310Var, i210Var, m3aVar, e4uVar, w6eVar, kdg0Var, jo3Var, sz00Var, a4uVar, irc0Var, z, b2, g7s0Var, imageViewer, Po5.h0, Po5.i0, (a8u) y4uVar.U.getValue()), (sdz) y4uVar.a0.getValue(), frgVar);
        this.n0.setAdapter(Po().G);
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.MARKET_ITEM, this.n0);
        return ro;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        x i3;
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        x110 x110Var = Po().e;
        if (x110Var != null) {
            h010 h010Var = x110Var.d;
            long j = h010Var.b;
            UserId userId = h010Var.c;
            String str = h010Var.e;
            String str2 = h010Var.f;
            String str3 = h010Var.g;
            MarketGetItemCardItemTypeDto marketGetItemCardItemTypeDto = ((Boolean) x110Var.f.getValue()).booleanValue() ? MarketGetItemCardItemTypeDto.CARD : null;
            x110Var.c.a.getClass();
            tfx tfxVar = new tfx("market.getItemCard", new mq(21), new l4(22));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx tfxVar2 = tfxVar;
            tfx.l(tfxVar2, "item_id", (int) j, 0, 0, 8);
            if (marketGetItemCardItemTypeDto != null) {
                tfx.o(tfxVar2, "item_type", marketGetItemCardItemTypeDto.i(), 0, 0, 12);
            }
            if (str3 != null) {
                tfx.o(tfxVar2, "ads_label", str3, 0, 150, 4);
                tfxVar2 = tfxVar2;
            }
            if (str != null) {
                tfx.o(tfxVar2, "ref_screen", str, 0, 0, 12);
            }
            if (str2 != null) {
                tfx tfxVar3 = tfxVar2;
                tfx.o(tfxVar3, "ref_post_id", str2, 0, 0, 12);
                tfxVar2 = tfxVar3;
            }
            i3 = rsg0.w0(yfb.x(tfxVar2)).l(new rt0(new w110(x110Var, 0), 21)).m(io.reactivex.rxjava3.android.schedulers.a.b());
        } else {
            i3 = x.i(new IllegalStateException());
        }
        if (Po().z) {
            i3 = hg1.n(i3, kn(), false, null, 62);
        }
        So(LoadingState.LOADING);
        if (this.z0) {
            gc10 gc10Var = (gc10) Lo().n0.getValue();
            cxo Po = Po();
            gc10Var.getClass();
            ((kw00) Po.a.p.getValue()).c("good_fragment_counters");
        }
        mnd0 mnd0Var = (mnd0) this.K0.getValue();
        myc0.h(mnd0Var.a, null, null, new lnd0(mnd0Var, new bn7(this, 6), null), 3);
        this.i0 = i3.subscribe(new ubq(new t9e(this, 24), 5), new l50(new nfj(this, 24), 27));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        return Po().G;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final View yo(LayoutInflater layoutInflater) {
        return null;
    }
}
