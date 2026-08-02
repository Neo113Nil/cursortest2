package com.vk.catalog2.common.dto.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogLaunchOrigin.kt */
/* loaded from: classes16.dex */
public final class CatalogLaunchOrigin {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogLaunchOrigin[] $VALUES;
    public static final a Companion;
    public static final CatalogLaunchOrigin KIDS_SECTION;
    public static final CatalogLaunchOrigin UNKNOWN;
    private final String value;

    /* compiled from: CatalogLaunchOrigin.kt */
    public static final class a {
    }

    static {
        CatalogLaunchOrigin catalogLaunchOrigin = new CatalogLaunchOrigin("KIDS_SECTION", 0, "kids_section");
        KIDS_SECTION = catalogLaunchOrigin;
        CatalogLaunchOrigin catalogLaunchOrigin2 = new CatalogLaunchOrigin(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");
        UNKNOWN = catalogLaunchOrigin2;
        CatalogLaunchOrigin[] catalogLaunchOriginArr = {catalogLaunchOrigin, catalogLaunchOrigin2};
        $VALUES = catalogLaunchOriginArr;
        $ENTRIES = new asp(catalogLaunchOriginArr);
        Companion = new a();
    }

    public CatalogLaunchOrigin(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogLaunchOrigin valueOf(String str) {
        return (CatalogLaunchOrigin) Enum.valueOf(CatalogLaunchOrigin.class, str);
    }

    public static CatalogLaunchOrigin[] values() {
        return (CatalogLaunchOrigin[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
