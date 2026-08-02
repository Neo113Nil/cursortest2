package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/models/CommonLabelsModel;", "", "poweredBy", "", "orientationCheck", "orientationCheckV2", "backPressWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackPressWarning", "()Ljava/lang/String;", "getOrientationCheck", "getOrientationCheckV2", "getPoweredBy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CommonLabelsModel {
    public static final int $stable = 0;
    private final String backPressWarning;
    private final String orientationCheck;
    private final String orientationCheckV2;
    private final String poweredBy;

    public static /* synthetic */ CommonLabelsModel copy$default(CommonLabelsModel commonLabelsModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonLabelsModel.poweredBy;
        }
        if ((i & 2) != 0) {
            str2 = commonLabelsModel.orientationCheck;
        }
        if ((i & 4) != 0) {
            str3 = commonLabelsModel.orientationCheckV2;
        }
        if ((i & 8) != 0) {
            str4 = commonLabelsModel.backPressWarning;
        }
        return commonLabelsModel.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPoweredBy() {
        return this.poweredBy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrientationCheck() {
        return this.orientationCheck;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrientationCheckV2() {
        return this.orientationCheckV2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackPressWarning() {
        return this.backPressWarning;
    }

    public final CommonLabelsModel copy(String poweredBy, String orientationCheck, String orientationCheckV2, String backPressWarning) {
        Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
        Intrinsics.checkNotNullParameter(orientationCheck, "orientationCheck");
        Intrinsics.checkNotNullParameter(orientationCheckV2, "orientationCheckV2");
        Intrinsics.checkNotNullParameter(backPressWarning, "backPressWarning");
        return new CommonLabelsModel(poweredBy, orientationCheck, orientationCheckV2, backPressWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLabelsModel)) {
            return false;
        }
        CommonLabelsModel commonLabelsModel = (CommonLabelsModel) other;
        return Intrinsics.areEqual(this.poweredBy, commonLabelsModel.poweredBy) && Intrinsics.areEqual(this.orientationCheck, commonLabelsModel.orientationCheck) && Intrinsics.areEqual(this.orientationCheckV2, commonLabelsModel.orientationCheckV2) && Intrinsics.areEqual(this.backPressWarning, commonLabelsModel.backPressWarning);
    }

    public int hashCode() {
        return (((((this.poweredBy.hashCode() * 31) + this.orientationCheck.hashCode()) * 31) + this.orientationCheckV2.hashCode()) * 31) + this.backPressWarning.hashCode();
    }

    public String toString() {
        return "CommonLabelsModel(poweredBy=" + this.poweredBy + ", orientationCheck=" + this.orientationCheck + ", orientationCheckV2=" + this.orientationCheckV2 + ", backPressWarning=" + this.backPressWarning + ")";
    }

    public CommonLabelsModel(String poweredBy, String orientationCheck, String orientationCheckV2, String backPressWarning) {
        Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
        Intrinsics.checkNotNullParameter(orientationCheck, "orientationCheck");
        Intrinsics.checkNotNullParameter(orientationCheckV2, "orientationCheckV2");
        Intrinsics.checkNotNullParameter(backPressWarning, "backPressWarning");
        this.poweredBy = poweredBy;
        this.orientationCheck = orientationCheck;
        this.orientationCheckV2 = orientationCheckV2;
        this.backPressWarning = backPressWarning;
    }

    public final String getPoweredBy() {
        return this.poweredBy;
    }

    public final String getOrientationCheck() {
        return this.orientationCheck;
    }

    public final String getOrientationCheckV2() {
        return this.orientationCheckV2;
    }

    public final String getBackPressWarning() {
        return this.backPressWarning;
    }
}
