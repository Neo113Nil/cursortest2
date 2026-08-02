package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1128 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3525;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3526;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3527;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f3528;

    public C1128(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f3528 = interfaceC0881;
        this.f3527 = jSONObject;
        this.f3526 = view;
        this.f3525 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3528.mo106(this.f3527, this.f3526, this.f3525);
    }
}
