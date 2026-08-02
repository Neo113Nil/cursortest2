package com.ironsource;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4367i8 {
    private C4420l8 a;

    public C4367i8(C4420l8 c4420l8) {
        this.a = c4420l8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
