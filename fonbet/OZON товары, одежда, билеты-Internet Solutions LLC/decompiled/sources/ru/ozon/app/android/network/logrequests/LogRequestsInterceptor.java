package ru.ozon.app.android.network.logrequests;

import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import vj.C10325b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/network/logrequests/LogRequestsInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "logRequestsService", "<init>", "(Lru/ozon/app/android/network/logrequests/LogRequestsService;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogRequestsInterceptor extends BXInterceptor {

    @NotNull
    private final LogRequestsService logRequestsService;

    public LogRequestsInterceptor(@NotNull LogRequestsService logRequestsService) {
        Intrinsics.checkNotNullParameter(logRequestsService, "logRequestsService");
        this.logRequestsService = logRequestsService;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L response = chain.proceed(chain.request());
        if (!this.logRequestsService.canProcess() || !this.logRequestsService.isOzonHarLoggerFlagEnabled()) {
            return response;
        }
        Intrinsics.checkNotNullParameter(response, "response");
        C10325b c10325b = C10325b.f103003h;
        if (c10325b == null) {
            throw new IllegalStateException("Error OzonHarLogger is not initialized, you need to call OzonHarLogger.init()");
        }
        C10325b.j(c10325b, response);
        return response;
    }
}
