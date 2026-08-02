package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("track_code")
    private final String trackCode;

    public MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem(String str, String str2) {
        this.trackCode = str;
        this.sectionId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem = (MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem) obj;
        return epx.f(this.trackCode, mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem.trackCode) && epx.f(this.sectionId, mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem.sectionId);
    }

    public final int hashCode() {
        int hashCode = this.trackCode.hashCode() * 31;
        String str = this.sectionId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketplaceSearchViewItem(trackCode=");
        sb.append(this.trackCode);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
