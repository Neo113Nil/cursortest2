package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0420;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1067;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f54;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final double f55;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long f56;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AtomicBoolean f57;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int f58;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f59;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f60;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f61;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        public String f67;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f69;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public int f68 = -1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public int f66 = -1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public AtomicBoolean f65 = null;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public long f64 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        public double f63 = -1.0d;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final HashMap f62 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f69, this.f68, this.f67, this.f66, this.f65, this.f63, this.f64, new HashMap(this.f62));
        }

        @Deprecated
        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i >= 1 && i <= 199) {
                this.f68 = i;
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setAge( " + i + " ) age must be between 1-199");
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f62.size() >= 5) {
                    AbstractC0420.m245("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) limited to 5 custom values. Ignoring custom value.");
                    return this;
                }
                boolean z = false;
                if (TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("WD6WByICYks2SM53cmc=\n", "BmX3KlhDTxE=\n"))) {
                    if (!TextUtils.isEmpty(str2)) {
                        z = str2.matches(StringFog.decrypt("WD6WByICYks2SM53cmc=\n", "BmX3KlhDTxE=\n"));
                    }
                    if (z && AbstractC1067.m638(str, 32) && AbstractC1067.m638(str2, 32)) {
                        this.f62.put("sgct_" + str, str2);
                        return this;
                    }
                }
                AbstractC0420.m245("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length");
                return this;
            } catch (Exception e) {
                e.printStackTrace();
                return this;
            }
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.b) || str.toLowerCase(locale).equals(IronSourceConstants.a.c)) {
                this.f67 = str.toLowerCase(locale);
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setGender( " + str + " ) is invalid");
            return this;
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < 999999.99d) {
                this.f63 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setIAPTotal( " + d + " ) iapt must be between 0-999999.99");
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z) {
            AtomicBoolean atomicBoolean = this.f65;
            if (atomicBoolean == null) {
                atomicBoolean = new AtomicBoolean();
                this.f65 = atomicBoolean;
            }
            atomicBoolean.set(z);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f66 = i;
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setLevel( " + i + " ) level must be between 1-999999");
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if ((TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("WD6WByICYks2SM53cmc=\n", "BmX3KlhDTxE=\n"))) && AbstractC1067.m638(str, 32)) {
                this.f69 = str;
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length");
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f64 = j;
                return this;
            }
            AbstractC0420.m245("ISAdQualitySegment Builder", "setUserCreationDate( " + j + " ) is an invalid timestamp");
            return this;
        }
    }

    public ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, HashMap hashMap) {
        this.f61 = str;
        this.f60 = i;
        this.f59 = str2;
        this.f58 = i2;
        this.f57 = atomicBoolean;
        this.f55 = d;
        this.f56 = j;
        this.f54 = hashMap;
    }

    @Deprecated
    public int getAge() {
        return this.f60;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f54;
    }

    @Deprecated
    public String getGender() {
        return this.f59;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f55;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f57;
    }

    @Deprecated
    public int getLevel() {
        return this.f58;
    }

    @Deprecated
    public String getName() {
        return this.f61;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f56;
    }
}
