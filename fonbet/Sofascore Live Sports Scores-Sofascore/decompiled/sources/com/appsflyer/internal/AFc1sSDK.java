package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFc1sSDK {
    @Nullable
    String AFLogger(@NotNull AFc1vSDK aFc1vSDK);

    void d();

    void registerClient();

    boolean registerClient(@Nullable String str);

    @NotNull
    List<AFc1vSDK> unregisterClient();
}
