package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class U4 {
    public static JSONArray a(T4 t4, List list) {
        t4.getClass();
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        List list2 = T4.j;
        list.getClass();
        if (!list.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(t4.a);
        }
        if (!list.contains("bid")) {
            jSONArray.put(t4.b);
        }
        if (!list.contains("its")) {
            jSONArray.put(t4.c);
        }
        if (!list.contains("vtm")) {
            jSONArray.put(t4.d);
        }
        if (!list.contains("plid")) {
            jSONArray.put(t4.e);
        }
        if (!list.contains("catid")) {
            jSONArray.put(t4.f);
        }
        if (!list.contains("hcd")) {
            jSONArray.put(t4.g);
        }
        if (!list.contains("hsv")) {
            jSONArray.put(t4.h);
        }
        if (!list.contains("hcv")) {
            jSONArray.put(t4.i);
        }
        return jSONArray;
    }
}
