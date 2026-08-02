package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsSwipedItem {

    @pmi0("clip_id")
    private final Integer clipId;

    @pmi0("owner_id")
    private final Long ownerId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipsSwipedItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsSwipedItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsSwipedItem mobileOfficialAppsClipsStat$TypeClipsSwipedItem = (MobileOfficialAppsClipsStat$TypeClipsSwipedItem) obj;
        return epx.f(this.clipId, mobileOfficialAppsClipsStat$TypeClipsSwipedItem.clipId) && epx.f(this.ownerId, mobileOfficialAppsClipsStat$TypeClipsSwipedItem.ownerId);
    }

    public final int hashCode() {
        Integer num = this.clipId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.ownerId;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsSwipedItem(clipId=");
        sb.append(this.clipId);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public MobileOfficialAppsClipsStat$TypeClipsSwipedItem(Integer num, Long l) {
        this.clipId = num;
        this.ownerId = l;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsSwipedItem(Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}
