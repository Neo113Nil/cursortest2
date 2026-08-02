package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.fn0;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_TimeUpdateData extends TimeUpdateData {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    public AutoValue_TimeUpdateData(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
        if (str != null) {
            this.timeUnit = str;
        } else {
            yhk.s("Null timeUnit");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeUpdateData) {
            TimeUpdateData timeUpdateData = (TimeUpdateData) obj;
            if (this.currentTime == timeUpdateData.currentTime() && this.duration == timeUpdateData.duration() && this.timeUnit.equals(timeUpdateData.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.duration;
        long j2 = this.currentTime;
        int i = (int) (j ^ (j >>> 32));
        return this.timeUnit.hashCode() ^ ((i ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        int length = String.valueOf(j).length();
        long j2 = this.duration;
        int length2 = String.valueOf(j2).length();
        String str = this.timeUnit;
        StringBuilder sb = new StringBuilder(wt3.h(length, 38, length2, 11, String.valueOf(str).length()) + 1);
        fn0.t(j, "TimeUpdateData{currentTime=", ", duration=", sb);
        sb.append(j2);
        sb.append(", timeUnit=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
