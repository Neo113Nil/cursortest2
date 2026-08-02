package ru.ozon.app.android.bank.di;

import b40.InterfaceC5539a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/bank/di/FintechEsiaModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "fintechUrls", "Lb40/a;", "provideEsia", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/storage/hosts/FintechUrls;)Lb40/a;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechEsiaModule {
    @NotNull
    public final InterfaceC5539a provideEsia(@NotNull AppVersionService appVersionService, @NotNull EnvironmentService environmentService, @NotNull FintechUrls fintechUrls) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(fintechUrls, "fintechUrls");
        return EsiaFactory.INSTANCE.createInstance(appVersionService, environmentService, fintechUrls);
    }
}
