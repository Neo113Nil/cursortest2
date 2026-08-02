package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/models/NativeLabelsModel;", "", "pleaseWait", "", "initialisingSDK", "selectCheckBox", "unselectCheckBox", "backButtonContinueDescription", "closeButtonContinueDescription", "helpButtonContinueDescription", "manualButtonContinueDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackButtonContinueDescription", "()Ljava/lang/String;", "getCloseButtonContinueDescription", "getHelpButtonContinueDescription", "getInitialisingSDK", "getManualButtonContinueDescription", "getPleaseWait", "getSelectCheckBox", "getUnselectCheckBox", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NativeLabelsModel {
    public static final int $stable = 0;
    private final String backButtonContinueDescription;
    private final String closeButtonContinueDescription;
    private final String helpButtonContinueDescription;
    private final String initialisingSDK;
    private final String manualButtonContinueDescription;
    private final String pleaseWait;
    private final String selectCheckBox;
    private final String unselectCheckBox;

    public static /* synthetic */ NativeLabelsModel copy$default(NativeLabelsModel nativeLabelsModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLabelsModel.pleaseWait;
        }
        if ((i & 2) != 0) {
            str2 = nativeLabelsModel.initialisingSDK;
        }
        if ((i & 4) != 0) {
            str3 = nativeLabelsModel.selectCheckBox;
        }
        if ((i & 8) != 0) {
            str4 = nativeLabelsModel.unselectCheckBox;
        }
        if ((i & 16) != 0) {
            str5 = nativeLabelsModel.backButtonContinueDescription;
        }
        if ((i & 32) != 0) {
            str6 = nativeLabelsModel.closeButtonContinueDescription;
        }
        if ((i & 64) != 0) {
            str7 = nativeLabelsModel.helpButtonContinueDescription;
        }
        if ((i & 128) != 0) {
            str8 = nativeLabelsModel.manualButtonContinueDescription;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return nativeLabelsModel.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialisingSDK() {
        return this.initialisingSDK;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackButtonContinueDescription() {
        return this.backButtonContinueDescription;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCloseButtonContinueDescription() {
        return this.closeButtonContinueDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final String getHelpButtonContinueDescription() {
        return this.helpButtonContinueDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final String getManualButtonContinueDescription() {
        return this.manualButtonContinueDescription;
    }

    public final NativeLabelsModel copy(String pleaseWait, String initialisingSDK, String selectCheckBox, String unselectCheckBox, String backButtonContinueDescription, String closeButtonContinueDescription, String helpButtonContinueDescription, String manualButtonContinueDescription) {
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(initialisingSDK, "initialisingSDK");
        Intrinsics.checkNotNullParameter(selectCheckBox, "selectCheckBox");
        Intrinsics.checkNotNullParameter(unselectCheckBox, "unselectCheckBox");
        Intrinsics.checkNotNullParameter(backButtonContinueDescription, "backButtonContinueDescription");
        Intrinsics.checkNotNullParameter(closeButtonContinueDescription, "closeButtonContinueDescription");
        Intrinsics.checkNotNullParameter(helpButtonContinueDescription, "helpButtonContinueDescription");
        Intrinsics.checkNotNullParameter(manualButtonContinueDescription, "manualButtonContinueDescription");
        return new NativeLabelsModel(pleaseWait, initialisingSDK, selectCheckBox, unselectCheckBox, backButtonContinueDescription, closeButtonContinueDescription, helpButtonContinueDescription, manualButtonContinueDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLabelsModel)) {
            return false;
        }
        NativeLabelsModel nativeLabelsModel = (NativeLabelsModel) other;
        return Intrinsics.areEqual(this.pleaseWait, nativeLabelsModel.pleaseWait) && Intrinsics.areEqual(this.initialisingSDK, nativeLabelsModel.initialisingSDK) && Intrinsics.areEqual(this.selectCheckBox, nativeLabelsModel.selectCheckBox) && Intrinsics.areEqual(this.unselectCheckBox, nativeLabelsModel.unselectCheckBox) && Intrinsics.areEqual(this.backButtonContinueDescription, nativeLabelsModel.backButtonContinueDescription) && Intrinsics.areEqual(this.closeButtonContinueDescription, nativeLabelsModel.closeButtonContinueDescription) && Intrinsics.areEqual(this.helpButtonContinueDescription, nativeLabelsModel.helpButtonContinueDescription) && Intrinsics.areEqual(this.manualButtonContinueDescription, nativeLabelsModel.manualButtonContinueDescription);
    }

    public int hashCode() {
        return (((((((((((((this.pleaseWait.hashCode() * 31) + this.initialisingSDK.hashCode()) * 31) + this.selectCheckBox.hashCode()) * 31) + this.unselectCheckBox.hashCode()) * 31) + this.backButtonContinueDescription.hashCode()) * 31) + this.closeButtonContinueDescription.hashCode()) * 31) + this.helpButtonContinueDescription.hashCode()) * 31) + this.manualButtonContinueDescription.hashCode();
    }

    public String toString() {
        return "NativeLabelsModel(pleaseWait=" + this.pleaseWait + ", initialisingSDK=" + this.initialisingSDK + ", selectCheckBox=" + this.selectCheckBox + ", unselectCheckBox=" + this.unselectCheckBox + ", backButtonContinueDescription=" + this.backButtonContinueDescription + ", closeButtonContinueDescription=" + this.closeButtonContinueDescription + ", helpButtonContinueDescription=" + this.helpButtonContinueDescription + ", manualButtonContinueDescription=" + this.manualButtonContinueDescription + ")";
    }

    public NativeLabelsModel(String pleaseWait, String initialisingSDK, String selectCheckBox, String unselectCheckBox, String backButtonContinueDescription, String closeButtonContinueDescription, String helpButtonContinueDescription, String manualButtonContinueDescription) {
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(initialisingSDK, "initialisingSDK");
        Intrinsics.checkNotNullParameter(selectCheckBox, "selectCheckBox");
        Intrinsics.checkNotNullParameter(unselectCheckBox, "unselectCheckBox");
        Intrinsics.checkNotNullParameter(backButtonContinueDescription, "backButtonContinueDescription");
        Intrinsics.checkNotNullParameter(closeButtonContinueDescription, "closeButtonContinueDescription");
        Intrinsics.checkNotNullParameter(helpButtonContinueDescription, "helpButtonContinueDescription");
        Intrinsics.checkNotNullParameter(manualButtonContinueDescription, "manualButtonContinueDescription");
        this.pleaseWait = pleaseWait;
        this.initialisingSDK = initialisingSDK;
        this.selectCheckBox = selectCheckBox;
        this.unselectCheckBox = unselectCheckBox;
        this.backButtonContinueDescription = backButtonContinueDescription;
        this.closeButtonContinueDescription = closeButtonContinueDescription;
        this.helpButtonContinueDescription = helpButtonContinueDescription;
        this.manualButtonContinueDescription = manualButtonContinueDescription;
    }

    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    public final String getInitialisingSDK() {
        return this.initialisingSDK;
    }

    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    public final String getBackButtonContinueDescription() {
        return this.backButtonContinueDescription;
    }

    public final String getCloseButtonContinueDescription() {
        return this.closeButtonContinueDescription;
    }

    public final String getHelpButtonContinueDescription() {
        return this.helpButtonContinueDescription;
    }

    public final String getManualButtonContinueDescription() {
        return this.manualButtonContinueDescription;
    }
}
