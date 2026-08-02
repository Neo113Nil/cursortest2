package com.bytedance.sdk.openadsdk.gm;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.of;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static volatile sf pcc;
    private final of<com.bytedance.sdk.openadsdk.oo.pcc> sf = lu.gm();

    private sf() {
    }

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                try {
                    if (pcc == null) {
                        pcc = new sf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public void pcc(@NonNull String str, List<FilterWord> list, String str2) {
        pcc(str, list, null, null, str2);
    }

    public void pcc(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.sf.pcc(str, list, jSONObject, str2, str3);
    }
}
