package ru.ozon.app.android.tabbar.data.api;

import Sc.InterfaceC3999a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/tabbar/data/api/TabConfigApi;", "", "Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "getTabConfig", "(Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;)Lio/reactivex/y;", "getTabBarConfig", "(Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TabConfigApi {
    @POST("composer-api.bx/_action/getTabBarConfig")
    Object getTabBarConfig(@Body @NotNull TabConfigRequest tabConfigRequest, @NotNull d<? super TabConfigResponse> dVar);

    @InterfaceC3999a
    @POST("composer-api.bx/_action/getTabBarConfig")
    @NotNull
    y<TabConfigResponse> getTabConfig(@Body @NotNull TabConfigRequest request);
}
