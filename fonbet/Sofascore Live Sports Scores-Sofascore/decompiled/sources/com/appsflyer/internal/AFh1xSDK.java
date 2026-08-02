package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1xSDK extends AFh1zSDK {

    @Nullable
    public final AFe1zSDK AFLoggerLogLevel;

    public AFh1xSDK(String str, byte[] bArr, String str2, @Nullable AFe1zSDK aFe1zSDK, @Nullable Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.e = str2;
        this.force = bArr;
        this.AFLoggerLogLevel = aFe1zSDK;
        if (map != null) {
            this.registerClient.putAll(map);
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final AFe1zSDK d() {
        AFe1zSDK aFe1zSDK = this.AFLoggerLogLevel;
        return aFe1zSDK != null ? aFe1zSDK : AFd1aSDK.AFLogger;
    }

    @Deprecated
    public AFh1xSDK() {
        this.AFLoggerLogLevel = null;
    }
}
