package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C3712p;
import com.plaid.internal.InterfaceC3731r1;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3660j1 implements InterfaceC3633g1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C3784x0 f40691e;

    /* renamed from: a, reason: collision with root package name */
    public final String f40692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40693b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f40694c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f40695d;

    static {
        W3 w32 = Z3.f39803a;
        f40691e = new C3784x0("flowV2");
    }

    public C3660j1(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f40692a = str;
        this.f40693b = str2;
        this.f40694c = jSONObject;
        this.f40695d = jSONObject2;
    }

    public static C3660j1 a(String str) {
        String str2 = (String) AbstractC3767v1.b(str).get(EventKeys.DATA);
        if (str2 == null) {
            throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing in url");
        }
        try {
            String str3 = new String(Base64.decode(str2, 8));
            f40691e.a(W3.TRACE, "decoded data: %s", str3);
            JSONObject jSONObject = new JSONObject(str3);
            try {
                String string = jSONObject.getString(EventKeys.URL);
                try {
                    String string2 = jSONObject.getString("vfp");
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(EventKeys.DATA);
                        try {
                            new URL(string);
                            return new C3660j1(string, string2, jSONObject2, jSONObject.optJSONObject("att-1004"));
                        } catch (MalformedURLException unused) {
                            throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + string);
                        }
                    } catch (JSONException unused2) {
                        throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing data field");
                    }
                } catch (JSONException unused3) {
                    throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing vfp field");
                }
            } catch (JSONException unused4) {
                throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing url field");
            }
        } catch (Exception unused5) {
            throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - cannot parse as json");
        }
    }

    @Override // com.plaid.internal.InterfaceC3633g1
    public final String a(InterfaceC3731r1 interfaceC3731r1, C3712p c3712p) {
        C3784x0 c3784x0;
        InterfaceC3731r1.b a10;
        int i10;
        String str;
        c3712p.f40927d = "v2";
        String str2 = this.f40692a;
        String str3 = (String) AbstractC3767v1.b(str2).get("cid");
        if (str3 == null) {
            LinkedHashMap b10 = AbstractC3767v1.b(str2);
            str3 = (String) b10.get("vfp");
            if (str3 == null) {
                str3 = (String) b10.get("token");
            }
        }
        c3712p.f40928e = str3;
        JSONObject jSONObject = this.f40694c;
        boolean z10 = false;
        while (true) {
            C3712p.a aVar = new C3712p.a(this.f40692a);
            c3712p.f40926c.add(aVar);
            try {
                String jSONObject2 = jSONObject.toString();
                c3784x0 = f40691e;
                W3 w32 = W3.TRACE;
                c3784x0.a(w32, "att request body: %s", jSONObject2);
                a10 = interfaceC3731r1.a(new InterfaceC3731r1.a(this.f40692a, true, jSONObject2, ((Number) c3712p.f40929f.a("connection-timeout-att", 10000, Number.class)).intValue()));
                i10 = a10.f41016b;
                aVar.f40931b = i10;
                if (i10 >= 200 && i10 <= 202) {
                    str = a10.f41015a;
                    c3784x0.a(w32, "att response body: %s", str);
                    if (z10) {
                        break;
                    }
                    try {
                        if (new JSONObject(str).optInt("status", -1) != 1004) {
                            break;
                        }
                        JSONObject jSONObject3 = this.f40695d;
                        String optString = jSONObject3 == null ? null : jSONObject3.optString("application-id");
                        if (optString == null) {
                            c3784x0.a(W3.DEBUG, "missing att1004.application-id, continue flow v2", new Object[0]);
                            break;
                        }
                        c3784x0.a(W3.DEBUG, "flow v2.5 detected, use application-id: %s", optString);
                        try {
                            JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                            try {
                                jSONObject4.putOpt("application-id", optString);
                                jSONObject = jSONObject4;
                                z10 = true;
                            } catch (JSONException e10) {
                                throw new IllegalStateException(e10);
                            }
                        } catch (JSONException e11) {
                            throw new IllegalStateException(e11);
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    break;
                }
            } catch (IOException e12) {
                throw new C3721q(T0.GENERIC_COMMUNICATION_ERROR, e12);
            }
        }
        if (i10 >= 300 && i10 < 400) {
            throw new C3721q(T0.AUTH_INVALID_RESPONSE, "Unexpected redirect in flow v2");
        }
        c3784x0.a(W3.INFO, "error response code: %i %s", Integer.valueOf(i10), a10.f41017c);
        c3784x0.a(W3.DEBUG, "error response body: %s", a10.f41015a);
        if (i10 == 404) {
            throw new C3721q(T0.AUTH_BAD_CREDENTIALS);
        }
        if (i10 != 410) {
            throw new C3721q(T0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + i10);
        }
        throw new C3721q(T0.AUTH_VFP_KEY_EXPIRED);
        String encodeToString = Base64.encodeToString(str.getBytes(), 10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40693b);
        sb2.append("___");
        sb2.append(encodeToString);
        sb2.append(z10 ? "___R2" : "");
        return sb2.toString();
    }
}
