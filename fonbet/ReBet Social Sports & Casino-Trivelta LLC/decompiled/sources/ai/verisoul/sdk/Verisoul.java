package ai.verisoul.sdk;

import ai.verisoul.sdk.di.DependencyKt;
import ai.verisoul.sdk.helpers.sensor.TouchEventValidator;
import ai.verisoul.sdk.helpers.webview.DefaultWebViewFactory;
import ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback;
import ai.verisoul.sdk.helpers.webview.WebViewFactory;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ(\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012J2\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lai/verisoul/sdk/Verisoul;", "", "()V", "initializationTimestamp", "", "tag", "", "getSessionId", "", "callback", "Lai/verisoul/sdk/helpers/webview/VerisoulSessionCallback;", "init", "context", "Landroid/content/Context;", "env", "Lai/verisoul/sdk/VerisoulEnvironment;", "projectId", "enableLogs", "", "initWithFactory", "webViewFactory", "Lai/verisoul/sdk/helpers/webview/WebViewFactory;", "onTouchEvent", "motionEvent", "Landroid/view/MotionEvent;", "reinitialize", "shutdown", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Verisoul {

    @NotNull
    public static final Verisoul INSTANCE;
    private static long initializationTimestamp;

    @NotNull
    private static final String tag;

    static {
        Verisoul verisoul = new Verisoul();
        INSTANCE = verisoul;
        tag = "[" + verisoul.getClass().getSimpleName() + "]";
    }

    private Verisoul() {
    }

    public static /* synthetic */ void init$default(Verisoul verisoul, Context context, VerisoulEnvironment verisoulEnvironment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        verisoul.init(context, verisoulEnvironment, str, z10);
    }

    public static /* synthetic */ void initWithFactory$default(Verisoul verisoul, Context context, VerisoulEnvironment verisoulEnvironment, String str, boolean z10, WebViewFactory webViewFactory, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        verisoul.initWithFactory(context, verisoulEnvironment, str, z10, webViewFactory);
    }

    public final void getSessionId(@NotNull VerisoulSessionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Core.INSTANCE.getSessionId(callback);
        } catch (Throwable th2) {
            callback.onFailure(th2);
        }
    }

    public final void init(@NotNull Context context, @NotNull VerisoulEnvironment env, @NotNull String projectId, boolean enableLogs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        initWithFactory(context, env, projectId, enableLogs, new DefaultWebViewFactory());
    }

    public final void initWithFactory(@NotNull Context context, @NotNull VerisoulEnvironment env, @NotNull String projectId, boolean enableLogs, @NotNull WebViewFactory webViewFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        initializationTimestamp = System.currentTimeMillis();
        DependencyKt.initializeDependencies(context, env, projectId, webViewFactory);
        Logger.INSTANCE.init(env, projectId, enableLogs);
        try {
            Core.INSTANCE.init(context, env, projectId);
        } catch (Throwable th2) {
            Logger.INSTANCE.error(tag, "Failed to init: " + th2.getMessage());
        }
    }

    public final void onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        try {
            if (!TouchEventValidator.INSTANCE.isValidBasic(motionEvent)) {
                Logger.INSTANCE.error(tag, "Invalid MotionEvent received, skipping");
                return;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            try {
                Core.INSTANCE.onTouchEvent(obtain);
            } catch (Throwable th2) {
                try {
                    Logger.INSTANCE.error(tag, "Failed to process touch event: " + th2.getMessage());
                    obtain.recycle();
                } finally {
                    obtain.recycle();
                }
            }
        } catch (Throwable th3) {
            Logger.INSTANCE.error(tag, "Failed to handle touch event: " + th3.getMessage());
        }
    }

    public final void reinitialize() {
        try {
            Core.INSTANCE.reinitialize();
        } catch (Throwable th2) {
            Logger.INSTANCE.error(tag, "Failed to reinitialize: " + th2.getMessage());
        }
    }

    public final void shutdown() {
        try {
            Core.INSTANCE.shutdown();
            Logger.INSTANCE.info(tag, "Verisoul SDK shutdown completed");
        } catch (Throwable th2) {
            Logger.INSTANCE.error(tag, "Failed to shutdown: " + th2.getMessage());
        }
    }
}
