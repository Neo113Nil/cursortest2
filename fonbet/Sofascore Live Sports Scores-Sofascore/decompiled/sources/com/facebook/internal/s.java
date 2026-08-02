package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.L6;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.de0;
import defpackage.iv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s {
    public static final s a = new s();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static volatile Long e;
    public static volatile de0 f;

    public static JSONObject a() {
        Bundle f2 = bf3.f(L6.H, "android");
        com.facebook.w wVar = com.facebook.w.a;
        f2.putString("sdk_version", "18.3.0");
        f2.putString("fields", "gatekeepers");
        String str = com.facebook.d0.j;
        com.facebook.d0 B = com.moloco.sdk.internal.publisher.h0.B(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        B.d = f2;
        JSONObject jSONObject = B.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        s sVar = a;
        ArrayList<iv8> arrayList = null;
        d(null);
        if (sVar.c(str2) == null) {
            hashMap = new HashMap();
        } else {
            de0 de0Var = f;
            if (de0Var != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) de0Var.b).get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((iv8) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (iv8 iv8Var : arrayList) {
                    hashMap.put(iv8Var.a, Boolean.valueOf(iv8Var.b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject c2 = sVar.c(str2);
                if (c2 == null) {
                    c2 = new JSONObject();
                }
                Iterator<String> keys = c2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    next.getClass();
                    hashMap2.put(next, Boolean.valueOf(c2.optBoolean(next)));
                }
                de0 de0Var2 = f;
                if (de0Var2 == null) {
                    de0Var2 = new de0(22);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList2.add(new iv8((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    iv8 iv8Var2 = (iv8) it2.next();
                    concurrentHashMap2.put(iv8Var2.a, iv8Var2);
                }
                ((ConcurrentHashMap) de0Var2.b).put(str2, concurrentHashMap2);
                f = de0Var2;
                hashMap = hashMap2;
            }
        }
        return (hashMap.containsKey(str) && (bool = (Boolean) hashMap.get(str)) != null) ? bool.booleanValue() : z;
    }

    public static final synchronized void d(p pVar) {
        synchronized (s.class) {
            if (pVar != null) {
                try {
                    c.add(pVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String b2 = com.facebook.w.b();
            s sVar = a;
            Long l = e;
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && sVar.c(b2) != null) {
                f();
                return;
            }
            Context a2 = com.facebook.w.a();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b2}, 1));
            JSONObject jSONObject = null;
            String string = a2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!k0.A(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
                if (jSONObject != null) {
                    e(b2, jSONObject);
                }
            }
            Executor c2 = com.facebook.w.c();
            if (b.compareAndSet(false, true)) {
                c2.execute(new r(b2, a2, format));
            }
        }
    }

    public static final synchronized JSONObject e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (s.class) {
            try {
                str.getClass();
                JSONObject c2 = a.c(str);
                jSONObject2 = c2 != null ? new JSONObject(c2.toString()) : new JSONObject();
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject3.getString(U3.i.W), jSONObject3.getBoolean(U3.i.X));
                    } catch (JSONException unused) {
                        com.facebook.w wVar = com.facebook.w.a;
                    }
                }
                synchronized (a) {
                    d.put(str, jSONObject2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            p pVar = (p) concurrentLinkedQueue.poll();
            if (pVar != null) {
                handler.post(new com.appsflyer.b(pVar, 9));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) d.get(str);
    }
}
