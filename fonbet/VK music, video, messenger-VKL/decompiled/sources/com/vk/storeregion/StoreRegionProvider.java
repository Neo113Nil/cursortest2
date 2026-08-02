package com.vk.storeregion;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: StoreRegionProvider.kt */
/* loaded from: classes11.dex */
public abstract class StoreRegionProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreRegionProvider.kt */
    public static final class Region {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;
        public static final Region BY;
        public static final Region KZ;
        public static final Region RU;
        public static final Region STUB;
        public static final Region UNKNOWN;

        static {
            Region region = new Region(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = region;
            Region region2 = new Region("STUB", 1);
            STUB = region2;
            Region region3 = new Region("RU", 2);
            RU = region3;
            Region region4 = new Region("BY", 3);
            BY = region4;
            Region region5 = new Region("KZ", 4);
            KZ = region5;
            Region[] regionArr = {region, region2, region3, region4, region5};
            $VALUES = regionArr;
            $ENTRIES = new asp(regionArr);
        }

        public Region() {
            throw null;
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    public abstract Region a();
}
