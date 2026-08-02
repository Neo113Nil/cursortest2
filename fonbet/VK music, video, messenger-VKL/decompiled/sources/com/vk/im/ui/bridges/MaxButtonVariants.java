package com.vk.im.ui.bridges;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MaxButtonVariants.kt */
/* loaded from: classes2.dex */
public final class MaxButtonVariants {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MaxButtonVariants[] $VALUES;
    public static final MaxButtonVariants ForAnyone;
    public static final MaxButtonVariants ForInstalledOnly;
    public static final MaxButtonVariants NoOne;

    static {
        MaxButtonVariants maxButtonVariants = new MaxButtonVariants("ForInstalledOnly", 0);
        ForInstalledOnly = maxButtonVariants;
        MaxButtonVariants maxButtonVariants2 = new MaxButtonVariants("ForAnyone", 1);
        ForAnyone = maxButtonVariants2;
        MaxButtonVariants maxButtonVariants3 = new MaxButtonVariants("NoOne", 2);
        NoOne = maxButtonVariants3;
        MaxButtonVariants[] maxButtonVariantsArr = {maxButtonVariants, maxButtonVariants2, maxButtonVariants3};
        $VALUES = maxButtonVariantsArr;
        $ENTRIES = new asp(maxButtonVariantsArr);
    }

    public MaxButtonVariants() {
        throw null;
    }

    public static MaxButtonVariants valueOf(String str) {
        return (MaxButtonVariants) Enum.valueOf(MaxButtonVariants.class, str);
    }

    public static MaxButtonVariants[] values() {
        return (MaxButtonVariants[]) $VALUES.clone();
    }
}
