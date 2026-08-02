package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ב, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0442 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0399 f1254;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1255;

    public C0442(C0399 c0399, String str) {
        this.f1254 = c0399;
        this.f1255 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0867 c0867 = this.f1254.f1160;
        boolean isEmpty = TextUtils.isEmpty(this.f1255);
        if (isEmpty) {
            C0358 c0358 = c0867.f2886.f2876.f2873.f2793.f2589;
            String decrypt = StringFog.decrypt("1SnwxSHvyGfAMcLHauc=\n", "s0WRog+JoRU=\n");
            String decrypt2 = StringFog.decrypt("gsVX+pk=\n", "5KQ7ifwSguE=\n");
            c0358.getClass();
            C0358.m206().post(new C0396(c0358, decrypt, decrypt2));
        }
        AbstractC1008.m611(new C0897(c0867, isEmpty));
    }
}
