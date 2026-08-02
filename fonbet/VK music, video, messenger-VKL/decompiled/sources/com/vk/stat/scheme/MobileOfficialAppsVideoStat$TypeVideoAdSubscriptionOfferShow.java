package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi eventSubtype;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow = (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow) obj;
        return this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow.eventSubtype && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow.screenMode;
    }

    public final int hashCode() {
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi = this.eventSubtype;
        int hashCode = (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.hashCode()) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode != null ? mobileOfficialAppsVideoStat$TypeScreenMode.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoAdSubscriptionOfferShow(eventSubtype=" + this.eventSubtype + ", screenMode=" + this.screenMode + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventSubtype = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
