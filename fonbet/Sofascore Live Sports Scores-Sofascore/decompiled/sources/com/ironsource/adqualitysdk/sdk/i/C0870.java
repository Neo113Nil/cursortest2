package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0870 implements InterfaceC0726 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0726 f2889;

    public C0870(InterfaceC0726 interfaceC0726) {
        this.f2889 = interfaceC0726;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0726
    /* renamed from: ﾒ */
    public final boolean mo132(ViewOnTouchListenerC0702 viewOnTouchListenerC0702, View view, MotionEvent motionEvent) {
        AbstractC1008.m611(new C0883(this, viewOnTouchListenerC0702, view, motionEvent));
        return false;
    }
}
