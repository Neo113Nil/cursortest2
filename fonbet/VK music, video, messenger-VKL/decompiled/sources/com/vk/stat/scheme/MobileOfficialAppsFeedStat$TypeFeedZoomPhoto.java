package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedZoomPhoto implements SchemeStat$TypeAction.b {

    @pmi0("entry_point")
    private final MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint entryPoint;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStat$EventItem item;

    @pmi0("photo_id")
    private final Integer photoId;

    @pmi0("photo_owner_id")
    private final Long photoOwnerId;

    public MobileOfficialAppsFeedStat$TypeFeedZoomPhoto(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint, Integer num, Long l) {
        this.item = schemeStat$EventItem;
        this.entryPoint = mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint;
        this.photoId = num;
        this.photoOwnerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedZoomPhoto)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto = (MobileOfficialAppsFeedStat$TypeFeedZoomPhoto) obj;
        return epx.f(this.item, mobileOfficialAppsFeedStat$TypeFeedZoomPhoto.item) && this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedZoomPhoto.entryPoint && epx.f(this.photoId, mobileOfficialAppsFeedStat$TypeFeedZoomPhoto.photoId) && epx.f(this.photoOwnerId, mobileOfficialAppsFeedStat$TypeFeedZoomPhoto.photoOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint = this.entryPoint;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint == null ? 0 : mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint.hashCode())) * 31;
        Integer num = this.photoId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.photoOwnerId;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedZoomPhoto(item=");
        sb.append(this.item);
        sb.append(", entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", photoOwnerId=");
        return iq.b(sb, this.photoOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedZoomPhoto(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint, Integer num, Long l, int i, zcl zclVar) {
        this(schemeStat$EventItem, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l);
    }
}
