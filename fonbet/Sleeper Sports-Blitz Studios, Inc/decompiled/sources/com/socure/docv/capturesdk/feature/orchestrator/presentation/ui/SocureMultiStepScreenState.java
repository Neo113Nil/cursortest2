package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureMultiStepScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/SocureMultiStepScreenState;", "", ApiConstant.DOCUMENT_TYPE, "", "primaryText", "secondaryText", "tertiaryText", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;", "primaryCtaText", "secondaryCtaText", "totalSteps", "", "currentStep", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;Ljava/lang/String;Ljava/lang/String;II)V", "getCurrentStep", "()I", "getDocumentType", "()Ljava/lang/String;", "getPrimaryCtaText", "getPrimaryText", "getSecondaryCtaText", "getSecondaryText", "getTertiaryText", "()Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;", "getTotalSteps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SocureMultiStepScreenState {
    public static final int $stable = 0;
    private final int currentStep;
    private final String documentType;
    private final String primaryCtaText;
    private final String primaryText;
    private final String secondaryCtaText;
    private final String secondaryText;
    private final TertiaryTextData tertiaryText;
    private final int totalSteps;

    public static /* synthetic */ SocureMultiStepScreenState copy$default(SocureMultiStepScreenState socureMultiStepScreenState, String str, String str2, String str3, TertiaryTextData tertiaryTextData, String str4, String str5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = socureMultiStepScreenState.documentType;
        }
        if ((i3 & 2) != 0) {
            str2 = socureMultiStepScreenState.primaryText;
        }
        if ((i3 & 4) != 0) {
            str3 = socureMultiStepScreenState.secondaryText;
        }
        if ((i3 & 8) != 0) {
            tertiaryTextData = socureMultiStepScreenState.tertiaryText;
        }
        if ((i3 & 16) != 0) {
            str4 = socureMultiStepScreenState.primaryCtaText;
        }
        if ((i3 & 32) != 0) {
            str5 = socureMultiStepScreenState.secondaryCtaText;
        }
        if ((i3 & 64) != 0) {
            i = socureMultiStepScreenState.totalSteps;
        }
        if ((i3 & 128) != 0) {
            i2 = socureMultiStepScreenState.currentStep;
        }
        int i4 = i;
        int i5 = i2;
        String str6 = str4;
        String str7 = str5;
        return socureMultiStepScreenState.copy(str, str2, str3, tertiaryTextData, str6, str7, i4, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final TertiaryTextData getTertiaryText() {
        return this.tertiaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final SocureMultiStepScreenState copy(String documentType, String primaryText, String secondaryText, TertiaryTextData tertiaryText, String primaryCtaText, String secondaryCtaText, int totalSteps, int currentStep) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        return new SocureMultiStepScreenState(documentType, primaryText, secondaryText, tertiaryText, primaryCtaText, secondaryCtaText, totalSteps, currentStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocureMultiStepScreenState)) {
            return false;
        }
        SocureMultiStepScreenState socureMultiStepScreenState = (SocureMultiStepScreenState) other;
        return Intrinsics.areEqual(this.documentType, socureMultiStepScreenState.documentType) && Intrinsics.areEqual(this.primaryText, socureMultiStepScreenState.primaryText) && Intrinsics.areEqual(this.secondaryText, socureMultiStepScreenState.secondaryText) && Intrinsics.areEqual(this.tertiaryText, socureMultiStepScreenState.tertiaryText) && Intrinsics.areEqual(this.primaryCtaText, socureMultiStepScreenState.primaryCtaText) && Intrinsics.areEqual(this.secondaryCtaText, socureMultiStepScreenState.secondaryCtaText) && this.totalSteps == socureMultiStepScreenState.totalSteps && this.currentStep == socureMultiStepScreenState.currentStep;
    }

    public int hashCode() {
        int hashCode = ((this.documentType.hashCode() * 31) + this.primaryText.hashCode()) * 31;
        String str = this.secondaryText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TertiaryTextData tertiaryTextData = this.tertiaryText;
        int hashCode3 = (((hashCode2 + (tertiaryTextData == null ? 0 : tertiaryTextData.hashCode())) * 31) + this.primaryCtaText.hashCode()) * 31;
        String str2 = this.secondaryCtaText;
        return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Integer.hashCode(this.currentStep);
    }

    public String toString() {
        return "SocureMultiStepScreenState(documentType=" + this.documentType + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", tertiaryText=" + this.tertiaryText + ", primaryCtaText=" + this.primaryCtaText + ", secondaryCtaText=" + this.secondaryCtaText + ", totalSteps=" + this.totalSteps + ", currentStep=" + this.currentStep + ")";
    }

    public SocureMultiStepScreenState(String documentType, String primaryText, String str, TertiaryTextData tertiaryTextData, String primaryCtaText, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        this.documentType = documentType;
        this.primaryText = primaryText;
        this.secondaryText = str;
        this.tertiaryText = tertiaryTextData;
        this.primaryCtaText = primaryCtaText;
        this.secondaryCtaText = str2;
        this.totalSteps = i;
        this.currentStep = i2;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final TertiaryTextData getTertiaryText() {
        return this.tertiaryText;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }
}
