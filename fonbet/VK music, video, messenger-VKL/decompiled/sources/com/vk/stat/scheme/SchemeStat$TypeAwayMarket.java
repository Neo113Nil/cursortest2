package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAwayMarket {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("open_receipt_link")
        public static final Subtype OPEN_RECEIPT_LINK;

        @pmi0("open_track_code_link")
        public static final Subtype OPEN_TRACK_CODE_LINK;

        @pmi0("open_wiki")
        public static final Subtype OPEN_WIKI;

        static {
            Subtype subtype = new Subtype("OPEN_TRACK_CODE_LINK", 0);
            OPEN_TRACK_CODE_LINK = subtype;
            Subtype subtype2 = new Subtype("OPEN_WIKI", 1);
            OPEN_WIKI = subtype2;
            Subtype subtype3 = new Subtype("OPEN_RECEIPT_LINK", 2);
            OPEN_RECEIPT_LINK = subtype3;
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

    public SchemeStat$TypeAwayMarket(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeAwayMarket) && this.subtype == ((SchemeStat$TypeAwayMarket) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeAwayMarket(subtype=" + this.subtype + ')';
    }
}
