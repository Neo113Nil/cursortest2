package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public static final C0311a b = new C0311a(null);
    public static final int c = 8;
    public static final String d = "TemplateJavascript";
    public final e a;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C0311a {
        public /* synthetic */ C0311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0311a() {
        }
    }

    public a(e eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.a = eventHandler;
    }

    @JavascriptInterface
    public final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.a(event);
    }

    @JavascriptInterface
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
