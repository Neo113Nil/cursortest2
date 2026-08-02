package ru.ozon.app.android.network.interceptors;

import Ib.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import We.B;
import We.G;
import We.L;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/network/interceptors/DomainCheckInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(LIb/a;LIb/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "", "apiUrlHost$delegate", "LSc/j;", "getApiUrlHost", "()Ljava/lang/String;", "apiUrlHost", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DomainCheckInterceptor extends BXInterceptor {

    /* renamed from: apiUrlHost$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j apiUrlHost;

    @NotNull
    private final a<DomainsInteractor> domainsInteractor;

    public DomainCheckInterceptor(@NotNull a<NetworkComponentConfig> networkComponentConfig, @NotNull a<DomainsInteractor> domainsInteractor) {
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.domainsInteractor = domainsInteractor;
        this.apiUrlHost = k.b(new DomainCheckInterceptor$apiUrlHost$2(networkComponentConfig));
    }

    private final String getApiUrlHost() {
        return (String) this.apiUrlHost.getValue();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        A j11 = request.j();
        String h11 = j11.h();
        if (Intrinsics.d(h11, getApiUrlHost()) || this.domainsInteractor.get().isHostSubdomainOfNetworkRequestDomains(h11)) {
            return chain.proceed(request);
        }
        IOException iOException = new IOException("It's forbidden to use non-Ozon network domains, url: " + j11);
        BxLogger.INSTANCE.logException(iOException);
        throw iOException;
    }
}
