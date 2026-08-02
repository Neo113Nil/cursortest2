package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ỉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0904 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0903 f3028;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f3029;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0887 f3030;

    public C0904(C0903 c0903, ViewOnClickListenerC0887 viewOnClickListenerC0887, View view) {
        this.f3028 = c0903;
        this.f3030 = viewOnClickListenerC0887;
        this.f3029 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3028.f3027.mo531(this.f3030, this.f3029);
    }
}
