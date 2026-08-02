package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleDebugSettings.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "", SentryEvent.JsonKeys.LOGGER, "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "debugSettings", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HandleDebugSettings {
    private final Logger logger;

    public HandleDebugSettings(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        Intrinsics.checkNotNullParameter(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevelInternal.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
