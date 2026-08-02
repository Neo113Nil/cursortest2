package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺙ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1101 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3440;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3441;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3442;

    public C1101(C1027 c1027, Activity activity, Bundle bundle) {
        this.f3440 = c1027;
        this.f3442 = activity;
        this.f3441 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (C1027.m619(this.f3440, this.f3442)) {
            this.f3440.f3284.getClass();
            this.f3440.getClass();
            C1027 c1027 = this.f3440;
            c1027.f3281 = false;
            Bundle bundle = this.f3441;
            if (bundle == null) {
                c1027.f3282 = false;
                return;
            }
            c1027.f3282 = bundle.getBoolean(C1027.f3276);
            C1027 c10272 = this.f3440;
            if (c10272.f3282) {
                c10272.f3281 = true;
            }
            c10272.f3279 = true;
        }
    }
}
