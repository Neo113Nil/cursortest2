package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime implements SchemeStat$TypeView.b {

    @pmi0("times")
    private final List<MobileOfficialAppsFeedStat$TypeMrcViewPostTime> times;

    public MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime(List<MobileOfficialAppsFeedStat$TypeMrcViewPostTime> list) {
        this.times = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime) && epx.f(this.times, ((MobileOfficialAppsFeedStat$TypeFeedMrcViewPostTime) obj).times);
    }

    public final int hashCode() {
        return this.times.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TypeFeedMrcViewPostTime(times="), this.times);
    }
}
