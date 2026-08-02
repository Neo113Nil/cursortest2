package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostTextAction implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("copy")
        public static final Subtype COPY;

        @pmi0("select")
        public static final Subtype SELECT;

        @pmi0("select_all")
        public static final Subtype SELECT_ALL;

        static {
            Subtype subtype = new Subtype("SELECT", 0);
            SELECT = subtype;
            Subtype subtype2 = new Subtype("SELECT_ALL", 1);
            SELECT_ALL = subtype2;
            Subtype subtype3 = new Subtype("COPY", 2);
            COPY = subtype3;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3};
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

    public MobileOfficialAppsFeedStat$TypeFeedPostTextAction(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostTextAction) && this.subtype == ((MobileOfficialAppsFeedStat$TypeFeedPostTextAction) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostTextAction(subtype=" + this.subtype + ')';
    }
}
