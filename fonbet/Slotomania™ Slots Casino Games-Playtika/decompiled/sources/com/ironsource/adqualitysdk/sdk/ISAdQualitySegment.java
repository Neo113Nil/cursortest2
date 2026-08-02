package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.kn;
import com.ironsource.adqualitysdk.sdk.i.m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f66;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private double f67;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final long f68;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final int f69;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final AtomicBoolean f70;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f71;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f72;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final String f73;

    /* synthetic */ ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    private ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map<String, String> map) {
        this.f71 = str;
        this.f69 = i;
        this.f73 = str2;
        this.f72 = i2;
        this.f70 = atomicBoolean;
        this.f67 = d;
        this.f68 = j;
        this.f66 = map;
    }

    public String getName() {
        return this.f71;
    }

    public int getAge() {
        return this.f69;
    }

    public String getGender() {
        return this.f73;
    }

    public int getLevel() {
        return this.f72;
    }

    public AtomicBoolean getIsPaying() {
        return this.f70;
    }

    public double getInAppPurchasesTotal() {
        return this.f67;
    }

    public long getUserCreationDate() {
        return this.f68;
    }

    public Map<String, String> getCustomData() {
        return this.f66;
    }

    public static class Builder {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f81;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f82;

        /* renamed from: ｋ, reason: contains not printable characters */
        private double f80 = 999999.99d;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f78 = -1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f79 = -1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private AtomicBoolean f77 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private long f76 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private double f75 = -1.0d;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private Map<String, String> f74 = new HashMap();

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kn.m8471(str) && kn.m8477(str, 32)) {
                this.f82 = str;
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setSegmentName( ").append(str).append(" ) segment name must be alphanumeric and 1-32 in length").toString());
            return this;
        }

        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i <= 199) {
                this.f78 = i;
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setAge( ").append(i).append(" ) age must be between 1-199").toString());
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.a.b) || str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.a.c)) {
                this.f81 = str.toLowerCase(Locale.ENGLISH);
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setGender( ").append(str).append(" ) is invalid").toString());
            return this;
        }

        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f79 = i;
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setLevel( ").append(i).append(" ) level must be between 1-999999").toString());
            return this;
        }

        public Builder setIsPaying(boolean z) {
            if (this.f77 == null) {
                this.f77 = new AtomicBoolean();
            }
            this.f77.set(z);
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < this.f80) {
                this.f75 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setIAPTotal( ").append(d).append(" ) iapt must be between 0-").append(this.f80).toString());
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f76 = j;
                return this;
            }
            m.m8523("ISAdQualitySegment Builder", new StringBuilder("setUserCreationDate( ").append(j).append(" ) is an invalid timestamp").toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f74.size() < 5) {
                        if (kn.m8471(str) && kn.m8471(str2) && kn.m8477(str, 32) && kn.m8477(str2, 32)) {
                            this.f74.put("sgct_".concat(String.valueOf(str)), str2);
                            return this;
                        }
                        m.m8523("ISAdQualitySegment Builder", new StringBuilder("setCustomData( ").append(str).append(" , ").append(str2).append(" ) key and value must be alphanumeric and 1-32 in length").toString());
                        return this;
                    }
                    m.m8523("ISAdQualitySegment Builder", new StringBuilder("setCustomData( ").append(str).append(" , ").append(str2).append(" ) limited to 5 custom values. Ignoring custom value.").toString());
                    return this;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f82, this.f78, this.f81, this.f79, this.f77, this.f75, this.f76, new HashMap(this.f74), (byte) 0);
        }
    }
}
