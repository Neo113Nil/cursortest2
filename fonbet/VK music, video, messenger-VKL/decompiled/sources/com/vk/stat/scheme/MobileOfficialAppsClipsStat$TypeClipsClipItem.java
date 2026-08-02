package com.vk.stat.scheme;

import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsClipItem {

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    @pmi0("video_track_code")
    private final String videoTrackCode;

    public MobileOfficialAppsClipsStat$TypeClipsClipItem(int i, long j, String str) {
        this.videoId = i;
        this.videoOwnerId = j;
        this.videoTrackCode = str;
    }

    public final int a() {
        return this.videoId;
    }

    public final long b() {
        return this.videoOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsClipItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = (MobileOfficialAppsClipsStat$TypeClipsClipItem) obj;
        return this.videoId == mobileOfficialAppsClipsStat$TypeClipsClipItem.videoId && this.videoOwnerId == mobileOfficialAppsClipsStat$TypeClipsClipItem.videoOwnerId && epx.f(this.videoTrackCode, mobileOfficialAppsClipsStat$TypeClipsClipItem.videoTrackCode);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.videoId) * 31, 31, this.videoOwnerId);
        String str = this.videoTrackCode;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsClipItem(videoId=");
        sb.append(this.videoId);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.videoTrackCode, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsClipItem(int i, long j, String str, int i2, zcl zclVar) {
        this(i, j, (i2 & 4) != 0 ? null : str);
    }
}
