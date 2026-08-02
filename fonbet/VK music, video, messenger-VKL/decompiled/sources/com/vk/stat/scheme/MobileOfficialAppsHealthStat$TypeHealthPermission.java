package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.hihealth.data.Field;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsHealthStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsHealthStat$TypeHealthPermission {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsHealthStat$TypeHealthPermission[] $VALUES;

    @pmi0("activity_recognition")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission ACTIVITY_RECOGNITION;

    @pmi0(Field.NUTRIENTS_FACTS_CALORIES)
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission CALORIES;

    @pmi0("distance")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission DISTANCE;

    @pmi0("heart_rate")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission HEART_RATE;

    @pmi0("other")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission OTHER;

    @pmi0("steps")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission STEPS;

    @pmi0(NotificationCompat.CATEGORY_WORKOUT)
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission WORKOUT;

    @pmi0("workout_route")
    public static final MobileOfficialAppsHealthStat$TypeHealthPermission WORKOUT_ROUTE;

    static {
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission = new MobileOfficialAppsHealthStat$TypeHealthPermission("STEPS", 0);
        STEPS = mobileOfficialAppsHealthStat$TypeHealthPermission;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission2 = new MobileOfficialAppsHealthStat$TypeHealthPermission("DISTANCE", 1);
        DISTANCE = mobileOfficialAppsHealthStat$TypeHealthPermission2;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission3 = new MobileOfficialAppsHealthStat$TypeHealthPermission("WORKOUT", 2);
        WORKOUT = mobileOfficialAppsHealthStat$TypeHealthPermission3;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission4 = new MobileOfficialAppsHealthStat$TypeHealthPermission("WORKOUT_ROUTE", 3);
        WORKOUT_ROUTE = mobileOfficialAppsHealthStat$TypeHealthPermission4;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission5 = new MobileOfficialAppsHealthStat$TypeHealthPermission("HEART_RATE", 4);
        HEART_RATE = mobileOfficialAppsHealthStat$TypeHealthPermission5;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission6 = new MobileOfficialAppsHealthStat$TypeHealthPermission("CALORIES", 5);
        CALORIES = mobileOfficialAppsHealthStat$TypeHealthPermission6;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission7 = new MobileOfficialAppsHealthStat$TypeHealthPermission("ACTIVITY_RECOGNITION", 6);
        ACTIVITY_RECOGNITION = mobileOfficialAppsHealthStat$TypeHealthPermission7;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission8 = new MobileOfficialAppsHealthStat$TypeHealthPermission(NativeAdContent.ViewTag.OTHER, 7);
        OTHER = mobileOfficialAppsHealthStat$TypeHealthPermission8;
        MobileOfficialAppsHealthStat$TypeHealthPermission[] mobileOfficialAppsHealthStat$TypeHealthPermissionArr = {mobileOfficialAppsHealthStat$TypeHealthPermission, mobileOfficialAppsHealthStat$TypeHealthPermission2, mobileOfficialAppsHealthStat$TypeHealthPermission3, mobileOfficialAppsHealthStat$TypeHealthPermission4, mobileOfficialAppsHealthStat$TypeHealthPermission5, mobileOfficialAppsHealthStat$TypeHealthPermission6, mobileOfficialAppsHealthStat$TypeHealthPermission7, mobileOfficialAppsHealthStat$TypeHealthPermission8};
        $VALUES = mobileOfficialAppsHealthStat$TypeHealthPermissionArr;
        $ENTRIES = new asp(mobileOfficialAppsHealthStat$TypeHealthPermissionArr);
    }

    private MobileOfficialAppsHealthStat$TypeHealthPermission(String str, int i) {
    }

    public static MobileOfficialAppsHealthStat$TypeHealthPermission valueOf(String str) {
        return (MobileOfficialAppsHealthStat$TypeHealthPermission) Enum.valueOf(MobileOfficialAppsHealthStat$TypeHealthPermission.class, str);
    }

    public static MobileOfficialAppsHealthStat$TypeHealthPermission[] values() {
        return (MobileOfficialAppsHealthStat$TypeHealthPermission[]) $VALUES.clone();
    }
}
