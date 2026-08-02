package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0256 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f470;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f471;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f472;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f473;

    public C0256(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f473 = interfaceC0881;
        this.f472 = jSONObject;
        this.f471 = view;
        this.f470 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f473.mo98(this.f472, this.f471, this.f470);
    }
}
