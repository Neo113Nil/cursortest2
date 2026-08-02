package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1zSDK<T> {

    @NotNull
    public final Function0<T> unregisterClient;

    /* JADX WARN: Multi-variable type inference failed */
    public AFd1zSDK(@NotNull Function0<? extends T> function0) {
        function0.getClass();
        this.unregisterClient = function0;
    }
}
