package ru.ozon.fintech.features.camera.di.module;

import R30.a;
import We.E;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f3.AbstractC6409a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.features.camera.network.CameraNetwork;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultViewModel;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/fintech/features/camera/di/module/CameraModule;", "", "<init>", "()V", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel;", "cameraViewModel", "Landroidx/lifecycle/w0;", "provideCameraViewModel", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel;)Landroidx/lifecycle/w0;", "Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultViewModel;", "qrScannerResultViewModel", "provideQrScannerResultViewModel", "(Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultViewModel;)Landroidx/lifecycle/w0;", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CameraModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2 \u0010\b\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/camera/di/module/CameraModule$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Landroidx/lifecycle/w0;", "LPc/a;", "creators", "Landroidx/lifecycle/z0$b;", "provideViewModelFactory", "(Ljava/util/Map;)Landroidx/lifecycle/z0$b;", "Lru/ozon/fintech/settings/domain/a;", "fintechSettings", "LWe/E;", "okHttpClient", "Lru/ozon/fintech/features/camera/network/CameraNetwork;", "provideCameraNetwork", "(Lru/ozon/fintech/settings/domain/a;LWe/E;)Lru/ozon/fintech/features/camera/network/CameraNetwork;", "Ld40/a;", "exchanger", "cameraNetwork", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "LR30/a;", "appCoroutineScopes", "Lru/ozon/fintech/features/camera/domain/CameraInteractor;", "provideCameraInteractor", "(Ld40/a;Lru/ozon/fintech/features/camera/network/CameraNetwork;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;LR30/a;)Lru/ozon/fintech/features/camera/domain/CameraInteractor;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CameraInteractor provideCameraInteractor(@NotNull InterfaceC6083a exchanger, @NotNull CameraNetwork cameraNetwork, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull a appCoroutineScopes) {
            Intrinsics.checkNotNullParameter(exchanger, "exchanger");
            Intrinsics.checkNotNullParameter(cameraNetwork, "cameraNetwork");
            Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
            Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
            return new CameraInteractor(exchanger, cameraNetwork, externalFintechSettings, appCoroutineScopes);
        }

        @NotNull
        public final CameraNetwork provideCameraNetwork(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull E okHttpClient) {
            Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return CameraNetwork.INSTANCE.create(fintechSettings.e(), okHttpClient);
        }

        @NotNull
        public final z0.b provideViewModelFactory(@NotNull final Map<Class<? extends w0>, Pc.a<w0>> creators) {
            Intrinsics.checkNotNullParameter(creators, "creators");
            return new V30.a(creators) { // from class: ru.ozon.fintech.features.camera.di.module.CameraModule$Companion$provideViewModelFactory$1
                @Override // androidx.lifecycle.z0.b
                @NotNull
                public /* bridge */ /* synthetic */ w0 create(@NotNull Class cls, @NotNull AbstractC6409a abstractC6409a) {
                    return super.create(cls, abstractC6409a);
                }

                @Override // androidx.lifecycle.z0.b
                @NotNull
                public /* bridge */ /* synthetic */ w0 create(@NotNull d dVar, @NotNull AbstractC6409a abstractC6409a) {
                    return super.create(dVar, abstractC6409a);
                }
            };
        }

        private Companion() {
        }
    }

    @NotNull
    public static final CameraInteractor provideCameraInteractor(@NotNull InterfaceC6083a interfaceC6083a, @NotNull CameraNetwork cameraNetwork, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull a aVar) {
        return INSTANCE.provideCameraInteractor(interfaceC6083a, cameraNetwork, externalFintechSettings, aVar);
    }

    @NotNull
    public static final CameraNetwork provideCameraNetwork(@NotNull ru.ozon.fintech.settings.domain.a aVar, @NotNull E e11) {
        return INSTANCE.provideCameraNetwork(aVar, e11);
    }

    @NotNull
    public static final z0.b provideViewModelFactory(@NotNull Map<Class<? extends w0>, Pc.a<w0>> map) {
        return INSTANCE.provideViewModelFactory(map);
    }

    @NotNull
    public abstract w0 provideCameraViewModel(@NotNull CameraViewModel cameraViewModel);

    @NotNull
    public abstract w0 provideQrScannerResultViewModel(@NotNull QrScannerResultViewModel qrScannerResultViewModel);
}
