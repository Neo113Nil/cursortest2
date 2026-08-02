package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.ironsource.Ua;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class g0 {
    private JSONObject a;
    private com.mbridge.msdk.setting.k b;
    private long c;
    private final BroadcastReceiver d;
    IntentFilter e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        static final g0 a = new g0();
    }

    private g0() {
        this.a = new JSONObject();
        this.d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.a = jSONObject;
        }
        try {
            if (!jSONObject.optString("KEY_INFO", "").equals(str)) {
                this.a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e) {
            q0.b("NetAddressManager", e.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.a.put("KEY_TIME", currentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(currentTimeMillis));
        } catch (Exception e2) {
            q0.b("NetAddressManager", e2.getMessage());
        }
    }

    public String b() {
        try {
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                this.a = jSONObject;
            }
            if (jSONObject.length() < 2) {
                try {
                    this.a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e) {
                    q0.b("NetAddressManager", e.getMessage());
                }
                try {
                    this.a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e2) {
                    q0.b("NetAddressManager", e2.getMessage());
                }
            }
            String optString = this.a.optString("KEY_INFO");
            if (TextUtils.isEmpty(optString)) {
                return "";
            }
            com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.a.optLong("KEY_TIME") > (d != null ? d.T() : 3600L) * 1000 ? "" : optString;
        } catch (Exception e3) {
            q0.b("NetAddressManager", e3.getMessage());
            return "";
        }
    }

    public void c() {
        Context d;
        try {
            if (com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).U() != 1 || (d = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            d.registerReceiver(this.d, this.e);
        } catch (Exception e) {
            q0.b("NetAddressManager", e.getMessage());
        }
    }

    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c > Ua.C) {
            com.mbridge.msdk.setting.k kVar = this.b;
            if (kVar == null) {
                kVar = new com.mbridge.msdk.setting.k();
                this.b = kVar;
            }
            kVar.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.c = currentTimeMillis;
        }
    }

    public void e() {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d != null) {
            try {
                d.unregisterReceiver(this.d);
            } catch (Exception e) {
                q0.b("NetAddressManager", e.getMessage());
            }
        }
    }

    public static g0 a() {
        return b.a;
    }
}
