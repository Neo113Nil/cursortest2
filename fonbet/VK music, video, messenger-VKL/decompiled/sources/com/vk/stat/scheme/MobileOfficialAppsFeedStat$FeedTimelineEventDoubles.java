package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventDoubles implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("items")
    private final List<MobileOfficialAppsFeedStat$FeedItemId> items;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$FeedTimelineEventDoubles() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventDoubles) && epx.f(this.items, ((MobileOfficialAppsFeedStat$FeedTimelineEventDoubles) obj).items);
    }

    public final int hashCode() {
        List<MobileOfficialAppsFeedStat$FeedItemId> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("FeedTimelineEventDoubles(items="), this.items);
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventDoubles(List<MobileOfficialAppsFeedStat$FeedItemId> list) {
        this.items = list;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventDoubles(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
