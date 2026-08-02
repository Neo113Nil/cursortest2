package ru.ozon.app.android.environment.di;

import Fb0.e;
import Ib.a;
import android.app.Application;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.component.BaseApiUrlProvider;
import ru.ozon.app.android.environment.EnvironmentServiceImpl;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0013H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/environment/di/EnvironmentModule;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lru/ozon/app/android/platform/flavor/FlavorType;", "flavorType", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "provideEnvironmentService", "(Landroid/app/Application;Lru/ozon/app/android/platform/flavor/FlavorType;)Lru/ozon/app/android/storage/environment/EnvironmentService;", "LIb/a;", "environmentServiceLazy", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/storage/hosts/CoreHosts;", "provideCoreHosts", "(LIb/a;Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/storage/hosts/CoreHosts;", "hosts", "Lru/ozon/app/android/mediaupload/hosts/PDPHosts;", "providePDPHosts", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)Lru/ozon/app/android/mediaupload/hosts/PDPHosts;", "Lru/ozon/app/android/di/component/BaseApiUrlProvider;", "provideBaseUrlProvider", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)Lru/ozon/app/android/di/component/BaseApiUrlProvider;", "baseApiUrlProvider", "", "provideApiUrl", "(Lru/ozon/app/android/di/component/BaseApiUrlProvider;)Ljava/lang/String;", "provideApiUrlSuffix", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)Ljava/lang/String;", "LFb0/e;", "provideAppDomain", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)LFb0/e;", "provideMetricsDomainName", "Landroid/content/Context;", "context", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "provideNativePageDomainsInteractor", "(Landroid/content/Context;)Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "pdpHosts", "provideWebSocketLink", "(Lru/ozon/app/android/mediaupload/hosts/PDPHosts;)Ljava/lang/String;", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "provideFintechUrls", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)Lru/ozon/app/android/storage/hosts/FintechUrls;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnvironmentModule {
    @NotNull
    public final String provideApiUrl(@NotNull BaseApiUrlProvider baseApiUrlProvider) {
        Intrinsics.checkNotNullParameter(baseApiUrlProvider, "baseApiUrlProvider");
        return baseApiUrlProvider.getApiBaseUrl();
    }

    @NotNull
    public final String provideApiUrlSuffix(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return hosts.getBaseUrlSuffix();
    }

    @NotNull
    public final e provideAppDomain(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return hosts.getAppDomain();
    }

    @NotNull
    public final BaseApiUrlProvider provideBaseUrlProvider(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return new BaseApiUrlProvider(hosts);
    }

    @NotNull
    public final CoreHosts provideCoreHosts(@NotNull a<EnvironmentService> environmentServiceLazy, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(environmentServiceLazy, "environmentServiceLazy");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CoreHosts(environmentServiceLazy, appType);
    }

    @NotNull
    public final EnvironmentService provideEnvironmentService(@NotNull Application application, @NotNull FlavorType flavorType) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(flavorType, "flavorType");
        return new EnvironmentServiceImpl(application, flavorType);
    }

    @NotNull
    public final FintechUrls provideFintechUrls(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return hosts.getFintechUrls();
    }

    @NotNull
    public final String provideMetricsDomainName(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return hosts.getMetricsDomainName();
    }

    @NotNull
    public final NativePageDomainsInteractor provideNativePageDomainsInteractor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, WhitelistComponentApi.class).getDependencyStorage();
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        DomainsInteractor domainsInteractor = ((WhitelistComponentApi) dependencyStorage.b(WhitelistComponentApi.class)).getDomainsInteractor();
        Intrinsics.g(domainsInteractor, "null cannot be cast to non-null type ru.ozon.app.android.navigation.NativePageDomainsInteractor");
        return (NativePageDomainsInteractor) domainsInteractor;
    }

    @NotNull
    public final PDPHosts providePDPHosts(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        return new PDPHosts(hosts);
    }

    @NotNull
    public final String provideWebSocketLink(@NotNull PDPHosts pdpHosts) {
        Intrinsics.checkNotNullParameter(pdpHosts, "pdpHosts");
        return pdpHosts.getWebSocketUrl();
    }
}
