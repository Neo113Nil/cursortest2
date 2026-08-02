package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    private static final String c = "e";
    public static String d = "h";
    public static String e = "i";
    public static String f = "coppa";
    public static String g = "d";
    public static String h = "e";
    public static String i = "a";
    public static String j = "f";
    public static String k = "g";
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> a = new LinkedHashMap();
    private Map<String, String> b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.b.put(str, str2);
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append(U3.j.b);
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), C.UTF8_NAME), URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e2) {
            q0.b(c, e2.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append(C4427z5.U);
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.a.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME));
                sb.append(C4427z5.U);
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException e2) {
            q0.b(c, e2.getMessage());
        }
        return sb.toString();
    }

    public Map<String, String> a() {
        return this.b;
    }

    public void a(String str) {
        this.b.remove(str);
        this.a.remove(str);
    }
}
