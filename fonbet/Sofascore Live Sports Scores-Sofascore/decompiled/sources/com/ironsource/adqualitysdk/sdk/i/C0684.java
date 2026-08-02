package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.nio.charset.Charset;
import java.util.Calendar;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0684 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0643 f2326;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0699 f2327;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2328;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0473 f2329;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2330;

    public C0684(C0643 c0643, String str, AbstractC0473 abstractC0473, String str2, InterfaceC0699 interfaceC0699) {
        this.f2326 = c0643;
        this.f2330 = str;
        this.f2329 = abstractC0473;
        this.f2328 = str2;
        this.f2327 = interfaceC0699;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        String str = this.f2330;
        AbstractC0473 abstractC0473 = this.f2329;
        String str2 = this.f2328;
        InterfaceC0699 interfaceC0699 = this.f2327;
        C0331 c0331 = this.f2326.f2180.f1142;
        synchronized (c0331) {
            z = c0331.f813;
        }
        if (!z) {
            m402(abstractC0473, interfaceC0699);
            return;
        }
        try {
            C1014 m279 = AbstractC0468.m279(str);
            if (m279 == null || m279.f3258.f3332 != 200) {
                if (!this.f2326.f2180.f1142.m189()) {
                    m402(abstractC0473, interfaceC0699);
                    return;
                }
                if (m279 != null) {
                    int i = m279.f3258.f3332;
                    if ((i == 403 || i == 404) && str.contains(StringFog.decrypt("ThbsDw==\n", "K3iaINbyQRQ=\n"))) {
                        abstractC0473.f1531 = false;
                        this.f2326.m387(abstractC0473, interfaceC0699);
                        return;
                    }
                    return;
                }
                return;
            }
            String m401 = m401(m279.f3259);
            if (!Charset.forName(StringFog.decrypt("pWJ99rKl5yE=\n", "8DFQt+Hmrmg=\n")).newEncoder().canEncode(m401)) {
                AbstractC0356.m204(StringFog.decrypt("sxNpmiekqZU=\n", "4XYE9VPB7dc=\n"), StringFog.decrypt("oFRwBzXsJxaAEWABPvU9FMRXYRohvA==\n", "5DETdUycU3M=\n") + str + StringFog.decrypt("tdGoUdBLIPLmkq5R0ksl9fGSpFfFWDo=\n", "lbLHP6QqSZw=\n"), (Throwable) null, false);
                return;
            }
            if (TextUtils.isEmpty(m401)) {
                return;
            }
            C0358 c0358 = this.f2326.f2181;
            c0358.m209(str2, m401);
            String str3 = str2 + StringFog.decrypt("ec8h3VvsQAw21yU=\n", "V6NAri+ZMGg=\n");
            String str4 = AbstractC0370.f1112;
            c0358.m209(str3, Long.toString(Calendar.getInstance().getTimeInMillis()));
            AbstractC1008.m612(new C0786(interfaceC0699, str2, m401));
        } catch (Exception e) {
            if (this.f2326.f2180.f1142.m189()) {
                AbstractC0356.m204(StringFog.decrypt("nb2JG7XarjY=\n", "z9jkdMG/6nQ=\n"), ceo.e("eMyb7rA6EfZJyoDvpToE9lDRneTiSQLhVNCOoaRoGf4d\n", "Pb7pgcIadpM=\n", str), (Throwable) e, false);
            } else {
                m402(abstractC0473, interfaceC0699);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m401(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(StringFog.decrypt("Gf1x\n", "fJMStyeIJa4=\n"));
        if (TextUtils.isEmpty(optString)) {
            return str;
        }
        return AbstractC0370.m215(optString, C0643.f2177, jSONObject.optString(StringFog.decrypt("+s8=\n", "k7kYiO14WqI=\n")), jSONObject.optString(StringFog.decrypt("xKvITw==\n", "t8qkO81b+Kc=\n")));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m402(AbstractC0473 abstractC0473, InterfaceC0699 interfaceC0699) {
        C0331 c0331 = this.f2326.f2180.f1142;
        C0751 c0751 = new C0751(this, abstractC0473, interfaceC0699);
        synchronized (c0331) {
            c0331.f812.add(c0751);
        }
    }
}
