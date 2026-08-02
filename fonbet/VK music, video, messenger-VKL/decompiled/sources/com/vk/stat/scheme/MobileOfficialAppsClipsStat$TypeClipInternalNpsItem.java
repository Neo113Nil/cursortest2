package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipInternalNpsItem {

    @pmi0("poll_id")
    private final int pollId;

    public MobileOfficialAppsClipsStat$TypeClipInternalNpsItem(int i) {
        this.pollId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipInternalNpsItem) && this.pollId == ((MobileOfficialAppsClipsStat$TypeClipInternalNpsItem) obj).pollId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pollId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TypeClipInternalNpsItem(pollId="), this.pollId, ')');
    }
}
