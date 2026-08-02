package ru.ozon.android.messenger.framework.core.initialization;

import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;

/* loaded from: classes6.dex */
public interface a {
    @NotNull
    String getAppName();

    @NotNull
    DeviceType getDeviceType();

    @NotNull
    String getVersionCode();

    @NotNull
    String getVersionName();
}
