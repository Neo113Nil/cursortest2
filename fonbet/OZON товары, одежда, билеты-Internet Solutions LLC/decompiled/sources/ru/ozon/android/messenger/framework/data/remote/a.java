package ru.ozon.android.messenger.framework.data.remote;

import V.e;
import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;

/* loaded from: classes10.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f87654a;

    public a(@NotNull DeviceInfoManager deviceInfoManager) {
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        this.f87654a = deviceInfoManager;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.a("x-o3-sdk-versions", e.b(new Object[]{"14.5.0"}, 1, "messenger_android/%s", "format(...)"));
        DeviceInfoManager deviceInfoManager = this.f87654a;
        aVar2.a("x-o3-os-version", deviceInfoManager.getOsVersion());
        aVar2.a("x-o3-phone", deviceInfoManager.getFullDeviceName());
        return aVar.proceed(aVar2.b());
    }
}
