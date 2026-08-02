package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.os.StatFs;
import android.webkit.WebView;
import com.appsflyer.AppsFlyerLib;
import com.blaze.gam.BlazeGAM;
import com.blaze.ima.BlazeIMA;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.sofascore.local_persistance.UserAccount;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vungle.ads.VunglePrivacySettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ia0 extends x0 implements si3, zih {
    public static ia0 q;
    public static Boolean r;
    public boolean b;
    public boolean c;
    public ab9 d;
    public y65 e;
    public y65 f;
    public y65 g;
    public ti6 h;
    public bfk i;
    public y65 j;
    public v38 k;
    public SharedPreferences l;
    public y65 n;
    public y65 o;
    public final mqi m = ypa.b(new w90(this, 0));
    public final x90 p = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: x90
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            ia0 ia0Var = ia0.this;
            if (str != null) {
                switch (str.hashCode()) {
                    case -705786804:
                        if (!str.equals("PREF_PROVIDER_ODDS_ENABLE")) {
                            return;
                        }
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies") && sharedPreferences.getInt(str, -1) == 0) {
                            boolean z = dg0.a;
                            dg0.c = true;
                            if (dg0.b && dg0.c) {
                                AppsFlyerLib.getInstance().start();
                            }
                            ia0Var.i();
                            return;
                        }
                        return;
                    case 1218895378:
                        if (str.equals(AndroidTcfDataSource.TCF_TCSTRING_KEY) && sharedPreferences.getString(str, null) != null) {
                            boolean z2 = dg0.a;
                            dg0.c = true;
                            if (dg0.b && dg0.c) {
                                AppsFlyerLib.getInstance().start();
                            }
                            ia0Var.i();
                            return;
                        }
                        return;
                    case 1516498368:
                        if (!str.equals("PREF_ODDS")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                ad2 ad2Var = qv5.a;
                qv5.a(t42.a);
            }
        }
    };

    @Override // defpackage.zih
    public final apf a(Context context) {
        context.getClass();
        y65 y65Var = this.g;
        if (y65Var == null) {
            Intrinsics.i("sofaOkHttpClient");
            throw null;
        }
        boolean a = y05.a(this);
        vng vngVar = new vng(context);
        rl6 rl6Var = (rl6) vngVar.f;
        uha uhaVar = s18.a;
        g gVar = g.a;
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        File i = d28.i(cacheDir, "image_cache");
        String str = uae.b;
        uae k = tnf.k(i);
        long j = 10485760;
        try {
            File file = k.toFile();
            file.mkdir();
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = llf.e((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
        } catch (Exception unused) {
        }
        vngVar.d = new j3a(new sof(j, k, uhaVar, gVar));
        sl6 sl6Var = st9.a;
        sl6 sl6Var2 = vt9.a;
        rl6Var.a(vt9.a, new g24(200));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i2 = 21;
        arrayList4.add(new ix1(i2, new z9d(new xxb(new e6g(y65Var, 24), 18), new b7h(22), 12), duf.a.getOrCreateKotlinClass(eek.class)));
        vngVar.e = new ic3(fcp.n0(arrayList), fcp.n0(arrayList2), fcp.n0(arrayList3), fcp.n0(arrayList4), fcp.n0(arrayList5));
        if (a) {
            rl6Var.a(vt9.b, Bitmap.Config.ARGB_4444);
            vngVar.c = ypa.b(new k9f(context, 11));
        } else {
            rl6Var.a(vt9.b, Bitmap.Config.ARGB_8888);
        }
        return vngVar.o();
    }

    public final ti6 c() {
        ti6 ti6Var = this.h;
        if (ti6Var != null) {
            return ti6Var;
        }
        Intrinsics.i("experimentManager");
        throw null;
    }

    public final y65 d() {
        y65 y65Var = this.n;
        if (y65Var != null) {
            return y65Var;
        }
        Intrinsics.i("natsLogger");
        throw null;
    }

    public final UserAccount e() {
        return g().b();
    }

    public final bfk g() {
        bfk bfkVar = this.i;
        if (bfkVar != null) {
            return bfkVar;
        }
        Intrinsics.i("userAccountManager");
        throw null;
    }

    public final udl h() {
        y65 y65Var = this.e;
        if (y65Var == null) {
            Intrinsics.i("workersCacheProvider");
            throw null;
        }
        Object obj = y65Var.get();
        obj.getClass();
        return (udl) obj;
    }

    public final void i() {
        boolean z;
        if (t62.a == null) {
            synchronized (t62.b) {
                try {
                    if (t62.a == null) {
                        r38 c = r38.c();
                        c.a();
                        t62.a = FirebaseAnalytics.getInstance(c.a);
                    }
                    Unit unit = Unit.a;
                } finally {
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = t62.a;
        firebaseAnalytics.getClass();
        m38 m38Var = m38.a;
        m38 m = zic.m(this, 1);
        m38 m2 = zic.m(this, 1, 7);
        m38 m3 = zic.m(this, 3, 4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        n38 n38Var = n38.a;
        linkedHashMap.put(n38Var, m);
        n38 n38Var2 = n38.b;
        linkedHashMap.put(n38Var2, m38Var);
        n38 n38Var3 = n38.c;
        linkedHashMap.put(n38Var3, m2);
        n38 n38Var4 = n38.d;
        linkedHashMap.put(n38Var4, m3);
        Bundle bundle = new Bundle();
        m38 m38Var2 = (m38) linkedHashMap.get(n38Var);
        if (m38Var2 != null) {
            int ordinal = m38Var2.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        m38 m38Var3 = (m38) linkedHashMap.get(n38Var2);
        if (m38Var3 != null) {
            int ordinal2 = m38Var3.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        m38 m38Var4 = (m38) linkedHashMap.get(n38Var3);
        if (m38Var4 != null) {
            int ordinal3 = m38Var4.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        m38 m38Var5 = (m38) linkedHashMap.get(n38Var4);
        if (m38Var5 != null) {
            int ordinal4 = m38Var5.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        zzez zzezVar = firebaseAnalytics.a;
        zzezVar.getClass();
        zzezVar.c(new wyn(zzezVar, bundle, 1));
        if (Intrinsics.c(ok3.p().e().getDataSharingOptOut(), Boolean.TRUE) || y05.a(this)) {
            return;
        }
        if (bea.b) {
            z = true;
        } else {
            try {
                z = WebView.getCurrentWebViewPackage() != null;
                bea.b = z;
            } catch (Exception unused) {
                z = false;
            }
        }
        if (z) {
            if (zic.u(this) == 1) {
                VunglePrivacySettings.setGDPRStatus(zic.z(this), "v1.0.0");
            }
            VunglePrivacySettings.setCOPPAStatus(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, zic.z(this));
                jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, String.valueOf(zic.u(this)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            JSONObject jSONObject2 = xx9.a;
            if (InMobiSdk.isSDKInitialized()) {
                InMobiSdk.updateGDPRConsent(jSONObject);
            }
            xx9.a = jSONObject;
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            mBridgeSDK.setConsentStatus(this, zic.z(this) ? 1 : 0);
            mBridgeSDK.setCoppaStatus(this, false);
            new Thread(new y2(this, 5)).start();
        }
    }

    public final void j(boolean z) {
        if (z) {
            boolean z2 = true;
            if (!bea.b) {
                try {
                    if (WebView.getCurrentWebViewPackage() == null) {
                        z2 = false;
                    }
                    bea.b = z2;
                } catch (Exception unused) {
                    z2 = false;
                }
            }
            if (z2) {
                BlazeIMA.INSTANCE.enableAds(new km9(this));
                BlazeGAM blazeGAM = BlazeGAM.INSTANCE;
                blazeGAM.enableCustomNativeAds(this, null, new f94(this));
                blazeGAM.enableBannerAds(this, new t9d(this));
                return;
            }
        }
        BlazeIMA.INSTANCE.disableAds();
        BlazeGAM blazeGAM2 = BlazeGAM.INSTANCE;
        blazeGAM2.disableCustomNativeAds();
        blazeGAM2.disableBannerAds();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Calendar calendar = ke0.a;
        ke0.e(this);
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("BASE_URL_v4", "api.sofascore.com/");
        if (string == null) {
            string = "api.sofascore.com/";
        }
        uaa.c = string;
        ArrayList c = dla.c(this);
        ArrayList arrayList = new ArrayList(k13.r(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            arrayList.add(ULocale.forLanguageTag(dla.f((String) it.next())));
        }
        int i = 0;
        dla.d = (ULocale[]) arrayList.toArray(new ULocale[0]);
        registerComponentCallbacks(new cla());
        yea yeaVar = j58.a;
        e58.f().getClass();
        hs4 hs4Var = z45.a;
        rq3 rq3Var = null;
        b(hq4.c, new fa0(this, rq3Var, i));
        q = this;
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        r = sharedPreferences2.contains("PREF_NOTIFICATION_STATUS_ON_LAST_SYNC") ? Boolean.valueOf(sharedPreferences2.getBoolean("PREF_NOTIFICATION_STATUS_ON_LAST_SYNC", false)) : null;
        b(z45.a, new ga0(this, rq3Var, i));
        vfj.a(this, new t21(this, 9));
        b8f b8fVar = b8f.i;
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(h52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(hda.E(b8fVar), null, null, new ea0(b8fVar, (b1d) obj, null, this, 0), 3);
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(o42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(b8fVar.getLifecycle()), null, null, new ea0(b8fVar, (b1d) obj2, null, this, 1), 3);
        b8fVar.f.a(new ha0(this));
    }
}
