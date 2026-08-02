package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsAdsStat$TypeFeedSdkAdView implements SchemeStat$TypeView.b {

    @pmi0("sdk_ad_info")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo sdkAdInfo;

    @pmi0("sdk_ad_request_info")
    private final MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo sdkAdRequestInfo;

    @pmi0("show_attribution_condition")
    private final ShowAttributionCondition showAttributionCondition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    public static final class ShowAttributionCondition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShowAttributionCondition[] $VALUES;

        @pmi0("payed")
        public static final ShowAttributionCondition PAYED;

        @pmi0("platform")
        public static final ShowAttributionCondition PLATFORM;

        static {
            ShowAttributionCondition showAttributionCondition = new ShowAttributionCondition("PAYED", 0);
            PAYED = showAttributionCondition;
            ShowAttributionCondition showAttributionCondition2 = new ShowAttributionCondition("PLATFORM", 1);
            PLATFORM = showAttributionCondition2;
            ShowAttributionCondition[] showAttributionConditionArr = {showAttributionCondition, showAttributionCondition2};
            $VALUES = showAttributionConditionArr;
            $ENTRIES = new asp(showAttributionConditionArr);
        }

        private ShowAttributionCondition(String str, int i) {
        }

        public static ShowAttributionCondition valueOf(String str) {
            return (ShowAttributionCondition) Enum.valueOf(ShowAttributionCondition.class, str);
        }

        public static ShowAttributionCondition[] values() {
            return (ShowAttributionCondition[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsAdsStat$TypeFeedSdkAdView(MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo, ShowAttributionCondition showAttributionCondition) {
        this.sdkAdRequestInfo = mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo;
        this.sdkAdInfo = mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo;
        this.showAttributionCondition = showAttributionCondition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdView)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeFeedSdkAdView mobileOfficialAppsAdsStat$TypeFeedSdkAdView = (MobileOfficialAppsAdsStat$TypeFeedSdkAdView) obj;
        return epx.f(this.sdkAdRequestInfo, mobileOfficialAppsAdsStat$TypeFeedSdkAdView.sdkAdRequestInfo) && epx.f(this.sdkAdInfo, mobileOfficialAppsAdsStat$TypeFeedSdkAdView.sdkAdInfo) && this.showAttributionCondition == mobileOfficialAppsAdsStat$TypeFeedSdkAdView.showAttributionCondition;
    }

    public final int hashCode() {
        return this.showAttributionCondition.hashCode() + ((this.sdkAdInfo.hashCode() + (this.sdkAdRequestInfo.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeFeedSdkAdView(sdkAdRequestInfo=" + this.sdkAdRequestInfo + ", sdkAdInfo=" + this.sdkAdInfo + ", showAttributionCondition=" + this.showAttributionCondition + ')';
    }
}
