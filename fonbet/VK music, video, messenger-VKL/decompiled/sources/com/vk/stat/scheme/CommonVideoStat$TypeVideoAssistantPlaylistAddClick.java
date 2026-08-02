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
public final class CommonVideoStat$TypeVideoAssistantPlaylistAddClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_id")
    private final CommonVideoStat$AssistantId assistantId;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;
    public final transient String b;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("playlist_id")
    private final FilteredString filteredPlaylistId;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("assistant_playlist_add")
        public static final EventType ASSISTANT_PLAYLIST_ADD;

        static {
            EventType eventType = new EventType("ASSISTANT_PLAYLIST_ADD", 0);
            ASSISTANT_PLAYLIST_ADD = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantPlaylistAddClick>, a9y<CommonVideoStat$TypeVideoAssistantPlaylistAddClick> {
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
            CommonVideoStat$AssistantId commonVideoStat$AssistantId = (CommonVideoStat$AssistantId) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), CommonVideoStat$AssistantId.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("source");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) Source.class);
            }
            return new CommonVideoStat$TypeVideoAssistantPlaylistAddClick(eventType, commonVideoStat$AssistantType, commonVideoStat$AssistantId, (Source) obj, fai.C(x9yVar, "playlist_id"), fai.C(x9yVar, "query_id_src"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantPlaylistAddClick commonVideoStat$TypeVideoAssistantPlaylistAddClick = (CommonVideoStat$TypeVideoAssistantPlaylistAddClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantPlaylistAddClick.c()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantPlaylistAddClick.b()));
            x9yVar.o("assistant_id", tru.a().toJson(commonVideoStat$TypeVideoAssistantPlaylistAddClick.a()));
            x9yVar.o("source", tru.a().toJson(commonVideoStat$TypeVideoAssistantPlaylistAddClick.d()));
            x9yVar.o("playlist_id", commonVideoStat$TypeVideoAssistantPlaylistAddClick.a);
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantPlaylistAddClick.b);
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

        @pmi0("chat")
        public static final Source CHAT;

        @pmi0("search")
        public static final Source SEARCH;

        static {
            Source source = new Source("CHAT", 0);
            CHAT = source;
            Source source2 = new Source("SEARCH", 1);
            SEARCH = source2;
            Source[] sourceArr = {source, source2};
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

    public CommonVideoStat$TypeVideoAssistantPlaylistAddClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, Source source, String str, String str2) {
        this.eventType = eventType;
        this.assistantType = commonVideoStat$AssistantType;
        this.assistantId = commonVideoStat$AssistantId;
        this.source = source;
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredPlaylistId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(32));
        this.filteredQueryIdSrc = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
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

    public final Source d() {
        return this.source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantPlaylistAddClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantPlaylistAddClick commonVideoStat$TypeVideoAssistantPlaylistAddClick = (CommonVideoStat$TypeVideoAssistantPlaylistAddClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantPlaylistAddClick.eventType && this.assistantType == commonVideoStat$TypeVideoAssistantPlaylistAddClick.assistantType && epx.f(this.assistantId, commonVideoStat$TypeVideoAssistantPlaylistAddClick.assistantId) && this.source == commonVideoStat$TypeVideoAssistantPlaylistAddClick.source && epx.f(this.a, commonVideoStat$TypeVideoAssistantPlaylistAddClick.a) && epx.f(this.b, commonVideoStat$TypeVideoAssistantPlaylistAddClick.b);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        CommonVideoStat$AssistantId commonVideoStat$AssistantId = this.assistantId;
        int hashCode3 = (hashCode2 + (commonVideoStat$AssistantId == null ? 0 : commonVideoStat$AssistantId.hashCode())) * 31;
        Source source = this.source;
        int hashCode4 = (hashCode3 + (source == null ? 0 : source.hashCode())) * 31;
        String str = this.a;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAssistantPlaylistAddClick(eventType=");
        sb.append(this.eventType);
        sb.append(", assistantType=");
        sb.append(this.assistantType);
        sb.append(", assistantId=");
        sb.append(this.assistantId);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", playlistId=");
        sb.append(this.a);
        sb.append(", queryIdSrc=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantPlaylistAddClick(EventType eventType, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, Source source, String str, String str2, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$AssistantType, (i & 4) != 0 ? null : commonVideoStat$AssistantId, (i & 8) != 0 ? null : source, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }
}
