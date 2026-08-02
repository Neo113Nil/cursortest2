package ru.ozon.fintech.features.camera.di;

import P30.b;
import Y20.a;
import f40.InterfaceC6422b;
import kotlin.Metadata;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/camera/di/CameraComponent;", "Lru/ozon/fintech/features/camera/di/CameraApi;", "inject", "", "cameraFragment", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment;", "qrScannerResultBottomSheet", "Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultBottomSheet;", "provideExternalFintechSettings", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "Factory", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CameraComponent extends CameraApi {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J_\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/camera/di/CameraComponent$Factory;", "", "LY20/a;", "analyticApi", "LZ80/a;", "fintechNetworkApi", "LP30/b;", "fintechAppApi", "LM80/a;", "fintechNavigationApi", "Lf40/b;", "exchangerApi", "LO90/a;", "settingsApi", "Ln90/a;", "permissionsManagerApi", "LI40/a;", "cbottomDisplayApi", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "Lru/ozon/fintech/features/camera/di/CameraComponent;", "create", "(LY20/a;LZ80/a;LP30/b;LM80/a;Lf40/b;LO90/a;Ln90/a;LI40/a;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;)Lru/ozon/fintech/features/camera/di/CameraComponent;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CameraComponent create(@NotNull a analyticApi, @NotNull Z80.a fintechNetworkApi, @NotNull b fintechAppApi, @NotNull M80.a fintechNavigationApi, @NotNull InterfaceC6422b exchangerApi, @NotNull O90.a settingsApi, @NotNull InterfaceC8456a permissionsManagerApi, @NotNull I40.a cbottomDisplayApi, @NotNull CameraScannerFactory cameraScannerFactory, @NotNull ExternalFintechSettings externalFintechSettings);
    }

    void inject(@NotNull CameraFragment cameraFragment);

    void inject(@NotNull QrScannerResultBottomSheet qrScannerResultBottomSheet);

    @NotNull
    ExternalFintechSettings provideExternalFintechSettings();
}
