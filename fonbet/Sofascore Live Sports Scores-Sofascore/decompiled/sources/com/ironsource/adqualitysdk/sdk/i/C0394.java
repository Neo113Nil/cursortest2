package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.у, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0394 implements InterfaceC0778 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f1146;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0931 f1147;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f1148;

    public C0394(C0346 c0346, Context context, C0931 c0931) {
        this.f1146 = c0346;
        this.f1148 = context;
        this.f1147 = c0931;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0778
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo228(C1014 c1014) {
        JSONObject jSONObject;
        int i;
        String str;
        try {
            C1047 c1047 = c1014.f3258;
            i = c1047.f3332;
            str = c1047.f3331;
        } catch (Exception e) {
            try {
                AbstractC0356.m205(StringFog.decrypt("mHocEQ5atLukeRgZ\n", "yh9xfno/99Q=\n"), StringFog.decrypt("Wv2hkmfBuqht/LqTcsG4rHLgp5g1gqWneea03X+Spac=\n", "H4/T/RXhysk=\n"), e, false, true, false);
            } catch (Throwable unused) {
            }
        }
        if (i >= 200 && i <= 299) {
            JSONObject jSONObject2 = !TextUtils.isEmpty(c1014.f3259) ? new JSONObject(c1014.f3259) : new JSONObject();
            if (jSONObject2.optBoolean(StringFog.decrypt("KKGj\n", "W8XPzXHOD8w=\n"))) {
                C0808.m476().m484();
            }
            String decrypt = StringFog.decrypt("dyW/PvSzYHBLJrs2\n", "JUDSUYDWIx8=\n");
            AbstractC0420.m251(decrypt, decrypt, StringFog.decrypt("tF/tFm1unG6SRuIMKG+Ka4JD+BBsPYxniUznEjI=\n", "5yqOdQgd7wg=\n"), jSONObject2, true);
            JSONObject m346 = AbstractC0523.m346(jSONObject2, false);
            C0346 c0346 = this.f1146;
            long optLong = m346.optLong(StringFog.decrypt("Qg5Mhg==\n", "Lm049fEUdpg=\n"), 0L);
            if (!c0346.f846) {
                C0358 c0358 = c0346.f862;
                c0358.getClass();
                C0358.m206().post(new C0396(c0358, C0346.f839, "" + optLong));
                c0346.f846 = true;
            }
            m346.remove(StringFog.decrypt("K0Ph\n", "WDeSYEePMhg=\n"));
            C0358 c03582 = this.f1146.f862;
            String decrypt2 = StringFog.decrypt("nLJDxdT31QCNsE/D1w==\n", "7tEsq7Kesi4=\n");
            String jSONObject3 = m346.toString();
            c03582.getClass();
            C0358.m206().post(new C0366(c03582, decrypt2, jSONObject3));
            String decrypt3 = StringFog.decrypt("k+Y=\n", "55Vc683g9yo=\n");
            String str2 = AbstractC0370.f1112;
            jSONObject2.put(decrypt3, Calendar.getInstance().getTimeInMillis());
            jSONObject2.put(StringFog.decrypt("Dww=\n", "enjMF6oSx0A=\n"), SystemClock.elapsedRealtime());
            C0346 c03462 = this.f1146;
            long j = c1014.f3257;
            c03462.getClass();
            if (jSONObject2.has(StringFog.decrypt("nll+\n", "7S0NkEmtH08=\n"))) {
                try {
                    jSONObject2.put(StringFog.decrypt("9E46\n", "hzpJhsu0h3Q=\n"), jSONObject2.optLong(StringFog.decrypt("JOXs\n", "V5GffcXQ31U=\n")) + (j / 2));
                } catch (JSONException unused2) {
                }
            }
            this.f1146.mo199(jSONObject2);
            this.f1146.m198();
            this.f1146.m194();
            C0346 c03463 = this.f1146;
            synchronized (c03463) {
                jSONObject = c03463.f3206;
            }
            m227(jSONObject.optInt(StringFog.decrypt("Y26x\n", "AA/FXpoklU4=\n"), c03463.f867));
            if (this.f1146.m195()) {
                C0346 c03464 = this.f1146;
                if (c03464.f850 == c03464.m197()) {
                    AbstractC0356.m204(StringFog.decrypt("DYW7PUGbxksxhr81\n", "X+DWUjX+hSQ=\n"), StringFog.decrypt("5FVEEeKn47rWWVoC4/W3s5dVWAT1rLOomFRTBPWss6ibEF8J7qGqvdtZTALj9bS1w1gWF+u0qrKX\nWVgO8/WxucZFUxTz\n", "tzA2Z4fVw9w=\n"), (Throwable) null, true);
                    return;
                }
                return;
            }
            return;
        }
        mo229(c1014, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0778
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo229(C1014 c1014, String str) {
        JSONObject jSONObject;
        int i = c1014 != null ? c1014.f3258.f3332 : -1;
        AbstractC0420.m245(StringFog.decrypt("4T/2V4zmvhvdPPJf\n", "s1qbOPiD/XQ=\n"), StringFog.decrypt("tB7ZnNMCvOqFGMKdxgK44J8KwpSBRKngnEzYltNUvv3LTA==\n", "8Wyr86Ei248=\n") + i);
        if (i != 403) {
            C0346 c0346 = this.f1146;
            int i2 = c0346.f850;
            c0346.f850 = i2 + 1;
            if (i2 < c0346.m197()) {
                C0346 c03462 = this.f1146;
                synchronized (c03462) {
                    jSONObject = c03462.f3206;
                }
                m227(jSONObject.optInt(StringFog.decrypt("GOAH\n", "e5Jz3/iNz0M=\n"), c03462.f868));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m227(int i) {
        synchronized (this.f1146) {
            try {
                if (this.f1146.f860 != null) {
                    AbstractC1008.m615(new C0398(this), i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
