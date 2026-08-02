package ru.ozon.fintech.features.camera.di.factory;

import Y30.a;
import Y30.b;
import f40.InterfaceC6422b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.di.CameraApi;
import ru.ozon.fintech.features.camera.di.CameraComponent;
import ru.ozon.fintech.features.camera.di.DaggerCameraComponent;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/fintech/features/camera/di/factory/CameraApiComponentFactory;", "LY30/a;", "Lru/ozon/fintech/features/camera/di/CameraApi;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "<init>", "(Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;)V", "LY30/b;", "componentStorage", "create", "(LY30/b;)Lru/ozon/fintech/features/camera/di/CameraApi;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraApiComponentFactory implements a<CameraApi> {

    @NotNull
    private final CameraScannerFactory cameraScannerFactory;

    @NotNull
    private final ExternalFintechSettings externalFintechSettings;

    public CameraApiComponentFactory(@NotNull CameraScannerFactory cameraScannerFactory, @NotNull ExternalFintechSettings externalFintechSettings) {
        Intrinsics.checkNotNullParameter(cameraScannerFactory, "cameraScannerFactory");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        this.cameraScannerFactory = cameraScannerFactory;
        this.externalFintechSettings = externalFintechSettings;
    }

    @Override // Y30.a
    @NotNull
    public CameraApi create(@NotNull b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        CameraComponent.Factory factory = DaggerCameraComponent.factory();
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        return factory.create((Y20.a) componentStorage.a(Y20.a.class), (Z80.a) componentStorage.a(Z80.a.class), bVar, (M80.a) componentStorage.a(M80.a.class), (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class), (O90.a) componentStorage.a(O90.a.class), (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class), (I40.a) componentStorage.a(I40.a.class), this.cameraScannerFactory, this.externalFintechSettings);
    }
}
