package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2735x4 {
    private static final String c = "x4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C2717w4 b;

    /* renamed from: com.ironsource.x4$a */
    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C2735x4(Context context, C2717w4 c2717w4) {
        this.a = context;
        this.b = c2717w4;
    }

    private a a(String str) throws JSONException {
        return a.a(IronSourceNetworkBridge.jsonObjectInit(str));
    }

    private void b(Context context, a aVar, InterfaceC2544ma interfaceC2544ma) {
        C2477ie c2477ie = new C2477ie();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC2699v4.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC2544ma.a(true, aVar.c, c2477ie);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #0 {Exception -> 0x0051, blocks: (B:3:0x0007, B:11:0x0032, B:14:0x0038, B:15:0x004a, B:16:0x004b, B:18:0x0019, B:21:0x0023), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, InterfaceC2544ma interfaceC2544ma) throws Exception {
        char c2;
        a a2 = a(str);
        try {
            String str2 = a2.a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.a, a2, interfaceC2544ma);
                        return;
                    } else {
                        if (c2 == 1) {
                            a(this.a, a2, interfaceC2544ma);
                            return;
                        }
                        throw new UnsupportedOperationException("unsupported API: " + str);
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            } else {
                if (str2.equals(e)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            }
        } catch (Exception e2) {
            a(a2, interfaceC2544ma, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC2544ma interfaceC2544ma) {
        C2477ie c2477ie = new C2477ie();
        JSONObject jSONObject = aVar.b;
        c2477ie.b("data", this.b.a(context, EnumC2699v4.a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC2544ma.a(true, aVar.c, c2477ie);
    }

    private void a(a aVar, InterfaceC2544ma interfaceC2544ma, Exception exc) {
        C2556n4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        C2477ie c2477ie = new C2477ie();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c2477ie.b("error", message);
        interfaceC2544ma.a(false, aVar.d, c2477ie);
    }
}
