package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh {
    private JSONObject gm;
    private Map<String, Object> oo;
    private Context pcc;
    private JSONObject sf;

    public void pcc(Context context) {
        this.pcc = context;
    }

    public void sf(JSONObject jSONObject) {
        this.gm = jSONObject;
    }

    public void pcc(JSONObject jSONObject) {
        this.sf = jSONObject;
    }

    public Map<String, Object> sf() {
        return this.oo;
    }

    public JSONObject pcc() {
        return this.gm;
    }

    public void pcc(Map<String, Object> map) {
        this.oo = map;
    }
}
