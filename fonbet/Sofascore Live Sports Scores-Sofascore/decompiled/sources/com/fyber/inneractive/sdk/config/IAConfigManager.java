package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.web.a1;
import com.fyber.inneractive.sdk.web.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class IAConfigManager {
    public static long O;
    public com.fyber.inneractive.sdk.network.v0 A;
    public com.fyber.inneractive.sdk.network.v0 B;
    public g C;
    public final com.fyber.inneractive.sdk.ignite.h D;
    public final com.fyber.inneractive.sdk.cache.k E;
    public final com.fyber.inneractive.sdk.network.f F;
    public final HashMap G;
    public final com.fyber.inneractive.sdk.serverapi.extradata.d H;
    public final AtomicBoolean I;
    public com.fyber.inneractive.sdk.measurement.e J;
    public WebView K;
    public final com.fyber.inneractive.sdk.config.global.r L;
    public com.fyber.inneractive.sdk.config.cellular.a M;
    public HashMap a = new HashMap();
    public HashMap b = new HashMap();
    public String c;
    public String d;
    public String e;
    public Context f;
    public final CopyOnWriteArrayList g;
    public boolean h;
    public final k0 i;
    public InneractiveUserConfig j;
    public boolean k;
    public String l;
    public InneractiveMediationName m;
    public String n;
    public String o;
    public ArrayList p;
    public boolean q;
    public final com.fyber.inneractive.sdk.network.l0 r;
    public String s;
    public s t;
    public i u;
    public t v;
    public final x0 w;
    public s1 x;
    public com.fyber.inneractive.sdk.config.global.a y;
    public final y0 z;
    public static final IAConfigManager N = new IAConfigManager();
    public static final g0 P = new g0();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    public IAConfigManager() {
        new HashSet();
        this.h = false;
        this.i = new k0();
        this.k = false;
        this.q = false;
        this.r = new com.fyber.inneractive.sdk.network.l0();
        this.s = "";
        this.w = new x0();
        this.z = new y0();
        this.D = new com.fyber.inneractive.sdk.ignite.h();
        this.E = new com.fyber.inneractive.sdk.cache.k();
        this.F = new com.fyber.inneractive.sdk.network.f();
        this.G = new HashMap();
        this.I = new AtomicBoolean();
        this.L = com.fyber.inneractive.sdk.config.global.r.a();
        this.g = new CopyOnWriteArrayList();
        this.H = new com.fyber.inneractive.sdk.serverapi.extradata.d();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        N.g.add(onConfigurationReadyAndValidListener);
    }

    public static JSONArray b() {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = N.H;
        dVar.getClass();
        JSONArray jSONArray = (JSONArray) dVar.a(new JSONArray(), new com.fyber.inneractive.sdk.serverapi.extradata.b());
        if (jSONArray == null) {
            IAlog.a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        IAlog.a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    public static boolean c() {
        g gVar = N.C;
        return gVar != null && gVar.h();
    }

    public static boolean d() {
        IAConfigManager iAConfigManager = N;
        boolean z = iAConfigManager.e != null;
        int i = k.a;
        boolean booleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z && System.currentTimeMillis() - O > 3600000) || booleanValue) {
            if (booleanValue) {
                s sVar = iAConfigManager.t;
                sVar.d = false;
                com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.util.l(sVar.e));
            }
            a();
            b1 b1Var = b1.c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.a.execute(new a1(b1Var));
        }
        return z;
    }

    public static void e() {
        IAConfigManager iAConfigManager = N;
        if (iAConfigManager.I.get()) {
            return;
        }
        iAConfigManager.I.set(true);
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("privacy_api_usage_reported", true).apply();
        }
    }

    public static void f() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static boolean g() {
        IAConfigManager iAConfigManager = N;
        Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.L.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.k);
        boolean booleanValue = c != null ? c.booleanValue() : false;
        IAlog.a("OMSDK AB %s", String.valueOf(booleanValue));
        if (booleanValue) {
            com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.J;
            return eVar == null || !eVar.a;
        }
        IAlog.a("OM SDK disabled", new Object[0]);
        IAlog.d("OM SDK disabled", new Object[0]);
        return false;
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        N.g.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(boolean z, Exception exc) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = (OnConfigurationReadyAndValidListener) it.next();
            if (onConfigurationReadyAndValidListener != null) {
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = N;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.A;
        if (v0Var != null) {
            iAConfigManager.r.a(v0Var);
        }
        s sVar = iAConfigManager.t;
        if (sVar.d) {
            return;
        }
        iAConfigManager.r.a(new com.fyber.inneractive.sdk.network.v0(new p(sVar), sVar.a, sVar.e));
    }
}
