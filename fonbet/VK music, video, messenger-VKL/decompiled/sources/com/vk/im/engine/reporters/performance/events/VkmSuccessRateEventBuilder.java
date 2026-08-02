package com.vk.im.engine.reporters.performance.events;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.l5m;
import xsna.qrk0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VkmSuccessRateEventBuilder.kt */
/* loaded from: classes2.dex */
public final class VkmSuccessRateEventBuilder extends l5m {
    public final EventName h;
    public final EventType i;
    public final String j;
    public final Long k;
    public final String l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkmSuccessRateEventBuilder.kt */
    /* loaded from: classes.dex */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;
        public static final EventName AUDIO_MSG_PLAY;
        public static final EventName CHANNELS_LIST_OPEN;
        public static final EventName CHANNEL_HISTORY_PAGING;
        public static final EventName CHANNEL_OPEN;
        public static final EventName CHAT_HISTORY_PAGING;
        public static final EventName CHAT_OPEN;
        public static final EventName CHAT_UPDATING;
        public static final EventName DEFERRED_SYNC;
        public static final EventName DIALOGS_LIST_OPEN;
        public static final EventName LITE_SYNC;
        public static final EventName MENTION_MSG_OPEN;
        public static final EventName MSG_SEND;
        public static final EventName PINNED_MSG_OPEN;
        public static final EventName PUSH_OPEN;
        public static final EventName REACTION_MSG_OPEN;
        public static final EventName REPLY_OPEN;
        public static final EventName SERVICE_UPDATING;
        public static final EventName SHOW_ATTACHMENT;
        public static final EventName VIDEO_MSG_PLAY;
        private final String strValue;

        static {
            EventName eventName = new EventName("DIALOGS_LIST_OPEN", 0, "peer_list_open");
            DIALOGS_LIST_OPEN = eventName;
            EventName eventName2 = new EventName("CHANNELS_LIST_OPEN", 1, "channels_peer_list_open");
            CHANNELS_LIST_OPEN = eventName2;
            EventName eventName3 = new EventName("CHAT_OPEN", 2, "chat_open");
            CHAT_OPEN = eventName3;
            EventName eventName4 = new EventName("CHANNEL_OPEN", 3, "channel_open");
            CHANNEL_OPEN = eventName4;
            EventName eventName5 = new EventName("SERVICE_UPDATING", 4, "service_updating");
            SERVICE_UPDATING = eventName5;
            EventName eventName6 = new EventName("CHAT_UPDATING", 5, "chat_updating");
            CHAT_UPDATING = eventName6;
            EventName eventName7 = new EventName("LITE_SYNC", 6, "lite_sync");
            LITE_SYNC = eventName7;
            EventName eventName8 = new EventName("DEFERRED_SYNC", 7, "deferred_sync");
            DEFERRED_SYNC = eventName8;
            EventName eventName9 = new EventName("PUSH_OPEN", 8, "push_open");
            PUSH_OPEN = eventName9;
            EventName eventName10 = new EventName("REPLY_OPEN", 9, "reply_open");
            REPLY_OPEN = eventName10;
            EventName eventName11 = new EventName("REACTION_MSG_OPEN", 10, "reaction_msg_open");
            REACTION_MSG_OPEN = eventName11;
            EventName eventName12 = new EventName("MENTION_MSG_OPEN", 11, "mention_msg_open");
            MENTION_MSG_OPEN = eventName12;
            EventName eventName13 = new EventName("PINNED_MSG_OPEN", 12, "pinned_msg_open");
            PINNED_MSG_OPEN = eventName13;
            EventName eventName14 = new EventName("CHAT_HISTORY_PAGING", 13, "chat_history_paging");
            CHAT_HISTORY_PAGING = eventName14;
            EventName eventName15 = new EventName("CHANNEL_HISTORY_PAGING", 14, "channel_history_paging");
            CHANNEL_HISTORY_PAGING = eventName15;
            EventName eventName16 = new EventName("MSG_SEND", 15, "msg_send");
            MSG_SEND = eventName16;
            EventName eventName17 = new EventName("SHOW_ATTACHMENT", 16, "show_attachment");
            SHOW_ATTACHMENT = eventName17;
            EventName eventName18 = new EventName("VIDEO_MSG_PLAY", 17, "video_msg_play");
            VIDEO_MSG_PLAY = eventName18;
            EventName eventName19 = new EventName("AUDIO_MSG_PLAY", 18, "audio_msg_play");
            AUDIO_MSG_PLAY = eventName19;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11, eventName12, eventName13, eventName14, eventName15, eventName16, eventName17, eventName18, eventName19};
            $VALUES = eventNameArr;
            $ENTRIES = new asp(eventNameArr);
        }

        public EventName(String str, int i, String str2) {
            this.strValue = str2;
        }

        public static EventName valueOf(String str) {
            return (EventName) Enum.valueOf(EventName.class, str);
        }

        public static EventName[] values() {
            return (EventName[]) $VALUES.clone();
        }

        public final String h() {
            return this.strValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkmSuccessRateEventBuilder.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType END;
        public static final EventType ERROR;
        public static final EventType START;
        private final int intValue;

        static {
            EventType eventType = new EventType("START", 0, 0);
            START = eventType;
            EventType eventType2 = new EventType("END", 1, 1);
            END = eventType2;
            EventType eventType3 = new EventType("ERROR", 2, 2);
            ERROR = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        public EventType(String str, int i, int i2) {
            this.intValue = i2;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }

        public final int h() {
            return this.intValue;
        }
    }

    public /* synthetic */ VkmSuccessRateEventBuilder(EventName eventName, EventType eventType, String str, Long l, String str2, int i) {
        this(eventName, eventType, str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkmSuccessRateEventBuilder)) {
            return false;
        }
        VkmSuccessRateEventBuilder vkmSuccessRateEventBuilder = (VkmSuccessRateEventBuilder) obj;
        return this.h == vkmSuccessRateEventBuilder.h && this.i == vkmSuccessRateEventBuilder.i && epx.f(this.j, vkmSuccessRateEventBuilder.j) && epx.f(this.k, vkmSuccessRateEventBuilder.k) && epx.f(this.l, vkmSuccessRateEventBuilder.l);
    }

    public final int hashCode() {
        int a = urd0.a((this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31, this.j);
        Long l = this.k;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.l;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkmSuccessRateEventBuilder(eventName=");
        sb.append(this.h);
        sb.append(", eventType=");
        sb.append(this.i);
        sb.append(", networkType=");
        sb.append(this.j);
        sb.append(", duration=");
        sb.append(this.k);
        sb.append(", error=");
        return ho8.a(sb, this.l, ')');
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.MESSENGER_LOADING_SUCCESS_RATE.h();
        String h2 = this.h.h();
        int h3 = this.i.h();
        Long l = this.k;
        return new qrk0(new SchemeStat$TypeDevNullItem(h, null, h2, Integer.valueOf(h3), this.j, l != null ? Integer.valueOf((int) l.longValue()) : null, null, null, this.l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -318, 3, null), false);
    }

    public VkmSuccessRateEventBuilder(EventName eventName, EventType eventType, String str, Long l, String str2) {
        super(null, null, 3);
        this.h = eventName;
        this.i = eventType;
        this.j = str;
        this.k = l;
        this.l = str2;
    }
}
