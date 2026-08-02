package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedViewAuthors implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("from_combo_avatar")
        public static final EntryPoint FROM_COMBO_AVATAR;

        @pmi0("from_header")
        public static final EntryPoint FROM_HEADER;

        static {
            EntryPoint entryPoint = new EntryPoint("FROM_COMBO_AVATAR", 0);
            FROM_COMBO_AVATAR = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("FROM_HEADER", 1);
            FROM_HEADER = entryPoint2;
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

    public MobileOfficialAppsFeedStat$TypeFeedViewAuthors(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedViewAuthors) && this.entryPoint == ((MobileOfficialAppsFeedStat$TypeFeedViewAuthors) obj).entryPoint;
    }

    public final int hashCode() {
        return this.entryPoint.hashCode();
    }

    public final String toString() {
        return "TypeFeedViewAuthors(entryPoint=" + this.entryPoint + ')';
    }
}
