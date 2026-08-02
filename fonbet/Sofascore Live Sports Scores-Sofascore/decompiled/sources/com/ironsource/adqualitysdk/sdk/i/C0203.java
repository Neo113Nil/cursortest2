package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0203 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0203 f298;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1183 f299;

    public C0203(C1183 c1183, C0203 c0203) {
        this.f299 = c1183;
        this.f298 = c0203;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0499 m128(String str) {
        C0203 c0203;
        C0499 c0499 = (C0499) this.f299.f3752.get(str);
        return (c0499 != null || (c0203 = this.f298) == null) ? c0499 : c0203.m128(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0352 m130(String str) {
        C0203 c0203;
        C0352 c0352 = (C0352) this.f299.f3753.get(str);
        return (c0352 != null || (c0203 = this.f298) == null) ? c0352 : c0203.m130(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList m129() {
        ArrayList arrayList = new ArrayList(this.f299.f3755);
        C0203 c0203 = this.f298;
        if (c0203 != null) {
            arrayList.addAll(c0203.m129());
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m131() {
        ArrayList arrayList = new ArrayList(this.f299.f3754);
        C0203 c0203 = this.f298;
        if (c0203 != null) {
            arrayList.addAll(c0203.m131());
        }
        return arrayList;
    }
}
