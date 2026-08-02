package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("ref_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen refScreen;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart) && this.refScreen == ((MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart) obj).refScreen;
    }

    public final int hashCode() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.refScreen;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            return 0;
        }
        return mobileOfficialAppsCoreNavStat$EventScreen.hashCode();
    }

    public final String toString() {
        return "TypeMarketViewEmptyCart(refScreen=" + this.refScreen + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.refScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
