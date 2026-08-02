package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.F6;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class R5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P5 f39597a;

    public R5(P5 p52) {
        this.f39597a = p52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P5 webView = this.f39597a;
        webView.f39511b.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        C3556a6.f39823a.getClass();
        C3556a6.a.a("JS send Link is shown", true);
        webView.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"open\", \"data\": {}}')");
        F6.a.b(MapsKt.emptyMap(), "JSBridge - sent open");
    }
}
