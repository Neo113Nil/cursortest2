package com.vk.method.selector.impl;

import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MethodSelectorStat.kt */
/* loaded from: classes3.dex */
public final class TypeAvailability {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TypeAvailability[] $VALUES;
    public static final TypeAvailability DISABLED;
    public static final TypeAvailability ENABLED;
    public static final TypeAvailability GONE;
    private final int value;

    static {
        TypeAvailability typeAvailability = new TypeAvailability("GONE", 0, 0);
        GONE = typeAvailability;
        TypeAvailability typeAvailability2 = new TypeAvailability("ENABLED", 1, 1);
        ENABLED = typeAvailability2;
        TypeAvailability typeAvailability3 = new TypeAvailability("DISABLED", 2, 2);
        DISABLED = typeAvailability3;
        TypeAvailability[] typeAvailabilityArr = {typeAvailability, typeAvailability2, typeAvailability3};
        $VALUES = typeAvailabilityArr;
        $ENTRIES = new asp(typeAvailabilityArr);
    }

    public TypeAvailability(String str, int i, int i2) {
        this.value = i2;
    }

    public static TypeAvailability valueOf(String str) {
        return (TypeAvailability) Enum.valueOf(TypeAvailability.class, str);
    }

    public static TypeAvailability[] values() {
        return (TypeAvailability[]) $VALUES.clone();
    }

    public final SchemeStatSak$RegistrationFieldItem a(SchemeStatSak$RegistrationFieldItem.Name name) {
        return new SchemeStatSak$RegistrationFieldItem(name, "", "", String.valueOf(this.value));
    }
}
