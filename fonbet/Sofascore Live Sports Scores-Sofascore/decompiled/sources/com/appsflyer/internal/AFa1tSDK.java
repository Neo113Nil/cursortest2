package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.lnb;
import java.security.KeyStoreException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFa1tSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1cSDK;", "p0", "Lcom/appsflyer/internal/AFc1hSDK;", "p1", "Lcom/appsflyer/AppsFlyerProperties;", "p2", "", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFc1cSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/AppsFlyerProperties;)V", "", "unregisterClient", "(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;", "AFLogger"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1tSDK {

    @NotNull
    public static final AFa1tSDK INSTANCE = new AFa1tSDK();

    private AFa1tSDK() {
    }

    public static final void AFKeystoreWrapper(@NotNull AFc1cSDK p0, @NotNull AFc1hSDK p1, @NotNull AppsFlyerProperties p2) {
        p0.getClass();
        p1.getClass();
        p2.getClass();
        if (Build.BRAND.equals("OPPO")) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.ATTRIBUTION, "OPPO device found", false, 4, null);
        }
        String AFLogger = p1.AFLogger("AF_DISABLE_KEYSTORE");
        if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : true) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.ATTRIBUTION, lnb.k(Build.VERSION.SDK_INT, "OS SDK is=", "; no KeyStore usage"), false, 4, null);
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFLoggerBase.d$default(aFLogger, LogTag.ATTRIBUTION, lnb.k(Build.VERSION.SDK_INT, "OS SDK is=", "; use KeyStore"), false, 4, null);
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.d);
        if (aFKeystoreWrapper.AFLogger()) {
            String d = aFKeystoreWrapper.d();
            synchronized (aFKeystoreWrapper.d) {
                aFKeystoreWrapper.AFKeystoreWrapper++;
                aFLogger.i(LogTag.SECURITY, "Deleting key with alias: ".concat(String.valueOf(d)));
                try {
                    synchronized (aFKeystoreWrapper.d) {
                        aFKeystoreWrapper.unregisterClient.deleteEntry(d);
                    }
                } catch (KeyStoreException e) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.SECURITY;
                    StringBuilder sb = new StringBuilder("Exception occurred while deleting key: ");
                    sb.append(e.getMessage() != null ? e.getMessage() : "unknown error");
                    aFLogger2.e(logTag, sb.toString(), e);
                }
            }
            aFKeystoreWrapper.d(aFKeystoreWrapper.d());
        } else {
            aFKeystoreWrapper.AFLogger = AFb1mSDK.unregisterClient(p1.AFKeystoreWrapper);
            aFKeystoreWrapper.AFKeystoreWrapper = 0;
            aFKeystoreWrapper.d(aFKeystoreWrapper.d());
        }
        p2.set("KSAppsFlyerId", aFKeystoreWrapper.AFKeystoreWrapper());
        p2.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.unregisterClient()));
    }

    @Nullable
    public static String AFLogger(@NotNull AppsFlyerProperties p0) {
        p0.getClass();
        return p0.getString("KSAppsFlyerRICounter");
    }

    @Nullable
    public static String unregisterClient(@NotNull AppsFlyerProperties p0) {
        p0.getClass();
        return p0.getString("KSAppsFlyerId");
    }
}
