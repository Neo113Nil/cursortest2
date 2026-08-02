package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.wga0;

/* compiled from: CommonRequestParamsForAdd.java */
/* loaded from: classes13.dex */
public class f {
    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.E() + "");
            eVar.a("has_wx", m0.E(context) + "");
            eVar.a("integrated_wx", m0.G() + "");
            eVar.a("opensdk_ver", m0.D() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String j = m0.j();
            if (!TextUtils.isEmpty(j)) {
                eVar.a("hardware", j);
            }
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().d() == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
            eVar.a("emu", String.valueOf(m0.F()));
            eVar.a("gp_version", m0.v());
            eVar.a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.d, t0.c() + "");
            eVar.a(e.e, t0.a() + "");
            eVar.a(e.j, m0.w());
        }
        eVar.a("pkg_source", m0.a(m0.t(context), context));
        if (com.mbridge.msdk.foundation.controller.c.n().k() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.n().k().toString());
        }
        eVar.a("http_req", "2");
        g.a(eVar, context);
        g(eVar);
    }

    public static void b(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.d);
    }

    public static void c(e eVar) {
        String str = com.mbridge.msdk.util.c.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void d(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.w);
    }

    public static void e(e eVar) {
        com.mbridge.msdk.setting.g a = wga0.a(com.mbridge.msdk.setting.i.b());
        if (a == null) {
            a = com.mbridge.msdk.setting.i.b().a();
        }
        if (a.F() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        } else if (a.K0()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        }
        String f = com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().f();
        if (TextUtils.isEmpty(f)) {
            return;
        }
        eVar.a("tc_string", f);
    }

    public static void f(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                eVar.a("b", com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                return;
            }
            eVar.a("c", com.mbridge.msdk.foundation.same.a.g);
        } catch (Exception e) {
            q0.b("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    public static void g(e eVar) {
        a(eVar, true);
        i(eVar);
        f(eVar);
        e(eVar);
        a(eVar);
        c(eVar);
        g.a(eVar);
    }

    public static void h(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", m0.E() + "");
            eVar.a("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
            eVar.a("integrated_wx", m0.G() + "");
            eVar.a("opensdk_ver", m0.D() + "");
            eVar.a("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String j = m0.j();
            if (!TextUtils.isEmpty(j)) {
                eVar.a("hardware", j);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
            eVar.a("emu", String.valueOf(m0.F()));
            eVar.a("gp_version", m0.v());
            eVar.a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.j, m0.w());
        }
        g.b(eVar);
        a(eVar, false);
        i(eVar);
        f(eVar);
        a(eVar);
        c(eVar);
    }

    public static void i(e eVar) {
        int C = m0.C();
        if (C != -1) {
            eVar.a("unknown_source", C + "");
        }
    }

    public static void j(e eVar) {
        if (m0.A() == 0) {
            return;
        }
        eVar.a("tun", m0.A() + "");
    }

    public static void k(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a(StatCustomFieldKey.NETWORK_TYPE);
                eVar.a("useragent");
                eVar.a(O6.d0);
                eVar.a("language");
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.d);
                eVar.a(e.e);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a(AnalyticsBaseParamsConstantsKt.TIMEZONE);
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a(O6.X0);
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    public static void a(e eVar, boolean z) {
        com.mbridge.msdk.setting.g a = wga0.a(com.mbridge.msdk.setting.i.b());
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (a != null) {
            if (!TextUtils.isEmpty(a.a()) && z) {
                eVar.a("a_stid", a.a());
            }
            try {
                g.a(eVar, d, z, a);
            } catch (Exception e) {
                q0.b("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    public static void a(e eVar) {
        String b = com.mbridge.msdk.foundation.tools.g.b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        eVar.a("az_aid_info", b);
    }
}
