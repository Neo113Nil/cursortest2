package ru.ozon.app.android.update.custom;

import Fb0.e;
import We.B;
import We.InterfaceC4875q;
import android.app.Activity;
import androidx.activity.ActivityC5043j;
import ej.EnumC6378g;
import ej.InterfaceC6374c;
import ej.InterfaceC6376e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.flags.InAppUpdateEnabledFlag;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.update.InAppUpdateInfo;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.InAppUpdateType;
import ru.ozon.app.android.update.gp.GpInAppUpdateRepository;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/update/custom/CustomInAppUpdateRepository;", "Lru/ozon/app/android/update/InAppUpdateRepository;", "Lru/ozon/app/android/update/gp/GpInAppUpdateRepository;", "next", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "inAppUpdateIntervalStorage", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionStorage", "Lej/e;", "ozonInAppUpdateSdkManager", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWe/q;", "cookieJar", "", "LWe/B;", "ozonIdInterceptors", "<init>", "(Lru/ozon/app/android/update/gp/GpInAppUpdateRepository;Lru/ozon/app/android/update/InAppUpdateIntervalStorage;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/network/version/AppVersionService;Lej/e;Lru/ozon/app/android/network/abtool/FeatureChecker;LWe/q;Ljava/util/List;)V", "Lej/c;", "createConfig", "()Lej/c;", "Lru/ozon/app/android/update/InAppUpdateInfo;", "getUpdateState", "()Lru/ozon/app/android/update/InAppUpdateInfo;", "Landroid/app/Activity;", "activity", "info", "", "startUpdate", "(Landroid/app/Activity;Lru/ozon/app/android/update/InAppUpdateInfo;)V", "Lru/ozon/app/android/update/InAppUpdateType;", "type", "completeUpdate", "(Lru/ozon/app/android/update/InAppUpdateType;)V", "", "requestCode", "resultCode", "handleResult", "(II)V", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lej/e;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LWe/q;", "Ljava/util/List;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomInAppUpdateRepository extends InAppUpdateRepository {

    @NotNull
    private final AppVersionService appVersionStorage;

    @NotNull
    private final InterfaceC4875q cookieJar;

    @NotNull
    private final EnvironmentService environmentService;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InAppUpdateIntervalStorage inAppUpdateIntervalStorage;

    @NotNull
    private final List<B> ozonIdInterceptors;

    @NotNull
    private final InterfaceC6376e ozonInAppUpdateSdkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomInAppUpdateRepository(@NotNull GpInAppUpdateRepository next, @NotNull InAppUpdateIntervalStorage inAppUpdateIntervalStorage, @NotNull EnvironmentService environmentService, @NotNull AppVersionService appVersionStorage, @NotNull InterfaceC6376e ozonInAppUpdateSdkManager, @NotNull FeatureChecker featureChecker, @NotNull InterfaceC4875q cookieJar, @NotNull List<B> ozonIdInterceptors) {
        super(next);
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(inAppUpdateIntervalStorage, "inAppUpdateIntervalStorage");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(ozonInAppUpdateSdkManager, "ozonInAppUpdateSdkManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(ozonIdInterceptors, "ozonIdInterceptors");
        this.inAppUpdateIntervalStorage = inAppUpdateIntervalStorage;
        this.environmentService = environmentService;
        this.appVersionStorage = appVersionStorage;
        this.ozonInAppUpdateSdkManager = ozonInAppUpdateSdkManager;
        this.featureChecker = featureChecker;
        this.cookieJar = cookieJar;
        this.ozonIdInterceptors = ozonIdInterceptors;
    }

    private final InterfaceC6374c createConfig() {
        final String version = this.appVersionStorage.getVersion();
        return new InterfaceC6374c(this, version) { // from class: ru.ozon.app.android.update.custom.CustomInAppUpdateRepository$createConfig$1
            private final String apkName = "bx-ozon";
            private final e baseDomain;
            private final InterfaceC4875q cookieJar;
            private final CustomInAppUpdateRepository$createConfig$1$featureFlags$1 featureFlags;
            private final List<B> interceptors;
            private final CustomInAppUpdateRepository$createConfig$1$requiredHeaders$1 requiredHeaders;

            /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.app.android.update.custom.CustomInAppUpdateRepository$createConfig$1$requiredHeaders$1] */
            /* JADX WARN: Type inference failed for: r3v8, types: [ru.ozon.app.android.update.custom.CustomInAppUpdateRepository$createConfig$1$featureFlags$1] */
            {
                InterfaceC4875q interfaceC4875q;
                List<B> list;
                EnvironmentService environmentService;
                e eVar;
                this.requiredHeaders = new InterfaceC6374c.b(this, version) { // from class: ru.ozon.app.android.update.custom.CustomInAppUpdateRepository$createConfig$1$requiredHeaders$1
                    private final String userAgent;
                    private final String xO3AppName;
                    private final String xO3AppVersion;

                    {
                        AppVersionService appVersionService;
                        AppVersionService appVersionService2;
                        appVersionService = this.appVersionStorage;
                        this.userAgent = appVersionService.getUserAgent();
                        appVersionService2 = this.appVersionStorage;
                        this.xO3AppName = appVersionService2.getAppName();
                        this.xO3AppVersion = h.m0(version, "(");
                    }

                    @Override // ej.InterfaceC6374c.b
                    public String getUserAgent() {
                        return this.userAgent;
                    }

                    @Override // ej.InterfaceC6374c.b
                    public String getXO3AppName() {
                        return this.xO3AppName;
                    }

                    @Override // ej.InterfaceC6374c.b
                    public String getXO3AppVersion() {
                        return this.xO3AppVersion;
                    }
                };
                interfaceC4875q = this.cookieJar;
                this.cookieJar = interfaceC4875q;
                list = this.ozonIdInterceptors;
                this.interceptors = list;
                environmentService = this.environmentService;
                if (environmentService.isStage()) {
                    e.Companion.getClass();
                    eVar = e.defaultStage;
                } else {
                    e.Companion.getClass();
                    eVar = e.defaultProd;
                }
                this.baseDomain = eVar;
                this.featureFlags = new InterfaceC6374c.a(this) { // from class: ru.ozon.app.android.update.custom.CustomInAppUpdateRepository$createConfig$1$featureFlags$1
                    private final boolean isCommonNetworkClientEnabled;

                    {
                        FeatureChecker featureChecker;
                        featureChecker = this.featureChecker;
                        this.isCommonNetworkClientEnabled = featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE);
                    }

                    @Override // ej.InterfaceC6374c.a
                    public Boolean isCommonNetworkClientEnabled() {
                        return Boolean.valueOf(this.isCommonNetworkClientEnabled);
                    }

                    @Override // ej.InterfaceC6374c.a
                    public Boolean isHostSpecificDomainEnabled() {
                        return null;
                    }
                };
            }

            @Override // ej.InterfaceC6374c
            public String getApkName() {
                return this.apkName;
            }

            @Override // ej.InterfaceC6374c
            public e getBaseDomain() {
                return this.baseDomain;
            }

            @Override // ej.InterfaceC6374c
            public InterfaceC4875q getCookieJar() {
                return this.cookieJar;
            }

            @Override // ej.InterfaceC6374c
            public List<B> getInterceptors() {
                return this.interceptors;
            }

            @Override // ej.InterfaceC6374c
            public List<B> getNetworkInterceptors() {
                return K.f71697a;
            }

            @Override // ej.InterfaceC6374c
            public InterfaceC6374c.InterfaceC0981c getUiData() {
                return null;
            }

            @Override // ej.InterfaceC6374c
            public CustomInAppUpdateRepository$createConfig$1$featureFlags$1 getFeatureFlags() {
                return this.featureFlags;
            }

            @Override // ej.InterfaceC6374c
            public CustomInAppUpdateRepository$createConfig$1$requiredHeaders$1 getRequiredHeaders() {
                return this.requiredHeaders;
            }
        };
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void completeUpdate(@NotNull InAppUpdateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        InAppUpdateRepository next = getNext();
        if (next != null) {
            next.completeUpdate(type);
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public InAppUpdateInfo getUpdateState() {
        if (this.featureChecker.isEnabled(InAppUpdateEnabledFlag.INSTANCE) && this.ozonInAppUpdateSdkManager.i(createConfig()) == EnumC6378g.UPDATE_AVAILABLE) {
            return CustomInAppUpdateInfo.INSTANCE;
        }
        InAppUpdateRepository next = getNext();
        if (next != null) {
            return next.getUpdateState();
        }
        return null;
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void handleResult(int requestCode, int resultCode) {
        InAppUpdateRepository next = getNext();
        if (next != null) {
            next.handleResult(requestCode, resultCode);
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        if (info instanceof CustomInAppUpdateInfo) {
            if (activity instanceof ActivityC5043j) {
                this.ozonInAppUpdateSdkManager.J(createConfig(), (ActivityC5043j) activity);
            }
            this.inAppUpdateIntervalStorage.nextInterval();
        } else {
            InAppUpdateRepository next = getNext();
            if (next != null) {
                next.startUpdate(activity, info);
            }
        }
    }
}
