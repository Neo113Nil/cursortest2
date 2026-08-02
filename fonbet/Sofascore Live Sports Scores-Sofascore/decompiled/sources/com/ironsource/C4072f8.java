package com.ironsource;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4072f8 {
    private C4126i8 a;

    public C4072f8(C4126i8 c4126i8) {
        this.a = c4126i8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
