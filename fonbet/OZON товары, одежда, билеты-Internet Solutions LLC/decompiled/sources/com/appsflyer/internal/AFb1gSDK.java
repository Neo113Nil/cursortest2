package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0007\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1gSDK;", "", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "Lcom/appsflyer/internal/AFd1tSDK;", "p1", "", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/internal/AFd1tSDK;)V", "", "()Ljava/lang/String;", "valueOf", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1gSDK {

    @NotNull
    public static final AFb1gSDK INSTANCE = new AFb1gSDK();

    private AFb1gSDK() {
    }

    public static final void AFKeystoreWrapper(@NotNull AFd1kSDK p02, @NotNull AFd1tSDK p12) {
        int i11;
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1uSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
            i11 = 23;
        } else {
            i11 = 18;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < i11 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i12);
            sb2.append("; no KeyStore usage");
            AFLogger.afRDLog(sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(i12);
        sb3.append("; use KeyStore");
        AFLogger.afRDLog(sb3.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p02.valueOf);
        if (aFKeystoreWrapper.valueOf()) {
            String AFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
            synchronized (aFKeystoreWrapper.AFKeystoreWrapper) {
                aFKeystoreWrapper.valueOf++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFKeystoreWrapper)));
                try {
                    synchronized (aFKeystoreWrapper.AFKeystoreWrapper) {
                        aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFKeystoreWrapper);
                    }
                } catch (KeyStoreException e11) {
                    StringBuilder sb4 = new StringBuilder("Exception ");
                    sb4.append(e11.getMessage());
                    sb4.append(" occurred");
                    AFLogger.afErrorLog(sb4.toString(), e11);
                }
            }
            aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFKeystoreWrapper());
        } else {
            aFKeystoreWrapper.values = AFb1kSDK.AFInAppEventType(p02, p12);
            aFKeystoreWrapper.valueOf = 0;
            aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFKeystoreWrapper());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
    }

    public static String valueOf() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }
}
