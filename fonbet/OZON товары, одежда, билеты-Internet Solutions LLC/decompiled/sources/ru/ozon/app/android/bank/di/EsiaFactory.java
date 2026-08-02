package ru.ozon.app.android.bank.di;

import Fb0.e;
import U7.d;
import android.app.Activity;
import b40.InterfaceC5539a;
import c40.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.fintech.esia.api.EsiaLoginData;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/bank/di/EsiaFactory;", "", "<init>", "()V", "", "isSelect", "", "getCorrectPath", "(Z)Ljava/lang/String;", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "fintechUrls", "Lb40/a;", "createInstance", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/storage/hosts/FintechUrls;)Lb40/a;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EsiaFactory {

    @NotNull
    public static final EsiaFactory INSTANCE = new EsiaFactory();

    private EsiaFactory() {
    }

    private final String getCorrectPath(boolean isSelect) {
        return isSelect ? "/fintech/esia-links/return-select" : "/fintech/esia-links/return-ozon";
    }

    @NotNull
    public final InterfaceC5539a createInstance(@NotNull AppVersionService appVersionService, @NotNull EnvironmentService environmentService, @NotNull FintechUrls fintechUrls) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(fintechUrls, "fintechUrls");
        AppVersionService.Companion companion = AppVersionService.INSTANCE;
        if (companion.isFresh(appVersionService) || companion.isTravel(appVersionService)) {
            return new InterfaceC5539a() { // from class: ru.ozon.app.android.bank.di.EsiaFactory$createInstance$1
                @Override // b40.InterfaceC5539a
                public boolean isAvailable() {
                    return false;
                }

                @Override // b40.InterfaceC5539a
                public void login(Activity activity, EsiaLoginData data) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(data, "data");
                }
            };
        }
        boolean isSelect = companion.isSelect(appVersionService);
        return new b(d.e(isSelect ? fintechUrls.getEsiaSelectRedirectUrl() : environmentService.isStage() ? e.OZONRU_ME.i() : e.OZON_RU.i(), getCorrectPath(isSelect)));
    }
}
