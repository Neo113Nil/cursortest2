package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.network.http.ResponseNetwork;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1eSDK implements AFe1xSDK {

    @NotNull
    private final AppsFlyerProperties AFKeystoreWrapper;

    @NotNull
    private final AFc1aSDK AFLogger;

    @NotNull
    private final AFe1ySDK d;

    @NotNull
    private final AFc1pSDK registerClient;

    public AFd1eSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFe1ySDK aFe1ySDK, @NotNull AFc1aSDK aFc1aSDK) {
        aFc1pSDK.getClass();
        appsFlyerProperties.getClass();
        aFe1ySDK.getClass();
        aFc1aSDK.getClass();
        this.registerClient = aFc1pSDK;
        this.AFKeystoreWrapper = appsFlyerProperties;
        this.d = aFe1ySDK;
        this.AFLogger = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void AFKeystoreWrapper(@NotNull AFe1vSDK<?> aFe1vSDK) {
        aFe1vSDK.getClass();
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void AFLogger(@NotNull AFe1vSDK<?> aFe1vSDK, @NotNull AFd1bSDK aFd1bSDK) {
        AFf1eSDK AFLogger;
        aFe1vSDK.getClass();
        aFd1bSDK.getClass();
        if (!(aFe1vSDK instanceof AFe1fSDK)) {
            if (!(aFe1vSDK instanceof AFg1sSDK) || aFd1bSDK == AFd1bSDK.SUCCESS) {
                return;
            }
            AFe1ySDK aFe1ySDK = this.d;
            aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(new AFg1vSDK(this.AFLogger)));
            return;
        }
        AFe1fSDK aFe1fSDK = (AFe1fSDK) aFe1vSDK;
        if (aFd1bSDK == AFd1bSDK.SUCCESS) {
            this.registerClient.d("sentSuccessfully", "true");
            if (!(aFe1fSDK instanceof AFf1xSDK) && (AFLogger = new AFf1fSDK().AFLogger()) != null && AFLogger.d) {
                String str = AFLogger.unregisterClient;
                AFLogger.INSTANCE.d(LogTag.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                AFc1dSDK aFc1dSDK = AFa1zSDK.d().AFKeystoreWrapper;
                AFf1xSDK aFf1xSDK = new AFf1xSDK(str, aFc1dSDK);
                AFe1ySDK afWarnLog = aFc1dSDK.afWarnLog();
                afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFf1xSDK));
            }
            ResponseNetwork responseNetwork = ((AFe1oSDK) aFe1fSDK).w;
            if (responseNetwork != null) {
                AFa1oSDK.registerClient((String) responseNetwork.getBody(), this.AFKeystoreWrapper);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void registerClient(@NotNull AFe1vSDK<?> aFe1vSDK) {
        aFe1vSDK.getClass();
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void unregisterClient(@NotNull AFe1vSDK<?> aFe1vSDK) {
        aFe1vSDK.getClass();
    }
}
