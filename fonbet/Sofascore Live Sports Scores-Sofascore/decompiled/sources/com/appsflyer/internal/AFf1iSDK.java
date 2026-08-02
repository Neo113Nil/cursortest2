package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1iSDK {

    @NotNull
    private final String AFKeystoreWrapper;

    @Nullable
    private final PackageManager AFLogger;

    @NotNull
    private final Map<String, Object> registerClient;

    public AFf1iSDK(@NotNull AFc1cSDK aFc1cSDK, @NotNull AFc1hSDK aFc1hSDK) {
        aFc1cSDK.getClass();
        aFc1hSDK.getClass();
        this.registerClient = new LinkedHashMap();
        Context context = aFc1cSDK.d;
        this.AFLogger = context != null ? context.getPackageManager() : null;
        String packageName = aFc1hSDK.registerClient.d.getPackageName();
        packageName.getClass();
        this.AFKeystoreWrapper = packageName;
    }

    private final Map<String, Object> AFKeystoreWrapper() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.AFKeystoreWrapper;
            PackageManager packageManager = this.AFLogger;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                }
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put("installing_package", installingPackageName);
                }
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put("originating_package", originatingPackageName);
                }
                return linkedHashMap2;
            }
        } catch (Throwable unused) {
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> d() {
        String installerPackageName;
        if (this.registerClient.isEmpty()) {
            try {
                PackageManager packageManager = this.AFLogger;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFKeystoreWrapper)) != null) {
                    this.registerClient.put("installer_package", installerPackageName);
                }
            } catch (Throwable unused) {
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.registerClient.put("install_source_info", AFKeystoreWrapper());
            }
        }
        return this.registerClient;
    }
}
