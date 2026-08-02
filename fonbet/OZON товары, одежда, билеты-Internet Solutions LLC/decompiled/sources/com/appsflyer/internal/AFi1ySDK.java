package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFi1ySDK {
    String AFInAppEventParameterName(Activity activity);

    @NotNull
    String AFInAppEventType(Activity activity);

    void AFKeystoreWrapper(@NotNull Activity activity);
}
