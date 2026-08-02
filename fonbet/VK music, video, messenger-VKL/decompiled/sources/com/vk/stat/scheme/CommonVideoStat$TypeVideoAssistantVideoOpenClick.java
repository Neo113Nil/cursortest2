package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$TypeVideoAssistantVideoOpenClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("assistant_id")
    private final CommonVideoStat$AssistantId assistantId;

    @pmi0("assistant_type")
    private final CommonVideoStat$AssistantType assistantType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("query_id_src")
    private final FilteredString filteredQueryIdSrc;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("assistant_playlist_video_open_click")
        public static final EventType ASSISTANT_PLAYLIST_VIDEO_OPEN_CLICK;

        static {
            EventType eventType = new EventType("ASSISTANT_PLAYLIST_VIDEO_OPEN_CLICK", 0);
            ASSISTANT_PLAYLIST_VIDEO_OPEN_CLICK = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoAssistantVideoOpenClick>, a9y<CommonVideoStat$TypeVideoAssistantVideoOpenClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            long q = fai.q(x9yVar, "video_owner_id");
            int p = fai.p(x9yVar, "video_id");
            Gson a = tru.a();
            b9y q2 = x9yVar.q("assistant_type");
            Object obj = null;
            CommonVideoStat$AssistantType commonVideoStat$AssistantType = (CommonVideoStat$AssistantType) ((q2 == null || (q2 instanceof u9y)) ? null : a.fromJson(q2.k(), CommonVideoStat$AssistantType.class));
            Gson a2 = tru.a();
            b9y q3 = x9yVar.q("assistant_id");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a2.fromJson(q3.k(), (Class<Object>) CommonVideoStat$AssistantId.class);
            }
            return new CommonVideoStat$TypeVideoAssistantVideoOpenClick(eventType, q, p, commonVideoStat$AssistantType, (CommonVideoStat$AssistantId) obj, fai.C(x9yVar, "query_id_src"), fai.A(x9yVar, X3.i.L));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoAssistantVideoOpenClick commonVideoStat$TypeVideoAssistantVideoOpenClick = (CommonVideoStat$TypeVideoAssistantVideoOpenClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantVideoOpenClick.c()));
            x9yVar.n("video_owner_id", Long.valueOf(commonVideoStat$TypeVideoAssistantVideoOpenClick.f()));
            x9yVar.n("video_id", Integer.valueOf(commonVideoStat$TypeVideoAssistantVideoOpenClick.e()));
            x9yVar.o("assistant_type", tru.a().toJson(commonVideoStat$TypeVideoAssistantVideoOpenClick.b()));
            x9yVar.o("assistant_id", tru.a().toJson(commonVideoStat$TypeVideoAssistantVideoOpenClick.a()));
            x9yVar.o("query_id_src", commonVideoStat$TypeVideoAssistantVideoOpenClick.a);
            x9yVar.n(X3.i.L, commonVideoStat$TypeVideoAssistantVideoOpenClick.d());
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoAssistantVideoOpenClick(EventType eventType, long j, int i, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, String str, Integer num) {
        this.eventType = eventType;
        this.videoOwnerId = j;
        this.videoId = i;
        this.assistantType = commonVideoStat$AssistantType;
        this.assistantId = commonVideoStat$AssistantId;
        this.a = str;
        this.position = num;
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

    public final Integer d() {
        return this.position;
    }

    public final int e() {
        return this.videoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAssistantVideoOpenClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAssistantVideoOpenClick commonVideoStat$TypeVideoAssistantVideoOpenClick = (CommonVideoStat$TypeVideoAssistantVideoOpenClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAssistantVideoOpenClick.eventType && this.videoOwnerId == commonVideoStat$TypeVideoAssistantVideoOpenClick.videoOwnerId && this.videoId == commonVideoStat$TypeVideoAssistantVideoOpenClick.videoId && this.assistantType == commonVideoStat$TypeVideoAssistantVideoOpenClick.assistantType && epx.f(this.assistantId, commonVideoStat$TypeVideoAssistantVideoOpenClick.assistantId) && epx.f(this.a, commonVideoStat$TypeVideoAssistantVideoOpenClick.a) && epx.f(this.position, commonVideoStat$TypeVideoAssistantVideoOpenClick.position);
    }

    public final long f() {
        return this.videoOwnerId;
    }

    public final int hashCode() {
        int a = shy.a(this.videoId, bh10.a(this.eventType.hashCode() * 31, 31, this.videoOwnerId), 31);
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = this.assistantType;
        int hashCode = (a + (commonVideoStat$AssistantType == null ? 0 : commonVideoStat$AssistantType.hashCode())) * 31;
        CommonVideoStat$AssistantId commonVideoStat$AssistantId = this.assistantId;
        int hashCode2 = (hashCode + (commonVideoStat$AssistantId == null ? 0 : commonVideoStat$AssistantId.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.position;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAssistantVideoOpenClick(eventType=");
        sb.append(this.eventType);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", assistantType=");
        sb.append(this.assistantType);
        sb.append(", assistantId=");
        sb.append(this.assistantId);
        sb.append(", queryIdSrc=");
        sb.append(this.a);
        sb.append(", position=");
        return uqi.b(sb, this.position, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAssistantVideoOpenClick(EventType eventType, long j, int i, CommonVideoStat$AssistantType commonVideoStat$AssistantType, CommonVideoStat$AssistantId commonVideoStat$AssistantId, String str, Integer num, int i2, zcl zclVar) {
        this(eventType, j, i, (i2 & 8) != 0 ? null : commonVideoStat$AssistantType, (i2 & 16) != 0 ? null : commonVideoStat$AssistantId, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : num);
    }
}
