package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: HandleDebugSettings.kt */
/* loaded from: classes14.dex */
public final class HandleDebugSettings {
    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
