package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ỳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0909 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3035;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3036;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f3037;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3038 = StringFog.decrypt("qb9pzIsB0LKYlG7RjwDIuKm/acSHBQ==\n", "6tAHou5ipN0=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3039;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f3040;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final EnumC0910 f3041;

    static {
        StringFog.decrypt("D5Kb9Q==\n", "e+vrkMbjbFI=\n");
        StringFog.decrypt("asA=\n", "HK6UmfFl5wY=\n");
        StringFog.decrypt("MRZu7z+W\n", "Q3MPnFD495A=\n");
        f3037 = StringFog.decrypt("vvQTT5k=\n", "35Z8Ofyn8A4=\n");
        f3036 = StringFog.decrypt("cFWr4nU=\n", "EjDHjQKdl68=\n");
        f3035 = StringFog.decrypt("RQWADUo=\n", "IH3hbj6p1SQ=\n");
    }

    public C0909(JSONObject jSONObject) {
        char c;
        String optString = jSONObject.optString(StringFog.decrypt("5ZhUUw==\n", "keEkNldT0H4=\n"));
        int hashCode = optString.hashCode();
        if (hashCode == 92611485) {
            if (optString.equals(f3037)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 93621297) {
            if (hashCode == 96946943 && optString.equals(f3035)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals(f3036)) {
                c = 2;
            }
            c = 65535;
        }
        this.f3041 = c != 0 ? c != 1 ? c != 2 ? EnumC0910.f3046 : EnumC0910.f3044 : EnumC0910.f3045 : EnumC0910.f3043;
        String optString2 = jSONObject.optString(StringFog.decrypt("bzQ=\n", "GVpE5EX4CZ4=\n"));
        this.f3040 = TextUtils.isEmpty(optString2) ? new ArrayList() : Arrays.asList(optString2.split(StringFog.decrypt("/A==\n", "0OSpt6hzp5M=\n")));
        String optString3 = jSONObject.optString(StringFog.decrypt("j7LL+2aF\n", "/deqiAnrCG4=\n"));
        this.f3039 = (TextUtils.isEmpty(optString3) || optString3.equals(StringFog.decrypt("dsrQhg==\n", "GL+86liP7qM=\n"))) ? null : optString3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m532(String str) {
        int ordinal;
        try {
            ordinal = this.f3041.ordinal();
        } catch (Exception e) {
            AbstractC0356.m204(f3038, StringFog.decrypt("w/rly8uftaWm+//LzNO4j+/79sbV2g==\n", "hoiXpLm/3Ms=\n"), (Throwable) e, false);
        }
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
                return this.f3040.contains(str);
            }
            if (this.f3040.size() > 0) {
                return AbstractC1067.m635(str, (String) this.f3040.get(0)) < 0;
            }
        }
        return this.f3040.size() > 0 && AbstractC1067.m635(str, (String) this.f3040.get(0)) >= 0;
    }
}
