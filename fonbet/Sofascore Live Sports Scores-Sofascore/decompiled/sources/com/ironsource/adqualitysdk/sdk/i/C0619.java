package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐟ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0619 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2043;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f2044;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f2045;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ List f2046;

    public C0619(List list, C0499 c0499, C0950 c0950, C1102 c1102) {
        this.f2046 = list;
        this.f2045 = c0499;
        this.f2044 = c0950;
        this.f2043 = c1102;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f2046.add(0, this);
        C0499 c0499 = this.f2045;
        C0950 c0950 = this.f2044;
        C1102 c1102 = this.f2043;
        List list = this.f2046;
        c0499.getClass();
        c0499.m325(c0950, c0950.f3165, c1102, list);
        this.f2046.remove(0);
    }
}
