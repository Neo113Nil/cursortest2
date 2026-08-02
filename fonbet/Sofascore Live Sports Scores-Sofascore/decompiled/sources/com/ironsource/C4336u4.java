package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.U3;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4336u4 {
    private static final String c = "u4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C4318t4 b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u4$a */
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

    public C4336u4(Context context, C4318t4 c4318t4) {
        this.a = context;
        this.b = c4318t4;
    }

    private void b(Context context, a aVar, InterfaceC4199ma interfaceC4199ma) {
        C4114he c4114he = new C4114he();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC4300s4.a(jSONObject.optString("source")), jSONObject.optString(U3.i.W), jSONObject.optString("data"));
        interfaceC4199ma.a(true, aVar.c, c4114he);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0006, B:11:0x0033, B:14:0x0039, B:15:0x004a, B:16:0x004b, B:18:0x0018, B:21:0x0024), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, InterfaceC4199ma interfaceC4199ma) throws Exception {
        char c2;
        a a2 = a(str);
        try {
            String str2 = a2.a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.a, a2, interfaceC4199ma);
                        return;
                    } else if (c2 == 1) {
                        a(this.a, a2, interfaceC4199ma);
                        return;
                    } else {
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
            a(a2, interfaceC4199ma, e2);
        }
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void a(Context context, a aVar, InterfaceC4199ma interfaceC4199ma) {
        C4114he c4114he = new C4114he();
        JSONObject jSONObject = aVar.b;
        c4114he.b("data", this.b.a(context, EnumC4300s4.a(jSONObject.optString("source")), jSONObject.optString(U3.i.W)));
        interfaceC4199ma.a(true, aVar.c, c4114he);
    }

    private void a(a aVar, InterfaceC4199ma interfaceC4199ma, Exception exc) {
        C4157k4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        C4114he c4114he = new C4114he();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c4114he.b("error", message);
        interfaceC4199ma.a(false, aVar.d, c4114he);
    }
}
