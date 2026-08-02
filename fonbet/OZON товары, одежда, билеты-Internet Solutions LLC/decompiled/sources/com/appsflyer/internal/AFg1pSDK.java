package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1pSDK {

    @NotNull
    private final String AFInAppEventType;
    private final PackageManager valueOf;

    @NotNull
    private final Map<String, Object> values;

    public AFg1pSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AFd1sSDK aFd1sSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        this.values = new LinkedHashMap();
        Context context = aFd1kSDK.valueOf;
        this.valueOf = context != null ? context.getPackageManager() : null;
        String packageName = aFd1sSDK.AFInAppEventParameterName.valueOf.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFInAppEventType = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> values() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String installingPackageName;
        String originatingPackageName;
        String installerPackageName;
        if (this.values.isEmpty()) {
            try {
                PackageManager packageManager = this.valueOf;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFInAppEventType)) != null) {
                    this.values.put("installer_package", installerPackageName);
                }
            } catch (Exception e11) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e11);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.values;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFInAppEventType;
                PackageManager packageManager2 = this.valueOf;
                if (packageManager2 != null && installSourceInfo != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.values;
    }
}
