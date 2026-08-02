package com.vk.superapp.browser.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionPlaceIdDto;
import com.vk.api.generated.stats.dto.StatsTrackVisitorTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.WebTarget;
import com.vk.superapp.browser.error.ApplicationNotAvailableException;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutPendingData;
import com.vk.superapp.browser.internal.ui.shortcats.a;
import com.vk.superapp.browser.internal.utils.analytics.MiniAppEntryPoint;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import com.vk.superapp.core.errors.NoAppInitException;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.core.errors.WebViewException;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.js.bridge.events.AddToCommunity$Error;
import com.vk.superapp.js.bridge.events.AddToHomeScreen$Error;
import com.vk.superapp.js.bridge.events.AddToHomeScreen$Response;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.superapp.js.bridge.events.RecommendAction$Response;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import defpackage.n0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.sdk.SharedKt;
import xsna.a0a;
import xsna.aer0;
import xsna.agu0;
import xsna.ahn0;
import xsna.aj0;
import xsna.awg;
import xsna.b6f0;
import xsna.ber0;
import xsna.bjl0;
import xsna.bnc0;
import xsna.bpn0;
import xsna.bug0;
import xsna.bw6;
import xsna.c5g;
import xsna.cb80;
import xsna.ce3;
import xsna.cgu0;
import xsna.cu4;
import xsna.cvs;
import xsna.d3j0;
import xsna.d8t0;
import xsna.dhr0;
import xsna.dq;
import xsna.drm0;
import xsna.du0;
import xsna.dvv0;
import xsna.e370;
import xsna.e7q0;
import xsna.eb80;
import xsna.eoy;
import xsna.epq0;
import xsna.epx;
import xsna.ezu0;
import xsna.f870;
import xsna.fda0;
import xsna.fhj0;
import xsna.fkq0;
import xsna.fnj;
import xsna.fpf0;
import xsna.fvv0;
import xsna.fxv0;
import xsna.fzu0;
import xsna.gfv0;
import xsna.gfx0;
import xsna.ggu0;
import xsna.gqh0;
import xsna.gxv0;
import xsna.gzs;
import xsna.h6m0;
import xsna.h7y;
import xsna.h9;
import xsna.ha40;
import xsna.hbj0;
import xsna.hcs0;
import xsna.hg1;
import xsna.hgl0;
import xsna.hnj;
import xsna.hvv0;
import xsna.hy0;
import xsna.i1v0;
import xsna.iah0;
import xsna.ih10;
import xsna.ikk0;
import xsna.iml0;
import xsna.ipq0;
import xsna.iv1;
import xsna.izs;
import xsna.j43;
import xsna.j5g;
import xsna.j990;
import xsna.jgn0;
import xsna.jgp;
import xsna.k1w0;
import xsna.kcj0;
import xsna.kgu0;
import xsna.krv0;
import xsna.ksb0;
import xsna.kvv0;
import xsna.l1w0;
import xsna.l370;
import xsna.l6n0;
import xsna.lec;
import xsna.lir0;
import xsna.lvv0;
import xsna.m5o0;
import xsna.m7m;
import xsna.mbj0;
import xsna.mfu0;
import xsna.mgn0;
import xsna.mlu0;
import xsna.msy;
import xsna.myd0;
import xsna.n76;
import xsna.nan0;
import xsna.o8u0;
import xsna.o99;
import xsna.oti;
import xsna.ovv0;
import xsna.pa3;
import xsna.pgn0;
import xsna.pis0;
import xsna.pll;
import xsna.pti;
import xsna.pxv0;
import xsna.pyr0;
import xsna.q55;
import xsna.q7j0;
import xsna.q9k;
import xsna.qex0;
import xsna.qfu0;
import xsna.qhg0;
import xsna.qro0;
import xsna.r3y;
import xsna.r6y;
import xsna.rl3;
import xsna.rrn0;
import xsna.rxv0;
import xsna.s1v;
import xsna.s1w0;
import xsna.s200;
import xsna.s3q0;
import xsna.s93;
import xsna.sfu0;
import xsna.sr8;
import xsna.svv0;
import xsna.t6c0;
import xsna.tau0;
import xsna.tb0;
import xsna.tdr0;
import xsna.tfu0;
import xsna.tpn0;
import xsna.tsk0;
import xsna.tvv0;
import xsna.tzu0;
import xsna.u2c0;
import xsna.u81;
import xsna.ufu0;
import xsna.uhv0;
import xsna.uhx;
import xsna.upn0;
import xsna.utj;
import xsna.uvs0;
import xsna.uwv0;
import xsna.uyp;
import xsna.v1w0;
import xsna.v5n0;
import xsna.v5u0;
import xsna.v6r0;
import xsna.v73;
import xsna.vdx0;
import xsna.vu80;
import xsna.w2j0;
import xsna.w5u0;
import xsna.w7y;
import xsna.wdx0;
import xsna.wfu0;
import xsna.wgj0;
import xsna.wvq0;
import xsna.wvs;
import xsna.wwv0;
import xsna.wzs;
import xsna.x2j0;
import xsna.xa9;
import xsna.xc80;
import xsna.xfx0;
import xsna.xgx0;
import xsna.xj50;
import xsna.xvv0;
import xsna.yfu0;
import xsna.yka0;
import xsna.yq;
import xsna.yuv0;
import xsna.z;
import xsna.z380;
import xsna.zdx0;
import xsna.zen0;
import xsna.zhx0;
import xsna.zxx;
import xsna.zyl0;

