package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1eSDK implements AFg1dSDK {

    @Nullable
    private AFg1gSDK AFLogger;

    @Nullable
    private AFg1iSDK d;

    @NotNull
    private final AFc1aSDK registerClient;

    @Nullable
    private AFg1mSDK unregisterClient;

    public AFg1eSDK(@NotNull AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.registerClient = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void AFKeystoreWrapper() {
        AFg1iSDK aFg1iSDK = this.d;
        if (aFg1iSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1iSDK);
            this.d = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void AFLogger() {
        AFg1mSDK aFg1mSDK = this.unregisterClient;
        if (aFg1mSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1mSDK);
            this.unregisterClient = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void d() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = this.AFLogger;
        if (aFg1gSDK == null) {
            aFg1gSDK = new AFg1gSDK(this.registerClient);
            this.AFLogger = aFg1gSDK;
        }
        aFg1gSDK.getClass();
        aFLogger.registerClient(aFg1gSDK);
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void e() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1mSDK aFg1mSDK = this.unregisterClient;
        if (aFg1mSDK == null) {
            AFc1hSDK AFKeystoreWrapper = this.registerClient.AFKeystoreWrapper();
            AFKeystoreWrapper.getClass();
            aFg1mSDK = new AFg1mSDK(AFKeystoreWrapper);
            this.unregisterClient = aFg1mSDK;
        }
        aFLogger.registerClient(aFg1mSDK);
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1iSDK aFg1iSDK = this.d;
        if (aFg1iSDK == null) {
            aFg1iSDK = new AFg1iSDK(this.registerClient);
            this.d = aFg1iSDK;
        }
        aFg1iSDK.getClass();
        aFLogger.registerClient(aFg1iSDK);
    }

    @Override // com.appsflyer.internal.AFg1dSDK
    public final void unregisterClient() {
        AFg1gSDK aFg1gSDK = this.AFLogger;
        if (aFg1gSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1gSDK);
            this.AFLogger = null;
        }
    }
}
