package com.bytedance.sdk.component.embedapplog;

import android.util.Pair;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PangleEncryptManager {
    public static final int CYPHER_VERSION_V4 = 4;
    public static final String KEY_CYPHER = "cypher";

    public static Pair<Integer, String> decryptType4(String str) {
        return PangleEncryptUtilsType4.decrypt(str);
    }

    public static JSONObject encryptType4(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        return PangleEncryptUtilsType4.encrypt(jSONObject, iDefaultEncrypt);
    }

    public static JSONObject encryptType4WithNoWrapBase64(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        return PangleEncryptUtilsType4.encryptType4WithNoWrapBase64(jSONObject, iDefaultEncrypt);
    }

    public static Pair<Integer, byte[]> encryptType4WithoutBase64(byte[] bArr) {
        return PangleEncryptUtilsType4.encryptWithoutBase64(bArr);
    }
}
