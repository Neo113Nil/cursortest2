package ru.ozon.fintech.features.metrix.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import ru.ozon.fintech.features.metrix.data.MetrixDto;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/features/metrix/network/FintechMetrixNetwork;", "", "Lru/ozon/fintech/features/metrix/data/MetrixDto;", "data", "Lretrofit2/Response;", "", "sendMetrix", "(Lru/ozon/fintech/features/metrix/data/MetrixDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FintechMetrixNetwork {
    @Headers({"Cache-Control: no-cache", "Accept: application/json", "Content-Type: application/json"})
    @POST("load-metrics")
    Object sendMetrix(@Body @NotNull MetrixDto metrixDto, @NotNull d<? super Response<Unit>> dVar);
}
