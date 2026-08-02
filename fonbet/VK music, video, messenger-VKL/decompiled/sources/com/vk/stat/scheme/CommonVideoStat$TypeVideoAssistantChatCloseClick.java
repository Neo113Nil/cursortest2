package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import xsna.tn;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$TypeVideoAssistantChatCloseClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;
    public final transient String b;

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("chat_id")
    private final FilteredString filteredChatId;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    @pmi0("is_show_last_answer")
    private final Boolean isShowLastAnswer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0("back")
        public static final ClickType BACK;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final ClickType CLOSE;

        static {
            ClickType clickType = new ClickType("CLOSE", 0);
            CLOSE = clickType;
            ClickType clickType2 = new ClickType("BACK", 1);
            BACK = clickType2;
            ClickType[] clickTypeArr = {clickType, clickType2};
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

        @pmi0("assistant_chat_close_click")
        public static final EventType ASSISTANT_CHAT_CLOSE_CLICK;

        static {
            EventType eventType = new EventType("ASSISTANT_CHAT_CLOSE_CLICK", 0);
            ASSISTANT_CHAT_CLOSE_CLICK = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantChatCloseClick>, a9y<CommonVideoStat$TypeVideoAssistantChatCloseClick> {
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
            b9y q2 = x9yVar.q("click_type");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) ClickType.class);
            }
            return new CommonVideoStat$TypeVideoAssistantChatCloseClick(eventType, commonVideoStat$AssistantType, C, C2, (ClickType) obj, fai.y(x9yVar, "is_show_last_answer"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantChatCloseClick commonVideoStat$TypeVideoAssistantChatCloseClick = (CommonVideoStat$TypeVideoAssistantChatCloseClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatCloseClick.c()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatCloseClick.a()));
            x9yVar.o("chat_id", commonVideoStat$TypeVideoAssistantChatCloseClick.a);
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantChatCloseClick.b);
            x9yVar.o("click_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantChatCloseClick.b()));
            x9yVar.m(commonVideoStat$TypeVideoAssistantChatCloseClick.d(), "is_show_last_answer");
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoAssistantChatCloseClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, ClickType clickType, Boolean bool) {
        this.eventType = eventType;
        this.assistantType = commonVideoStat$AssistantType;
        this.a = str;
        this.b = str2;
        this.clickType = clickType;
        this.isShowLastAnswer = bool;
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

    public final ClickType b() {
        return this.clickType;
    }

    public final EventType c() {
        return this.eventType;
    }

    public final Boolean d() {
        return this.isShowLastAnswer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantChatCloseClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantChatCloseClick commonVideoStat$TypeVideoAssistantChatCloseClick = (CommonVideoStat$TypeVideoAssistantChatCloseClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantChatCloseClick.eventType && this.assistantType == commonVideoStat$TypeVideoAssistantChatCloseClick.assistantType && epx.f(this.a, commonVideoStat$TypeVideoAssistantChatCloseClick.a) && epx.f(this.b, commonVideoStat$TypeVideoAssistantChatCloseClick.b) && this.clickType == commonVideoStat$TypeVideoAssistantChatCloseClick.clickType && epx.f(this.isShowLastAnswer, commonVideoStat$TypeVideoAssistantChatCloseClick.isShowLastAnswer);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ClickType clickType = this.clickType;
        int hashCode5 = (hashCode4 + (clickType == null ? 0 : clickType.hashCode())) * 31;
        Boolean bool = this.isShowLastAnswer;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAssistantChatCloseClick(eventType=");
        sb.append(this.eventType);
        sb.append(", assistantType=");
        sb.append(this.assistantType);
        sb.append(", chatId=");
        sb.append(this.a);
        sb.append(", queryIdSrc=");
        sb.append(this.b);
        sb.append(", clickType=");
        sb.append(this.clickType);
        sb.append(", isShowLastAnswer=");
        return tn.a(sb, this.isShowLastAnswer, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantChatCloseClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, String str2, ClickType clickType, Boolean bool, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$AssistantType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : clickType, (i & 32) != 0 ? null : bool);
    }
}
