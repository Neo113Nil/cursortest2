package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFh1eSDK {
    public final String AFInAppEventParameterName;
    public final int AFInAppEventType;
    public final long AFKeystoreWrapper;
    public final Throwable AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public final AFh1bSDK f57478d;
    public final String unregisterClient;

    @NonNull
    public final String valueOf;
    public final long values;

    public AFh1eSDK(String str, @NonNull String str2, long j11, long j12, int i11, AFh1bSDK aFh1bSDK, String str3, Throwable th2) {
        this.AFInAppEventParameterName = str;
        this.valueOf = str2;
        this.values = j11;
        this.AFKeystoreWrapper = j12;
        this.AFInAppEventType = i11;
        this.f57478d = aFh1bSDK;
        this.unregisterClient = str3;
        this.AFLogger = th2;
    }
}
