package com.appsflyer.internal;

import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1pSDK implements Runnable {

    @Nullable
    private final Map<String, Object> AFLogger;

    @NotNull
    private final AFc1aSDK d;

    @NotNull
    private final AFh1zSDK unregisterClient;

    public AFa1pSDK(@NotNull AFc1aSDK aFc1aSDK, @NotNull AFh1zSDK aFh1zSDK, @Nullable Map<String, ? extends Object> map) {
        aFc1aSDK.getClass();
        aFh1zSDK.getClass();
        this.d = aFc1aSDK;
        this.unregisterClient = aFh1zSDK;
        this.AFLogger = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1fSDK aFe1fSDK;
        AFh1zSDK aFh1zSDK = this.unregisterClient;
        if (aFh1zSDK.v == null && aFh1zSDK.e == null) {
            AFf1wSDK aFf1wSDK = new AFf1wSDK(this.unregisterClient, this.d);
            aFf1wSDK.afDebugLog = this.AFLogger;
            aFe1fSDK = aFf1wSDK;
        } else {
            aFe1fSDK = aFh1zSDK instanceof AFh1uSDK ? new AFe1cSDK((AFh1uSDK) this.unregisterClient, this.d) : new AFe1fSDK(this.unregisterClient, this.d);
        }
        AFe1ySDK afWarnLog = this.d.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFe1fSDK));
    }
}
