package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleSubmissionRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "", "()V", ApiConstant.MODULE_TYPE_CONSENT, "IDSelection", "Scan", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Consent;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$IDSelection;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Scan;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ModuleData {
    public static final int $stable = 0;

    public /* synthetic */ ModuleData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ModuleData() {
    }

    /* compiled from: ModuleSubmissionRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$IDSelection;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "idType", "", "(Ljava/lang/String;)V", "getIdType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IDSelection extends ModuleData {
        public static final int $stable = 0;
        private final String idType;

        public static /* synthetic */ IDSelection copy$default(IDSelection iDSelection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iDSelection.idType;
            }
            return iDSelection.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        public final IDSelection copy(String idType) {
            Intrinsics.checkNotNullParameter(idType, "idType");
            return new IDSelection(idType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IDSelection) && Intrinsics.areEqual(this.idType, ((IDSelection) other).idType);
        }

        public int hashCode() {
            return this.idType.hashCode();
        }

        public String toString() {
            return "IDSelection(idType=" + this.idType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IDSelection(String idType) {
            super(null);
            Intrinsics.checkNotNullParameter(idType, "idType");
            this.idType = idType;
        }

        public final String getIdType() {
            return this.idType;
        }
    }

    /* compiled from: ModuleSubmissionRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Consent;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "consentStatus", "", "(Ljava/lang/String;)V", "getConsentStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Consent extends ModuleData {
        public static final int $stable = 0;
        private final String consentStatus;

        public static /* synthetic */ Consent copy$default(Consent consent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = consent.consentStatus;
            }
            return consent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final Consent copy(String consentStatus) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            return new Consent(consentStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Consent) && Intrinsics.areEqual(this.consentStatus, ((Consent) other).consentStatus);
        }

        public int hashCode() {
            return this.consentStatus.hashCode();
        }

        public String toString() {
            return "Consent(consentStatus=" + this.consentStatus + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Consent(String consentStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            this.consentStatus = consentStatus;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }
    }

    /* compiled from: ModuleSubmissionRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Scan;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "captureDelta", "", "captureEngine", "(Ljava/lang/String;Ljava/lang/String;)V", "getCaptureDelta", "()Ljava/lang/String;", "getCaptureEngine", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Scan extends ModuleData {
        public static final int $stable = 0;
        private final String captureDelta;
        private final String captureEngine;

        public static /* synthetic */ Scan copy$default(Scan scan, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scan.captureDelta;
            }
            if ((i & 2) != 0) {
                str2 = scan.captureEngine;
            }
            return scan.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCaptureDelta() {
            return this.captureDelta;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCaptureEngine() {
            return this.captureEngine;
        }

        public final Scan copy(String captureDelta, String captureEngine) {
            Intrinsics.checkNotNullParameter(captureDelta, "captureDelta");
            Intrinsics.checkNotNullParameter(captureEngine, "captureEngine");
            return new Scan(captureDelta, captureEngine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scan)) {
                return false;
            }
            Scan scan = (Scan) other;
            return Intrinsics.areEqual(this.captureDelta, scan.captureDelta) && Intrinsics.areEqual(this.captureEngine, scan.captureEngine);
        }

        public int hashCode() {
            return (this.captureDelta.hashCode() * 31) + this.captureEngine.hashCode();
        }

        public String toString() {
            return "Scan(captureDelta=" + this.captureDelta + ", captureEngine=" + this.captureEngine + ")";
        }

        public final String getCaptureDelta() {
            return this.captureDelta;
        }

        public final String getCaptureEngine() {
            return this.captureEngine;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scan(String captureDelta, String captureEngine) {
            super(null);
            Intrinsics.checkNotNullParameter(captureDelta, "captureDelta");
            Intrinsics.checkNotNullParameter(captureEngine, "captureEngine");
            this.captureDelta = captureDelta;
            this.captureEngine = captureEngine;
        }
    }
}
