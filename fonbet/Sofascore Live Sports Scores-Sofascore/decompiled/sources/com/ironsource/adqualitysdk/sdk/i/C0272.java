package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɪ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0272 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f495;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ D f496;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f497;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f498;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f499;

    public C0272(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, D d, KeyEvent.Callback callback) {
        this.f499 = interfaceC0881;
        this.f498 = jSONObject;
        this.f497 = view;
        this.f496 = d;
        this.f495 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f499.mo100(this.f498, this.f497, this.f496, this.f495);
    }
}
