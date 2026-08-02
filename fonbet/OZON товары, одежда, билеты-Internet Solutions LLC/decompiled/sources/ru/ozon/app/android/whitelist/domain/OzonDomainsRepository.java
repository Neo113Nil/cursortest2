package ru.ozon.app.android.whitelist.domain;

import Am.C2438a;
import Ib.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.whitelist.common.NativePageDomainsProvider;
import ru.ozon.app.android.whitelist.common.NetworkRequestDomainsProvider;
import ru.ozon.app.android.whitelist.common.StaticsWhitelistDomainsProvider;
import ru.ozon.app.android.whitelist.common.flags.DomainsWhitelistFlag;
import ru.ozon.app.android.whitelist.common.utils.WhitelistFeatureFlagDelegate;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/whitelist/domain/OzonDomainsRepository;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LIb/a;", "Lru/ozon/app/android/whitelist/common/NativePageDomainsProvider;", "nativePageDomainsProviderLazy", "Lru/ozon/app/android/whitelist/common/NetworkRequestDomainsProvider;", "networkRequestDomainsProviderLazy", "Lru/ozon/app/android/whitelist/common/StaticsWhitelistDomainsProvider;", "cdnChooserSdkWhitelistDomainProvider", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;LIb/a;LIb/a;LIb/a;)V", "", "Lru/ozon/app/android/utils/AppType;", "apps", "", "", "getNativePageDomainsByApps", "([Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "LIb/a;", "webDomains$delegate", "Lru/ozon/app/android/whitelist/common/utils/WhitelistFeatureFlagDelegate;", "getWebDomains", "()Ljava/util/Set;", "webDomains", "getNetworkRequestDomains", "networkRequestDomains", "getStaticsWhitelistDomains", "staticsWhitelistDomains", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonDomainsRepository {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(OzonDomainsRepository.class, "webDomains", "getWebDomains()Ljava/util/Set;", 0)};

    @NotNull
    private final a<StaticsWhitelistDomainsProvider> cdnChooserSdkWhitelistDomainProvider;

    @NotNull
    private final a<NativePageDomainsProvider> nativePageDomainsProviderLazy;

    @NotNull
    private final a<NetworkRequestDomainsProvider> networkRequestDomainsProviderLazy;

    /* renamed from: webDomains$delegate, reason: from kotlin metadata */
    @NotNull
    private final WhitelistFeatureFlagDelegate webDomains;

    public OzonDomainsRepository(@NotNull FeatureService featureService, @NotNull a<NativePageDomainsProvider> nativePageDomainsProviderLazy, @NotNull a<NetworkRequestDomainsProvider> networkRequestDomainsProviderLazy, @NotNull a<StaticsWhitelistDomainsProvider> cdnChooserSdkWhitelistDomainProvider) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(nativePageDomainsProviderLazy, "nativePageDomainsProviderLazy");
        Intrinsics.checkNotNullParameter(networkRequestDomainsProviderLazy, "networkRequestDomainsProviderLazy");
        Intrinsics.checkNotNullParameter(cdnChooserSdkWhitelistDomainProvider, "cdnChooserSdkWhitelistDomainProvider");
        this.nativePageDomainsProviderLazy = nativePageDomainsProviderLazy;
        this.networkRequestDomainsProviderLazy = networkRequestDomainsProviderLazy;
        this.cdnChooserSdkWhitelistDomainProvider = cdnChooserSdkWhitelistDomainProvider;
        this.webDomains = new WhitelistFeatureFlagDelegate(featureService, DomainsWhitelistFlag.INSTANCE);
    }

    @NotNull
    public final Set<String> getNativePageDomainsByApps(@NotNull AppType... apps) {
        Intrinsics.checkNotNullParameter(apps, "apps");
        NativePageDomainsProvider nativePageDomainsProvider = this.nativePageDomainsProviderLazy.get();
        ArrayList arrayList = new ArrayList(apps.length);
        for (AppType appType : apps) {
            String lowerCase = appType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return nativePageDomainsProvider.provideNativePageDomainsByApps((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final Set<String> getNetworkRequestDomains() {
        return this.networkRequestDomainsProviderLazy.get().provideNetworkRequestDomains();
    }

    @NotNull
    public final Set<String> getStaticsWhitelistDomains() {
        return this.cdnChooserSdkWhitelistDomainProvider.get().provideStaticsWhitelistDomains();
    }

    @NotNull
    public final Set<String> getWebDomains() {
        return this.webDomains.getValue2((Object) this, $$delegatedProperties[0]);
    }
}
