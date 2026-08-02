package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C3712p;
import com.plaid.internal.InterfaceC3731r1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3651i1 implements InterfaceC3633g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C3784x0 f40666b;

    /* renamed from: a, reason: collision with root package name */
    public final String f40667a;

    static {
        W3 w32 = Z3.f39803a;
        f40666b = new C3784x0("flowV1");
    }

    public C3651i1(String str) {
        this.f40667a = str;
    }

    @Override // com.plaid.internal.InterfaceC3633g1
    public final String a(InterfaceC3731r1 interfaceC3731r1, C3712p c3712p) {
        InterfaceC3731r1.b a10;
        int i10;
        c3712p.f40927d = "v1";
        String str = this.f40667a;
        String str2 = (String) AbstractC3767v1.b(str).get("cid");
        if (str2 == null) {
            LinkedHashMap b10 = AbstractC3767v1.b(str);
            String str3 = (String) b10.get("vfp");
            str2 = str3 == null ? (String) b10.get("token") : str3;
        }
        c3712p.f40928e = str2;
        LinkedHashMap b11 = AbstractC3767v1.b(this.f40667a);
        String str4 = (String) b11.get("vfp");
        if (str4 == null) {
            str4 = (String) b11.get("token");
        }
        int i11 = 0;
        while (true) {
            try {
                C3712p.a aVar = new C3712p.a(str);
                c3712p.f40926c.add(aVar);
                a10 = interfaceC3731r1.a(new InterfaceC3731r1.a(str, false, null, ((Number) c3712p.f40929f.a("connection-timeout", 10000, Number.class)).intValue()));
                i10 = a10.f41016b;
                aVar.f40931b = i10;
                if (i10 >= 200 && i10 <= 202) {
                    if (c3712p.f40929f.a("forward-mno-response")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", a10.f41016b);
                            jSONObject.put("statusText", a10.f41017c);
                            jSONObject.put("headers", new JSONObject(a10.f41018d));
                            jSONObject.put("body", a10.f41015a);
                            return Base64.encodeToString(("mno-resp:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
                        } catch (JSONException e10) {
                            throw new C3721q(T0.GENERIC_UNKNOWN_REASON, e10);
                        }
                    }
                    String str5 = a10.f41015a;
                    try {
                        String a11 = a(new JSONObject(str5));
                        if (a11 != null) {
                            return a11;
                        }
                        throw new C3721q(T0.AUTH_INVALID_RESPONSE, "Received unknown payload: " + str5);
                    } catch (JSONException e11) {
                        throw new C3721q(T0.AUTH_INVALID_RESPONSE, e11);
                    }
                }
                if (i10 < 300 || i10 >= 400) {
                    break;
                }
                i11++;
                if (i11 > 10) {
                    throw new C3721q(T0.GENERIC_COMMUNICATION_ERROR, "too many redirects");
                }
                str = a10.f41018d.get("location");
                if (!c3712p.f40929f.a("skip-vfp-detection")) {
                    LinkedHashMap b12 = AbstractC3767v1.b(str);
                    String str6 = (String) b12.get("vfp");
                    String str7 = str6 == null ? (String) b12.get("token") : str6;
                    if (str4 == null) {
                        str4 = str7;
                    } else if (str7 != null && !str7.equals(str4)) {
                        f40666b.a(W3.DEBUG, "jumping out of redirect loop with different vfp: %s", str7);
                        return str7;
                    }
                }
            } catch (IOException e12) {
                throw new C3721q(T0.GENERIC_COMMUNICATION_ERROR, e12);
            }
        }
        C3784x0 c3784x0 = f40666b;
        c3784x0.a(W3.INFO, "error response code: %d %s", Integer.valueOf(i10), a10.f41017c);
        c3784x0.a(W3.DEBUG, "error response body: %s", a10.f41015a);
        if (i10 == 404) {
            throw new C3721q(T0.AUTH_BAD_CREDENTIALS);
        }
        if (i10 == 410) {
            throw new C3721q(T0.AUTH_VFP_KEY_EXPIRED);
        }
        throw new C3721q(T0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + i10);
    }

    public static String a(JSONObject jSONObject) {
        String optString = jSONObject.optString("vfp");
        if (!optString.isEmpty()) {
            return optString;
        }
        String optString2 = jSONObject.optString("token");
        String optString3 = jSONObject.optString("correlation_id");
        if (!optString2.isEmpty()) {
            if (optString3.isEmpty()) {
                return optString2;
            }
            return optString3 + "..." + optString2;
        }
        String optString4 = jSONObject.optString("reconcilation_token");
        if (optString4.isEmpty()) {
            return null;
        }
        if (optString3.isEmpty()) {
            return optString4;
        }
        return optString3 + "..." + optString4;
    }
}
