package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.ironsource.U3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private of sf;

    public lo(of ofVar) {
        this.sf = ofVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        String yez;
        of ofVar = this.sf;
        if (ofVar == null || (yez = ofVar.yez()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    c = 0;
                    break;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    c = 1;
                    break;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    c = 2;
                    break;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String optString = jSONObject.optString(U3.i.W);
                if (!TextUtils.isEmpty(optString) && tsx.pcc().sf(yez, optString)) {
                    jSONObject2.put(U3.i.X, tsx.pcc().pcc(yez, optString));
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
            case 1:
                tsx.pcc().pcc(yez);
                jSONObject2.put("code", "0");
                break;
            case 2:
                String optString2 = jSONObject.optString(U3.i.W);
                String optString3 = jSONObject.optString(U3.i.X);
                if (optString2 == null) {
                    jSONObject2.put("code", "1");
                    break;
                } else {
                    tsx.pcc().pcc(yez, optString2, optString3);
                    jSONObject2.put("code", "0");
                    break;
                }
            case 3:
                String optString4 = jSONObject.optString(U3.i.W);
                if (!TextUtils.isEmpty(optString4)) {
                    jSONObject2.put("code", tsx.pcc().gm(yez, optString4) ? "0" : "1");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
        }
        return null;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, of ofVar) {
        jrVar.pcc(pcc, new lo(ofVar));
    }
}
