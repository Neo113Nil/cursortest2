package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeWorkiSnippetItem {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("open_call")
        public static final Subtype OPEN_CALL;

        @pmi0("open_cta")
        public static final Subtype OPEN_CTA;

        static {
            Subtype subtype = new Subtype("OPEN_CTA", 0);
            OPEN_CTA = subtype;
            Subtype subtype2 = new Subtype("OPEN_CALL", 1);
            OPEN_CALL = subtype2;
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

    public SchemeStat$TypeWorkiSnippetItem(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeWorkiSnippetItem) && this.subtype == ((SchemeStat$TypeWorkiSnippetItem) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeWorkiSnippetItem(subtype=" + this.subtype + ')';
    }
}
