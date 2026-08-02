package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick implements SchemeStat$TypeClick.b {

    @pmi0("carousel_image_index")
    private final Integer carouselImageIndex;

    @pmi0("entry_point")
    private final SchemeStat$FeedPinEntryPoint entryPoint;

    @pmi0("video_track_code")
    private final String videoTrackCode;

    public MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick = (MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick.entryPoint && epx.f(this.carouselImageIndex, mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick.carouselImageIndex) && epx.f(this.videoTrackCode, mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick.videoTrackCode);
    }

    public final int hashCode() {
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint = this.entryPoint;
        int hashCode = (schemeStat$FeedPinEntryPoint == null ? 0 : schemeStat$FeedPinEntryPoint.hashCode()) * 31;
        Integer num = this.carouselImageIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.videoTrackCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedHideProductPinClick(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", carouselImageIndex=");
        sb.append(this.carouselImageIndex);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.videoTrackCode, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick(SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str) {
        this.entryPoint = schemeStat$FeedPinEntryPoint;
        this.carouselImageIndex = num;
        this.videoTrackCode = str;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick(SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : schemeStat$FeedPinEntryPoint, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
