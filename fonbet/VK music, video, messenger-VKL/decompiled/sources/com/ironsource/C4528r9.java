package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;

/* renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C4528r9 {
    private static final String a = "IntegrationHelper";
    private static final String b = "getNetworkSDKVersion";
    private static final String c = "getAdapterSDKVersion";
    private static final String d = "getAdapterVersion";
    private static final String e = "getVersion";

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
                    TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().b(this.a));
                } else {
                    Log.e(C4528r9.a, "Google Play Services - MISSING");
                }
            } catch (Exception e) {
                C4452n4.d().a(e);
                Log.e(C4528r9.a, "Google Play Services - MISSING");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:5|(2:7|(8:9|10|11|12|13|14|15|16)(1:28))(1:30))(1:31)|11|12|13|14|15|16|(2:(0)|(1:21))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r0 = r0.getConstructor(null).newInstance(null);
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
                    str2 = "facebook";
                }
                Class<?> cls2 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance2 = cls2.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance2);
                a(newInstance2);
                return true;
            } catch (ClassNotFoundException e2) {
                C4452n4.d().a(e2);
                Log.e(a, "Adapter - MISSING");
                return false;
            } catch (Exception e3) {
                C4452n4.d().a(e3);
                Log.e(a, "Failed to instantiate adapter");
                return false;
            }
            lowerCase.equals(str2);
        } catch (Exception e4) {
            C4452n4.d().a(e4);
            Log.e(a, "isAdapterValid " + str, e4);
            return false;
        }
    }

    public static void b(Context context) {
        c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", O6.H1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.getClass();
                switch (lowerCase) {
                    case "vungle":
                    case "admob":
                    case "facebook":
                        break;
                    default:
                        Log.e(a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                StringUtils.toLowerCase(str).getClass();
            }
        }
        a(context);
    }

    private static void c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) != 0) {
            Log.e(a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            return;
        }
        Log.e(a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
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
            C4452n4.d().a(e2);
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
        } catch (Exception e2) {
            C4452n4.d().a(e2);
        }
    }
}
