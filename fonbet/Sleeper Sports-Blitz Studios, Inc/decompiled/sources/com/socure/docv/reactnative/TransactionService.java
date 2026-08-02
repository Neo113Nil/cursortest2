package com.socure.docv.reactnative;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/socure/docv/reactnative/TransactionService;", "", "createTransaction", "Lcom/socure/docv/reactnative/TransactionResponse;", "headers", "", "", "request", "Lcom/socure/docv/reactnative/TransactionRequest;", "(Ljava/util/Map;Lcom/socure/docv/reactnative/TransactionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TransactionService {
    @POST("api/5.0/documents/request")
    Object createTransaction(@HeaderMap Map<String, String> map, @Body TransactionRequest transactionRequest, Continuation<? super TransactionResponse> continuation);
}
