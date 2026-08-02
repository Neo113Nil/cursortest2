package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0270 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f491;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f492;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f493;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f494;

    public C0270(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f494 = interfaceC0881;
        this.f493 = jSONObject;
        this.f492 = view;
        this.f491 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f494.mo101(this.f493, this.f492, this.f491);
    }
}
