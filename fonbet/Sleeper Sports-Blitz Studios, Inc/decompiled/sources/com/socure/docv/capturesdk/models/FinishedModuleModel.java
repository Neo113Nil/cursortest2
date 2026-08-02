package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinishedModuleModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/models/FinishedModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "()V", "moduleId", "", "getModuleId$annotations", "getModuleId", "()Ljava/lang/String;", "sessionToken", "getSessionToken$annotations", "getSessionToken", "submissionErrorMessage", "getSubmissionErrorMessage$annotations", "getSubmissionErrorMessage", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinishedModuleModel implements ModuleModel, Parcelable, ScannerModel {
    public static final int $stable = 0;
    private static final String sessionToken = null;
    private static final String submissionErrorMessage = null;
    public static final FinishedModuleModel INSTANCE = new FinishedModuleModel();
    private static final String moduleId = "Finished";
    public static final Parcelable.Creator<FinishedModuleModel> CREATOR = new Creator();

    /* compiled from: FinishedModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinishedModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinishedModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return FinishedModuleModel.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinishedModuleModel[] newArray(int i) {
            return new FinishedModuleModel[i];
        }
    }

    public static /* synthetic */ void getModuleId$annotations() {
    }

    public static /* synthetic */ void getSessionToken$annotations() {
    }

    public static /* synthetic */ void getSubmissionErrorMessage$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }

    private FinishedModuleModel() {
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return sessionToken;
    }

    @Override // com.socure.docv.capturesdk.models.ScannerModel
    public String getSubmissionErrorMessage() {
        return submissionErrorMessage;
    }
}
