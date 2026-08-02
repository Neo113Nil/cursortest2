package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedItemId {

    @pmi0("clip_item_id")
    private final MobileOfficialAppsFeedStat$FeedClipItemId clipItemId;

    @pmi0("type")
    private final String type;

    @pmi0("wall_item_id")
    private final MobileOfficialAppsFeedStat$FeedWallItemId wallItemId;

    public MobileOfficialAppsFeedStat$FeedItemId(String str, MobileOfficialAppsFeedStat$FeedWallItemId mobileOfficialAppsFeedStat$FeedWallItemId, MobileOfficialAppsFeedStat$FeedClipItemId mobileOfficialAppsFeedStat$FeedClipItemId) {
        this.type = str;
        this.wallItemId = mobileOfficialAppsFeedStat$FeedWallItemId;
        this.clipItemId = mobileOfficialAppsFeedStat$FeedClipItemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedItemId)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedItemId mobileOfficialAppsFeedStat$FeedItemId = (MobileOfficialAppsFeedStat$FeedItemId) obj;
        return epx.f(this.type, mobileOfficialAppsFeedStat$FeedItemId.type) && epx.f(this.wallItemId, mobileOfficialAppsFeedStat$FeedItemId.wallItemId) && epx.f(this.clipItemId, mobileOfficialAppsFeedStat$FeedItemId.clipItemId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsFeedStat$FeedWallItemId mobileOfficialAppsFeedStat$FeedWallItemId = this.wallItemId;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$FeedWallItemId == null ? 0 : mobileOfficialAppsFeedStat$FeedWallItemId.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedClipItemId mobileOfficialAppsFeedStat$FeedClipItemId = this.clipItemId;
        return hashCode2 + (mobileOfficialAppsFeedStat$FeedClipItemId != null ? mobileOfficialAppsFeedStat$FeedClipItemId.hashCode() : 0);
    }

    public final String toString() {
        return "FeedItemId(type=" + this.type + ", wallItemId=" + this.wallItemId + ", clipItemId=" + this.clipItemId + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedItemId(String str, MobileOfficialAppsFeedStat$FeedWallItemId mobileOfficialAppsFeedStat$FeedWallItemId, MobileOfficialAppsFeedStat$FeedClipItemId mobileOfficialAppsFeedStat$FeedClipItemId, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$FeedWallItemId, (i & 4) != 0 ? null : mobileOfficialAppsFeedStat$FeedClipItemId);
    }
}
