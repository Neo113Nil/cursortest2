package com.vk.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartPermissionResult.kt */
/* loaded from: classes11.dex */
public final class AppStartPermissionResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartPermissionResult[] $VALUES;
    public static final AppStartPermissionResult ALLOWED;
    public static final AppStartPermissionResult DONT_ASK_AGAIN;
    public static final AppStartPermissionResult NOT_ALLOWED;
    public static final AppStartPermissionResult NOT_DETERMINED;
    private final String permissionResult;

    static {
        AppStartPermissionResult appStartPermissionResult = new AppStartPermissionResult("ALLOWED", 0, "allowed");
        ALLOWED = appStartPermissionResult;
        AppStartPermissionResult appStartPermissionResult2 = new AppStartPermissionResult("NOT_ALLOWED", 1, "denied");
        NOT_ALLOWED = appStartPermissionResult2;
        AppStartPermissionResult appStartPermissionResult3 = new AppStartPermissionResult("DONT_ASK_AGAIN", 2, "denied_permanently");
        DONT_ASK_AGAIN = appStartPermissionResult3;
        AppStartPermissionResult appStartPermissionResult4 = new AppStartPermissionResult("NOT_DETERMINED", 3, "not_determined");
        NOT_DETERMINED = appStartPermissionResult4;
        AppStartPermissionResult[] appStartPermissionResultArr = {appStartPermissionResult, appStartPermissionResult2, appStartPermissionResult3, appStartPermissionResult4};
        $VALUES = appStartPermissionResultArr;
        $ENTRIES = new asp(appStartPermissionResultArr);
    }

    public AppStartPermissionResult(String str, int i, String str2) {
        this.permissionResult = str2;
    }

    public static AppStartPermissionResult valueOf(String str) {
        return (AppStartPermissionResult) Enum.valueOf(AppStartPermissionResult.class, str);
    }

    public static AppStartPermissionResult[] values() {
        return (AppStartPermissionResult[]) $VALUES.clone();
    }

    public final String h() {
        return this.permissionResult;
    }
}
