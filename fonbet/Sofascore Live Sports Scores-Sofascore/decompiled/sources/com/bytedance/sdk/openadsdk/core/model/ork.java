package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    private String pcc;
    private List<String> sf;

    public ork(String str) {
        this.pcc = "";
        this.sf = new ArrayList();
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : pcc(str);
        try {
            this.pcc = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.sf = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.sf.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("AutoTestModel", e.getMessage());
        }
    }

    private static final HashMap<String, Object> pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString(U3.i.X));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }

    public List<String> sf() {
        return this.sf;
    }

    public String pcc() {
        return this.pcc;
    }
}
