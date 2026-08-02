package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem implements SchemeStat$TypeAction.b {

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("settings")
    private final List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> settings;

    @pmi0("vk_ticket")
    private final MobileOfficialAppsConPostingStat$VkTicket vkTicket;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("attach_action_button")
        public static final EventType ATTACH_ACTION_BUTTON;

        @pmi0("delete_action_button")
        public static final EventType DELETE_ACTION_BUTTON;

        @pmi0("transition_to_button_details")
        public static final EventType TRANSITION_TO_BUTTON_DETAILS;

        static {
            EventType eventType = new EventType("TRANSITION_TO_BUTTON_DETAILS", 0);
            TRANSITION_TO_BUTTON_DETAILS = eventType;
            EventType eventType2 = new EventType("ATTACH_ACTION_BUTTON", 1);
            ATTACH_ACTION_BUTTON = eventType2;
            EventType eventType3 = new EventType("DELETE_ACTION_BUTTON", 2);
            DELETE_ACTION_BUTTON = eventType3;
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

    public MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> list, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket) {
        this.eventType = eventType;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.settings = list;
        this.vkTicket = mobileOfficialAppsConPostingStat$VkTicket;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem = (MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.eventType && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.clipsCreateContext) && epx.f(this.settings, mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.settings) && epx.f(this.vkTicket, mobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.vkTicket);
    }

    public final int hashCode() {
        int hashCode = (this.clipsCreateContext.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> list = this.settings;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = this.vkTicket;
        return hashCode2 + (mobileOfficialAppsConPostingStat$VkTicket != null ? mobileOfficialAppsConPostingStat$VkTicket.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipsCreationScreenButtonsItem(eventType=" + this.eventType + ", clipsCreateContext=" + this.clipsCreateContext + ", settings=" + this.settings + ", vkTicket=" + this.vkTicket + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, List list, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsClipsStat$ClipsCreateContext, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket);
    }
}
