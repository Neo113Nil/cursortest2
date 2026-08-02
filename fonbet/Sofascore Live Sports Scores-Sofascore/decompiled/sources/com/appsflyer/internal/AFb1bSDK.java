package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class AFb1bSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    final AFb1gSDK.AFa1tSDK AFKeystoreWrapper;

    @Nullable
    private ScheduledFuture<?> AFLogger;
    private volatile boolean d;

    @NotNull
    private final ScheduledExecutorService registerClient;

    @NotNull
    private final AFa1mSDK unregisterClient;

    @NotNull
    private final Runnable w;

    public AFb1bSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFb1gSDK.AFa1tSDK aFa1tSDK, @NotNull AFa1mSDK aFa1mSDK) {
        scheduledExecutorService.getClass();
        aFa1tSDK.getClass();
        aFa1mSDK.getClass();
        this.registerClient = scheduledExecutorService;
        this.AFKeystoreWrapper = aFa1tSDK;
        this.unregisterClient = aFa1mSDK;
        this.w = new h(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i_(AFb1bSDK aFb1bSDK, Intent intent) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            AFb1gSDK.AFa1tSDK aFa1tSDK = aFb1bSDK.AFKeystoreWrapper;
            intent.getClass();
            aFa1tSDK.m_(intent);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", a, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j_(AFb1bSDK aFb1bSDK, Intent intent) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            AFb1gSDK.AFa1tSDK aFa1tSDK = aFb1bSDK.AFKeystoreWrapper;
            intent.getClass();
            aFa1tSDK.n_(intent);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", a, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFb1bSDK aFb1bSDK) {
        Object u2gVar;
        aFb1bSDK.d = false;
        try {
            p2g p2gVar = w2g.b;
            aFb1bSDK.AFKeystoreWrapper.unregisterClient();
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", a, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        activity.getClass();
        if (this.d) {
            return;
        }
        Intent intent = activity.getIntent();
        if (this.unregisterClient.e_(intent)) {
            this.registerClient.execute(new g(this, intent, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        if (this.d) {
            ScheduledExecutorService scheduledExecutorService = this.registerClient;
            Runnable runnable = this.w;
            AFb1gSDK.Companion companion = AFb1gSDK.INSTANCE;
            this.AFLogger = scheduledExecutorService.schedule(runnable, AFb1gSDK.Companion.AFKeystoreWrapper(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        if (!this.d) {
            this.d = true;
            this.registerClient.execute(new g(this, activity.getIntent(), 0));
        } else {
            ScheduledFuture<?> scheduledFuture = this.AFLogger;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
    }
}
