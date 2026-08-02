package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/DocumentTypes;", "", "documentTypes", "", "", "(Ljava/util/List;)V", "getDocumentTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DocumentTypes {
    public static final int $stable = 8;
    private final List<String> documentTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentTypes copy$default(DocumentTypes documentTypes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = documentTypes.documentTypes;
        }
        return documentTypes.copy(list);
    }

    public final List<String> component1() {
        return this.documentTypes;
    }

    public final DocumentTypes copy(List<String> documentTypes) {
        return new DocumentTypes(documentTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentTypes) && Intrinsics.areEqual(this.documentTypes, ((DocumentTypes) other).documentTypes);
    }

    public int hashCode() {
        List<String> list = this.documentTypes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "DocumentTypes(documentTypes=" + this.documentTypes + ")";
    }

    public DocumentTypes(List<String> list) {
        this.documentTypes = list;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }
}
