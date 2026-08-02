package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɾ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0281 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f506;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ D f507;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f508;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f509;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f510;

    public C0281(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, D d, KeyEvent.Callback callback) {
        this.f510 = interfaceC0881;
        this.f509 = jSONObject;
        this.f508 = view;
        this.f507 = d;
        this.f506 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f510.mo104(this.f509, this.f508, this.f507, this.f506);
    }
}
