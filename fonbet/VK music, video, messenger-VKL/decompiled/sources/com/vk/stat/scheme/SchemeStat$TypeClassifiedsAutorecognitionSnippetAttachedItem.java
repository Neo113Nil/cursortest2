package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem {

    @pmi0("draft_id")
    private final Long draftId;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem(long j, Long l) {
        this.ownerId = j;
        this.draftId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem = (SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem.ownerId && epx.f(this.draftId, schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem.draftId);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Long l = this.draftId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsAutorecognitionSnippetAttachedItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", draftId=");
        return iq.b(sb, this.draftId, ')');
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem(long j, Long l, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : l);
    }
}
