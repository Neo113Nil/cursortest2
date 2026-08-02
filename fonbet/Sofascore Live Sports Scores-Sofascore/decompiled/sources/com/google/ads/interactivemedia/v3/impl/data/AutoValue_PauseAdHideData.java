package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_PauseAdHideData extends PauseAdHideData {
    private final double fadeDuration;
    private final String pauseAdId;

    public AutoValue_PauseAdHideData(String str, double d) {
        if (str == null) {
            yhk.s("Null pauseAdId");
            throw null;
        }
        this.pauseAdId = str;
        this.fadeDuration = d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseAdHideData) {
            PauseAdHideData pauseAdHideData = (PauseAdHideData) obj;
            if (this.pauseAdId.equals(pauseAdHideData.pauseAdId()) && Double.doubleToLongBits(this.fadeDuration) == Double.doubleToLongBits(pauseAdHideData.fadeDuration())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdHideData
    public double fadeDuration() {
        return this.fadeDuration;
    }

    public int hashCode() {
        int hashCode = this.pauseAdId.hashCode() ^ 1000003;
        return ((int) ((Double.doubleToLongBits(this.fadeDuration) >>> 32) ^ Double.doubleToLongBits(this.fadeDuration))) ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdHideData
    public String pauseAdId() {
        return this.pauseAdId;
    }

    public String toString() {
        String str = this.pauseAdId;
        int length = String.valueOf(str).length();
        double d = this.fadeDuration;
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(d).length() + 1);
        wt3.A("PauseAdHideData{pauseAdId=", str, sb, ", fadeDuration=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
