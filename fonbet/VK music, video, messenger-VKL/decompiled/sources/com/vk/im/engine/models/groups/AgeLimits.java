package com.vk.im.engine.models.groups;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Group.kt */
/* loaded from: classes2.dex */
public final class AgeLimits {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AgeLimits[] $VALUES;
    public static final a Companion;
    public static final AgeLimits NO_AGE_RESTRICTION;
    public static final AgeLimits OVER_16;
    public static final AgeLimits OVER_18;
    private final int value;

    /* compiled from: Group.kt */
    public static final class a {
        public static AgeLimits a(Integer num) {
            return num.intValue() == 2 ? AgeLimits.OVER_16 : num.intValue() == 3 ? AgeLimits.OVER_18 : AgeLimits.NO_AGE_RESTRICTION;
        }
    }

    static {
        AgeLimits ageLimits = new AgeLimits("NO_AGE_RESTRICTION", 0, 1);
        NO_AGE_RESTRICTION = ageLimits;
        AgeLimits ageLimits2 = new AgeLimits("OVER_16", 1, 2);
        OVER_16 = ageLimits2;
        AgeLimits ageLimits3 = new AgeLimits("OVER_18", 2, 3);
        OVER_18 = ageLimits3;
        AgeLimits[] ageLimitsArr = {ageLimits, ageLimits2, ageLimits3};
        $VALUES = ageLimitsArr;
        $ENTRIES = new asp(ageLimitsArr);
        Companion = new a();
    }

    public AgeLimits(String str, int i, int i2) {
        this.value = i2;
    }

    public static AgeLimits valueOf(String str) {
        return (AgeLimits) Enum.valueOf(AgeLimits.class, str);
    }

    public static AgeLimits[] values() {
        return (AgeLimits[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
