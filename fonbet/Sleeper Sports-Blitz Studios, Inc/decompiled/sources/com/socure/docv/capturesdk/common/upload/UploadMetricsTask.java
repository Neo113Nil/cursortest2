package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.repository.StepUpRepositoryKt;
import com.socure.docv.capturesdk.common.network.repository.UploadRepository;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ErrorHandlerKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* compiled from: UploadMetricsTask.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadMetricsTask;", "", "customHeader", "", "", "docTypeRequestBody", "Lokhttp3/RequestBody;", ApiConstant.CONSENT_ID, "mUploadRepository", "Lcom/socure/docv/capturesdk/common/network/repository/UploadRepository;", "(Ljava/util/Map;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lcom/socure/docv/capturesdk/common/network/repository/UploadRepository;)V", "getUploadUrl", UnstructuredDocViewModelExtKt.UPLOAD, "", "multiPartBodyFromMetricData", "Lokhttp3/MultipartBody$Part;", "uploadMetricCallback", "Lcom/socure/docv/capturesdk/common/upload/UploadMetricCallback;", "(Lokhttp3/MultipartBody$Part;Lcom/socure/docv/capturesdk/common/upload/UploadMetricCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadMetricsTask {
    private final RequestBody consentId;
    private final Map<String, String> customHeader;
    private final RequestBody docTypeRequestBody;
    private final UploadRepository mUploadRepository;

    public UploadMetricsTask(Map<String, String> customHeader, RequestBody docTypeRequestBody, RequestBody consentId, UploadRepository mUploadRepository) {
        Intrinsics.checkNotNullParameter(customHeader, "customHeader");
        Intrinsics.checkNotNullParameter(docTypeRequestBody, "docTypeRequestBody");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(mUploadRepository, "mUploadRepository");
        this.customHeader = customHeader;
        this.docTypeRequestBody = docTypeRequestBody;
        this.consentId = consentId;
        this.mUploadRepository = mUploadRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)(1:18)|15|16))|28|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        com.socure.docv.capturesdk.common.logger.LoggerKt.logD("SDLT_UMT", "upload metric error: " + r0.getLocalizedMessage());
        r11.onFailure(com.socure.docv.capturesdk.api.SocureDocVError.DOCUMENT_UPLOAD_FAILURE);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x005e, B:14:0x0066, B:18:0x0070, B:22:0x0040), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x005e, B:14:0x0066, B:18:0x0070, B:22:0x0040), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object upload(MultipartBody.Part part, UploadMetricCallback uploadMetricCallback, Continuation<? super Unit> continuation) {
        UploadMetricsTask$upload$1 uploadMetricsTask$upload$1;
        int i;
        Response response;
        if (continuation instanceof UploadMetricsTask$upload$1) {
            uploadMetricsTask$upload$1 = (UploadMetricsTask$upload$1) continuation;
            if ((uploadMetricsTask$upload$1.label & Integer.MIN_VALUE) != 0) {
                uploadMetricsTask$upload$1.label -= Integer.MIN_VALUE;
                UploadMetricsTask$upload$1 uploadMetricsTask$upload$12 = uploadMetricsTask$upload$1;
                Object obj = uploadMetricsTask$upload$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uploadMetricsTask$upload$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LoggerKt.logD("SDLT_UMT", "UploadMetricsTask's upload called");
                    UploadRepository uploadRepository = this.mUploadRepository;
                    Map<String, String> map = this.customHeader;
                    String uploadUrl = getUploadUrl();
                    RequestBody requestBody = this.docTypeRequestBody;
                    RequestBody requestBody2 = this.consentId;
                    uploadMetricsTask$upload$12.L$0 = uploadMetricCallback;
                    uploadMetricsTask$upload$12.label = 1;
                    obj = uploadRepository.upload(map, uploadUrl, requestBody, requestBody2, part, uploadMetricsTask$upload$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uploadMetricCallback = (UploadMetricCallback) uploadMetricsTask$upload$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (!response.isSuccessful()) {
                    LoggerKt.logD("SDLT_UMT", "upload metric success");
                    uploadMetricCallback.onSuccess();
                } else {
                    LoggerKt.logD("SDLT_UMT", "upload metric failure");
                    uploadMetricCallback.onFailure(StepUpRepositoryKt.codeToError(ErrorHandlerKt.getErrorSocureSdkResponseHttpInfo(response.errorBody()).getFirst().intValue()));
                }
                return Unit.INSTANCE;
            }
        }
        uploadMetricsTask$upload$1 = new UploadMetricsTask$upload$1(this, continuation);
        UploadMetricsTask$upload$1 uploadMetricsTask$upload$122 = uploadMetricsTask$upload$1;
        Object obj2 = uploadMetricsTask$upload$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uploadMetricsTask$upload$122.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (!response.isSuccessful()) {
        }
        return Unit.INSTANCE;
    }

    private final String getUploadUrl() {
        String docUploadUuid = SessionManager.INSTANCE.getDocUploadUuid();
        if (docUploadUuid != null) {
            String str = ApiConstant.UPLOAD_URL + File.separator + docUploadUuid;
            if (str != null) {
                return str;
            }
        }
        return ApiConstant.UPLOAD_URL;
    }
}
