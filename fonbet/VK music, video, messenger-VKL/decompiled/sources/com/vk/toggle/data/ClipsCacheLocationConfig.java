package com.vk.toggle.data;

import defpackage.q0;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsCacheLocationConfig.kt */
/* loaded from: classes11.dex */
public final class ClipsCacheLocationConfig {
    public static final a c = new a();
    public static final ClipsCacheLocationConfig d = new ClipsCacheLocationConfig(Location.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE, false);
    public final Location a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsCacheLocationConfig.kt */
    public static final class Location {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Location[] $VALUES;
        public static final Location INTERNAL_CACHE;
        public static final Location INTERNAL_STORAGE;
        public static final Location SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE;
        public static final Location SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE;

        static {
            Location location = new Location("INTERNAL_STORAGE", 0);
            INTERNAL_STORAGE = location;
            Location location2 = new Location("SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE", 1);
            SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE = location2;
            Location location3 = new Location("INTERNAL_CACHE", 2);
            INTERNAL_CACHE = location3;
            Location location4 = new Location("SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE", 3);
            SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE = location4;
            Location[] locationArr = {location, location2, location3, location4};
            $VALUES = locationArr;
            $ENTRIES = new asp(locationArr);
        }

        public Location() {
            throw null;
        }

        public static Location valueOf(String str) {
            return (Location) Enum.valueOf(Location.class, str);
        }

        public static Location[] values() {
            return (Location[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsCacheLocationConfig.kt */
    public static final class a {
    }

    public ClipsCacheLocationConfig(Location location, boolean z) {
        this.a = location;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsCacheLocationConfig)) {
            return false;
        }
        ClipsCacheLocationConfig clipsCacheLocationConfig = (ClipsCacheLocationConfig) obj;
        return this.a == clipsCacheLocationConfig.a && this.b == clipsCacheLocationConfig.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsCacheLocationConfig(location=");
        sb.append(this.a);
        sb.append(", disableDataSinkFactory=");
        return q0.a(sb, this.b, ')');
    }
}
