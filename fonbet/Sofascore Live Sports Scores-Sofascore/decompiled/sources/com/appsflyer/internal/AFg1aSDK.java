package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFg1aSDK {
    void AFKeystoreWrapper();

    void AFLogger(@NotNull AFh1zSDK aFh1zSDK);

    boolean d();

    void registerClient();

    void registerClient(@NotNull AFf1wSDK aFf1wSDK, @NotNull Function0<Unit> function0);

    void registerClient(@NotNull AFh1zSDK aFh1zSDK);

    void unregisterClient(@NotNull AFh1zSDK aFh1zSDK);

    boolean unregisterClient();

    void z_(@NotNull Intent intent, @NotNull AFa1mSDK aFa1mSDK);
}
