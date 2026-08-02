package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʹ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0310 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f576;

    public C0310(C0322 c0322) {
        this.f576 = c0322;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0322 c0322 = this.f576;
        Object obj = arrayList.get(0);
        c0322.getClass();
        WebViewApp.setCurrentApp((C0326) obj);
        return null;
    }
}
