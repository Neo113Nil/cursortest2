package com.vk.superapp.ui.miniapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.preference.Preference;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.ApiApplication;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.links.MusicSubscriptionScreen;
import com.vk.registration.funnels.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.ac20;
import xsna.asu0;
import xsna.awt0;
import xsna.b25;
import xsna.bek0;
import xsna.bis;
import xsna.bo8;
import xsna.bpn0;
import xsna.brm0;
import xsna.chx0;
import xsna.dbs;
import xsna.dhr0;
import xsna.drm0;
import xsna.e370;
import xsna.e43;
import xsna.el3;
import xsna.epx;
import xsna.eqy;
import xsna.eyp0;
import xsna.f4m;
import xsna.f870;
import xsna.fpu0;
import xsna.fvv0;
import xsna.fxv0;
import xsna.ggr0;
import xsna.h5s;
import xsna.hc8;
import xsna.hgr0;
import xsna.hp20;
import xsna.i1v0;
import xsna.i5g;
import xsna.iah0;
import xsna.ip20;
import xsna.j5g;
import xsna.k46;
import xsna.kjn0;
import xsna.lbc0;
import xsna.lvv0;
import xsna.mfu0;
import xsna.mzp0;
import xsna.nds;
import xsna.nvv0;
import xsna.nx50;
import xsna.o25;
import xsna.oen;
import xsna.ok8;
import xsna.oti;
import xsna.p1p0;
import xsna.pn00;
import xsna.pro0;
import xsna.q7n0;
import xsna.q9k;
import xsna.qdj;
import xsna.qex0;
import xsna.qr;
import xsna.r3y;
import xsna.r6y;
import xsna.rka0;
import xsna.rli0;
import xsna.rxi0;
import xsna.rzp0;
import xsna.s1v;
import xsna.sc4;
import xsna.srq0;
import xsna.svv0;
import xsna.t810;
import xsna.tdr0;
import xsna.tvv0;
import xsna.uds;
import xsna.uhx;
import xsna.ulp0;
import xsna.upn0;
import xsna.vds;
import xsna.vm40;
import xsna.wwv0;
import xsna.yfu0;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: VKSuperAppBrowserFragment.kt */
/* loaded from: classes6.dex */
public class VKSuperAppBrowserFragment extends FragmentImpl implements ok8, nds, uds, dbs, vds, kjn0, hc8 {
    public static final int Y = iah0.a(100);
    public static final Object Z = pn00.k(new Pair(Long.valueOf(InternalVkMiniApps.COMMUNITY_MANAGE.h().a), MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_MANAGE), new Pair(Long.valueOf(InternalVkMiniApps.COMMUNITY_CREATE.h().a), MobileOfficialAppsCoreNavStat$EventScreen.CREATE_GROUP), new Pair(Long.valueOf(InternalVkMiniApps.ADS_EASY_PROMOTE.h().a), MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_ADS_PROMOTE));
    public int N;
    public boolean Q;
    public hgr0 R;
    public MobileOfficialAppsCoreNavStat$EventScreen S;
    public boolean U;
    public String V;
    public ac20 X;
    public int O = dhr0.t.c(R.attr.vk_ui_background_content);
    public boolean P = dhr0.L();
    public final bpn0 T = new bpn0(new rka0(this, 25));
    public final bpn0 W = new bpn0(new srq0(this, 2));

