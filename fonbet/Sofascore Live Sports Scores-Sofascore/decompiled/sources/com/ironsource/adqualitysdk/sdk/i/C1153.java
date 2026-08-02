package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1153 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f3639;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f3640;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3641;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0881 f3642;

    public C1153(InterfaceC0881 interfaceC0881, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f3642 = interfaceC0881;
        this.f3641 = jSONObject;
        this.f3640 = view;
        this.f3639 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f3642.mo94(this.f3641, this.f3640, this.f3639);
    }
}
