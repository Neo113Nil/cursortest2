package ru.ozon.inapp.push.sdk.internal.data;

import Cd0.a;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessRequest;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessResponse;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/NewInAppPushApi;", "LCd0/a;", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest;", "request", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;", "actionProcess", "(Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", ImagesContract.URL, "", "callPixelUrl", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NewInAppPushApi extends a {
    @Override // Cd0.a
    @POST("api/composer-api.bx/_action/inAppPushAction")
    Object actionProcess(@Body @NotNull ActionProcessRequest actionProcessRequest, @NotNull d<? super ActionProcessResponse> dVar);

    @Override // Cd0.a
    @GET
    Object callPixelUrl(@Url @NotNull String str, @NotNull d<? super Unit> dVar);
}
