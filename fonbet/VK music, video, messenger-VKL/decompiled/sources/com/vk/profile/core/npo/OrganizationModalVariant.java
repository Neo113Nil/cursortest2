package com.vk.profile.core.npo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrganizationModalVariant.kt */
/* loaded from: classes5.dex */
public final class OrganizationModalVariant {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrganizationModalVariant[] $VALUES;
    public static final OrganizationModalVariant NON_PROFIT;
    public static final OrganizationModalVariant VERIFIED_NON_PROFIT;

    static {
        OrganizationModalVariant organizationModalVariant = new OrganizationModalVariant("NON_PROFIT", 0);
        NON_PROFIT = organizationModalVariant;
        OrganizationModalVariant organizationModalVariant2 = new OrganizationModalVariant("VERIFIED_NON_PROFIT", 1);
        VERIFIED_NON_PROFIT = organizationModalVariant2;
        OrganizationModalVariant[] organizationModalVariantArr = {organizationModalVariant, organizationModalVariant2};
        $VALUES = organizationModalVariantArr;
        $ENTRIES = new asp(organizationModalVariantArr);
    }

    public OrganizationModalVariant() {
        throw null;
    }

    public static OrganizationModalVariant valueOf(String str) {
        return (OrganizationModalVariant) Enum.valueOf(OrganizationModalVariant.class, str);
    }

    public static OrganizationModalVariant[] values() {
        return (OrganizationModalVariant[]) $VALUES.clone();
    }
}
