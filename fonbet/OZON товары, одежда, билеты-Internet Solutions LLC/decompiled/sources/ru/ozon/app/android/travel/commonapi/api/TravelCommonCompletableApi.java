package ru.ozon.app.android.travel.commonapi.api;

import Sc.InterfaceC3999a;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H'¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "", "", "actionName", "", "request", "Lio/reactivex/b;", "completableResponse", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "", "performCompletableAction", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "completableAnyParamsResponse", "commonapi_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TravelCommonCompletableApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    AbstractC7094b completableAnyParamsResponse(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, Object> request);

    @LongPollingAnnotation
    @InterfaceC3999a
    @NotNull
    @POST("composer-api.bx/_action/{actionName}")
    AbstractC7094b completableResponse(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, String> request);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    Object performCompletableAction(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super Unit> dVar);
}
