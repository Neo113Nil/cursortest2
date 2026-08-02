package com.vk.notifications.list.impl.presentation.base.mvi.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationCategoryTab.kt */
/* loaded from: classes4.dex */
public final class NotificationCategoryTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationCategoryTab[] $VALUES;
    public static final NotificationCategoryTab ALL;
    public static final NotificationCategoryTab COMMENTS;
    public static final a Companion;
    private final String id;

    /* compiled from: NotificationCategoryTab.kt */
    public static final class a {
    }

    static {
        NotificationCategoryTab notificationCategoryTab = new NotificationCategoryTab("ALL", 0, "all");
        ALL = notificationCategoryTab;
        NotificationCategoryTab notificationCategoryTab2 = new NotificationCategoryTab("COMMENTS", 1, "comments");
        COMMENTS = notificationCategoryTab2;
        NotificationCategoryTab[] notificationCategoryTabArr = {notificationCategoryTab, notificationCategoryTab2};
        $VALUES = notificationCategoryTabArr;
        $ENTRIES = new asp(notificationCategoryTabArr);
        Companion = new a();
    }

    public NotificationCategoryTab(String str, int i, String str2) {
        this.id = str2;
    }

    public static NotificationCategoryTab valueOf(String str) {
        return (NotificationCategoryTab) Enum.valueOf(NotificationCategoryTab.class, str);
    }

    public static NotificationCategoryTab[] values() {
        return (NotificationCategoryTab[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
