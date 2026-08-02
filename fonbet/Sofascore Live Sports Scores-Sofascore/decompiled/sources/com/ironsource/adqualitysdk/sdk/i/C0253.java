package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ȉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0253 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f464;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f465;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f466;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f467;

    public C0253(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f467 = interfaceC0881;
        this.f466 = jSONObject;
        this.f465 = view;
        this.f464 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f467.mo96(this.f466, this.f465, this.f464);
    }
}
