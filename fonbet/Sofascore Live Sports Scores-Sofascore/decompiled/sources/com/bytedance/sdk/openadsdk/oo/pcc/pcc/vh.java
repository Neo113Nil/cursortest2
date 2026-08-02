package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh extends ork<JSONObject> {
    private static final AtomicInteger pcc = new AtomicInteger(0);

    public vh(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                String optString = jSONObject2.optString("event_extra");
                JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                jSONObject3.putOpt("_nl", 1);
                jSONObject3.putOpt("_ei", Integer.valueOf(pcc.getAndAdd(1)));
                jSONObject3.putOpt("_reqc", 0);
                jSONObject2.putOpt("event_extra", jSONObject3.toString());
            } catch (Exception unused) {
            }
        }
        return jSONObject2;
    }

    @Override // defpackage.itm
    public byte[] oo() {
        String jSONObject;
        JSONObject jSONObject2 = (JSONObject) gm();
        if (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) {
            return null;
        }
        return jSONObject.getBytes(StandardCharsets.UTF_8);
    }
}
