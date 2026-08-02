package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsMoreMenuItem {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("object_type")
    private final ObjectType objectType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("add_to_bookmark")
        public static final EventSubtype ADD_TO_BOOKMARK;

        @pmi0("add_to_playlist")
        public static final EventSubtype ADD_TO_PLAYLIST;

        @pmi0("copy_erid")
        public static final EventSubtype COPY_ERID;

        @pmi0("copy_link")
        public static final EventSubtype COPY_LINK;

        @pmi0("create_duet")
        public static final EventSubtype CREATE_DUET;

        @pmi0("download")
        public static final EventSubtype DOWNLOAD;

        @pmi0("edit")
        public static final EventSubtype EDIT;

        @pmi0("edit_privacy")
        public static final EventSubtype EDIT_PRIVACY;

        @pmi0("not_interesting")
        public static final EventSubtype NOT_INTERESTING;

        @pmi0("pin_clip")
        public static final EventSubtype PIN_CLIP;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final EventSubtype REMOVE;

        @pmi0("report")
        public static final EventSubtype REPORT;

        @pmi0("share")
        public static final EventSubtype SHARE;

        @pmi0("show_ads_info")
        public static final EventSubtype SHOW_ADS_INFO;

        @pmi0("subtitle")
        public static final EventSubtype SUBTITLE;

        @pmi0("unpin_clip")
        public static final EventSubtype UNPIN_CLIP;

        @pmi0("view_analytics")
        public static final EventSubtype VIEW_ANALYTICS;

        static {
            EventSubtype eventSubtype = new EventSubtype("SUBTITLE", 0);
            SUBTITLE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SHOW_ADS_INFO", 1);
            SHOW_ADS_INFO = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("SHARE", 2);
            SHARE = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("REPORT", 3);
            REPORT = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 4);
            REMOVE = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("NOT_INTERESTING", 5);
            NOT_INTERESTING = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("EDIT_PRIVACY", 6);
            EDIT_PRIVACY = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("EDIT", 7);
            EDIT = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("DOWNLOAD", 8);
            DOWNLOAD = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("CREATE_DUET", 9);
            CREATE_DUET = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("COPY_LINK", 10);
            COPY_LINK = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("COPY_ERID", 11);
            COPY_ERID = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("ADD_TO_PLAYLIST", 12);
            ADD_TO_PLAYLIST = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("ADD_TO_BOOKMARK", 13);
            ADD_TO_BOOKMARK = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("VIEW_ANALYTICS", 14);
            VIEW_ANALYTICS = eventSubtype15;
            EventSubtype eventSubtype16 = new EventSubtype("PIN_CLIP", 15);
            PIN_CLIP = eventSubtype16;
            EventSubtype eventSubtype17 = new EventSubtype("UNPIN_CLIP", 16);
            UNPIN_CLIP = eventSubtype17;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15, eventSubtype16, eventSubtype17};
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
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("disable")
        public static final ObjectType DISABLE;

        @pmi0(com.ironsource.mediationsdk.metadata.a.j)
        public static final ObjectType ENABLE;

        @pmi0("enable_when_sound_is_off")
        public static final ObjectType ENABLE_WHEN_SOUND_IS_OFF;

        @pmi0("FullHD")
        public static final ObjectType FULLHD;

        @pmi0("HD")
        public static final ObjectType HD;

        @pmi0("SD")
        public static final ObjectType SD;

        static {
            ObjectType objectType = new ObjectType("DISABLE", 0);
            DISABLE = objectType;
            ObjectType objectType2 = new ObjectType("ENABLE", 1);
            ENABLE = objectType2;
            ObjectType objectType3 = new ObjectType("ENABLE_WHEN_SOUND_IS_OFF", 2);
            ENABLE_WHEN_SOUND_IS_OFF = objectType3;
            ObjectType objectType4 = new ObjectType("FULLHD", 3);
            FULLHD = objectType4;
            ObjectType objectType5 = new ObjectType("HD", 4);
            HD = objectType5;
            ObjectType objectType6 = new ObjectType("SD", 5);
            SD = objectType6;
            ObjectType[] objectTypeArr = {objectType, objectType2, objectType3, objectType4, objectType5, objectType6};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipsMoreMenuItem(EventSubtype eventSubtype, ObjectType objectType, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventSubtype = eventSubtype;
        this.objectType = objectType;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipsMoreMenuItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem mobileOfficialAppsClipsStat$ClipsMoreMenuItem = (MobileOfficialAppsClipsStat$ClipsMoreMenuItem) obj;
        return this.eventSubtype == mobileOfficialAppsClipsStat$ClipsMoreMenuItem.eventSubtype && this.objectType == mobileOfficialAppsClipsStat$ClipsMoreMenuItem.objectType && epx.f(this.clipItem, mobileOfficialAppsClipsStat$ClipsMoreMenuItem.clipItem);
    }

    public final int hashCode() {
        int hashCode = this.eventSubtype.hashCode() * 31;
        ObjectType objectType = this.objectType;
        int hashCode2 = (hashCode + (objectType == null ? 0 : objectType.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        return hashCode2 + (mobileOfficialAppsClipsStat$TypeClipsClipItem != null ? mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsMoreMenuItem(eventSubtype=" + this.eventSubtype + ", objectType=" + this.objectType + ", clipItem=" + this.clipItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipsMoreMenuItem(EventSubtype eventSubtype, ObjectType objectType, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this(eventSubtype, (i & 2) != 0 ? null : objectType, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
