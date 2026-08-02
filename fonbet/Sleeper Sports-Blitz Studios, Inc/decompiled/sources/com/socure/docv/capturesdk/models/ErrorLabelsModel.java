package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "", "desktop", "", "captureTypeNotSupported", "minimumResolution", "cameraPermission", "unknown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraPermission", "()Ljava/lang/String;", "getCaptureTypeNotSupported", "getDesktop", "getMinimumResolution", "getUnknown", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ErrorLabelsModel {
    public static final int $stable = 0;
    private final String cameraPermission;
    private final String captureTypeNotSupported;
    private final String desktop;
    private final String minimumResolution;
    private final String unknown;

    public static /* synthetic */ ErrorLabelsModel copy$default(ErrorLabelsModel errorLabelsModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorLabelsModel.desktop;
        }
        if ((i & 2) != 0) {
            str2 = errorLabelsModel.captureTypeNotSupported;
        }
        if ((i & 4) != 0) {
            str3 = errorLabelsModel.minimumResolution;
        }
        if ((i & 8) != 0) {
            str4 = errorLabelsModel.cameraPermission;
        }
        if ((i & 16) != 0) {
            str5 = errorLabelsModel.unknown;
        }
        String str6 = str5;
        String str7 = str3;
        return errorLabelsModel.copy(str, str2, str7, str4, str6);
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

    public final ErrorLabelsModel copy(String desktop, String captureTypeNotSupported, String minimumResolution, String cameraPermission, String unknown) {
        Intrinsics.checkNotNullParameter(desktop, "desktop");
        Intrinsics.checkNotNullParameter(captureTypeNotSupported, "captureTypeNotSupported");
        Intrinsics.checkNotNullParameter(minimumResolution, "minimumResolution");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(unknown, "unknown");
        return new ErrorLabelsModel(desktop, captureTypeNotSupported, minimumResolution, cameraPermission, unknown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorLabelsModel)) {
            return false;
        }
        ErrorLabelsModel errorLabelsModel = (ErrorLabelsModel) other;
        return Intrinsics.areEqual(this.desktop, errorLabelsModel.desktop) && Intrinsics.areEqual(this.captureTypeNotSupported, errorLabelsModel.captureTypeNotSupported) && Intrinsics.areEqual(this.minimumResolution, errorLabelsModel.minimumResolution) && Intrinsics.areEqual(this.cameraPermission, errorLabelsModel.cameraPermission) && Intrinsics.areEqual(this.unknown, errorLabelsModel.unknown);
    }

    public int hashCode() {
        return (((((((this.desktop.hashCode() * 31) + this.captureTypeNotSupported.hashCode()) * 31) + this.minimumResolution.hashCode()) * 31) + this.cameraPermission.hashCode()) * 31) + this.unknown.hashCode();
    }

    public String toString() {
        return "ErrorLabelsModel(desktop=" + this.desktop + ", captureTypeNotSupported=" + this.captureTypeNotSupported + ", minimumResolution=" + this.minimumResolution + ", cameraPermission=" + this.cameraPermission + ", unknown=" + this.unknown + ")";
    }

    public ErrorLabelsModel(String desktop, String captureTypeNotSupported, String minimumResolution, String cameraPermission, String unknown) {
        Intrinsics.checkNotNullParameter(desktop, "desktop");
        Intrinsics.checkNotNullParameter(captureTypeNotSupported, "captureTypeNotSupported");
        Intrinsics.checkNotNullParameter(minimumResolution, "minimumResolution");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(unknown, "unknown");
        this.desktop = desktop;
        this.captureTypeNotSupported = captureTypeNotSupported;
        this.minimumResolution = minimumResolution;
        this.cameraPermission = cameraPermission;
        this.unknown = unknown;
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
