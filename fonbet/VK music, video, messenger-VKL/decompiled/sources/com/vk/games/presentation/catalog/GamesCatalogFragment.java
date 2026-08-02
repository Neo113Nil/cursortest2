package com.vk.games.presentation.catalog;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.model.GamesCatalogActionType;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;
import com.vk.stat.scheme.SchemeStat$TypeGamesCatalogClick;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.aes;
import xsna.ao50;
import xsna.b25;
import xsna.bft;
import xsna.bjc;
import xsna.bpn0;
import xsna.cn;
import xsna.cwg;
import xsna.ddt;
import xsna.dhr0;
import xsna.djc;
import xsna.dne;
import xsna.drm0;
import xsna.e370;
import xsna.epx;
import xsna.exi0;
import xsna.frg;
import xsna.gc;
import xsna.i13;
import xsna.i5f;
import xsna.km50;
import xsna.krh;
import xsna.lat;
import xsna.lbs;
import xsna.lbt;
import xsna.ldl;
import xsna.lpj;
import xsna.mk50;
import xsna.mre;
import xsna.msy;
import xsna.mzp0;
import xsna.nbs;
import xsna.nex0;
import xsna.nkx0;
import xsna.nuj;
import xsna.nw50;
import xsna.o9t;
import xsna.oz50;
import xsna.pr0;
import xsna.rex0;
import xsna.rha;
import xsna.rzp0;
import xsna.s55;
import xsna.sbt;
import xsna.uca;
import xsna.uzp0;
import xsna.v6j;
import xsna.vk50;
import xsna.vv0;
import xsna.w9t;
import xsna.x0;
import xsna.x1q0;
import xsna.xbt;
import xsna.xet;
import xsna.xn50;
import xsna.xrj;
import xsna.z3i;
import xsna.z4f;
import xsna.zd3;
import xsna.zhf0;
import xsna.zjq;
import xsna.zqf;

