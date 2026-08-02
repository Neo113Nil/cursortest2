package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonOnboardingRecomThemesStat.kt */
/* loaded from: classes5.dex */
public final class CommonOnboardingRecomThemesStat$TypeRecomThemesItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("themes_ids")
    private final List<Integer> themesIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonOnboardingRecomThemesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("choose")
        public static final EventType CHOOSE;

        @pmi0("hide_modal")
        public static final EventType HIDE_MODAL;

        @pmi0("hide_screen_step_1")
        public static final EventType HIDE_SCREEN_STEP_1;

        @pmi0("hide_screen_step_2")
        public static final EventType HIDE_SCREEN_STEP_2;

        @pmi0("show_modal")
        public static final EventType SHOW_MODAL;

        @pmi0("show_screen_step_1")
        public static final EventType SHOW_SCREEN_STEP_1;

        @pmi0("show_screen_step_2")
        public static final EventType SHOW_SCREEN_STEP_2;

        static {
            EventType eventType = new EventType("SHOW_MODAL", 0);
            SHOW_MODAL = eventType;
            EventType eventType2 = new EventType("SHOW_SCREEN_STEP_1", 1);
            SHOW_SCREEN_STEP_1 = eventType2;
            EventType eventType3 = new EventType("SHOW_SCREEN_STEP_2", 2);
            SHOW_SCREEN_STEP_2 = eventType3;
            EventType eventType4 = new EventType("HIDE_MODAL", 3);
            HIDE_MODAL = eventType4;
            EventType eventType5 = new EventType("HIDE_SCREEN_STEP_1", 4);
            HIDE_SCREEN_STEP_1 = eventType5;
            EventType eventType6 = new EventType("HIDE_SCREEN_STEP_2", 5);
            HIDE_SCREEN_STEP_2 = eventType6;
            EventType eventType7 = new EventType("CHOOSE", 6);
            CHOOSE = eventType7;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7};
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

    public CommonOnboardingRecomThemesStat$TypeRecomThemesItem(EventType eventType, List<Integer> list) {
        this.eventType = eventType;
        this.themesIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonOnboardingRecomThemesStat$TypeRecomThemesItem)) {
            return false;
        }
        CommonOnboardingRecomThemesStat$TypeRecomThemesItem commonOnboardingRecomThemesStat$TypeRecomThemesItem = (CommonOnboardingRecomThemesStat$TypeRecomThemesItem) obj;
        return this.eventType == commonOnboardingRecomThemesStat$TypeRecomThemesItem.eventType && epx.f(this.themesIds, commonOnboardingRecomThemesStat$TypeRecomThemesItem.themesIds);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        List<Integer> list = this.themesIds;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRecomThemesItem(eventType=");
        sb.append(this.eventType);
        sb.append(", themesIds=");
        return ms9.a(')', sb, this.themesIds);
    }

    public /* synthetic */ CommonOnboardingRecomThemesStat$TypeRecomThemesItem(EventType eventType, List list, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : list);
    }
}
