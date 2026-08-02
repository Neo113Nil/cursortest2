package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem implements SchemeStat$TypeAction.b {

    @pmi0("source_type")
    private final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem sourceType;

    public MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem(MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem) {
        this.sourceType = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem) && this.sourceType == ((MobileOfficialAppsVideoStat$TypeVideoInAppReviewInitialAppearanceItem) obj).sourceType;
    }

    public final int hashCode() {
        return this.sourceType.hashCode();
    }

    public final String toString() {
        return "TypeVideoInAppReviewInitialAppearanceItem(sourceType=" + this.sourceType + ')';
    }
}
