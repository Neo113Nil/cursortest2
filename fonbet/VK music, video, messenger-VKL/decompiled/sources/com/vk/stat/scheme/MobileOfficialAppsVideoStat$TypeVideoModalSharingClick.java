package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoModalSharingClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("item_index")
    private final Integer itemIndex;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("sharing_item_type")
    private final MobileOfficialAppsSharingStat$SharingItemType sharingItemType;

    @pmi0("source_ui")
    private final MobileOfficialAppsVideoStat$VideoEventSource sourceUi;

    @pmi0("type")
    private final Type type;

    @pmi0("type_sharing_external_info_item")
    private final MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem typeSharingExternalInfoItem;

    @pmi0("type_sharing_internal_info_item")
    private final MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem typeSharingInternalInfoItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("modal_sharing_click")
        public static final Event MODAL_SHARING_CLICK;

        @pmi0("modal_sharing_external_click")
        public static final Event MODAL_SHARING_EXTERNAL_CLICK;

        static {
            Event event = new Event("MODAL_SHARING_CLICK", 0);
            MODAL_SHARING_CLICK = event;
            Event event2 = new Event("MODAL_SHARING_EXTERNAL_CLICK", 1);
            MODAL_SHARING_EXTERNAL_CLICK = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("add_bookmarks")
        public static final EventSubtype ADD_BOOKMARKS;

        @pmi0("chat_create")
        public static final EventSubtype CHAT_CREATE;

        @pmi0("copy_link")
        public static final EventSubtype COPY_LINK;

        @pmi0("create_duet")
        public static final EventSubtype CREATE_DUET;

        @pmi0("download")
        public static final EventSubtype DOWNLOAD;

        @pmi0("repost")
        public static final EventSubtype REPOST;

        @pmi0("repost_community")
        public static final EventSubtype REPOST_COMMUNITY;

        @pmi0("send_max")
        public static final EventSubtype SEND_MAX;

        @pmi0("send_system")
        public static final EventSubtype SEND_SYSTEM;

        @pmi0("send_telegram")
        public static final EventSubtype SEND_TELEGRAM;

        @pmi0("send_vk")
        public static final EventSubtype SEND_VK;

        @pmi0("send_whatsapp")
        public static final EventSubtype SEND_WHATSAPP;

        @pmi0("share_to_message")
        public static final EventSubtype SHARE_TO_MESSAGE;

        @pmi0("share_to_message_undo")
        public static final EventSubtype SHARE_TO_MESSAGE_UNDO;

        @pmi0("share_to_story")
        public static final EventSubtype SHARE_TO_STORY;

        static {
            EventSubtype eventSubtype = new EventSubtype("SHARE_TO_STORY", 0);
            SHARE_TO_STORY = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("COPY_LINK", 1);
            COPY_LINK = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("CREATE_DUET", 2);
            CREATE_DUET = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("DOWNLOAD", 3);
            DOWNLOAD = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("ADD_BOOKMARKS", 4);
            ADD_BOOKMARKS = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("SEND_TELEGRAM", 5);
            SEND_TELEGRAM = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("SEND_WHATSAPP", 6);
            SEND_WHATSAPP = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("SEND_VK", 7);
            SEND_VK = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("SEND_MAX", 8);
            SEND_MAX = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("SEND_SYSTEM", 9);
            SEND_SYSTEM = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("SHARE_TO_MESSAGE", 10);
            SHARE_TO_MESSAGE = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("SHARE_TO_MESSAGE_UNDO", 11);
            SHARE_TO_MESSAGE_UNDO = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("REPOST", 12);
            REPOST = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("CHAT_CREATE", 13);
            CHAT_CREATE = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("REPOST_COMMUNITY", 14);
            REPOST_COMMUNITY = eventSubtype15;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_sharing_external_info_item")
        public static final Type TYPE_SHARING_EXTERNAL_INFO_ITEM;

        @pmi0("type_sharing_internal_info_item")
        public static final Type TYPE_SHARING_INTERNAL_INFO_ITEM;

        static {
            Type type = new Type("TYPE_SHARING_INTERNAL_INFO_ITEM", 0);
            TYPE_SHARING_INTERNAL_INFO_ITEM = type;
            Type type2 = new Type("TYPE_SHARING_EXTERNAL_INFO_ITEM", 1);
            TYPE_SHARING_EXTERNAL_INFO_ITEM = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class a {
        public static MobileOfficialAppsVideoStat$TypeVideoModalSharingClick a(Event event, EventSubtype eventSubtype, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem, int i) {
            MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem2 = (i & 128) != 0 ? null : mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem;
            MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = null;
            Integer num = null;
            Long l = null;
            if (mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem2 == null) {
                return new MobileOfficialAppsVideoStat$TypeVideoModalSharingClick(event, eventSubtype, l, num, null, null, null, mobileOfficialAppsSharingStat$SharingItemType, mobileOfficialAppsVideoStat$TypeScreenMode, mobileOfficialAppsVideoStat$VideoEventSource, 96, null);
            }
            return new MobileOfficialAppsVideoStat$TypeVideoModalSharingClick(event, eventSubtype, l, num, Type.TYPE_SHARING_INTERNAL_INFO_ITEM, mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem2, null, mobileOfficialAppsSharingStat$SharingItemType, mobileOfficialAppsVideoStat$TypeScreenMode, mobileOfficialAppsVideoStat$VideoEventSource, 64, null);
        }
    }

    private MobileOfficialAppsVideoStat$TypeVideoModalSharingClick(Event event, EventSubtype eventSubtype, Long l, Integer num, Type type, MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem, MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource) {
        this.event = event;
        this.eventSubtype = eventSubtype;
        this.itemId = l;
        this.itemIndex = num;
        this.type = type;
        this.typeSharingInternalInfoItem = mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem;
        this.typeSharingExternalInfoItem = mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem;
        this.sharingItemType = mobileOfficialAppsSharingStat$SharingItemType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.sourceUi = mobileOfficialAppsVideoStat$VideoEventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoModalSharingClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick = (MobileOfficialAppsVideoStat$TypeVideoModalSharingClick) obj;
        return this.event == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.event && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.eventSubtype && epx.f(this.itemId, mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.itemId) && epx.f(this.itemIndex, mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.itemIndex) && this.type == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.type && epx.f(this.typeSharingInternalInfoItem, mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.typeSharingInternalInfoItem) && epx.f(this.typeSharingExternalInfoItem, mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.typeSharingExternalInfoItem) && this.sharingItemType == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.sharingItemType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.screenMode && this.sourceUi == mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.sourceUi;
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + (this.event.hashCode() * 31)) * 31;
        Long l = this.itemId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.itemIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Type type = this.type;
        int hashCode4 = (hashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem = this.typeSharingInternalInfoItem;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem == null ? 0 : mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem.hashCode())) * 31;
        MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem = this.typeSharingExternalInfoItem;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem == null ? 0 : mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem.a.hashCode())) * 31;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = this.sharingItemType;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsSharingStat$SharingItemType == null ? 0 : mobileOfficialAppsSharingStat$SharingItemType.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.sourceUi;
        return hashCode8 + (mobileOfficialAppsVideoStat$VideoEventSource != null ? mobileOfficialAppsVideoStat$VideoEventSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoModalSharingClick(event=" + this.event + ", eventSubtype=" + this.eventSubtype + ", itemId=" + this.itemId + ", itemIndex=" + this.itemIndex + ", type=" + this.type + ", typeSharingInternalInfoItem=" + this.typeSharingInternalInfoItem + ", typeSharingExternalInfoItem=" + this.typeSharingExternalInfoItem + ", sharingItemType=" + this.sharingItemType + ", screenMode=" + this.screenMode + ", sourceUi=" + this.sourceUi + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoModalSharingClick(Event event, EventSubtype eventSubtype, Long l, Integer num, Type type, MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem, MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, int i, zcl zclVar) {
        this(event, eventSubtype, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : type, (i & 32) != 0 ? null : mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem, (i & 64) != 0 ? null : mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem, (i & 128) != 0 ? null : mobileOfficialAppsSharingStat$SharingItemType, (i & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 512) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource);
    }
}
