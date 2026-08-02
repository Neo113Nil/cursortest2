package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0780 implements InterfaceC0699 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2514;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0606 f2515;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0706 f2516;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2517;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2518;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0433 f2519;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f2520;

    public C0780(C0558 c0558, Context context, AbstractC0433 abstractC0433, String str, String str2, AbstractC0706 abstractC0706, AbstractRunnableC0606 abstractRunnableC0606) {
        this.f2514 = c0558;
        this.f2520 = context;
        this.f2519 = abstractC0433;
        this.f2518 = str;
        this.f2517 = str2;
        this.f2516 = abstractC0706;
        this.f2515 = abstractRunnableC0606;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0699
    /* renamed from: ﾒ */
    public final void mo405(String str) {
        C0558 c0558 = this.f2514;
        Context context = this.f2520;
        AbstractC0433 abstractC0433 = this.f2519;
        c0558.getClass();
        C0845 c0845 = TextUtils.isEmpty(str) ? null : new C0845(context, new C0918(str, c0558.f1835), c0558.f1829, c0558.f1836, abstractC0433);
        C0558 c05582 = this.f2514;
        Context context2 = this.f2520;
        String str2 = this.f2518;
        String str3 = this.f2517;
        AbstractC0706 abstractC0706 = this.f2516;
        AbstractC0433 abstractC04332 = this.f2519;
        AbstractRunnableC0606 abstractRunnableC0606 = this.f2515;
        c05582.getClass();
        AbstractC1008.m614(new C0692(c05582, c0845, abstractC0706, str3, false, abstractRunnableC0606, str2, abstractC04332, context2));
    }
}
