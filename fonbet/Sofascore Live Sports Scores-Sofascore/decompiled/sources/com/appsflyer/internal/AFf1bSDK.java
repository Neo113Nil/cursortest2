package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFf1bSDK {
    void AFKeystoreWrapper(@NotNull AFh1zSDK aFh1zSDK);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK);

    void AFLogger(@NotNull AFh1zSDK aFh1zSDK);

    void d(@NotNull AFh1zSDK aFh1zSDK);

    void d(@NotNull Map<String, Object> map);

    void registerClient(@NotNull AFh1zSDK aFh1zSDK);

    void registerClient(@NotNull Map<String, Object> map);

    void registerClient(@NotNull Map<String, Object> map, int i, int i2);

    long unregisterClient();

    void unregisterClient(@NotNull AFh1zSDK aFh1zSDK);

    void unregisterClient(@NotNull Map<String, Object> map);
}
