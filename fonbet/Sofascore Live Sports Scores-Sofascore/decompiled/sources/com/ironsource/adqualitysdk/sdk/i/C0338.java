package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ί, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0338 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0331 f830;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f831;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Intent f832;

    public C0338(C0331 c0331, Intent intent, Context context) {
        this.f830 = c0331;
        this.f832 = intent;
        this.f831 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        try {
            if (this.f832.getAction().equals(StringFog.decrypt("i9H2//lB4s+E2uaj9Ufoj8T83cPYbcW1o+nb2c93xamr8dXI\n", "6r+SjZYohuE=\n"))) {
                String str = C0331.f811;
                AbstractC0420.m250(str, StringFog.decrypt("UVPJEOEpcdV8WdMJ6zhunGlfyR6uOHKUcVHY\n", "Hza9Z45bGvU=\n"));
                if (this.f832.getBooleanExtra(StringFog.decrypt("TqvQhLC1MbtUreWCqqI=\n", "IMST697bVNg=\n"), false)) {
                    AbstractC0420.m250(str, StringFog.decrypt("Z9cSaVEpaohd0Fd1UXpux0HUV3hbYHfNUMsebV16YA==\n", "M793GzQOGag=\n"));
                    AbstractC1008.m610(new C0379(this));
                } else if (C0331.m187(this.f830, this.f831)) {
                    AbstractC1008.m610(new C0373(this));
                } else {
                    AbstractC1008.m610(new C0372(this));
                }
            }
        } catch (Exception e) {
            AbstractC0356.m204(C0331.f811, StringFog.decrypt("2Zp3/VKUVVG8h2vARddZVuqN\n", "nOgFkiC0PD8=\n"), (Throwable) e, false);
        }
    }
}
