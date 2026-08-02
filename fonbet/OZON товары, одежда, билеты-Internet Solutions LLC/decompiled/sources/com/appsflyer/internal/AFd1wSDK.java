package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class AFd1wSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final ScheduledExecutorService AFInAppEventParameterName;

    @NotNull
    private final Executor AFInAppEventType;

    @NotNull
    private final AFi1ySDK AFKeystoreWrapper;
    private boolean AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57395d;

    @NotNull
    private final AFc1uSDK valueOf;

    @NotNull
    final AFd1xSDK.AFa1vSDK values;

    public AFd1wSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1uSDK aFc1uSDK, @NotNull AFi1ySDK aFi1ySDK, @NotNull AFd1xSDK.AFa1vSDK aFa1vSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1uSDK, "");
        Intrinsics.checkNotNullParameter(aFi1ySDK, "");
        Intrinsics.checkNotNullParameter(aFa1vSDK, "");
        this.AFInAppEventType = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.valueOf = aFc1uSDK;
        this.AFKeystoreWrapper = aFi1ySDK;
        this.values = aFa1vSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(final AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.f57395d = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1wSDK.AFInAppEventParameterName;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.values(AFd1wSDK.this);
                }
            };
            AFd1xSDK.Companion companion = AFd1xSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1xSDK.Companion.AFKeystoreWrapper(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFd1wSDK aFd1wSDK, AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        if (!aFd1wSDK.AFLogger) {
            try {
                aFd1wSDK.values.AFKeystoreWrapper(aFh1uSDK);
            } catch (Exception e11) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e11, true);
            }
        }
        aFd1wSDK.f57395d = false;
        aFd1wSDK.AFLogger = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        if (aFd1wSDK.AFLogger && aFd1wSDK.f57395d) {
            aFd1wSDK.AFLogger = false;
            try {
                aFd1wSDK.values.valueOf();
            } catch (Exception e11) {
                AFLogger.afErrorLog("Listener threw exception! ", e11);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1uSDK aFc1uSDK = this.valueOf;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1uSDK.valueOf) {
            aFc1uSDK.valueOf = intent;
        }
        this.AFKeystoreWrapper.AFKeystoreWrapper(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.AFKeystoreWrapper(AFd1wSDK.this);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1uSDK aFh1uSDK = new AFh1uSDK(activity, this.AFKeystoreWrapper);
        this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.valueOf(AFd1wSDK.this, aFh1uSDK);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
