package com.socure.docv.capturesdk.common.network.transport;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadResult;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/* compiled from: UploadApiService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JY\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/transport/UploadApiService;", "", "uploadDoc", "Lretrofit2/Response;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "headers", "", "", "url", ApiConstant.DOCUMENT_TYPE, "Lokhttp3/RequestBody;", ApiConstant.CONSENT_ID, "documentBody", "Lokhttp3/MultipartBody$Part;", "(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UploadApiService {
    @POST
    @Multipart
    Object uploadDoc(@HeaderMap Map<String, String> map, @Url String str, @Part("documentType") RequestBody requestBody, @Part("consentId") RequestBody requestBody2, @Part MultipartBody.Part part, Continuation<? super Response<UploadResult>> continuation);
}
