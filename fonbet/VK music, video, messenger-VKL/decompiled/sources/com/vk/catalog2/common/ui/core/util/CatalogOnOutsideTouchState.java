package com.vk.catalog2.common.ui.core.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogOnOutsideTouchEventListener.kt */
/* loaded from: classes16.dex */
public final class CatalogOnOutsideTouchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogOnOutsideTouchState[] $VALUES;
    public static final CatalogOnOutsideTouchState IDLE;
    public static final CatalogOnOutsideTouchState TOUCHING;

    static {
        CatalogOnOutsideTouchState catalogOnOutsideTouchState = new CatalogOnOutsideTouchState("IDLE", 0);
        IDLE = catalogOnOutsideTouchState;
        CatalogOnOutsideTouchState catalogOnOutsideTouchState2 = new CatalogOnOutsideTouchState("TOUCHING", 1);
        TOUCHING = catalogOnOutsideTouchState2;
        CatalogOnOutsideTouchState[] catalogOnOutsideTouchStateArr = {catalogOnOutsideTouchState, catalogOnOutsideTouchState2};
        $VALUES = catalogOnOutsideTouchStateArr;
        $ENTRIES = new asp(catalogOnOutsideTouchStateArr);
    }

    public CatalogOnOutsideTouchState() {
        throw null;
    }

    public static CatalogOnOutsideTouchState valueOf(String str) {
        return (CatalogOnOutsideTouchState) Enum.valueOf(CatalogOnOutsideTouchState.class, str);
    }

    public static CatalogOnOutsideTouchState[] values() {
        return (CatalogOnOutsideTouchState[]) $VALUES.clone();
    }
}
