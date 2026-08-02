package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.fc6;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.utils.pcc$pcc, reason: collision with other inner class name */
    public static class C0054pcc {
        static final Random pcc = pcc.gm();
    }

    public static String gm(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String pcc = pcc(str.substring(1, 33), 32);
        return pcc != null ? com.bytedance.sdk.component.oo.pcc.sf(str.substring(49), str.substring(33, 49), pcc) : str;
    }

    public static JSONObject pcc(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String sf = sf(str);
                    if (TextUtils.isEmpty(sf)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                        jSONObject.put("cypher", 0);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, sf);
                    jSONObject.put("cypher", 3);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        }
        return jSONObject;
    }

    public static String sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String pcc = pcc();
        String pcc2 = pcc(pcc, 32);
        String sf = sf();
        return fc6.n("3", pcc, sf, (pcc2 == null || sf == null) ? null : com.bytedance.sdk.component.oo.pcc.pcc(str, sf, pcc2));
    }

    public static String sf() {
        String pcc = pcc(8);
        if (pcc == null || pcc.length() != 16) {
            return null;
        }
        return pcc;
    }

    public static Random gm() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return pcc(jSONObject.toString());
    }

    public static String pcc() {
        String pcc = pcc(16);
        if (pcc == null || pcc.length() != 32) {
            return null;
        }
        return pcc;
    }

    public static String pcc(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i).concat(str.substring(0, i2));
    }

    public static String pcc(int i) {
        try {
            byte[] bArr = new byte[i];
            C0054pcc.pcc.nextBytes(bArr);
            return vj.pcc(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
