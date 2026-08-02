package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.share.SessionReadyListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFi1hSDK {
    void AFKeystoreWrapper();

    void N_(@NotNull Intent intent);

    void d(@Nullable SessionReadyListener sessionReadyListener);

    boolean d();

    boolean registerClient();

    void unregisterClient();
}
