package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0897 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0867 f3009;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3010;

    public C0897(C0867 c0867, boolean z) {
        this.f3009 = c0867;
        this.f3010 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String str;
        HashMap hashMap;
        C0926 c0926 = this.f3009.f2886.f2876.f2873.f2793.f2590;
        String decrypt = StringFog.decrypt("C58kHPeXqw==\n", "f+97dZn+39w=\n");
        C0846 c0846 = this.f3009.f2886.f2876.f2873;
        if (c0846.f2796) {
            str = c0846.f2795;
            if (str == null) {
                str = StringFog.decrypt("2SEITA==\n", "t1RkIA6exfs=\n");
            }
        } else {
            str = null;
        }
        C0558 c0558 = this.f3009.f2886.f2876.f2873.f2793.f2593;
        new C0682(this.f3009.f2886.f2876.f2873.f2793.f2595);
        C0808 c0808 = this.f3009.f2886.f2876.f2873.f2793;
        Context context = c0808.f2595;
        boolean z = this.f3010;
        C0931 m479 = C0808.m479(c0808);
        String str2 = AbstractC0409.f1172;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(StringFog.decrypt("Xg0=\n", "OH6rQOE/BFw=\n"), true);
            } catch (JSONException e) {
                String str3 = AbstractC0409.f1172;
                AbstractC0420.m252(str3, str3, StringFog.decrypt("noxe/jzc3EG+n1j4IJufR76SSeEhjssTspBF5W627HyV\n", "2/4skU78vzM=\n"), e, null, false);
            }
        }
        if (m479.f3111) {
            jSONObject.put(StringFog.decrypt("eWiSXQM=\n", "GB3mNGfJ9SA=\n"), true);
        }
        jSONObject.put(StringFog.decrypt("xVP+jw==\n", "tSaX6zx0QzE=\n"), str);
        long j = ((C0346) AbstractC0274.m142()).f845;
        if (j > 0) {
            String decrypt2 = StringFog.decrypt("wOXq\n", "qZeO/FrPvMs=\n");
            String str4 = AbstractC0370.f1112;
            jSONObject.put(decrypt2, SystemClock.elapsedRealtime() - j);
        }
        AbstractC0523.m348(jSONObject, c0558.m367(), false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            synchronized (c0558) {
                hashMap = c0558.f1837;
            }
            Iterator it = new HashSet(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                jSONObject3.put(str5, (String) c0558.m368().get(str5));
            }
            jSONObject2.put(StringFog.decrypt("AFnsiA==\n", "ZSue+9RHMi8=\n"), jSONObject3);
        } catch (JSONException e2) {
            String str6 = C0558.f1828;
            AbstractC0420.m252(str6, str6, StringFog.decrypt("4kT2I/1K2ejDX+orrwnX4slT5zjgGJjp1UTrPvw=\n", "pzaETI9quIw=\n"), e2, null, false);
        }
        AbstractC0523.m348(jSONObject, jSONObject2, false);
        c0926.m556(decrypt, jSONObject);
        C0846 c08462 = this.f3009.f2886.f2876.f2873;
        if (c08462.f2794) {
            C0926 c09262 = c08462.f2793.f2590;
            c09262.getClass();
            AbstractC1008.m611(new C0997(c09262));
        }
    }
}
