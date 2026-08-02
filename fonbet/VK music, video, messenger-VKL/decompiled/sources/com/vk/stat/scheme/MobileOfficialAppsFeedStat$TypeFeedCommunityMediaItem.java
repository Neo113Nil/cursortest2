package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem implements SchemeStat$TypeClick.b {

    @pmi0("feed_item_track_code")
    private final MobileOfficialAppsFeedStat$TypeFeedItemTrackCode feedItemTrackCode;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem) && epx.f(this.feedItemTrackCode, ((MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem) obj).feedItemTrackCode);
    }

    public final int hashCode() {
        MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode = this.feedItemTrackCode;
        if (mobileOfficialAppsFeedStat$TypeFeedItemTrackCode == null) {
            return 0;
        }
        return mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.hashCode();
    }

    public final String toString() {
        return "TypeFeedCommunityMediaItem(feedItemTrackCode=" + this.feedItemTrackCode + ')';
    }

    public MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem(MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode) {
        this.feedItemTrackCode = mobileOfficialAppsFeedStat$TypeFeedItemTrackCode;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem(MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedItemTrackCode);
    }
}
