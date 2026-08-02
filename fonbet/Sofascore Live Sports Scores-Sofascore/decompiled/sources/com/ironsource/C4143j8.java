package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import defpackage.ogj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4143j8 implements InterfaceC3993b1 {
    private static final String b = "j8";
    private static C4143j8 c;
    private final Map<String, E8> a = Collections.synchronizedMap(new HashMap());

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.j8$a */
    public class a implements Runnable {
        final /* synthetic */ C4126i8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        public a(C4126i8 c4126i8, Context context, String str) {
            this.a = c4126i8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4143j8.this.a.put(this.c, new C4036d8(this.a, this.b));
        }
    }

    public void a(InterfaceC4054e8 interfaceC4054e8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "loadWithUrl fail - adViewId is empty");
            ogj.k("adViewId is empty");
            return;
        }
        C4000b8 b2 = b(jSONObject);
        if (this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            ogj.k("collection already contain adViewId");
            return;
        }
        C4126i8 c4126i8 = new C4126i8(interfaceC4054e8, context, string, b2);
        c4126i8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        c4126i8.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            O7.a.d(new a(c4126i8, context, string));
        } else {
            this.a.put(string, c4126i8);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "performWebViewAction fail - adViewId is empty");
            ogj.k("adViewId is empty");
        } else {
            if (!this.a.containsKey(string)) {
                Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
                ogj.k("collection does not contain adViewId");
                return;
            }
            E8 e8 = this.a.get(string);
            String string2 = jSONObject.getString(U3.i.v0);
            if (e8 != null) {
                e8.a(string2, str, str2);
            }
        }
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            ogj.k("adViewId is empty");
        } else {
            if (!this.a.containsKey(string)) {
                Logger.i(b, "removeAdView fail - collection does not contain adViewId");
                ogj.k("collection does not contain adViewId");
                return;
            }
            E8 e8 = this.a.get(string);
            this.a.remove(string);
            if (e8 != null) {
                e8.a(str, str2);
            }
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            ogj.k("adViewId is empty");
        } else if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            ogj.k("collection does not contain adViewId");
        } else {
            E8 e8 = this.a.get(string);
            if (e8 != null) {
                e8.c(jSONObject, str, str2);
            }
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    private C4000b8 b(JSONObject jSONObject) {
        C4000b8 c4000b8 = new C4000b8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c4000b8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(U3.i.s0);
    }

    public static synchronized C4143j8 a() {
        C4143j8 c4143j8;
        synchronized (C4143j8.class) {
            c4143j8 = c;
            if (c4143j8 == null) {
                c4143j8 = new C4143j8();
                c = c4143j8;
            }
        }
        return c4143j8;
    }

    private C4000b8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(U3.i.O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C4000b8(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C4157k4.d().a(e);
            return new C4000b8();
        }
    }

    @Override // com.ironsource.InterfaceC3993b1
    @Nullable
    public E8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                E8 e8 = this.a.get(string);
                if (e8 != null) {
                    e8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            ogj.k("collection does not contain adViewId");
            return;
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        ogj.k("adViewId is empty");
    }
}
