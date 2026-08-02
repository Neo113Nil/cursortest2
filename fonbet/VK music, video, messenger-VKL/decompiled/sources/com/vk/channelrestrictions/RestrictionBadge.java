package com.vk.channelrestrictions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RestrictionBadge.kt */
/* loaded from: classes16.dex */
public final class RestrictionBadge {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RestrictionBadge[] $VALUES;
    public static final a Companion;
    public static final RestrictionBadge OVER_16;
    public static final RestrictionBadge OVER_18;
    private final int value;

    /* compiled from: RestrictionBadge.kt */
    public static final class a {
    }

    static {
        RestrictionBadge restrictionBadge = new RestrictionBadge("OVER_16", 0, 0);
        OVER_16 = restrictionBadge;
        RestrictionBadge restrictionBadge2 = new RestrictionBadge("OVER_18", 1, 1);
        OVER_18 = restrictionBadge2;
        RestrictionBadge[] restrictionBadgeArr = {restrictionBadge, restrictionBadge2};
        $VALUES = restrictionBadgeArr;
        $ENTRIES = new asp(restrictionBadgeArr);
        Companion = new a();
    }

    public RestrictionBadge(String str, int i, int i2) {
        this.value = i2;
    }

    public static RestrictionBadge valueOf(String str) {
        return (RestrictionBadge) Enum.valueOf(RestrictionBadge.class, str);
    }

    public static RestrictionBadge[] values() {
        return (RestrictionBadge[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
