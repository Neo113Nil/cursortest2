package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public UnitDisplayType a;
    public Boolean b;
    public Integer c;
    public Integer d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int optInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        bVar.a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.b = jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_CLOSE) ? Boolean.valueOf(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, true)) : null;
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.d = valueOf;
        bVar.c = optInt2 != Integer.MIN_VALUE ? valueOf2 : null;
        return bVar;
    }
}
