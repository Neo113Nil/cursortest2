package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0665 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0664 f2268;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2269;

    public C0665(C0664 c0664, String str) {
        this.f2268 = c0664;
        this.f2269 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (this.f2268.f2263.f1842.get()) {
            return;
        }
        AbstractC0420.m250(StringFog.decrypt("m1nvWvjJCGqqe+Ba/M0Zdw==\n", "2DaBNJ2qfAU=\n"), StringFog.decrypt("ymG0u0Lw69P5ZrOoC/Lo1O1qvrtE46c=\n", "gw/dzyuRh7o=\n") + this.f2269);
        try {
            C0664 c0664 = this.f2268;
            c0664.f2263.m370(c0664.f2266, c0664.f2267, this.f2269, c0664.f2265, c0664.f2264);
        } catch (Throwable th) {
            C0527 c0527 = this.f2268.f2263.f1833;
            if (c0527 != null) {
                AbstractC1008.m610(new C0539(c0527, this.f2269, EnumC0552.f1816));
            }
            HashMap m356 = C0558.m356(this.f2268.f2263);
            String str = this.f2268.f2267;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m356.put(str, th2.toString());
            AbstractC0356.m205(StringFog.decrypt("WoO+aS9NLNRrobFpK0k9yQ==\n", "GezQB0ouWLs=\n"), StringFog.decrypt("lGbfsT0xNfG0ddm3IXZ24L56w7ssZTnx8Q==\n", "0RSt3k8RVoM=\n") + this.f2269, th, true, true, true);
        }
    }
}
