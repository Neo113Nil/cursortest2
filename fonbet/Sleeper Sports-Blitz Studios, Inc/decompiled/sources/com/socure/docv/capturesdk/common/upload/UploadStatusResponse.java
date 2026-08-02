package com.socure.docv.capturesdk.common.upload;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.core.pipeline.model.ApiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadStatusState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Error", "Exception", "Loading", "Success", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Error;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Exception;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Loading;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Success;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class UploadStatusResponse<T> {
    public /* synthetic */ UploadStatusResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Loading;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse;", "", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends UploadStatusResponse {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private UploadStatusResponse() {
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse;", "uploadApiType", "Lcom/socure/docv/capturesdk/common/upload/UploadApiType;", "data", "(Lcom/socure/docv/capturesdk/common/upload/UploadApiType;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getUploadApiType", "()Lcom/socure/docv/capturesdk/common/upload/UploadApiType;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success<T> extends UploadStatusResponse<T> {
        public static final int $stable = 0;
        private final T data;
        private final UploadApiType uploadApiType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UploadApiType uploadApiType, T t) {
            super(null);
            Intrinsics.checkNotNullParameter(uploadApiType, "uploadApiType");
            this.uploadApiType = uploadApiType;
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        public final UploadApiType getUploadApiType() {
            return this.uploadApiType;
        }
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Error;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse;", "", "apiResponse", "Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;)V", "getApiResponse", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends UploadStatusResponse {
        public static final int $stable = 0;
        private final ApiResponse apiResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ApiResponse apiResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
            this.apiResponse = apiResponse;
        }

        public final ApiResponse getApiResponse() {
            return this.apiResponse;
        }
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse$Exception;", "Lcom/socure/docv/capturesdk/common/upload/UploadStatusResponse;", "", "responseCode", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "msg", "", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Exception extends UploadStatusResponse {
        public static final int $stable = 0;
        private final String msg;
        private final SocureDocVError responseCode;

        public final String getMsg() {
            return this.msg;
        }

        public final SocureDocVError getResponseCode() {
            return this.responseCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exception(SocureDocVError responseCode, String msg) {
            super(null);
            Intrinsics.checkNotNullParameter(responseCode, "responseCode");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.responseCode = responseCode;
            this.msg = msg;
        }
    }
}
