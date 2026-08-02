package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2524l8 implements InterfaceC2374d1 {
    private static final String b = "l8";
    private static C2524l8 c;
    private final Map<String, G8> a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.l8$a */
    class a implements Runnable {
        final /* synthetic */ C2506k8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(C2506k8 c2506k8, Context context, String str) {
            this.a = c2506k8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2524l8.this.a.put(this.c, new C2417f8(this.a, this.b));
        }
    }

    public static synchronized C2524l8 a() {
        C2524l8 c2524l8;
        synchronized (C2524l8.class) {
            if (c == null) {
                c = new C2524l8();
            }
            c2524l8 = c;
        }
        return c2524l8;
    }

    private C2381d8 b(JSONObject jSONObject) {
        C2381d8 c2381d8 = new C2381d8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c2381d8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(X3.i.s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        G8 g8 = this.a.get(string);
        if (g8 != null) {
            g8.c(jSONObject, str, str2);
        }
    }

    private C2381d8 a(JSONObject jSONObject) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString(X3.i.O));
            String obj = jsonObjectInit.get("height").toString();
            String obj2 = jsonObjectInit.get("width").toString();
            return new C2381d8(Integer.parseInt(obj2), Integer.parseInt(obj), jsonObjectInit.get("label").toString());
        } catch (Exception e) {
            C2556n4.d().a(e);
            return new C2381d8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                G8 g8 = this.a.get(string);
                String string2 = jSONObject.getString(X3.i.v0);
                if (g8 != null) {
                    g8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                G8 g8 = this.a.get(string);
                this.a.remove(string);
                if (g8 != null) {
                    g8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC2435g8 interfaceC2435g8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C2381d8 b2 = b(jSONObject);
            if (!this.a.containsKey(string)) {
                C2506k8 c2506k8 = new C2506k8(interfaceC2435g8, context, string, b2);
                c2506k8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c2506k8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    Q7.a.d(new a(c2506k8, context, string));
                    return;
                } else {
                    this.a.put(string, c2506k8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC2374d1
    public G8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                G8 g8 = this.a.get(string);
                if (g8 != null) {
                    g8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
