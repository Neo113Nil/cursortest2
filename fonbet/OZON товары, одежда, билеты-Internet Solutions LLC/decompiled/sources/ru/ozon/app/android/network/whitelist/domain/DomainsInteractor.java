package ru.ozon.app.android.network.whitelist.domain;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "", "", "host", "", "isHostSubdomainOfNetworkRequestDomains", "(Ljava/lang/String;)Z", ImagesContract.URL, "isUrlSubdomainOfNetworkRequestDomains", "isUrlSubdomainOfWebDomains", "findUrlSubdomainInWebDomains", "(Ljava/lang/String;)Ljava/lang/String;", "isUrlSubdomainOfStaticsWhitelist", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DomainsInteractor {
    String findUrlSubdomainInWebDomains(@NotNull String url);

    boolean isHostSubdomainOfNetworkRequestDomains(@NotNull String host);

    boolean isUrlSubdomainOfNetworkRequestDomains(@NotNull String url);

    boolean isUrlSubdomainOfStaticsWhitelist(@NotNull String url);

    boolean isUrlSubdomainOfWebDomains(@NotNull String url);
}