/* compiled from: GamesCatalogFragment.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogFragment extends MviImplFragment<xbt, xet, o9t> implements aes {
    public static final /* synthetic */ int i0 = 0;
    public lat Q;
    public zhf0 R = zhf0.e;
    public final Object S;
    public final Object T;
    public final Object U;
    public final bpn0 V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final nbs f0;
    public final Object g0;
    public final c h0;

    /* compiled from: GamesCatalogFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(GamesCatalogFragment.class, null, null);
        }
    }

    /* compiled from: GamesCatalogFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogActionType.values().length];
            try {
                iArr[GamesCatalogActionType.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GamesCatalogFragment.kt */
    public static final class c extends FragmentImpl.b {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            int i = GamesCatalogFragment.i0;
            if (((Boolean) GamesCatalogFragment.this.g0.getValue()).booleanValue()) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    public GamesCatalogFragment() {
        cwg cwgVar = new cwg(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, cwgVar);
        this.T = msy.a(lazyThreadSafetyMode, new dne(this, 26));
        this.U = msy.a(lazyThreadSafetyMode, new krh(this, 17));
        this.V = new bpn0(new ldl(this, 17));
        this.W = msy.a(lazyThreadSafetyMode, new xrj(this, 10));
        this.X = msy.a(lazyThreadSafetyMode, new i5f(this, 29));
        this.Y = msy.a(lazyThreadSafetyMode, new z3i(this, 15));
        this.Z = msy.a(lazyThreadSafetyMode, new z4f(this, 27));
        this.a0 = msy.a(lazyThreadSafetyMode, new vv0(19));
        this.b0 = msy.a(lazyThreadSafetyMode, new zqf(this, 25));
        this.c0 = msy.a(lazyThreadSafetyMode, new i13(11));
        this.d0 = msy.a(lazyThreadSafetyMode, new gc(9));
        this.e0 = msy.a(lazyThreadSafetyMode, new pr0(15));
        this.f0 = new nbs(this.D);
        this.g0 = msy.a(lazyThreadSafetyMode, new x0(15));
        this.h0 = new c();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.GAMES_CATALOG, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
    }

    @Override // xsna.aes
    public final void A0() {
        xn50.a.c(this, new o9t.r(null, lbs.q(this), lbs.l(this)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        lat latVar = new lat(this, requireContext(), this.J, this.f0, new rha(((Number) this.e0.getValue()).floatValue(), ((Boolean) this.c0.getValue()).booleanValue(), ((Boolean) this.d0.getValue()).booleanValue(), ((Boolean) this.g0.getValue()).booleanValue()));
        this.Q = latVar;
        return new mk50.c(latVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        xet xetVar = (xet) ao50Var;
        lat latVar = this.Q;
        if (latVar != null) {
            latVar.f(xetVar, new s55(1, this, GamesCatalogFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.h0;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((xbt) vk50Var).m.a(new mre(this, 22), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().d = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final w9t fo() {
        return (w9t) this.a0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void go(nkx0 nkx0Var) {
        fo().getClass();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.WHAT_INSIDE_BUTTON_CLICK, null, 2, 0 == true ? 1 : 0), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b2, uzp0Var.a).q();
        if (mo2getContext() != null) {
            new bft(nkx0Var, new frg(this, 17), new nuj(this, 10)).Td(getChildFragmentManager(), "what_inside_modal");
        }
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        xn50.a.c(this, new o9t.r((String) v6jVar.b, lbs.q(this), lbs.l(this)));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void ho(djc djcVar) {
        if (djcVar instanceof djc.b) {
            djc.b bVar = (djc.b) djcVar;
            w9t.b(fo(), bVar.a.d, bVar.b);
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
            Context requireContext = requireContext();
            sbt sbtVar = bVar.a;
            WebApiApplication webApiApplication = sbtVar.a;
            String str = sbtVar.b;
            String str2 = str != null ? str : "";
            SuperappUiRouterBridge.b.b(superappUiRouterBridge2, requireContext, webApiApplication, new nex0(str2, str2), null, sbtVar.c, bVar.c, bVar.d, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            return;
        }
        if (djcVar instanceof djc.e) {
            djc.e eVar = (djc.e) djcVar;
            String str3 = eVar.b;
            String str4 = eVar.a;
            w9t.b(fo(), str3 != null ? str3 : "", null);
            rex0 rex0Var = e370.j;
            (rex0Var != null ? rex0Var : null).c(requireContext(), str4);
            return;
        }
        if (djcVar instanceof djc.f) {
            UserId userId = ((djc.f) djcVar).a;
            SuperappUiRouterBridge superappUiRouterBridge3 = e370.d;
            (superappUiRouterBridge3 != null ? superappUiRouterBridge3 : null).i0(requireContext(), userId);
            return;
        }
        if (djcVar instanceof djc.a) {
            String str5 = ((djc.a) djcVar).a;
            w9t fo = fo();
            fo.a = str5;
            fo.b = null;
            fo.c = Boolean.FALSE;
            ((zd3) this.Y.getValue()).f(requireContext(), null);
            return;
        }
        if (!(djcVar instanceof djc.c)) {
            if (djcVar instanceof djc.g) {
                go(((djc.g) djcVar).b);
                return;
            } else {
                if (!epx.f(djcVar, djc.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        djc.c cVar = (djc.c) djcVar;
        String str6 = cVar.b;
        GamesHeaderSectionInfo gamesHeaderSectionInfo = cVar.a;
        if (str6 != null) {
            w9t fo2 = fo();
            fo2.a = str6;
            fo2.b = null;
            fo2.c = Boolean.FALSE;
        }
        ((GamesCatalogComponent) this.X.getValue()).E().c(gamesHeaderSectionInfo, null).k(requireContext());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.start();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w9t fo = fo();
        fo.a = null;
        fo.b = null;
        fo.c = null;
        fo.d = false;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        fo().e = true;
        if (uca.a()) {
            xn50.a.c(this, o9t.c.b);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
        w9t fo = fo();
        fo.e = false;
        fo.f.clear();
        fo.g.clear();
        fo.h.clear();
        if (uca.a()) {
            xn50.a.c(this, o9t.d.b);
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        mzp0 mzp0Var;
        super.onViewCreated(view, bundle);
        if (bundle != null || (mzp0Var = this.J) == null) {
            return;
        }
        mzp0Var.e(view);
    }

    @Override // xsna.aes
    public final RectF p1() {
        return zjq.o(this.R);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        cn o = ((b25) this.S.getValue()).o();
        return new xbt((ddt) this.Z.getValue(), (lbt) this.b0.getValue(), fo(), this.J, ((Boolean) this.c0.getValue()).booleanValue(), o.c, lbs.q(this), lbs.l(this));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_CATALOG;
        nw50 a2 = fo().a();
        if (a2 == null) {
            return;
        }
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = a2.a;
        if (drm0.N(schemeStat$TypeGameCatalogItem.b()) && schemeStat$TypeGameCatalogItem.a() == null) {
            return;
        }
        fo().getClass();
        uiTrackingScreen.e.removeIf(new x1q0(new exi0(SchemeStat$TypeGameCatalogItem.class, 13)));
        uiTrackingScreen.a(schemeStat$TypeGameCatalogItem);
        uiTrackingScreen.f = a2.b;
    }
}
