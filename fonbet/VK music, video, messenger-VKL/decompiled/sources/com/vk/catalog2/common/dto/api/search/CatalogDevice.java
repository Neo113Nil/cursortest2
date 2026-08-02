package com.vk.catalog2.common.dto.api.search;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogDevice.kt */
/* loaded from: classes16.dex */
public final class CatalogDevice {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogDevice[] $VALUES;
    public static final CatalogDevice MOBILE;
    public static final CatalogDevice TABLET;
    private final String serverKey;

    static {
        CatalogDevice catalogDevice = new CatalogDevice("MOBILE", 0, "mobile");
        MOBILE = catalogDevice;
        CatalogDevice catalogDevice2 = new CatalogDevice("TABLET", 1, "tablet");
        TABLET = catalogDevice2;
        CatalogDevice[] catalogDeviceArr = {catalogDevice, catalogDevice2};
        $VALUES = catalogDeviceArr;
        $ENTRIES = new asp(catalogDeviceArr);
    }

    public CatalogDevice(String str, int i, String str2) {
        this.serverKey = str2;
    }

    public static CatalogDevice valueOf(String str) {
        return (CatalogDevice) Enum.valueOf(CatalogDevice.class, str);
    }

    public static CatalogDevice[] values() {
        return (CatalogDevice[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverKey;
    }
}
