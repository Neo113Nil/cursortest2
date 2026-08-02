package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeMute implements MobileOfficialAppsClipsStat$TypeClipEditorItem.a {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("disable")
        public static final EventSubtype DISABLE;

        @pmi0(com.ironsource.mediationsdk.metadata.a.j)
        public static final EventSubtype ENABLE;

        static {
            EventSubtype eventSubtype = new EventSubtype("ENABLE", 0);
            ENABLE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("DISABLE", 1);
            DISABLE = eventSubtype2;
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

    public MobileOfficialAppsClipsStat$TypeMute(EventSubtype eventSubtype) {
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeMute) && this.eventSubtype == ((MobileOfficialAppsClipsStat$TypeMute) obj).eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode();
    }

    public final String toString() {
        return "TypeMute(eventSubtype=" + this.eventSubtype + ')';
    }
}
