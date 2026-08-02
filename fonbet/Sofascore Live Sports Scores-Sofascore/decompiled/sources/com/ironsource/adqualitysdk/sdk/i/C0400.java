package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.є, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0400 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f1162;

    public C0400(C0346 c0346) {
        this.f1162 = c0346;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0392 c0392;
        C0346 c0346 = this.f1162;
        synchronized (c0346) {
            c0392 = c0346.f861;
        }
        boolean m189 = c0392.f1142.m189();
        C0346 c03462 = this.f1162;
        if (!m189) {
            C0808 c0808 = c03462.f852.f3340.f3011;
            C0808.m482(c0808.f2587, ISAdQualityInitError.NO_NETWORK_CONNECTION, StringFog.decrypt("XpmzqcWECKVinbOkz54Rr3OC+qjO\n", "EPaTx6Dwf8o=\n"));
            return;
        }
        if (c03462.mo150()) {
            return;
        }
        C0808 c08082 = this.f1162.f852.f3340.f3011;
        C0808.m482(c08082.f2587, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, StringFog.decrypt("OLTJ3ldedmEYk/GaVW9cLRKI5txvTDdhHobsmnJCemgekvw=\n", "ceeIugYrFw0=\n"));
    }
}
