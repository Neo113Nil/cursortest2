package ru.ozon.app.android.travel.feature.entry.data;

import Ib.a;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.api.TabConfigRequest;
import ru.ozon.app.android.travel.feature.entry.network.OzonTravelTabConfigApi;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigRepositoryImpl;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigRepository;", "Lru/ozon/app/android/travel/feature/entry/network/OzonTravelTabConfigApi;", "api", "LIb/a;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelFallbackTabConfigProvider;", "fallbackTabConfigProvider", "<init>", "(Lru/ozon/app/android/travel/feature/entry/network/OzonTravelTabConfigApi;LIb/a;)V", "Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;", "createTabRequest", "()Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "getTabConfig", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/entry/network/OzonTravelTabConfigApi;", "LIb/a;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonTravelTabConfigRepositoryImpl implements OzonTravelTabConfigRepository {

    @NotNull
    private final OzonTravelTabConfigApi api;

    @NotNull
    private final a<OzonTravelFallbackTabConfigProvider> fallbackTabConfigProvider;

    public OzonTravelTabConfigRepositoryImpl(@NotNull OzonTravelTabConfigApi api, @NotNull a<OzonTravelFallbackTabConfigProvider> fallbackTabConfigProvider) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(fallbackTabConfigProvider, "fallbackTabConfigProvider");
        this.api = api;
        this.fallbackTabConfigProvider = fallbackTabConfigProvider;
    }

    private final TabConfigRequest createTabRequest() {
        return new TabConfigRequest("travel", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTabConfig(@NotNull d<? super TabConfigResponse> dVar) {
        OzonTravelTabConfigRepositoryImpl$getTabConfig$1 ozonTravelTabConfigRepositoryImpl$getTabConfig$1;
        int i11;
        OzonTravelTabConfigRepositoryImpl ozonTravelTabConfigRepositoryImpl;
        if (dVar instanceof OzonTravelTabConfigRepositoryImpl$getTabConfig$1) {
            ozonTravelTabConfigRepositoryImpl$getTabConfig$1 = (OzonTravelTabConfigRepositoryImpl$getTabConfig$1) dVar;
            int i12 = ozonTravelTabConfigRepositoryImpl$getTabConfig$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ozonTravelTabConfigRepositoryImpl$getTabConfig$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ozonTravelTabConfigRepositoryImpl$getTabConfig$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ozonTravelTabConfigRepositoryImpl$getTabConfig$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        OzonTravelTabConfigApi ozonTravelTabConfigApi = this.api;
                        TabConfigRequest createTabRequest = createTabRequest();
                        ozonTravelTabConfigRepositoryImpl$getTabConfig$1.L$0 = this;
                        ozonTravelTabConfigRepositoryImpl$getTabConfig$1.label = 1;
                        obj = ozonTravelTabConfigApi.loadTabConfig(createTabRequest, ozonTravelTabConfigRepositoryImpl$getTabConfig$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                        ozonTravelTabConfigRepositoryImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        ozonTravelTabConfigRepositoryImpl = this;
                        Lm0.a.f17149a.e(th);
                        return ozonTravelTabConfigRepositoryImpl.fallbackTabConfigProvider.get().provideTabs();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ozonTravelTabConfigRepositoryImpl = (OzonTravelTabConfigRepositoryImpl) ozonTravelTabConfigRepositoryImpl$getTabConfig$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Lm0.a.f17149a.e(th);
                        return ozonTravelTabConfigRepositoryImpl.fallbackTabConfigProvider.get().provideTabs();
                    }
                }
                return (TabConfigResponse) obj;
            }
        }
        ozonTravelTabConfigRepositoryImpl$getTabConfig$1 = new OzonTravelTabConfigRepositoryImpl$getTabConfig$1(this, dVar);
        Object obj2 = ozonTravelTabConfigRepositoryImpl$getTabConfig$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ozonTravelTabConfigRepositoryImpl$getTabConfig$1.label;
        if (i11 != 0) {
        }
        return (TabConfigResponse) obj2;
    }
}
