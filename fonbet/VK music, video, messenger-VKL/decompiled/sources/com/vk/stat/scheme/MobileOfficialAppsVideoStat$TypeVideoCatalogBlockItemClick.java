package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("action_click")
        public static final Subtype ACTION_CLICK;

        @pmi0("author_click")
        public static final Subtype AUTHOR_CLICK;

        @pmi0("playlist_click")
        public static final Subtype PLAYLIST_CLICK;

        static {
            Subtype subtype = new Subtype("AUTHOR_CLICK", 0);
            AUTHOR_CLICK = subtype;
            Subtype subtype2 = new Subtype("ACTION_CLICK", 1);
            ACTION_CLICK = subtype2;
            Subtype subtype3 = new Subtype("PLAYLIST_CLICK", 2);
            PLAYLIST_CLICK = subtype3;
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

    public MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick) && this.subtype == ((MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeVideoCatalogBlockItemClick(subtype=" + this.subtype + ')';
    }
}
