package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("addresses")
        public static final Type ADDRESSES;

        @pmi0("events")
        public static final Type EVENTS;

        @pmi0("feedback")
        public static final Type FEEDBACK;

        static {
            Type type = new Type("FEEDBACK", 0);
            FEEDBACK = type;
            Type type2 = new Type("ADDRESSES", 1);
            ADDRESSES = type2;
            Type type3 = new Type("EVENTS", 2);
            EVENTS = type3;
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

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem) && this.type == ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryCardTabClickItem(type=" + this.type + ')';
    }
}
