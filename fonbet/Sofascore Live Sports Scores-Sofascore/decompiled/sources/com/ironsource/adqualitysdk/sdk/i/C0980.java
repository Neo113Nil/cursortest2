package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ィ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0980 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0964 f3208;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Intent f3209;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f3210;

    public C0980(C0964 c0964, Context context, Intent intent) {
        this.f3208 = c0964;
        this.f3210 = context;
        this.f3209 = intent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0964 c0964 = this.f3208;
        C0499 c0499 = c0964.f3188;
        C0950 c0950 = c0964.f3187;
        C1102 c1102 = c0964.f3186;
        ArrayList m437 = C0776.m437(c0964.f3184, c0964.f3185, new Object[]{c0964, this.f3210, this.f3209});
        c0499.getClass();
        c0499.m325(c0950, c0950.f3165, c1102, m437);
    }
}
