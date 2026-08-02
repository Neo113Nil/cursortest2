package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedStartFastChat implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("from_reactions_modal")
        public static final EntryPoint FROM_REACTIONS_MODAL;

        @pmi0("from_reactions_user_icon")
        public static final EntryPoint FROM_REACTIONS_USER_ICON;

        static {
            EntryPoint entryPoint = new EntryPoint("FROM_REACTIONS_USER_ICON", 0);
            FROM_REACTIONS_USER_ICON = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("FROM_REACTIONS_MODAL", 1);
            FROM_REACTIONS_MODAL = entryPoint2;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedStartFastChat(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedStartFastChat) && this.entryPoint == ((MobileOfficialAppsFeedStat$TypeFeedStartFastChat) obj).entryPoint;
    }

    public final int hashCode() {
        return this.entryPoint.hashCode();
    }

    public final String toString() {
        return "TypeFeedStartFastChat(entryPoint=" + this.entryPoint + ')';
    }
}
