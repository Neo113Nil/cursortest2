package ru.ozon.app.android.ads.data.pixel;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

/* loaded from: classes6.dex */
public final class PixelHeadersInterceptor_Factory implements e<PixelHeadersInterceptor> {
    private final a<AppVersionService> appVersionServiceProvider;
    private final a<AppVersionStorage> appVersionStorageProvider;
    private final a<DomainsInteractor> domainsInteractorProvider;

    public PixelHeadersInterceptor_Factory(a<AppVersionStorage> aVar, a<AppVersionService> aVar2, a<DomainsInteractor> aVar3) {
        this.appVersionStorageProvider = aVar;
        this.appVersionServiceProvider = aVar2;
        this.domainsInteractorProvider = aVar3;
    }

    public static PixelHeadersInterceptor_Factory create(a<AppVersionStorage> aVar, a<AppVersionService> aVar2, a<DomainsInteractor> aVar3) {
        return new PixelHeadersInterceptor_Factory(aVar, aVar2, aVar3);
    }

    public static PixelHeadersInterceptor newInstance(AppVersionStorage appVersionStorage, AppVersionService appVersionService, DomainsInteractor domainsInteractor) {
        return new PixelHeadersInterceptor(appVersionStorage, appVersionService, domainsInteractor);
    }

    @Override // Pc.a
    public PixelHeadersInterceptor get() {
        return newInstance(this.appVersionStorageProvider.get(), this.appVersionServiceProvider.get(), this.domainsInteractorProvider.get());
    }
}
