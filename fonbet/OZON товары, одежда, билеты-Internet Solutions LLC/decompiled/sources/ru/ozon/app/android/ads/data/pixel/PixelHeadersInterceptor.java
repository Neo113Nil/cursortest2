package ru.ozon.app.android.ads.data.pixel;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/PixelHeadersInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "", "userAgentForPixel$delegate", "LSc/j;", "getUserAgentForPixel", "()Ljava/lang/String;", "userAgentForPixel", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PixelHeadersInterceptor extends BXInterceptor {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final DomainsInteractor domainsInteractor;

    /* renamed from: userAgentForPixel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userAgentForPixel;

    public PixelHeadersInterceptor(@NotNull AppVersionStorage appVersionStorage, @NotNull AppVersionService appVersionService, @NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.appVersionStorage = appVersionStorage;
        this.appVersionService = appVersionService;
        this.domainsInteractor = domainsInteractor;
        this.userAgentForPixel = k.a(n.SYNCHRONIZED, new PixelHeadersInterceptor$userAgentForPixel$2(this));
    }

    private final String getUserAgentForPixel() {
        return (String) this.userAgentForPixel.getValue();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String userAgent = this.domainsInteractor.isHostSubdomainOfNetworkRequestDomains(chain.request().j().h()) ? this.appVersionService.getUserAgent() : getUserAgentForPixel();
        G request = chain.request();
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.d("User-Agent", userAgent);
        return chain.proceed(aVar.b());
    }
}
