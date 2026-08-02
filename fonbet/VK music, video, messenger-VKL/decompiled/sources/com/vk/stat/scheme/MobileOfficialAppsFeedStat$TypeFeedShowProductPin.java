package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowProductPin implements SchemeStat$TypeAction.b {

    @pmi0("carousel_image_index")
    private final Integer carouselImageIndex;

    @pmi0("entry_point")
    private final SchemeStat$FeedPinEntryPoint entryPoint;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStat$EventItem item;

    @pmi0("video_track_code")
    private final String videoTrackCode;

    public MobileOfficialAppsFeedStat$TypeFeedShowProductPin(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str) {
        this.item = schemeStat$EventItem;
        this.entryPoint = schemeStat$FeedPinEntryPoint;
        this.carouselImageIndex = num;
        this.videoTrackCode = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowProductPin)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin = (MobileOfficialAppsFeedStat$TypeFeedShowProductPin) obj;
        return epx.f(this.item, mobileOfficialAppsFeedStat$TypeFeedShowProductPin.item) && this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedShowProductPin.entryPoint && epx.f(this.carouselImageIndex, mobileOfficialAppsFeedStat$TypeFeedShowProductPin.carouselImageIndex) && epx.f(this.videoTrackCode, mobileOfficialAppsFeedStat$TypeFeedShowProductPin.videoTrackCode);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint = this.entryPoint;
        int hashCode2 = (hashCode + (schemeStat$FeedPinEntryPoint == null ? 0 : schemeStat$FeedPinEntryPoint.hashCode())) * 31;
        Integer num = this.carouselImageIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.videoTrackCode;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedShowProductPin(item=");
        sb.append(this.item);
        sb.append(", entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", carouselImageIndex=");
        sb.append(this.carouselImageIndex);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.videoTrackCode, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedShowProductPin(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str, int i, zcl zclVar) {
        this(schemeStat$EventItem, (i & 2) != 0 ? null : schemeStat$FeedPinEntryPoint, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
