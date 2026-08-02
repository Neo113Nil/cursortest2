package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem implements SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("place")
    private final Place place;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
    public static final class Place {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Place[] $VALUES;

        @pmi0("button")
        public static final Place BUTTON;

        @pmi0("filter")
        public static final Place FILTER;

        @pmi0("list")
        public static final Place LIST;

        @pmi0("marker")
        public static final Place MARKER;

        static {
            Place place = new Place("MARKER", 0);
            MARKER = place;
            Place place2 = new Place("FILTER", 1);
            FILTER = place2;
            Place place3 = new Place("LIST", 2);
            LIST = place3;
            Place place4 = new Place("BUTTON", 3);
            BUTTON = place4;
            Place[] placeArr = {place, place2, place3, place4};
            $VALUES = placeArr;
            $ENTRIES = new asp(placeArr);
        }

        private Place(String str, int i) {
        }

        public static Place valueOf(String str) {
            return (Place) Enum.valueOf(Place.class, str);
        }

        public static Place[] values() {
            return (Place[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem) && this.place == ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem) obj).place;
    }

    public final int hashCode() {
        Place place = this.place;
        if (place == null) {
            return 0;
        }
        return place.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryNavgoItem(place=" + this.place + ')';
    }

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem(Place place) {
        this.place = place;
    }

    public /* synthetic */ MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryNavgoItem(Place place, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : place);
    }
}
