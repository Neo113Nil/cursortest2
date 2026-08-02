package com.vk.im.reporters.api.analytics.click;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImCallTypeAnalyticsItem.kt */
/* loaded from: classes2.dex */
public final class ImCallTypeAnalyticsItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImCallTypeAnalyticsItem[] $VALUES;
    public static final ImCallTypeAnalyticsItem CONTACT;
    public static final ImCallTypeAnalyticsItem GROUP;
    public static final ImCallTypeAnalyticsItem USER;

    static {
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem = new ImCallTypeAnalyticsItem("USER", 0);
        USER = imCallTypeAnalyticsItem;
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem2 = new ImCallTypeAnalyticsItem("GROUP", 1);
        GROUP = imCallTypeAnalyticsItem2;
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem3 = new ImCallTypeAnalyticsItem("CONTACT", 2);
        CONTACT = imCallTypeAnalyticsItem3;
        ImCallTypeAnalyticsItem[] imCallTypeAnalyticsItemArr = {imCallTypeAnalyticsItem, imCallTypeAnalyticsItem2, imCallTypeAnalyticsItem3};
        $VALUES = imCallTypeAnalyticsItemArr;
        $ENTRIES = new asp(imCallTypeAnalyticsItemArr);
    }

    public ImCallTypeAnalyticsItem() {
        throw null;
    }

    public static ImCallTypeAnalyticsItem valueOf(String str) {
        return (ImCallTypeAnalyticsItem) Enum.valueOf(ImCallTypeAnalyticsItem.class, str);
    }

    public static ImCallTypeAnalyticsItem[] values() {
        return (ImCallTypeAnalyticsItem[]) $VALUES.clone();
    }
}
