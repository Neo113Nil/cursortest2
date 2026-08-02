package com.fyber.inneractive.sdk.renderers;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum m {
    BANNER_WIDTH(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(250),
    RECTANGLE_WIDTH(300);

    final int value;

    m(int i) {
        this.value = i;
    }
}
