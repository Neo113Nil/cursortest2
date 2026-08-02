package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1033 implements InterfaceC0778 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1031 f3294;

    public C1033(C1031 c1031) {
        this.f3294 = c1031;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0778
    /* renamed from: ﾒ */
    public final void mo228(C1014 c1014) {
        C1047 c1047 = c1014.f3258;
        int i = c1047.f3332;
        String str = c1047.f3331;
        if (i >= 200 && i <= 299) {
            String decrypt = StringFog.decrypt("3H9A4ZfpziLu\n", "nREhje6dp0E=\n");
            AbstractC0420.m251(decrypt, decrypt, StringFog.decrypt("ZytD0L+/xW1DJ1KDrb/EfVM0WJ6t+pZ+TzYXg7vx0l1WIVmE/w==\n", "IEQ38N6fthg=\n"), this.f3294.f3292, true);
            Iterator it = this.f3294.f3291.iterator();
            while (it.hasNext()) {
                C0911 c0911 = (C0911) it.next();
                C0233 c0233 = this.f3294.f3289.f3103;
                C0290 c0290 = c0911.f3047;
                c0233.getClass();
                C0358.m206().post(new C0235(c0233, c0290));
            }
            AbstractC1008.m610(new C1104(this, c1014));
            return;
        }
        if (i == 403) {
            synchronized (this.f3294.f3289) {
                try {
                    Iterator it2 = this.f3294.f3289.f3097.iterator();
                    while (it2.hasNext()) {
                        AbstractC1008.m610(new C1106((C0985) it2.next()));
                    }
                } finally {
                }
            }
        } else {
            AbstractC0420.m250(StringFog.decrypt("sSQK6Oo7p0SD\n", "8EprhJNPzic=\n"), StringFog.decrypt("cyJsBmV8pQVHbXYGf2DsHFIibwQxY6UfSG1yBn9wiR1FI3VNMVOjHwA/ZBBhe6IYRXch\n", "IE0BYxEUzGs=\n") + i + " " + str);
        }
        AbstractC1008.m610(new C1098(this, c1014, i, str));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0778
    /* renamed from: ﾒ */
    public final void mo229(C1014 c1014, String str) {
        AbstractC1008.m610(new C1041(this, c1014, str));
    }
}
