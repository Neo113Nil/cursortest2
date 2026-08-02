package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1dSDK extends AFe1oSDK<String> {
    private final AFh1xSDK i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFe1dSDK(@NonNull AFh1xSDK aFh1xSDK, @NonNull AFc1aSDK aFc1aSDK) {
        super(r2, r3, aFc1aSDK, r0.toString(), aFh1xSDK.e);
        AFe1zSDK aFe1zSDK = aFh1xSDK.AFLoggerLogLevel;
        AFe1zSDK aFe1zSDK2 = aFe1zSDK == null ? AFd1aSDK.AFLogger : aFe1zSDK;
        AFe1zSDK[] aFe1zSDKArr = {AFd1aSDK.registerClient};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1xSDK.e);
        sb.append("-");
        sb.append(registerClient(aFh1xSDK));
        this.i = aFh1xSDK;
    }

    private static String registerClient(AFh1xSDK aFh1xSDK) {
        try {
            return new URL(aFh1xSDK.w).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return this.i.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        ResponseNetwork responseNetwork;
        if (!super.d()) {
            Object obj = this.i.AFLoggerLogLevel;
            if (obj == null) {
                obj = AFd1aSDK.AFLogger;
            }
            if (obj != AFd1aSDK.getEntries || (responseNetwork = ((AFe1oSDK) this).w) == null || responseNetwork.getStatusCode() != 424) {
                ResponseNetwork responseNetwork2 = ((AFe1oSDK) this).w;
                boolean z = this.AFKeystoreWrapper == AFd1bSDK.FAILURE && responseNetwork2 != null && responseNetwork2.getStatusCode() / 500 == 1;
                AFe1zSDK aFe1zSDK = this.d;
                boolean z2 = aFe1zSDK == AFd1aSDK.unregisterClient || aFe1zSDK == AFd1aSDK.force;
                if (!z || !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final AFd1qSDK<String> d(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.i.force, 2);
        AFLogger.INSTANCE.i(LogTag.CACHE, "cached data: ".concat(String.valueOf(encodeToString)));
        ((AFe1oSDK) this).v.unregisterClient(this.i.w, encodeToString);
        return ((AFe1oSDK) this).registerClient.AFKeystoreWrapper(this.i);
    }
}
