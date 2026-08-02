package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem {

    @pmi0("opened_from_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen openedFromScreen;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video_id")
    private final Long videoId;

    public MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem = (MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem) obj;
        return epx.f(this.trackCode, mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem.trackCode) && epx.f(this.ownerId, mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem.ownerId) && epx.f(this.videoId, mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem.videoId) && this.openedFromScreen == mobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem.openedFromScreen;
    }

    public final int hashCode() {
        String str = this.trackCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.openedFromScreen;
        return hashCode3 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipsOpenFullscreenItem(trackCode=" + this.trackCode + ", ownerId=" + this.ownerId + ", videoId=" + this.videoId + ", openedFromScreen=" + this.openedFromScreen + ')';
    }

    public MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem(String str, Long l, Long l2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.trackCode = str;
        this.ownerId = l;
        this.videoId = l2;
        this.openedFromScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem(String str, Long l, Long l2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
