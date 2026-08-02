package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;

/* loaded from: classes.dex */
public final class AFf1qSDK extends AFe1eSDK<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f57436d = false;
    private final AFe1fSDK AFLogger;

    /* renamed from: e, reason: collision with root package name */
    private final AFd1mSDK f57437e;
    private final AFb1vSDK registerClient;
    private Boolean unregisterClient;

    public AFf1qSDK(@NonNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.LOAD_CACHE, new AFf1zSDK[0], "LoadCachedRequests");
        this.registerClient = aFd1mSDK.afRDLog();
        this.AFLogger = aFd1mSDK.afInfoLog();
        this.f57437e = aFd1mSDK;
    }

    public static boolean registerClient() {
        return f57436d;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1dSDK values() throws Exception {
        for (AFb1qSDK aFb1qSDK : this.registerClient.AFInAppEventType()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK = AFg1gSDK.CACHE;
            StringBuilder sb2 = new StringBuilder("resending request: ");
            sb2.append(aFb1qSDK.AFInAppEventType);
            aFLogger.i(aFg1gSDK, sb2.toString());
            try {
                AFh1qSDK aFh1qSDK = new AFh1qSDK(values(aFb1qSDK), aFb1qSDK.AFInAppEventParameterName(), aFb1qSDK.AFInAppEventParameterName, aFb1qSDK.values);
                AFe1fSDK aFe1fSDK = this.AFLogger;
                aFe1fSDK.AFKeystoreWrapper.execute(aFe1fSDK.new AnonymousClass3(new AFf1kSDK(aFh1qSDK, this.f57437e)));
            } catch (Exception e11) {
                AFLogger.INSTANCE.e(AFg1gSDK.QUEUE, "Failed to resend cached request", e11);
            }
        }
        this.unregisterClient = Boolean.TRUE;
        f57436d = true;
        return AFe1dSDK.SUCCESS;
    }

    private static String values(AFb1qSDK aFb1qSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1qSDK.AFInAppEventParameterName, 10);
        String str = aFb1qSDK.AFInAppEventType;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e11);
            return str;
        }
    }
}
