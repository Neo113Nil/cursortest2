package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypePostDraftAttachment {

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("string_value")
    private final String stringValue;

    @pmi0("type")
    private final String type;

    public SchemeStat$TypePostDraftAttachment(String str, Long l, Long l2, String str2) {
        this.type = str;
        this.ownerId = l;
        this.itemId = l2;
        this.stringValue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypePostDraftAttachment)) {
            return false;
        }
        SchemeStat$TypePostDraftAttachment schemeStat$TypePostDraftAttachment = (SchemeStat$TypePostDraftAttachment) obj;
        return epx.f(this.type, schemeStat$TypePostDraftAttachment.type) && epx.f(this.ownerId, schemeStat$TypePostDraftAttachment.ownerId) && epx.f(this.itemId, schemeStat$TypePostDraftAttachment.itemId) && epx.f(this.stringValue, schemeStat$TypePostDraftAttachment.stringValue);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.itemId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.stringValue;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePostDraftAttachment(type=");
        sb.append(this.type);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", stringValue=");
        return ho8.a(sb, this.stringValue, ')');
    }

    public /* synthetic */ SchemeStat$TypePostDraftAttachment(String str, Long l, Long l2, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2);
    }
}
