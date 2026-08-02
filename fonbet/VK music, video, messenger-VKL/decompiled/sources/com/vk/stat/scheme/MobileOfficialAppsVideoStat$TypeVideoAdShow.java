package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdShow implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi eventSubtype;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoAdShow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdShow) && this.eventSubtype == ((MobileOfficialAppsVideoStat$TypeVideoAdShow) obj).eventSubtype;
    }

    public final int hashCode() {
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi = this.eventSubtype;
        if (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi == null) {
            return 0;
        }
        return mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.hashCode();
    }

    public final String toString() {
        return "TypeVideoAdShow(eventSubtype=" + this.eventSubtype + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoAdShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi) {
        this.eventSubtype = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi);
    }
}
