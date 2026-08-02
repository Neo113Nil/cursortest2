package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1hSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1hSDK implements AFb1gSDK.AFa1tSDK {

    @NotNull
    private final AFe1aSDK AFKeystoreWrapper;

    @NotNull
    private final Function0<Unit> AFLogger;

    @Nullable
    private final AFg1aSDK d;

    @NotNull
    private final AFc1aSDK registerClient;

    public AFb1hSDK(@NotNull AFc1aSDK aFc1aSDK, @NotNull Function0<Unit> function0, @NotNull AFe1aSDK aFe1aSDK, @Nullable AFg1aSDK aFg1aSDK) {
        aFc1aSDK.getClass();
        function0.getClass();
        aFe1aSDK.getClass();
        this.registerClient = aFc1aSDK;
        this.AFLogger = function0;
        this.AFKeystoreWrapper = aFe1aSDK;
        this.d = aFg1aSDK;
    }

    @Override // com.appsflyer.internal.AFb1gSDK.AFa1tSDK
    public final void m_(@NotNull Intent intent) {
        intent.getClass();
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "onActivityCreated with deeplink", false, 4, null);
        AFa1mSDK onPause = this.registerClient.onPause();
        AFa1hSDK.Companion companion = AFa1hSDK.INSTANCE;
        AFa1kSDK outOfStore = this.registerClient.getOutOfStore();
        outOfStore.getClass();
        onPause.b_(AFa1hSDK.Companion.AFKeystoreWrapper(outOfStore), intent, this.registerClient.valueOf().d);
    }

    @Override // com.appsflyer.internal.AFb1gSDK.AFa1tSDK
    public final void n_(@NotNull Intent intent) {
        intent.getClass();
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "onBecameForeground", false, 4, null);
        this.registerClient.force().unregisterClient();
        this.registerClient.setUserEmails().N_(intent);
        AFa1mSDK onPause = this.registerClient.onPause();
        AFa1hSDK.Companion companion = AFa1hSDK.INSTANCE;
        AFa1kSDK outOfStore = this.registerClient.getOutOfStore();
        outOfStore.getClass();
        onPause.b_(AFa1hSDK.Companion.AFKeystoreWrapper(outOfStore), intent, this.registerClient.valueOf().d);
        this.registerClient.w().registerClient(this.AFKeystoreWrapper);
        if (!AFe1hSDK.i()) {
            AFe1ySDK afWarnLog = this.registerClient.afWarnLog();
            afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1hSDK(this.registerClient)));
        }
        if (this.registerClient.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0) < 2) {
            this.registerClient.afErrorLog().registerClient();
        }
        AFg1aSDK aFg1aSDK = this.d;
        if (aFg1aSDK != null) {
            AFa1mSDK onPause2 = this.registerClient.onPause();
            onPause2.getClass();
            aFg1aSDK.z_(intent, onPause2);
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK.AFa1tSDK
    public final void unregisterClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GENERAL;
        AFLoggerBase.i$default(aFLogger, logTag, "onBecameBackground", false, 4, null);
        AFg1fSDK force = this.registerClient.force();
        long currentTimeMillis = System.currentTimeMillis();
        long j = force.w;
        if (j != 0) {
            long j2 = currentTimeMillis - j;
            if (j2 > 0 && j2 < 1000) {
                j2 = 1000;
            }
            long j3 = j2 / 1000;
            force.afWarnLog = j3;
            force.AFLogger.AFLogger("prev_session_dur", j3);
        } else {
            aFLogger.i(logTag, "Metrics: fg ts is missing");
        }
        this.registerClient.setUserEmails().AFKeystoreWrapper();
        this.AFLogger.invoke();
    }
}
