package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "", "desktop", "", "captureTypeNotSupported", "minimumResolution", "cameraPermission", "unknown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraPermission", "()Ljava/lang/String;", "getCaptureTypeNotSupported", "getDesktop", "getMinimumResolution", "getUnknown", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ErrorLabels {
    public static final int $stable = 0;
    private final String cameraPermission;
    private final String captureTypeNotSupported;
    private final String desktop;
    private final String minimumResolution;
    private final String unknown;

    public static /* synthetic */ ErrorLabels copy$default(ErrorLabels errorLabels, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorLabels.desktop;
        }
        if ((i & 2) != 0) {
            str2 = errorLabels.captureTypeNotSupported;
        }
        if ((i & 4) != 0) {
            str3 = errorLabels.minimumResolution;
        }
        if ((i & 8) != 0) {
            str4 = errorLabels.cameraPermission;
        }
        if ((i & 16) != 0) {
            str5 = errorLabels.unknown;
        }
        String str6 = str5;
        String str7 = str3;
        return errorLabels.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDesktop() {
        return this.desktop;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCaptureTypeNotSupported() {
        return this.captureTypeNotSupported;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMinimumResolution() {
        return this.minimumResolution;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCameraPermission() {
        return this.cameraPermission;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUnknown() {
        return this.unknown;
    }

    public final ErrorLabels copy(String desktop, String captureTypeNotSupported, String minimumResolution, String cameraPermission, String unknown) {
        return new ErrorLabels(desktop, captureTypeNotSupported, minimumResolution, cameraPermission, unknown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorLabels)) {
            return false;
        }
        ErrorLabels errorLabels = (ErrorLabels) other;
        return Intrinsics.areEqual(this.desktop, errorLabels.desktop) && Intrinsics.areEqual(this.captureTypeNotSupported, errorLabels.captureTypeNotSupported) && Intrinsics.areEqual(this.minimumResolution, errorLabels.minimumResolution) && Intrinsics.areEqual(this.cameraPermission, errorLabels.cameraPermission) && Intrinsics.areEqual(this.unknown, errorLabels.unknown);
    }

    public int hashCode() {
        String str = this.desktop;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captureTypeNotSupported;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minimumResolution;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cameraPermission;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unknown;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ErrorLabels(desktop=" + this.desktop + ", captureTypeNotSupported=" + this.captureTypeNotSupported + ", minimumResolution=" + this.minimumResolution + ", cameraPermission=" + this.cameraPermission + ", unknown=" + this.unknown + ")";
    }

    public ErrorLabels(String str, String str2, String str3, String str4, String str5) {
        this.desktop = str;
        this.captureTypeNotSupported = str2;
        this.minimumResolution = str3;
        this.cameraPermission = str4;
        this.unknown = str5;
    }

    public final String getDesktop() {
        return this.desktop;
    }

    public final String getCaptureTypeNotSupported() {
        return this.captureTypeNotSupported;
    }

    public final String getMinimumResolution() {
        return this.minimumResolution;
    }

    public final String getCameraPermission() {
        return this.cameraPermission;
    }

    public final String getUnknown() {
        return this.unknown;
    }
}
