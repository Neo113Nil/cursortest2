package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImPinnedMessageClickItem implements SchemeStat$TypeClick.b {

    @pmi0("conversation_id")
    private final Long conversationId;

    @pmi0("conversation_message_id")
    private final Long conversationMessageId;

    @pmi0("conversation_type")
    private final ConversationType conversationType;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class ConversationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConversationType[] $VALUES;

        @pmi0("channel")
        public static final ConversationType CHANNEL;

        static {
            ConversationType conversationType = new ConversationType("CHANNEL", 0);
            CHANNEL = conversationType;
            ConversationType[] conversationTypeArr = {conversationType};
            $VALUES = conversationTypeArr;
            $ENTRIES = new asp(conversationTypeArr);
        }

        private ConversationType(String str, int i) {
        }

        public static ConversationType valueOf(String str) {
            return (ConversationType) Enum.valueOf(ConversationType.class, str);
        }

        public static ConversationType[] values() {
            return (ConversationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_on_pin_message")
        public static final EventType CLICK_ON_PIN_MESSAGE;

        @pmi0("pin_channel_post")
        public static final EventType PIN_CHANNEL_POST;

        @pmi0("unpin_channel_post")
        public static final EventType UNPIN_CHANNEL_POST;

        static {
            EventType eventType = new EventType("PIN_CHANNEL_POST", 0);
            PIN_CHANNEL_POST = eventType;
            EventType eventType2 = new EventType("UNPIN_CHANNEL_POST", 1);
            UNPIN_CHANNEL_POST = eventType2;
            EventType eventType3 = new EventType("CLICK_ON_PIN_MESSAGE", 2);
            CLICK_ON_PIN_MESSAGE = eventType3;
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

    public MobileOfficialAppsImStat$TypeImPinnedMessageClickItem(EventType eventType, ConversationType conversationType, Long l, Long l2) {
        this.eventType = eventType;
        this.conversationType = conversationType;
        this.conversationId = l;
        this.conversationMessageId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImPinnedMessageClickItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem = (MobileOfficialAppsImStat$TypeImPinnedMessageClickItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImPinnedMessageClickItem.eventType && this.conversationType == mobileOfficialAppsImStat$TypeImPinnedMessageClickItem.conversationType && epx.f(this.conversationId, mobileOfficialAppsImStat$TypeImPinnedMessageClickItem.conversationId) && epx.f(this.conversationMessageId, mobileOfficialAppsImStat$TypeImPinnedMessageClickItem.conversationMessageId);
    }

    public final int hashCode() {
        int hashCode = (this.conversationType.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        Long l = this.conversationId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.conversationMessageId;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImPinnedMessageClickItem(eventType=");
        sb.append(this.eventType);
        sb.append(", conversationType=");
        sb.append(this.conversationType);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationMessageId=");
        return iq.b(sb, this.conversationMessageId, ')');
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImPinnedMessageClickItem(EventType eventType, ConversationType conversationType, Long l, Long l2, int i, zcl zclVar) {
        this(eventType, conversationType, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}
