package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5547a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        g(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(boolean z5, boolean z7, String str, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        if (z5) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.k d(Intent intent, String str) {
        if (intent != null) {
            com.android.billingclient.api.j a7 = com.android.billingclient.api.k.a();
            a7.f4033a = a(intent.getExtras(), str);
            a7.f4034b = e(intent.getExtras(), str);
            return a7.a();
        }
        g("BillingHelper", "Got null intent!");
        com.android.billingclient.api.j a10 = com.android.billingclient.api.k.a();
        a10.f4033a = 6;
        a10.f4034b = "An internal error occurred.";
        return a10.a();
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        g(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i5 = 40000;
            while (!str2.isEmpty() && i5 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i5));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i5 -= min;
            }
        }
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            io.sentry.android.core.w0.m(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    io.sentry.android.core.w0.m(str, str2);
                } else {
                    io.sentry.android.core.w0.n(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle i(com.android.billingclient.api.k kVar, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", kVar.f4037a);
        bundle.putString("DEBUG_MESSAGE", kVar.f4038b);
        bundle.putInt("LOG_REASON", i5 - 1);
        return bundle;
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e7) {
            g("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e7.toString()));
            return null;
        }
    }
}
