package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    public MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem) && epx.f(this.clipItem, ((MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem) obj).clipItem);
    }

    public final int hashCode() {
        return this.clipItem.hashCode();
    }

    public final String toString() {
        return "TypeClipsOpenOwnerFromSubscriptionSnackbarItem(clipItem=" + this.clipItem + ')';
    }
}