    /* compiled from: VKSuperAppBrowserFragment.kt */
    public static final class a {
        public static String a() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return Preference.g(context).getString("vkUiHostUri", "static.".concat(a0a.d));
        }
    }

    public static long io(Long l, String str) {
        long j = uhx.a().a;
        if ((l == null || l.longValue() != j) && ((l == null || l.longValue() != 0) && l != null)) {
            return l.longValue();
        }
        try {
            qex0 qex0Var = e370.y;
            if (qex0Var == null) {
                qex0Var = null;
            }
            List b = qex0Var.b();
            if (str == null) {
                str = "";
            }
            return f870.r(str, b);
        } catch (IllegalArgumentException unused) {
            return l != null ? l.longValue() : uhx.a().a;
        }
    }

    public static Bundle ko(WebApiApplication webApiApplication, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_url", bundle.getString("key_url"));
        bundle2.putString("key_title", webApiApplication.c);
        bundle2.putString("original_url", bundle.getString("original_url"));
        bundle2.putString("key_ref", bundle.getString("key_ref"));
        bundle2.putParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, webApiApplication);
        bundle2.putLong("key_application_id", webApiApplication.b);
        bundle2.putBoolean("key_is_nested", bundle.getBoolean("key_is_nested"));
        Long e = bo8.e(bundle, "dialog_id");
        if (e != null) {
            bundle2.putLong("dialog_id", e.longValue());
        }
        bundle2.putParcelable("perf_state", bundle.getParcelable("perf_state"));
        bundle2.putString("key_source_url", bundle.getString("key_source_url"));
        return bundle2;
    }

    @Override // xsna.ok8
    public final void J4(upn0 upn0Var) {
        this.P = !upn0Var.b;
        Integer num = upn0Var.a;
        no(num != null ? num.intValue() : 0);
        Integer num2 = upn0Var.c;
        this.O = num2 != null ? num2.intValue() : dhr0.t.c(R.attr.vk_ui_background_content);
    }

    @Override // xsna.ok8
    public boolean Ma(String str) {
        return false;
    }

    @Override // xsna.dbs
    public final boolean N1() {
        return mo();
    }

    @Override // xsna.vds
    public int Q0() {
        WebApiApplication go = go();
        if (go == null) {
            return -1;
        }
        if (go.f()) {
            int i = go.v;
            if (i == 1) {
                return 0;
            }
            if (i != 2) {
                return -1;
            }
        } else {
            hgr0 hgr0Var = this.R;
            if (hgr0Var != null && hgr0Var.vn().q && !hgr0Var.yn().b.h()) {
                return -1;
            }
        }
        return 1;
    }

    @Override // xsna.ok8
    public final r6y R5(wwv0 wwv0Var) {
        qdj qdjVar = k46.a;
        if (qdjVar == null) {
            return null;
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        return (r6y) qdjVar.invoke(wwv0Var, this, superappUiRouterBridge != null ? superappUiRouterBridge : null);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        yfu0 yfu0Var;
        if (mo()) {
            int i = rect2.bottom;
            boolean z = i > Y;
            int i2 = z ? i : 0;
            int i3 = ((kn().getResources().getConfiguration().orientation == 1) && (iah0.n(kn()) || oen.a())) ? rect2.top : 0;
            int i4 = (mo() || z) ? 0 : rect2.bottom;
            View view = getView();
            if (view != null) {
                awt0.x(view, 0, 0, 0, i2, 7);
            }
            rect2.set(0, i3, 0, i4);
        }
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            Rect rect3 = new Rect(rect2);
            hgr0Var.vn().d.y(rect3);
            tdr0 m = hgr0Var.vn().m();
            fvv0 fvv0Var = m.b;
            int intValue = fvv0Var.r() ? ((Number) VkBrowserMenuFactory.i.getValue()).intValue() + rect3.top : ((Number) VkBrowserMenuFactory.i.getValue()).intValue();
            if (fvv0Var.S() && m.a.A() && m.c().d() && (yfu0Var = m.i) != null) {
                f4m.t(intValue, yfu0Var);
            }
            if (hgr0Var.yn().r()) {
                rect2.top = 0;
            }
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        hgr0 hgr0Var = this.R;
        boolean a0 = hgr0Var != null ? hgr0Var.a0() : false;
        if (!a0) {
            setResult(-1, new Intent());
        }
        return a0;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public void close() {
        eo();
    }

    @Override // xsna.ivf
    public void dh(lvv0 lvv0Var) {
        Intent putExtras;
        if (lvv0Var instanceof lvv0.c) {
            if (this.Q) {
                eo();
                return;
            }
            lvv0.c cVar = (lvv0.c) lvv0Var;
            String str = cVar.b;
            int i = epx.f(str, "success") ? -1 : 0;
            String str2 = cVar.d;
            Intent intent = new Intent();
            intent.putExtra("VkWebAppClose_status", str);
            String str3 = cVar.c;
            if (str3 != null) {
                intent.putExtra("VKWebAppClose_payload", str3);
            }
            if (!drm0.N(str2)) {
                intent.putExtra("android.content.extra.REQUEST_ID", str2);
            }
            Intent intent2 = this.B;
            if (intent2 != null && (putExtras = intent2.putExtras(intent)) != null) {
                intent = putExtras;
            }
            Mf(i, intent);
            return;
        }
        if (lvv0Var instanceof lvv0.a) {
            Mf(-1, new Intent().putExtra("authResult", ((lvv0.a) lvv0Var).a));
            return;
        }
        if (!(lvv0Var instanceof lvv0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        b25 a2 = o25.a();
        lvv0.b bVar = (lvv0.b) lvv0Var;
        String str4 = bVar.b;
        boolean z = a2.U(str4) && o25.a().g().size() > 1;
        boolean z2 = bVar.d && o25.a().U(str4);
        if (!z2 && !o25.a().b()) {
            b.a.getClass();
            b.o(null, "deactivated", null);
        }
        if (z || z2) {
            o25.a().R("deactivated", str4, !z2);
            Intent putExtra = new Intent().putExtra(CommonConstant.KEY_ACCESS_TOKEN, str4).putExtra("utilityTokens", bVar.c);
            pro0.f(new lbc0(putExtra.getExtras(), 26));
            Mf(-1, putExtra);
            return;
        }
        o25.a().R("deactivated", str4, true);
        Intent putExtra2 = new Intent().putExtra("openLoginPass", bVar.a);
        pro0.f(new lbc0(putExtra2.getExtras(), 26));
        Mf(0, putExtra2);
    }

    public final void eo() {
        fxv0.a.a(nvv0.a);
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            hgr0Var.Kn();
        }
        if (this.Q) {
            return;
        }
        finish();
    }

    public final void fo() {
        long io2;
        if (this.V == null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("key_url") : null;
            if (ho() != 0) {
                io2 = ho();
            } else {
                WebApiApplication go = go();
                io2 = io(go != null ? Long.valueOf(go.b) : null, string);
            }
            rxi0.a.getClass();
            rxi0.a(io2);
            this.V = rxi0.b(io2);
        }
    }

    public final WebApiApplication go() {
        return (WebApiApplication) this.T.getValue();
    }

    public final long ho() {
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            return hgr0Var.yn().b.getAppId();
        }
        return 0L;
    }

    public final mfu0 jo() {
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            return hgr0Var.un();
        }
        return null;
    }

    @Override // xsna.nds, xsna.xoo0
    public int l2() {
        return this.N;
    }

    public svv0 ln(Bundle bundle) {
        return null;
    }

    public final String lo() {
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            return hgr0Var.vn().r();
        }
        return null;
    }

    @Override // xsna.ok8
    public wwv0 m5(tvv0 tvv0Var) {
        return null;
    }

    public final boolean mo() {
        ApiApplication apiApplication;
        Bundle arguments = getArguments();
        if (arguments == null || (apiApplication = (ApiApplication) arguments.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) == null) {
            return false;
        }
        return apiApplication.zb().booleanValue();
    }

    @Override // xsna.dbs
    public final void ni(ac20 ac20Var) {
        this.X = ac20Var;
    }

    public void no(int i) {
        this.N = i;
    }

    @Override // xsna.woo0
    public final int o7() {
        return this.O;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            hgr0Var.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_browser_frament_wrapper_layout, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        WebApiApplication go;
        VKSuperAppBrowserFragment vKSuperAppBrowserFragment;
        ac20 ac20Var;
        if (mo()) {
            List<Fragment> f = getParentFragmentManager().c.f();
            int size = f.size() - 1;
            while (true) {
                if (-1 >= size) {
                    vKSuperAppBrowserFragment = null;
                    break;
                }
                Fragment fragment = f.get(size);
                if ((fragment instanceof VKSuperAppBrowserFragment) && fragment != this) {
                    vKSuperAppBrowserFragment = (VKSuperAppBrowserFragment) fragment;
                    break;
                }
                size--;
            }
            if ((vKSuperAppBrowserFragment == null || !vKSuperAppBrowserFragment.mo()) && (ac20Var = this.X) != null) {
                ((nx50) ac20Var.c).O0(0, 0L);
            }
        }
        eqy<bek0> eqyVar = d.a;
        b.d i = com.vk.toggle.b.A.i(SaFeatures.SA_GAMES_ACHIEVEMENTS_BLOCK);
        if (i != null ? p1p0.a(i) : false) {
            WebApiApplication go2 = go();
            if ((bis.i(go2 != null ? go2.b : ho(), go()) || mo()) && (go = go()) != null) {
                q7n0.a().f().b(go.b);
            }
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        hgr0 hgr0Var = this.R;
        if (hgr0Var != null) {
            if (z) {
                hgr0Var.An();
            } else {
                hgr0Var.Bn();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        hp20 hp20Var = (hp20) this.W.getValue();
        hp20Var.getClass();
        if (vm40.c.contains(Long.valueOf(hp20Var.a))) {
            r3y.a("subscriptionActivated", new t810(3));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        hp20 hp20Var = (hp20) this.W.getValue();
        hp20Var.getClass();
        if (vm40.c.contains(Long.valueOf(hp20Var.a))) {
            r3y.c("subscriptionActivated");
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        asu0.a.getClass();
        asu0.n().submit(new sc4(this, 16));
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestFitSystemWindows();
        }
        if (this.U) {
            return;
        }
        oo();
    }

    public final void oo() {
        UiMeasuringScreen uiMeasuringScreen;
        PerformanceScoreProduct performanceScoreProduct;
        Bundle bundle;
        hgr0 hgr0Var;
        VKSuperAppBrowserFragment vKSuperAppBrowserFragment;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.Q = arguments.getBoolean("key_is_nested");
            WebApiApplication go = go();
            WebApiApplication go2 = go();
            if (go2 == null || !go2.e()) {
                WebApiApplication go3 = go();
                uiMeasuringScreen = bis.i(go3 != null ? go3.b : ho(), go()) ? UiMeasuringScreen.MINIAPP_INTERNAL : UiMeasuringScreen.MINIAPP;
            } else {
                uiMeasuringScreen = UiMeasuringScreen.GAME;
            }
            ((mzp0) rzp0.c(uiMeasuringScreen, null, false, 62).j()).init();
            WebApiApplication go4 = go();
            if (go4 == null || !go4.e()) {
                WebApiApplication go5 = go();
                performanceScoreProduct = bis.i(go5 != null ? go5.b : ho(), go()) ? PerformanceScoreProduct.MINIAPP_INTERNAL : PerformanceScoreProduct.MINIAPP;
            } else {
                performanceScoreProduct = PerformanceScoreProduct.GAME;
            }
            ((yw90) zrd0.a(performanceScoreProduct).j()).init();
            oti otiVar = new oti(rli0.A(rli0.m(new ulp0(new i5g(e43.l(uiMeasuringScreen, performanceScoreProduct)), new eyp0(4)))));
            if (s1v.c == null || !oti.class.equals(oti.class)) {
                s1v.c = otiVar;
            }
            if (go == null) {
                Regex regex = hgr0.X;
                String string = arguments.getString("key_url");
                String string2 = arguments.getString("original_url");
                BrowserPerfState browserPerfState = (BrowserPerfState) arguments.getParcelable("perf_state");
                long j = arguments.getLong("key_application_id", uhx.a().a);
                boolean z = arguments.getBoolean("is_user_banned", false);
                boolean z2 = arguments.getBoolean("can_cache", false);
                Bundle b = qr.b("key_url", string, "original_url", string2);
                if ((j == uhx.a().a || j == 0) && string != null && string.length() != 0) {
                    try {
                        qex0 qex0Var = e370.y;
                        if (qex0Var == null) {
                            qex0Var = null;
                        }
                        j = f870.r(string, qex0Var.b());
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b.putLong("key_application_id", j);
                b.putParcelable("perf_state", browserPerfState);
                b.putBoolean("is_user_banned", z);
                b.putBoolean("can_cache", z2);
                hgr0Var = new hgr0();
                hgr0Var.setArguments(b);
                bundle = arguments;
            } else {
                long j2 = go.b;
                if (go.f()) {
                    int i = ggr0.c0;
                    String string3 = arguments.getString("key_url");
                    String string4 = arguments.getString("key_ref");
                    String string5 = arguments.getString("original_url");
                    long j3 = arguments.getLong("dialog_id");
                    boolean z3 = arguments.getBoolean("key_is_nested");
                    BrowserPerfState browserPerfState2 = (BrowserPerfState) arguments.getParcelable("perf_state");
                    String string6 = arguments.getString("special_url");
                    String string7 = arguments.getString("track_code");
                    Bundle a2 = q9k.a("key_url", string3);
                    a2.putString("key_title", go.c);
                    a2.putString("original_url", string5);
                    a2.putString("key_ref", string4);
                    a2.putParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, go);
                    a2.putLong("key_application_id", j2);
                    a2.putBoolean("key_is_nested", z3);
                    a2.putLong("dialog_id", j3);
                    a2.putParcelable("perf_state", browserPerfState2);
                    a2.putString("special_url", string6);
                    a2.putString("track_code", string7);
                    hgr0Var = new ggr0();
                    hgr0Var.setArguments(a2);
                    bundle = arguments;
                } else {
                    InternalVkMiniApps.Companion.getClass();
                    if (e43.l(Long.valueOf(InternalVkMiniApps.VK_DATING.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_NATIVE.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_DEV.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_DEV_FRONTEND.h().a), Long.valueOf(InternalVkMiniApps.DATING.h().a), Long.valueOf(InternalVkMiniApps.OK_DATING_PROD.h().a), Long.valueOf(InternalVkMiniApps.OK_DATING_DEV.h().a), Long.valueOf(InternalVkMiniApps.OK_DATING_NATIVE.h().a)).contains(Long.valueOf(j2))) {
                        int i2 = fpu0.c0;
                        bundle = arguments;
                        Bundle ko = ko(go, bundle);
                        hgr0Var = new fpu0();
                        hgr0Var.setArguments(ko);
                    } else {
                        bundle = arguments;
                        Regex regex2 = hgr0.X;
                        Bundle ko2 = ko(go, bundle);
                        hgr0Var = new hgr0();
                        hgr0Var.setArguments(ko2);
                    }
                }
            }
            Fragment H = getChildFragmentManager().H("superapp_browser_fragment");
            if (H == null) {
                vKSuperAppBrowserFragment = this;
                vKSuperAppBrowserFragment.R = hgr0Var;
                FragmentManager childFragmentManager = vKSuperAppBrowserFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                aVar.g(R.id.container_browser, hgr0Var, "superapp_browser_fragment");
                aVar.l();
            } else {
                vKSuperAppBrowserFragment = this;
                if (vKSuperAppBrowserFragment.R == null) {
                    vKSuperAppBrowserFragment.R = H instanceof hgr0 ? (hgr0) H : null;
                }
            }
            vKSuperAppBrowserFragment.fo();
            Serializable serializable = bundle.getSerializable("screen");
            vKSuperAppBrowserFragment.S = serializable instanceof MobileOfficialAppsCoreNavStat$EventScreen ? (MobileOfficialAppsCoreNavStat$EventScreen) serializable : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0160, code lost:
    
        if (r8 != null) goto L90;
     */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(UiTrackingScreen uiTrackingScreen) {
        WebApiApplication c;
        ApiApplication apiApplication;
        long io2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        Object obj;
        SchemeStat$EventItem.Type type;
        long io3;
        fo();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = this.S;
        if (mobileOfficialAppsCoreNavStat$EventScreen2 != null) {
            uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen2;
        }
        hgr0 hgr0Var = this.R;
        if (hgr0Var == null || (c = hgr0Var.yn().b.m()) == null) {
            Bundle arguments = getArguments();
            c = (arguments == null || (apiApplication = (ApiApplication) arguments.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) == null) ? null : chx0.c(apiApplication);
        }
        String string = requireArguments().getString("key_url", null);
        if (string == null) {
            hgr0 hgr0Var2 = this.R;
            string = (hgr0Var2 == null || hgr0Var2.M == null) ? null : hgr0Var2.vn().r();
            if (string == null) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(a0a.d);
                sb.append("/app");
                sb.append(c != null ? c.b : ho());
                string = sb.toString();
            }
        }
        String string2 = requireArguments().getString("original_url", null);
        if (string2 == null) {
            StringBuilder sb2 = new StringBuilder("https://");
            sb2.append(a0a.d);
            sb2.append("/app");
            sb2.append(c != null ? c.b : ho());
            string2 = sb2.toString();
        }
        String str = string2;
        Long e = bo8.e(requireArguments(), "group_id");
        Long valueOf = e != null ? Long.valueOf(Math.abs(e.longValue())) : null;
        if (ho() != 0) {
            io2 = ho();
        } else {
            io2 = io(c != null ? Long.valueOf(c.b) : null, string);
        }
        WebApiApplication go = go();
        long ho = go != null ? go.b : ho();
        WebApiApplication go2 = go();
        if (go2 == null || !go2.f()) {
            List<Long> list = vm40.c;
            WebApiApplication go3 = go();
            if (j5g.P(list, go3 != null ? Long.valueOf(go3.b) : null)) {
                String lo = lo();
                if (lo == null) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                } else {
                    String fragment = Uri.parse(lo).getFragment();
                    if (fragment == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                    } else {
                        Iterator it = drm0.c0(fragment, new String[]{"&"}, 0, 6).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (brm0.B((String) obj, "utm_term", false)) {
                                    break;
                                }
                            }
                        }
                        String str2 = (String) obj;
                        if (str2 != null) {
                            String g0 = drm0.g0(str2, "=", str2);
                            MusicSubscriptionScreen.Companion.getClass();
                            mobileOfficialAppsCoreNavStat$EventScreen = MusicSubscriptionScreen.a.a(g0);
                        }
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                    }
                }
            } else {
                ?? r10 = Z;
                if (r10.containsKey(Long.valueOf(ho))) {
                    mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) r10.get(Long.valueOf(ho));
                    if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
                    }
                } else {
                    mobileOfficialAppsCoreNavStat$EventScreen = bis.i(ho, go()) ? MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP_INTERNAL : MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
                }
            }
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAME;
        }
        uiTrackingScreen.g = new ip20(io2);
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
        WebApiApplication go4 = go();
        if (go4 == null || !go4.f()) {
            WebApiApplication go5 = go();
            type = bis.i(go5 != null ? go5.b : ho(), go()) ? SchemeStat$EventItem.Type.MINI_APP_INTERNAL : SchemeStat$EventItem.Type.MINI_APP;
        } else {
            type = SchemeStat$EventItem.Type.GAME;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(type, Long.valueOf(io2), c != null ? Long.valueOf(c.q) : null, str, c != null ? c.w : null, this.V);
        uiTrackingScreen.a(new SchemeStat$TypeMiniAppItem(SchemeStat$TypeMiniAppItem.Type.NAVIGATION, string, valueOf));
        if (ho() != 0) {
            io3 = ho();
        } else {
            WebApiApplication go6 = go();
            io3 = io(go6 != null ? Long.valueOf(go6.b) : null, string);
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("screen_view_data");
        b.b("mini_app_id", Long.valueOf(io3));
        bVar.k(b.e());
    }

    @Override // xsna.ok8
    public i1v0 z3(wwv0 wwv0Var) {
        return null;
    }

    @Override // xsna.ok8
    public final FragmentImpl Xg() {
        return this;
    }

    @Override // xsna.hc8
    public final FragmentImpl g() {
        return this;
    }

    @Override // xsna.ok8
    public String B9(String str) {
        return str;
    }
}
