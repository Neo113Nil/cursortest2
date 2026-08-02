package com.vk.superapp.local.storage.js.bridge.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AllowedMiniAppIds.kt */
/* loaded from: classes6.dex */
public final class AllowedMiniAppIds {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AllowedMiniAppIds[] $VALUES;
    public static final AllowedMiniAppIds APP_ID_ACTIVITY_BANK;
    public static final AllowedMiniAppIds APP_ID_INTERNAL_SANDBOX;
    public static final AllowedMiniAppIds APP_ID_PETS;
    public static final AllowedMiniAppIds APP_ID_SANDBOX;
    public static final AllowedMiniAppIds APP_ID_STEPS;
    public static final AllowedMiniAppIds APP_ID_WORKOUT;
    private final long value;

    static {
        AllowedMiniAppIds allowedMiniAppIds = new AllowedMiniAppIds("APP_ID_WORKOUT", 0, 8228680L);
        APP_ID_WORKOUT = allowedMiniAppIds;
        AllowedMiniAppIds allowedMiniAppIds2 = new AllowedMiniAppIds("APP_ID_STEPS", 1, 7539087L);
        APP_ID_STEPS = allowedMiniAppIds2;
        AllowedMiniAppIds allowedMiniAppIds3 = new AllowedMiniAppIds("APP_ID_ACTIVITY_BANK", 2, 51469688L);
        APP_ID_ACTIVITY_BANK = allowedMiniAppIds3;
        AllowedMiniAppIds allowedMiniAppIds4 = new AllowedMiniAppIds("APP_ID_SANDBOX", 3, 6703670L);
        APP_ID_SANDBOX = allowedMiniAppIds4;
        AllowedMiniAppIds allowedMiniAppIds5 = new AllowedMiniAppIds("APP_ID_INTERNAL_SANDBOX", 4, 6722068L);
        APP_ID_INTERNAL_SANDBOX = allowedMiniAppIds5;
        AllowedMiniAppIds allowedMiniAppIds6 = new AllowedMiniAppIds("APP_ID_PETS", 5, 7786561L);
        APP_ID_PETS = allowedMiniAppIds6;
        AllowedMiniAppIds[] allowedMiniAppIdsArr = {allowedMiniAppIds, allowedMiniAppIds2, allowedMiniAppIds3, allowedMiniAppIds4, allowedMiniAppIds5, allowedMiniAppIds6};
        $VALUES = allowedMiniAppIdsArr;
        $ENTRIES = new asp(allowedMiniAppIdsArr);
    }

    public AllowedMiniAppIds(String str, int i, long j) {
        this.value = j;
    }

    public static AllowedMiniAppIds valueOf(String str) {
        return (AllowedMiniAppIds) Enum.valueOf(AllowedMiniAppIds.class, str);
    }

    public static AllowedMiniAppIds[] values() {
        return (AllowedMiniAppIds[]) $VALUES.clone();
    }

    public final long h() {
        return this.value;
    }
}
