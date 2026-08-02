package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0664 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2263;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0606 f2264;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0706 f2265;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2266;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2267;

    public C0664(C0558 c0558, String str, Context context, AbstractC0706 abstractC0706, AbstractRunnableC0606 abstractRunnableC0606) {
        this.f2263 = c0558;
        this.f2267 = str;
        this.f2266 = context;
        this.f2265 = abstractC0706;
        this.f2264 = abstractRunnableC0606;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (this.f2263.f1842.get()) {
            return;
        }
        String lowerCase = this.f2267.toLowerCase();
        C0527 c0527 = this.f2263.f1833;
        if (c0527 == null) {
            return;
        }
        c0527.f1763.put(lowerCase, new C0543(lowerCase));
        AbstractC1008.m614(new C0665(this, lowerCase));
    }
}
