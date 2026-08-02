package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsAutorecognitionBarShowItem {

    @pmi0("content_id")
    private final int contentId;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsAutorecognitionBarShowItem(long j, int i) {
        this.ownerId = j;
        this.contentId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsAutorecognitionBarShowItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsAutorecognitionBarShowItem schemeStat$TypeClassifiedsAutorecognitionBarShowItem = (SchemeStat$TypeClassifiedsAutorecognitionBarShowItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsAutorecognitionBarShowItem.ownerId && this.contentId == schemeStat$TypeClassifiedsAutorecognitionBarShowItem.contentId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.contentId) + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsAutorecognitionBarShowItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", contentId=");
        return vu5.b(sb, this.contentId, ')');
    }
}
