package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘂ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0775 extends AbstractRunnableC0606 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2504;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0606 f2505;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0706 f2506;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ String f2507;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ String f2508;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0433 f2509;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2510;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2511;

    public C0775(C0558 c0558, Context context, String str, AbstractC0433 abstractC0433, String str2, String str3, AbstractC0706 abstractC0706, AbstractRunnableC0606 abstractRunnableC0606) {
        this.f2504 = c0558;
        this.f2511 = context;
        this.f2510 = str;
        this.f2509 = abstractC0433;
        this.f2508 = str2;
        this.f2507 = str3;
        this.f2506 = abstractC0706;
        this.f2505 = abstractRunnableC0606;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0558 c0558 = this.f2504;
        Context context = this.f2511;
        String str = this.f2510;
        AbstractC0433 abstractC0433 = this.f2509;
        c0558.getClass();
        C0845 c0845 = TextUtils.isEmpty(str) ? null : new C0845(context, new C0918(str, c0558.f1835), c0558.f1829, c0558.f1836, abstractC0433);
        if (c0845 == null) {
            AbstractC1008.m614(this.f2505);
            return;
        }
        C0558 c05582 = this.f2504;
        Context context2 = this.f2511;
        String str2 = this.f2508;
        String str3 = this.f2507;
        AbstractC0706 abstractC0706 = this.f2506;
        AbstractC0433 abstractC04332 = this.f2509;
        AbstractRunnableC0606 abstractRunnableC0606 = this.f2505;
        c05582.getClass();
        AbstractC1008.m614(new C0692(c05582, c0845, abstractC0706, str3, true, abstractRunnableC0606, str2, abstractC04332, context2));
    }
}
