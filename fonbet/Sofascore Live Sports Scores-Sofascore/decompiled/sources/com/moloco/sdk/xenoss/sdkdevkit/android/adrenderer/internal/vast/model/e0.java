package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum e0 {
    XmlParsing(100),
    Wrapper(300),
    WrapperTimeout(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    WrapperLimit(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE),
    WrapperNoAds(303),
    Linear(400),
    LinearFileNotFound(401),
    LinearNotSupportedMedia(403),
    Companion(600),
    /* JADX INFO: Fake field, exist only in values array */
    Undefined(900);

    public final int a;

    e0(int i) {
        this.a = i;
    }
}
