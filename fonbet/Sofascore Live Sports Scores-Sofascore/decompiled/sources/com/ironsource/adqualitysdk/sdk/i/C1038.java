package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭙ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1038 implements InterfaceC0248 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3317;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3318;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3319;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1137 f3320;

    public C1038(C1137 c1137, C0950 c0950, C1102 c1102, List list) {
        this.f3320 = c1137;
        this.f3319 = c0950;
        this.f3318 = c1102;
        this.f3317 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0248
    /* renamed from: ﾒ */
    public final boolean mo64(InterfaceC0264 interfaceC0264) {
        C0307 c0307 = this.f3320.f3547;
        C0950 c0950 = this.f3319;
        C1102 c1102 = this.f3318;
        List list = this.f3317;
        AbstractC0447 abstractC0447 = c0307.f574;
        if (abstractC0447 != null && !abstractC0447.mo213(interfaceC0264)) {
            return false;
        }
        if (c0307.f573 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, interfaceC0264);
        C0499 c0499 = c0307.f573;
        c0499.getClass();
        return c0499.m325(c0950, c0950.f3165, c1102, arrayList).m640();
    }
}
