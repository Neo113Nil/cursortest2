package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IUnstructuredDocUploadViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel;", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/UnstructuredDocUploadEvent;", "State", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IUnstructuredDocUploadViewModel {
    StateFlow<State> getState();

    void onEvent(UnstructuredDocUploadEvent event);

    /* compiled from: IUnstructuredDocUploadViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;", "", CodePushConstants.PENDING_UPDATE_IS_LOADING_KEY, "", "canUpload", "canCapture", "uploadFileTypes", "", "", "currentStep", "", "totalSteps", "labels", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State$Labels;", "(ZZZLjava/util/List;IILcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State$Labels;)V", "getCanCapture", "()Z", "getCanUpload", "getCurrentStep", "()I", "getLabels", "()Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State$Labels;", "getTotalSteps", "getUploadFileTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Labels", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final boolean canCapture;
        private final boolean canUpload;
        private final int currentStep;
        private final boolean isLoading;
        private final Labels labels;
        private final int totalSteps;
        private final List<String> uploadFileTypes;

        public State() {
            this(false, false, false, null, 0, 0, null, 127, null);
        }

        public static /* synthetic */ State copy$default(State state, boolean z, boolean z2, boolean z3, List list, int i, int i2, Labels labels, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = state.isLoading;
            }
            if ((i3 & 2) != 0) {
                z2 = state.canUpload;
            }
            if ((i3 & 4) != 0) {
                z3 = state.canCapture;
            }
            if ((i3 & 8) != 0) {
                list = state.uploadFileTypes;
            }
            if ((i3 & 16) != 0) {
                i = state.currentStep;
            }
            if ((i3 & 32) != 0) {
                i2 = state.totalSteps;
            }
            if ((i3 & 64) != 0) {
                labels = state.labels;
            }
            int i4 = i2;
            Labels labels2 = labels;
            int i5 = i;
            boolean z4 = z3;
            return state.copy(z, z2, z4, list, i5, i4, labels2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanUpload() {
            return this.canUpload;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanCapture() {
            return this.canCapture;
        }

        public final List<String> component4() {
            return this.uploadFileTypes;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCurrentStep() {
            return this.currentStep;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotalSteps() {
            return this.totalSteps;
        }

        /* renamed from: component7, reason: from getter */
        public final Labels getLabels() {
            return this.labels;
        }

        public final State copy(boolean isLoading, boolean canUpload, boolean canCapture, List<String> uploadFileTypes, int currentStep, int totalSteps, Labels labels) {
            Intrinsics.checkNotNullParameter(uploadFileTypes, "uploadFileTypes");
            Intrinsics.checkNotNullParameter(labels, "labels");
            return new State(isLoading, canUpload, canCapture, uploadFileTypes, currentStep, totalSteps, labels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.isLoading == state.isLoading && this.canUpload == state.canUpload && this.canCapture == state.canCapture && Intrinsics.areEqual(this.uploadFileTypes, state.uploadFileTypes) && this.currentStep == state.currentStep && this.totalSteps == state.totalSteps && Intrinsics.areEqual(this.labels, state.labels);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.canUpload;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            boolean z2 = this.canCapture;
            return ((((((((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.uploadFileTypes.hashCode()) * 31) + Integer.hashCode(this.currentStep)) * 31) + Integer.hashCode(this.totalSteps)) * 31) + this.labels.hashCode();
        }

        public String toString() {
            return "State(isLoading=" + this.isLoading + ", canUpload=" + this.canUpload + ", canCapture=" + this.canCapture + ", uploadFileTypes=" + this.uploadFileTypes + ", currentStep=" + this.currentStep + ", totalSteps=" + this.totalSteps + ", labels=" + this.labels + ")";
        }

        public State(boolean z, boolean z2, boolean z3, List<String> uploadFileTypes, int i, int i2, Labels labels) {
            Intrinsics.checkNotNullParameter(uploadFileTypes, "uploadFileTypes");
            Intrinsics.checkNotNullParameter(labels, "labels");
            this.isLoading = z;
            this.canUpload = z2;
            this.canCapture = z3;
            this.uploadFileTypes = uploadFileTypes;
            this.currentStep = i;
            this.totalSteps = i2;
            this.labels = labels;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean getCanUpload() {
            return this.canUpload;
        }

        public final boolean getCanCapture() {
            return this.canCapture;
        }

        public /* synthetic */ State(boolean z, boolean z2, boolean z3, List list, int i, int i2, Labels labels, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) == 0 ? z3 : false, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list, (i3 & 16) != 0 ? 1 : i, (i3 & 32) == 0 ? i2 : 1, (i3 & 64) != 0 ? new Labels(null, null, null, null, null, null, null, null, 255, null) : labels);
        }

        public final List<String> getUploadFileTypes() {
            return this.uploadFileTypes;
        }

        public final int getCurrentStep() {
            return this.currentStep;
        }

        public final int getTotalSteps() {
            return this.totalSteps;
        }

        public final Labels getLabels() {
            return this.labels;
        }

        /* compiled from: IUnstructuredDocUploadViewModel.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State$Labels;", "", "document", "", "primaryText", "documentsCollected", "secondaryText", "tertiaryText", "tertiaryAnnotation", "uploadDocumentButton", "scanDocumentButton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocument", "()Ljava/lang/String;", "getDocumentsCollected", "getPrimaryText", "getScanDocumentButton", "getSecondaryText", "getTertiaryAnnotation", "getTertiaryText", "getUploadDocumentButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Labels {
            public static final int $stable = 0;
            private final String document;
            private final String documentsCollected;
            private final String primaryText;
            private final String scanDocumentButton;
            private final String secondaryText;
            private final String tertiaryAnnotation;
            private final String tertiaryText;
            private final String uploadDocumentButton;

            public Labels() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public static /* synthetic */ Labels copy$default(Labels labels, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = labels.document;
                }
                if ((i & 2) != 0) {
                    str2 = labels.primaryText;
                }
                if ((i & 4) != 0) {
                    str3 = labels.documentsCollected;
                }
                if ((i & 8) != 0) {
                    str4 = labels.secondaryText;
                }
                if ((i & 16) != 0) {
                    str5 = labels.tertiaryText;
                }
                if ((i & 32) != 0) {
                    str6 = labels.tertiaryAnnotation;
                }
                if ((i & 64) != 0) {
                    str7 = labels.uploadDocumentButton;
                }
                if ((i & 128) != 0) {
                    str8 = labels.scanDocumentButton;
                }
                String str9 = str7;
                String str10 = str8;
                String str11 = str5;
                String str12 = str6;
                return labels.copy(str, str2, str3, str4, str11, str12, str9, str10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDocument() {
                return this.document;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPrimaryText() {
                return this.primaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDocumentsCollected() {
                return this.documentsCollected;
            }

            /* renamed from: component4, reason: from getter */
            public final String getSecondaryText() {
                return this.secondaryText;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTertiaryText() {
                return this.tertiaryText;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTertiaryAnnotation() {
                return this.tertiaryAnnotation;
            }

            /* renamed from: component7, reason: from getter */
            public final String getUploadDocumentButton() {
                return this.uploadDocumentButton;
            }

            /* renamed from: component8, reason: from getter */
            public final String getScanDocumentButton() {
                return this.scanDocumentButton;
            }

            public final Labels copy(String document, String primaryText, String documentsCollected, String secondaryText, String tertiaryText, String tertiaryAnnotation, String uploadDocumentButton, String scanDocumentButton) {
                return new Labels(document, primaryText, documentsCollected, secondaryText, tertiaryText, tertiaryAnnotation, uploadDocumentButton, scanDocumentButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Labels)) {
                    return false;
                }
                Labels labels = (Labels) other;
                return Intrinsics.areEqual(this.document, labels.document) && Intrinsics.areEqual(this.primaryText, labels.primaryText) && Intrinsics.areEqual(this.documentsCollected, labels.documentsCollected) && Intrinsics.areEqual(this.secondaryText, labels.secondaryText) && Intrinsics.areEqual(this.tertiaryText, labels.tertiaryText) && Intrinsics.areEqual(this.tertiaryAnnotation, labels.tertiaryAnnotation) && Intrinsics.areEqual(this.uploadDocumentButton, labels.uploadDocumentButton) && Intrinsics.areEqual(this.scanDocumentButton, labels.scanDocumentButton);
            }

            public int hashCode() {
                String str = this.document;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.primaryText;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.documentsCollected;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.secondaryText;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.tertiaryText;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.tertiaryAnnotation;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.uploadDocumentButton;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.scanDocumentButton;
                return hashCode7 + (str8 != null ? str8.hashCode() : 0);
            }

            public String toString() {
                return "Labels(document=" + this.document + ", primaryText=" + this.primaryText + ", documentsCollected=" + this.documentsCollected + ", secondaryText=" + this.secondaryText + ", tertiaryText=" + this.tertiaryText + ", tertiaryAnnotation=" + this.tertiaryAnnotation + ", uploadDocumentButton=" + this.uploadDocumentButton + ", scanDocumentButton=" + this.scanDocumentButton + ")";
            }

            public Labels(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                this.document = str;
                this.primaryText = str2;
                this.documentsCollected = str3;
                this.secondaryText = str4;
                this.tertiaryText = str5;
                this.tertiaryAnnotation = str6;
                this.uploadDocumentButton = str7;
                this.scanDocumentButton = str8;
            }

            public /* synthetic */ Labels(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
            }

            public final String getDocument() {
                return this.document;
            }

            public final String getPrimaryText() {
                return this.primaryText;
            }

            public final String getDocumentsCollected() {
                return this.documentsCollected;
            }

            public final String getSecondaryText() {
                return this.secondaryText;
            }

            public final String getTertiaryText() {
                return this.tertiaryText;
            }

            public final String getTertiaryAnnotation() {
                return this.tertiaryAnnotation;
            }

            public final String getUploadDocumentButton() {
                return this.uploadDocumentButton;
            }

            public final String getScanDocumentButton() {
                return this.scanDocumentButton;
            }
        }
    }
}
