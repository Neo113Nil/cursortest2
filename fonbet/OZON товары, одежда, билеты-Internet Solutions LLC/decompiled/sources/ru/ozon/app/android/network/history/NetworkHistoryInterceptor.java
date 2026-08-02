package ru.ozon.app.android.network.history;

import Bk.C2638a;
import Ib.a;
import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/network/history/NetworkHistoryInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/history/NetworkHistoryService;", "historyService", "<init>", "(LIb/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkHistoryInterceptor extends BXInterceptor {

    @NotNull
    private final a<NetworkHistoryService> historyService;

    public NetworkHistoryInterceptor(@NotNull a<NetworkHistoryService> historyService) {
        Intrinsics.checkNotNullParameter(historyService, "historyService");
        this.historyService = historyService;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        if (!this.historyService.get().canProcess()) {
            return proceed;
        }
        this.historyService.get().deleteNotRelevant();
        String q11 = L.q(proceed, "x-o3-trace-id");
        if (q11 != null) {
            this.historyService.get().add(new NetworkHistoryModel(q11, proceed.L().j().toString(), proceed.x() != null ? (r1.I() - r1.O()) / 1000.0f : -1.0f, C2638a.a()));
        }
        return proceed;
    }
}
