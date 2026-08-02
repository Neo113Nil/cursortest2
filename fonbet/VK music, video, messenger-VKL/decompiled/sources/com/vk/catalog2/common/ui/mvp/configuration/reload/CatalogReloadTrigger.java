package com.vk.catalog2.common.ui.mvp.configuration.reload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogReloadTrigger.kt */
/* loaded from: classes16.dex */
public final class CatalogReloadTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogReloadTrigger[] $VALUES;
    public static final CatalogReloadTrigger DONUT_SUBSCRIPTION;
    public static final CatalogReloadTrigger LOGIN;

    static {
        CatalogReloadTrigger catalogReloadTrigger = new CatalogReloadTrigger("LOGIN", 0);
        LOGIN = catalogReloadTrigger;
        CatalogReloadTrigger catalogReloadTrigger2 = new CatalogReloadTrigger("DONUT_SUBSCRIPTION", 1);
        DONUT_SUBSCRIPTION = catalogReloadTrigger2;
        CatalogReloadTrigger[] catalogReloadTriggerArr = {catalogReloadTrigger, catalogReloadTrigger2};
        $VALUES = catalogReloadTriggerArr;
        $ENTRIES = new asp(catalogReloadTriggerArr);
    }

    public CatalogReloadTrigger() {
        throw null;
    }

    public static CatalogReloadTrigger valueOf(String str) {
        return (CatalogReloadTrigger) Enum.valueOf(CatalogReloadTrigger.class, str);
    }

    public static CatalogReloadTrigger[] values() {
        return (CatalogReloadTrigger[]) $VALUES.clone();
    }
}
