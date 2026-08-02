package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeOnboardingUsecasesItem implements SchemeStat$TypeAction.b {

    @pmi0("answer_text")
    private final String answerText;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen")
    private final String screen;

    @pmi0("usecase_ids")
    private final List<String> usecaseIds;

    @pmi0("user_id")
    private final Long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("choose")
        public static final EventType CHOOSE;

        @pmi0("hide_modal")
        public static final EventType HIDE_MODAL;

        @pmi0("hide_usecase")
        public static final EventType HIDE_USECASE;

        @pmi0("show_modal")
        public static final EventType SHOW_MODAL;

        @pmi0("show_usecase")
        public static final EventType SHOW_USECASE;

        static {
            EventType eventType = new EventType("SHOW_MODAL", 0);
            SHOW_MODAL = eventType;
            EventType eventType2 = new EventType("SHOW_USECASE", 1);
            SHOW_USECASE = eventType2;
            EventType eventType3 = new EventType("HIDE_MODAL", 2);
            HIDE_MODAL = eventType3;
            EventType eventType4 = new EventType("HIDE_USECASE", 3);
            HIDE_USECASE = eventType4;
            EventType eventType5 = new EventType("CHOOSE", 4);
            CHOOSE = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
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

    public SchemeStat$TypeOnboardingUsecasesItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeOnboardingUsecasesItem)) {
            return false;
        }
        SchemeStat$TypeOnboardingUsecasesItem schemeStat$TypeOnboardingUsecasesItem = (SchemeStat$TypeOnboardingUsecasesItem) obj;
        return epx.f(this.userId, schemeStat$TypeOnboardingUsecasesItem.userId) && this.eventType == schemeStat$TypeOnboardingUsecasesItem.eventType && epx.f(this.screen, schemeStat$TypeOnboardingUsecasesItem.screen) && epx.f(this.usecaseIds, schemeStat$TypeOnboardingUsecasesItem.usecaseIds) && epx.f(this.answerText, schemeStat$TypeOnboardingUsecasesItem.answerText);
    }

    public final int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        String str = this.screen;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.usecaseIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.answerText;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOnboardingUsecasesItem(userId=");
        sb.append(this.userId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", usecaseIds=");
        sb.append(this.usecaseIds);
        sb.append(", answerText=");
        return ho8.a(sb, this.answerText, ')');
    }

    public SchemeStat$TypeOnboardingUsecasesItem(Long l, EventType eventType, String str, List<String> list, String str2) {
        this.userId = l;
        this.eventType = eventType;
        this.screen = str;
        this.usecaseIds = list;
        this.answerText = str2;
    }

    public /* synthetic */ SchemeStat$TypeOnboardingUsecasesItem(Long l, EventType eventType, String str, List list, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2);
    }
}
