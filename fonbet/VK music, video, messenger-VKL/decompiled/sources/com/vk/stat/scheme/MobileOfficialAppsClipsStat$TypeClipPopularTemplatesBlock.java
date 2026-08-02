package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("template_id")
    private final Integer templateId;

    @pmi0("template_owner_id")
    private final Long templateOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_open_template_editor")
        public static final EventType CLICK_TO_OPEN_TEMPLATE_EDITOR;

        @pmi0("show_templates_block")
        public static final EventType SHOW_TEMPLATES_BLOCK;

        static {
            EventType eventType = new EventType("SHOW_TEMPLATES_BLOCK", 0);
            SHOW_TEMPLATES_BLOCK = eventType;
            EventType eventType2 = new EventType("CLICK_TO_OPEN_TEMPLATE_EDITOR", 1);
            CLICK_TO_OPEN_TEMPLATE_EDITOR = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock(EventType eventType, Long l, Integer num) {
        this.eventType = eventType;
        this.templateOwnerId = l;
        this.templateId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock = (MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock.eventType && epx.f(this.templateOwnerId, mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock.templateOwnerId) && epx.f(this.templateId, mobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock.templateId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.templateOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.templateId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipPopularTemplatesBlock(eventType=");
        sb.append(this.eventType);
        sb.append(", templateOwnerId=");
        sb.append(this.templateOwnerId);
        sb.append(", templateId=");
        return uqi.b(sb, this.templateId, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipPopularTemplatesBlock(EventType eventType, Long l, Integer num, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }
}
