package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingFileUploading implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("file_size")
    private final Long fileSize;

    @pmi0("file_type")
    private final MobileOfficialAppsFeedStat$PostingFileType fileType;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange timeRange;

    public MobileOfficialAppsFeedStat$PostingFileUploading() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingFileUploading)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingFileUploading mobileOfficialAppsFeedStat$PostingFileUploading = (MobileOfficialAppsFeedStat$PostingFileUploading) obj;
        return epx.f(this.timeRange, mobileOfficialAppsFeedStat$PostingFileUploading.timeRange) && this.fileType == mobileOfficialAppsFeedStat$PostingFileUploading.fileType && epx.f(this.fileSize, mobileOfficialAppsFeedStat$PostingFileUploading.fileSize) && epx.f(this.networkInfo, mobileOfficialAppsFeedStat$PostingFileUploading.networkInfo);
    }

    public final int hashCode() {
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = this.timeRange;
        int hashCode = (mobileOfficialAppsFeedStat$FeedTimeRange == null ? 0 : mobileOfficialAppsFeedStat$FeedTimeRange.hashCode()) * 31;
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType = this.fileType;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$PostingFileType == null ? 0 : mobileOfficialAppsFeedStat$PostingFileType.hashCode())) * 31;
        Long l = this.fileSize;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.networkInfo;
        return hashCode3 + (mobileOfficialAppsCoreDeviceStat$NetworkInfo != null ? mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PostingFileUploading(timeRange=" + this.timeRange + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", networkInfo=" + this.networkInfo + ')';
    }

    public MobileOfficialAppsFeedStat$PostingFileUploading(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType, Long l, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo) {
        this.timeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.fileType = mobileOfficialAppsFeedStat$PostingFileType;
        this.fileSize = l;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingFileUploading(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType, Long l, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimeRange, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$PostingFileType, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : mobileOfficialAppsCoreDeviceStat$NetworkInfo);
    }
}
