package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("back")
        public static final Subtype BACK;

        @pmi0("search_btn")
        public static final Subtype SEARCH_BTN;

        @pmi0("zoom_in")
        public static final Subtype ZOOM_IN;

        @pmi0("zoom_out")
        public static final Subtype ZOOM_OUT;

        static {
            Subtype subtype = new Subtype("SEARCH_BTN", 0);
            SEARCH_BTN = subtype;
            Subtype subtype2 = new Subtype("ZOOM_IN", 1);
            ZOOM_IN = subtype2;
            Subtype subtype3 = new Subtype("ZOOM_OUT", 2);
            ZOOM_OUT = subtype3;
            Subtype subtype4 = new Subtype("BACK", 3);
            BACK = subtype4;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4};
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

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem) && this.subtype == ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryMapControlClickItem(subtype=" + this.subtype + ')';
    }
}
