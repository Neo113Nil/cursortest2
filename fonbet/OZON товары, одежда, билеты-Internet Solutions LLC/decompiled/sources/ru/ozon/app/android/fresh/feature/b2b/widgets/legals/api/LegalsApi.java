package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api;

import We.K;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.api.CheckLegalAddressResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.GetLegalsByInnRequest;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.GetLegalsByInnResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.GetPostResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.ProcessRegistrationResponse;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\u0011J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnResponse;", "getLegalsByInn", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnRequest;)Lio/reactivex/y;", "LWe/K;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/api/CheckLegalAddressResponse;", "checkAddressMobile", "(LWe/K;)Lio/reactivex/y;", "", "action", "requestBody", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "addLegalMobile", "(Ljava/lang/String;LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "processRegistration", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/GetPostResponse;", "getPostByAddress", "(LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LegalsApi {
    @POST("composer-api.bx/_action/{action}")
    Object addLegalMobile(@Path("action") @NotNull String str, @Body @NotNull K k11, @NotNull d<? super AddLegalResponse> dVar);

    @POST("composer-api.bx/_action/b2bCheckAddressMobile")
    @NotNull
    y<CheckLegalAddressResponse> checkAddressMobile(@Body @NotNull K request);

    @POST("composer-api.bx/_action/b2bGetLegalsByInnMobile")
    @NotNull
    y<GetLegalsByInnResponse> getLegalsByInn(@Body @NotNull GetLegalsByInnRequest request);

    @POST("composer-api.bx/_action/b2bGetPostByAddress")
    Object getPostByAddress(@Body @NotNull K k11, @NotNull d<? super GetPostResponse> dVar);

    @POST("composer-api.bx/_action/{action}")
    Object processRegistration(@Path("action") @NotNull String str, @Body @NotNull K k11, @NotNull d<? super ProcessRegistrationResponse> dVar);
}
