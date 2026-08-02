package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTime {

    @pmi0("time")
    private final String time;

    public MobileOfficialAppsFeedStat$FeedTime(String str) {
        this.time = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTime) && epx.f(this.time, ((MobileOfficialAppsFeedStat$FeedTime) obj).time);
    }

    public final int hashCode() {
        return this.time.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FeedTime(time="), this.time, ')');
    }
}
