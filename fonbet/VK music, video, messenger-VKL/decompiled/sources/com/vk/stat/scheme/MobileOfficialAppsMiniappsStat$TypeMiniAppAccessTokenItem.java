package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("generate")
        public static final EventType GENERATE;

        @pmi0("resolve")
        public static final EventType RESOLVE;

        static {
            EventType eventType = new EventType("RESOLVE", 0);
            RESOLVE = eventType;
            EventType eventType2 = new EventType("GENERATE", 1);
            GENERATE = eventType2;
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

    public MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem(EventType eventType, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, String str) {
        this.eventType = eventType;
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
        this.type = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem) obj;
        return this.eventType == mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem.eventType && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem.appId) && epx.f(this.type, mobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem.type);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        int hashCode2 = (hashCode + (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode())) * 31;
        String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppAccessTokenItem(eventType=");
        sb.append(this.eventType);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppAccessTokenItem(EventType eventType, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsMiniappsStat$AppIdItem, (i & 4) != 0 ? "new" : str);
    }
}
