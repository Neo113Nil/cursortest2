package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_VideoEnvironmentData extends VideoEnvironmentData {

    @Nullable
    private final Integer downloadBandwidthKbps;
    private final boolean rendersUiNatively;

    public AutoValue_VideoEnvironmentData(@Nullable Integer num, boolean z) {
        this.downloadBandwidthKbps = num;
        this.rendersUiNatively = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.VideoEnvironmentData
    @Nullable
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoEnvironmentData) {
            VideoEnvironmentData videoEnvironmentData = (VideoEnvironmentData) obj;
            Integer num = this.downloadBandwidthKbps;
            if (num != null ? num.equals(videoEnvironmentData.downloadBandwidthKbps()) : videoEnvironmentData.downloadBandwidthKbps() == null) {
                if (this.rendersUiNatively == videoEnvironmentData.rendersUiNatively()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.downloadBandwidthKbps;
        return (true != this.rendersUiNatively ? 1237 : 1231) ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.VideoEnvironmentData
    public boolean rendersUiNatively() {
        return this.rendersUiNatively;
    }

    public String toString() {
        Integer num = this.downloadBandwidthKbps;
        int length = String.valueOf(num).length();
        boolean z = this.rendersUiNatively;
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(z).length() + 1);
        sb.append("VideoEnvironmentData{downloadBandwidthKbps=");
        sb.append(num);
        sb.append(", rendersUiNatively=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
