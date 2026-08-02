package com.vk.ecomm.storefrontservices.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorefrontServicesRefSource.kt */
/* loaded from: classes18.dex */
public final class StorefrontServicesRefSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StorefrontServicesRefSource[] $VALUES;
    public static final StorefrontServicesRefSource COMMUNITY_PRIORITY_BLOCK_SERVICES;
    public static final StorefrontServicesRefSource COMMUNITY_TAB_SERVICES;
    public static final StorefrontServicesRefSource COMMUNITY_TRUST_MARKS;

    static {
        StorefrontServicesRefSource storefrontServicesRefSource = new StorefrontServicesRefSource("COMMUNITY_TAB_SERVICES", 0);
        COMMUNITY_TAB_SERVICES = storefrontServicesRefSource;
        StorefrontServicesRefSource storefrontServicesRefSource2 = new StorefrontServicesRefSource("COMMUNITY_PRIORITY_BLOCK_SERVICES", 1);
        COMMUNITY_PRIORITY_BLOCK_SERVICES = storefrontServicesRefSource2;
        StorefrontServicesRefSource storefrontServicesRefSource3 = new StorefrontServicesRefSource("COMMUNITY_TRUST_MARKS", 2);
        COMMUNITY_TRUST_MARKS = storefrontServicesRefSource3;
        StorefrontServicesRefSource[] storefrontServicesRefSourceArr = {storefrontServicesRefSource, storefrontServicesRefSource2, storefrontServicesRefSource3};
        $VALUES = storefrontServicesRefSourceArr;
        $ENTRIES = new asp(storefrontServicesRefSourceArr);
    }

    public StorefrontServicesRefSource() {
        throw null;
    }

    public static StorefrontServicesRefSource valueOf(String str) {
        return (StorefrontServicesRefSource) Enum.valueOf(StorefrontServicesRefSource.class, str);
    }

    public static StorefrontServicesRefSource[] values() {
        return (StorefrontServicesRefSource[]) $VALUES.clone();
    }
}
