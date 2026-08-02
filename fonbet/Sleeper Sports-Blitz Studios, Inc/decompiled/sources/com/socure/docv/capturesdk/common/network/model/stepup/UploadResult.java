package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "", "error", "", "errorCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UploadResult {
    public static final int $stable = 8;
    private String error;
    private Integer errorCode;

    public static /* synthetic */ UploadResult copy$default(UploadResult uploadResult, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadResult.error;
        }
        if ((i & 2) != 0) {
            num = uploadResult.errorCode;
        }
        return uploadResult.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final UploadResult copy(String error, Integer errorCode) {
        return new UploadResult(error, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadResult)) {
            return false;
        }
        UploadResult uploadResult = (UploadResult) other;
        return Intrinsics.areEqual(this.error, uploadResult.error) && Intrinsics.areEqual(this.errorCode, uploadResult.errorCode);
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.errorCode;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UploadResult(error=" + this.error + ", errorCode=" + this.errorCode + ")";
    }

    public UploadResult(String str, Integer num) {
        this.error = str;
        this.errorCode = num;
    }

    public final String getError() {
        return this.error;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }
}
