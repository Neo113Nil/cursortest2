package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryChangeMapActionItem implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("swipe")
        public static final Type SWIPE;

        @pmi0("zoom_in")
        public static final Type ZOOM_IN;

        @pmi0("zoom_out")
        public static final Type ZOOM_OUT;

        static {
            Type type = new Type("SWIPE", 0);
            SWIPE = type;
            Type type2 = new Type("ZOOM_IN", 1);
            ZOOM_IN = type2;
            Type type3 = new Type("ZOOM_OUT", 2);
            ZOOM_OUT = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryChangeMapActionItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryChangeMapActionItem) && this.type == ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryChangeMapActionItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryChangeMapActionItem(type=" + this.type + ')';
    }
}
