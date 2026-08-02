package com.appsflyer.internal;

import com.appsflyer.migration.AppsFlyerMigrationHelper;
import kotlin.jvm.JvmName;

@JvmName(name = "BranchMigrationManagerUtil")
/* loaded from: classes.dex */
public final class AFh1sSDK {
    public static final boolean getMonetizationNetwork() {
        try {
            AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
