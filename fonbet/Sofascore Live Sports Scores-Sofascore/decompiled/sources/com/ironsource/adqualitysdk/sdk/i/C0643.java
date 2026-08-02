package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0643 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2177;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f2178 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f2179;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0392 f2180;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0358 f2181;

    static {
        StringFog.decrypt("+kH8yatz8lU=\n", "qCSRpt8Wthc=\n");
        StringFog.decrypt("dY4DbLlA9R1q0gl58kb2UHOZD2CoR/Ac\n", "AfxiD9wilH4=\n");
        StringFog.decrypt("lW/3z4xPw/aDY+rHlAPa4YQ=\n", "5gCYouAu7oU=\n");
        f2177 = StringFog.decrypt("UZA868GTs6wZ7x2/5pHt6zfFRLHI1aexFtIK9tmWpLFY8AG225bwukDeB+7IxfGsAd5G487S5rYh\n2RrI2e/xiBrSH+KGig==\n", "daBzhq2nlN8=\n");
    }

    public C0643(Context context, C0392 c0392, String str) {
        this.f2181 = new C0358(context, StringFog.decrypt("iRa0bZa1X3iWSr543bNcNY8BuGGHslp5\n", "/WTVDvPXPhs=\n"), StringFog.decrypt("Wa+T7c0spPBPo47l1WC950g=\n", "KsD8gKFNiYM=\n"));
        this.f2180 = c0392;
        this.f2179 = str;
        AbstractC0274 m142 = AbstractC0274.m142();
        C0821 c0821 = new C0821(this);
        C0346 c0346 = (C0346) m142;
        Handler handler = c0346.f860;
        if (handler != null) {
            handler.post(new C0382(c0346, c0821));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m385(AbstractC0473 abstractC0473, InterfaceC0699 interfaceC0699) {
        AbstractC0473 abstractC04732;
        JSONObject jSONObject;
        if (abstractC0473 instanceof C0528) {
            AbstractC0274 m142 = AbstractC0274.m142();
            C0346 c0346 = (C0346) m142;
            synchronized (c0346) {
                jSONObject = c0346.f3206;
            }
            if (jSONObject.has(StringFog.decrypt("jDtt\n", "71wbC0NVsRk=\n"))) {
                String mo155 = m142.mo155();
                if (!mo155.equals(abstractC0473.f1533)) {
                    abstractC04732 = ((C0528) abstractC0473).mo340(mo155);
                    String mo291 = abstractC04732.mo291();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m386());
                    String m255 = AbstractC0424.m255("5A==\n", "y0PxVfqX3Ac=\n", sb, mo291);
                    String replace = abstractC04732.mo291().replace(StringFog.decrypt("0Q==\n", "/s8tCROW0lA=\n"), StringFog.decrypt("hA==\n", "qhE2pP1ceB4=\n"));
                    if (AbstractC0274.m142().mo147()) {
                        return;
                    }
                    if (AbstractC0274.m142().mo146() || this.f2181.m208(replace) == null) {
                        C0684 c0684 = new C0684(this, m255, abstractC0473, replace, interfaceC0699);
                        String str = AbstractC0370.f1112;
                        try {
                            Executors.newSingleThreadExecutor().execute(c0684);
                            return;
                        } catch (Throwable th) {
                            AbstractC0356.m204(AbstractC0370.f1112, StringFog.decrypt("624OELRd4FDLfwkLrxPiCM9vBRGlXfFJ3Xc=\n", "rhx8f8Z9hSg=\n"), th, false);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        abstractC04732 = abstractC0473;
        String mo2912 = abstractC04732.mo291();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m386());
        String m2552 = AbstractC0424.m255("5A==\n", "y0PxVfqX3Ac=\n", sb2, mo2912);
        String replace2 = abstractC04732.mo291().replace(StringFog.decrypt("0Q==\n", "/s8tCROW0lA=\n"), StringFog.decrypt("hA==\n", "qhE2pP1ceB4=\n"));
        if (AbstractC0274.m142().mo147()) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m387(AbstractC0473 abstractC0473, InterfaceC0699 interfaceC0699) {
        boolean z;
        if (TextUtils.isEmpty(abstractC0473.f1535) || TextUtils.isEmpty(abstractC0473.f1533)) {
            return null;
        }
        String replace = abstractC0473.mo291().replace(StringFog.decrypt("0Q==\n", "/s8tCROW0lA=\n"), StringFog.decrypt("hA==\n", "qhE2pP1ceB4=\n"));
        synchronized (this) {
            try {
                if (AbstractC0274.m142().mo150()) {
                    z = true;
                } else {
                    this.f2178.add(new C0794(this, abstractC0473, interfaceC0699));
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m385(abstractC0473, interfaceC0699);
        }
        return this.f2181.m208(replace);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m386() {
        return this.f2179;
    }
}
