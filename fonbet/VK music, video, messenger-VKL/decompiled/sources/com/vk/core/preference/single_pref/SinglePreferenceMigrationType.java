package com.vk.core.preference.single_pref;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SinglePreferenceMigrationType.kt */
/* loaded from: classes.dex */
public final class SinglePreferenceMigrationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SinglePreferenceMigrationType[] $VALUES;
    public static final SinglePreferenceMigrationType FROM_FULL_SINGLE;
    public static final SinglePreferenceMigrationType FROM_FULL_SINGLE_WITHOUT_ROLLBACK;
    public static final SinglePreferenceMigrationType FROM_SINGLE;
    public static final SinglePreferenceMigrationType FROM_SINGLE_WITHOUT_ROLLBACK;
    public static final SinglePreferenceMigrationType TO_FULL_SINGLE;
    public static final SinglePreferenceMigrationType TO_FULL_SINGLE_WITHOUT_CREATE;
    public static final SinglePreferenceMigrationType TO_SINGLE;
    public static final SinglePreferenceMigrationType TO_SINGLE_WITHOUT_CREATE;
    public static final SinglePreferenceMigrationType UNKNOWN;
    private final int value;

    static {
        SinglePreferenceMigrationType singlePreferenceMigrationType = new SinglePreferenceMigrationType("TO_SINGLE", 0, 0);
        TO_SINGLE = singlePreferenceMigrationType;
        SinglePreferenceMigrationType singlePreferenceMigrationType2 = new SinglePreferenceMigrationType("FROM_SINGLE", 1, 1);
        FROM_SINGLE = singlePreferenceMigrationType2;
        SinglePreferenceMigrationType singlePreferenceMigrationType3 = new SinglePreferenceMigrationType("FROM_SINGLE_WITHOUT_ROLLBACK", 2, 2);
        FROM_SINGLE_WITHOUT_ROLLBACK = singlePreferenceMigrationType3;
        SinglePreferenceMigrationType singlePreferenceMigrationType4 = new SinglePreferenceMigrationType("TO_SINGLE_WITHOUT_CREATE", 3, 3);
        TO_SINGLE_WITHOUT_CREATE = singlePreferenceMigrationType4;
        SinglePreferenceMigrationType singlePreferenceMigrationType5 = new SinglePreferenceMigrationType("TO_FULL_SINGLE", 4, 4);
        TO_FULL_SINGLE = singlePreferenceMigrationType5;
        SinglePreferenceMigrationType singlePreferenceMigrationType6 = new SinglePreferenceMigrationType("TO_FULL_SINGLE_WITHOUT_CREATE", 5, 5);
        TO_FULL_SINGLE_WITHOUT_CREATE = singlePreferenceMigrationType6;
        SinglePreferenceMigrationType singlePreferenceMigrationType7 = new SinglePreferenceMigrationType("FROM_FULL_SINGLE", 6, 6);
        FROM_FULL_SINGLE = singlePreferenceMigrationType7;
        SinglePreferenceMigrationType singlePreferenceMigrationType8 = new SinglePreferenceMigrationType("FROM_FULL_SINGLE_WITHOUT_ROLLBACK", 7, 7);
        FROM_FULL_SINGLE_WITHOUT_ROLLBACK = singlePreferenceMigrationType8;
        SinglePreferenceMigrationType singlePreferenceMigrationType9 = new SinglePreferenceMigrationType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8, -1);
        UNKNOWN = singlePreferenceMigrationType9;
        SinglePreferenceMigrationType[] singlePreferenceMigrationTypeArr = {singlePreferenceMigrationType, singlePreferenceMigrationType2, singlePreferenceMigrationType3, singlePreferenceMigrationType4, singlePreferenceMigrationType5, singlePreferenceMigrationType6, singlePreferenceMigrationType7, singlePreferenceMigrationType8, singlePreferenceMigrationType9};
        $VALUES = singlePreferenceMigrationTypeArr;
        $ENTRIES = new asp(singlePreferenceMigrationTypeArr);
    }

    public SinglePreferenceMigrationType(String str, int i, int i2) {
        this.value = i2;
    }

    public static SinglePreferenceMigrationType valueOf(String str) {
        return (SinglePreferenceMigrationType) Enum.valueOf(SinglePreferenceMigrationType.class, str);
    }

    public static SinglePreferenceMigrationType[] values() {
        return (SinglePreferenceMigrationType[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
