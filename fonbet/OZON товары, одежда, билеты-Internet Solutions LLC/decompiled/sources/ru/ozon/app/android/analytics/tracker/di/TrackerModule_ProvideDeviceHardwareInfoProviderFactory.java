package ru.ozon.app.android.analytics.tracker.di;

import Jb.e;
import Jb.j;
import ei0.InterfaceC6369b;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;

/* loaded from: classes6.dex */
public final class TrackerModule_ProvideDeviceHardwareInfoProviderFactory implements e<DeviceHardwareInfoProvider> {
    public static DeviceHardwareInfoProvider provideDeviceHardwareInfoProvider(TrackerModule trackerModule, InterfaceC6369b interfaceC6369b) {
        DeviceHardwareInfoProvider provideDeviceHardwareInfoProvider = trackerModule.provideDeviceHardwareInfoProvider(interfaceC6369b);
        j.d(provideDeviceHardwareInfoProvider);
        return provideDeviceHardwareInfoProvider;
    }
}
