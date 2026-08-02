package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$MarkerType {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("district")
        public static final Type DISTRICT;

        @pmi0("dot")
        public static final Type DOT;

        @pmi0("full")
        public static final Type FULL;

        @pmi0("icon")
        public static final Type ICON;

        static {
            Type type = new Type("DOT", 0);
            DOT = type;
            Type type2 = new Type(NativeAdContent.ViewTag.AD_ICON, 1);
            ICON = type2;
            Type type3 = new Type("FULL", 2);
            FULL = type3;
            Type type4 = new Type("DISTRICT", 3);
            DISTRICT = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    public MobileOfficialAppsGeoDiscoveryStat$MarkerType(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$MarkerType) && this.type == ((MobileOfficialAppsGeoDiscoveryStat$MarkerType) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "MarkerType(type=" + this.type + ')';
    }
}
