package com.bytedance.sdk.openadsdk.oo;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends pcc {
    public static final SimpleDateFormat gm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public wh(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.oo.pcc
    public JSONObject oo() {
        return this.sf;
    }
}
