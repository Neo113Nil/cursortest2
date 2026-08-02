package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.a70;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1qSDK<ResponseBody> {
    private final AFd1jSDK<ResponseBody> AFKeystoreWrapper;
    private final AFd1nSDK AFLogger;
    private final ExecutorService d;
    private final AtomicBoolean registerClient = new AtomicBoolean(false);
    public final AFd1lSDK unregisterClient;

    public AFd1qSDK(AFd1lSDK aFd1lSDK, ExecutorService executorService, AFd1nSDK aFd1nSDK, AFd1jSDK<ResponseBody> aFd1jSDK) {
        this.unregisterClient = aFd1lSDK;
        this.d = executorService;
        this.AFLogger = aFd1nSDK;
        this.AFKeystoreWrapper = aFd1jSDK;
    }

    public final AFd1iSDK<ResponseBody> AFLogger() throws IOException {
        if (this.registerClient.getAndSet(true)) {
            a70.r("Http call is already executed");
            return null;
        }
        AFd1iSDK<String> AFLogger = this.AFLogger.AFLogger(this.unregisterClient);
        try {
            return new AFd1iSDK<>(this.AFKeystoreWrapper.registerClient(AFLogger.getBody()), AFLogger.unregisterClient, AFLogger.AFKeystoreWrapper, AFLogger.registerClient, AFLogger.AFLogger);
        } catch (JSONException e) {
            AFLogger.INSTANCE.e(LogTag.HTTP_CLIENT, "Could not parse raw response during execute", e, false, false);
            throw new ParsingException(e.getMessage(), e, AFLogger);
        }
    }
}
