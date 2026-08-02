package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LandingModuleModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/models/LandingModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "moduleId", "", "sessionToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getModuleId", "()Ljava/lang/String;", "getSessionToken", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LandingModuleModel implements ModuleModel, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LandingModuleModel> CREATOR = new Creator();
    private final String moduleId;
    private final String sessionToken;

    /* compiled from: LandingModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LandingModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LandingModuleModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingModuleModel[] newArray(int i) {
            return new LandingModuleModel[i];
        }
    }

    public static /* synthetic */ LandingModuleModel copy$default(LandingModuleModel landingModuleModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingModuleModel.getModuleId();
        }
        if ((i & 2) != 0) {
            str2 = landingModuleModel.getSessionToken();
        }
        return landingModuleModel.copy(str, str2);
    }

    public final String component1() {
        return getModuleId();
    }

    public final String component2() {
        return getSessionToken();
    }

    public final LandingModuleModel copy(String moduleId, String sessionToken) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        return new LandingModuleModel(moduleId, sessionToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingModuleModel)) {
            return false;
        }
        LandingModuleModel landingModuleModel = (LandingModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), landingModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), landingModuleModel.getSessionToken());
    }

    public int hashCode() {
        return (getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode());
    }

    public String toString() {
        return "LandingModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
    }

    public LandingModuleModel(String moduleId, String str) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        this.moduleId = moduleId;
        this.sessionToken = str;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return this.sessionToken;
    }
}
