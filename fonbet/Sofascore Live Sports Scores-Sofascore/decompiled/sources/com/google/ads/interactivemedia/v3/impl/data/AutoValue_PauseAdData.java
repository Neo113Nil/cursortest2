package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
import com.google.ads.interactivemedia.v3.impl.data.PauseAdData;
import defpackage.a70;
import defpackage.fn0;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_PauseAdData extends PauseAdData {
    private final String clickThroughUrl;
    private final double fadeDuration;
    private final int height;
    private final double scaleTolerance;
    private final String src;

    @Nullable
    private final AdViewData.Type type;
    private final boolean useMask;
    private final int width;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends PauseAdData.Builder {
        private String clickThroughUrl;
        private double fadeDuration;
        private int height;
        private double scaleTolerance;
        private byte set$0;
        private String src;
        private AdViewData.Type type;
        private boolean useMask;
        private int width;

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData autoBuild() {
            String str;
            String str2;
            if (this.set$0 == 31 && (str = this.src) != null && (str2 = this.clickThroughUrl) != null) {
                return new AutoValue_PauseAdData(str, this.height, this.width, this.type, this.scaleTolerance, this.fadeDuration, this.useMask, str2, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.src == null) {
                sb.append(" src");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" height");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" width");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" scaleTolerance");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" fadeDuration");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" useMask");
            }
            if (this.clickThroughUrl == null) {
                sb.append(" clickThroughUrl");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setClickThroughUrl(String str) {
            if (str != null) {
                this.clickThroughUrl = str;
                return this;
            }
            yhk.s("Null clickThroughUrl");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setFadeDuration(double d) {
            this.fadeDuration = d;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setHeight(int i) {
            this.height = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setScaleTolerance(double d) {
            this.scaleTolerance = d;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setSrc(String str) {
            if (str != null) {
                this.src = str;
                return this;
            }
            yhk.s("Null src");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setType(AdViewData.Type type) {
            this.type = type;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setUseMask(boolean z) {
            this.useMask = z;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData.Builder
        public PauseAdData.Builder setWidth(int i) {
            this.width = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }
    }

    private AutoValue_PauseAdData(String str, int i, int i2, @Nullable AdViewData.Type type, double d, double d2, boolean z, String str2) {
        this.src = str;
        this.height = i;
        this.width = i2;
        this.type = type;
        this.scaleTolerance = d;
        this.fadeDuration = d2;
        this.useMask = z;
        this.clickThroughUrl = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        AdViewData.Type type;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseAdData) {
            PauseAdData pauseAdData = (PauseAdData) obj;
            if (this.src.equals(pauseAdData.src()) && this.height == pauseAdData.height() && this.width == pauseAdData.width() && ((type = this.type) != null ? type.equals(pauseAdData.type()) : pauseAdData.type() == null) && Double.doubleToLongBits(this.scaleTolerance) == Double.doubleToLongBits(pauseAdData.scaleTolerance()) && Double.doubleToLongBits(this.fadeDuration) == Double.doubleToLongBits(pauseAdData.fadeDuration()) && this.useMask == pauseAdData.useMask() && this.clickThroughUrl.equals(pauseAdData.clickThroughUrl())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public double fadeDuration() {
        return this.fadeDuration;
    }

    public int hashCode() {
        int hashCode = this.src.hashCode() ^ 1000003;
        AdViewData.Type type = this.type;
        return this.clickThroughUrl.hashCode() ^ (((((((((((((hashCode * 1000003) ^ this.height) * 1000003) ^ this.width) * 1000003) ^ (type == null ? 0 : type.hashCode())) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.scaleTolerance) >>> 32) ^ Double.doubleToLongBits(this.scaleTolerance)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.fadeDuration) >>> 32) ^ Double.doubleToLongBits(this.fadeDuration)))) * 1000003) ^ (true != this.useMask ? 1237 : 1231)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public double scaleTolerance() {
        return this.scaleTolerance;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public String src() {
        return this.src;
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        String str = this.src;
        int length = String.valueOf(str).length();
        int i = this.height;
        int length2 = String.valueOf(i).length();
        int i2 = this.width;
        int length3 = String.valueOf(i2).length();
        int length4 = valueOf.length();
        double d = this.scaleTolerance;
        int length5 = String.valueOf(d).length();
        double d2 = this.fadeDuration;
        int length6 = String.valueOf(d2).length();
        boolean z = this.useMask;
        int length7 = String.valueOf(z).length();
        String str2 = this.clickThroughUrl;
        StringBuilder sb = new StringBuilder(length + 25 + length2 + 8 + length3 + 7 + length4 + 17 + length5 + 15 + length6 + 10 + length7 + 18 + String.valueOf(str2).length() + 1);
        wt3.t(i, "PauseAdData{src=", str, ", height=", sb);
        fn0.s(i2, ", width=", ", type=", valueOf, sb);
        fn0.A(sb, ", scaleTolerance=", d, ", fadeDuration=");
        sb.append(d2);
        sb.append(", useMask=");
        sb.append(z);
        return wt3.m(", clickThroughUrl=", str2, sb, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    @Nullable
    public AdViewData.Type type() {
        return this.type;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public boolean useMask() {
        return this.useMask;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdData
    public int width() {
        return this.width;
    }

    public /* synthetic */ AutoValue_PauseAdData(String str, int i, int i2, AdViewData.Type type, double d, double d2, boolean z, String str2, byte[] bArr) {
        this(str, i, i2, type, d, d2, z, str2);
    }
}
