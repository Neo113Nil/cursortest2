package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0793 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f2538;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2539;

    public C0793(C0785 c0785, Activity activity) {
        this.f2538 = c0785;
        this.f2539 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0785 c0785 = this.f2538;
        c0785.f2528 = true;
        InterfaceC0878 interfaceC0878 = c0785.f2527;
        if (interfaceC0878 != null) {
            interfaceC0878.mo456(this.f2539);
        }
    }
}
