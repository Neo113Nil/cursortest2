package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadResult;
import com.socure.docv.capturesdk.core.pipeline.model.ApiResponse;
import com.turboimage.events.FailureEvent;
import com.turboimage.events.SuccessEvent;
import kotlin.Metadata;

/* compiled from: UploadTaskCallback.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadTaskCallback;", "", FailureEvent.EVENT_NAME, "", "uploadImage", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "apiResponse", "Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;", SuccessEvent.EVENT_NAME, "uploadResult", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "responseCode", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UploadTaskCallback {
    void onFailure(UploadImage uploadImage, ApiResponse apiResponse);

    void onSuccess(UploadImage uploadImage, UploadResult uploadResult, int responseCode);
}
