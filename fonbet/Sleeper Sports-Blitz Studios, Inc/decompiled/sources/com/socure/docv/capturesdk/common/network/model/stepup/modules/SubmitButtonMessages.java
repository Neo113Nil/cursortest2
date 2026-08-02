package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;", "", "submit", "", "retake", "processing", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProcessing", "()Ljava/lang/String;", "getRetake", "getSubmit", "getSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SubmitButtonMessages {
    public static final int $stable = 0;
    private final String processing;
    private final String retake;
    private final String submit;
    private final String success;

    public static /* synthetic */ SubmitButtonMessages copy$default(SubmitButtonMessages submitButtonMessages, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitButtonMessages.submit;
        }
        if ((i & 2) != 0) {
            str2 = submitButtonMessages.retake;
        }
        if ((i & 4) != 0) {
            str3 = submitButtonMessages.processing;
        }
        if ((i & 8) != 0) {
            str4 = submitButtonMessages.success;
        }
        return submitButtonMessages.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubmit() {
        return this.submit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRetake() {
        return this.retake;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProcessing() {
        return this.processing;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    public final SubmitButtonMessages copy(String submit, String retake, String processing, String success) {
        return new SubmitButtonMessages(submit, retake, processing, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitButtonMessages)) {
            return false;
        }
        SubmitButtonMessages submitButtonMessages = (SubmitButtonMessages) other;
        return Intrinsics.areEqual(this.submit, submitButtonMessages.submit) && Intrinsics.areEqual(this.retake, submitButtonMessages.retake) && Intrinsics.areEqual(this.processing, submitButtonMessages.processing) && Intrinsics.areEqual(this.success, submitButtonMessages.success);
    }

    public int hashCode() {
        String str = this.submit;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.retake;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.processing;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.success;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "SubmitButtonMessages(submit=" + this.submit + ", retake=" + this.retake + ", processing=" + this.processing + ", success=" + this.success + ")";
    }

    public SubmitButtonMessages(String str, String str2, String str3, String str4) {
        this.submit = str;
        this.retake = str2;
        this.processing = str3;
        this.success = str4;
    }

    public final String getSubmit() {
        return this.submit;
    }

    public final String getRetake() {
        return this.retake;
    }

    public final String getProcessing() {
        return this.processing;
    }

    public final String getSuccess() {
        return this.success;
    }
}
