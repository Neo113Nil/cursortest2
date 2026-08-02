package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;", "", "submitImageForValidation", "", "validatingImage", "invalidImage", "imageValidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageValidated", "()Ljava/lang/String;", "getInvalidImage", "getSubmitImageForValidation", "getValidatingImage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PreviewMessages {
    public static final int $stable = 0;
    private final String imageValidated;
    private final String invalidImage;
    private final String submitImageForValidation;
    private final String validatingImage;

    public static /* synthetic */ PreviewMessages copy$default(PreviewMessages previewMessages, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewMessages.submitImageForValidation;
        }
        if ((i & 2) != 0) {
            str2 = previewMessages.validatingImage;
        }
        if ((i & 4) != 0) {
            str3 = previewMessages.invalidImage;
        }
        if ((i & 8) != 0) {
            str4 = previewMessages.imageValidated;
        }
        return previewMessages.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValidatingImage() {
        return this.validatingImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInvalidImage() {
        return this.invalidImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageValidated() {
        return this.imageValidated;
    }

    public final PreviewMessages copy(String submitImageForValidation, String validatingImage, String invalidImage, String imageValidated) {
        return new PreviewMessages(submitImageForValidation, validatingImage, invalidImage, imageValidated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewMessages)) {
            return false;
        }
        PreviewMessages previewMessages = (PreviewMessages) other;
        return Intrinsics.areEqual(this.submitImageForValidation, previewMessages.submitImageForValidation) && Intrinsics.areEqual(this.validatingImage, previewMessages.validatingImage) && Intrinsics.areEqual(this.invalidImage, previewMessages.invalidImage) && Intrinsics.areEqual(this.imageValidated, previewMessages.imageValidated);
    }

    public int hashCode() {
        String str = this.submitImageForValidation;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.validatingImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invalidImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageValidated;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PreviewMessages(submitImageForValidation=" + this.submitImageForValidation + ", validatingImage=" + this.validatingImage + ", invalidImage=" + this.invalidImage + ", imageValidated=" + this.imageValidated + ")";
    }

    public PreviewMessages(String str, String str2, String str3, String str4) {
        this.submitImageForValidation = str;
        this.validatingImage = str2;
        this.invalidImage = str3;
        this.imageValidated = str4;
    }

    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    public final String getValidatingImage() {
        return this.validatingImage;
    }

    public final String getInvalidImage() {
        return this.invalidImage;
    }

    public final String getImageValidated() {
        return this.imageValidated;
    }
}
