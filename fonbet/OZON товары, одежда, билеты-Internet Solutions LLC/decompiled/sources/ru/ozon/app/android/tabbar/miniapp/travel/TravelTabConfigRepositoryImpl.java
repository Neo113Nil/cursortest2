package ru.ozon.app.android.tabbar.miniapp.travel;

import Ib.a;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.api.TabConfigRequest;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigRepositoryImpl;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigRepository;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigApi;", "api", "LIb/a;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelDefaultTabProvider;", "defaultTabProvider", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigApi;LIb/a;)V", "", "miniAppName", "referrerMiniAppName", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "loadTabConfig", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDefaultTabConfig", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigApi;", "LIb/a;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabConfigRepositoryImpl implements TravelTabConfigRepository {

    @NotNull
    private final TravelTabConfigApi api;

    @NotNull
    private final a<TravelDefaultTabProvider> defaultTabProvider;

    public TravelTabConfigRepositoryImpl(@NotNull TravelTabConfigApi api, @NotNull a<TravelDefaultTabProvider> defaultTabProvider) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(defaultTabProvider, "defaultTabProvider");
        this.api = api;
        this.defaultTabProvider = defaultTabProvider;
    }

    @Override // ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigRepository
    public Object getDefaultTabConfig(@NotNull d<? super TabConfigResponse> dVar) {
        return this.defaultTabProvider.get().getDefaultTabConfig();
    }

    @Override // ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigRepository
    public Object loadTabConfig(@NotNull String str, String str2, @NotNull d<? super TabConfigResponse> dVar) {
        return this.api.loadTabConfig(new TabConfigRequest(str, str2), dVar);
    }
}
