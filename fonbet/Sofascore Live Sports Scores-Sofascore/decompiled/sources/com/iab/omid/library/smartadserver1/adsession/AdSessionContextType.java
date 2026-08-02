package com.iab.omid.library.smartadserver1.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

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
