package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$TypeVideoNextVideoStartAction implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("vsid")
    private final FilteredString filteredVsid;

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

        @pmi0("next_video_start_auto")
        public static final EventType NEXT_VIDEO_START_AUTO;

        static {
            EventType eventType = new EventType("NEXT_VIDEO_START_AUTO", 0);
            NEXT_VIDEO_START_AUTO = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoNextVideoStartAction>, a9y<CommonVideoStat$TypeVideoNextVideoStartAction> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            long q = fai.q(x9yVar, "video_owner_id");
            int p = fai.p(x9yVar, "video_id");
            String s = fai.s(x9yVar, "vsid");
            Gson a = tru.a();
            b9y q2 = x9yVar.q("event_type");
            return new CommonVideoStat$TypeVideoNextVideoStartAction(q, p, s, (EventType) ((q2 == null || (q2 instanceof u9y)) ? null : a.fromJson(q2.k(), EventType.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoNextVideoStartAction commonVideoStat$TypeVideoNextVideoStartAction = (CommonVideoStat$TypeVideoNextVideoStartAction) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("video_owner_id", Long.valueOf(commonVideoStat$TypeVideoNextVideoStartAction.c()));
            x9yVar.n("video_id", Integer.valueOf(commonVideoStat$TypeVideoNextVideoStartAction.b()));
            x9yVar.o("vsid", commonVideoStat$TypeVideoNextVideoStartAction.a);
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoNextVideoStartAction.a()));
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoNextVideoStartAction(long j, int i, String str, EventType eventType) {
        this.videoOwnerId = j;
        this.videoId = i;
        this.a = str;
        this.eventType = eventType;
        FilteredString filteredString = new FilteredString(lhg.b(14));
        this.filteredVsid = filteredString;
        filteredString.a(str);
    }

    public final EventType a() {
        return this.eventType;
    }

    public final int b() {
        return this.videoId;
    }

    public final long c() {
        return this.videoOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoNextVideoStartAction)) {
            return false;
        }
        CommonVideoStat$TypeVideoNextVideoStartAction commonVideoStat$TypeVideoNextVideoStartAction = (CommonVideoStat$TypeVideoNextVideoStartAction) obj;
        return this.videoOwnerId == commonVideoStat$TypeVideoNextVideoStartAction.videoOwnerId && this.videoId == commonVideoStat$TypeVideoNextVideoStartAction.videoId && epx.f(this.a, commonVideoStat$TypeVideoNextVideoStartAction.a) && this.eventType == commonVideoStat$TypeVideoNextVideoStartAction.eventType;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.videoId, Long.hashCode(this.videoOwnerId) * 31, 31), 31, this.a);
        EventType eventType = this.eventType;
        return a + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeVideoNextVideoStartAction(videoOwnerId=" + this.videoOwnerId + ", videoId=" + this.videoId + ", vsid=" + this.a + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoNextVideoStartAction(long j, int i, String str, EventType eventType, int i2, zcl zclVar) {
        this(j, i, str, (i2 & 8) != 0 ? null : eventType);
    }
}
