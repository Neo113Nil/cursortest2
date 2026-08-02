package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MobileLabels;", "", "documentDescription", "", "optionsFileSize", "uploadDocumentButton", "scanDocumentButton", "previewWarning", "nextDocument", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentDescription", "()Ljava/lang/String;", "getNextDocument", "getOptionsFileSize", "getPreviewWarning", "getScanDocumentButton", "getUploadDocumentButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MobileLabels {
    public static final int $stable = 0;
    private final String documentDescription;
    private final String nextDocument;
    private final String optionsFileSize;
    private final String previewWarning;
    private final String scanDocumentButton;
    private final String uploadDocumentButton;

    public static /* synthetic */ MobileLabels copy$default(MobileLabels mobileLabels, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileLabels.documentDescription;
        }
        if ((i & 2) != 0) {
            str2 = mobileLabels.optionsFileSize;
        }
        if ((i & 4) != 0) {
            str3 = mobileLabels.uploadDocumentButton;
        }
        if ((i & 8) != 0) {
            str4 = mobileLabels.scanDocumentButton;
        }
        if ((i & 16) != 0) {
            str5 = mobileLabels.previewWarning;
        }
        if ((i & 32) != 0) {
            str6 = mobileLabels.nextDocument;
        }
        String str7 = str5;
        String str8 = str6;
        return mobileLabels.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOptionsFileSize() {
        return this.optionsFileSize;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUploadDocumentButton() {
        return this.uploadDocumentButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScanDocumentButton() {
        return this.scanDocumentButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPreviewWarning() {
        return this.previewWarning;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNextDocument() {
        return this.nextDocument;
    }

    public final MobileLabels copy(String documentDescription, String optionsFileSize, String uploadDocumentButton, String scanDocumentButton, String previewWarning, String nextDocument) {
        return new MobileLabels(documentDescription, optionsFileSize, uploadDocumentButton, scanDocumentButton, previewWarning, nextDocument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLabels)) {
            return false;
        }
        MobileLabels mobileLabels = (MobileLabels) other;
        return Intrinsics.areEqual(this.documentDescription, mobileLabels.documentDescription) && Intrinsics.areEqual(this.optionsFileSize, mobileLabels.optionsFileSize) && Intrinsics.areEqual(this.uploadDocumentButton, mobileLabels.uploadDocumentButton) && Intrinsics.areEqual(this.scanDocumentButton, mobileLabels.scanDocumentButton) && Intrinsics.areEqual(this.previewWarning, mobileLabels.previewWarning) && Intrinsics.areEqual(this.nextDocument, mobileLabels.nextDocument);
    }

    public int hashCode() {
        String str = this.documentDescription;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.optionsFileSize;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uploadDocumentButton;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scanDocumentButton;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previewWarning;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nextDocument;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "MobileLabels(documentDescription=" + this.documentDescription + ", optionsFileSize=" + this.optionsFileSize + ", uploadDocumentButton=" + this.uploadDocumentButton + ", scanDocumentButton=" + this.scanDocumentButton + ", previewWarning=" + this.previewWarning + ", nextDocument=" + this.nextDocument + ")";
    }

    public MobileLabels(String str, String str2, String str3, String str4, String str5, String str6) {
        this.documentDescription = str;
        this.optionsFileSize = str2;
        this.uploadDocumentButton = str3;
        this.scanDocumentButton = str4;
        this.previewWarning = str5;
        this.nextDocument = str6;
    }

    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    public final String getOptionsFileSize() {
        return this.optionsFileSize;
    }

    public final String getUploadDocumentButton() {
        return this.uploadDocumentButton;
    }

    public final String getScanDocumentButton() {
        return this.scanDocumentButton;
    }

    public final String getPreviewWarning() {
        return this.previewWarning;
    }

    public final String getNextDocument() {
        return this.nextDocument;
    }
}
