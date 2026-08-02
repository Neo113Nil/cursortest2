package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ŧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0232 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0257 f436;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0245 f437;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f438;

    public C0232(ViewGroup viewGroup, C0245 c0245, ViewOnLayoutChangeListenerC0257 viewOnLayoutChangeListenerC0257) {
        this.f438 = viewGroup;
        this.f437 = c0245;
        this.f436 = viewOnLayoutChangeListenerC0257;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f438.addView(this.f437, new ViewGroup.LayoutParams(-1, -1));
        this.f438.removeOnLayoutChangeListener(this.f436);
        this.f438.addOnLayoutChangeListener(this.f436);
    }
}
