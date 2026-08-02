package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
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
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeTopshelfAction implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("auto")
        public static final EventSubtype AUTO;

        @pmi0("manual")
        public static final EventSubtype MANUAL;

        static {
            EventSubtype eventSubtype = new EventSubtype("MANUAL", 0);
            MANUAL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUTO", 1);
            AUTO = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("topshelf_next_card_show")
        public static final EventType TOPSHELF_NEXT_CARD_SHOW;

        @pmi0("topshelf_prev_card_show")
        public static final EventType TOPSHELF_PREV_CARD_SHOW;

        static {
            EventType eventType = new EventType("TOPSHELF_NEXT_CARD_SHOW", 0);
            TOPSHELF_NEXT_CARD_SHOW = eventType;
            EventType eventType2 = new EventType("TOPSHELF_PREV_CARD_SHOW", 1);
            TOPSHELF_PREV_CARD_SHOW = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeTopshelfAction>, a9y<MobileOfficialAppsVideoStat$TypeTopshelfAction> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsVideoStat$TypeTopshelfAction((EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), (EventSubtype) dq.f(x9yVar, "event_subtype", tru.a(), EventSubtype.class), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsVideoStat$TypeTopshelfAction mobileOfficialAppsVideoStat$TypeTopshelfAction = (MobileOfficialAppsVideoStat$TypeTopshelfAction) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsVideoStat$TypeTopshelfAction.b()));
            x9yVar.o("event_subtype", tru.a().toJson(mobileOfficialAppsVideoStat$TypeTopshelfAction.a()));
            x9yVar.o("track_code", mobileOfficialAppsVideoStat$TypeTopshelfAction.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeTopshelfAction(EventType eventType, EventSubtype eventSubtype, String str) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final EventSubtype a() {
        return this.eventSubtype;
    }

    public final EventType b() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTopshelfAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTopshelfAction mobileOfficialAppsVideoStat$TypeTopshelfAction = (MobileOfficialAppsVideoStat$TypeTopshelfAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeTopshelfAction.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeTopshelfAction.eventSubtype && epx.f(this.a, mobileOfficialAppsVideoStat$TypeTopshelfAction.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeTopshelfAction(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }
}
