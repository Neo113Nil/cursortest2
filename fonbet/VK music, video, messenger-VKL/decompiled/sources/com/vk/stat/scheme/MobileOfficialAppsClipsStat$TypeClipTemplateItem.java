package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipTemplateItem implements SchemeStat$TypeAction.b {

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("template_id")
    private final int templateId;

    @pmi0("template_owner_id")
    private final long templateOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("apply_template")
        public static final EventType APPLY_TEMPLATE;

        @pmi0("choose_template")
        public static final EventType CHOOSE_TEMPLATE;

        @pmi0("open_template")
        public static final EventType OPEN_TEMPLATE;

        static {
            EventType eventType = new EventType("OPEN_TEMPLATE", 0);
            OPEN_TEMPLATE = eventType;
            EventType eventType2 = new EventType("CHOOSE_TEMPLATE", 1);
            CHOOSE_TEMPLATE = eventType2;
            EventType eventType3 = new EventType("APPLY_TEMPLATE", 2);
            APPLY_TEMPLATE = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsClipsStat$TypeClipTemplateItem(EventType eventType, long j, int i, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
        this.eventType = eventType;
        this.templateOwnerId = j;
        this.templateId = i;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipTemplateItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipTemplateItem mobileOfficialAppsClipsStat$TypeClipTemplateItem = (MobileOfficialAppsClipsStat$TypeClipTemplateItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipTemplateItem.eventType && this.templateOwnerId == mobileOfficialAppsClipsStat$TypeClipTemplateItem.templateOwnerId && this.templateId == mobileOfficialAppsClipsStat$TypeClipTemplateItem.templateId && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipTemplateItem.clipsCreateContext);
    }

    public final int hashCode() {
        int a = shy.a(this.templateId, bh10.a(this.eventType.hashCode() * 31, 31, this.templateOwnerId), 31);
        MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = this.clipsCreateContext;
        return a + (mobileOfficialAppsClipsStat$ClipsCreateContext == null ? 0 : mobileOfficialAppsClipsStat$ClipsCreateContext.hashCode());
    }

    public final String toString() {
        return "TypeClipTemplateItem(eventType=" + this.eventType + ", templateOwnerId=" + this.templateOwnerId + ", templateId=" + this.templateId + ", clipsCreateContext=" + this.clipsCreateContext + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipTemplateItem(EventType eventType, long j, int i, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, int i2, zcl zclVar) {
        this(eventType, j, i, (i2 & 8) != 0 ? null : mobileOfficialAppsClipsStat$ClipsCreateContext);
    }
}
