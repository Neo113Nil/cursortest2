package com.bytedance.sdk.openadsdk.core.gbb;

import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm {
    private long ork;
    private long vh;

    public sf(int i, int i2, long j, long j2, pcc.EnumC0071pcc enumC0071pcc, pcc.sf sfVar, String str, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list2, String str2) {
        super(i, i2, enumC0071pcc, sfVar, str, list, list2, str2);
        this.ork = j;
        this.vh = j2;
        this.vy = "icon_click";
    }

    public static sf pcc(JSONObject jSONObject) {
        gm sf = gm.sf(jSONObject);
        if (sf == null) {
            return null;
        }
        return new sf(sf.pcc, sf.sf, jSONObject.optLong("offset", -1L), jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, -1L), sf.gm, sf.oo, sf.vj, sf.wh, sf.qf, sf.kj);
    }
}
