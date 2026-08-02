package com.ironsource.adqualitysdk.sdk.i;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0485 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f1553;

    public C0485(C0322 c0322) {
        this.f1553 = c0322;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0322 c0322 = this.f1553;
        DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) arrayList.get(0);
        c0322.getClass();
        return diagnosticEvent.getStringTagsMap();
    }
}
