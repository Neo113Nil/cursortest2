package com.vk.core.bundle;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Fields.kt */
/* loaded from: classes.dex */
public final class Descriptor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Descriptor[] $VALUES;
    public static final Descriptor Boolean;
    public static final Descriptor Double;
    public static final Descriptor Float;
    public static final Descriptor Int;
    public static final Descriptor IntArray;
    public static final Descriptor JSONSerialize;
    public static final Descriptor Long;
    public static final Descriptor String;

    static {
        Descriptor descriptor = new Descriptor("Boolean", 0);
        Boolean = descriptor;
        Descriptor descriptor2 = new Descriptor("Int", 1);
        Int = descriptor2;
        Descriptor descriptor3 = new Descriptor("Long", 2);
        Long = descriptor3;
        Descriptor descriptor4 = new Descriptor("Float", 3);
        Float = descriptor4;
        Descriptor descriptor5 = new Descriptor("Double", 4);
        Double = descriptor5;
        Descriptor descriptor6 = new Descriptor("String", 5);
        String = descriptor6;
        Descriptor descriptor7 = new Descriptor("JSONSerialize", 6);
        JSONSerialize = descriptor7;
        Descriptor descriptor8 = new Descriptor("IntArray", 7);
        IntArray = descriptor8;
        Descriptor[] descriptorArr = {descriptor, descriptor2, descriptor3, descriptor4, descriptor5, descriptor6, descriptor7, descriptor8};
        $VALUES = descriptorArr;
        $ENTRIES = new asp(descriptorArr);
    }

    public Descriptor() {
        throw null;
    }

    public static Descriptor valueOf(String str) {
        return (Descriptor) Enum.valueOf(Descriptor.class, str);
    }

    public static Descriptor[] values() {
        return (Descriptor[]) $VALUES.clone();
    }
}
