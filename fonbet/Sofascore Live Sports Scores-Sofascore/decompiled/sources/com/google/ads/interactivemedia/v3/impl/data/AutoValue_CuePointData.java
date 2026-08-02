package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.fn0;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_CuePointData extends CuePointData {
    private final double end;
    private final boolean played;
    private final double start;

    public AutoValue_CuePointData(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CuePointData) {
            CuePointData cuePointData = (CuePointData) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(cuePointData.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(cuePointData.end()) && this.played == cuePointData.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double start() {
        return this.start;
    }

    public String toString() {
        double d = this.start;
        int length = String.valueOf(d).length();
        double d2 = this.end;
        int length2 = String.valueOf(d2).length();
        boolean z = this.played;
        StringBuilder sb = new StringBuilder(wt3.h(length, 25, length2, 9, String.valueOf(z).length()) + 1);
        fn0.A(sb, "CuePointData{start=", d, ", end=");
        sb.append(d2);
        sb.append(", played=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
