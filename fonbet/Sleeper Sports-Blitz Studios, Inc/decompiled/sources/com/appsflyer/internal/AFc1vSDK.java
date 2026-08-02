package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFc1vSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFd1lSDK;", "p0", "Lcom/appsflyer/internal/AFd1pSDK;", "p1", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFd1lSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFc1vSDK {
    public static final AFc1vSDK INSTANCE = new AFc1vSDK();

    private AFc1vSDK() {
    }

    @JvmStatic
    public static final void getMediationNetwork(AFd1lSDK p0, AFd1pSDK p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1qSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
        }
        if (!appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; use KeyStore");
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getCurrencyIso4217Code);
            if (!aFKeystoreWrapper.getMonetizationNetwork()) {
                aFKeystoreWrapper.getCurrencyIso4217Code = AFb1mSDK.getMediationNetwork(p0, p1);
                aFKeystoreWrapper.getRevenue = 0;
                aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
            } else {
                String revenue = aFKeystoreWrapper.getRevenue();
                synchronized (aFKeystoreWrapper.getMediationNetwork) {
                    aFKeystoreWrapper.getRevenue++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(revenue)));
                    try {
                        synchronized (aFKeystoreWrapper.getMediationNetwork) {
                            aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(revenue);
                        }
                    } catch (KeyStoreException e) {
                        StringBuilder sb = new StringBuilder("Exception ");
                        sb.append(e.getMessage());
                        sb.append(" occurred");
                        AFLogger.afErrorLog(sb.toString(), e);
                    }
                }
                aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMediationNetwork());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFAdRevenueData()));
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; no KeyStore usage");
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getMediationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
