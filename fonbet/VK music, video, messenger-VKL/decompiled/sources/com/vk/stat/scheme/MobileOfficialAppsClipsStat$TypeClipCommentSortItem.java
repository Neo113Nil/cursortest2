package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipCommentSortItem implements SchemeStat$TypeAction.b {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("sort_latest")
        public static final EventSubtype SORT_LATEST;

        @pmi0("sort_oldest")
        public static final EventSubtype SORT_OLDEST;

        @pmi0("sort_popular")
        public static final EventSubtype SORT_POPULAR;

        static {
            EventSubtype eventSubtype = new EventSubtype("SORT_POPULAR", 0);
            SORT_POPULAR = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SORT_OLDEST", 1);
            SORT_OLDEST = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("SORT_LATEST", 2);
            SORT_LATEST = eventSubtype3;
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

    public MobileOfficialAppsClipsStat$TypeClipCommentSortItem(EventSubtype eventSubtype, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventSubtype = eventSubtype;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipCommentSortItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipCommentSortItem mobileOfficialAppsClipsStat$TypeClipCommentSortItem = (MobileOfficialAppsClipsStat$TypeClipCommentSortItem) obj;
        return this.eventSubtype == mobileOfficialAppsClipsStat$TypeClipCommentSortItem.eventSubtype && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipCommentSortItem.clipItem);
    }

    public final int hashCode() {
        int hashCode = this.eventSubtype.hashCode() * 31;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        return hashCode + (mobileOfficialAppsClipsStat$TypeClipsClipItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode());
    }

    public final String toString() {
        return "TypeClipCommentSortItem(eventSubtype=" + this.eventSubtype + ", clipItem=" + this.clipItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipCommentSortItem(EventSubtype eventSubtype, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this(eventSubtype, (i & 2) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
