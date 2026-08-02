package com.mbridge.msdk.out.strategy;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface IBaseVideoAdStrategy {
    void clearVideoCache();

    String getCreativeIdWithUnitId();

    String getRequestId();

    void loadFormSelfFilling();

    void playVideoMute(int i);

    void setAlertDialogText(String str, String str2, String str3, String str4);

    void setExtraInfo(JSONObject jSONObject);

    void setRewardPlus(boolean z);
}
