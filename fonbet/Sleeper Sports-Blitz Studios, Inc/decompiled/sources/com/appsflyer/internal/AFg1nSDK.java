package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFg1nSDK {
    private final PackageManager getCurrencyIso4217Code;
    private final Map<String, Object> getMediationNetwork;
    private final String getRevenue;

    public AFg1nSDK(AFd1lSDK aFd1lSDK, AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getMediationNetwork = new LinkedHashMap();
        Context context = aFd1lSDK.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code = context != null ? context.getPackageManager() : null;
        String packageName = aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.getRevenue = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getCurrencyIso4217Code() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String installingPackageName;
        String originatingPackageName;
        String installerPackageName;
        if (this.getMediationNetwork.isEmpty()) {
            try {
                PackageManager packageManager = this.getCurrencyIso4217Code;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.getRevenue)) != null) {
                    this.getMediationNetwork.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.getMediationNetwork;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.getRevenue;
                PackageManager packageManager2 = this.getCurrencyIso4217Code;
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
        return this.getMediationNetwork;
    }
}
