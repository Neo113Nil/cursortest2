package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƫ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0244 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0233 f454;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0927 f455;

    public C0244(C0233 c0233, C0927 c0927) {
        this.f454 = c0233;
        this.f455 = c0927;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        int i;
        C0233 c0233 = this.f454;
        C0358 c0358 = c0233.f439;
        String o = mz1.o(new StringBuilder(), c0233.f440, StringFog.decrypt("AQ==\n", "K+CfICOY70I=\n"));
        C0715 c0715 = c0358.f901;
        c0715.getClass();
        try {
            i = c0715.f2420.m407(o);
        } catch (Throwable unused) {
            i = 0;
        }
        AbstractC1008.m610(new C0247(this, i));
    }
}
