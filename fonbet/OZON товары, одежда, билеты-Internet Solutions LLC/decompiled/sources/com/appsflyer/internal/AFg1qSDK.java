package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFg1qSDK {
    Long AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull Map<String, Object> map);

    void AFInAppEventParameterName(@NotNull Map<String, Object> map, int i11, int i12);

    void AFInAppEventType(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z11, @NotNull Function0<String> function0);

    void valueOf(@NotNull AFa1pSDK aFa1pSDK);

    void valueOf(@NotNull Map<String, Object> map);

    long values();

    void values(@NotNull AFa1pSDK aFa1pSDK);
}
