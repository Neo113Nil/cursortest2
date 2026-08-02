package com.vk.stat.scheme;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
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

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_url")
    private final FilteredString filteredObjectUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("close_anywhere")
        public static final EventType CLOSE_ANYWHERE;

        @pmi0("close_cross")
        public static final EventType CLOSE_CROSS;

        @pmi0("download_click")
        public static final EventType DOWNLOAD_CLICK;

        @pmi0("open_click")
        public static final EventType OPEN_CLICK;

        @pmi0("show")
        public static final EventType SHOW;

        @pmi0(FreeSpaceBox.TYPE)
        public static final EventType SKIP;

        static {
            EventType eventType = new EventType("SHOW", 0);
            SHOW = eventType;
            EventType eventType2 = new EventType("DOWNLOAD_CLICK", 1);
            DOWNLOAD_CLICK = eventType2;
            EventType eventType3 = new EventType("OPEN_CLICK", 2);
            OPEN_CLICK = eventType3;
            EventType eventType4 = new EventType("CLOSE_CROSS", 3);
            CLOSE_CROSS = eventType4;
            EventType eventType5 = new EventType("CLOSE_ANYWHERE", 4);
            CLOSE_ANYWHERE = eventType5;
            EventType eventType6 = new EventType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 5);
            SKIP = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick>, a9y<MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick((EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), fai.s(x9yVar, "object_url"), fai.B(x9yVar, "client_time"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick = (MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.b()));
            x9yVar.o("object_url", mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.a);
            x9yVar.n("client_time", mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.a());
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick(EventType eventType, String str, Long l) {
        this.eventType = eventType;
        this.a = str;
        this.clientTime = l;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredObjectUrl = filteredString;
        filteredString.a(str);
    }

    public final Long a() {
        return this.clientTime;
    }

    public final EventType b() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick = (MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.eventType && epx.f(this.a, mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.a) && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.clientTime);
    }

    public final int hashCode() {
        int a = urd0.a(this.eventType.hashCode() * 31, 31, this.a);
        Long l = this.clientTime;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoInstallTrapClick(eventType=");
        sb.append(this.eventType);
        sb.append(", objectUrl=");
        sb.append(this.a);
        sb.append(", clientTime=");
        return iq.b(sb, this.clientTime, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick(EventType eventType, String str, Long l, int i, zcl zclVar) {
        this(eventType, str, (i & 4) != 0 ? null : l);
    }
}
