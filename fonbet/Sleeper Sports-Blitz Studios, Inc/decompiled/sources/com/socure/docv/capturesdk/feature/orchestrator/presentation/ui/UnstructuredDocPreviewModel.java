package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredDocPreviewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocPreviewModel;", "", "documentName", "", "fileName", "fileSize", "fileThumbnail", "Landroid/net/Uri;", "submitButtonText", "cancelButtonText", "isDocument", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V", "getCancelButtonText", "()Ljava/lang/String;", "getDocumentName", "getFileName", "getFileSize", "getFileThumbnail", "()Landroid/net/Uri;", "()Z", "getSubmitButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UnstructuredDocPreviewModel {
    public static final int $stable = 8;
    private final String cancelButtonText;
    private final String documentName;
    private final String fileName;
    private final String fileSize;
    private final Uri fileThumbnail;
    private final boolean isDocument;
    private final String submitButtonText;

    public static /* synthetic */ UnstructuredDocPreviewModel copy$default(UnstructuredDocPreviewModel unstructuredDocPreviewModel, String str, String str2, String str3, Uri uri, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unstructuredDocPreviewModel.documentName;
        }
        if ((i & 2) != 0) {
            str2 = unstructuredDocPreviewModel.fileName;
        }
        if ((i & 4) != 0) {
            str3 = unstructuredDocPreviewModel.fileSize;
        }
        if ((i & 8) != 0) {
            uri = unstructuredDocPreviewModel.fileThumbnail;
        }
        if ((i & 16) != 0) {
            str4 = unstructuredDocPreviewModel.submitButtonText;
        }
        if ((i & 32) != 0) {
            str5 = unstructuredDocPreviewModel.cancelButtonText;
        }
        if ((i & 64) != 0) {
            z = unstructuredDocPreviewModel.isDocument;
        }
        String str6 = str5;
        boolean z2 = z;
        String str7 = str4;
        String str8 = str3;
        return unstructuredDocPreviewModel.copy(str, str2, str8, uri, str7, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getFileThumbnail() {
        return this.fileThumbnail;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsDocument() {
        return this.isDocument;
    }

    public final UnstructuredDocPreviewModel copy(String documentName, String fileName, String fileSize, Uri fileThumbnail, String submitButtonText, String cancelButtonText, boolean isDocument) {
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileSize, "fileSize");
        Intrinsics.checkNotNullParameter(fileThumbnail, "fileThumbnail");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        return new UnstructuredDocPreviewModel(documentName, fileName, fileSize, fileThumbnail, submitButtonText, cancelButtonText, isDocument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnstructuredDocPreviewModel)) {
            return false;
        }
        UnstructuredDocPreviewModel unstructuredDocPreviewModel = (UnstructuredDocPreviewModel) other;
        return Intrinsics.areEqual(this.documentName, unstructuredDocPreviewModel.documentName) && Intrinsics.areEqual(this.fileName, unstructuredDocPreviewModel.fileName) && Intrinsics.areEqual(this.fileSize, unstructuredDocPreviewModel.fileSize) && Intrinsics.areEqual(this.fileThumbnail, unstructuredDocPreviewModel.fileThumbnail) && Intrinsics.areEqual(this.submitButtonText, unstructuredDocPreviewModel.submitButtonText) && Intrinsics.areEqual(this.cancelButtonText, unstructuredDocPreviewModel.cancelButtonText) && this.isDocument == unstructuredDocPreviewModel.isDocument;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.documentName.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.fileSize.hashCode()) * 31) + this.fileThumbnail.hashCode()) * 31) + this.submitButtonText.hashCode()) * 31) + this.cancelButtonText.hashCode()) * 31;
        boolean z = this.isDocument;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "UnstructuredDocPreviewModel(documentName=" + this.documentName + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileThumbnail=" + this.fileThumbnail + ", submitButtonText=" + this.submitButtonText + ", cancelButtonText=" + this.cancelButtonText + ", isDocument=" + this.isDocument + ")";
    }

    public UnstructuredDocPreviewModel(String documentName, String fileName, String fileSize, Uri fileThumbnail, String submitButtonText, String cancelButtonText, boolean z) {
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileSize, "fileSize");
        Intrinsics.checkNotNullParameter(fileThumbnail, "fileThumbnail");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.documentName = documentName;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileThumbnail = fileThumbnail;
        this.submitButtonText = submitButtonText;
        this.cancelButtonText = cancelButtonText;
        this.isDocument = z;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileSize() {
        return this.fileSize;
    }

    public final Uri getFileThumbnail() {
        return this.fileThumbnail;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final boolean isDocument() {
        return this.isDocument;
    }
}
