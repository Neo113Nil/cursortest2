package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem implements SchemeStat$TypeAction.b {

    @pmi0("circle_owner_id")
    private final Long circleOwnerId;

    @pmi0("common_track_code")
    private final String commonTrackCode;

    @pmi0("user_id")
    private final Long userId;

    public MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem = (MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem) obj;
        return epx.f(this.userId, mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem.userId) && epx.f(this.commonTrackCode, mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem.commonTrackCode) && epx.f(this.circleOwnerId, mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem.circleOwnerId);
    }

    public final int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.commonTrackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.circleOwnerId;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeStoryFeedViewItem(userId=");
        sb.append(this.userId);
        sb.append(", commonTrackCode=");
        sb.append(this.commonTrackCode);
        sb.append(", circleOwnerId=");
        return iq.b(sb, this.circleOwnerId, ')');
    }

    public MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem(Long l, String str, Long l2) {
        this.userId = l;
        this.commonTrackCode = str;
        this.circleOwnerId = l2;
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem(Long l, String str, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2);
    }
}
