package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeView;
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
public final class CommonVideoStat$TypeVideoAssistantLoaderShow implements SchemeStat$TypeView.b {
    public final transient String a;

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

        @pmi0("assistant_loader_show")
        public static final EventType ASSISTANT_LOADER_SHOW;

        static {
            EventType eventType = new EventType("ASSISTANT_LOADER_SHOW", 0);
            ASSISTANT_LOADER_SHOW = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantLoaderShow>, a9y<CommonVideoStat$TypeVideoAssistantLoaderShow> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("assistant_type");
            return new CommonVideoStat$TypeVideoAssistantLoaderShow(eventType, (CommonVideoStat$AssistantType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoStat$AssistantType.class)), fai.C(x9yVar, "query_id_src"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantLoaderShow commonVideoStat$TypeVideoAssistantLoaderShow = (CommonVideoStat$TypeVideoAssistantLoaderShow) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantLoaderShow.b()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantLoaderShow.a()));
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantLoaderShow.a);
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoAssistantLoaderShow(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str) {
        this.eventType = eventType;
        this.assistantType = commonVideoStat$AssistantType;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredQueryIdSrc = filteredString;
        filteredString.a(str);
    }

    public final CommonVideoStat$AssistantType a() {
        return this.assistantType;
    }

    public final EventType b() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantLoaderShow)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantLoaderShow commonVideoStat$TypeVideoAssistantLoaderShow = (CommonVideoStat$TypeVideoAssistantLoaderShow) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantLoaderShow.eventType && this.assistantType == commonVideoStat$TypeVideoAssistantLoaderShow.assistantType && epx.f(this.a, commonVideoStat$TypeVideoAssistantLoaderShow.a);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        String str = this.a;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAssistantLoaderShow(eventType=");
        sb.append(this.eventType);
        sb.append(", assistantType=");
        sb.append(this.assistantType);
        sb.append(", queryIdSrc=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantLoaderShow(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$AssistantType, (i & 4) != 0 ? null : str);
    }
}
