package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0864 implements InterfaceC0818 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0851 f2885;

    public C0864(C0851 c0851) {
        this.f2885 = c0851;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0818
    /* renamed from: ﾒ */
    public final void mo394() {
        JSONObject jSONObject;
        C0812 c0812 = ((C0346) AbstractC0274.m142()).f858;
        synchronized (c0812) {
            jSONObject = c0812.f3206;
        }
        long optLong = jSONObject.optLong(C0812.f2610, 0L);
        C0851 c0851 = this.f2885;
        if (optLong == 0) {
            c0851.f2867 = Boolean.FALSE;
            optLong = c0812.m497();
            AbstractC0356.m204(StringFog.decrypt("ODi4ahJjm1UcAqxhAn+IVwI4r2oT\n", "bFHVD2EX+jg=\n"), StringFog.decrypt("EXVpgC7AZn10YH6bKIlhdHR0fp0qhX0zIG52ii+Ubn4k\n", "VAcb71zgDxM=\n"), (Throwable) null, false);
        } else {
            c0851.f2867 = Boolean.TRUE;
        }
        this.f2885.f2866 = c0812.m496();
        this.f2885.f2865 = c0812.m497();
        C0851 c08512 = this.f2885;
        c08512.f2864 = optLong - c08512.f2866;
        c08512.f2863 = optLong - c08512.f2865;
    }
}
