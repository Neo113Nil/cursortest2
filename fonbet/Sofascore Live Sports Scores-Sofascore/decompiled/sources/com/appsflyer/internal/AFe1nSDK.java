package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1nSDK extends AFe1oSDK<String> {
    private final AFc1hSDK afWarnLog;

    @Nullable
    private final AFj1nSDK e;

    @NonNull
    private final String i;

    public AFe1nSDK(@NonNull AFc1aSDK aFc1aSDK, @NonNull String str, @Nullable AFj1nSDK aFj1nSDK) {
        super(AFd1aSDK.values, new AFe1zSDK[]{AFd1aSDK.registerClient, AFd1aSDK.AFKeystoreWrapper}, aFc1aSDK, str);
        this.i = str;
        this.e = aFj1nSDK;
        this.afWarnLog = aFc1aSDK.AFKeystoreWrapper();
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        super.AFLogger();
        AFd1iSDK<Result> aFd1iSDK = ((AFe1oSDK) this).w;
        if (aFd1iSDK != 0) {
            int statusCode = aFd1iSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.CROSS_PROMOTION;
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.i);
                aFLogger.i(logTag, sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.CROSS_PROMOTION;
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.i);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                aFLogger2.i(logTag2, sb2.toString());
                return;
            }
            AFLogger aFLogger3 = AFLogger.INSTANCE;
            LogTag logTag3 = LogTag.CROSS_PROMOTION;
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.i);
            aFLogger3.i(logTag3, sb3.toString(), false);
            String unregisterClient = aFd1iSDK.unregisterClient("Location");
            AFj1nSDK aFj1nSDK = this.e;
            if (aFj1nSDK == null || unregisterClient == null) {
                return;
            }
            aFj1nSDK.d = unregisterClient;
            Context context = aFj1nSDK.registerClient.get();
            if (context != null) {
                try {
                    if (aFj1nSDK.d != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1nSDK.d)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.INSTANCE.e(LogTag.CROSS_PROMOTION, "Failed to open cross promotion URL; is a browser app installed?", e);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final AFd1qSDK<String> d(@NonNull String str) {
        AFd1tSDK aFd1tSDK = ((AFe1oSDK) this).registerClient;
        String AFKeystoreWrapper = this.afWarnLog.AFKeystoreWrapper();
        return aFd1tSDK.d((AFKeystoreWrapper == null || AFKeystoreWrapper.length() == 0) ? this.i : Uri.parse(this.i).buildUpon().appendQueryParameter("advertising_id", AFKeystoreWrapper).build().toString());
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }
}
