package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l0 implements b1 {
    public Integer a = null;
    public UnitDisplayType b;
    public Boolean c;
    public Integer d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, ToolBar.REFRESH, this.a);
        c1.a(jSONObject, "unitDisplayType", this.b);
        c1.a(jSONObject, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, this.c);
        c1.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}
