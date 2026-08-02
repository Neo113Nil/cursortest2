package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest implements SchemeStat$TypeAction.b {

    @pmi0("received_ads")
    private final List<MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo> receivedAds;

    @pmi0("received_amount")
    private final int receivedAmount;

    @pmi0("request_amount")
    private final int requestAmount;

    @pmi0("request_duration")
    private final long requestDuration;

    @pmi0("sdk_ad_request_info")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo sdkAdRequestInfo;

    public MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest(MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, long j, int i, int i2, List<MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo> list) {
        this.sdkAdRequestInfo = mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo;
        this.requestDuration = j;
        this.requestAmount = i;
        this.receivedAmount = i2;
        this.receivedAds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest = (MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest) obj;
        return epx.f(this.sdkAdRequestInfo, mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.sdkAdRequestInfo) && this.requestDuration == mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.requestDuration && this.requestAmount == mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.requestAmount && this.receivedAmount == mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.receivedAmount && epx.f(this.receivedAds, mobileOfficialAppsAdsStat$TypeFeedSdkAdRequest.receivedAds);
    }

    public final int hashCode() {
        int a = shy.a(this.receivedAmount, shy.a(this.requestAmount, bh10.a(this.sdkAdRequestInfo.hashCode() * 31, 31, this.requestDuration), 31), 31);
        List<MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo> list = this.receivedAds;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedSdkAdRequest(sdkAdRequestInfo=");
        sb.append(this.sdkAdRequestInfo);
        sb.append(", requestDuration=");
        sb.append(this.requestDuration);
        sb.append(", requestAmount=");
        sb.append(this.requestAmount);
        sb.append(", receivedAmount=");
        sb.append(this.receivedAmount);
        sb.append(", receivedAds=");
        return ms9.a(')', sb, this.receivedAds);
    }

    public /* synthetic */ MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest(MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, long j, int i, int i2, List list, int i3, zcl zclVar) {
        this(mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, j, i, i2, (i3 & 16) != 0 ? null : list);
    }
}
