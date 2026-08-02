package com.vk.stat.scheme;

import com.ironsource.X3;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$FeedImageLoadingEvent {

    @pmi0("image_appearing_time")
    private final int imageAppearingTime;

    @pmi0("image_load_start_time")
    private final String imageLoadStartTime;

    @pmi0("image_processing_time")
    private final int imageProcessingTime;

    @pmi0("is_cache")
    private final Boolean isCache;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("percent")
    private final float percent;

    @pmi0(X3.i.L)
    private final int position;

    @pmi0("response_time")
    private final int responseTime;

    @pmi0("response_ttfb")
    private final int responseTtfb;

    @pmi0("status")
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @pmi0(ApiUris.SCHEME_OK)
        public static final Status OK;

        @pmi0("processing_error")
        public static final Status PROCESSING_ERROR;

        @pmi0("request_error")
        public static final Status REQUEST_ERROR;

        @pmi0("timeout")
        public static final Status TIMEOUT;

        static {
            Status status = new Status("OK", 0);
            OK = status;
            Status status2 = new Status("TIMEOUT", 1);
            TIMEOUT = status2;
            Status status3 = new Status("REQUEST_ERROR", 2);
            REQUEST_ERROR = status3;
            Status status4 = new Status("PROCESSING_ERROR", 3);
            PROCESSING_ERROR = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$FeedImageLoadingEvent(int i, int i2, int i3, int i4, int i5, float f, String str, Boolean bool, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, Status status) {
        this.imageAppearingTime = i;
        this.imageProcessingTime = i2;
        this.responseTime = i3;
        this.responseTtfb = i4;
        this.position = i5;
        this.percent = f;
        this.imageLoadStartTime = str;
        this.isCache = bool;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedImageLoadingEvent)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedImageLoadingEvent mobileOfficialAppsFeedStat$FeedImageLoadingEvent = (MobileOfficialAppsFeedStat$FeedImageLoadingEvent) obj;
        return this.imageAppearingTime == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.imageAppearingTime && this.imageProcessingTime == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.imageProcessingTime && this.responseTime == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.responseTime && this.responseTtfb == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.responseTtfb && this.position == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.position && Float.compare(this.percent, mobileOfficialAppsFeedStat$FeedImageLoadingEvent.percent) == 0 && epx.f(this.imageLoadStartTime, mobileOfficialAppsFeedStat$FeedImageLoadingEvent.imageLoadStartTime) && epx.f(this.isCache, mobileOfficialAppsFeedStat$FeedImageLoadingEvent.isCache) && epx.f(this.networkInfo, mobileOfficialAppsFeedStat$FeedImageLoadingEvent.networkInfo) && this.status == mobileOfficialAppsFeedStat$FeedImageLoadingEvent.status;
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.percent, shy.a(this.position, shy.a(this.responseTtfb, shy.a(this.responseTime, shy.a(this.imageProcessingTime, Integer.hashCode(this.imageAppearingTime) * 31, 31), 31), 31), 31), 31);
        String str = this.imageLoadStartTime;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCache;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.networkInfo;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreDeviceStat$NetworkInfo == null ? 0 : mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode())) * 31;
        Status status = this.status;
        return hashCode3 + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        return "FeedImageLoadingEvent(imageAppearingTime=" + this.imageAppearingTime + ", imageProcessingTime=" + this.imageProcessingTime + ", responseTime=" + this.responseTime + ", responseTtfb=" + this.responseTtfb + ", position=" + this.position + ", percent=" + this.percent + ", imageLoadStartTime=" + this.imageLoadStartTime + ", isCache=" + this.isCache + ", networkInfo=" + this.networkInfo + ", status=" + this.status + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedImageLoadingEvent(int i, int i2, int i3, int i4, int i5, float f, String str, Boolean bool, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, Status status, int i6, zcl zclVar) {
        this(i, i2, i3, i4, i5, f, (i6 & 64) != 0 ? null : str, (i6 & 128) != 0 ? null : bool, (i6 & 256) != 0 ? null : mobileOfficialAppsCoreDeviceStat$NetworkInfo, (i6 & 512) != 0 ? null : status);
    }
}
