package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface a {
    void a(CampaignEx campaignEx);

    void a(boolean z);

    void a(boolean z, String str);

    void close();

    void readyStatus(int i);

    void toggleCloseBtn(int i);

    void triggerCloseBtn(String str);
}
