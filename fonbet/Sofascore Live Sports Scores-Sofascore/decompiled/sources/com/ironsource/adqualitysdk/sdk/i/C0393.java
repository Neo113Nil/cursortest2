package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.т, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0393 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0392 f1143;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0451 f1144;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0778 f1145;

    public C0393(C0392 c0392, InterfaceC0778 interfaceC0778, C0451 c0451) {
        this.f1143 = c0392;
        this.f1145 = interfaceC0778;
        this.f1144 = c0451;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        InterfaceC0778 interfaceC0778 = this.f1145;
        C0451 c0451 = this.f1144;
        C0331 c0331 = this.f1143.f1142;
        synchronized (c0331) {
            z = c0331.f813;
        }
        if (!z) {
            m226(interfaceC0778, c0451);
            return;
        }
        try {
            C1014 m281 = AbstractC0468.m281(c0451.f1303, c0451.f1302, c0451.f1301, c0451.f1300, c0451.f1299);
            if (m281 == null) {
                AbstractC1008.m610(new C0404(m281, interfaceC0778));
                return;
            }
            String str = m281.f3259;
            AbstractC0420.m244(StringFog.decrypt("M7mWvMOF96kcsoOsyYU=\n", "fdziy6z3nOQ=\n"), StringFog.decrypt("ymioCHfcMOjuZLlbZdwx+P53s0ZlmWP7/2ixCGWZMevodfxff4grvelmqEks3A==\n", "jQfcKBb8Q50=\n") + str);
            AbstractC1008.m610(new C0408(m281, interfaceC0778));
        } catch (Exception e) {
            interfaceC0778.mo229(null, StringFog.decrypt("0g+pNUiNHPvoQbsySowc7PISvDhJyE7q9hStJFDI\n", "h2HIVyToPI8=\n") + e.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m226(InterfaceC0778 interfaceC0778, C0451 c0451) {
        C0331 c0331 = this.f1143.f1142;
        C0395 c0395 = new C0395(this, interfaceC0778, c0451);
        synchronized (c0331) {
            c0331.f812.add(c0395);
        }
    }
}
