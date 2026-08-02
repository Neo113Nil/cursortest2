package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐠ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0620 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C0620 f2047;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public HashMap f2049;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f2050 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2048 = new Handler(Looper.getMainLooper());

    static {
        StringFog.decrypt("DsnSsBDp0n0fxdO6F8PjcArD\n", "eqan03ittwk=\n");
        StringFog.decrypt("cnhW\n", "Eww6VyiYJtY=\n");
        StringFog.decrypt("ubE=\n", "y90jSo2VESU=\n");
        StringFog.decrypt("6S06\n", "h0JUtjbz47Y=\n");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized C0620 m379() {
        C0620 c0620;
        synchronized (C0620.class) {
            c0620 = f2047;
            if (c0620 == null) {
                c0620 = new C0620();
                f2047 = c0620;
            }
        }
        return c0620;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m381(Activity activity) {
        return EnumC0623.f2056 == m382(activity);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized Map m383() {
        JSONObject jSONObject;
        try {
            if (this.f2049 == null) {
                this.f2049 = new HashMap();
                C1037 c1037 = ((C0346) AbstractC0274.m142()).f3205;
                if (c1037 != null) {
                    jSONObject = c1037.f3308.optJSONObject(C1037.f3305);
                    if (jSONObject == null) {
                        jSONObject = c1037.f3307;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, EnumC0623.m384(jSONObject.optString(next)));
                    }
                    this.f2049 = hashMap;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2049;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m380() {
        return new HashMap(this.f2050);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized EnumC0623 m382(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m380().containsKey(name)) {
                return (EnumC0623) m380().get(name);
            }
            if (((HashMap) m383()).containsKey(name)) {
                return (EnumC0623) ((HashMap) m383()).get(name);
            }
        }
        return EnumC0623.m384(AbstractC0274.m142().mo151());
    }
}
