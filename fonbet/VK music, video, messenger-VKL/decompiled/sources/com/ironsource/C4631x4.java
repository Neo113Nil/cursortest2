package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4631x4 {
    private static final String c = "x4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C4613w4 b;

    /* renamed from: com.ironsource.x4$a */
    public static class a {
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

    public C4631x4(Context context, C4613w4 c4613w4) {
        this.a = context;
        this.b = c4613w4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC4458na interfaceC4458na) {
        C4373ie c4373ie = new C4373ie();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC4595v4.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC4458na.a(true, aVar.c, c4373ie);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0006, B:11:0x0033, B:14:0x0039, B:15:0x004a, B:16:0x004b, B:18:0x0018, B:21:0x0024), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        char c2;
        a a2 = a(str);
        try {
            String str2 = a2.a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.a, a2, interfaceC4458na);
                        return;
                    } else {
                        if (c2 != 1) {
                            throw new UnsupportedOperationException("unsupported API: " + str);
                        }
                        a(this.a, a2, interfaceC4458na);
                        return;
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
            a(a2, interfaceC4458na, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC4458na interfaceC4458na) {
        C4373ie c4373ie = new C4373ie();
        JSONObject jSONObject = aVar.b;
        c4373ie.b("data", this.b.a(context, EnumC4595v4.a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC4458na.a(true, aVar.c, c4373ie);
    }

    private void a(a aVar, InterfaceC4458na interfaceC4458na, Exception exc) {
        C4452n4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        C4373ie c4373ie = new C4373ie();
        if (TextUtils.isEmpty(message)) {
            message = FyberConstants.Logs.UNKNOWN_ERROR;
        }
        c4373ie.b("error", message);
        interfaceC4458na.a(false, aVar.d, c4373ie);
    }
}
