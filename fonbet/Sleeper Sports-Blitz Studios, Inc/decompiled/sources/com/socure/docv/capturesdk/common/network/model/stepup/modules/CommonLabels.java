package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;", "", "poweredBy", "", "orientationCheck", "orientationCheckV2", "backPressWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackPressWarning", "()Ljava/lang/String;", "getOrientationCheck", "getOrientationCheckV2", "getPoweredBy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CommonLabels {
    public static final int $stable = 0;
    private final String backPressWarning;
    private final String orientationCheck;
    private final String orientationCheckV2;
    private final String poweredBy;

    public static /* synthetic */ CommonLabels copy$default(CommonLabels commonLabels, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonLabels.poweredBy;
        }
        if ((i & 2) != 0) {
            str2 = commonLabels.orientationCheck;
        }
        if ((i & 4) != 0) {
            str3 = commonLabels.orientationCheckV2;
        }
        if ((i & 8) != 0) {
            str4 = commonLabels.backPressWarning;
        }
        return commonLabels.copy(str, str2, str3, str4);
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

    public final CommonLabels copy(String poweredBy, String orientationCheck, String orientationCheckV2, String backPressWarning) {
        return new CommonLabels(poweredBy, orientationCheck, orientationCheckV2, backPressWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLabels)) {
            return false;
        }
        CommonLabels commonLabels = (CommonLabels) other;
        return Intrinsics.areEqual(this.poweredBy, commonLabels.poweredBy) && Intrinsics.areEqual(this.orientationCheck, commonLabels.orientationCheck) && Intrinsics.areEqual(this.orientationCheckV2, commonLabels.orientationCheckV2) && Intrinsics.areEqual(this.backPressWarning, commonLabels.backPressWarning);
    }

    public int hashCode() {
        String str = this.poweredBy;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orientationCheck;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orientationCheckV2;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backPressWarning;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CommonLabels(poweredBy=" + this.poweredBy + ", orientationCheck=" + this.orientationCheck + ", orientationCheckV2=" + this.orientationCheckV2 + ", backPressWarning=" + this.backPressWarning + ")";
    }

    public CommonLabels(String str, String str2, String str3, String str4) {
        this.poweredBy = str;
        this.orientationCheck = str2;
        this.orientationCheckV2 = str3;
        this.backPressWarning = str4;
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
