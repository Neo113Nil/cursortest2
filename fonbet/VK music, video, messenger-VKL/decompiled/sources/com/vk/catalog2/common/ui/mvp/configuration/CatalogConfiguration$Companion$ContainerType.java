package com.vk.catalog2.common.ui.mvp.configuration;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class CatalogConfiguration$Companion$ContainerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogConfiguration$Companion$ContainerType[] $VALUES;
    public static final CatalogConfiguration$Companion$ContainerType GRID;
    public static final CatalogConfiguration$Companion$ContainerType HORIZONTAL;
    public static final CatalogConfiguration$Companion$ContainerType VERTICAL;

    static {
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType = new CatalogConfiguration$Companion$ContainerType("VERTICAL", 0);
        VERTICAL = catalogConfiguration$Companion$ContainerType;
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType2 = new CatalogConfiguration$Companion$ContainerType("HORIZONTAL", 1);
        HORIZONTAL = catalogConfiguration$Companion$ContainerType2;
        CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType3 = new CatalogConfiguration$Companion$ContainerType(SignalingProtocol.KEY_GRID, 2);
        GRID = catalogConfiguration$Companion$ContainerType3;
        CatalogConfiguration$Companion$ContainerType[] catalogConfiguration$Companion$ContainerTypeArr = {catalogConfiguration$Companion$ContainerType, catalogConfiguration$Companion$ContainerType2, catalogConfiguration$Companion$ContainerType3};
        $VALUES = catalogConfiguration$Companion$ContainerTypeArr;
        $ENTRIES = new asp(catalogConfiguration$Companion$ContainerTypeArr);
    }

    public CatalogConfiguration$Companion$ContainerType() {
        throw null;
    }

    public static CatalogConfiguration$Companion$ContainerType valueOf(String str) {
        return (CatalogConfiguration$Companion$ContainerType) Enum.valueOf(CatalogConfiguration$Companion$ContainerType.class, str);
    }

    public static CatalogConfiguration$Companion$ContainerType[] values() {
        return (CatalogConfiguration$Companion$ContainerType[]) $VALUES.clone();
    }
}
