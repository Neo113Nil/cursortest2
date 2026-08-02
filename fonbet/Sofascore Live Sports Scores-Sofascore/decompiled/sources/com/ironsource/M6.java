package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.jka;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class M6 {
    private final InterfaceC4339u7 a;
    private final ConcurrentHashMap<String, Object> b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                M6.this.e(this.a);
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            M6.this.c.set(false);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        static volatile M6 a = new M6(0);

        private b() {
        }
    }

    private M6() {
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.a = Ib.a0().a();
        this.b = new ConcurrentHashMap<>();
    }

    private void d(Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.a.e(context));
        a(L6.B, this.a.l());
        a(L6.t, this.a.q());
        a(L6.F, this.a.f());
        a(L6.p, this.a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(L6.C1, adQualitySdkVersion);
        }
        String i = this.a.i();
        if (i != null) {
            a(L6.G, i.replaceAll("[^0-9/.]", ""));
            a(L6.J, i);
        }
        a(L6.a, String.valueOf(this.a.e()));
        String v = this.a.v(context);
        if (!TextUtils.isEmpty(v)) {
            a(L6.R0, v);
        }
        String e = C1.e(context);
        if (!TextUtils.isEmpty(e)) {
            a(L6.o, e);
        }
        String s = this.a.s(context);
        if (!TextUtils.isEmpty(s)) {
            a(L6.w0, s);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.a.r(context)));
        a(L6.b0, "2.0");
        a(L6.c0, Long.valueOf(C1.f(context)));
        a(L6.a0, Long.valueOf(C1.d(context)));
        a(L6.d, C1.b(context));
        a(L6.O, Integer.valueOf(Q3.f(context)));
        a(L6.Y, Q3.g(context));
        a(L6.H, "android");
        a(L6.z, this.a.t());
        a("mThreshold", this.a.a(this.a.o(context)));
        a(L6.h0, jka.f.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String I = this.a.I(context);
            if (!TextUtils.isEmpty(I)) {
                a(L6.X0, I);
            }
            String c = this.a.c(context);
            if (TextUtils.isEmpty(c)) {
                return;
            }
            a(L6.s, Boolean.valueOf(Boolean.parseBoolean(c)));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String z = this.a.z(context);
        if (!TextUtils.isEmpty(z)) {
            a(L6.M0, z);
        } else if (a(L6.M0)) {
            b(L6.M0);
        }
        a(L6.P0, this.a.j(context));
        String d = this.a.d(context);
        if (!TextUtils.isEmpty(d)) {
            a(L6.q, d.toUpperCase(Locale.getDefault()));
        }
        a(L6.r, this.a.B(context));
        String d2 = this.a.d();
        if (!TextUtils.isEmpty(d2)) {
            a("tz", d2);
        }
        String b2 = R3.b(context);
        if (!TextUtils.isEmpty(b2) && !b2.equals("none")) {
            a(L6.j, b2);
        }
        String d3 = R3.d(context);
        if (!TextUtils.isEmpty(d3)) {
            a(L6.k, d3);
        }
        a("vpn", Boolean.valueOf(R3.e(context)));
        String H = this.a.H(context);
        if (!TextUtils.isEmpty(H)) {
            a("icc", H);
        }
        int t = this.a.t(context);
        if (t >= 0) {
            a(L6.k1, Integer.valueOf(t));
        }
        a(L6.l1, this.a.w(context));
        a(L6.m1, this.a.G(context));
        a(L6.i0, Float.valueOf(this.a.F(context)));
        a(L6.m, String.valueOf(this.a.h()));
        a(L6.R, Integer.valueOf(this.a.k()));
        a(L6.Q, Integer.valueOf(this.a.c()));
        a(L6.Z0, String.valueOf(this.a.a()));
        a(L6.h1, String.valueOf(this.a.m()));
        a("mcc", Integer.valueOf(Q3.b(context)));
        a("mnc", Integer.valueOf(Q3.c(context)));
        a(L6.T, Boolean.valueOf(this.a.j()));
        a(L6.g, Boolean.valueOf(this.a.D(context)));
        a(L6.h, Integer.valueOf(this.a.E(context)));
        a(L6.b, Boolean.valueOf(this.a.f(context)));
        a(L6.K, Boolean.valueOf(this.a.i(context)));
        a("rt", Boolean.valueOf(this.a.p()));
        a(L6.Z, String.valueOf(this.a.r()));
        a(L6.e, Integer.valueOf(this.a.l(context)));
        a(L6.a1, Boolean.valueOf(this.a.J(context)));
        a(L6.c, this.a.n(context));
        a(L6.d0, this.a.s());
        A a2 = new A(Ib.a0().s());
        HashMap hashMap = new HashMap();
        a2.a(hashMap);
        a(L6.F0, hashMap);
        a(L6.L, ConfigFile.getConfigFile().getPluginType());
        a(L6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(L6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public static M6 b() {
        return b.a;
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(O6.a(this.b));
    }

    public /* synthetic */ M6(int i) {
        this();
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.b.containsKey(str);
    }

    private void a(Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            this.c.set(false);
        }
    }

    private void a() {
        String a2 = C4277qg.a.a();
        if (a2 != null) {
            HashMap l = com.appsflyer.internal.i.l("sdk", a2);
            HashMap hashMap = new HashMap();
            hashMap.put(L6.H1, l);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(L6.E1, hashMap);
            a(hashMap2);
        }
    }
}
