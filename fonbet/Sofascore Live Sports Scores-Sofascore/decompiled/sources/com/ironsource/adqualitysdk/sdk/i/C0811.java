package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴬ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0811 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0799 f2605;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2606;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2607;

    public C0811(C0799 c0799, String str, Activity activity) {
        this.f2605 = c0799;
        this.f2607 = str;
        this.f2606 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1102.m648(this.f2605.f2551, this.f2607, false, false, Collections.singletonList(this.f2606));
    }
}
