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
public final class CommonVideoStat$TypeVideoAssistantChatOpenClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;
    public final transient String b;
    public final transient String c;

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("chat_id")
    private final FilteredString filteredChatId;

    @pmi0("prev_chat_id")
    private final FilteredString filteredPrevChatId;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0("general")
        public static final ClickType GENERAL;

        @pmi0("history")
        public static final ClickType HISTORY;

        @pmi0("new")
        public static final ClickType NEW;

        static {
            ClickType clickType = new ClickType("GENERAL", 0);
            GENERAL = clickType;
            ClickType clickType2 = new ClickType("NEW", 1);
            NEW = clickType2;
            ClickType clickType3 = new ClickType("HISTORY", 2);
            HISTORY = clickType3;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        private ClickType(String str, int i) {
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("assistant_chat_open_click")
        public static final EventType ASSISTANT_CHAT_OPEN_CLICK;

        static {
            EventType eventType = new EventType("ASSISTANT_CHAT_OPEN_CLICK", 0);
            ASSISTANT_CHAT_OPEN_CLICK = eventType;
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

    /* compiled from: CommonVideoStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantChatOpenClick>, a9y<CommonVideoStat$TypeVideoAssistantChatOpenClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Source source = (Source) dq.f(x9yVar, "source", tru.a(), Source.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("assistant_type");
            Object obj = null;
            CommonVideoStat$AssistantType commonVideoStat$AssistantType = (CommonVideoStat$AssistantType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoStat$AssistantType.class));
            String C = fai.C(x9yVar, "chat_id");
            String C2 = fai.C(x9yVar, "query_id_src");
            String C3 = fai.C(x9yVar, "prev_chat_id");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("click_type");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) ClickType.class);
            }
            return new CommonVideoStat$TypeVideoAssistantChatOpenClick(eventType, source, commonVideoStat$AssistantType, C, C2, C3, (ClickType) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantChatOpenClick commonVideoStat$TypeVideoAssistantChatOpenClick = (CommonVideoStat$TypeVideoAssistantChatOpenClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatOpenClick.c()));
            x9yVar.o("source", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatOpenClick.d()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatOpenClick.a()));
            x9yVar.o("chat_id", commonVideoStat$TypeVideoAssistantChatOpenClick.a);
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantChatOpenClick.b);
            x9yVar.o("prev_chat_id", commonVideoStat$TypeVideoAssistantChatOpenClick.c);
            x9yVar.o("click_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatOpenClick.b()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("history")
        public static final Source HISTORY;

        @pmi0("new")
        public static final Source NEW;

        @pmi0("search")
        public static final Source SEARCH;

        static {
            Source source = new Source("SEARCH", 0);
            SEARCH = source;
            Source source2 = new Source("HISTORY", 1);
            HISTORY = source2;
            Source source3 = new Source("NEW", 2);
            NEW = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeVideoAssistantChatOpenClick(EventType eventType, Source source, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, String str3, ClickType clickType) {
        this.eventType = eventType;
        this.source = source;
        this.assistantType = commonVideoStat$AssistantType;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.clickType = clickType;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredChatId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(32));
        this.filteredQueryIdSrc = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(256));
        this.filteredPrevChatId = filteredString3;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
    }

    public final CommonVideoStat$AssistantType a() {
        return this.assistantType;
    }

    public final ClickType b() {
        return this.clickType;
    }

    public final EventType c() {
        return this.eventType;
    }

    public final Source d() {
        return this.source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantChatOpenClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantChatOpenClick commonVideoStat$TypeVideoAssistantChatOpenClick = (CommonVideoStat$TypeVideoAssistantChatOpenClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantChatOpenClick.eventType && this.source == commonVideoStat$TypeVideoAssistantChatOpenClick.source && this.assistantType == commonVideoStat$TypeVideoAssistantChatOpenClick.assistantType && epx.f(this.a, commonVideoStat$TypeVideoAssistantChatOpenClick.a) && epx.f(this.b, commonVideoStat$TypeVideoAssistantChatOpenClick.b) && epx.f(this.c, commonVideoStat$TypeVideoAssistantChatOpenClick.c) && this.clickType == commonVideoStat$TypeVideoAssistantChatOpenClick.clickType;
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClickType clickType = this.clickType;
        return hashCode5 + (clickType != null ? clickType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoAssistantChatOpenClick(eventType=" + this.eventType + ", source=" + this.source + ", assistantType=" + this.assistantType + ", chatId=" + this.a + ", queryIdSrc=" + this.b + ", prevChatId=" + this.c + ", clickType=" + this.clickType + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantChatOpenClick(EventType eventType, Source source, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, String str3, ClickType clickType, int i, zcl zclVar) {
        this(eventType, source, (i & 4) != 0 ? null : commonVideoStat$AssistantType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : clickType);
    }
}
