package com.iab.omid.library.vungle.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
