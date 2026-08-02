package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$TypeVideoAssistantMessageSendClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;
    public final transient String b;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("chat_id")
    private final FilteredString filteredChatId;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    @pmi0("message_source")
    private final MessageSource messageSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("assistant_message_send_click")
        public static final EventType ASSISTANT_MESSAGE_SEND_CLICK;

        static {
            EventType eventType = new EventType("ASSISTANT_MESSAGE_SEND_CLICK", 0);
            ASSISTANT_MESSAGE_SEND_CLICK = eventType;
            EventType[] eventTypeArr = {eventType};
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
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class MessageSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MessageSource[] $VALUES;

        @pmi0("suggest")
        public static final MessageSource SUGGEST;

        @pmi0("typing")
        public static final MessageSource TYPING;

        static {
            MessageSource messageSource = new MessageSource("TYPING", 0);
            TYPING = messageSource;
            MessageSource messageSource2 = new MessageSource("SUGGEST", 1);
            SUGGEST = messageSource2;
            MessageSource[] messageSourceArr = {messageSource, messageSource2};
            $VALUES = messageSourceArr;
            $ENTRIES = new asp(messageSourceArr);
        }

        private MessageSource(String str, int i) {
        }

        public static MessageSource valueOf(String str) {
            return (MessageSource) Enum.valueOf(MessageSource.class, str);
        }

        public static MessageSource[] values() {
            return (MessageSource[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVideoStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantMessageSendClick>, a9y<CommonVideoStat$TypeVideoAssistantMessageSendClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("assistant_type");
            Object obj = null;
            CommonVideoStat$AssistantType commonVideoStat$AssistantType = (CommonVideoStat$AssistantType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoStat$AssistantType.class));
            String C = fai.C(x9yVar, "chat_id");
            String C2 = fai.C(x9yVar, "query_id_src");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("message_source");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) MessageSource.class);
            }
            return new CommonVideoStat$TypeVideoAssistantMessageSendClick(eventType, commonVideoStat$AssistantType, C, C2, (MessageSource) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantMessageSendClick commonVideoStat$TypeVideoAssistantMessageSendClick = (CommonVideoStat$TypeVideoAssistantMessageSendClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageSendClick.b()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageSendClick.a()));
            x9yVar.o("chat_id", commonVideoStat$TypeVideoAssistantMessageSendClick.a);
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantMessageSendClick.b);
            x9yVar.o("message_source", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageSendClick.c()));
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoAssistantMessageSendClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, MessageSource messageSource) {
        this.eventType = eventType;
        this.assistantType = commonVideoStat$AssistantType;
        this.a = str;
        this.b = str2;
        this.messageSource = messageSource;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredChatId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(32));
        this.filteredQueryIdSrc = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final CommonVideoStat$AssistantType a() {
        return this.assistantType;
    }

    public final EventType b() {
        return this.eventType;
    }

    public final MessageSource c() {
        return this.messageSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantMessageSendClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantMessageSendClick commonVideoStat$TypeVideoAssistantMessageSendClick = (CommonVideoStat$TypeVideoAssistantMessageSendClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantMessageSendClick.eventType && this.assistantType == commonVideoStat$TypeVideoAssistantMessageSendClick.assistantType && epx.f(this.a, commonVideoStat$TypeVideoAssistantMessageSendClick.a) && epx.f(this.b, commonVideoStat$TypeVideoAssistantMessageSendClick.b) && this.messageSource == commonVideoStat$TypeVideoAssistantMessageSendClick.messageSource;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessageSource messageSource = this.messageSource;
        return hashCode4 + (messageSource != null ? messageSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoAssistantMessageSendClick(eventType=" + this.eventType + ", assistantType=" + this.assistantType + ", chatId=" + this.a + ", queryIdSrc=" + this.b + ", messageSource=" + this.messageSource + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantMessageSendClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, MessageSource messageSource, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$AssistantType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : messageSource);
    }
}
