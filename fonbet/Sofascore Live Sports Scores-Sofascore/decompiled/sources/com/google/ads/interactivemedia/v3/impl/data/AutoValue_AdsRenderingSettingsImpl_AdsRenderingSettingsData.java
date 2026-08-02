package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import defpackage.a70;
import defpackage.c4p;
import defpackage.e9k;
import defpackage.fn0;
import defpackage.q3p;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData extends AdsRenderingSettingsImpl.AdsRenderingSettingsData {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final q3p mimeTypes;
    private final double playAdsAfterTime;
    private final c4p uiElements;

    private AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(int i, q3p q3pVar, c4p c4pVar, boolean z, boolean z2, double d, boolean z3, int i2) {
        this.bitrate = i;
        this.mimeTypes = q3pVar;
        this.uiElements = c4pVar;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d;
        this.disableUi = z3;
        this.loadVideoTimeout = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        q3p q3pVar;
        c4p c4pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdsRenderingSettingsImpl.AdsRenderingSettingsData) {
            AdsRenderingSettingsImpl.AdsRenderingSettingsData adsRenderingSettingsData = (AdsRenderingSettingsImpl.AdsRenderingSettingsData) obj;
            if (this.bitrate == adsRenderingSettingsData.bitrate() && ((q3pVar = this.mimeTypes) != null ? q3pVar.equals(adsRenderingSettingsData.mimeTypes()) : adsRenderingSettingsData.mimeTypes() == null) && ((c4pVar = this.uiElements) != null ? c4pVar.equals(adsRenderingSettingsData.uiElements()) : adsRenderingSettingsData.uiElements() == null) && this.enablePreloading == adsRenderingSettingsData.enablePreloading() && this.enableFocusSkipButton == adsRenderingSettingsData.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(adsRenderingSettingsData.playAdsAfterTime()) && this.disableUi == adsRenderingSettingsData.disableUi() && this.loadVideoTimeout == adsRenderingSettingsData.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        q3p q3pVar = this.mimeTypes;
        int hashCode = q3pVar == null ? 0 : q3pVar.hashCode();
        int i = this.bitrate;
        c4p c4pVar = this.uiElements;
        return this.loadVideoTimeout ^ ((((((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (c4pVar != null ? c4pVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public q3p mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        c4p c4pVar = this.uiElements;
        String valueOf = String.valueOf(this.mimeTypes);
        String valueOf2 = String.valueOf(c4pVar);
        int i = this.bitrate;
        int length = String.valueOf(i).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        boolean z = this.enablePreloading;
        int length4 = String.valueOf(z).length();
        boolean z2 = this.enableFocusSkipButton;
        int length5 = String.valueOf(z2).length();
        double d = this.playAdsAfterTime;
        int length6 = String.valueOf(d).length();
        boolean z3 = this.disableUi;
        int length7 = String.valueOf(z3).length();
        int i2 = this.loadVideoTimeout;
        StringBuilder sb = new StringBuilder(length + 45 + length2 + 13 + length3 + 19 + length4 + 24 + length5 + 19 + length6 + 12 + length7 + 19 + String.valueOf(i2).length() + 1);
        fn0.s(i, "AdsRenderingSettingsData{bitrate=", ", mimeTypes=", valueOf, sb);
        sb.append(", uiElements=");
        sb.append(valueOf2);
        sb.append(", enablePreloading=");
        sb.append(z);
        sb.append(", enableFocusSkipButton=");
        sb.append(z2);
        sb.append(", playAdsAfterTime=");
        sb.append(d);
        sb.append(", disableUi=");
        sb.append(z3);
        return fn0.k(i2, ", loadVideoTimeout=", "}", sb);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public c4p uiElements() {
        return this.uiElements;
    }

    public /* synthetic */ AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(int i, q3p q3pVar, c4p c4pVar, boolean z, boolean z2, double d, boolean z3, int i2, byte[] bArr) {
        this(i, q3pVar, c4pVar, z, z2, d, z3, i2);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder {
        private int bitrate;
        private boolean disableUi;
        private boolean enableFocusSkipButton;
        private boolean enablePreloading;
        private int loadVideoTimeout;
        private q3p mimeTypes;
        private double playAdsAfterTime;
        private byte set$0;
        private c4p uiElements;

        public Builder(AdsRenderingSettingsImpl.AdsRenderingSettingsData adsRenderingSettingsData) {
            this.bitrate = adsRenderingSettingsData.bitrate();
            this.mimeTypes = adsRenderingSettingsData.mimeTypes();
            this.uiElements = adsRenderingSettingsData.uiElements();
            this.enablePreloading = adsRenderingSettingsData.enablePreloading();
            this.enableFocusSkipButton = adsRenderingSettingsData.enableFocusSkipButton();
            this.playAdsAfterTime = adsRenderingSettingsData.playAdsAfterTime();
            this.disableUi = adsRenderingSettingsData.disableUi();
            this.loadVideoTimeout = adsRenderingSettingsData.loadVideoTimeout();
            this.set$0 = (byte) 63;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData build() {
            if (this.set$0 == 63) {
                return new AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" bitrate");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" enablePreloading");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" enableFocusSkipButton");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" playAdsAfterTime");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" disableUi");
            }
            if ((this.set$0 & 32) == 0) {
                sb.append(" loadVideoTimeout");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setBitrate(int i) {
            this.bitrate = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setDisableUi(boolean z) {
            this.disableUi = z;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setEnableFocusSkipButton(boolean z) {
            this.enableFocusSkipButton = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setEnablePreloading(boolean z) {
            this.enablePreloading = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setLoadVideoTimeout(int i) {
            this.loadVideoTimeout = i;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setMimeTypes(List<String> list) {
            this.mimeTypes = list == null ? null : q3p.u(list);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setPlayAdsAfterTime(double d) {
            this.playAdsAfterTime = d;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setUiElements(Set<e9k> set) {
            c4p s;
            if (set == null) {
                s = null;
            } else {
                int i = c4p.c;
                if ((set instanceof c4p) && !(set instanceof SortedSet)) {
                    c4p c4pVar = (c4p) set;
                    if (!c4pVar.q()) {
                        s = c4pVar;
                    }
                }
                Object[] array = set.toArray();
                s = c4p.s(array.length, array);
            }
            this.uiElements = s;
            return this;
        }

        public Builder() {
        }
    }
}
