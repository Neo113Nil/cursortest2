package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4287r9 {
    private static final String a = "IntegrationHelper";
    private static final String b = "getNetworkSDKVersion";
    private static final String c = "getAdapterSDKVersion";
    private static final String d = "getAdapterVersion";
    private static final String e = "getVersion";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.r9$a */
    public class a extends Thread {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    TextUtils.isEmpty(com.ironsource.mediationsdk.p.g().b(this.a));
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:5|(2:7|(8:9|10|11|12|13|14|15|16)(1:28))(1:30))(1:31)|11|12|13|14|15|16|(2:(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r4 = r4.getConstructor(null).newInstance(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(Context context, String str) {
        String str2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int hashCode = lowerCase.hashCode();
            try {
                if (hashCode == -805296079) {
                    str2 = "vungle";
                } else if (hashCode == 92668925) {
                    str2 = InneractiveMediationNameConsts.ADMOB;
                } else {
                    if (hashCode != 497130182) {
                        Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                        Object newInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                        b(newInstance);
                        a(newInstance);
                        return true;
                    }
                    str2 = Payload.SOURCE_FACEBOOK;
                }
                Class<?> cls2 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance2 = cls2.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance2);
                a(newInstance2);
                return true;
            } catch (ClassNotFoundException e2) {
                C4157k4.d().a(e2);
                return false;
            } catch (Exception e3) {
                C4157k4.d().a(e3);
                return false;
            }
            lowerCase.equals(str2);
        } catch (Exception e4) {
            C4157k4.d().a(e4);
            return false;
        }
    }

    public static void b(Context context) {
        c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", MolocoMediationAdapter.MEDIATION_PLATFORM_NAME, "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", L6.H1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (a(context, str)) {
                StringUtils.toLowerCase(str).getClass();
            } else {
                StringUtils.toLowerCase(str).getClass();
            }
        }
        a(context);
    }

    private static void c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.checkPermission("android.permission.INTERNET", context.getPackageName());
        packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName());
    }

    private static void b(Object obj) {
        String str;
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof LevelPlayBaseAdapter) {
                str = b;
            } else {
                str = c;
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
        } catch (Exception e2) {
            C4157k4.d().a(e2);
        }
    }
}
