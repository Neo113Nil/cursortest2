package ru.ozon.app.android.initializers.abtool;

import Fl.c;
import Fl.d;
import Fl.e;
import Lm0.a;
import Oy.C3715a;
import Pc.a;
import android.annotation.SuppressLint;
import gk0.q;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CacheErrorInterceptor;
import ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor;
import ru.ozon.app.android.composer.network.redirect.flags.RedirectsLimitCountFeatureFlag;
import ru.ozon.app.android.initializers.abtool.AbToolActionInitializer;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.app.android.initializers.startup.time.StartupTimeTrackerInitializer;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.network.flags.ApiSubdomainFlag;
import ru.ozon.app.android.network.flags.IsOzonEmployeeFlag;
import ru.ozon.app.android.network.flags.IsOzonQaFlag;
import ru.ozon.app.android.network.flags.LogNonFatalToSentryFeatureFlag;
import ru.ozon.app.android.network.flags.PreCreationClientViewPoolFlag;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/initializers/abtool/AbToolActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/network/abtool/FeatureService;", "abToolService", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "dynamicUrlInterceptor", "LPc/a;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManagerProvider", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "restrictRedirectsNetworkInterceptorProvider", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "cacheErrorInterceptorProvider", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/storage/user/UserStatusStorage;Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;LPc/a;LPc/a;LPc/a;)V", "", "init", "()V", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "LPc/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolActionInitializer implements ActionInitializer {

    @NotNull
    private final FeatureService abToolService;

    @NotNull
    private final a<AddressUpdateManager> addressUpdateManagerProvider;

    @NotNull
    private final a<CacheErrorInterceptor> cacheErrorInterceptorProvider;

    @NotNull
    private final DebugToolsService debugToolsService;

    @NotNull
    private final DynamicUrlInterceptor dynamicUrlInterceptor;

    @NotNull
    private final a<RestrictRedirectsNetworkInterceptor> restrictRedirectsNetworkInterceptorProvider;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public AbToolActionInitializer(@NotNull FeatureService abToolService, @NotNull DebugToolsService debugToolsService, @NotNull UserStatusStorage userStatusStorage, @NotNull DynamicUrlInterceptor dynamicUrlInterceptor, @NotNull a<AddressUpdateManager> addressUpdateManagerProvider, @NotNull a<RestrictRedirectsNetworkInterceptor> restrictRedirectsNetworkInterceptorProvider, @NotNull a<CacheErrorInterceptor> cacheErrorInterceptorProvider) {
        Intrinsics.checkNotNullParameter(abToolService, "abToolService");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        Intrinsics.checkNotNullParameter(dynamicUrlInterceptor, "dynamicUrlInterceptor");
        Intrinsics.checkNotNullParameter(addressUpdateManagerProvider, "addressUpdateManagerProvider");
        Intrinsics.checkNotNullParameter(restrictRedirectsNetworkInterceptorProvider, "restrictRedirectsNetworkInterceptorProvider");
        Intrinsics.checkNotNullParameter(cacheErrorInterceptorProvider, "cacheErrorInterceptorProvider");
        this.abToolService = abToolService;
        this.debugToolsService = debugToolsService;
        this.userStatusStorage = userStatusStorage;
        this.dynamicUrlInterceptor = dynamicUrlInterceptor;
        this.addressUpdateManagerProvider = addressUpdateManagerProvider;
        this.restrictRedirectsNetworkInterceptorProvider = restrictRedirectsNetworkInterceptorProvider;
        this.cacheErrorInterceptorProvider = cacheErrorInterceptorProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(AbToolActionInitializer abToolActionInitializer) {
        BxLogger.INSTANCE.setLogToSentry(abToolActionInitializer.abToolService.getBooleanKey(LogNonFatalToSentryFeatureFlag.INSTANCE));
        q qVar = q.f64554a;
        qVar.l();
        qVar.j(abToolActionInitializer.abToolService.getBooleanKey(PreCreationClientViewPoolFlag.INSTANCE));
        abToolActionInitializer.dynamicUrlInterceptor.setHostPrefix(abToolActionInitializer.abToolService.getStringKey(ApiSubdomainFlag.INSTANCE));
        abToolActionInitializer.userStatusStorage.setOzonEmployee(abToolActionInitializer.abToolService.getBooleanKey(IsOzonEmployeeFlag.INSTANCE));
        abToolActionInitializer.userStatusStorage.setOzonQa(abToolActionInitializer.abToolService.getBooleanKey(IsOzonQaFlag.INSTANCE));
        AtomActionInitializer.INSTANCE.updateFeatures(abToolActionInitializer.abToolService);
        abToolActionInitializer.restrictRedirectsNetworkInterceptorProvider.get().setRedirectsLimitCount(abToolActionInitializer.abToolService.getIntKey(RedirectsLimitCountFeatureFlag.INSTANCE));
        abToolActionInitializer.cacheErrorInterceptorProvider.get().onFeatureFlagsChanged(abToolActionInitializer.abToolService);
        StartupTimeTrackerInitializer.INSTANCE.updateConfiguration$main_prodGoogleAllVendorsRelease(abToolActionInitializer.abToolService);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        p<Boolean> onAbVariantSaved = this.debugToolsService.onAbVariantSaved();
        c cVar = new c(new AbToolActionInitializer$init$1(this), 1);
        a.b bVar = Lm0.a.f17149a;
        onAbVariantSaved.subscribe(cVar, new d(new AbToolActionInitializer$init$2(bVar), 1));
        this.addressUpdateManagerProvider.get().observeAddressChange().subscribe(new e(new AbToolActionInitializer$init$3(this), 1), new C3715a(new AbToolActionInitializer$init$4(bVar)));
        this.abToolService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: Oy.b
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                AbToolActionInitializer.init$lambda$4(AbToolActionInitializer.this);
            }
        });
    }
}
