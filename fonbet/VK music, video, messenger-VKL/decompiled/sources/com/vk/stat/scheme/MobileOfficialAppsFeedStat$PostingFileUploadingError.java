package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingFileUploadingError implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("code")
    private final String code;

    @pmi0("file_size")
    private final Long fileSize;

    @pmi0("file_type")
    private final MobileOfficialAppsFeedStat$PostingFileType fileType;

    @pmi0("message")
    private final String message;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange timeRange;

    public MobileOfficialAppsFeedStat$PostingFileUploadingError() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingFileUploadingError)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingFileUploadingError mobileOfficialAppsFeedStat$PostingFileUploadingError = (MobileOfficialAppsFeedStat$PostingFileUploadingError) obj;
        return epx.f(this.timeRange, mobileOfficialAppsFeedStat$PostingFileUploadingError.timeRange) && this.fileType == mobileOfficialAppsFeedStat$PostingFileUploadingError.fileType && epx.f(this.message, mobileOfficialAppsFeedStat$PostingFileUploadingError.message) && epx.f(this.code, mobileOfficialAppsFeedStat$PostingFileUploadingError.code) && epx.f(this.fileSize, mobileOfficialAppsFeedStat$PostingFileUploadingError.fileSize) && epx.f(this.networkInfo, mobileOfficialAppsFeedStat$PostingFileUploadingError.networkInfo);
    }

    public final int hashCode() {
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = this.timeRange;
        int hashCode = (mobileOfficialAppsFeedStat$FeedTimeRange == null ? 0 : mobileOfficialAppsFeedStat$FeedTimeRange.hashCode()) * 31;
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType = this.fileType;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$PostingFileType == null ? 0 : mobileOfficialAppsFeedStat$PostingFileType.hashCode())) * 31;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.fileSize;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.networkInfo;
        return hashCode5 + (mobileOfficialAppsCoreDeviceStat$NetworkInfo != null ? mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PostingFileUploadingError(timeRange=" + this.timeRange + ", fileType=" + this.fileType + ", message=" + this.message + ", code=" + this.code + ", fileSize=" + this.fileSize + ", networkInfo=" + this.networkInfo + ')';
    }

    public MobileOfficialAppsFeedStat$PostingFileUploadingError(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType, String str, String str2, Long l, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo) {
        this.timeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.fileType = mobileOfficialAppsFeedStat$PostingFileType;
        this.message = str;
        this.code = str2;
        this.fileSize = l;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingFileUploadingError(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType, String str, String str2, Long l, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimeRange, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$PostingFileType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : mobileOfficialAppsCoreDeviceStat$NetworkInfo);
    }
}
