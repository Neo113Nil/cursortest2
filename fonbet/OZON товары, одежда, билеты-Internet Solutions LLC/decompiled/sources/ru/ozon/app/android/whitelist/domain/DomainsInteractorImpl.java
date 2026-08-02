package ru.ozon.app.android.whitelist.domain;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t*\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u00020\r*\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0082\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001e\"\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u0019\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0018J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/whitelist/domain/DomainsInteractorImpl;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "Lru/ozon/app/android/whitelist/domain/OzonDomainsRepository;", "repository", "Lru/ozon/app/android/utils/AppType;", "currentAppType", "<init>", "(Lru/ozon/app/android/whitelist/domain/OzonDomainsRepository;Lru/ozon/app/android/utils/AppType;)V", "", ImagesContract.URL, "", "domains", "", "isUrlSubdomain", "(Ljava/lang/String;Ljava/util/Collection;)Z", "host", "isHostSubdomain", "findBySubdomainUrl", "(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;", "", "findBySubdomainHost", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "getHost", "(Ljava/lang/String;)Ljava/lang/String;", "topLevelHost", "isSubdomainOf", "(Ljava/lang/String;Ljava/lang/String;)Z", "isHostContainsInNativePageDomains", "(Ljava/lang/String;)Z", "", "apps", "isHostContainsInNativePageDomainsByApps", "(Ljava/lang/String;[Lru/ozon/app/android/utils/AppType;)Z", "isHostSubdomainOfNetworkRequestDomains", "isUrlSubdomainOfNetworkRequestDomains", "isUrlSubdomainOfWebDomains", "findUrlSubdomainInWebDomains", "isUrlSubdomainOfStaticsWhitelist", "Lru/ozon/app/android/whitelist/domain/OzonDomainsRepository;", "Lru/ozon/app/android/utils/AppType;", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DomainsInteractorImpl implements DomainsInteractor, NativePageDomainsInteractor {

    @NotNull
    private final AppType currentAppType;

    @NotNull
    private final OzonDomainsRepository repository;

    public DomainsInteractorImpl(@NotNull OzonDomainsRepository repository, @NotNull AppType currentAppType) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(currentAppType, "currentAppType");
        this.repository = repository;
        this.currentAppType = currentAppType;
    }

    private final String findBySubdomainHost(Iterable<String> iterable, String str) {
        String str2;
        Iterator<String> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            str2 = it.next();
            String str3 = str2;
            if (Intrinsics.d(str3, str) || isSubdomainOf(str, str3)) {
                break;
            }
        }
        return str2;
    }

    private final String findBySubdomainUrl(Collection<String> collection, String str) {
        String host;
        if (collection.isEmpty() || (host = getHost(str)) == null) {
            return null;
        }
        return findBySubdomainHost(collection, host);
    }

    private final String getHost(String str) {
        return Uri.parse(str).getHost();
    }

    private final boolean isHostSubdomain(String host, Collection<String> domains) {
        return findBySubdomainHost(domains, host) != null;
    }

    private final boolean isSubdomainOf(String str, String str2) {
        return h.A(str, "." + str2, false);
    }

    private final boolean isUrlSubdomain(String url, Collection<String> domains) {
        return findBySubdomainUrl(domains, url) != null;
    }

    @Override // ru.ozon.app.android.network.whitelist.domain.DomainsInteractor
    public String findUrlSubdomainInWebDomains(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return findBySubdomainUrl(this.repository.getWebDomains(), url);
    }

    @Override // ru.ozon.app.android.navigation.NativePageDomainsInteractor
    public boolean isHostContainsInNativePageDomains(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return isHostContainsInNativePageDomainsByApps(host, this.currentAppType);
    }

    @Override // ru.ozon.app.android.navigation.NativePageDomainsInteractor
    public boolean isHostContainsInNativePageDomainsByApps(String host, @NotNull AppType... apps) {
        Intrinsics.checkNotNullParameter(apps, "apps");
        if (host == null || h.K(host)) {
            return false;
        }
        return this.repository.getNativePageDomainsByApps((AppType[]) Arrays.copyOf(apps, apps.length)).contains(host);
    }

    @Override // ru.ozon.app.android.network.whitelist.domain.DomainsInteractor
    public boolean isHostSubdomainOfNetworkRequestDomains(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return isHostSubdomain(host, this.repository.getNetworkRequestDomains());
    }

    @Override // ru.ozon.app.android.network.whitelist.domain.DomainsInteractor
    public boolean isUrlSubdomainOfNetworkRequestDomains(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return isUrlSubdomain(url, this.repository.getNetworkRequestDomains());
    }

    @Override // ru.ozon.app.android.network.whitelist.domain.DomainsInteractor
    public boolean isUrlSubdomainOfStaticsWhitelist(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return isUrlSubdomain(url, this.repository.getStaticsWhitelistDomains());
    }

    @Override // ru.ozon.app.android.network.whitelist.domain.DomainsInteractor
    public boolean isUrlSubdomainOfWebDomains(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return isUrlSubdomain(url, this.repository.getWebDomains());
    }
}
