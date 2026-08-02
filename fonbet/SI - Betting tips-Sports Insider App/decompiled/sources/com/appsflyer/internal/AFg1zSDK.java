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
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFg1zSDK {

    @NotNull
    private final String AFAdRevenueData;

    @NotNull
    private final Map<String, Object> getCurrencyIso4217Code;

    @Nullable
    private final PackageManager getMediationNetwork;

    public AFg1zSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1oSDK aFc1oSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        this.getCurrencyIso4217Code = new LinkedHashMap();
        Context context = aFc1hSDK.getMonetizationNetwork;
        this.getMediationNetwork = context != null ? context.getPackageManager() : null;
        String packageName = aFc1oSDK.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFAdRevenueData = packageName;
    }

    private final Map<String, Object> getRevenue() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.AFAdRevenueData;
            PackageManager packageManager = this.getMediationNetwork;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
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
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Failed to get the app install source info", th2, true, false, true, true, 16, null);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> AFAdRevenueData() {
        String installerPackageName;
        if (this.getCurrencyIso4217Code.isEmpty()) {
            try {
                PackageManager packageManager = this.getMediationNetwork;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFAdRevenueData)) != null) {
                    this.getCurrencyIso4217Code.put("installer_package", installerPackageName);
                }
            } catch (Exception e7) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e7);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.getCurrencyIso4217Code.put("install_source_info", getRevenue());
            }
        }
        return this.getCurrencyIso4217Code;
    }
}
