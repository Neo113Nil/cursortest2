package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚁ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0788 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2532;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2533;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2534;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0845 f2535;

    public C0788(C0558 c0558, C0845 c0845, String str, String str2) {
        this.f2532 = c0558;
        this.f2535 = c0845;
        this.f2534 = str;
        this.f2533 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        JSONObject jSONObject;
        JSONObject m360 = C0558.m360(this.f2532, this.f2535);
        m360.put(StringFog.decrypt("1rQ=\n", "s8xjQpQuvE4=\n"), true);
        C0558.m359(this.f2532).put(this.f2535.f2792.f3076, m360);
        String m268 = this.f2535.f2789.m268();
        C0527 c0527 = this.f2532.f1833;
        if (StringFog.decrypt("Ndhj8v6Y3mQ=\n", "cZEws7zUmyA=\n").equals(m268)) {
            AbstractC0420.m250(StringFog.decrypt("RNhSLosvthV1+l0ujyunCA==\n", "B7c8QO5Mwno=\n"), this.f2535.f2792.f3075 + StringFog.decrypt("1Y7gUTn1zYuan69WJLDKloaM7VMy9A==\n", "9e2PP1eQrv8=\n"));
            if (c0527 != null) {
                AbstractC1008.m610(new C0536(c0527, this.f2534, EnumC0546.f1805));
            }
        } else if (this.f2532.m374(this.f2534)) {
            AbstractC0420.m250(StringFog.decrypt("gTZdn/RTsZqwFFKf8Feghw==\n", "wlkz8ZEwxfU=\n"), this.f2535.f2792.f3075 + StringFog.decrypt("b2zTGLOv/y8gfZwBvLm8PyZ83RSxr/h7KX3TG/2+9D5vfNkEq6/u\n", "Tw+8dt3KnFs=\n"));
            if (c0527 != null) {
                AbstractC1008.m610(new C0536(c0527, this.f2534, EnumC0546.f1805));
            }
            m360.put(StringFog.decrypt("D8XG\n", "a6a12glH3mM=\n"), true);
        } else {
            this.f2532.getClass();
            C0346 c0346 = (C0346) AbstractC0274.m142();
            synchronized (c0346) {
                jSONObject = c0346.f3206;
            }
            if (!jSONObject.optBoolean(c0346.f873)) {
                C0558 c0558 = this.f2532;
                C0845 c0845 = this.f2535;
                c0558.getClass();
                if (!C0558.f1827.equals(m268) && (TextUtils.isEmpty(m268) || AbstractC1067.m635(m268, c0845.f2792.f3073) < 0 || AbstractC1067.m635(m268, c0845.f2792.f3072) > 0)) {
                    m360.put(StringFog.decrypt("NEwC\n", "RzpxskkvXyg=\n"), false);
                    if (c0527 != null) {
                        AbstractC1008.m610(new C0539(c0527, this.f2534, EnumC0552.f1818));
                    }
                    String decrypt = StringFog.decrypt("VJXTwEZ9FAllt9zAQnkFFA==\n", "F/q9riMeYGY=\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2533);
                    AbstractC0356.m205(decrypt, AbstractC1133.m662("Ye8GglvePIo44wGCRsQ42i70AcdRkSrTYfIdxxXSJ8Qv4xbWWsM=\n", "QYZ1ojWxSKo=\n", AbstractC1072.m642("JcKtQmfaZ/V2+IZnZw==\n", "BZHpCUesAoc=\n", sb, m268)), null, true, true, false);
                    if (this.f2535.m512()) {
                        ISAdQualityInitListener m369 = this.f2532.m369();
                        ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                        StringBuilder sb2 = new StringBuilder();
                        ceo.g(this.f2535.f2792.f3075, "KfrKdZd4Ikh6wOFQlw==\n", sb2, "CamOPrcORzo=\n");
                        sb2.append(this.f2535.f2789.m268());
                        ((C0972) m369).adQualitySdkInitFailed(iSAdQualityInitError, AbstractC1133.m662("Uyswk80JPDsKJzeT0BM4axwwN9bHRipiUzYr1oMFJ3UdJyDHzBQ=\n", "c0JDs6NmSBs=\n", sb2));
                    }
                }
            }
            AbstractC1008.m614(new C0789(this));
            ((ArrayList) C0558.m358(this.f2532)).add(this.f2535);
        }
        m360.remove(StringFog.decrypt("Tgo=\n", "K3Igwxkkcm8=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo137(Throwable th) {
        C0527 c0527 = this.f2532.f1833;
        if (c0527 != null) {
            AbstractC1008.m610(new C0539(c0527, this.f2534, EnumC0552.f1815));
        }
        AbstractC0356.m205(StringFog.decrypt("9a6woH4J66vEjL+geg36tg==\n", "tsHezhtqn8Q=\n"), StringFog.decrypt("0cp6W/HAILr9zGFV74kzvfrfKFfsjiex98xnRqM=\n", "lLgINIPgSdQ=\n") + this.f2534, th, true, true, true);
    }
}
