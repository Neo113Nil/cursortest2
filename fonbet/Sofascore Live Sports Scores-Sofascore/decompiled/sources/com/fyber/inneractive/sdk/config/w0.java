package com.fyber.inneractive.sdk.config;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum w0 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO("3"),
    APP_INFO("4"),
    STORE_PROMO(CampaignEx.CLICKMODE_ON);

    String value;

    w0(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
