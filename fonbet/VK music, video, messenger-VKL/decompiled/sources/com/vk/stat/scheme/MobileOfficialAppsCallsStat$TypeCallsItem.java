package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeCallsItem implements SchemeStat$TypeClick.b {

    @pmi0("error_popup_event")
    private final MobileOfficialAppsCallsStat$ErrorPopupEvent errorPopupEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsCallsStat$TypeCallsItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsCallsStat$TypeCallsItem) && epx.f(this.errorPopupEvent, ((MobileOfficialAppsCallsStat$TypeCallsItem) obj).errorPopupEvent);
    }

    public final int hashCode() {
        MobileOfficialAppsCallsStat$ErrorPopupEvent mobileOfficialAppsCallsStat$ErrorPopupEvent = this.errorPopupEvent;
        if (mobileOfficialAppsCallsStat$ErrorPopupEvent == null) {
            return 0;
        }
        return mobileOfficialAppsCallsStat$ErrorPopupEvent.hashCode();
    }

    public final String toString() {
        return "TypeCallsItem(errorPopupEvent=" + this.errorPopupEvent + ')';
    }

    public MobileOfficialAppsCallsStat$TypeCallsItem(MobileOfficialAppsCallsStat$ErrorPopupEvent mobileOfficialAppsCallsStat$ErrorPopupEvent) {
        this.errorPopupEvent = mobileOfficialAppsCallsStat$ErrorPopupEvent;
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeCallsItem(MobileOfficialAppsCallsStat$ErrorPopupEvent mobileOfficialAppsCallsStat$ErrorPopupEvent, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCallsStat$ErrorPopupEvent);
    }
}
