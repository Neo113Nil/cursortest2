package ru.ozon.app.android.initializers.logger;

import De.C2862e;
import He.b;
import Ob0.a;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.environment.OnEnvironmentChangeListener;
import sj.c;
import xe.C10720e0;
import xe.C10727i;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/initializers/logger/OzonLoggerInitializer;", "", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoStorage", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "cookieEvents", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/storage/environment/EnvironmentService;LOb0/a;)V", "Lsj/c;", "", "isProd", "", "setEnv", "(Lsj/c;Z)V", "config", "init", "(Lsj/c;)V", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "LOb0/a;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonLoggerInitializer {

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final ApplicationInfoDataSource applicationInfoStorage;

    @NotNull
    private final OzonIdCookieEvents cookieEvents;

    @NotNull
    private final EnvironmentService environmentService;

    @NotNull
    private final a ozonIdAppApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/logger/OzonLoggerInitializer$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "authToken", "Lsj/c;", "createConfig", "(Landroid/app/Application;Ljava/lang/String;)Lsj/c;", "OZON_LOGGER_SERVICE_NAME", "Ljava/lang/String;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c createConfig(@NotNull Application application, @NotNull String authToken) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(authToken, "authToken");
            return new c(application, authToken, "buyer_experience");
        }

        private Companion() {
        }
    }

    public OzonLoggerInitializer(@NotNull ApplicationInfoDataSource applicationInfoStorage, @NotNull OzonIdCookieEvents cookieEvents, @NotNull AppVersionStorage appVersionStorage, @NotNull EnvironmentService environmentService, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(applicationInfoStorage, "applicationInfoStorage");
        Intrinsics.checkNotNullParameter(cookieEvents, "cookieEvents");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.applicationInfoStorage = applicationInfoStorage;
        this.cookieEvents = cookieEvents;
        this.appVersionStorage = appVersionStorage;
        this.environmentService = environmentService;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEnv(c cVar, boolean z11) {
        cVar.q(z11 ? "prod" : "stg");
    }

    public final void init(@NotNull final c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.x(this.applicationInfoStorage.getUniqueApplicationId());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(b.f10879b.plus(X0.b()));
        C10727i.c(a11, null, null, new OzonLoggerInitializer$init$1(config, this, null), 3);
        C10727i.c(a11, null, null, new OzonLoggerInitializer$init$2(this, config, null), 3);
        this.environmentService.addOnEnvironmentChangeListener(new OnEnvironmentChangeListener() { // from class: Uy.b
            @Override // ru.ozon.app.android.storage.environment.OnEnvironmentChangeListener
            public final void onChanged(boolean z11) {
                this.setEnv(config, z11);
            }
        });
        setEnv(config, this.environmentService.isProd());
        config.n(this.appVersionStorage.getVersionName());
        config.p(false);
    }
}
