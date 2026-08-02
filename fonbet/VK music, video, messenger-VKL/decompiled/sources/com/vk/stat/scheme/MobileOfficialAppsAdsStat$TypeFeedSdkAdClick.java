package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsAdsStat$TypeFeedSdkAdClick implements SchemeStat$TypeClick.b {

    @pmi0("sdk_ad_info")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo sdkAdInfo;

    @pmi0("sdk_ad_request_info")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo sdkAdRequestInfo;

    public MobileOfficialAppsAdsStat$TypeFeedSdkAdClick(MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo) {
        this.sdkAdRequestInfo = mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo;
        this.sdkAdInfo = mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdClick)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeFeedSdkAdClick mobileOfficialAppsAdsStat$TypeFeedSdkAdClick = (MobileOfficialAppsAdsStat$TypeFeedSdkAdClick) obj;
        return epx.f(this.sdkAdRequestInfo, mobileOfficialAppsAdsStat$TypeFeedSdkAdClick.sdkAdRequestInfo) && epx.f(this.sdkAdInfo, mobileOfficialAppsAdsStat$TypeFeedSdkAdClick.sdkAdInfo);
    }

    public final int hashCode() {
        return this.sdkAdInfo.hashCode() + (this.sdkAdRequestInfo.hashCode() * 31);
    }

    public final String toString() {
        return "TypeFeedSdkAdClick(sdkAdRequestInfo=" + this.sdkAdRequestInfo + ", sdkAdInfo=" + this.sdkAdInfo + ')';
    }
}
