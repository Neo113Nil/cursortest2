package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.jsonwebtoken.JwsHeader;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("for_kids")
        public static final EventSubtype FOR_KIDS;

        @pmi0(JwsHeader.KEY_ID)
        public static final EventSubtype KID;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final EventSubtype PROFILE;

        static {
            EventSubtype eventSubtype = new EventSubtype("KID", 0);
            KID = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("PROFILE", 1);
            PROFILE = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("FOR_KIDS", 2);
            FOR_KIDS = eventSubtype3;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3};
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap) && this.eventSubtype == ((MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap) obj).eventSubtype;
    }

    public final int hashCode() {
        EventSubtype eventSubtype = this.eventSubtype;
        if (eventSubtype == null) {
            return 0;
        }
        return eventSubtype.hashCode();
    }

    public final String toString() {
        return "TypeVideoChangeProfileButtonTap(eventSubtype=" + this.eventSubtype + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap(EventSubtype eventSubtype) {
        this.eventSubtype = eventSubtype;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap(EventSubtype eventSubtype, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventSubtype);
    }
}
