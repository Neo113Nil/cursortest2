package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClassifiedsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem {

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem) && this.sourceScreen == ((MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem) obj).sourceScreen;
    }

    public final int hashCode() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            return 0;
        }
        return mobileOfficialAppsCoreNavStat$EventScreen.hashCode();
    }

    public final String toString() {
        return "TypeClassifiedsViewCollectionItem(sourceScreen=" + this.sourceScreen + ')';
    }

    public MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public /* synthetic */ MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
