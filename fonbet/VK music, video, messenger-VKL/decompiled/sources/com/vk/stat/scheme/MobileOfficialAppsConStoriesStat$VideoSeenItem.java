package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$VideoSeenItem {

    @pmi0("seen_duration")
    private final Integer seenDuration;

    @pmi0("video_duration")
    private final long videoDuration;

    public MobileOfficialAppsConStoriesStat$VideoSeenItem(long j, Integer num) {
        this.videoDuration = j;
        this.seenDuration = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$VideoSeenItem)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem = (MobileOfficialAppsConStoriesStat$VideoSeenItem) obj;
        return this.videoDuration == mobileOfficialAppsConStoriesStat$VideoSeenItem.videoDuration && epx.f(this.seenDuration, mobileOfficialAppsConStoriesStat$VideoSeenItem.seenDuration);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.videoDuration) * 31;
        Integer num = this.seenDuration;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSeenItem(videoDuration=");
        sb.append(this.videoDuration);
        sb.append(", seenDuration=");
        return uqi.b(sb, this.seenDuration, ')');
    }

    public /* synthetic */ MobileOfficialAppsConStoriesStat$VideoSeenItem(long j, Integer num, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : num);
    }
}
