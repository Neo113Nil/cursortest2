package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAudioOfflineItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("id")
    private final String id;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("download")
        public static final EventType DOWNLOAD;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final EventType REMOVE;

        static {
            EventType eventType = new EventType("DOWNLOAD", 0);
            DOWNLOAD = eventType;
            EventType eventType2 = new EventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
            REMOVE = eventType2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("audio")
        public static final Type AUDIO;

        @pmi0("playlist")
        public static final Type PLAYLIST;

        static {
            Type type = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
            AUDIO = type;
            Type type2 = new Type("PLAYLIST", 1);
            PLAYLIST = type2;
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

    public SchemeStat$TypeAudioOfflineItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAudioOfflineItem)) {
            return false;
        }
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = (SchemeStat$TypeAudioOfflineItem) obj;
        return this.eventType == schemeStat$TypeAudioOfflineItem.eventType && epx.f(this.id, schemeStat$TypeAudioOfflineItem.id) && this.type == schemeStat$TypeAudioOfflineItem.type;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Type type = this.type;
        return hashCode2 + (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAudioOfflineItem(eventType=" + this.eventType + ", id=" + this.id + ", type=" + this.type + ')';
    }

    public SchemeStat$TypeAudioOfflineItem(EventType eventType, String str, Type type) {
        this.eventType = eventType;
        this.id = str;
        this.type = type;
    }

    public /* synthetic */ SchemeStat$TypeAudioOfflineItem(EventType eventType, String str, Type type, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : type);
    }
}
