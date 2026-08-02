package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFd1lSDK {

    @Nullable
    public final byte[] AFKeystoreWrapper;

    @NonNull
    public final Map<String, String> AFLogger;
    final boolean d;
    final boolean e;
    boolean force;
    public boolean i;

    @NonNull
    public final String registerClient;

    @NonNull
    final String unregisterClient;
    public int v;
    public boolean w;

    private AFd1lSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z, byte b) {
        this.force = true;
        this.i = false;
        this.w = true;
        this.v = -1;
        this.registerClient = str;
        this.AFKeystoreWrapper = bArr;
        this.unregisterClient = str2;
        this.AFLogger = map;
        this.d = z;
        this.e = true;
    }

    public AFd1lSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    public AFd1lSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
