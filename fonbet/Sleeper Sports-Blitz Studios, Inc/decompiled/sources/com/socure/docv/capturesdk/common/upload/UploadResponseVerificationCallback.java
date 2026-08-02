package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.core.pipeline.model.ApiResponse;
import kotlin.Metadata;

/* compiled from: UploadResponseVerificationCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadResponseVerificationCallback;", "", "onError", "", "apiResponse", "Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;", "processedToNext", "retake", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UploadResponseVerificationCallback {
    void onError(ApiResponse apiResponse);

    void processedToNext();

    void retake();
}
