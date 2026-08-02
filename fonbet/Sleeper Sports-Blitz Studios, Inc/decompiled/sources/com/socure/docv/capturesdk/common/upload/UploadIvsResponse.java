package com.socure.docv.capturesdk.common.upload;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadStatusState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Error", "Exception", "Loading", "Retry", "Success", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Error;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Exception;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Loading;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Retry;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Success;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class UploadIvsResponse<T> {
    public /* synthetic */ UploadIvsResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Loading;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends UploadIvsResponse {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private UploadIvsResponse() {
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success<T> extends UploadIvsResponse<T> {
        public static final int $stable = 0;
        private final T data;

        public Success(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Retry;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Retry<T> extends UploadIvsResponse<T> {
        public static final int $stable = 0;
        private final T data;

        public Retry(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Error;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "", "apiResponse", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;)V", "getApiResponse", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends UploadIvsResponse {
        public static final int $stable = 0;
        private final SocureDocVError apiResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(SocureDocVError apiResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
            this.apiResponse = apiResponse;
        }

        public final SocureDocVError getApiResponse() {
            return this.apiResponse;
        }
    }

    /* compiled from: UploadStatusState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse$Exception;", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "", "responseCode", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "msg", "", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Exception extends UploadIvsResponse {
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
