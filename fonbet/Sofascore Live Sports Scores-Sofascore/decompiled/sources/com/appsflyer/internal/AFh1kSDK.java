package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1kSDK {
    public final long AFKeystoreWrapper;
    public final long AFLogger;

    @NonNull
    public final String d;

    @Nullable
    public final AFh1nSDK force;

    @Nullable
    public final Throwable i;
    public final int registerClient;

    @Nullable
    public final String unregisterClient;

    @Nullable
    public final String w;

    public AFh1kSDK(@Nullable String str, @NonNull String str2, long j, long j2, int i, @Nullable AFh1nSDK aFh1nSDK, @Nullable String str3, Throwable th) {
        this.unregisterClient = str;
        this.d = str2;
        this.AFLogger = j;
        this.AFKeystoreWrapper = j2;
        this.registerClient = i;
        this.force = aFh1nSDK;
        this.w = str3;
        this.i = th;
    }
}
