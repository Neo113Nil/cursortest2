package com.vk.im.engine.models.groups;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdminLevel.kt */
/* loaded from: classes2.dex */
public final class AdminLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdminLevel[] $VALUES;
    public static final AdminLevel ADMIN;
    public static final a Companion;
    public static final AdminLevel EDITOR;
    public static final AdminLevel MODERATOR;
    public static final AdminLevel NONE;
    private final int id;

    /* compiled from: AdminLevel.kt */
    public static final class a {
        public static AdminLevel a(Integer num) {
            return num.intValue() == 1 ? AdminLevel.MODERATOR : num.intValue() == 2 ? AdminLevel.EDITOR : num.intValue() == 3 ? AdminLevel.ADMIN : AdminLevel.NONE;
        }
    }

    static {
        AdminLevel adminLevel = new AdminLevel("NONE", 0, 0);
        NONE = adminLevel;
        AdminLevel adminLevel2 = new AdminLevel("MODERATOR", 1, 1);
        MODERATOR = adminLevel2;
        AdminLevel adminLevel3 = new AdminLevel("EDITOR", 2, 2);
        EDITOR = adminLevel3;
        AdminLevel adminLevel4 = new AdminLevel("ADMIN", 3, 3);
        ADMIN = adminLevel4;
        AdminLevel[] adminLevelArr = {adminLevel, adminLevel2, adminLevel3, adminLevel4};
        $VALUES = adminLevelArr;
        $ENTRIES = new asp(adminLevelArr);
        Companion = new a();
    }

    public AdminLevel(String str, int i, int i2) {
        this.id = i2;
    }

    public static AdminLevel valueOf(String str) {
        return (AdminLevel) Enum.valueOf(AdminLevel.class, str);
    }

    public static AdminLevel[] values() {
        return (AdminLevel[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
