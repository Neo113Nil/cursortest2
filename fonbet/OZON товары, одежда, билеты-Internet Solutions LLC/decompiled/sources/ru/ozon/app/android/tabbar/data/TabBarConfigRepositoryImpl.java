package ru.ozon.app.android.tabbar.data;

import He.b;
import Sc.InterfaceC3999a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.api.TabConfigApi;
import ru.ozon.app.android.tabbar.data.api.TabConfigRequest;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabBarConfigRepositoryImpl;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/data/api/TabConfigApi;", "tabConfigApi", "<init>", "(Lru/ozon/app/android/tabbar/data/api/TabConfigApi;)V", "", "miniAppName", "referrerMiniAppName", "Lio/reactivex/y;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "loadTabConfig", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "loadTabBarConfig", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/tabbar/data/api/TabConfigApi;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabBarConfigRepositoryImpl implements TabConfigRepository {

    @NotNull
    private final TabConfigApi tabConfigApi;

    public TabBarConfigRepositoryImpl(@NotNull TabConfigApi tabConfigApi) {
        Intrinsics.checkNotNullParameter(tabConfigApi, "tabConfigApi");
        this.tabConfigApi = tabConfigApi;
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigRepository
    public Object loadTabBarConfig(@NotNull String str, String str2, @NotNull d<? super TabConfigResponse> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new TabBarConfigRepositoryImpl$loadTabBarConfig$2(this, str, str2, null), dVar);
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigRepository
    @InterfaceC3999a
    @NotNull
    public y<TabConfigResponse> loadTabConfig(@NotNull String miniAppName, String referrerMiniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return this.tabConfigApi.getTabConfig(new TabConfigRequest(miniAppName, referrerMiniAppName));
    }
}
