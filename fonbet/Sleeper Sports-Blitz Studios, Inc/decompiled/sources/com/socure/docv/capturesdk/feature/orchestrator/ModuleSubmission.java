package com.socure.docv.capturesdk.feature.orchestrator;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;

/* compiled from: ModuleSubmission.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "", "()V", "BackID", ApiConstant.MODULE_TYPE_CONSENT, "Finished", "FrontID", "IDSelection", "Landing", ApiConstant.MODULE_TYPE_PASSPORT, ApiConstant.MODULE_TYPE_SELFIE, "Transition", "Unstructured", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$BackID;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Consent;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Finished;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$FrontID;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Landing;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Passport;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Selfie;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Transition;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Unstructured;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ModuleSubmission {
    public static final int $stable = 0;

    public /* synthetic */ ModuleSubmission(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ModuleSubmission() {
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Landing;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Landing extends ModuleSubmission {
        public static final int $stable = 0;
        public static final Landing INSTANCE = new Landing();

        private Landing() {
            super(null);
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Transition;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transition extends ModuleSubmission {
        public static final int $stable = 0;
        public static final Transition INSTANCE = new Transition();

        private Transition() {
            super(null);
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Consent;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "accepted", "", "(Z)V", "getAccepted", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Consent extends ModuleSubmission {
        public static final int $stable = 0;
        private final boolean accepted;

        public static /* synthetic */ Consent copy$default(Consent consent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = consent.accepted;
            }
            return consent.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAccepted() {
            return this.accepted;
        }

        public final Consent copy(boolean accepted) {
            return new Consent(accepted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Consent) && this.accepted == ((Consent) other).accepted;
        }

        public int hashCode() {
            boolean z = this.accepted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Consent(accepted=" + this.accepted + ")";
        }

        public Consent(boolean z) {
            super(null);
            this.accepted = z;
        }

        public final boolean getAccepted() {
            return this.accepted;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "type", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection$Type;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection$Type;)V", "getType", "()Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection$Type;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Type", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IDSelection extends ModuleSubmission {
        public static final int $stable = 0;
        private final Type type;

        public static /* synthetic */ IDSelection copy$default(IDSelection iDSelection, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                type = iDSelection.type;
            }
            return iDSelection.copy(type);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public final IDSelection copy(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new IDSelection(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IDSelection) && this.type == ((IDSelection) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "IDSelection(type=" + this.type + ")";
        }

        /* compiled from: ModuleSubmission.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$IDSelection$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ID_CARD", "PASSPORT", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Type {
            ID_CARD("id_card"),
            PASSPORT("passport");

            private final String value;

            Type(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IDSelection(Type type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public final Type getType() {
            return this.type;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$FrontID;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "getMetricsData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FrontID extends ModuleSubmission {
        public static final int $stable = 8;
        private final MultipartBody.Part documentBody;
        private final MultipartBody.Part metricsData;

        public static /* synthetic */ FrontID copy$default(FrontID frontID, MultipartBody.Part part, MultipartBody.Part part2, int i, Object obj) {
            if ((i & 1) != 0) {
                part = frontID.documentBody;
            }
            if ((i & 2) != 0) {
                part2 = frontID.metricsData;
            }
            return frontID.copy(part, part2);
        }

        /* renamed from: component1, reason: from getter */
        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        /* renamed from: component2, reason: from getter */
        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        public final FrontID copy(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            return new FrontID(documentBody, metricsData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrontID)) {
                return false;
            }
            FrontID frontID = (FrontID) other;
            return Intrinsics.areEqual(this.documentBody, frontID.documentBody) && Intrinsics.areEqual(this.metricsData, frontID.metricsData);
        }

        public int hashCode() {
            int hashCode = this.documentBody.hashCode() * 31;
            MultipartBody.Part part = this.metricsData;
            return hashCode + (part == null ? 0 : part.hashCode());
        }

        public String toString() {
            return "FrontID(documentBody=" + this.documentBody + ", metricsData=" + this.metricsData + ")";
        }

        public /* synthetic */ FrontID(MultipartBody.Part part, MultipartBody.Part part2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(part, (i & 2) != 0 ? null : part2);
        }

        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrontID(MultipartBody.Part documentBody, MultipartBody.Part part) {
            super(null);
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            this.documentBody = documentBody;
            this.metricsData = part;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$BackID;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "getMetricsData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BackID extends ModuleSubmission {
        public static final int $stable = 8;
        private final MultipartBody.Part documentBody;
        private final MultipartBody.Part metricsData;

        public static /* synthetic */ BackID copy$default(BackID backID, MultipartBody.Part part, MultipartBody.Part part2, int i, Object obj) {
            if ((i & 1) != 0) {
                part = backID.documentBody;
            }
            if ((i & 2) != 0) {
                part2 = backID.metricsData;
            }
            return backID.copy(part, part2);
        }

        /* renamed from: component1, reason: from getter */
        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        /* renamed from: component2, reason: from getter */
        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        public final BackID copy(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            return new BackID(documentBody, metricsData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackID)) {
                return false;
            }
            BackID backID = (BackID) other;
            return Intrinsics.areEqual(this.documentBody, backID.documentBody) && Intrinsics.areEqual(this.metricsData, backID.metricsData);
        }

        public int hashCode() {
            int hashCode = this.documentBody.hashCode() * 31;
            MultipartBody.Part part = this.metricsData;
            return hashCode + (part == null ? 0 : part.hashCode());
        }

        public String toString() {
            return "BackID(documentBody=" + this.documentBody + ", metricsData=" + this.metricsData + ")";
        }

        public /* synthetic */ BackID(MultipartBody.Part part, MultipartBody.Part part2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(part, (i & 2) != 0 ? null : part2);
        }

        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackID(MultipartBody.Part documentBody, MultipartBody.Part part) {
            super(null);
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            this.documentBody = documentBody;
            this.metricsData = part;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Passport;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "getMetricsData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Passport extends ModuleSubmission {
        public static final int $stable = 8;
        private final MultipartBody.Part documentBody;
        private final MultipartBody.Part metricsData;

        public static /* synthetic */ Passport copy$default(Passport passport, MultipartBody.Part part, MultipartBody.Part part2, int i, Object obj) {
            if ((i & 1) != 0) {
                part = passport.documentBody;
            }
            if ((i & 2) != 0) {
                part2 = passport.metricsData;
            }
            return passport.copy(part, part2);
        }

        /* renamed from: component1, reason: from getter */
        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        /* renamed from: component2, reason: from getter */
        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        public final Passport copy(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            return new Passport(documentBody, metricsData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passport)) {
                return false;
            }
            Passport passport = (Passport) other;
            return Intrinsics.areEqual(this.documentBody, passport.documentBody) && Intrinsics.areEqual(this.metricsData, passport.metricsData);
        }

        public int hashCode() {
            int hashCode = this.documentBody.hashCode() * 31;
            MultipartBody.Part part = this.metricsData;
            return hashCode + (part == null ? 0 : part.hashCode());
        }

        public String toString() {
            return "Passport(documentBody=" + this.documentBody + ", metricsData=" + this.metricsData + ")";
        }

        public /* synthetic */ Passport(MultipartBody.Part part, MultipartBody.Part part2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(part, (i & 2) != 0 ? null : part2);
        }

        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Passport(MultipartBody.Part documentBody, MultipartBody.Part part) {
            super(null);
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            this.documentBody = documentBody;
            this.metricsData = part;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Selfie;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "getMetricsData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Selfie extends ModuleSubmission {
        public static final int $stable = 8;
        private final MultipartBody.Part documentBody;
        private final MultipartBody.Part metricsData;

        public static /* synthetic */ Selfie copy$default(Selfie selfie, MultipartBody.Part part, MultipartBody.Part part2, int i, Object obj) {
            if ((i & 1) != 0) {
                part = selfie.documentBody;
            }
            if ((i & 2) != 0) {
                part2 = selfie.metricsData;
            }
            return selfie.copy(part, part2);
        }

        /* renamed from: component1, reason: from getter */
        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        /* renamed from: component2, reason: from getter */
        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        public final Selfie copy(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            return new Selfie(documentBody, metricsData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selfie)) {
                return false;
            }
            Selfie selfie = (Selfie) other;
            return Intrinsics.areEqual(this.documentBody, selfie.documentBody) && Intrinsics.areEqual(this.metricsData, selfie.metricsData);
        }

        public int hashCode() {
            int hashCode = this.documentBody.hashCode() * 31;
            MultipartBody.Part part = this.metricsData;
            return hashCode + (part == null ? 0 : part.hashCode());
        }

        public String toString() {
            return "Selfie(documentBody=" + this.documentBody + ", metricsData=" + this.metricsData + ")";
        }

        public /* synthetic */ Selfie(MultipartBody.Part part, MultipartBody.Part part2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(part, (i & 2) != 0 ? null : part2);
        }

        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(MultipartBody.Part documentBody, MultipartBody.Part part) {
            super(null);
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            this.documentBody = documentBody;
            this.metricsData = part;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Unstructured;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "getMetricsData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Unstructured extends ModuleSubmission {
        public static final int $stable = 8;
        private final MultipartBody.Part documentBody;
        private final MultipartBody.Part metricsData;

        public static /* synthetic */ Unstructured copy$default(Unstructured unstructured, MultipartBody.Part part, MultipartBody.Part part2, int i, Object obj) {
            if ((i & 1) != 0) {
                part = unstructured.documentBody;
            }
            if ((i & 2) != 0) {
                part2 = unstructured.metricsData;
            }
            return unstructured.copy(part, part2);
        }

        /* renamed from: component1, reason: from getter */
        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        /* renamed from: component2, reason: from getter */
        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        public final Unstructured copy(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            return new Unstructured(documentBody, metricsData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unstructured)) {
                return false;
            }
            Unstructured unstructured = (Unstructured) other;
            return Intrinsics.areEqual(this.documentBody, unstructured.documentBody) && Intrinsics.areEqual(this.metricsData, unstructured.metricsData);
        }

        public int hashCode() {
            int hashCode = this.documentBody.hashCode() * 31;
            MultipartBody.Part part = this.metricsData;
            return hashCode + (part == null ? 0 : part.hashCode());
        }

        public String toString() {
            return "Unstructured(documentBody=" + this.documentBody + ", metricsData=" + this.metricsData + ")";
        }

        public /* synthetic */ Unstructured(MultipartBody.Part part, MultipartBody.Part part2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(part, (i & 2) != 0 ? null : part2);
        }

        public final MultipartBody.Part getDocumentBody() {
            return this.documentBody;
        }

        public final MultipartBody.Part getMetricsData() {
            return this.metricsData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unstructured(MultipartBody.Part documentBody, MultipartBody.Part part) {
            super(null);
            Intrinsics.checkNotNullParameter(documentBody, "documentBody");
            this.documentBody = documentBody;
            this.metricsData = part;
        }
    }

    /* compiled from: ModuleSubmission.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission$Finished;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Finished extends ModuleSubmission {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        private Finished() {
            super(null);
        }
    }
}
