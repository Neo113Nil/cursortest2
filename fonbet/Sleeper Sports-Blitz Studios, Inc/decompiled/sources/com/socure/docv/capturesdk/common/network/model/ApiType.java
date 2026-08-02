package com.socure.docv.capturesdk.common.network.model;

import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;

/* compiled from: ApiType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/ApiType;", "", AnalyticsConstantsKt.KEY_ENDPOINT, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "START", "MODULE_SUBMISSION", "IMAGE_UPLOAD", "UNKNOWN", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ApiType {
    START(ApiConstant.STEP_UP_MODULE_START_SESSION),
    MODULE_SUBMISSION(ApiConstant.STEP_UP_SUBMIT),
    IMAGE_UPLOAD(ApiConstant.UPLOAD_URL),
    UNKNOWN("");

    private final String endpoint;

    ApiType(String str) {
        this.endpoint = str;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }
}
