package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText implements SchemeStat$TypeView.b {

    @pmi0("event_value")
    private final long eventValue;

    public MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText(long j) {
        this.eventValue = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText) && this.eventValue == ((MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText) obj).eventValue;
    }

    public final int hashCode() {
        return Long.hashCode(this.eventValue);
    }

    public final String toString() {
        return vu5.a(')', this.eventValue, new StringBuilder("TypeFeedShowFriendsLikesText(eventValue="));
    }
}
