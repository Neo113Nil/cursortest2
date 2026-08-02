package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo {

    @pmi0("ad_request_id")
    private final long adRequestId;

    @pmi0("request_destination")
    private final RequestDestination requestDestination;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    public static final class RequestDestination {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestDestination[] $VALUES;

        @pmi0("applovin_banner")
        public static final RequestDestination APPLOVIN_BANNER;

        @pmi0("applovin_mrec")
        public static final RequestDestination APPLOVIN_MREC;

        @pmi0("applovin_native")
        public static final RequestDestination APPLOVIN_NATIVE;

        @pmi0("yandex_native")
        public static final RequestDestination YANDEX_NATIVE;

        static {
            RequestDestination requestDestination = new RequestDestination("APPLOVIN_NATIVE", 0);
            APPLOVIN_NATIVE = requestDestination;
            RequestDestination requestDestination2 = new RequestDestination("APPLOVIN_MREC", 1);
            APPLOVIN_MREC = requestDestination2;
            RequestDestination requestDestination3 = new RequestDestination("APPLOVIN_BANNER", 2);
            APPLOVIN_BANNER = requestDestination3;
            RequestDestination requestDestination4 = new RequestDestination("YANDEX_NATIVE", 3);
            YANDEX_NATIVE = requestDestination4;
            RequestDestination[] requestDestinationArr = {requestDestination, requestDestination2, requestDestination3, requestDestination4};
            $VALUES = requestDestinationArr;
            $ENTRIES = new asp(requestDestinationArr);
        }

        private RequestDestination(String str, int i) {
        }

        public static RequestDestination valueOf(String str) {
            return (RequestDestination) Enum.valueOf(RequestDestination.class, str);
        }

        public static RequestDestination[] values() {
            return (RequestDestination[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo(RequestDestination requestDestination, long j) {
        this.requestDestination = requestDestination;
        this.adRequestId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo = (MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo) obj;
        return this.requestDestination == mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo.requestDestination && this.adRequestId == mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo.adRequestId;
    }

    public final int hashCode() {
        return Long.hashCode(this.adRequestId) + (this.requestDestination.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedSdkRequestInfo(requestDestination=");
        sb.append(this.requestDestination);
        sb.append(", adRequestId=");
        return vu5.a(')', this.adRequestId, sb);
    }
}
