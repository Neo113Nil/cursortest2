package com.vk.superapp.api.dto.geo.directions;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Units.kt */
/* loaded from: classes6.dex */
public final class Units {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Units[] $VALUES;

    @pmi0("kilometers")
    public static final Units KILOMETERS;

    @pmi0("miles")
    public static final Units MILES;

    static {
        Units units = new Units("KILOMETERS", 0);
        KILOMETERS = units;
        Units units2 = new Units("MILES", 1);
        MILES = units2;
        Units[] unitsArr = {units, units2};
        $VALUES = unitsArr;
        $ENTRIES = new asp(unitsArr);
    }

    private Units(String str, int i) {
    }

    public static Units valueOf(String str) {
        return (Units) Enum.valueOf(Units.class, str);
    }

    public static Units[] values() {
        return (Units[]) $VALUES.clone();
    }
}
