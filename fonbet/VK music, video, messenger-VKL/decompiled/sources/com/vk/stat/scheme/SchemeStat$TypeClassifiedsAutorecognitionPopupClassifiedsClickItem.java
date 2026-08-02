package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem {

    @pmi0("draft_id")
    private final long draftId;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem(long j, long j2) {
        this.ownerId = j;
        this.draftId = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem = (SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem.ownerId && this.draftId == schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem.draftId;
    }

    public final int hashCode() {
        return Long.hashCode(this.draftId) + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsAutorecognitionPopupClassifiedsClickItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", draftId=");
        return vu5.a(')', this.draftId, sb);
    }
}
