package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost implements SchemeStat$TypeAction.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("delete_post")
        public static final Subtype DELETE_POST;

        @pmi0("detect_in_batch")
        public static final Subtype DETECT_IN_BATCH;

        static {
            Subtype subtype = new Subtype("DELETE_POST", 0);
            DELETE_POST = subtype;
            Subtype subtype2 = new Subtype("DETECT_IN_BATCH", 1);
            DETECT_IN_BATCH = subtype2;
            Subtype[] subtypeArr = {subtype, subtype2};
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

    public MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost) && this.subtype == ((MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeFeedDuplicateOwnerPost(subtype=" + this.subtype + ')';
    }
}
