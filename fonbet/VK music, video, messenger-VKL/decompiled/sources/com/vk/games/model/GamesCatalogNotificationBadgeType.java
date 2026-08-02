package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesCatalogNotificationBadgeType.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogNotificationBadgeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesCatalogNotificationBadgeType[] $VALUES;
    public static final GamesCatalogNotificationBadgeType NOTIFICATION_DISCOUNT;
    public static final GamesCatalogNotificationBadgeType NOTIFICATION_GIFT;
    public static final GamesCatalogNotificationBadgeType NOTIFICATION_UPDATE;
    private final String value;

    static {
        GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType = new GamesCatalogNotificationBadgeType("NOTIFICATION_GIFT", 0, "notification_gift");
        NOTIFICATION_GIFT = gamesCatalogNotificationBadgeType;
        GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType2 = new GamesCatalogNotificationBadgeType("NOTIFICATION_DISCOUNT", 1, "notification_discount");
        NOTIFICATION_DISCOUNT = gamesCatalogNotificationBadgeType2;
        GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType3 = new GamesCatalogNotificationBadgeType("NOTIFICATION_UPDATE", 2, "notification_update");
        NOTIFICATION_UPDATE = gamesCatalogNotificationBadgeType3;
        GamesCatalogNotificationBadgeType[] gamesCatalogNotificationBadgeTypeArr = {gamesCatalogNotificationBadgeType, gamesCatalogNotificationBadgeType2, gamesCatalogNotificationBadgeType3};
        $VALUES = gamesCatalogNotificationBadgeTypeArr;
        $ENTRIES = new asp(gamesCatalogNotificationBadgeTypeArr);
    }

    public GamesCatalogNotificationBadgeType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<GamesCatalogNotificationBadgeType> h() {
        return $ENTRIES;
    }

    public static GamesCatalogNotificationBadgeType valueOf(String str) {
        return (GamesCatalogNotificationBadgeType) Enum.valueOf(GamesCatalogNotificationBadgeType.class, str);
    }

    public static GamesCatalogNotificationBadgeType[] values() {
        return (GamesCatalogNotificationBadgeType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
