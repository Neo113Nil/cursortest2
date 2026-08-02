package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;
import com.inmobi.media.core.config.models.CrashConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1hSDK extends AFe1vSDK<Boolean> {
    private static volatile boolean w = false;
    private final AFc1aSDK force;
    private Boolean i;
    private final AFc1sSDK registerClient;
    private final AFe1ySDK v;

    public AFe1hSDK(@NonNull AFc1aSDK aFc1aSDK) {
        super(AFd1aSDK.d, new AFe1zSDK[0], "LoadCachedRequests");
        this.registerClient = aFc1aSDK.getEntries();
        this.v = aFc1aSDK.afWarnLog();
        this.force = aFc1aSDK;
    }

    public static boolean i() {
        return w;
    }

    private static String registerClient(AFc1vSDK aFc1vSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFc1vSDK.AFKeystoreWrapper, 10);
        String str = aFc1vSDK.AFLogger;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.CACHE, "Couldn't parse the uri", e, false, false);
            return str;
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NonNull
    public final AFd1bSDK unregisterClient() throws Exception {
        for (AFc1vSDK aFc1vSDK : this.registerClient.unregisterClient()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.CACHE;
            StringBuilder sb = new StringBuilder("resending request: ");
            sb.append(aFc1vSDK.AFLogger);
            aFLogger.i(logTag, sb.toString());
            try {
                AFh1xSDK aFh1xSDK = new AFh1xSDK(registerClient(aFc1vSDK), aFc1vSDK.registerClient, aFc1vSDK.AFKeystoreWrapper, aFc1vSDK.d, aFc1vSDK.v);
                AFe1ySDK aFe1ySDK = this.v;
                aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(new AFe1dSDK(aFh1xSDK, this.force)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(LogTag.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.i = Boolean.TRUE;
        w = true;
        return AFd1bSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    }
}
