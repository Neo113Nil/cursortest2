package com.socure.docv.capturesdk.common.analytics.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Documents;", "", "documentBack", "Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "documentFront", "selfPortrait", "(Lcom/socure/docv/capturesdk/common/analytics/model/Document;Lcom/socure/docv/capturesdk/common/analytics/model/Document;Lcom/socure/docv/capturesdk/common/analytics/model/Document;)V", "getDocumentBack", "()Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "setDocumentBack", "(Lcom/socure/docv/capturesdk/common/analytics/model/Document;)V", "getDocumentFront", "setDocumentFront", "getSelfPortrait", "setSelfPortrait", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Documents {
    public static final int $stable = 8;
    private Document documentBack;
    private Document documentFront;
    private Document selfPortrait;

    public Documents() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Documents copy$default(Documents documents, Document document, Document document2, Document document3, int i, Object obj) {
        if ((i & 1) != 0) {
            document = documents.documentBack;
        }
        if ((i & 2) != 0) {
            document2 = documents.documentFront;
        }
        if ((i & 4) != 0) {
            document3 = documents.selfPortrait;
        }
        return documents.copy(document, document2, document3);
    }

    /* renamed from: component1, reason: from getter */
    public final Document getDocumentBack() {
        return this.documentBack;
    }

    /* renamed from: component2, reason: from getter */
    public final Document getDocumentFront() {
        return this.documentFront;
    }

    /* renamed from: component3, reason: from getter */
    public final Document getSelfPortrait() {
        return this.selfPortrait;
    }

    public final Documents copy(Document documentBack, Document documentFront, Document selfPortrait) {
        return new Documents(documentBack, documentFront, selfPortrait);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Documents)) {
            return false;
        }
        Documents documents = (Documents) other;
        return Intrinsics.areEqual(this.documentBack, documents.documentBack) && Intrinsics.areEqual(this.documentFront, documents.documentFront) && Intrinsics.areEqual(this.selfPortrait, documents.selfPortrait);
    }

    public int hashCode() {
        Document document = this.documentBack;
        int hashCode = (document == null ? 0 : document.hashCode()) * 31;
        Document document2 = this.documentFront;
        int hashCode2 = (hashCode + (document2 == null ? 0 : document2.hashCode())) * 31;
        Document document3 = this.selfPortrait;
        return hashCode2 + (document3 != null ? document3.hashCode() : 0);
    }

    public String toString() {
        return "Documents(documentBack=" + this.documentBack + ", documentFront=" + this.documentFront + ", selfPortrait=" + this.selfPortrait + ")";
    }

    public Documents(Document document, Document document2, Document document3) {
        this.documentBack = document;
        this.documentFront = document2;
        this.selfPortrait = document3;
    }

    public /* synthetic */ Documents(Document document, Document document2, Document document3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2, (i & 4) != 0 ? null : document3);
    }

    public final Document getDocumentBack() {
        return this.documentBack;
    }

    public final void setDocumentBack(Document document) {
        this.documentBack = document;
    }

    public final Document getDocumentFront() {
        return this.documentFront;
    }

    public final void setDocumentFront(Document document) {
        this.documentFront = document;
    }

    public final Document getSelfPortrait() {
        return this.selfPortrait;
    }

    public final void setSelfPortrait(Document document) {
        this.selfPortrait = document;
    }
}
