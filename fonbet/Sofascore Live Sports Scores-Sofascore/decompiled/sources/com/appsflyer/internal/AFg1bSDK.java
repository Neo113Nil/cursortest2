package com.appsflyer.internal;

import com.appsflyer.migration.internal.MigrationDataProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1bSDK {
    public static final boolean unregisterClient() {
        try {
            MigrationDataProvider migrationDataProvider = MigrationDataProvider.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
