package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h extends xka implements Function0 {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.a.d;
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
        return Unit.a;
    }
}
