package com.vk.stat.scheme;

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
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoProfileClickLink implements SchemeStat$TypeClick.b {
    public final transient String a;

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

        @pmi0("video_profile_click_link")
        public static final EventType VIDEO_PROFILE_CLICK_LINK;

        static {
            EventType eventType = new EventType("VIDEO_PROFILE_CLICK_LINK", 0);
            VIDEO_PROFILE_CLICK_LINK = eventType;
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

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeVideoProfileClickLink>, a9y<MobileOfficialAppsVideoStat$TypeVideoProfileClickLink> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsVideoStat$TypeVideoProfileClickLink((EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), fai.s(x9yVar, "object_url"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink = (MobileOfficialAppsVideoStat$TypeVideoProfileClickLink) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsVideoStat$TypeVideoProfileClickLink.a()));
            x9yVar.o("object_url", mobileOfficialAppsVideoStat$TypeVideoProfileClickLink.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoProfileClickLink(EventType eventType, String str) {
        this.eventType = eventType;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredObjectUrl = filteredString;
        filteredString.a(str);
    }

    public final EventType a() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoProfileClickLink)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink = (MobileOfficialAppsVideoStat$TypeVideoProfileClickLink) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoProfileClickLink.eventType && epx.f(this.a, mobileOfficialAppsVideoStat$TypeVideoProfileClickLink.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoProfileClickLink(eventType=");
        sb.append(this.eventType);
        sb.append(", objectUrl=");
        return ho8.a(sb, this.a, ')');
    }
}
