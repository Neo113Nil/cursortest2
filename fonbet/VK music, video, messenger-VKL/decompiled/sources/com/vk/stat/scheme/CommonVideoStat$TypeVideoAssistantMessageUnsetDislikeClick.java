package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
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
public final class CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_id")
    private final CommonVideoStat$AssistantId assistantId;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("assistant_message_unset_dislike_click")
        public static final EventType ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK;

        static {
            EventType eventType = new EventType("ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK", 0);
            ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick>, a9y<CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("assistant_type");
            Object obj = null;
            CommonVideoStat$AssistantType commonVideoStat$AssistantType = (CommonVideoStat$AssistantType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoStat$AssistantType.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("assistant_id");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) CommonVideoStat$AssistantId.class);
            }
            return new CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick(eventType, commonVideoStat$AssistantType, (CommonVideoStat$AssistantId) obj, fai.C(x9yVar, "query_id_src"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick = (CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.c()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.b()));
            x9yVar.o("assistant_id", tru.a().toJson(commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.a()));
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.a);
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, String str) {
        this.eventType = eventType;
        this.assistantType = commonVideoStat$AssistantType;
        this.assistantId = commonVideoStat$AssistantId;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredQueryIdSrc = filteredString;
        filteredString.a(str);
    }

    public final CommonVideoStat$AssistantId a() {
        return this.assistantId;
    }

    public final CommonVideoStat$AssistantType b() {
        return this.assistantType;
    }

    public final EventType c() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick = (CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.eventType && this.assistantType == commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.assistantType && epx.f(this.assistantId, commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.assistantId) && epx.f(this.a, commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.a);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        CommonVideoStat$AssistantId commonVideoStat$AssistantId = this.assistantId;
        int hashCode3 = (hashCode2 + (commonVideoStat$AssistantId == null ? 0 : commonVideoStat$AssistantId.hashCode())) * 31;
        String str = this.a;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAssistantMessageUnsetDislikeClick(eventType=");
        sb.append(this.eventType);
        sb.append(", assistantType=");
        sb.append(this.assistantType);
        sb.append(", assistantId=");
        sb.append(this.assistantId);
        sb.append(", queryIdSrc=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$AssistantType, (i & 4) != 0 ? null : commonVideoStat$AssistantId, (i & 8) != 0 ? null : str);
    }
}
