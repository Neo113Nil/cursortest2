package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ΐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0935 implements InterfaceC0686 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3141;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3142;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3143;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3144;

    public C0935(ArrayList arrayList, C0499 c0499, C0950 c0950, C1102 c1102) {
        this.f3144 = arrayList;
        this.f3143 = c0499;
        this.f3142 = c0950;
        this.f3141 = c1102;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0686
    /* renamed from: ﾒ */
    public final void mo403() {
        this.f3144.add(0, this);
        C0499 c0499 = this.f3143;
        C0950 c0950 = this.f3142;
        c0499.m325(c0950, c0950.f3165, this.f3141, this.f3144);
        this.f3144.remove(0);
    }
}
