package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0934 implements InterfaceC0905 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3136;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3137;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3138;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3139;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3140;

    public C0934(C0776 c0776, C0499 c0499, C0950 c0950, C1102 c1102, List list) {
        this.f3136 = c0776;
        this.f3140 = c0499;
        this.f3139 = c0950;
        this.f3138 = c1102;
        this.f3137 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0905
    /* renamed from: ﾒ */
    public final void mo531(ViewOnClickListenerC0887 viewOnClickListenerC0887, View view) {
        C0499 c0499 = this.f3140;
        C0950 c0950 = this.f3139;
        C1102 c1102 = this.f3138;
        ArrayList m437 = C0776.m437(this.f3136, this.f3137, new Object[]{this, viewOnClickListenerC0887, view});
        c0499.getClass();
        c0499.m325(c0950, c0950.f3165, c1102, m437);
    }
}
