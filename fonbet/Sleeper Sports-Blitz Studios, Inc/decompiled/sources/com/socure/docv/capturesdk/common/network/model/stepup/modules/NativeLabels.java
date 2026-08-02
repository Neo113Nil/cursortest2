package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;", "", "pleaseWait", "", "initialisingSDK", "selectCheckBox", "unselectCheckBox", "backButtonContinueDescription", "closeButtonContinueDescription", "helpButtonContinueDescription", "manualButtonContinueDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackButtonContinueDescription", "()Ljava/lang/String;", "getCloseButtonContinueDescription", "getHelpButtonContinueDescription", "getInitialisingSDK", "getManualButtonContinueDescription", "getPleaseWait", "getSelectCheckBox", "getUnselectCheckBox", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NativeLabels {
    public static final int $stable = 0;
    private final String backButtonContinueDescription;
    private final String closeButtonContinueDescription;
    private final String helpButtonContinueDescription;
    private final String initialisingSDK;
    private final String manualButtonContinueDescription;
    private final String pleaseWait;
    private final String selectCheckBox;
    private final String unselectCheckBox;

    public static /* synthetic */ NativeLabels copy$default(NativeLabels nativeLabels, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLabels.pleaseWait;
        }
        if ((i & 2) != 0) {
            str2 = nativeLabels.initialisingSDK;
        }
        if ((i & 4) != 0) {
            str3 = nativeLabels.selectCheckBox;
        }
        if ((i & 8) != 0) {
            str4 = nativeLabels.unselectCheckBox;
        }
        if ((i & 16) != 0) {
            str5 = nativeLabels.backButtonContinueDescription;
        }
        if ((i & 32) != 0) {
            str6 = nativeLabels.closeButtonContinueDescription;
        }
        if ((i & 64) != 0) {
            str7 = nativeLabels.helpButtonContinueDescription;
        }
        if ((i & 128) != 0) {
            str8 = nativeLabels.manualButtonContinueDescription;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return nativeLabels.copy(str, str2, str3, str4, str11, str12, str9, str10);
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

    public final NativeLabels copy(String pleaseWait, String initialisingSDK, String selectCheckBox, String unselectCheckBox, String backButtonContinueDescription, String closeButtonContinueDescription, String helpButtonContinueDescription, String manualButtonContinueDescription) {
        return new NativeLabels(pleaseWait, initialisingSDK, selectCheckBox, unselectCheckBox, backButtonContinueDescription, closeButtonContinueDescription, helpButtonContinueDescription, manualButtonContinueDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLabels)) {
            return false;
        }
        NativeLabels nativeLabels = (NativeLabels) other;
        return Intrinsics.areEqual(this.pleaseWait, nativeLabels.pleaseWait) && Intrinsics.areEqual(this.initialisingSDK, nativeLabels.initialisingSDK) && Intrinsics.areEqual(this.selectCheckBox, nativeLabels.selectCheckBox) && Intrinsics.areEqual(this.unselectCheckBox, nativeLabels.unselectCheckBox) && Intrinsics.areEqual(this.backButtonContinueDescription, nativeLabels.backButtonContinueDescription) && Intrinsics.areEqual(this.closeButtonContinueDescription, nativeLabels.closeButtonContinueDescription) && Intrinsics.areEqual(this.helpButtonContinueDescription, nativeLabels.helpButtonContinueDescription) && Intrinsics.areEqual(this.manualButtonContinueDescription, nativeLabels.manualButtonContinueDescription);
    }

    public int hashCode() {
        String str = this.pleaseWait;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initialisingSDK;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectCheckBox;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unselectCheckBox;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backButtonContinueDescription;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.closeButtonContinueDescription;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.helpButtonContinueDescription;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.manualButtonContinueDescription;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "NativeLabels(pleaseWait=" + this.pleaseWait + ", initialisingSDK=" + this.initialisingSDK + ", selectCheckBox=" + this.selectCheckBox + ", unselectCheckBox=" + this.unselectCheckBox + ", backButtonContinueDescription=" + this.backButtonContinueDescription + ", closeButtonContinueDescription=" + this.closeButtonContinueDescription + ", helpButtonContinueDescription=" + this.helpButtonContinueDescription + ", manualButtonContinueDescription=" + this.manualButtonContinueDescription + ")";
    }

    public NativeLabels(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.pleaseWait = str;
        this.initialisingSDK = str2;
        this.selectCheckBox = str3;
        this.unselectCheckBox = str4;
        this.backButtonContinueDescription = str5;
        this.closeButtonContinueDescription = str6;
        this.helpButtonContinueDescription = str7;
        this.manualButtonContinueDescription = str8;
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
