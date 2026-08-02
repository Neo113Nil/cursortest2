package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1oSDK {

    @NonNull
    final String AFInAppEventParameterName;
    public boolean AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private boolean AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f57403d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f57404e;
    private final boolean registerClient;
    public int unregisterClient;

    @NonNull
    public final String valueOf;

    @NonNull
    final Map<String, String> values;

    public AFe1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z11) {
        this(str, bArr, str2, map, z11, (byte) 0);
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFInAppEventType() {
        return this.f57403d;
    }

    public final boolean AFKeystoreWrapper() {
        return this.registerClient;
    }

    public final boolean unregisterClient() {
        return this.AFInAppEventType;
    }

    public final boolean valueOf() {
        return this.AFLogger;
    }

    public final byte[] values() {
        return this.f57404e;
    }

    private AFe1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z11, byte b11) {
        this.AFLogger = true;
        this.AFKeystoreWrapper = false;
        this.AFInAppEventType = true;
        this.unregisterClient = -1;
        this.valueOf = str;
        this.f57404e = bArr;
        this.AFInAppEventParameterName = str2;
        this.values = map;
        this.f57403d = z11;
        this.registerClient = true;
    }

    public AFe1oSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
