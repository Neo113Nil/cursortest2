package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
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
public final class CommonVideoStat$TypeVideoClickWithActivePlayer implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("vsid")
    private final FilteredString filteredVsid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("copy_link")
        public static final EventType COPY_LINK;

        static {
            EventType eventType = new EventType("COPY_LINK", 0);
            COPY_LINK = eventType;
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
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVideoClickWithActivePlayer>, a9y<CommonVideoStat$TypeVideoClickWithActivePlayer> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String s = fai.s(x9yVar, "vsid");
            Gson a = tru.a();
            b9y q = x9yVar.q("event_type");
            return new CommonVideoStat$TypeVideoClickWithActivePlayer(s, (EventType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EventType.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer = (CommonVideoStat$TypeVideoClickWithActivePlayer) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("vsid", commonVideoStat$TypeVideoClickWithActivePlayer.a);
            x9yVar.o("event_type", tru.a().toJson(commonVideoStat$TypeVideoClickWithActivePlayer.a()));
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVideoClickWithActivePlayer(String str, EventType eventType) {
        this.a = str;
        this.eventType = eventType;
        FilteredString filteredString = new FilteredString(lhg.b(14));
        this.filteredVsid = filteredString;
        filteredString.a(str);
    }

    public final EventType a() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoClickWithActivePlayer)) {
            return false;
        }
        CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer = (CommonVideoStat$TypeVideoClickWithActivePlayer) obj;
        return epx.f(this.a, commonVideoStat$TypeVideoClickWithActivePlayer.a) && this.eventType == commonVideoStat$TypeVideoClickWithActivePlayer.eventType;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeVideoClickWithActivePlayer(vsid=" + this.a + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoClickWithActivePlayer(String str, EventType eventType, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : eventType);
    }
}
