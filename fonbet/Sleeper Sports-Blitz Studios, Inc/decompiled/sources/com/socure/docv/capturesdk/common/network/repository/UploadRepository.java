package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadResult;
import com.socure.docv.capturesdk.common.network.transport.UploadApiService;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Part;

/* compiled from: UploadRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JU\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/UploadRepository;", "", "uploadApiService", "Lcom/socure/docv/capturesdk/common/network/transport/UploadApiService;", "(Lcom/socure/docv/capturesdk/common/network/transport/UploadApiService;)V", UnstructuredDocViewModelExtKt.UPLOAD, "Lretrofit2/Response;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "headers", "", "", "url", "docType", "Lokhttp3/RequestBody;", ApiConstant.CONSENT_ID, "documentBody", "Lokhttp3/MultipartBody$Part;", "(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadRepository {
    public static final int $stable = 8;
    private final UploadApiService uploadApiService;

    public UploadRepository(UploadApiService uploadApiService) {
        Intrinsics.checkNotNullParameter(uploadApiService, "uploadApiService");
        this.uploadApiService = uploadApiService;
        LoggerKt.logD("SDLT_UR", "UploadRepository init");
    }

    public final Object upload(Map<String, String> map, String str, @Part RequestBody requestBody, @Part RequestBody requestBody2, @Part MultipartBody.Part part, Continuation<? super Response<UploadResult>> continuation) {
        return this.uploadApiService.uploadDoc(map, str, requestBody, requestBody2, part, continuation);
    }
}
