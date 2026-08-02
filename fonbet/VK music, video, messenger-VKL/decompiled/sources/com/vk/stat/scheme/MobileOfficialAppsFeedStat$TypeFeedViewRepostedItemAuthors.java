package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_owner_id")
    private final long itemOwnerId;

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

    public MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors(EntryPoint entryPoint, long j, int i) {
        this.entryPoint = entryPoint;
        this.itemOwnerId = j;
        this.itemId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors = (MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.entryPoint && this.itemOwnerId == mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.itemOwnerId && this.itemId == mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.itemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemId) + bh10.a(this.entryPoint.hashCode() * 31, 31, this.itemOwnerId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedViewRepostedItemAuthors(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", itemOwnerId=");
        sb.append(this.itemOwnerId);
        sb.append(", itemId=");
        return vu5.b(sb, this.itemId, ')');
    }
}
