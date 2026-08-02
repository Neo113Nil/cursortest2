package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḻ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0883 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0870 f2903;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f2904;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f2905;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC0702 f2906;

    public C0883(C0870 c0870, ViewOnTouchListenerC0702 viewOnTouchListenerC0702, View view, MotionEvent motionEvent) {
        this.f2903 = c0870;
        this.f2906 = viewOnTouchListenerC0702;
        this.f2905 = view;
        this.f2904 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f2903.f2889.mo132(this.f2906, this.f2905, this.f2904);
    }
}
