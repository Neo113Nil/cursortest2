package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsContentItem {

    @pmi0("item_id")
    private final long itemId;

    @pmi0("item_type")
    private final String itemType;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsContentItem(long j, String str, long j2) {
        this.ownerId = j;
        this.itemType = str;
        this.itemId = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsContentItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem = (SchemeStat$TypeClassifiedsContentItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsContentItem.ownerId && epx.f(this.itemType, schemeStat$TypeClassifiedsContentItem.itemType) && this.itemId == schemeStat$TypeClassifiedsContentItem.itemId;
    }

    public final int hashCode() {
        return Long.hashCode(this.itemId) + urd0.a(Long.hashCode(this.ownerId) * 31, 31, this.itemType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsContentItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", itemId=");
        return vu5.a(')', this.itemId, sb);
    }
}
