package com.fyber.inneractive.sdk.external;

/* loaded from: classes12.dex */
public enum InneractiveMediationName {
    ADMOB(InneractiveMediationNameConsts.ADMOB),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER(InneractiveMediationNameConsts.FYBER),
    OTHER("other");

    final String key;

    InneractiveMediationName(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
