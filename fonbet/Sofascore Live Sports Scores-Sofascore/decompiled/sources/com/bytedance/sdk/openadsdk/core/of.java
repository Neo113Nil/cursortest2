package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface of<T> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(int i, String str);

        void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(int i, String str);

        void pcc(yt.sf sfVar);
    }

    com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc();

    com.bytedance.sdk.openadsdk.oo.vj pcc(JSONObject jSONObject, String str, List<String> list);

    JSONObject pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i) throws JSONException;

    JSONObject pcc(JSONObject jSONObject);

    void pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i, fum fumVar);

    void pcc(String str);

    void pcc(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void pcc(JSONObject jSONObject, sf sfVar);

    void pcc(JSONObject jSONObject, String str);

    com.bytedance.sdk.openadsdk.oo.vj sf(JSONObject jSONObject);
}
