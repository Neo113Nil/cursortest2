package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4438m8 implements InterfaceC4270d1 {
    private static final String b = "m8";
    private static C4438m8 c;
    private final Map<String, H8> a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.m8$a */
    public class a implements Runnable {
        final /* synthetic */ C4420l8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        public a(C4420l8 c4420l8, Context context, String str) {
            this.a = c4420l8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4438m8.this.a.put(this.c, new C4331g8(this.a, this.b));
        }
    }

    private C4295e8 b(JSONObject jSONObject) {
        C4295e8 c4295e8 = new C4295e8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c4295e8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(X3.i.s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static synchronized C4438m8 a() {
        C4438m8 c4438m8;
        synchronized (C4438m8.class) {
            try {
                if (c == null) {
                    c = new C4438m8();
                }
                c4438m8 = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4438m8;
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        H8 h8 = this.a.get(string);
        if (h8 != null) {
            h8.c(jSONObject, str, str2);
        }
    }

    private C4295e8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(X3.i.O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C4295e8(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C4452n4.d().a(e);
            return new C4295e8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                String string2 = jSONObject.getString(X3.i.v0);
                if (h8 != null) {
                    h8.a(string2, str, str2);
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
                H8 h8 = this.a.get(string);
                this.a.remove(string);
                if (h8 != null) {
                    h8.a(str, str2);
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

    public void a(InterfaceC4349h8 interfaceC4349h8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C4295e8 b2 = b(jSONObject);
            if (!this.a.containsKey(string)) {
                C4420l8 c4420l8 = new C4420l8(interfaceC4349h8, context, string, b2);
                c4420l8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c4420l8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    R7.a.d(new a(c4420l8, context, string));
                    return;
                } else {
                    this.a.put(string, c4420l8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC4270d1
    public H8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                if (h8 != null) {
                    h8.a(jSONObject, str, str2);
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
