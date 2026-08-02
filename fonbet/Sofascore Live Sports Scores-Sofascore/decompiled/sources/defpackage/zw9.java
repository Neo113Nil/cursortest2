package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.w;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class zw9 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static Boolean b;
    public static Boolean c;
    public static yw9 d;
    public static ld e;
    public static Intent f;
    public static Object g;
    public static int h;

    public static void a(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                string.getClass();
                str.getClass();
                hashMap.put(string, str);
                arrayList2.add(string);
            } catch (JSONException unused) {
            }
        }
        Object obj = g;
        lx9 lx9Var = lx9.a;
        LinkedHashMap linkedHashMap = null;
        if (!cw3.a.contains(lx9.class)) {
            try {
                LinkedHashMap j = lx9Var.j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!j.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                j.putAll(lx9Var.g(context, arrayList3, obj, z));
                linkedHashMap = j;
            } catch (Throwable th) {
                cw3.a(lx9.class, th);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) hashMap.get(str3);
            if (str5 != null) {
                qv0.d(z, h, str5, false, str4);
            }
        }
    }

    public static final void b(int i) {
        if (i == 0) {
            throw null;
        }
        if (b == null) {
            Boolean valueOf = Boolean.valueOf(qx9.x("com.android.vending.billing.IInAppBillingService$Stub") != null);
            b = valueOf;
            if (!valueOf.equals(Boolean.FALSE)) {
                c = Boolean.valueOf(qx9.x("com.android.billingclient.api.ProxyBillingActivity") != null);
                lx9 lx9Var = lx9.a;
                if (!cw3.a.contains(lx9.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = lx9.e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        cw3.a(lx9.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f = intent;
                d = new yw9(0);
                e = new ld(2);
            }
        }
        if (!Intrinsics.c(b, Boolean.FALSE) && qv0.c()) {
            h = i;
            if (a.compareAndSet(false, true)) {
                Context a2 = w.a();
                if (a2 instanceof Application) {
                    Application application = (Application) a2;
                    ld ldVar = e;
                    if (ldVar == null) {
                        Intrinsics.i("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(ldVar);
                    Intent intent2 = f;
                    if (intent2 == null) {
                        Intrinsics.i("intent");
                        throw null;
                    }
                    yw9 yw9Var = d;
                    if (yw9Var != null) {
                        a2.bindService(intent2, yw9Var, 1);
                    } else {
                        Intrinsics.i("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }
}
