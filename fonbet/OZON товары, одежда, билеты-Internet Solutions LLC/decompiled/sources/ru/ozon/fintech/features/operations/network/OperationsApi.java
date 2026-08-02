package ru.ozon.fintech.features.operations.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/operations/network/OperationsApi;", "", "", "id", "Lru/ozon/fintech/features/operations/network/ReceiptContainer;", "getReceiptInfo", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/features/operations/network/OperationInfoDto;", "getOperationInfo", "Lru/ozon/fintech/features/operations/network/C2bReceiptContainer;", "getC2bReceiptInfo", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OperationsApi {
    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @GET("c2bReceipt.json")
    Object getC2bReceiptInfo(@NotNull @Query("id") String str, @NotNull d<? super C2bReceiptContainer> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @GET("operation.json")
    Object getOperationInfo(@NotNull @Query("id") String str, @NotNull d<? super OperationInfoDto> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @GET("receipt.json")
    Object getReceiptInfo(@NotNull @Query("id") String str, @NotNull d<? super ReceiptContainer> dVar);
}
