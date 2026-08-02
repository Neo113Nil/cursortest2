package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class RootTelemetryConfigManager {
    public static RootTelemetryConfigManager b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration a;

    private RootTelemetryConfigManager() {
    }

    public static synchronized RootTelemetryConfigManager a() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            rootTelemetryConfigManager = b;
            if (rootTelemetryConfigManager == null) {
                rootTelemetryConfigManager = new RootTelemetryConfigManager();
                b = rootTelemetryConfigManager;
            }
        }
        return rootTelemetryConfigManager;
    }
}
