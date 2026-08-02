package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem {

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("hashtag")
    private final String hashtag;

    public MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, Long l, Integer num, String str) {
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
        this.audioOwnerId = l;
        this.audioId = num;
        this.hashtag = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem = (MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem) obj;
        return epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem.clipItem) && epx.f(this.audioOwnerId, mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem.audioOwnerId) && epx.f(this.audioId, mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem.audioId) && epx.f(this.hashtag, mobileOfficialAppsClipsStat$TypeClipsChooseTrendItem.hashtag);
    }

    public final int hashCode() {
        int hashCode = this.clipItem.hashCode() * 31;
        Long l = this.audioOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.audioId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hashtag;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsChooseTrendItem(clipItem=");
        sb.append(this.clipItem);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", hashtag=");
        return ho8.a(sb, this.hashtag, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, Long l, Integer num, String str, int i, zcl zclVar) {
        this(mobileOfficialAppsClipsStat$TypeClipsClipItem, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
