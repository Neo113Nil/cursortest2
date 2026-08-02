package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingPickerOpening implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("picker_type")
    private final MobileOfficialAppsFeedStat$PickerType pickerType;

    @pmi0("time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange timeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$PostingPickerOpening() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingPickerOpening)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingPickerOpening mobileOfficialAppsFeedStat$PostingPickerOpening = (MobileOfficialAppsFeedStat$PostingPickerOpening) obj;
        return epx.f(this.timeRange, mobileOfficialAppsFeedStat$PostingPickerOpening.timeRange) && this.pickerType == mobileOfficialAppsFeedStat$PostingPickerOpening.pickerType;
    }

    public final int hashCode() {
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = this.timeRange;
        int hashCode = (mobileOfficialAppsFeedStat$FeedTimeRange == null ? 0 : mobileOfficialAppsFeedStat$FeedTimeRange.hashCode()) * 31;
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = this.pickerType;
        return hashCode + (mobileOfficialAppsFeedStat$PickerType != null ? mobileOfficialAppsFeedStat$PickerType.hashCode() : 0);
    }

    public final String toString() {
        return "PostingPickerOpening(timeRange=" + this.timeRange + ", pickerType=" + this.pickerType + ')';
    }

    public MobileOfficialAppsFeedStat$PostingPickerOpening(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType) {
        this.timeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.pickerType = mobileOfficialAppsFeedStat$PickerType;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingPickerOpening(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimeRange, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$PickerType);
    }
}
