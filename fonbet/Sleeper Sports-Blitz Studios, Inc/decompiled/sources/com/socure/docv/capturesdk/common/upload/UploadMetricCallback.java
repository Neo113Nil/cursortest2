package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.api.SocureDocVError;
import com.turboimage.events.FailureEvent;
import com.turboimage.events.SuccessEvent;
import kotlin.Metadata;

/* compiled from: UploadMetricCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadMetricCallback;", "", FailureEvent.EVENT_NAME, "", "error", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", SuccessEvent.EVENT_NAME, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UploadMetricCallback {
    void onFailure(SocureDocVError error);

    void onSuccess();
}
