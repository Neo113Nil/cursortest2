package ru.ozon.fintech.features.offline.network;

import We.K;
import We.M;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\nJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/offline/network/OfflineNetwork;", "", "LWe/K;", "request", "Lretrofit2/Response;", "", "test", "(LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/features/offline/data/model/main/MainData;", "getMainData", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/features/offline/data/model/transfer/TransferData;", "getTransferData", "Lru/ozon/fintech/features/offline/data/model/cbottom/CbottomData;", "getCbottomData", "", ImagesContract.URL, "LWe/M;", "downloadImage", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfflineNetwork {
    @Streaming
    @GET
    Object downloadImage(@Url @NotNull String str, @NotNull d<? super Response<M>> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @GET("mobile/offline/curtains")
    Object getCbottomData(@NotNull d<? super CbottomData> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @GET("mobile/offline/main")
    Object getMainData(@NotNull d<? super MainData> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @GET("mobile/offline/transfer")
    Object getTransferData(@NotNull d<? super TransferData> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("/mobile/obank/features")
    Object test(@Body @NotNull K k11, @NotNull d<? super Response<List<Object>>> dVar);
}
