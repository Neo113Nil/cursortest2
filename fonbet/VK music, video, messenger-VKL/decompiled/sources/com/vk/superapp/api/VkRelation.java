package com.vk.superapp.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRelation.kt */
/* loaded from: classes6.dex */
public final class VkRelation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRelation[] $VALUES;
    public static final VkRelation ACTIVELY_LOOKING;
    public static final VkRelation CIVIL_MARRIAGE;
    public static final VkRelation COMPLICATED;
    public static final a Companion;
    public static final VkRelation ENGAGED;
    public static final VkRelation IN_LOVE;
    public static final VkRelation MARRIED;
    public static final VkRelation MEETS;
    public static final VkRelation NONE;
    public static final VkRelation NOT_MARRIED;
    private final int id;
    private final String value;

    /* compiled from: VkRelation.kt */
    public static final class a {
    }

    static {
        VkRelation vkRelation = new VkRelation("NONE", 0, 0, "");
        NONE = vkRelation;
        VkRelation vkRelation2 = new VkRelation("NOT_MARRIED", 1, 1, "not_married");
        NOT_MARRIED = vkRelation2;
        VkRelation vkRelation3 = new VkRelation("MEETS", 2, 2, "meets");
        MEETS = vkRelation3;
        VkRelation vkRelation4 = new VkRelation("ENGAGED", 3, 3, "engaged");
        ENGAGED = vkRelation4;
        VkRelation vkRelation5 = new VkRelation("MARRIED", 4, 4, "married");
        MARRIED = vkRelation5;
        VkRelation vkRelation6 = new VkRelation("COMPLICATED", 5, 5, "complicated");
        COMPLICATED = vkRelation6;
        VkRelation vkRelation7 = new VkRelation("ACTIVELY_LOOKING", 6, 6, "actively_looking");
        ACTIVELY_LOOKING = vkRelation7;
        VkRelation vkRelation8 = new VkRelation("IN_LOVE", 7, 7, "in_love");
        IN_LOVE = vkRelation8;
        VkRelation vkRelation9 = new VkRelation("CIVIL_MARRIAGE", 8, 8, "civil_marriage");
        CIVIL_MARRIAGE = vkRelation9;
        VkRelation[] vkRelationArr = {vkRelation, vkRelation2, vkRelation3, vkRelation4, vkRelation5, vkRelation6, vkRelation7, vkRelation8, vkRelation9};
        $VALUES = vkRelationArr;
        $ENTRIES = new asp(vkRelationArr);
        Companion = new a();
    }

    public VkRelation(String str, int i, int i2, String str2) {
        this.id = i2;
        this.value = str2;
    }

    public static VkRelation valueOf(String str) {
        return (VkRelation) Enum.valueOf(VkRelation.class, str);
    }

    public static VkRelation[] values() {
        return (VkRelation[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
