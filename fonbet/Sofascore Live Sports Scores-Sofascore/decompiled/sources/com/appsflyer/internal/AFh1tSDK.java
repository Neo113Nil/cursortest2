package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFh1tSDK extends AFh1zSDK {
    private final boolean AFLoggerLogLevel;
    private final boolean afWarnLog;

    public AFh1tSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(null, null, Boolean.FALSE);
        this.afWarnLog = bool != null ? bool.booleanValue() : true;
        this.AFLoggerLogLevel = true;
    }

    public AFh1tSDK() {
        this(null, null, null);
    }
}
