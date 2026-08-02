package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.C4427z5;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.a3;
import com.vungle.ads.internal.model.b3;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.model.g1;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.j1;
import com.vungle.ads.internal.model.l0;
import com.vungle.ads.internal.model.m1;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.s1;
import com.vungle.ads.internal.model.t0;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.w0;
import com.vungle.ads.internal.model.z0;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bea;
import defpackage.cga;
import defpackage.d2g;
import defpackage.duf;
import defpackage.epf;
import defpackage.eq3;
import defpackage.h2g;
import defpackage.i2g;
import defpackage.igf;
import defpackage.iod;
import defpackage.joa;
import defpackage.jod;
import defpackage.p7a;
import defpackage.q7a;
import defpackage.q89;
import defpackage.qfa;
import defpackage.qff;
import defpackage.qzf;
import defpackage.sha;
import defpackage.t3g;
import defpackage.vuj;
import defpackage.wzf;
import defpackage.x52;
import defpackage.xzf;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzf;
import defpackage.zdc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "com/vungle/ads/internal/network/u", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class VungleApiClient {

    @Keep
    @NotNull
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @Keep
    private static final boolean interceptorEnabled = false;
    public final Context a;
    public final com.vungle.ads.internal.platform.f b;
    public final FilePreferences c;
    public c0 d;
    public c0 e;
    public b3 f;
    public i0 g;
    public l0 h;
    public String i;
    public Boolean j;
    public final joa k;
    public ConcurrentHashMap l;
    public q7a m;

    @Keep
    @NotNull
    private static final Set<q7a> networkInterceptors = new HashSet();

    @Keep
    @NotNull
    private static final Set<q7a> logInterceptors = new HashSet();
    public static final yea n = cga.c(s.a);

    public VungleApiClient(Context context, com.vungle.ads.internal.platform.f fVar, FilePreferences filePreferences) {
        context.getClass();
        fVar.getClass();
        filePreferences.getClass();
        this.a = context;
        this.b = fVar;
        this.c = filePreferences;
        this.i = System.getProperty("http.agent");
        this.k = ypa.a(ysa.a, new a0(context));
        this.l = new ConcurrentHashMap();
        this.m = new t3g(this, 3);
        iod iodVar = new iod();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        iodVar.d(60L, timeUnit);
        iodVar.c(60L, timeUnit);
        iodVar.a(this.m);
        v vVar = new v();
        if (vVar != iodVar.n) {
            iodVar.E = null;
        }
        iodVar.n = vVar;
        if (interceptorEnabled) {
            Iterator<q7a> it = logInterceptors.iterator();
            while (it.hasNext()) {
                iodVar.a(it.next());
            }
            Iterator<q7a> it2 = networkInterceptors.iterator();
            while (it2.hasNext()) {
                iodVar.b(it2.next());
            }
        }
        jod jodVar = new jod(iodVar);
        iodVar.c.add(new u());
        jod jodVar2 = new jod(iodVar);
        this.e = new c0(jodVar);
        this.d = new c0(jodVar2);
    }

    public static s1 c(boolean z) {
        String value;
        s1 s1Var = new s1(null, null, null, null, null);
        PrivacyManager.INSTANCE.getClass();
        String b = PrivacyManager.b();
        String str = PrivacyManager.e;
        if (str == null) {
            str = "no_interaction";
        }
        String str2 = str;
        String str3 = PrivacyManager.f;
        String str4 = str3 == null ? "" : str3;
        Long l = PrivacyManager.g;
        s1Var.a = new g1(l != null ? l.longValue() : 0L, b, str2, str4);
        PrivacyConsent privacyConsent = PrivacyManager.h;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            value = PrivacyConsent.UNKNOWN.getValue();
        }
        s1Var.b = new w0(value);
        if (PrivacyManager.c() != COPPA.COPPA_NOTSET) {
            s1Var.c = new z0(PrivacyManager.c().getValue());
        }
        if (PrivacyManager.f()) {
            SharedPreferences sharedPreferences = PrivacyManager.j;
            String string = sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
            s1Var.e = new j1(string != null ? string : "");
        }
        if (z) {
            s1Var.d = VungleAds.firstPartyData;
        }
        return s1Var;
    }

    public final synchronized b3 a(boolean z) {
        b3 a;
        String str;
        try {
            b3 b3Var = this.f;
            if (b3Var == null) {
                b3Var = a(this.a);
                this.f = b3Var;
            }
            a = b3.a(b3Var);
            a3 a3Var = new a3();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.a.getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            a.a(displayMetrics.heightPixels);
            a.b(displayMetrics.widthPixels);
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
            String a2 = i0Var.a();
            i0 i0Var2 = this.g;
            Boolean valueOf = i0Var2 != null ? Boolean.valueOf(i0Var2.b()) : null;
            PrivacyManager.INSTANCE.getClass();
            if (PrivacyManager.e()) {
                if (a2 != null) {
                    if ("Amazon".equals(Build.MANUFACTURER)) {
                        a3Var.a(a2);
                    } else {
                        a3Var.f(a2);
                    }
                    a.a(a2);
                } else {
                    a.a("");
                }
            }
            if (z || !PrivacyManager.e()) {
                a.a((String) null);
                a3Var.f(null);
                a3Var.a((String) null);
            }
            Boolean bool = Boolean.TRUE;
            boolean c = Intrinsics.c(valueOf, bool);
            boolean z2 = false;
            a.a(c ? 1 : 0);
            Boolean bool2 = this.j;
            if (bool2 == null) {
                bool2 = this.c.a("isPlaySvcAvailable");
                this.j = bool2;
            }
            if (bool2 == null) {
                bool2 = d();
                this.j = bool2;
            }
            a3Var.a(bool.equals(bool2));
            if (PrivacyManager.a() != 2) {
                String b = ((com.vungle.ads.internal.platform.c) this.b).b();
                if (b != null) {
                    a3Var.b(b);
                }
                Integer c2 = ((com.vungle.ads.internal.platform.c) this.b).c();
                if (c2 != null) {
                    a3Var.a(Integer.valueOf(c2.intValue()));
                }
            }
            Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    a3Var.a(intExtra / intExtra2);
                }
                int intExtra3 = registerReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra4 != 1 ? intExtra4 != 2 ? intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS" : "BATTERY_PLUGGED_USB" : "BATTERY_PLUGGED_AC";
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            a3Var.c(str);
            a3Var.a(((com.vungle.ads.internal.platform.c) this.b).l() ? 1 : 0);
            String b2 = b();
            if (b2 != null) {
                a3Var.d(b2);
            }
            String c3 = c();
            if (c3 != null) {
                a3Var.e(c3);
            }
            a3Var.i(Locale.getDefault().toString());
            a3Var.h(Locale.getDefault().getLanguage());
            a3Var.j(TimeZone.getDefault().getID());
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).k());
            a3Var.c(((com.vungle.ads.internal.platform.c) this.b).p() ? 1 : 0);
            boolean equals = "Amazon".equals(Build.MANUFACTURER);
            Context context = this.a;
            if (equals) {
                z2 = context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = context.getSystemService("uimode");
                systemService2.getClass();
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    z2 = true;
                }
            }
            a3Var.b(z2);
            this.b.getClass();
            a3Var.a();
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).n() ? 1 : 0);
            ConfigManager.INSTANCE.getClass();
            if (ConfigManager.p()) {
                a3Var.d(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).i()));
                a3Var.b(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).h()));
                a3Var.c(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).g()));
                a3Var.a(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).d()));
            }
            a3Var.g(((com.vungle.ads.internal.platform.c) this.b).f());
            a.b(this.i);
            a.a(a3Var);
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final m1 b(boolean z) {
        String a;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.c.getString("config_extension");
        }
        if (z) {
            try {
                a = ((com.vungle.ads.internal.signals.j) this.k.getValue()).a();
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Couldn't convert signals for sending. Error: ");
                a2.append(e.getMessage());
                com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            }
            if ((configExtension != null || configExtension.length() == 0) && (a == null || a.length() == 0)) {
                return null;
            }
            ConfigManager.INSTANCE.getClass();
            return new m1(configExtension, a, Long.valueOf(ConfigManager.a()));
        }
        a = null;
        if (configExtension != null) {
        }
        return null;
    }

    public final Boolean d() {
        Boolean bool;
        boolean z;
        try {
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
                googleApiAvailabilityLight.getClass();
                z = googleApiAvailabilityLight.b(this.a, GoogleApiAvailabilityLight.a) == 0;
                bool = Boolean.valueOf(z);
            } catch (NoClassDefFoundError unused) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Play services Not available");
                bool = Boolean.FALSE;
                try {
                    this.c.a(false, "isPlaySvcAvailable").b();
                } catch (Exception unused2) {
                    boolean z3 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("VungleApiClient", "Failure to write GPS availability to DB");
                }
                return bool;
            }
            try {
                this.c.a(z, "isPlaySvcAvailable").b();
                return bool;
            } catch (Exception unused3) {
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Unexpected exception from Play services lib.");
                return bool;
            }
        } catch (Exception unused4) {
            bool = null;
        }
    }

    public final void d(String str) {
        zdc zdcVar;
        str.getClass();
        c0 c0Var = this.e;
        xzf xzfVar = yzf.Companion;
        Regex regex = zdc.e;
        try {
            zdcVar = bea.v(C4427z5.M);
        } catch (IllegalArgumentException unused) {
            zdcVar = null;
        }
        xzfVar.getClass();
        c0Var.a(xzf.b(str, zdcVar)).a(new z());
    }

    public final long b(String str) {
        str.getClass();
        Long l = (Long) this.l.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String b() {
        if (eq3.b(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type != 9) {
                return "UNKNOWN";
            }
            return "ETHERNET";
        }
        return "NONE";
    }

    public final synchronized void c(String str) {
        PackageInfo packageInfo;
        try {
            str.getClass();
            d0.a(str);
            String str2 = "1.0";
            try {
                int i = Build.VERSION.SDK_INT;
                Context context = this.a;
                if (i >= 33) {
                    packageInfo = context.getPackageManager().getPackageInfo(this.a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    packageInfo.getClass();
                } else {
                    packageInfo = context.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                    packageInfo.getClass();
                }
                String str3 = packageInfo.versionName;
                str3.getClass();
                str2 = str3;
            } catch (Exception unused) {
            }
            d0.b(str2);
            this.f = a(this.a);
            String packageName = this.a.getPackageName();
            packageName.getClass();
            this.h = new l0(packageName, str2, str);
            this.j = d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String c() {
        if (eq3.b(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 1) {
            return "gprs";
        }
        if (subtype == 2) {
            return "edge";
        }
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                switch (subtype) {
                }
        }
        return "unknown";
    }

    public static String a(yzf yzfVar) {
        String str;
        p1 c;
        List a;
        x52 x52Var;
        try {
            yea yeaVar = n;
            try {
                x52Var = new x52();
            } catch (Exception unused) {
            }
            if (yzfVar != null) {
                yzfVar.writeTo(x52Var);
                str = x52Var.E0();
                c = ((t1) yeaVar.b(sha.Q(yeaVar.b, duf.b(t1.class)), str)).c();
                if (c == null && (a = c.a()) != null) {
                    String str2 = (String) a.get(0);
                    return str2 == null ? "" : str2;
                }
            }
            str = "";
            c = ((t1) yeaVar.b(sha.Q(yeaVar.b, duf.b(t1.class)), str)).c();
            return c == null ? "" : "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public final boolean a(String str) {
        str.getClass();
        Long l = (Long) this.l.get(str);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.l.remove(str);
        return false;
    }

    public final m a() {
        l0 l0Var = this.h;
        if (l0Var == null) {
            return null;
        }
        t1 t1Var = new t1(a(true), l0Var, c(false));
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.a;
        String str = BASE_URL;
        if (!com.vungle.ads.internal.util.n.a(str)) {
            str = BASE_URL;
        }
        if (!kotlin.text.c.n(str, "/", false)) {
            str = str.concat("/");
        }
        return this.e.b(d0.d(), str.concat("config"), t1Var);
    }

    public final m a(String str, VungleAdSize vungleAdSize) {
        str.getClass();
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        p1 p1Var = new p1(kotlin.collections.a.c(str), (Long) null, (String) null, (String) null, (String) null, (c1) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), adsEndpoint, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(String str, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        c1 c1Var;
        kotlinx.serialization.json.c cVar;
        str.getClass();
        ConfigManager.INSTANCE.getClass();
        String c = ConfigManager.c();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        if (vungleCSBData != null) {
            Map<String, String> extras = vungleCSBData.getExtras();
            if (extras != null) {
                if (extras.isEmpty()) {
                    extras = null;
                }
                if (extras != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        String key = entry.getKey();
                        kotlinx.serialization.json.d c2 = qfa.c(entry.getValue());
                        key.getClass();
                        c2.getClass();
                    }
                    cVar = new kotlinx.serialization.json.c(linkedHashMap);
                    c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), cVar != null ? cVar.toString() : null);
                }
            }
            cVar = null;
            c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), cVar != null ? cVar.toString() : null);
        } else {
            c1Var = null;
        }
        p1 p1Var = new p1(kotlin.collections.a.c(str), (Long) null, (String) null, (String) null, (String) null, c1Var, 62);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), c, a);
    }

    public final m a(p1 p1Var) {
        l0 l0Var;
        p1Var.getClass();
        ConfigManager.INSTANCE.getClass();
        String m = ConfigManager.m();
        if (m == null || m.length() == 0 || (l0Var = this.h) == null) {
            return null;
        }
        t1 t1Var = new t1(a(false), l0Var, c(false));
        t1Var.a(p1Var);
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        return this.e.c(d0.d(), m, t1Var);
    }

    public final c3 a(String str, Map map, String str2, g gVar, com.vungle.ads.internal.util.s sVar) {
        wzf wzfVar;
        d2g e;
        zdc zdcVar;
        str.getClass();
        gVar.getClass();
        if (!com.vungle.ads.internal.util.n.a(str)) {
            return new c3("Invalid URL", true, false, 4);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(str).getHost()) && URLUtil.isHttpUrl(str)) {
                return new c3("Clear Text Traffic is blocked", false, false, 6);
            }
            try {
                String str3 = this.i;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (str2 != null) {
                    xzf xzfVar = yzf.Companion;
                    Regex regex = zdc.e;
                    try {
                        zdcVar = bea.v(C4427z5.M);
                    } catch (IllegalArgumentException unused) {
                        zdcVar = null;
                    }
                    xzfVar.getClass();
                    wzfVar = xzf.b(str2, zdcVar);
                } else {
                    wzfVar = null;
                }
                o a = this.e.a(str4, str, gVar, map, wzfVar).a();
                if (a == null || !a.c()) {
                    Integer valueOf = (a == null || (e = a.e()) == null) ? null : Integer.valueOf(e.d);
                    if (CollectionsKt.R(kotlin.collections.b.j(Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE)), valueOf)) {
                        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, sVar, str, 2);
                    } else {
                        boolean z = valueOf != null && new IntRange(500, CommonGatewayClient.CODE_599, 1).d(valueOf.intValue());
                        StringBuilder sb = new StringBuilder("unsuccessful response, error code: ");
                        sb.append(valueOf);
                        sb.append(", message: ");
                        sb.append(a != null ? a.d() : null);
                        return new c3(sb.toString(), false, z, 2);
                    }
                }
                return null;
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new c3(localizedMessage, false, true, 2);
            }
        } catch (MalformedURLException e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new c3(localizedMessage2, true, false, 4);
        }
    }

    public final void a(LinkedBlockingQueue linkedBlockingQueue, com.vungle.ads.internal.y yVar) {
        zdc zdcVar;
        linkedBlockingQueue.getClass();
        yVar.getClass();
        ConfigManager.INSTANCE.getClass();
        String l = ConfigManager.l();
        if (l.length() == 0) {
            yVar.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            Sdk.SDKMetric.Builder builder = (Sdk.SDKMetric.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKMetric build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Metric: ");
            a2.append(build.getType());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue2.add(build);
        }
        Sdk.MetricBatch build2 = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue2).build();
        xzf xzfVar = yzf.Companion;
        Regex regex = zdc.e;
        try {
            zdcVar = bea.v(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused) {
            zdcVar = null;
        }
        byte[] byteArray = build2.toByteArray();
        byteArray.getClass();
        this.e.b(d0.d(), l, xzf.c(xzfVar, zdcVar, byteArray, 0, 12)).a(new y(yVar));
    }

    public final void a(LinkedBlockingQueue linkedBlockingQueue, com.vungle.ads.internal.x xVar) {
        zdc zdcVar;
        linkedBlockingQueue.getClass();
        xVar.getClass();
        ConfigManager.INSTANCE.getClass();
        String f = ConfigManager.f();
        if (f.length() == 0) {
            xVar.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            Sdk.SDKError.Builder builder = (Sdk.SDKError.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKError build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Error: ");
            a2.append(build.getReason());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue2.add(build);
        }
        Sdk.SDKErrorBatch build2 = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue2).build();
        xzf xzfVar = yzf.Companion;
        byte[] byteArray = build2.toByteArray();
        byteArray.getClass();
        Regex regex = zdc.e;
        try {
            zdcVar = bea.v(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused) {
            zdcVar = null;
        }
        int length = build2.toByteArray().length;
        xzfVar.getClass();
        this.e.a(d0.d(), f, xzf.a(zdcVar, byteArray, 0, length)).a(new x(xVar));
    }

    public final b3 a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str = Build.MANUFACTURER;
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String str3 = Build.VERSION.RELEASE;
        str3.getClass();
        b3 b3Var = new b3(str, str2, str3, com.vungle.ads.internal.platform.a.a(context), "Amazon".equals(str) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.i);
        try {
            String j = ((com.vungle.ads.internal.platform.c) this.b).j();
            this.i = j;
            b3Var.b(j);
            n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
            n2Var.e();
            ((com.vungle.ads.internal.platform.c) this.b).a(new w(this, n2Var));
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
            return b3Var;
        } catch (Exception e) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Cannot Get UserAgent. Setting Default Device UserAgent.");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a.toString());
            return b3Var;
        }
    }

    public final t1 a(boolean z, boolean z2) {
        t1 t1Var = new t1(a(false), this.h, c(z2), null, null);
        m1 b = b(z);
        if (b != null) {
            t1Var.d = b;
        }
        return t1Var;
    }

    public static final d2g a(VungleApiClient vungleApiClient, p7a p7aVar) {
        igf igfVar = vuj.C7;
        vungleApiClient.getClass();
        p7aVar.getClass();
        qzf qzfVar = ((epf) p7aVar).e;
        zdc zdcVar = null;
        try {
            try {
                d2g b = ((epf) p7aVar).b(qzfVar);
                String a = b.f.a(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (a == null || a.length() == 0) {
                    return b;
                }
                try {
                    long parseLong = Long.parseLong(a);
                    if (parseLong <= 0) {
                        return b;
                    }
                    String b2 = qzfVar.a.b();
                    long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                    if (!kotlin.text.c.n(b2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false)) {
                        return b;
                    }
                    String a2 = a(qzfVar.d);
                    if (a2.length() <= 0) {
                        return b;
                    }
                    vungleApiClient.l.put(a2, Long.valueOf(currentTimeMillis));
                    return b;
                } catch (Exception unused) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleApiClient", "Retry-After value is not an valid value");
                    return b;
                }
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
                a3.append(e.getMessage());
                a3.append(" for ");
                a3.append(qzfVar.a);
                com.vungle.ads.internal.util.t.b("VungleApiClient", a3.toString());
                h2g h2gVar = i2g.Companion;
                ArrayList arrayList = new ArrayList(20);
                qff qffVar = qff.HTTP_1_1;
                h2g h2gVar2 = i2g.Companion;
                Regex regex = zdc.e;
                try {
                    zdcVar = bea.v(C4427z5.M);
                } catch (IllegalArgumentException unused2) {
                }
                h2gVar2.getClass();
                return new d2g(qzfVar, qffVar, "Server is busy", 500, null, new q89((String[]) arrayList.toArray(new String[0])), h2g.b("{\"Error\":\"Server is busy\"}", zdcVar), null, null, null, null, 0L, 0L, null, igfVar);
            }
        } catch (OutOfMemoryError unused3) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a4 = com.iab.omid.library.vungle.internal.l.a("OOM for ");
            a4.append(qzfVar.a);
            com.vungle.ads.internal.util.t.b("VungleApiClient", a4.toString());
            i2g.Companion.getClass();
            return new d2g(qzfVar, qff.HTTP_1_1, "OOM", 500, null, new q89((String[]) new ArrayList(20).toArray(new String[0])), h2g.c(new byte[0], null), null, null, null, null, 0L, 0L, null, igfVar);
        }
    }
}
