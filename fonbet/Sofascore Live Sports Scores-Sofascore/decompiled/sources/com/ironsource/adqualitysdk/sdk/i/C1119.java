package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1119 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3509;

    public C1119(C1027 c1027) {
        this.f3509 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        try {
            C1027 c1027 = this.f3509;
            c1027.f3283 = Class.forName(c1027.f3278.f3303);
            AbstractC1008.m610(new C1186(this));
        } catch (ClassNotFoundException e) {
            AbstractC0420.m243(StringFog.decrypt("rCYXYgI3QCSsIStqGjpYOJ8=\n", "7UVjC3ReNF0=\n"), StringFog.decrypt("73Q3ApsBW2bZciADgE9QL95pZQifRFl72SYqC8k=\n", "qgZFbekhNw8=\n") + this.f3509.f3278.f3303 + StringFog.decrypt("kd4=\n", "q/6nSK8e4fM=\n") + e.getLocalizedMessage());
        }
    }
}
