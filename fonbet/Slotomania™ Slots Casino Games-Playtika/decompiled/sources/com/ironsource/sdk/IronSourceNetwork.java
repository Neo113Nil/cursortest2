package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C2556n4;
import com.ironsource.C2596p8;
import com.ironsource.C2703v8;
import com.ironsource.C2721w8;
import com.ironsource.C2739x8;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.Lc;
import com.ironsource.O9;
import com.ironsource.U9;
import com.ironsource.X9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceNetwork {
    static final String a = "IronSourceNetwork";
    private static U9 b;
    private static List<Lc> c = new ArrayList();
    private static X9 d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, String str3, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            D5 a2 = C2721w8.a(jSONObject);
            if (a2.a()) {
                C2703v8.a(a2, C2721w8.a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(Lc lc) {
        synchronized (IronSourceNetwork.class) {
            X9 x9 = d;
            if (x9 == null) {
                c.add(lc);
            } else if (x9.b()) {
                lc.onSuccess();
            } else {
                lc.onFail(d.a());
            }
        }
    }

    public static synchronized void destroyAd(J9 j9) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(j9);
        }
    }

    public static synchronized e getControllerManager() {
        e a2;
        synchronized (IronSourceNetwork.class) {
            a2 = b.a();
        }
        return a2;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        Context context2;
        String str3;
        String str4;
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e(a, "applicationKey is NULL");
                return;
            }
            if (b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    context2 = context;
                    str3 = str;
                    str4 = str2;
                } catch (Exception e) {
                    e = e;
                    context2 = context;
                    str3 = str;
                    str4 = str2;
                }
                try {
                    a(context2, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str4, str3, C2739x8.a(), map);
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    C2556n4.d().a(exc);
                    Logger.e(a, "Failed to init event tracker: " + exc.getMessage());
                    b = O9.a(context2, str3, str4);
                }
                b = O9.a(context2, str3, str4);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(J9 j9) {
        synchronized (IronSourceNetwork.class) {
            U9 u9 = b;
            if (u9 == null) {
                return false;
            }
            return u9.a(j9);
        }
    }

    public static synchronized void loadAd(J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(j9, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(activity, j9, map);
        }
    }

    public static void onPause(Activity activity) {
        U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.b(activity);
    }

    public static void onResume(Activity activity) {
        U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.a(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            U9 u9 = b;
            if (u9 == null) {
                return;
            }
            u9.c(activity);
        }
    }

    public static synchronized void showAd(Activity activity, J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(activity, j9, map);
        }
    }

    public static synchronized void updateInitFailed(C2596p8 c2596p8) {
        synchronized (IronSourceNetwork.class) {
            d = new X9(c2596p8);
            Iterator<Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c2596p8);
            }
            c.clear();
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            d = new X9();
            Iterator<Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            c.clear();
        }
    }

    private static synchronized void a() throws Exception {
        synchronized (IronSourceNetwork.class) {
            if (b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }
}
