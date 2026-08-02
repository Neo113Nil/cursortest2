package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem {

    @pmi0("content_id")
    private final int contentId;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem(long j, int i) {
        this.ownerId = j;
        this.contentId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem = (SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem.ownerId && this.contentId == schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem.contentId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.contentId) + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsAutorecognitionRevertBarClickItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", contentId=");
        return vu5.b(sb, this.contentId, ')');
    }
}
