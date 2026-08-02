package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipScrollAfterBite implements SchemeStat$TypeAction.b {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipScrollAfterBite() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipScrollAfterBite) && epx.f(this.clipItem, ((MobileOfficialAppsClipsStat$TypeClipScrollAfterBite) obj).clipItem);
    }

    public final int hashCode() {
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        if (mobileOfficialAppsClipsStat$TypeClipsClipItem == null) {
            return 0;
        }
        return mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode();
    }

    public final String toString() {
        return "TypeClipScrollAfterBite(clipItem=" + this.clipItem + ')';
    }

    public MobileOfficialAppsClipsStat$TypeClipScrollAfterBite(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipScrollAfterBite(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
