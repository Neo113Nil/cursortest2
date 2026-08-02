package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Τ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0346 extends AbstractC0274 {

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f839;

    /* renamed from: Ḹ, reason: contains not printable characters */
    public C0931 f844;

    /* renamed from: Ḽ, reason: contains not printable characters */
    public volatile long f845;

    /* renamed from: Ṿ, reason: contains not printable characters */
    public boolean f846;

    /* renamed from: Ὑ, reason: contains not printable characters */
    public ArrayList f847;

    /* renamed from: Ῠ, reason: contains not printable characters */
    public C0841 f848;

    /* renamed from: Ῡ, reason: contains not printable characters */
    public boolean f849;

    /* renamed from: Ὺ, reason: contains not printable characters */
    public int f850;

    /* renamed from: Ύ, reason: contains not printable characters */
    public boolean f851;

    /* renamed from: K, reason: contains not printable characters */
    public C1053 f852;

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public ArrayList f853;

    /* renamed from: Ↄ, reason: contains not printable characters */
    public ArrayList f854;

    /* renamed from: く, reason: contains not printable characters */
    public C1051 f855;

    /* renamed from: っ, reason: contains not printable characters */
    public C0397 f856;

    /* renamed from: へ, reason: contains not printable characters */
    public C0555 f857;

    /* renamed from: ゥ, reason: contains not printable characters */
    public C0812 f858;

    /* renamed from: ト, reason: contains not printable characters */
    public M f859;

    /* renamed from: リ, reason: contains not printable characters */
    public Handler f860;

    /* renamed from: ヮ, reason: contains not printable characters */
    public C0392 f861;

    /* renamed from: ヶ, reason: contains not printable characters */
    public C0358 f862;

    /* renamed from: 丫, reason: contains not printable characters */
    public final String f863;

    /* renamed from: 乁, reason: contains not printable characters */
    public final String f864;

    /* renamed from: 爫, reason: contains not printable characters */
    public final int f865;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public final int f866;

    /* renamed from: טּ, reason: contains not printable characters */
    public final int f867;

    /* renamed from: סּ, reason: contains not printable characters */
    public final int f868;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final String f869;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final String f870;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f871;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f872;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f873;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f874;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String f875;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String f876;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String f877;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f878;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f879;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f880;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f881 = StringFog.decrypt("mQjN\n", "/Ga7mlktvo0=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f843 = StringFog.decrypt("apl4eXBtZrtWmnxx\n", "OPwVFgQIJdQ=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f842 = StringFog.decrypt("bImc6fSPG119i5Dv9w==\n", "Hurzh5LmfHM=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f841 = StringFog.decrypt("RsdEcJZDnUZZm05l3UWeC0DQSHyHRJ9KXNNMdA==\n", "MrUlE/Mh/CU=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f840 = StringFog.decrypt("djdanjSVeaRgO0eWLNlgpWY3W5U=\n", "BVg181j0VNc=\n");

    static {
        StringFog.decrypt("e9Fa\n", "CLU2f2Wg5Rk=\n");
        f839 = StringFog.decrypt("T5zY7Vv1/bwNn9f5Adf2o02W1f4a5sy9R5LC7yH99KhQh9fnBQ==\n", "I/O2inWUmc0=\n");
    }

    public C0346() {
        StringFog.decrypt("xAJ8\n", "oW8YeS/YzMQ=\n");
        this.f880 = StringFog.decrypt("mNZg/w==\n", "+7EMiwn2vVk=\n");
        this.f879 = StringFog.decrypt("Ued5kQ==\n", "MpQV5Uap7Fk=\n");
        this.f878 = StringFog.decrypt("94mzHQ==\n", "meDWbb+Q0to=\n");
        this.f877 = StringFog.decrypt("PP3uxA==\n", "XYmapl2kk3w=\n");
        this.f876 = StringFog.decrypt("ZhrrSw==\n", "BWmHL+uFQbo=\n");
        this.f875 = StringFog.decrypt("lYev\n", "5uvLig2/d0Y=\n");
        this.f874 = StringFog.decrypt("+VTHBQ==\n", "ijW2diDeG/g=\n");
        this.f873 = StringFog.decrypt("mLEL\n", "+8Zo/8Y1LDQ=\n");
        this.f872 = StringFog.decrypt("5cEU\n", "kLJgx12ALzM=\n");
        this.f871 = StringFog.decrypt("csbTMA==\n", "H7K3RErZv0w=\n");
        this.f870 = StringFog.decrypt("a2mk\n", "BgDXx/okp9I=\n");
        this.f869 = StringFog.decrypt("jiKvsA==\n", "/UHc2anHVNU=\n");
        this.f868 = 5000;
        this.f867 = 43200000;
        this.f866 = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        this.f865 = 10000;
        this.f864 = StringFog.decrypt("+hPz\n", "n32QHLUr2Os=\n");
        this.f863 = StringFog.decrypt("QG+d\n", "d0GtYq3bUcA=\n");
        this.f850 = 0;
        this.f847 = null;
        this.f846 = false;
        this.f845 = 0L;
    }

    /* renamed from: 乁, reason: contains not printable characters */
    public final synchronized void m193() {
        this.f851 = false;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    public final synchronized void m194() {
        Handler handler = this.f860;
        if (handler != null) {
            handler.post(new C0390(this));
        }
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    public final boolean m195() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(this.f864, false);
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public final synchronized C0392 m196() {
        return this.f861;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public final int m197() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optInt(StringFog.decrypt("Q9wqag==\n", "Lr9GGHYfryo=\n"), 3);
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public final void m198() {
        if (mo148()) {
            C1074 c1074 = C1074.f3373;
            c1074.getClass();
            try {
                if (c1074.f3376 != null) {
                    return;
                }
                synchronized (c1074) {
                    try {
                        if (c1074.f3376 != null) {
                            return;
                        }
                        C0332 c0332 = C0750.f2474.f2477;
                        C1112 m190 = c0332 == null ? null : c0332.m190();
                        if (m190 != null) {
                            c1074.f3376 = m190;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                String str = C1074.f3374;
                AbstractC0420.m252(str, str, StringFog.decrypt("AdpY7YqJ4mwxlE37np74ayXRQvzNnepxJNFI\n", "SLQsiO37ixg=\n"), e, null, false);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﭖ */
    public final boolean mo143() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(this.f876);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﭴ */
    public final synchronized void mo144() {
        this.f860.removeCallbacksAndMessages(null);
        this.f860 = null;
        AbstractC1008.m610(new C0425(this));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﭸ */
    public final boolean mo145() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(this.f874);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﮉ */
    public final boolean mo146() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(StringFog.decrypt("Bu/05Q==\n", "dImXhF/x6uA=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﮌ */
    public final boolean mo147() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(StringFog.decrypt("BC+g\n", "dkvFWDp0++Q=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﮐ */
    public final boolean mo148() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(this.f870, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﱟ */
    public final boolean mo149() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optBoolean(StringFog.decrypt("sKsr\n", "1c1Y9Bh5P4Y=\n"), false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﱡ */
    public final synchronized boolean mo150() {
        return this.f851;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﺙ */
    public final String mo151() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = m597().optString(StringFog.decrypt("Kx1wuQ==\n", "T2kUzW7clF8=\n"));
        return TextUtils.isEmpty(optString) ? this.f3205.f3308.optString(C1037.f3306, C1037.f3304) : optString;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﻐ */
    public final HashMap mo152() {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        try {
            synchronized (this) {
                jSONObject = this.f3206;
            }
            String optString = jSONObject.optString(StringFog.decrypt("3PMw\n", "uJBDdLQvE5M=\n"));
            if (TextUtils.isEmpty(optString)) {
                return hashMap;
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap2.put(next, new C0909(jSONObject2.optJSONObject(next)));
            }
            return hashMap2;
        } catch (JSONException e) {
            AbstractC0356.m204(f843, StringFog.decrypt("vGcUG84pTbrZcgMA/2ZKupx2EhvOenC7vXwVFd5lQQ==\n", "+RVmdLwJJNQ=\n"), (Throwable) e, false);
            return hashMap;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﻛ */
    public final int mo153() {
        int optInt;
        synchronized (this) {
            optInt = m597().optInt(this.f875, 100);
        }
        return optInt;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ｋ */
    public final int mo154() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optInt(this.f879, this.f865);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﾇ */
    public final String mo155() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optString(StringFog.decrypt("Ct4p\n", "ablfFXaT97g=\n"), this.f863);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﾒ */
    public final void mo157(Context context, C0931 c0931, boolean z) {
        boolean z2;
        JSONObject jSONObject;
        String str = AbstractC0370.f1112;
        this.f845 = SystemClock.elapsedRealtime();
        this.f844 = c0931;
        if (z) {
            C0400 c0400 = new C0400(this);
            C0346 c0346 = (C0346) AbstractC0274.m142();
            synchronized (c0346) {
                jSONObject = c0346.f3206;
            }
            AbstractC1008.m613(c0400, jSONObject.optInt(c0346.f880, c0346.f866));
        }
        m193();
        JSONObject jSONObject2 = new JSONObject();
        boolean z3 = true;
        try {
            String m208 = this.f862.m208(f839);
            jSONObject2 = new C0412(context, c0931, !TextUtils.isEmpty(m208) ? Long.parseLong(m208) : 0L).mo234(new JSONObject(), m196().f1142.m189(), true, false);
        } catch (JSONException e) {
            String str2 = f843;
            AbstractC0420.m252(str2, str2, StringFog.decrypt("LE0jsgfMJHgMXiW0G4tnaAhMNP0QmiJkHQ==\n", "aT9R3XXsRwo=\n"), e, null, false);
        }
        C0392 m196 = m196();
        C0841 c0841 = this.f848;
        String decrypt = StringFog.decrypt("+9bQKA==\n", "kri5XDyYMTE=\n");
        String str3 = c0841.f2783;
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder(str3);
        sb.append(StringFog.decrypt("bg==\n", "QVcxtFVfygY=\n"));
        if (decrypt == null) {
            decrypt = "";
        }
        sb.append(decrypt);
        String sb2 = sb.toString();
        if (!m195() || this.f850 == m197()) {
            z2 = true;
            z3 = false;
        } else {
            z2 = true;
        }
        C0394 c0394 = new C0394(this, context, c0931);
        m196.getClass();
        if (TextUtils.isEmpty(sb2)) {
            String str4 = C0392.f1140;
            AbstractC0420.m246(str4, str4, StringFog.decrypt("7fITs0Q4ot3XvAK+Wymiys3vBr5FffDMyekXolx958DM9BejCAjQ5ZjzAPFaOPHZ1/IBtGA87M3U\n+QDxXzjwzJjyHaUILfDGzvUWtEw=\n", "uJxy0Shdgqk=\n"), z2);
            return;
        }
        C0451 c0451 = new C0451(jSONObject2, sb2, c0931, context, z3);
        if (m196.f1141) {
            AbstractC0420.m243(C0392.f1140, StringFog.decrypt("2wX+DWXTyzz8GPoNbp3ac6gD/R5l1stO7RvmDXnJjmvgD/1IRNjaa+cY+CVr08977RizH2vOjm/g\nH+cMZcrA\n", "iGqTaAq9rhw=\n"));
            return;
        }
        C0393 c0393 = new C0393(m196, c0394, c0451);
        String str5 = AbstractC0370.f1112;
        try {
            Executors.newSingleThreadExecutor().execute(c0393);
        } catch (Throwable th) {
            AbstractC0356.m204(AbstractC0370.f1112, StringFog.decrypt("624OELRd4FDLfwkLrxPiCM9vBRGlXfFJ3Xc=\n", "rhx8f8Z9hSg=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0274
    /* renamed from: ﾒ */
    public final void mo156(Context context, C0392 c0392, C0841 c0841, C1053 c1053, boolean z) {
        JSONObject jSONObject;
        this.f862 = new C0358(context, f841, f840);
        this.f861 = c0392;
        this.f851 = false;
        this.f849 = z;
        this.f848 = c0841;
        this.f860 = new Handler(Looper.getMainLooper());
        C1037 c1037 = new C1037();
        this.f859 = new M(c1037);
        this.f858 = new C0812(c1037);
        this.f857 = new C0555(c1037);
        this.f856 = new C0397();
        String m208 = this.f862.m208(f842);
        if (m208 != null) {
            try {
                jSONObject = new JSONObject(m208);
            } catch (JSONException unused) {
            }
            mo199(jSONObject);
            this.f3205 = c1037;
            this.f852 = c1053;
            this.f854 = new ArrayList();
            this.f853 = new ArrayList();
        }
        jSONObject = new JSONObject();
        mo199(jSONObject);
        this.f3205 = c1037;
        this.f852 = c1053;
        this.f854 = new ArrayList();
        this.f853 = new ArrayList();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0978
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void mo199(JSONObject jSONObject) {
        try {
            if (jSONObject.has(StringFog.decrypt("O6UDneli\n", "T9di9J0RArI=\n"))) {
                AbstractC0523.m348(jSONObject, jSONObject.optJSONObject(StringFog.decrypt("9fHRgHDF\n", "gYOw6QS2y6g=\n")), false);
            }
            super.mo199(jSONObject);
            this.f859.mo199(jSONObject);
            this.f858.mo199(jSONObject);
            this.f857.mo199(jSONObject);
            this.f856.mo199(jSONObject);
        } catch (Throwable th) {
            throw th;
        }
    }
}