/* compiled from: VkBrowserFragment.kt */
/* loaded from: classes6.dex */
public class a extends uhv0 implements VkUiView.BannerAd, VkUiView.b, fzu0, cb80 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public BrowserPerfState G;
    public final Object H;
    public View I;
    public View J;
    public View K;
    public View L;
    public Context M;
    public final awg N;
    public final ahn0 O;
    public final Object P;
    public final bpn0 Q;
    public final bpn0 R;
    public izs<? super lvv0, s3q0> h = new aer0(this, 4);
    public final bpn0 i = new bpn0(new tsk0(this, 28));
    public final Object j;
    public final ce3 k;
    public final s1w0 l;
    public final b m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: VkBrowserFragment.kt */
    /* renamed from: com.vk.superapp.browser.ui.a$a, reason: collision with other inner class name */
    public static final class C1874a {
        public static a a(WebApiApplication webApiApplication, String str, String str2, String str3, int i) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            boolean z = (i & 32) == 0;
            Bundle a = q9k.a("key_url", str);
            a.putString("key_title", webApiApplication.c);
            a.putString("original_url", str3);
            a.putString("key_ref", str2);
            a.putParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, webApiApplication);
            a.putLong("key_application_id", webApiApplication.b);
            a.putBoolean("key_is_nested", z);
            a aVar = new a();
            aVar.setArguments(a);
            return aVar;
        }
    }

    /* compiled from: VkBrowserFragment.kt */
    public static final class b implements i1v0 {
        public final Object a;

        public b(a aVar) {
            this.a = msy.a(LazyThreadSafetyMode.NONE, new wfu0(aVar, 0));
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.i1v0
        public final zxx get() {
            return new zxx((r6y) this.a.getValue());
        }
    }

    /* compiled from: VkBrowserFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).zn();
            return s3q0.a;
        }
    }

    public a() {
        ahn0 ahn0Var;
        new bpn0(new iml0(this, 24));
        o8u0 o8u0Var = new o8u0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, o8u0Var);
        this.k = jgn0.b();
        this.l = (s1w0) jgn0.d.getValue();
        this.m = new b(this);
        int i = 26;
        this.n = msy.a(lazyThreadSafetyMode, new rrn0(this, i));
        this.o = msy.a(lazyThreadSafetyMode, new kcj0(this, i));
        this.p = msy.a(lazyThreadSafetyMode, new l6n0(this, 20));
        this.q = msy.a(lazyThreadSafetyMode, new w2j0(this, 23));
        this.r = msy.a(lazyThreadSafetyMode, new ufu0(this, 0));
        this.s = msy.a(lazyThreadSafetyMode, new pyr0(this, 13));
        this.t = msy.a(lazyThreadSafetyMode, new uvs0(this, 5));
        int i2 = 22;
        this.u = msy.a(lazyThreadSafetyMode, new gqh0(this, i2));
        this.v = msy.a(lazyThreadSafetyMode, new d3j0(this, i2));
        this.w = msy.a(lazyThreadSafetyMode, new ipq0(this, 12));
        this.x = msy.a(lazyThreadSafetyMode, new b6f0(this, 20));
        this.y = msy.a(lazyThreadSafetyMode, new myd0(this, 26));
        this.z = msy.a(lazyThreadSafetyMode, new tfu0(this, 0));
        this.H = msy.a(lazyThreadSafetyMode, new hbj0(this, 27));
        this.N = new awg(this, 2);
        oti otiVar = s1v.c;
        if (otiVar != null) {
            ahn0Var = otiVar.a();
            ((pti) ahn0Var).init();
        } else {
            ahn0Var = null;
        }
        this.O = ahn0Var;
        this.P = msy.a(lazyThreadSafetyMode, new v5n0(this, 19));
        this.Q = new bpn0(new pis0(this, 11));
        this.R = new bpn0(new d8t0(this, 5));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Af() {
        vn().Af();
    }

    public void An() {
        ggu0 vn = vn();
        fvv0 fvv0Var = vn.e;
        mfu0 mfu0Var = vn.d;
        j43 j43Var = vn.w;
        if (j43Var != null) {
            j43Var.c();
        }
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = vn.x;
        if (aVar != null) {
            aVar.h = false;
            hgl0 hgl0Var = aVar.e;
            if (hgl0Var.a) {
                hgl0Var.a = false;
                hgl0Var.b = (System.currentTimeMillis() - hgl0Var.c) + hgl0Var.b;
            }
            utj utjVar = aVar.i;
            if (utjVar != null) {
                utjVar.b();
            }
        }
        vn.m().g.dismiss();
        mfu0Var.pause();
        vn.i(false, false, null, null);
        if (!vn.p || fvv0Var.i()) {
            mfu0Var.t(false);
        }
        tau0 d = fvv0Var.d();
        if (d != null) {
            w5u0 w5u0Var = (w5u0) d.j.getValue();
            io.reactivex.rxjava3.disposables.c cVar = w5u0Var.d;
            if (cVar != null) {
                cVar.dispose();
            }
            w5u0Var.d = null;
            w5u0Var.f = System.currentTimeMillis();
        }
        mfu0Var.i();
        mfu0Var.a();
        wwv0 yn = yn();
        tau0 tau0Var = yn.k;
        if (tau0Var != null) {
            hgl0 hgl0Var2 = (hgl0) tau0Var.h.getValue();
            if (hgl0Var2.a) {
                hgl0Var2.a = false;
                hgl0Var2.b = (System.currentTimeMillis() - hgl0Var2.c) + hgl0Var2.b;
            }
        }
        io.reactivex.rxjava3.disposables.c cVar2 = yn.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        yn.f = null;
        Iterator it = ((List) this.R.getValue()).iterator();
        while (it.hasNext()) {
            ((eb80) it.next()).a();
        }
    }

    public void Bn() {
        boolean z;
        io.reactivex.rxjava3.disposables.c a;
        Context applicationContext;
        ggu0 vn = vn();
        mfu0 mfu0Var = vn.d;
        mfu0Var.resume();
        j43 j43Var = vn.w;
        if (j43Var != null) {
            j43Var.d();
        }
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = vn.x;
        if (aVar != null) {
            mfu0 mfu0Var2 = aVar.c;
            aVar.h = true;
            hgl0 hgl0Var = aVar.e;
            if (!hgl0Var.a) {
                hgl0Var.a = true;
                hgl0Var.c = System.currentTimeMillis();
            }
            if (aVar.j) {
                aVar.j = false;
                AddActionSuggestion addActionSuggestion = aVar.f;
                if (addActionSuggestion != null && addActionSuggestion.a && aVar.b()) {
                    aVar.g(AppLifecycleEvent.ON_START, null);
                }
            }
            fvv0 fvv0Var = aVar.b;
            AddActionSuggestion addActionSuggestion2 = aVar.f;
            AddActionSuggestion.Action action = addActionSuggestion2 != null ? addActionSuggestion2.d : null;
            int i = action == null ? -1 : a.C1873a.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                mfu0Var2.s(EventNames.Recommend, new RecommendAction$Response(null, new RecommendAction$Response.Data(epx.f(fvv0Var.t().S, Boolean.TRUE), null, 2, null), 1, null));
            } else if (i == 2) {
                ShortcutPendingData shortcutPendingData = aVar.k;
                if ((shortcutPendingData != null ? shortcutPendingData.a : null) != null) {
                    Activity k = aVar.a.k();
                    if (epx.f((k == null || (applicationContext = k.getApplicationContext()) == null) ? null : Boolean.valueOf(wgj0.a(applicationContext, fvv0Var.getAppId(), aVar.k.a)), Boolean.TRUE)) {
                        qfu0 M = fvv0Var.M();
                        if (M != null) {
                            ShortcutPendingData shortcutPendingData2 = aVar.k;
                            M.b((shortcutPendingData2 != null ? shortcutPendingData2.b : null) == ShortcutPendingData.ShortcutSource.REQUEST);
                        }
                        mfu0Var2.s(EventNames.AddToHomeScreen, new AddToHomeScreen$Response(null, new AddToHomeScreen$Response.Data(true, null, 2, null), 1, null));
                    } else {
                        EventNames eventNames = EventNames.AddToHomeScreen;
                        mfu0Var2.x(eventNames, new AddToHomeScreen$Error(null, uyp.b(eventNames, mfu0Var2, null), 1, null));
                    }
                    aVar.k = null;
                    aVar.f = null;
                }
            }
        }
        vn.f();
        tau0 d = vn.e.d();
        if (d != null) {
            w5u0 w5u0Var = (w5u0) d.j.getValue();
            long j = w5u0Var.f;
            long j2 = 0;
            if (j == 0) {
                a = null;
            } else {
                long j3 = w5u0Var.e;
                if (j3 > 0 && j > 0) {
                    j2 = 60000 - (j - j3);
                }
                a = w5u0Var.a(j2);
            }
            if (a != null) {
                vn.r.b(a);
            }
        }
        ViewGroup a2 = vn.s().a();
        if (a2 != null) {
            a2.post(new iv1(vn, 16));
        }
        mfu0Var.f();
        if (mfu0Var.getState().e()) {
            mfu0Var.e(vn.b);
        }
        WebView view = mfu0Var.getState().getView();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                z = !(((ViewGroup) parent).indexOfChild(view) != -1);
            } else {
                z = true;
            }
            if (z) {
                vn.s().j(view);
            }
        }
        wwv0 yn = yn();
        tau0 tau0Var = yn.k;
        if (tau0Var != null) {
            hgl0 hgl0Var2 = (hgl0) tau0Var.h.getValue();
            if (!hgl0Var2.a) {
                hgl0Var2.a = true;
                hgl0Var2.c = System.currentTimeMillis();
            }
        }
        if (e370.s != null && com.vk.toggle.b.A.a(CoreFeatures.KBH_DETECT) && yn.o()) {
            io.reactivex.rxjava3.disposables.c cVar = yn.f;
            if (cVar != null) {
                cVar.dispose();
            }
            yn.f = null;
            yn.f = new y(new q(new bjl0(6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wvq0(new gfv0(yn, 1), 11), new uwv0(new t6c0(19), 0));
        }
        Iterator it = ((List) this.R.getValue()).iterator();
        while (it.hasNext()) {
            ((eb80) it.next()).b();
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void C4(PersonalDiscountDialogType personalDiscountDialogType) {
        vn().C4(personalDiscountDialogType);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public void Cn() {
        ViewGroup m0;
        View findViewById;
        BrowserPerfState browserPerfState = this.G;
        if (browserPerfState == null) {
            browserPerfState = null;
        }
        browserPerfState.getClass();
        browserPerfState.k = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        ggu0 vn = vn();
        boolean z = this.D;
        fvv0 fvv0Var = vn.e;
        mfu0 mfu0Var = vn.d;
        mfu0Var.w();
        vn.p = true;
        if (z) {
            tdr0 m = vn.m();
            fvv0 fvv0Var2 = m.b;
            yfu0 yfu0Var = m.i;
            if (yfu0Var == null) {
                yfu0Var = null;
            }
            if (yfu0Var != null && !m.d.y) {
                WebApiApplication v = fvv0Var2.v();
                if ((v != null ? v.R : null) != null || fvv0Var2.K()) {
                    yfu0Var.postDelayed(new z(8, m, yfu0Var), 300L);
                }
            }
        }
        if (fvv0Var.I()) {
            if (z) {
                mfu0Var.getState().m(vn.r());
            }
            com.vk.superapp.browser.internal.ui.shortcats.a aVar = vn.x;
            if (aVar != null) {
                qro0.c(new h9(aVar, 1));
            }
            vn.t();
        }
        if (vn.u() && vn.p && !fvv0Var.i() && (m0 = vn.s().m0()) != null && (findViewById = m0.findViewById(R.id.show_console)) != null) {
            findViewById.setVisibility(0);
        }
        if (wn().m() == null && !wn().n()) {
            i0();
        }
        BrowserPerfState browserPerfState2 = this.G;
        l370.C(browserPerfState2 != null ? browserPerfState2 : null, (v73) this.H.getValue(), this);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void D1(tb0 tb0Var) {
        vn().D1(tb0Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final io.reactivex.rxjava3.disposables.b D6() {
        return vn().r;
    }

    public r6y Dn() {
        return yn().b.h() ? new h7y((ezu0) yn()) : new r6y(yn());
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Ei() {
        vn().Ei();
    }

    @Override // xsna.mxv0
    public final void Ek(long j, vu80 vu80Var) {
        vn().Ek(j, vu80Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public agu0 En() {
        return new agu0(this, yn(), (tzu0) this.w.getValue(), new x2j0(this, 19), new h6m0(this, 22), new ikk0(this, 19));
    }

    public tpn0 Fn(Fragment fragment) {
        return new tpn0(fragment);
    }

    @Override // xsna.fzu0
    public final void G9(WebApiApplication webApiApplication) {
        vn().G9(webApiApplication);
    }

    public v1w0 Gn(Context context) {
        return new xvv0(context, this.B, this.A, this.l);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public boolean Hb(zhx0 zhx0Var) {
        return false;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Hc(String str) {
        vn().Hc(str);
    }

    public void Hn(VkBrowserActivity.b bVar) {
        this.h = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Ii() {
        vn().Ii();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void In(Throwable th) {
        vn().e();
        View view = this.J;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = this.L;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.K;
        if (view5 != null) {
            ((rxv0) this.P.getValue()).b(view5, th, new m5o0(this, 12));
        }
        BrowserPerfState browserPerfState = this.G;
        if (browserPerfState == null) {
            browserPerfState = null;
        }
        v73 v73Var = (v73) this.H.getValue();
        int i = ((th instanceof WebViewException) && ((WebViewException) th).d()) ? 1 : th instanceof NoAppInitException ? 2 : th instanceof ApplicationNotAvailableException ? 3 : 0;
        String message = th.getMessage();
        if (!browserPerfState.F() && browserPerfState.q == null) {
            browserPerfState.p = false;
            browserPerfState.q = Integer.valueOf(i);
            browserPerfState.r = message;
            browserPerfState.n = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
            zdx0 zdx0Var = e370.v;
            if (zdx0Var != null) {
                zdx0Var.a(browserPerfState, v73Var);
            }
        }
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.f();
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void J3(Intent intent, int... iArr) {
        vn().J3(intent, Arrays.copyOf(iArr, iArr.length));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Jb(String str) {
        vn().Jb(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void K2() {
        vn().K2();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Oe() {
        return vn().Oe();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Og(String str) {
        vn().Og(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void Q4(View view, VkUiView.BannerAd.UiData uiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        vn().Q4(view, uiData, wzsVar);
    }

    @Override // xsna.fzu0
    public final void Q6(WebApiApplication webApiApplication, String str) {
        vn().Q6(webApiApplication, str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Qb() {
        vn().Qb();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Qm() {
        vn().Qm();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public boolean R7(boolean z) {
        return false;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Rl() {
        NoAppInitException noAppInitException = new NoAppInitException(0);
        if (this.D) {
            return;
        }
        yn().p = noAppInitException;
        this.C = false;
        this.D = false;
        In(noAppInitException);
    }

    @Override // xsna.cb80
    public void Sm(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i != 2) {
                i2 = -1;
            }
            activity.setRequestedOrientation(i2);
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final String T0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("key_source_url", null);
        }
        return null;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void U3(ArrayList arrayList, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication) {
        vn().U3(arrayList, webIdentityCardData, webApiApplication);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Va(OnboardingModalArguments onboardingModalArguments, n0 n0Var) {
        vn().Va(onboardingModalArguments, n0Var);
    }

    @Override // xsna.mxv0
    public final void Vf(WebApiApplication webApiApplication, vu80 vu80Var) {
        vn().Vf(webApiApplication, vu80Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void W7(boolean z, boolean z2) {
        vn().W7(z, z2);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Wl() {
        vn().Wl();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Y6(VkUiView.BannerAd.UiData.BannerAlign bannerAlign) {
        return vn().Y6(bannerAlign);
    }

    @Override // xsna.fzu0
    public final void Z8(WebApiApplication webApiApplication, int i, int i2) {
        vn().Z8(webApiApplication, i, i2);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public boolean Ze(String str, boolean z) {
        return false;
    }

    public boolean a0() {
        return vn().d.C();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void ac() {
        vn().ac();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void am(List<String> list) {
        vn().z(list);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean bh() {
        return vn().bh();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean cl(boolean z) {
        vn().getClass();
        return false;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void e3(tb0 tb0Var) {
        vn().e3(tb0Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void e8(boolean z, cvs cvsVar) {
        vn().e8(z, cvsVar);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void f7(long j, long j2, String str) {
        vn().f7(j, j2, str);
    }

    @Override // xsna.fzu0
    public final void g8(UserId userId, String str) {
        vn().g8(userId, str);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.M;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void h2() {
        BrowserPerfState browserPerfState = this.G;
        if (browserPerfState == null) {
            browserPerfState = null;
        }
        browserPerfState.getClass();
        browserPerfState.o = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void i0() {
        ahn0 ahn0Var;
        if (this.D || yn().e) {
            vn().e();
            View view = this.J;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.I;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.L;
            if (view3 != null) {
                view3.setVisibility(4);
            }
            View view4 = this.K;
            if (view4 != null) {
                view4.setVisibility(4);
            }
        }
        BrowserPerfState browserPerfState = this.G;
        if (browserPerfState == null) {
            browserPerfState = null;
        }
        l370.C(browserPerfState, (v73) this.H.getValue(), this);
        this.E = true;
        if (this.F && (ahn0Var = this.O) != null) {
            ahn0Var.d(this.I);
        }
        ggu0 vn = vn();
        fvv0 fvv0Var = vn.e;
        if (fvv0Var.h()) {
            List<WebApiApplication> list = vn.O;
            if (list == null || list.isEmpty()) {
                long appId = fvv0Var.getAppId();
                String T0 = fvv0Var.T0();
                if (hg1.d(vn.u)) {
                    return;
                }
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                WebApiApplication v = fvv0Var.v();
                io.reactivex.rxjava3.disposables.c h = hg1.h(d.t(appId, T0, v != null ? v.w : null, AppsNeedToShowActionPlaceIdDto.CLOSE_CONFIRMATION_CACHE), new yka0(vn, 25));
                vn.u = h;
                vn.r.b(h);
            }
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void i4(String str, String str2, String str3) {
        vn().i4(str, str2, str3);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean i6() {
        return vn().i6();
    }

    @Override // xsna.mxv0
    public final void i7(WebApiApplication webApiApplication, vu80 vu80Var) {
        vn().i7(webApiApplication, vu80Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void ic() {
        vn().ic();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final VkUiView.BannerAd j0() {
        return (VkUiView.BannerAd) this.i.getValue();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void jk() {
        vn().a();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public izs<lvv0, s3q0> ke() {
        return this.h;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void kk(String str, q7j0 q7j0Var) {
        vn().h(str, false, q7j0Var);
    }

    @Override // xsna.mxv0
    public final void l9(WebApiApplication webApiApplication, int i) {
        vn().l9(webApiApplication, i);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void lj(boolean z) {
        vn().lj(z);
    }

    public svv0 ln(Bundle bundle) {
        String string = bundle.getString("key_url", new String());
        long j = bundle.getLong("key_application_id", uhx.a().a);
        boolean containsKey = bundle.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        boolean z = bundle.getBoolean("is_vk_ui_page", true);
        Serializable serializable = bundle.getSerializable("custom_headers");
        Map map = serializable instanceof Map ? (Map) serializable : null;
        if (map == null) {
            map = jgp.b;
        }
        boolean z2 = bundle.getBoolean("is_user_banned", false);
        if (!containsKey || !z) {
            if (j == uhx.a().a) {
                qex0 qex0Var = e370.y;
                j = f870.r(string, (qex0Var != null ? qex0Var : null).b());
            }
            return new svv0.b(string, j, z, map, z2, bundle.getBoolean("can_cache", false), 128);
        }
        WebApiApplication webApiApplication = (WebApiApplication) bundle.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        if (webApiApplication == null) {
            throw new IllegalStateException("Bundle doesn't contain Parcelable with key app");
        }
        String string2 = bundle.getString("key_ref", new String());
        String string3 = bundle.getString("key_url", new String());
        long j2 = bundle.getLong("dialog_id");
        return new svv0.a(webApiApplication, string3, string2, j2 != 0 ? Long.valueOf(j2) : null, null, MiniAppEntryPoint.UNKNOWN, (UUID) bundle.getSerializable("key_ui_measure_id"), z2, bundle.getString("special_url"));
    }

    public wwv0 m5(tvv0 tvv0Var) {
        boolean h = tvv0Var.h();
        bpn0 bpn0Var = this.Q;
        return h ? new ezu0(this, tvv0Var, (com.vk.superapp.navigation.api.di.c) bpn0Var.getValue()) : new wwv0(this, tvv0Var, (com.vk.superapp.navigation.api.di.c) bpn0Var.getValue());
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void n9() {
        vn().n9();
    }

    @Override // xsna.mxv0
    public final void nn(WebApiApplication webApiApplication, int i, boolean z) {
        vn().nn(webApiApplication, i, z);
    }

    @Override // xsna.fzu0
    public final void o9(UserId userId, String str, String str2) {
        vn().o9(userId, str, str2);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void oc(String str) {
        vn().oc(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void oh(WebGroupShortInfo webGroupShortInfo, w7y w7yVar) {
        vn().oh(webGroupShortInfo, w7yVar);
    }

    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<WebTarget> parcelableArrayListExtra;
        List<Long> t0;
        JSONObject jSONObject;
        String str;
        super.onActivityResult(i, i2, intent);
        ggu0 vn = vn();
        mfu0 mfu0Var = vn.d;
        ovv0 J = vn.e.J();
        if (J != null) {
            Iterator it = J.a.values().iterator();
            while (it.hasNext()) {
                ((dvv0) it.next()).c(i, i2, intent);
            }
        }
        boolean z = i2 == -1;
        if (mfu0Var.d(i)) {
            mfu0Var.c(i, intent, z);
        }
        if (i == 101) {
            mfu0Var.k(intent, z);
            return;
        }
        if (i == 125) {
            vn.q().P3();
            return;
        }
        yuv0 yuv0Var = vn.v;
        if (yuv0Var != null) {
            mfu0 mfu0Var2 = yuv0Var.b;
            io.reactivex.rxjava3.disposables.b bVar = yuv0Var.f;
            long j = yuv0Var.c;
            xc80 xc80Var = yuv0Var.d;
            String str2 = null;
            if (i == 100) {
                if (i2 == -1 && intent != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(SharedKt.PARAM_ACCESS_TOKEN, intent.getStringExtra(SharedKt.PARAM_ACCESS_TOKEN));
                    mfu0Var2.n(JsApiMethodType.GET_AUTH_TOKEN, jSONObject2);
                    return;
                }
                if (intent != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        str2 = extras.getString("error", "unknown_error");
                    }
                } else {
                    str2 = "unknown_error";
                }
                Throwable runtimeException = new RuntimeException(str2);
                mfu0Var2.A(JsApiMethodType.GET_AUTH_TOKEN, runtimeException);
                xc80Var.B(runtimeException);
                return;
            }
            if (i == 130) {
                mfu0Var2.getState().g().a.I().I(i2, intent);
                return;
            }
            if (i == 1001) {
                mfu0Var2.getState().g().a.J().D0(i2, intent != null ? intent.getStringExtra("CODE_READER_RESULT") : null);
                return;
            }
            if (i == 123) {
                if (i2 == -1) {
                    mfu0Var2.n(JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, new JSONObject().put("result", true));
                    return;
                } else if (i2 != 0) {
                    mfu0Var2.m(JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                    return;
                } else {
                    mfu0Var2.m(JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.USER_DENIED, null, null);
                    return;
                }
            }
            if (i == 124) {
                if (i2 == -1) {
                    mfu0Var2.n(JsApiMethodType.VERIFY_USER_BY_SERVICE, new JSONObject().put("result", true));
                    return;
                } else if (i2 != 0) {
                    mfu0Var2.m(JsApiMethodType.VERIFY_USER_BY_SERVICE, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                    return;
                } else {
                    mfu0Var2.m(JsApiMethodType.VERIFY_USER_BY_SERVICE, VkAppsErrors.Client.INACTIVE_SCREEN, null, null);
                    return;
                }
            }
            int i3 = 9;
            switch (i) {
                case 102:
                case 105:
                    mbj0 mbj0Var = yuv0Var.e;
                    mfu0 mfu0Var3 = mbj0Var.a;
                    if (i2 == -1) {
                        JSONArray jSONArray = new JSONArray();
                        AppShareType appShareType = AppShareType.MESSAGE;
                        String h = appShareType.h();
                        if (intent != null && intent.hasExtra(h) && intent.getBooleanExtra(h, false)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", appShareType.h());
                            mbj0Var.b.invoke(appShareType);
                            JSONArray jSONArray2 = new JSONArray();
                            if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("targets")) != null) {
                                for (WebTarget webTarget : parcelableArrayListExtra) {
                                    String str3 = webTarget.c;
                                    String str4 = webTarget.d;
                                    if (str3.length() != 0 && str4.length() != 0) {
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("id", webTarget.b);
                                        jSONObject4.put("first_name", webTarget.c);
                                        jSONObject4.put("last_name", str4);
                                        jSONObject4.put("photo", webTarget.e);
                                        jSONObject4.put("sex", webTarget.f);
                                        jSONArray2.put(jSONObject4);
                                    }
                                }
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject3.put("users", jSONArray2);
                            }
                            jSONArray.put(jSONObject3);
                        }
                        mbj0Var.a(intent, jSONArray, AppShareType.QR);
                        mbj0Var.a(intent, jSONArray, AppShareType.OTHER);
                        mbj0Var.a(intent, jSONArray, AppShareType.COPY_LINK);
                        mbj0Var.a(intent, jSONArray, AppShareType.STORY);
                        mbj0Var.a(intent, jSONArray, AppShareType.POST);
                        mbj0Var.a(intent, jSONArray, AppShareType.CREATE_CHAT);
                        mbj0Var.a(intent, jSONArray, AppShareType.WALL);
                        if (jSONArray.length() > 0) {
                            mbj0Var.a.n(JsApiMethodType.SHARE, new JSONObject().put("items", jSONArray));
                            mfu0Var3.B(new JsMethod("VKWebAppShare"));
                            break;
                        }
                    } else if (!mbj0Var.e) {
                        mfu0Var3.m(JsApiMethodType.SHARE, VkAppsErrors.Client.USER_DENIED, null, null);
                        mfu0Var3.B(new JsMethod("VKWebAppShare"));
                        break;
                    }
                    break;
                case 103:
                    mfu0Var2.getState().g().a.K().z0(i2);
                    break;
                case 104:
                    String stringExtra = intent != null ? intent.getStringExtra("vk_pay_result") : null;
                    if (i2 != -1 || stringExtra == null) {
                        mfu0Var2.m(JsApiMethodType.OPEN_PAY_FORM, VkAppsErrors.Client.USER_DENIED, null, null);
                        break;
                    } else {
                        mfu0Var2.n(JsApiMethodType.OPEN_PAY_FORM, new JSONObject(stringExtra));
                        break;
                    }
                case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                    if (i2 != -1 || intent == null) {
                        EventNames eventNames = EventNames.AddToCommunity;
                        mfu0Var2.x(eventNames, new AddToCommunity$Error(null, uyp.b(eventNames, mfu0Var2, null), 1, null));
                        break;
                    } else {
                        long longExtra = intent.getLongExtra("picked_group_id", 0L);
                        boolean booleanExtra = intent.getBooleanExtra("should_send_push", false);
                        if (longExtra > 0) {
                            vdx0 vdx0Var = e370.e;
                            int i4 = 1;
                            bVar.b((vdx0Var != null ? vdx0Var : null).d().h(yuv0Var.c, longExtra, booleanExtra).subscribe(new mlu0(new sr8(yuv0Var, longExtra, i4), i4), new e7q0(new qhg0(yuv0Var, 28), i3)));
                            break;
                        }
                    }
                    break;
                case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                    if (i2 == -1) {
                        String stringExtra2 = intent != null ? intent.getStringExtra("VkWebAppClose_status") : null;
                        String stringExtra3 = intent != null ? intent.getStringExtra("VKWebAppClose_payload") : null;
                        String stringExtra4 = intent != null ? intent.getStringExtra(CommonUrlParts.REQUEST_ID) : null;
                        JSONObject d = yq.d("status", stringExtra2);
                        if (stringExtra3 != null) {
                            d.put("payload", new JSONObject(stringExtra3));
                        }
                        if (stringExtra4 != null && !drm0.N(stringExtra4)) {
                            d.put(CommonUrlParts.REQUEST_ID, stringExtra4);
                        }
                        mfu0Var2.n(JsApiMethodType.CLOSE_APP, d);
                        break;
                    }
                    break;
                case 108:
                    if (intent == null || i2 != -1) {
                        mfu0Var2.m(JsApiMethodType.GET_FRIENDS, VkAppsErrors.Client.USER_DENIED, null, null);
                        break;
                    } else {
                        xc80Var.u(intent);
                        break;
                    }
                case 109:
                    xc80Var.p(intent);
                    break;
                default:
                    switch (i) {
                        case 111:
                            if (intent == null || !intent.hasExtra("arg_identity_event")) {
                                mfu0Var2.m(JsApiMethodType.GET_PERSONAL_CARD, VkAppsErrors.Client.USER_DENIED, null, null);
                                break;
                            } else {
                                String stringExtra5 = intent.getStringExtra("arg_identity_event");
                                if (stringExtra5 == null) {
                                    mfu0Var2.m(JsApiMethodType.GET_PERSONAL_CARD, VkAppsErrors.Client.MISSING_PARAMS, null, null);
                                    break;
                                } else {
                                    mfu0Var2.n(JsApiMethodType.GET_PERSONAL_CARD, new JSONObject(stringExtra5));
                                    break;
                                }
                            }
                            break;
                        case 112:
                            xc80Var.v(i2, intent);
                            break;
                        case 113:
                            if (i2 != -1) {
                                if (i2 != 3) {
                                    mfu0Var2.m(JsApiMethodType.SHOW_COMMUNITY_WIDGET_PREVIEW_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
                                    break;
                                } else {
                                    mfu0Var2.m(JsApiMethodType.SHOW_COMMUNITY_WIDGET_PREVIEW_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null);
                                    break;
                                }
                            } else {
                                mfu0Var2.n(JsApiMethodType.SHOW_COMMUNITY_WIDGET_PREVIEW_BOX, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true));
                                break;
                            }
                        default:
                            switch (i) {
                                case INVALID_INDEX_URL_VALUE:
                                    if (i2 != -1 || intent == null) {
                                        mfu0Var2.m(JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
                                        break;
                                    } else {
                                        long[] longArrayExtra = intent.getLongArrayExtra("result_ids");
                                        if (longArrayExtra != null && (t0 = rl3.t0(longArrayExtra)) != null) {
                                            String stringExtra6 = intent.getStringExtra("request_key");
                                            vdx0 vdx0Var2 = e370.e;
                                            if (vdx0Var2 == null) {
                                                vdx0Var2 = null;
                                            }
                                            zen0 d2 = vdx0Var2.d();
                                            List<Long> list = t0;
                                            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                            Iterator<T> it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                long longValue = ((Number) it2.next()).longValue();
                                                gzs<s3q0> gzsVar = fkq0.a;
                                                dq.h(longValue, arrayList);
                                            }
                                            bVar.b(bug0.d(d2.u(j, stringExtra6, arrayList), yuv0Var.a, null, 6).subscribe(new nan0(new fda0(yuv0Var, 24), i3), new epq0(new du0(27, t0, yuv0Var), 8)));
                                            break;
                                        }
                                    }
                                    break;
                                case 116:
                                    Bundle extras2 = intent != null ? intent.getExtras() : null;
                                    if (i2 == -1) {
                                        long j2 = extras2 != null ? extras2.getLong("ownerId") : 0L;
                                        int i5 = extras2 != null ? extras2.getInt("postId") : 0;
                                        if (j2 == 0 || i5 == 0) {
                                            jSONObject = null;
                                        } else {
                                            jSONObject = new JSONObject();
                                            jSONObject.put("owner_id", j2);
                                            jSONObject.put("post_id", i5);
                                        }
                                        if (jSONObject != null) {
                                            mfu0Var2.n(JsApiMethodType.SHOW_NEW_POST_BOX, jSONObject);
                                            break;
                                        }
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    if (extras2 != null) {
                                        jSONObject5.put("error_type", extras2.getInt("errorCode"));
                                    }
                                    ArrayList<String> stringArrayList = extras2 != null ? extras2.getStringArrayList("errorKeys") : null;
                                    ArrayList<String> stringArrayList2 = extras2 != null ? extras2.getStringArrayList("errorValues") : null;
                                    if (stringArrayList != null && stringArrayList2 != null) {
                                        JSONArray jSONArray3 = new JSONArray();
                                        Iterator it3 = j5g.X0(stringArrayList, stringArrayList2).iterator();
                                        while (it3.hasNext()) {
                                            Pair pair = (Pair) it3.next();
                                            String str5 = (String) pair.d();
                                            String str6 = (String) pair.g();
                                            JSONObject jSONObject6 = new JSONObject();
                                            jSONObject6.put("key", str5);
                                            jSONObject6.put("value", str6);
                                            jSONArray3.put(jSONObject6);
                                        }
                                        jSONObject5.put("error_data", jSONArray3);
                                    }
                                    mfu0Var2.j(JsApiMethodType.SHOW_NEW_POST_BOX, jSONObject5);
                                    break;
                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                    if (i2 != -1 || intent == null) {
                                        mfu0Var2.m(JsApiMethodType.USERS_SEARCH, VkAppsErrors.Client.USER_DENIED, null, null);
                                        break;
                                    } else {
                                        UserId userId = (UserId) intent.getParcelableExtra("user_id");
                                        if (userId == null) {
                                            userId = UserId.d;
                                        }
                                        if (fkq0.c(userId)) {
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("id", userId);
                                            mfu0Var2.n(JsApiMethodType.USERS_SEARCH, jSONObject7);
                                            break;
                                        } else {
                                            mfu0Var2.m(JsApiMethodType.USERS_SEARCH, VkAppsErrors.Client.USER_DENIED, null, null);
                                            break;
                                        }
                                    }
                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    if (intent == null || (str = intent.getStringExtra(CommonUrlParts.REQUEST_ID)) == null) {
                                        str = "";
                                    }
                                    String str7 = str;
                                    if (i2 != -1) {
                                        if (i2 != 0) {
                                            fxv0.a.a(new hvv0(j, str7, new pxv0(VkUiUploadFailureType.ERROR)));
                                            break;
                                        } else {
                                            fxv0.a.a(new hvv0(j, str7, new pxv0(VkUiUploadFailureType.CANCELLED)));
                                            break;
                                        }
                                    } else {
                                        fxv0.a.a(new kvv0(yuv0Var.c, true, str7, false));
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        }
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.start();
        }
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.B = arguments != null ? arguments.getBoolean("key_is_nested", false) : false;
        Bundle arguments2 = getArguments();
        this.A = arguments2 != null ? arguments2.getBoolean("key_supports_nested_scroll", false) : false;
        this.M = hnj.a(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ggu0 vn = vn();
        vn.d.b(vn.b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BrowserPerfState browserPerfState;
        Context context;
        super.onCreate(bundle);
        if (bundle != null) {
            browserPerfState = new BrowserPerfState();
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || (browserPerfState = (BrowserPerfState) arguments.getParcelable("perf_state")) == null) {
                browserPerfState = new BrowserPerfState();
            }
        }
        this.G = browserPerfState;
        browserPerfState.g = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        boolean h = wn().h();
        boolean z = wn().getData() instanceof svv0.b;
        s200.r = h;
        s200.q = z;
        s200.s = true;
        ggu0 vn = vn();
        BrowserPerfState browserPerfState2 = this.G;
        if (browserPerfState2 == null) {
            browserPerfState2 = null;
        }
        mfu0 mfu0Var = vn.d;
        Context context2 = vn.b;
        fvv0 fvv0Var = vn.e;
        vn.v = new yuv0(context2, mfu0Var, fvv0Var.getAppId(), vn.c, (mbj0) vn.m.getValue());
        vn.s.b(fxv0.a.a.b0(gxv0.class).subscribe(new cgu0(new xa9(1, vn, ggu0.class, "handleVkUiRxEvent", "handleVkUiRxEvent(Lcom/vk/superapp/browser/utils/VkUiRxMethodEvent;)V", 0, 15), 0)));
        if (fvv0Var.v() != null) {
            tdr0 m = vn.m();
            VkBrowserMenuFactory c2 = m.c();
            m.g = new n(c2.c, c2.b, fhj0.a.b(c2.a), c2.f);
        }
        vn.x = new com.vk.superapp.browser.internal.ui.shortcats.a(new pll(vn), fvv0Var, mfu0Var);
        vn.w = new j43(mfu0Var, fvv0Var);
        if (vn.c.A()) {
            vn.A = pa3.a(vn.A, false, false, 14);
            vn.B();
        }
        if (fvv0Var.S() || fvv0Var.h()) {
            ber0 ber0Var = (ber0) vn.I.getValue();
            ggu0 ggu0Var = ber0Var.b;
            io.reactivex.rxjava3.disposables.b bVar = ggu0Var.r;
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            hg1.e(bVar, vdx0Var.m().c(ber0Var.a.getAppId()).subscribe(new xj50(new o99(1, ggu0Var, ggu0.class, "updateNotificationMenu", "updateNotificationMenu(Z)V", 0, 14), 22), new ksb0(new bw6(xgx0.a, 12), 12)));
        }
        vn.B = browserPerfState2;
        browserPerfState2.h = vn.r();
        vn.y = false;
        r3y.a("CloseAndClearCache", new bnc0(vn, 25));
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        n76 n76Var = superappUiRouterBridge instanceof n76 ? (n76) superappUiRouterBridge : null;
        if (n76Var != null) {
            n76Var.u0(this);
        }
        long appId = wn().getAppId();
        SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
        if (superappUiRouterBridge2 == null) {
            superappUiRouterBridge2 = null;
        }
        Long e = superappUiRouterBridge2.e();
        if (e != null && appId == e.longValue() && (context = this.M) != null) {
            SuperappUiRouterBridge superappUiRouterBridge3 = e370.d;
            if (superappUiRouterBridge3 == null) {
                superappUiRouterBridge3 = null;
            }
            superappUiRouterBridge3.d(context);
        }
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        if (epx.f(mgn0Var.c.a, "vkclient")) {
            xgx0.a.getClass();
            xgx0.g("Disallow using direct navigation statistic in vk app, skip it");
        } else if (yn().S()) {
            String str = "https://" + a0a.d + "/app" + yn().b.getAppId();
            String string = requireArguments().getString("original_url", null);
            if (string == null) {
                string = str;
            }
            String string2 = requireArguments().getString("key_url", null);
            if (string2 != null) {
                str = string2;
            }
            WebApiApplication t = yn().t();
            mgn0 mgn0Var2 = jgn0.a;
            (mgn0Var2 != null ? mgn0Var2 : null).getClass();
            try {
                yn().n.add(((VkAnalyticsComponent) m7m.d(this).mo408a(fpf0.a(VkAnalyticsComponent.class))).qc().a(string, str, t));
            } catch (Throwable unused) {
            }
        }
        TypedValue typedValue = krv0.a;
        krv0.a(this.N);
        this.D = un().getState().k();
        zn();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (yn().b.getAppId() != uhx.a().a) {
            Iterator it = yn().n.iterator();
            while (it.hasNext()) {
                ((k1w0) it.next()).a(yn().b.getAppId());
            }
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.J = vn().s().g(layoutInflater, viewGroup);
        ggu0 vn = vn();
        s93 state = vn.d.getState();
        if (state.p()) {
            j43 j43Var = vn.w;
            if (j43Var != null) {
                j43Var.d();
            }
            if (state.k()) {
                vn.p = true;
            }
        }
        View f = vn.s().f(layoutInflater, viewGroup, bundle);
        v6r0 j = vn.j();
        ViewGroup a = j.b.a();
        if (a != null) {
            j.g = (ViewGroup) a.findViewById(R.id.bottomBanner);
            j.h = (ViewGroup) a.findViewById(R.id.topBanner);
            j.i = (ViewGroup) a.findViewById(R.id.bottomOverlayBanner);
            j.j = (ViewGroup) a.findViewById(R.id.leftVerticalBanner);
            j.k = (ViewGroup) a.findViewById(R.id.rightVerticalBanner);
        }
        this.I = f;
        ggu0 vn2 = vn();
        this.K = vn2.s().h(layoutInflater, viewGroup, new c(0, this, a.class, "loadOrShowData", "loadOrShowData()V", 0));
        View view = this.I;
        if (view != null) {
            view.setId(R.id.vk_browser_content);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setId(R.id.vk_browser_loading);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setId(R.id.vk_browser_error);
        }
        frameLayout.addView(this.I, -1, -1);
        frameLayout.addView(this.J, -1, -1);
        frameLayout.addView(this.K, -1, -1);
        kn().getOnBackPressedDispatcher().a(getViewLifecycleOwner(), new sfu0(this));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ggu0 vn = vn();
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = vn.x;
        if (aVar != null) {
            hgl0 hgl0Var = aVar.e;
            if (hgl0Var.a) {
                hgl0Var.a = false;
                hgl0Var.b = 0L;
                hgl0Var.c = 0L;
            }
        }
        vn.s.dispose();
        io.reactivex.rxjava3.disposables.c cVar = vn.t;
        if (cVar != null) {
            cVar.dispose();
        }
        q55 q55Var = q55.a;
        q55.e(vn.S);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        n76 n76Var = superappUiRouterBridge instanceof n76 ? (n76) superappUiRouterBridge : null;
        if (n76Var != null) {
            n76Var.x0(this);
        }
        TypedValue typedValue = krv0.a;
        krv0.k(this.N);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        upn0 upn0Var;
        ViewGroup a;
        super.onDestroyView();
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        ((rxv0) this.P.getValue()).onDestroyView();
        ggu0 vn = vn();
        mfu0 mfu0Var = vn.d;
        fvv0 fvv0Var = vn.e;
        ((wvs) vn.C.t.getValue()).a();
        BrowserPerfState browserPerfState = vn.B;
        if (browserPerfState != null && !browserPerfState.p && browserPerfState.q == null && !fvv0Var.i()) {
            long appId = fvv0Var.getAppId();
            WebApiApplication v = fvv0Var.v();
            v73 v73Var = new v73(appId, v != null ? v.w : null, vn.d.getState().q(), fvv0Var.c(), fvv0Var.T0(), fvv0Var.l(), fvv0Var.a(), Boolean.valueOf(fvv0Var.v() != null));
            if (browserPerfState.q == null) {
                browserPerfState.p = false;
                browserPerfState.q = 5;
                browserPerfState.r = null;
                browserPerfState.n = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
                zdx0 zdx0Var = e370.v;
                if (zdx0Var != null) {
                    zdx0Var.a(browserPerfState, v73Var);
                }
            }
        }
        if (fvv0Var.getAppId() != uhx.a().a) {
            Iterator<T> it = fvv0Var.Q().iterator();
            while (it.hasNext()) {
                ((k1w0) it.next()).d(fvv0Var.getAppId());
            }
        }
        tau0 d = fvv0Var.d();
        if (d != null) {
            w5u0 w5u0Var = (w5u0) d.j.getValue();
            w5u0Var.e = 0L;
            w5u0Var.f = 0L;
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            hg1.o(vdx0Var.r().b(w5u0Var.a, w5u0Var.b, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(((Number) w5u0Var.c.invoke()).longValue())), StatsTrackVisitorTypeDto.CLOSE), 1, new ha40(27)).subscribe(new ih10(new hcs0(2)), new j990(new hy0(xgx0.a, 11), 18));
        }
        ((z380) vn.F.getValue()).onDestroy();
        j43 j43Var = vn.w;
        if (j43Var != null) {
            j43Var.c();
        }
        fvv0Var.T().b.e();
        fvv0Var.n(null);
        mfu0Var.destroy();
        yuv0 yuv0Var = vn.v;
        if (yuv0Var != null) {
            yuv0Var.f.e();
            yuv0Var.e.b();
        }
        vn.r.dispose();
        vn.i(false, false, null, null);
        WebView view = mfu0Var.getState().getView();
        if (view != null && (a = vn.s().a()) != null) {
            a.removeView(view);
        }
        utj utjVar = vn.o;
        if (utjVar != null) {
            utjVar.b();
        }
        vn.o = null;
        vn.s().onDestroyView();
        vn.j().a();
        ?? r2 = this.t;
        tpn0 tpn0Var = (tpn0) r2.getValue();
        if (tpn0Var != null) {
            tpn0Var.g = false;
        }
        tpn0 tpn0Var2 = (tpn0) r2.getValue();
        if (tpn0Var2 != null) {
            if (((Boolean) this.n.getValue()).booleanValue()) {
                Context requireContext = requireContext();
                HashSet hashSet = iah0.a;
                upn0Var = new upn0(true, Integer.valueOf(fnj.d(requireContext) ? requireContext.getColor(R.color.vk_black) : requireContext.getColor(R.color.vk_clear)), Integer.valueOf(requireContext.getColor(R.color.vk_black)));
            } else {
                gfx0 gfx0Var = e370.b;
                (gfx0Var != null ? gfx0Var : null).getClass();
                upn0Var = new upn0(dhr0.M(), 0, Integer.valueOf(krv0.l(R.attr.vk_ui_background_content)));
            }
            tpn0Var2.a(upn0Var);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            Context requireContext2 = requireContext();
            try {
                String[] strArr = requireContext2.getPackageManager().getPackageInfo(requireContext2.getPackageName(), 4096).requestedPermissions;
                if (strArr != null && rl3.G(strArr, "android.permission.DETECT_SCREEN_CAPTURE")) {
                    kn().unregisterScreenCaptureCallback(u81.b(this.j.getValue()));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        Iterator it2 = ((List) this.R.getValue()).iterator();
        while (it2.hasNext()) {
            ((eb80) it2.next()).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.g();
        }
        super.onDetach();
        this.M = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return eoy.a(super.onGetLayoutInflater(bundle));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Fragment parentFragment;
        super.onPause();
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.g();
        }
        if (getParentFragment() == null || !((parentFragment = getParentFragment()) == null || parentFragment.isHidden())) {
            An();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ovv0 J = vn().e.J();
        if (J != null) {
            Iterator it = J.a.values().iterator();
            while (it.hasNext()) {
                ((dvv0) it.next()).getClass();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Fragment parentFragment;
        super.onResume();
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.h();
        }
        this.F = true;
        if (this.E && ahn0Var != null) {
            ahn0Var.d(this.I);
        }
        if (getParentFragment() == null || (parentFragment = getParentFragment()) == null || !parentFragment.isHidden()) {
            Bn();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ggu0 vn = vn();
        vn.d.h(bundle);
        vn.q().Ti(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        vn().n = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        vn().n = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ahn0 ahn0Var;
        if (bundle == null && (ahn0Var = this.O) != null) {
            ahn0Var.e(view);
        }
        ggu0 vn = vn();
        io.reactivex.rxjava3.disposables.b bVar = vn.r;
        fvv0 fvv0Var = vn.e;
        kgu0 kgu0Var = vn.f;
        fvv0Var.z(kgu0Var.a);
        fvv0Var.n(kgu0Var.b);
        tpn0 G = fvv0Var.G();
        if (G != null) {
            G.d = new lec(vn);
        }
        tau0 d = fvv0Var.d();
        if (d != null) {
            bpn0 bpn0Var = d.j;
            w5u0 w5u0Var = (w5u0) bpn0Var.getValue();
            w5u0Var.getClass();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            bVar.b(hg1.o(vdx0Var.r().b(w5u0Var.a, w5u0Var.b, null, StatsTrackVisitorTypeDto.OPEN), 1, new ha40(27)).subscribe(new u2c0(new lir0(7), 2), new v5u0(new cu4(xgx0.a, 9), 0)));
            bVar.b(((w5u0) bpn0Var.getValue()).a(60000L));
            ovv0 J = fvv0Var.J();
            if (J != null) {
                Iterator it = J.a.entrySet().iterator();
                while (it.hasNext()) {
                    ((dvv0) ((Map.Entry) it.next()).getValue()).d = d;
                }
            }
        }
        q55 q55Var = q55.a;
        q55.a(vn.S);
        WebApiApplication v = fvv0Var.v();
        if (v != null) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            boolean j = wdx0Var.j();
            wdx0 wdx0Var2 = e370.f;
            if (wdx0Var2 == null) {
                wdx0Var2 = null;
            }
            int b2 = wdx0Var2.b();
            wdx0 wdx0Var3 = e370.f;
            wdx0 wdx0Var4 = wdx0Var3 != null ? wdx0Var3 : null;
            int i = pgn0.a.a;
            vn.d.g(new aj0(b2, String.valueOf(wdx0Var4.c().b.b), String.valueOf(fvv0Var.getAppId()), j), v.K, v.V);
        }
        Throwable th = yn().p;
        if (th != null) {
            In(th);
        } else {
            zn();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            Context requireContext = requireContext();
            try {
                String[] strArr = requireContext.getPackageManager().getPackageInfo(requireContext.getPackageName(), 4096).requestedPermissions;
                if (strArr == null || !rl3.G(strArr, "android.permission.DETECT_SCREEN_CAPTURE")) {
                    return;
                }
                kn().registerScreenCaptureCallback(kn().getMainExecutor(), u81.b(this.j.getValue()));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void pl(Integer num) {
        r6y r6yVar = un().getState().g().a;
        r6yVar.R().y();
        r6yVar.u = true;
    }

    public void tn() {
        jk();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mfu0 un() {
        return (mfu0) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ggu0 vn() {
        return (ggu0) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tvv0 wn() {
        return (tvv0) this.q.getValue();
    }

    public final void xb() {
        tpn0 G;
        ggu0 vn = vn();
        vn.d.u();
        fvv0 fvv0Var = vn.e;
        if (fvv0Var.Z() || (G = fvv0Var.G()) == null) {
            return;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        G.a(new upn0(dhr0.M(), 0, Integer.valueOf(krv0.l(R.attr.vk_ui_background_content))));
    }

    @Override // xsna.mxv0
    public final void xk(WebApiApplication webApiApplication, String str, boolean z) {
        vn().xk(webApiApplication, str, z);
    }

    public i1v0 xn() {
        return this.m;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void y4(List<String> list, Long l, WebApiApplication webApiApplication, l1w0 l1w0Var) {
        vn().y4(list, l, webApiApplication, l1w0Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void yc(long j, boolean z, gzs gzsVar, izs izsVar, boolean z2) {
        vn().yc(j, z, gzsVar, izsVar, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wwv0 yn() {
        return (wwv0) this.r.getValue();
    }

    @Override // xsna.mxv0
    public final void z7(long j, vu80 vu80Var) {
        vn().z7(j, vu80Var);
    }

    public final void zn() {
        ViewGroup d;
        View findViewById;
        ahn0 ahn0Var = this.O;
        if (ahn0Var != null) {
            ahn0Var.c(this.D);
        }
        if (this.D) {
            i0();
            return;
        }
        this.E = true;
        if (this.F && ahn0Var != null) {
            ahn0Var.d(this.I);
        }
        WebApiApplication m = yn().b.m();
        WebAppPlaceholderInfo webAppPlaceholderInfo = m != null ? m.T : null;
        if (webAppPlaceholderInfo != null) {
            In(new ApplicationNotAvailableException(webAppPlaceholderInfo));
            return;
        }
        View view = this.J;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        View view4 = this.L;
        if (view4 != null) {
            view4.setVisibility(4);
        }
        if (this.C) {
            return;
        }
        this.C = true;
        if (ahn0Var != null) {
            ahn0Var.a();
        }
        ggu0 vn = vn();
        fvv0 fvv0Var = vn.e;
        boolean i = fvv0Var.i();
        fvv0Var.F();
        vn.p = false;
        vn.z = false;
        WebApiApplication v = fvv0Var.v();
        if (v != null && v.N) {
            vn.A = pa3.a(vn.A, false, false, 13);
            vn.B();
        } else if (v != null && vn.v() && v.f() && v.t) {
            vn.A = pa3.a(vn.A, true, false, 11);
            vn.B();
        } else if (v != null) {
            vn.w(false);
        } else if (i) {
            vn.w(true);
        } else {
            vn.w(false);
        }
        WebApiApplication v2 = fvv0Var.v();
        if (v2 == null) {
            vn.d(0);
        } else {
            Integer a = xfx0.a(v2);
            vn.d(a != null ? a.intValue() : 0);
        }
        if (fvv0Var.v() == null || (d = vn.s().d()) == null || (findViewById = d.findViewById(R.id.show_console)) == null) {
            return;
        }
        findViewById.setVisibility(8);
        vn.t = hg1.i(x.k(findViewById).f(3L, TimeUnit.SECONDS).m(io.reactivex.rxjava3.android.schedulers.a.b()), new zyl0(vn, 20));
    }

    @Override // xsna.mxv0
    public final void P3() {
    }

    @Override // xsna.mxv0
    public final void Ti(Bundle bundle) {
    }

    @Override // xsna.mxv0
    public final void te(Bundle bundle) {
    }
}
