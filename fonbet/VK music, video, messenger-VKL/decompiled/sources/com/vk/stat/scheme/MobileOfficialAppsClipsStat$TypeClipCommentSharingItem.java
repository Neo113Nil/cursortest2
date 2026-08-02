package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipCommentSharingItem implements SchemeStat$TypeAction.b {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipCommentSharingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipCommentSharingItem) && epx.f(this.clipItem, ((MobileOfficialAppsClipsStat$TypeClipCommentSharingItem) obj).clipItem);
    }

    public final int hashCode() {
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        if (mobileOfficialAppsClipsStat$TypeClipsClipItem == null) {
            return 0;
        }
        return mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode();
    }

    public final String toString() {
        return "TypeClipCommentSharingItem(clipItem=" + this.clipItem + ')';
    }

    public MobileOfficialAppsClipsStat$TypeClipCommentSharingItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipCommentSharingItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
