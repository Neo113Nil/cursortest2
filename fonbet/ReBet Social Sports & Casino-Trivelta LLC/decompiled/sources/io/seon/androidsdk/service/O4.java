package io.seon.androidsdk.service;

import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class O4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f53095a = {"android_id", "app_guid", "gsf_id", "is_emulator", "is_rooted", "media_drm_id"};

    public static String a(JSONObject jSONObject) {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = f53095a;
            for (int i10 = 0; i10 < 6; i10++) {
                String str = strArr[i10];
                sb2.append(jSONObject.has(str) ? jSONObject.getString(str) : "null");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(sb2.toString().getBytes(StandardCharsets.UTF_8));
            return Long.toString(crc32.getValue());
        } catch (Throwable unused) {
            return "";
        }
    }
}
