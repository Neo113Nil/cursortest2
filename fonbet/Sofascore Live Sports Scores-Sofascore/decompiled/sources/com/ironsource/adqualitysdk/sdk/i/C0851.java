package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵕ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0851 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2861 = StringFog.decrypt("KEIlK0T2GR0MeDEgVOoKHxJCMitF\n", "fCtITjeCeHA=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f2862;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public long f2863;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public long f2864;

    /* renamed from: ｋ, reason: contains not printable characters */
    public long f2865;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public long f2866;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Boolean f2867 = null;

    public C0851(int i) {
        this.f2862 = i;
        AbstractC0274 m142 = AbstractC0274.m142();
        C0864 c0864 = new C0864(this);
        C0346 c0346 = (C0346) m142;
        Handler handler = c0346.f860;
        if (handler != null) {
            handler.post(new C0382(c0346, c0864));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[Catch: JSONException -> 0x0096, TryCatch #0 {JSONException -> 0x0096, blocks: (B:2:0x0000, B:4:0x0012, B:7:0x003c, B:8:0x0078, B:10:0x0085, B:11:0x0090, B:15:0x005a), top: B:1:0x0000 }] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m517(JSONObject jSONObject) {
        boolean z;
        long j;
        try {
            if (jSONObject.optInt(StringFog.decrypt("S/bm\n", "OJ+C8G9Z7L4=\n"), 1) != this.f2862 && Math.abs((this.f2865 - this.f2866) - (jSONObject.optLong(StringFog.decrypt("Eg1o\n", "dnkbrOwXuXY=\n")) - jSONObject.optLong(StringFog.decrypt("ttg=\n", "w6xBFpsjOD0=\n")))) > 10) {
                j = jSONObject.optLong(StringFog.decrypt("VZsf\n", "Me9s+hO4gEU=\n")) + this.f2863;
                jSONObject.put(StringFog.decrypt("Kf6P\n", "XY3ggmsxKLc=\n"), this.f2863);
                z = false;
                jSONObject.put(AbstractC0615.f2034, j);
                if (!this.f2867.booleanValue()) {
                    jSONObject.put(StringFog.decrypt("V0bv\n", "IzWcsIPmGTw=\n"), false);
                }
                m518(jSONObject, z);
                m519(jSONObject, z);
            }
            long optLong = jSONObject.optLong(StringFog.decrypt("JzY=\n", "UkI6bWGKyEg=\n")) + this.f2864;
            jSONObject.put(StringFog.decrypt("8qua\n", "h9/18DDwUYQ=\n"), this.f2864);
            z = true;
            j = optLong;
            jSONObject.put(AbstractC0615.f2034, j);
            if (!this.f2867.booleanValue()) {
            }
            m518(jSONObject, z);
            m519(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[Catch: JSONException -> 0x0050, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0050, blocks: (B:2:0x0000, B:6:0x0012, B:8:0x0022, B:10:0x0045, B:16:0x002a, B:18:0x003a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m519(JSONObject jSONObject, boolean z) {
        Long valueOf;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("Glep/vwnRbce\n", "djbaiqhIMNQ=\n"));
            if (optJSONObject == null) {
                return;
            }
            if (z) {
                long optLong = optJSONObject.optLong(StringFog.decrypt("fQ==\n", "COsyil9trBw=\n"));
                if (optLong > 0) {
                    valueOf = Long.valueOf(optLong + this.f2864);
                    if (valueOf == null) {
                        optJSONObject.put(StringFog.decrypt("xg==\n", "so9vmy5Xqe4=\n"), valueOf);
                        return;
                    }
                    return;
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else {
                long optLong2 = optJSONObject.optLong(StringFog.decrypt("GQ==\n", "bflW8pwRM6Q=\n"));
                if (optLong2 > 0) {
                    valueOf = Long.valueOf(optLong2 + this.f2863);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m520(JSONObject jSONObject) {
        if (!jSONObject.has(StringFog.decrypt("c/K7\n", "BobUdwMKfuM=\n")) && !jSONObject.has(StringFog.decrypt("hwSi\n", "83fNE79w1GY=\n")) && this.f2867 != null) {
            try {
                m517(jSONObject);
                return true;
            } catch (Exception e) {
                AbstractC0356.m204(f2861, StringFog.decrypt("XVnC7jzZDnB2SNjzIZcUc3FF16ErjxhnbA==\n", "GCuwgU75fQk=\n"), (Throwable) e, false);
            }
        }
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m518(JSONObject jSONObject, boolean z) {
        long optLong;
        long j;
        if (jSONObject.has(StringFog.decrypt("VsR1\n", "JbAGJkXAbuw=\n"))) {
            if (z) {
                optLong = jSONObject.optLong(StringFog.decrypt("6+EN\n", "mJR5bUmvk34=\n"));
                j = this.f2864;
            } else {
                optLong = jSONObject.optLong(StringFog.decrypt("39gB\n", "rKxycAPAZM8=\n"));
                j = this.f2863;
            }
            try {
                jSONObject.put(StringFog.decrypt("8Otd\n", "g58uN4IIGNc=\n"), optLong + j);
            } catch (JSONException unused) {
            }
        }
    }
}
