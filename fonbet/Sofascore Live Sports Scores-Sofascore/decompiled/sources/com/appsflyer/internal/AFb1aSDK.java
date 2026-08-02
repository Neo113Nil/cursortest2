package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1gSDK;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1aSDK implements AFb1gSDK {

    @NotNull
    private final ScheduledExecutorService AFKeystoreWrapper;

    @NotNull
    private final AFa1mSDK AFLogger;

    @Nullable
    private AFb1bSDK registerClient;

    public AFb1aSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1mSDK aFa1mSDK) {
        scheduledExecutorService.getClass();
        aFa1mSDK.getClass();
        this.AFKeystoreWrapper = scheduledExecutorService;
        this.AFLogger = aFa1mSDK;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void unregisterClient(@NotNull Context context, @NotNull AFb1gSDK.AFa1tSDK aFa1tSDK) {
        context.getClass();
        aFa1tSDK.getClass();
        context.getClass();
        if (this.registerClient != null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.registerClient);
        }
        this.registerClient = null;
        AFb1bSDK aFb1bSDK = new AFb1bSDK(this.AFKeystoreWrapper, aFa1tSDK, this.AFLogger);
        this.registerClient = aFb1bSDK;
        if (context instanceof Activity) {
            aFb1bSDK.onActivityResumed((Activity) context);
        }
        Application T_ = AFi1cSDK.T_(context);
        if (T_ != null) {
            T_.registerActivityLifecycleCallbacks(this.registerClient);
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void unregisterClient() {
        AFb1gSDK.AFa1tSDK aFa1tSDK;
        AFb1bSDK aFb1bSDK = this.registerClient;
        if (aFb1bSDK == null || (aFa1tSDK = aFb1bSDK.AFKeystoreWrapper) == null) {
            return;
        }
        aFa1tSDK.unregisterClient();
    }
}
