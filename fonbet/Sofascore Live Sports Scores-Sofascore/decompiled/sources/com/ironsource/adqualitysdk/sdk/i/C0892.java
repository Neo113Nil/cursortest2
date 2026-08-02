package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ṭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0892 extends C0412 {

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2996 = StringFog.decrypt("x6T5GQXXN/X1j+4QEtcZ8+iv6hQIzCw=\n", "hsqYdXyjXpY=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Handler f2997;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f2998;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f2999;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f3000;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3001;

    public C0892(Context context, C0931 c0931, int i, String str, long j) {
        super(context, c0931, j);
        this.f3000 = i;
        this.f2999 = 0;
        this.f2998 = 1;
        this.f3001 = str;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("a1YkHgRtrUxZfTMXE22DSkRdNxMJdrY=\n", "KjhFcn0ZxC8=\n"));
        handlerThread.start();
        this.f2997 = new Handler(handlerThread.getLooper());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0412
    /* renamed from: ﾒ */
    public final JSONObject mo234(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        long timeInMillis;
        long elapsedRealtime;
        synchronized (this) {
            String str = AbstractC0370.f1112;
            timeInMillis = Calendar.getInstance().getTimeInMillis();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        JSONObject mo234 = super.mo234(jSONObject, z, z2, z3);
        try {
            String str2 = AbstractC0615.f2034;
            long optLong = mo234.optLong(str2);
            mo234.remove(str2);
            if (optLong != 0) {
                long j = elapsedRealtime - (timeInMillis - optLong);
                mo234.put(StringFog.decrypt("hJQf\n", "9+BsewYUIjg=\n"), timeInMillis);
                mo234.put(StringFog.decrypt("nFhm\n", "7y0SsyxzABc=\n"), elapsedRealtime);
                timeInMillis = optLong;
                elapsedRealtime = j;
            }
            mo234.put(StringFog.decrypt("T4AT\n", "K/Rg3tRwvOI=\n"), timeInMillis);
            mo234.put(StringFog.decrypt("UPc=\n", "JYNkQ3fHI7s=\n"), elapsedRealtime);
            mo234.put(StringFog.decrypt("AJneLw==\n", "c+y3S5sRp0U=\n"), this.f3001);
            mo234.put(StringFog.decrypt("8C36\n", "g0SeBXk4EJM=\n"), this.f3000);
            String decrypt = StringFog.decrypt("G3mR\n", "aBf89YBdO8A=\n");
            int i = this.f2999;
            if (i == 0) {
                i = 1;
            }
            mo234.put(decrypt, i);
            if (AbstractC0274.m142().mo143()) {
                mo234.put(StringFog.decrypt("jmEQ+A==\n", "7RJ8nN7ShNw=\n"), true);
            }
            mo234.put(StringFog.decrypt("EZMM\n", "cvR6Ne2f05Q=\n"), AbstractC0274.m142().mo155());
            C0397 c0397 = ((C0346) AbstractC0274.m142()).f856;
            if (c0397 != null) {
                String m231 = c0397.m231();
                if (!TextUtils.isEmpty(m231)) {
                    mo234.put(StringFog.decrypt("RgSt\n", "I3DZN9cv0NA=\n"), m231);
                }
                Object m233 = c0397.m233();
                if (m233 != null) {
                    mo234.put(StringFog.decrypt("SazdZw==\n", "LNipFLwUNv8=\n"), m233);
                }
            }
            if (z2) {
                m530(mo234);
            }
            return mo234;
        } catch (JSONException e) {
            String str3 = f2996;
            AbstractC0420.m252(str3, str3, StringFog.decrypt("dy90U0pmD4xXPHJVViFMm0Q4aEh1Ixif\n", "Ml0GPDhGbP4=\n"), e, null, false);
            return mo234;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m529(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C0983 c0983) {
        try {
            try {
                this.f2997.post(new C0901(this, str, jSONObject, jSONObject2, z, c0983));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m530(JSONObject jSONObject) {
        C0520 m671 = C1188.m666().m671();
        try {
            jSONObject.put(StringFog.decrypt("tdXyPXGs9zOx\n", "2bSBSSXDglA=\n"), AbstractC0523.m345(m671.f1756, m671.f1755, m671.f1754, m671.f1753));
        } catch (JSONException e) {
            String str = f2996;
            AbstractC0420.m252(str, str, StringFog.decrypt("ktEWQ6OxoX2TygpL8f2haoPMEU+5sbR218YSSb/l\n", "96NkLNGRwBk=\n"), e, null, false);
        }
    }
}
