package com.vk.superapp.dating.sdk.js.bridge.impl.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DatingAppIdsUtil.kt */
/* loaded from: classes6.dex */
public final class DatingMiniAppIds {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DatingMiniAppIds[] $VALUES;
    public static final DatingMiniAppIds APP_ID_DATING;
    public static final DatingMiniAppIds APP_ID_OK_DATING_DEV;
    public static final DatingMiniAppIds APP_ID_OK_DATING_NATIVE;
    public static final DatingMiniAppIds APP_ID_OK_DATING_PROD;
    public static final DatingMiniAppIds APP_ID_SPINOFF_DATING_DEV;
    public static final DatingMiniAppIds APP_ID_SPINOFF_DATING_NATIVE;
    public static final DatingMiniAppIds APP_ID_SPINOFF_DATING_PROD;
    public static final DatingMiniAppIds APP_ID_VK_DATING;
    public static final DatingMiniAppIds APP_ID_VK_DATING_DEV;
    public static final DatingMiniAppIds APP_ID_VK_DATING_DEV_FRONTEND;
    public static final DatingMiniAppIds APP_ID_VK_DATING_NATIVE;
    private final long value;

    static {
        DatingMiniAppIds datingMiniAppIds = new DatingMiniAppIds("APP_ID_VK_DATING", 0, 6682509L);
        APP_ID_VK_DATING = datingMiniAppIds;
        DatingMiniAppIds datingMiniAppIds2 = new DatingMiniAppIds("APP_ID_VK_DATING_DEV", 1, 7787819L);
        APP_ID_VK_DATING_DEV = datingMiniAppIds2;
        DatingMiniAppIds datingMiniAppIds3 = new DatingMiniAppIds("APP_ID_VK_DATING_NATIVE", 2, 8061227L);
        APP_ID_VK_DATING_NATIVE = datingMiniAppIds3;
        DatingMiniAppIds datingMiniAppIds4 = new DatingMiniAppIds("APP_ID_DATING", 3, 7058363L);
        APP_ID_DATING = datingMiniAppIds4;
        DatingMiniAppIds datingMiniAppIds5 = new DatingMiniAppIds("APP_ID_VK_DATING_DEV_FRONTEND", 4, 7787814L);
        APP_ID_VK_DATING_DEV_FRONTEND = datingMiniAppIds5;
        DatingMiniAppIds datingMiniAppIds6 = new DatingMiniAppIds("APP_ID_OK_DATING_PROD", 5, 51918563L);
        APP_ID_OK_DATING_PROD = datingMiniAppIds6;
        DatingMiniAppIds datingMiniAppIds7 = new DatingMiniAppIds("APP_ID_OK_DATING_DEV", 6, 51903111L);
        APP_ID_OK_DATING_DEV = datingMiniAppIds7;
        DatingMiniAppIds datingMiniAppIds8 = new DatingMiniAppIds("APP_ID_OK_DATING_NATIVE", 7, 52098153L);
        APP_ID_OK_DATING_NATIVE = datingMiniAppIds8;
        DatingMiniAppIds datingMiniAppIds9 = new DatingMiniAppIds("APP_ID_SPINOFF_DATING_PROD", 8, 53770070L);
        APP_ID_SPINOFF_DATING_PROD = datingMiniAppIds9;
        DatingMiniAppIds datingMiniAppIds10 = new DatingMiniAppIds("APP_ID_SPINOFF_DATING_NATIVE", 9, 54218608L);
        APP_ID_SPINOFF_DATING_NATIVE = datingMiniAppIds10;
        DatingMiniAppIds datingMiniAppIds11 = new DatingMiniAppIds("APP_ID_SPINOFF_DATING_DEV", 10, 53770071L);
        APP_ID_SPINOFF_DATING_DEV = datingMiniAppIds11;
        DatingMiniAppIds[] datingMiniAppIdsArr = {datingMiniAppIds, datingMiniAppIds2, datingMiniAppIds3, datingMiniAppIds4, datingMiniAppIds5, datingMiniAppIds6, datingMiniAppIds7, datingMiniAppIds8, datingMiniAppIds9, datingMiniAppIds10, datingMiniAppIds11};
        $VALUES = datingMiniAppIdsArr;
        $ENTRIES = new asp(datingMiniAppIdsArr);
    }

    public DatingMiniAppIds(String str, int i, long j) {
        this.value = j;
    }

    public static zrp<DatingMiniAppIds> h() {
        return $ENTRIES;
    }

    public static DatingMiniAppIds valueOf(String str) {
        return (DatingMiniAppIds) Enum.valueOf(DatingMiniAppIds.class, str);
    }

    public static DatingMiniAppIds[] values() {
        return (DatingMiniAppIds[]) $VALUES.clone();
    }

    public final long i() {
        return this.value;
    }
}
