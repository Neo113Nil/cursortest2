package com.socure.docv.capturesdk.common.network.transport;

import com.socure.docv.capturesdk.common.network.model.stepup.DeviceSessionRequest;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ResponseWrapper;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

/* compiled from: StepUpApiService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\fJQ\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/transport/StepUpApiService;", "", "deviceSession", "Lretrofit2/Response;", "headers", "", "", "deviceSessionId", "Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startModulesSession", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ResponseWrapper;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitModule", "file", "Lokhttp3/MultipartBody$Part;", "moduleData", "Lokhttp3/RequestBody;", "documentMetrics", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface StepUpApiService {
    @PUT(ApiConstant.STEP_UP_DEVICE_SESSION)
    Object deviceSession(@HeaderMap Map<String, String> map, @Body DeviceSessionRequest deviceSessionRequest, Continuation<? super Response<Object>> continuation);

    @POST(ApiConstant.STEP_UP_MODULE_START_SESSION)
    Object startModulesSession(@HeaderMap Map<String, String> map, Continuation<? super Response<ResponseWrapper>> continuation);

    @POST(ApiConstant.STEP_UP_SUBMIT)
    @Multipart
    Object submitModule(@HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @Part("module_data") RequestBody requestBody, @Part MultipartBody.Part part2, Continuation<? super Response<ResponseWrapper>> continuation);
}
