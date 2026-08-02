package com.vk.stat.scheme;

import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$ImRemoteEventStepItem {
    public final transient String a;

    @pmi0("duration_usec")
    private final Long durationUsec;

    @pmi0("duration")
    private final FilteredString filteredDuration;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsImStat$ImRemoteEventStepItem>, a9y<MobileOfficialAppsImStat$ImRemoteEventStepItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsImStat$ImRemoteEventStepItem((Subtype) dq.f(x9yVar, "subtype", tru.a(), Subtype.class), fai.s(x9yVar, "duration"), fai.B(x9yVar, "duration_usec"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsImStat$ImRemoteEventStepItem mobileOfficialAppsImStat$ImRemoteEventStepItem = (MobileOfficialAppsImStat$ImRemoteEventStepItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(mobileOfficialAppsImStat$ImRemoteEventStepItem.b()));
            x9yVar.o("duration", mobileOfficialAppsImStat$ImRemoteEventStepItem.a);
            x9yVar.n("duration_usec", mobileOfficialAppsImStat$ImRemoteEventStepItem.a());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("api_parsing")
        public static final Subtype API_PARSING;

        @pmi0("api_request")
        public static final Subtype API_REQUEST;

        @pmi0("db_parsing")
        public static final Subtype DB_PARSING;

        @pmi0("db_request")
        public static final Subtype DB_REQUEST;

        @pmi0("db_store")
        public static final Subtype DB_STORE;

        @pmi0("event_parsing")
        public static final Subtype EVENT_PARSING;

        @pmi0("event_request")
        public static final Subtype EVENT_REQUEST;

        @pmi0("event_wire_parsing")
        public static final Subtype EVENT_WIRE_PARSING;

        static {
            Subtype subtype = new Subtype("EVENT_REQUEST", 0);
            EVENT_REQUEST = subtype;
            Subtype subtype2 = new Subtype("EVENT_WIRE_PARSING", 1);
            EVENT_WIRE_PARSING = subtype2;
            Subtype subtype3 = new Subtype("EVENT_PARSING", 2);
            EVENT_PARSING = subtype3;
            Subtype subtype4 = new Subtype("DB_REQUEST", 3);
            DB_REQUEST = subtype4;
            Subtype subtype5 = new Subtype("DB_PARSING", 4);
            DB_PARSING = subtype5;
            Subtype subtype6 = new Subtype("API_REQUEST", 5);
            API_REQUEST = subtype6;
            Subtype subtype7 = new Subtype("API_PARSING", 6);
            API_PARSING = subtype7;
            Subtype subtype8 = new Subtype("DB_STORE", 7);
            DB_STORE = subtype8;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsImStat$ImRemoteEventStepItem(Subtype subtype, String str, Long l) {
        this.subtype = subtype;
        this.a = str;
        this.durationUsec = l;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredDuration = filteredString;
        filteredString.a(str);
    }

    public final Long a() {
        return this.durationUsec;
    }

    public final Subtype b() {
        return this.subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$ImRemoteEventStepItem)) {
            return false;
        }
        MobileOfficialAppsImStat$ImRemoteEventStepItem mobileOfficialAppsImStat$ImRemoteEventStepItem = (MobileOfficialAppsImStat$ImRemoteEventStepItem) obj;
        return this.subtype == mobileOfficialAppsImStat$ImRemoteEventStepItem.subtype && epx.f(this.a, mobileOfficialAppsImStat$ImRemoteEventStepItem.a) && epx.f(this.durationUsec, mobileOfficialAppsImStat$ImRemoteEventStepItem.durationUsec);
    }

    public final int hashCode() {
        int a = urd0.a(this.subtype.hashCode() * 31, 31, this.a);
        Long l = this.durationUsec;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImRemoteEventStepItem(subtype=");
        sb.append(this.subtype);
        sb.append(", duration=");
        sb.append(this.a);
        sb.append(", durationUsec=");
        return iq.b(sb, this.durationUsec, ')');
    }

    public /* synthetic */ MobileOfficialAppsImStat$ImRemoteEventStepItem(Subtype subtype, String str, Long l, int i, zcl zclVar) {
        this(subtype, str, (i & 4) != 0 ? null : l);
    }
}
