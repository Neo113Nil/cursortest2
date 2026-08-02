package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionModuleModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001;Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u008a\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010.J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\u0004HÖ\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u0006<"}, d2 = {"Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "moduleId", "", "sessionToken", "completedModuleCount", "", "totalModuleCount", "infoModalText", "errorMessage", "labels", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel$LabelsTransitionConfig;", "useCaseType", ApiConstant.DOCUMENT_TYPE, "currentVerificationCount", "totalVerificationCount", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/TransitionModuleModel$LabelsTransitionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCompletedModuleCount", "()I", "getCurrentVerificationCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDocumentType", "()Ljava/lang/String;", "getErrorMessage", "getInfoModalText", "getLabels", "()Lcom/socure/docv/capturesdk/models/TransitionModuleModel$LabelsTransitionConfig;", "getModuleId", "getSessionToken", "getTotalModuleCount", "getTotalVerificationCount", "getUseCaseType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/TransitionModuleModel$LabelsTransitionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "LabelsTransitionConfig", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransitionModuleModel implements ModuleModel, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransitionModuleModel> CREATOR = new Creator();
    private final int completedModuleCount;
    private final Integer currentVerificationCount;
    private final String documentType;
    private final String errorMessage;
    private final String infoModalText;
    private final LabelsTransitionConfig labels;
    private final String moduleId;
    private final String sessionToken;
    private final int totalModuleCount;
    private final Integer totalVerificationCount;
    private final String useCaseType;

    /* compiled from: TransitionModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransitionModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitionModuleModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), LabelsTransitionConfig.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionModuleModel[] newArray(int i) {
            return new TransitionModuleModel[i];
        }
    }

    public static /* synthetic */ TransitionModuleModel copy$default(TransitionModuleModel transitionModuleModel, String str, String str2, int i, int i2, String str3, String str4, LabelsTransitionConfig labelsTransitionConfig, String str5, String str6, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = transitionModuleModel.getModuleId();
        }
        if ((i3 & 2) != 0) {
            str2 = transitionModuleModel.getSessionToken();
        }
        if ((i3 & 4) != 0) {
            i = transitionModuleModel.completedModuleCount;
        }
        if ((i3 & 8) != 0) {
            i2 = transitionModuleModel.totalModuleCount;
        }
        if ((i3 & 16) != 0) {
            str3 = transitionModuleModel.infoModalText;
        }
        if ((i3 & 32) != 0) {
            str4 = transitionModuleModel.errorMessage;
        }
        if ((i3 & 64) != 0) {
            labelsTransitionConfig = transitionModuleModel.labels;
        }
        if ((i3 & 128) != 0) {
            str5 = transitionModuleModel.useCaseType;
        }
        if ((i3 & 256) != 0) {
            str6 = transitionModuleModel.documentType;
        }
        if ((i3 & 512) != 0) {
            num = transitionModuleModel.currentVerificationCount;
        }
        if ((i3 & 1024) != 0) {
            num2 = transitionModuleModel.totalVerificationCount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        LabelsTransitionConfig labelsTransitionConfig2 = labelsTransitionConfig;
        String str10 = str3;
        int i4 = i;
        return transitionModuleModel.copy(str, str2, i4, i2, str10, str9, labelsTransitionConfig2, str7, str8, num3, num4);
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component3, reason: from getter */
    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInfoModalText() {
        return this.infoModalText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final LabelsTransitionConfig getLabels() {
        return this.labels;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUseCaseType() {
        return this.useCaseType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    public final TransitionModuleModel copy(String moduleId, String sessionToken, int completedModuleCount, int totalModuleCount, String infoModalText, String errorMessage, LabelsTransitionConfig labels, String useCaseType, String documentType, Integer currentVerificationCount, Integer totalVerificationCount) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(labels, "labels");
        return new TransitionModuleModel(moduleId, sessionToken, completedModuleCount, totalModuleCount, infoModalText, errorMessage, labels, useCaseType, documentType, currentVerificationCount, totalVerificationCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionModuleModel)) {
            return false;
        }
        TransitionModuleModel transitionModuleModel = (TransitionModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), transitionModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), transitionModuleModel.getSessionToken()) && this.completedModuleCount == transitionModuleModel.completedModuleCount && this.totalModuleCount == transitionModuleModel.totalModuleCount && Intrinsics.areEqual(this.infoModalText, transitionModuleModel.infoModalText) && Intrinsics.areEqual(this.errorMessage, transitionModuleModel.errorMessage) && Intrinsics.areEqual(this.labels, transitionModuleModel.labels) && Intrinsics.areEqual(this.useCaseType, transitionModuleModel.useCaseType) && Intrinsics.areEqual(this.documentType, transitionModuleModel.documentType) && Intrinsics.areEqual(this.currentVerificationCount, transitionModuleModel.currentVerificationCount) && Intrinsics.areEqual(this.totalVerificationCount, transitionModuleModel.totalVerificationCount);
    }

    public int hashCode() {
        int hashCode = ((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + Integer.hashCode(this.completedModuleCount)) * 31) + Integer.hashCode(this.totalModuleCount)) * 31;
        String str = this.infoModalText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.labels.hashCode()) * 31;
        String str3 = this.useCaseType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.currentVerificationCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalVerificationCount;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "TransitionModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", infoModalText=" + this.infoModalText + ", errorMessage=" + this.errorMessage + ", labels=" + this.labels + ", useCaseType=" + this.useCaseType + ", documentType=" + this.documentType + ", currentVerificationCount=" + this.currentVerificationCount + ", totalVerificationCount=" + this.totalVerificationCount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeInt(this.completedModuleCount);
        parcel.writeInt(this.totalModuleCount);
        parcel.writeString(this.infoModalText);
        parcel.writeString(this.errorMessage);
        this.labels.writeToParcel(parcel, flags);
        parcel.writeString(this.useCaseType);
        parcel.writeString(this.documentType);
        Integer num = this.currentVerificationCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.totalVerificationCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public TransitionModuleModel(String moduleId, String str, int i, int i2, String str2, String str3, LabelsTransitionConfig labels, String str4, String str5, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.completedModuleCount = i;
        this.totalModuleCount = i2;
        this.infoModalText = str2;
        this.errorMessage = str3;
        this.labels = labels;
        this.useCaseType = str4;
        this.documentType = str5;
        this.currentVerificationCount = num;
        this.totalVerificationCount = num2;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return this.sessionToken;
    }

    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String getInfoModalText() {
        return this.infoModalText;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final LabelsTransitionConfig getLabels() {
        return this.labels;
    }

    public final String getUseCaseType() {
        return this.useCaseType;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    /* compiled from: TransitionModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/socure/docv/capturesdk/models/TransitionModuleModel$LabelsTransitionConfig;", "Landroid/os/Parcelable;", "title", "", ApiConstant.DOCUMENT_TYPE, "headerText", "instructionsPrimaryText", "instructionsSecondaryText", "continueButton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContinueButton", "()Ljava/lang/String;", "getDocumentType", "getHeaderText", "getInstructionsPrimaryText", "getInstructionsSecondaryText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LabelsTransitionConfig implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<LabelsTransitionConfig> CREATOR = new Creator();
        private final String continueButton;
        private final String documentType;
        private final String headerText;
        private final String instructionsPrimaryText;
        private final String instructionsSecondaryText;
        private final String title;

        /* compiled from: TransitionModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LabelsTransitionConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelsTransitionConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LabelsTransitionConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelsTransitionConfig[] newArray(int i) {
                return new LabelsTransitionConfig[i];
            }
        }

        public static /* synthetic */ LabelsTransitionConfig copy$default(LabelsTransitionConfig labelsTransitionConfig, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = labelsTransitionConfig.title;
            }
            if ((i & 2) != 0) {
                str2 = labelsTransitionConfig.documentType;
            }
            if ((i & 4) != 0) {
                str3 = labelsTransitionConfig.headerText;
            }
            if ((i & 8) != 0) {
                str4 = labelsTransitionConfig.instructionsPrimaryText;
            }
            if ((i & 16) != 0) {
                str5 = labelsTransitionConfig.instructionsSecondaryText;
            }
            if ((i & 32) != 0) {
                str6 = labelsTransitionConfig.continueButton;
            }
            String str7 = str5;
            String str8 = str6;
            return labelsTransitionConfig.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInstructionsPrimaryText() {
            return this.instructionsPrimaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInstructionsSecondaryText() {
            return this.instructionsSecondaryText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContinueButton() {
            return this.continueButton;
        }

        public final LabelsTransitionConfig copy(String title, String documentType, String headerText, String instructionsPrimaryText, String instructionsSecondaryText, String continueButton) {
            return new LabelsTransitionConfig(title, documentType, headerText, instructionsPrimaryText, instructionsSecondaryText, continueButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelsTransitionConfig)) {
                return false;
            }
            LabelsTransitionConfig labelsTransitionConfig = (LabelsTransitionConfig) other;
            return Intrinsics.areEqual(this.title, labelsTransitionConfig.title) && Intrinsics.areEqual(this.documentType, labelsTransitionConfig.documentType) && Intrinsics.areEqual(this.headerText, labelsTransitionConfig.headerText) && Intrinsics.areEqual(this.instructionsPrimaryText, labelsTransitionConfig.instructionsPrimaryText) && Intrinsics.areEqual(this.instructionsSecondaryText, labelsTransitionConfig.instructionsSecondaryText) && Intrinsics.areEqual(this.continueButton, labelsTransitionConfig.continueButton);
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.documentType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.instructionsPrimaryText;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.instructionsSecondaryText;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.continueButton;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "LabelsTransitionConfig(title=" + this.title + ", documentType=" + this.documentType + ", headerText=" + this.headerText + ", instructionsPrimaryText=" + this.instructionsPrimaryText + ", instructionsSecondaryText=" + this.instructionsSecondaryText + ", continueButton=" + this.continueButton + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.documentType);
            parcel.writeString(this.headerText);
            parcel.writeString(this.instructionsPrimaryText);
            parcel.writeString(this.instructionsSecondaryText);
            parcel.writeString(this.continueButton);
        }

        public LabelsTransitionConfig(String str, String str2, String str3, String str4, String str5, String str6) {
            this.title = str;
            this.documentType = str2;
            this.headerText = str3;
            this.instructionsPrimaryText = str4;
            this.instructionsSecondaryText = str5;
            this.continueButton = str6;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDocumentType() {
            return this.documentType;
        }

        public final String getHeaderText() {
            return this.headerText;
        }

        public final String getInstructionsPrimaryText() {
            return this.instructionsPrimaryText;
        }

        public final String getInstructionsSecondaryText() {
            return this.instructionsSecondaryText;
        }

        public final String getContinueButton() {
            return this.continueButton;
        }
    }
}
