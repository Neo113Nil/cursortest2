package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0785 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0878 f2527;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2528 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2526 = new Handler(Looper.getMainLooper());

    /* renamed from: ﻛ, reason: contains not printable characters */
    public C0801 f2525 = new C0801(this);

    public C0785(InterfaceC0878 interfaceC0878) {
        this.f2527 = interfaceC0878;
        AbstractC0430 m262 = AbstractC0430.m262();
        C0801 c0801 = this.f2525;
        synchronized (m262) {
            m262.f1224.add(c0801);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m449() {
        this.f2526.removeCallbacksAndMessages(null);
        if (this.f2525 != null) {
            AbstractC0430 m262 = AbstractC0430.m262();
            C0801 c0801 = this.f2525;
            synchronized (m262) {
                m262.f1224.remove(c0801);
            }
            this.f2525 = null;
        }
    }
}
