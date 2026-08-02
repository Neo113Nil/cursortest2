package com.vk.stat.scheme;

import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$PostDraftItemClickEvent {

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final SchemeStat$TypePostDraftAttachment attachment;

    @pmi0("event_type")
    private final SchemeStat$PostDraftItemEventType eventType;

    @pmi0("mention_user_id")
    private final Long mentionUserId;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    public SchemeStat$PostDraftItemClickEvent(SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, Long l, SchemeStat$TypePostDraftAttachment schemeStat$TypePostDraftAttachment) {
        this.eventType = schemeStat$PostDraftItemEventType;
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.albumId = num;
        this.mentionUserId = l;
        this.attachment = schemeStat$TypePostDraftAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$PostDraftItemClickEvent)) {
            return false;
        }
        SchemeStat$PostDraftItemClickEvent schemeStat$PostDraftItemClickEvent = (SchemeStat$PostDraftItemClickEvent) obj;
        return this.eventType == schemeStat$PostDraftItemClickEvent.eventType && this.navScreen == schemeStat$PostDraftItemClickEvent.navScreen && epx.f(this.albumId, schemeStat$PostDraftItemClickEvent.albumId) && epx.f(this.mentionUserId, schemeStat$PostDraftItemClickEvent.mentionUserId) && epx.f(this.attachment, schemeStat$PostDraftItemClickEvent.attachment);
    }

    public final int hashCode() {
        int hashCode = (this.navScreen.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        Integer num = this.albumId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.mentionUserId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        SchemeStat$TypePostDraftAttachment schemeStat$TypePostDraftAttachment = this.attachment;
        return hashCode3 + (schemeStat$TypePostDraftAttachment != null ? schemeStat$TypePostDraftAttachment.hashCode() : 0);
    }

    public final String toString() {
        return "PostDraftItemClickEvent(eventType=" + this.eventType + ", navScreen=" + this.navScreen + ", albumId=" + this.albumId + ", mentionUserId=" + this.mentionUserId + ", attachment=" + this.attachment + ')';
    }

    public /* synthetic */ SchemeStat$PostDraftItemClickEvent(SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, Long l, SchemeStat$TypePostDraftAttachment schemeStat$TypePostDraftAttachment, int i, zcl zclVar) {
        this(schemeStat$PostDraftItemEventType, mobileOfficialAppsCoreNavStat$EventScreen, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : schemeStat$TypePostDraftAttachment);
    }
}
