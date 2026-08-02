package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFe1xSDK {
    void AFKeystoreWrapper(@NonNull AFe1vSDK<?> aFe1vSDK);

    void AFLogger(@NonNull AFe1vSDK<?> aFe1vSDK, @NonNull AFd1bSDK aFd1bSDK);

    void registerClient(@NonNull AFe1vSDK<?> aFe1vSDK);

    void unregisterClient(@NonNull AFe1vSDK<?> aFe1vSDK);
}
