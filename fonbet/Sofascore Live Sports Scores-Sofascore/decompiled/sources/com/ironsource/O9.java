package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4197m8;
import com.ironsource.K8;
import com.ironsource.Q;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O9 implements InterfaceC4132ie, InterfaceC4282r4, InterfaceC4265q4, InterfaceC4229o4, InterfaceC4247p4, U9, Mc {
    private static final String m = "IronSourceAdsPublisherAgent";
    private static O9 n;
    private com.ironsource.sdk.controller.e a;
    private String b;
    private String c;
    private R4 d;
    private C4219nc e;
    private X3 g;
    private boolean f = false;
    private FeaturesManager h = FeaturesManager.getInstance();
    private K8.a i = Ib.R().j();
    private Q.a j = Ib.R().H();
    private Q k = Ib.a0().J();
    private InterfaceC4161k8 l = Ib.a0().t();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;

        public a(String str, String str2, Q4 q4) {
            this.a = str;
            this.b = str2;
            this.c = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, this.b, this.c, (InterfaceC4282r4) o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ JSONObject a;

        public b(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, (InterfaceC4282r4) o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;

        public c(String str, String str2, Q4 q4) {
            this.a = str;
            this.b = str2;
            this.c = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, this.b, this.c, (InterfaceC4265q4) o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        final /* synthetic */ JSONObject a;

        public e(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, (InterfaceC4265q4) o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ J9 a;
        final /* synthetic */ Map b;

        public f(J9 j9, Map map) {
            this.a = j9;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4197m8.e eVar = this.a.i() ? C4197m8.e.Banner : C4197m8.e.Interstitial;
            Q4 a = O9.this.d.a(eVar, this.a);
            C4233o8 c4233o8 = new C4233o8();
            c4233o8.a(C4427z5.x, Boolean.valueOf(this.a.j())).a(C4427z5.G, Boolean.valueOf(this.a.m())).a(C4427z5.v, this.a.g()).a(C4427z5.w, V9.a(this.a)).a(C4427z5.I, Long.valueOf(N.a.b(this.a.e())));
            C4322t8.a(C4096ge.h, c4233o8.a());
            C4197m8.e eVar2 = C4197m8.e.Banner;
            O9 o9 = O9.this;
            if (eVar == eVar2) {
                o9.a.a(o9.b, o9.c, a, (InterfaceC4247p4) o9);
                O9 o92 = O9.this;
                o92.a.a(a, this.b, (InterfaceC4247p4) o92);
            } else {
                o9.a.a(o9.b, o9.c, a, (InterfaceC4265q4) o9);
                O9 o93 = O9.this;
                o93.a.b(a, this.b, o93);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements Runnable {
        final /* synthetic */ Q4 a;
        final /* synthetic */ Map b;

        public g(Q4 q4, Map map) {
            this.a = q4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            O9 o9 = O9.this;
            o9.a.a(this.a, this.b, (InterfaceC4265q4) o9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements Runnable {
        final /* synthetic */ J9 a;

        public h(J9 j9) {
            this.a = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4197m8.e eVar = this.a.i() ? C4197m8.e.Banner : C4197m8.e.Interstitial;
            Q4 a = O9.this.d.a(eVar, this.a);
            C4233o8 c4233o8 = new C4233o8();
            c4233o8.a(C4427z5.x, Boolean.valueOf(this.a.j())).a(C4427z5.v, this.a.g()).a(C4427z5.w, V9.a(this.a)).a("isMultipleAdObjects", Boolean.valueOf(this.a.l()));
            C4322t8.a(C4096ge.m, c4233o8.a());
            if (eVar == C4197m8.e.Banner) {
                O9.this.a.a(a);
            } else {
                a.a(false);
                O9.this.a.b(a);
            }
        }
    }

    public O9(String str, String str2, Context context) {
        this.b = str;
        this.c = str2;
        c(context);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C4020ca.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C4437zf(SDKUtils.getNetworkConfiguration().optJSONObject(U3.a.k)));
            C4020ca.e().d(SDKUtils.getSDKVersion());
            this.d = new R4();
            X3 x3 = new X3();
            this.g = x3;
            if (context instanceof Activity) {
                x3.a((Activity) context);
            }
            int debugMode = this.h.getDebugMode();
            this.e = new C4219nc();
            this.a = new com.ironsource.sdk.controller.e(context, this.g, this.d, O7.a, debugMode, this.h.getDataManagerConfig(), this.b, this.c, this.e);
            Logger.enableLogging(debugMode);
            Logger.i(m, "C'tor");
            a(context);
            this.e.d();
            this.e.e();
            this.e.a(context);
            this.e.b();
            this.e.a();
            this.e.c();
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.W9
    public void a(J9 j9, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put(U3.i.y0, String.valueOf(currentTimeMillis));
        N.a.a(j9.e(), currentTimeMillis);
        C4233o8 c4233o8 = new C4233o8();
        c4233o8.a(C4427z5.x, Boolean.valueOf(j9.j())).a(C4427z5.G, Boolean.valueOf(j9.m())).a(C4427z5.v, j9.g()).a(C4427z5.w, V9.a(j9)).a(C4427z5.I, Long.valueOf(currentTimeMillis));
        C4322t8.a(C4096ge.f, c4233o8.a());
        Logger.d(m, "loadAd " + j9.e());
        P p = new P(j9);
        this.j.a(p);
        this.j.a(new JSONObject(map), EnumC4225o0.LOAD_REQUEST, p.c());
        if (c(j9)) {
            this.i.a(new C4097gf(p));
        }
        if (j9.k()) {
            c(j9, map);
        } else {
            b(j9, map);
        }
    }

    @Override // com.ironsource.W9
    public void b(J9 j9) {
        Logger.d(m, "destroyInstance " + j9.e());
        if (c(j9)) {
            this.j.a(EnumC4225o0.DESTROYED, j9.e());
            this.i.a(new C4079ff(this.k.a(j9.e())));
        }
        this.a.a(new h(j9));
    }

    @Override // com.ironsource.InterfaceC4265q4
    public void d(String str, String str2) {
        Q4 d2 = d(C4197m8.e.Interstitial, str);
        if (d2 != null) {
            J9 c2 = d2.c();
            this.j.a(EnumC4225o0.SHOW_FAIL, c2.e());
            if (c(c2)) {
                this.i.a(new Cif(this.k.a(c2.e())));
            }
            Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.Mc
    public void e(Activity activity) {
        this.g.a(activity);
        this.a.g();
        this.a.b(activity);
    }

    @Override // com.ironsource.InterfaceC4265q4
    public void onInterstitialAdRewarded(String str, int i) {
        Q4 d2 = d(C4197m8.e.Interstitial, str);
        Jc b2 = b(d2);
        if (d2 == null || b2 == null) {
            return;
        }
        b2.onInterstitialAdRewarded(str, i);
    }

    private O9(Context context, int i) {
        c(context);
    }

    private Q4 d(C4197m8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.ironsource.Mc
    public void d(Activity activity) {
        try {
            this.a.e();
            this.a.a((Context) activity);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static synchronized O9 b(Context context) throws Exception {
        O9 a2;
        synchronized (O9.class) {
            a2 = a(context, 0);
        }
        return a2;
    }

    private Jc b(Q4 q4) {
        if (q4 == null) {
            return null;
        }
        return (Jc) q4.i();
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.a.a(new d(optString));
    }

    @Override // com.ironsource.InterfaceC4132ie, com.ironsource.U9
    public void b(Activity activity) {
        if (this.f) {
            return;
        }
        d(activity);
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void b(C4197m8.e eVar, String str) {
        Jc b2;
        Q4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4197m8.e.RewardedVideo) {
                Oc c2 = c(d2);
                if (c2 != null) {
                    c2.d();
                    return;
                }
                return;
            }
            if (eVar != C4197m8.e.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialClose();
        }
    }

    @Override // com.ironsource.InterfaceC4282r4
    public void b(String str, String str2) {
        Oc c2;
        Q4 d2 = d(C4197m8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(str2);
    }

    @Override // com.ironsource.InterfaceC4265q4
    public void b(String str) {
        Q4 d2 = d(C4197m8.e.Interstitial, str);
        if (d2 != null) {
            J9 c2 = d2.c();
            this.j.a(EnumC4225o0.SHOW_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new C4150jf(this.k.a(c2.e())));
            }
            Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.W9
    public void b(Activity activity, J9 j9, Map<String, String> map) {
        if (Ib.a0().h().k()) {
            this.g.a(activity);
        }
        a(j9, map);
    }

    private void b(J9 j9, Map<String, String> map) {
        Logger.d(m, "loadOnNewInstance " + j9.e());
        this.a.a(new f(j9, map));
    }

    private Oc c(Q4 q4) {
        if (q4 == null) {
            return null;
        }
        return (Oc) q4.i();
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void c(JSONObject jSONObject) {
        this.a.a(new e(jSONObject));
    }

    @Override // com.ironsource.InterfaceC4132ie, com.ironsource.U9
    public void c(Activity activity) {
        try {
            Logger.i(m, "release()");
            V4.g();
            this.g.b();
            this.a.a((Context) activity);
            this.a.a();
            this.a = null;
        } catch (Exception e2) {
            C4157k4.d().a(e2);
        }
        n = null;
    }

    public static U9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    @Override // com.ironsource.InterfaceC4282r4
    public void c(String str) {
        Oc c2;
        Q4 d2 = d(C4197m8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.c();
    }

    public static synchronized U9 a(String str, String str2, Context context) {
        O9 o9;
        synchronized (O9.class) {
            o9 = n;
            if (o9 == null) {
                C4322t8.a(C4096ge.a);
                o9 = new O9(str, str2, context);
                n = o9;
            }
        }
        return o9;
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void c(C4197m8.e eVar, String str) {
        Oc c2;
        Q4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4197m8.e.Interstitial) {
                Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C4197m8.e.RewardedVideo || (c2 = c(d2)) == null) {
                return;
            }
            c2.b();
        }
    }

    public static synchronized O9 a(Context context, int i) throws Exception {
        O9 o9;
        synchronized (O9.class) {
            Logger.i(m, "getInstance()");
            o9 = n;
            if (o9 == null) {
                o9 = new O9(context, i);
                n = o9;
            }
        }
        return o9;
    }

    @Override // com.ironsource.U9
    public com.ironsource.sdk.controller.e a() {
        return this.a;
    }

    private Hc a(Q4 q4) {
        if (q4 == null) {
            return null;
        }
        return (Hc) q4.i();
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void a(String str, String str2, String str3, Map<String, String> map, Oc oc) {
        this.b = str;
        this.c = str2;
        this.a.a(new a(str, str2, this.d.a(C4197m8.e.RewardedVideo, str3, map, oc)));
    }

    @Override // com.ironsource.InterfaceC4247p4
    public void c(String str, String str2) {
        Hc a2;
        Q4 d2 = d(C4197m8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadFail(str2);
    }

    private void c(J9 j9, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            C4233o8 a2 = new C4233o8().a(C4427z5.A, e2.getMessage()).a(C4427z5.x, Boolean.valueOf(j9.j())).a(C4427z5.G, Boolean.valueOf(j9.m())).a(C4427z5.v, j9.g()).a(C4427z5.w, V9.a(j9)).a(C4427z5.I, Long.valueOf(N.a.b(j9.e())));
            N.a.a(j9.e());
            C4322t8.a(C4096ge.k, a2.a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(j9, map);
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void a(JSONObject jSONObject) {
        this.a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void a(String str, String str2, String str3, Map<String, String> map, Jc jc) {
        this.b = str;
        this.c = str2;
        this.a.a(new c(str, str2, this.d.a(C4197m8.e.Interstitial, str3, map, jc)));
    }

    @Override // com.ironsource.InterfaceC4132ie
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // com.ironsource.InterfaceC4132ie, com.ironsource.U9
    public void a(Activity activity) {
        if (this.f) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void a(C4197m8.e eVar, String str, Z0 z0) {
        Hc a2;
        Q4 d2 = d(eVar, str);
        if (d2 != null) {
            d2.b(2);
            if (eVar == C4197m8.e.RewardedVideo) {
                Oc c2 = c(d2);
                if (c2 != null) {
                    c2.a(z0);
                    return;
                }
                return;
            }
            if (eVar == C4197m8.e.Interstitial) {
                Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C4197m8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerInitSuccess();
        }
    }

    public boolean c(J9 j9) {
        return j9.l() && !j9.i() && a(j9);
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void a(C4197m8.e eVar, String str, String str2) {
        Hc a2;
        Q4 d2 = d(eVar, str);
        C4233o8 a3 = new C4233o8().a(C4427z5.v, str).a(C4427z5.w, eVar).a(C4427z5.A, str2);
        if (d2 != null) {
            N n2 = N.a;
            a3.a(C4427z5.I, Long.valueOf(n2.b(d2.h())));
            a3.a(C4427z5.x, Boolean.valueOf(C4340u8.a(d2)));
            n2.a(d2.h());
            d2.b(3);
            if (eVar == C4197m8.e.RewardedVideo) {
                Oc c2 = c(d2);
                if (c2 != null) {
                    c2.b(str2);
                }
            } else if (eVar == C4197m8.e.Interstitial) {
                Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C4197m8.e.Banner && (a2 = a(d2)) != null) {
                a2.onBannerLoadFail(str2);
            }
        }
        C4322t8.a(C4096ge.i, a3.a());
    }

    @Override // com.ironsource.InterfaceC4282r4
    public void a(String str, int i) {
        Oc c2;
        Q4 d2 = d(C4197m8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(i);
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void a(C4197m8.e eVar, String str) {
        Hc a2;
        Q4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4197m8.e.RewardedVideo) {
                Oc c2 = c(d2);
                if (c2 != null) {
                    c2.a();
                    return;
                }
                return;
            }
            if (eVar == C4197m8.e.Interstitial) {
                Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C4197m8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC4229o4
    public void a(C4197m8.e eVar, String str, String str2, JSONObject jSONObject) {
        Hc a2;
        Q4 d2 = d(eVar, str);
        if (d2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + d2.f());
            if (eVar == C4197m8.e.Interstitial) {
                Jc b2 = b(d2);
                if (b2 != null) {
                    jSONObject.put("demandSourceName", str);
                    b2.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C4197m8.e.RewardedVideo) {
                Oc c2 = c(d2);
                if (c2 != null) {
                    jSONObject.put("demandSourceName", str);
                    c2.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C4197m8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                a2.onBannerShowSuccess();
            }
        } catch (JSONException e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4265q4
    public void a(String str, JSONObject jSONObject) {
        C4197m8.e eVar = C4197m8.e.Interstitial;
        Q4 d2 = d(eVar, str);
        C4233o8 a2 = new C4233o8().a(C4427z5.v, str);
        if (d2 != null) {
            J9 c2 = d2.c();
            this.j.a(jSONObject, EnumC4225o0.LOAD_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new C4115hf(this.k.a(c2.e())));
            }
            C4233o8 a3 = a2.a(C4427z5.w, C4340u8.a(d2, eVar)).a(C4427z5.x, Boolean.valueOf(C4340u8.a(d2)));
            N n2 = N.a;
            a3.a(C4427z5.I, Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadSuccess(d2.c());
            }
        }
        C4322t8.a(C4096ge.l, a2.a());
    }

    @Override // com.ironsource.InterfaceC4265q4
    public void a(String str, String str2) {
        Object obj;
        C4197m8.e eVar = C4197m8.e.Interstitial;
        Q4 d2 = d(eVar, str);
        C4233o8 c4233o8 = new C4233o8();
        c4233o8.a(C4427z5.A, str2).a(C4427z5.v, str);
        if (d2 != null) {
            C4233o8 a2 = c4233o8.a(C4427z5.w, C4340u8.a(d2, eVar));
            if (d2.e() == 2) {
                obj = C4427z5.E;
            } else {
                obj = C4427z5.F;
            }
            C4233o8 a3 = a2.a(C4427z5.y, obj).a(C4427z5.x, Boolean.valueOf(C4340u8.a(d2)));
            N n2 = N.a;
            a3.a(C4427z5.I, Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadFailed(str2);
            }
        }
        C4322t8.a(C4096ge.g, c4233o8.a());
    }

    @Override // com.ironsource.InterfaceC4132ie
    public void a(String str, String str2, int i) {
        C4197m8.e productType;
        Q4 a2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a2 = this.d.a(productType, str2)) == null) {
            return;
        }
        a2.c(i);
    }

    @Override // com.ironsource.InterfaceC4247p4
    public void a(String str, C4036d8 c4036d8) {
        Hc a2;
        Q4 d2 = d(C4197m8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadSuccess(d2.c(), c4036d8);
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.W9
    public void a(Activity activity, J9 j9, Map<String, String> map) {
        this.g.a(activity);
        Logger.i(m, "showAd " + j9.e());
        Q4 a2 = this.d.a(C4197m8.e.Interstitial, j9.e());
        if (a2 == null) {
            return;
        }
        this.a.a(new g(a2, map));
    }

    @Override // com.ironsource.W9
    public boolean a(J9 j9) {
        Logger.d(m, "isAdAvailable " + j9.e());
        Q4 a2 = this.d.a(C4197m8.e.Interstitial, j9.e());
        if (a2 == null) {
            return false;
        }
        return a2.d();
    }

    public void a(Context context) {
        this.f = false;
        Boolean c2 = this.l.c(U3.a.g);
        if (c2 == null) {
            c2 = Boolean.FALSE;
        }
        boolean booleanValue = c2.booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C4117i(this));
            } catch (Throwable th) {
                C4157k4.d().a(th);
                C4233o8 c4233o8 = new C4233o8();
                c4233o8.a(C4427z5.y, th.getMessage());
                C4322t8.a(C4096ge.u, c4233o8.a());
            }
        }
    }
}
