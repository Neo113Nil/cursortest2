package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.common.network.transport.MixPanelApiService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: MixPanelRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/MixPanelRepository;", "", "apiService", "Lcom/socure/docv/capturesdk/common/network/transport/MixPanelApiService;", "(Lcom/socure/docv/capturesdk/common/network/transport/MixPanelApiService;)V", "sendEvent", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MixPanelRepository {
    public static final int $stable = 8;
    private final MixPanelApiService apiService;

    public MixPanelRepository(MixPanelApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
    }

    public final Object sendEvent(String str, Continuation<? super Response<ResponseBody>> continuation) {
        return this.apiService.sendEvent(str, continuation);
    }
}
