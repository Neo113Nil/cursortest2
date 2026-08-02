package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔫ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0731 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0692 f2440;

    public C0731(C0692 c0692) {
        this.f2440 = c0692;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0527 c0527;
        boolean mo216;
        if (C0558.m356(this.f2440.f2340).containsKey(this.f2440.f2347.f2792.f3076) || (c0527 = this.f2440.f2340.f1833) == null) {
            return;
        }
        AbstractC1008.m610(new C0539(c0527, this.f2440.f2347.f2792.f3076, EnumC0552.f1819));
        C0692 c0692 = this.f2440;
        JSONObject m360 = C0558.m360(c0692.f2340, c0692.f2347);
        try {
            m360.put(StringFog.decrypt("URqf\n", "MGzsYxYKJqs=\n"), false);
        } catch (JSONException unused) {
        }
        C0558.m359(this.f2440.f2340).put(this.f2440.f2347.f2792.f3076, m360);
        C0543 m349 = c0527.m349(this.f2440.f2347.f2792.f3076);
        String m351 = m349 != null ? m349.m351(m349.f1793) : null;
        C0558.m356(this.f2440.f2340).put(this.f2440.f2347.f2792.f3076, m351);
        C0845 c0845 = this.f2440.f2347;
        synchronized (c0845) {
            mo216 = c0845.f2789.mo216();
        }
        if (mo216) {
            ISAdQualityInitListener m369 = this.f2440.f2340.m369();
            ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
            StringBuilder sb = new StringBuilder();
            ceo.g(this.f2440.f2347.f2792.f3075, "ogGuNcLZm8/xG6Uwwg==\n", sb, "gnLKXuKv/r0=\n");
            sb.append(this.f2440.f2347.f2789.m268());
            sb.append(StringFog.decrypt("gkl0n0CL+DbRG0KBWo/mMoJIdYUVlO8h0VJ+gBU=\n", "ojsR7jXiilM=\n"));
            sb.append(this.f2440.f2347.m513());
            ((C0972) m369).adQualitySdkInitFailed(iSAdQualityInitError, AbstractC1133.m662("jqVncyN6YoLc\n", "rsoVU00fFec=\n", sb));
        }
        AbstractC0356.m205(StringFog.decrypt("v34Kc/p2qa6OXAVz/nK4sw==\n", "/BFkHZ8V3cE=\n"), m351, null, true, true, false);
    }
}
