package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentModuleModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0013HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\t\u00106\u001a\u00020\u0013HÖ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0013HÖ\u0001J\t\u0010<\u001a\u00020\u0004HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006B"}, d2 = {"Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "moduleId", "", "sessionToken", "title", "headerText", "warningMessageText", "warningMessageCloseText", "agreeButtonText", "declineButtonText", "bodyComponents", "", "Lcom/socure/docv/capturesdk/models/BodyComponentModel;", "consentVersion", "consentLanguage", "processingConsent", "completedModuleCount", "", "totalModuleCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAgreeButtonText", "()Ljava/lang/String;", "getBodyComponents", "()Ljava/util/List;", "getCompletedModuleCount", "()I", "getConsentLanguage", "getConsentVersion", "getDeclineButtonText", "getHeaderText", "getModuleId", "getProcessingConsent", "getSessionToken", "getTitle", "getTotalModuleCount", "getWarningMessageCloseText", "getWarningMessageText", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConsentModuleModel implements ModuleModel, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConsentModuleModel> CREATOR = new Creator();
    private final String agreeButtonText;
    private final List<BodyComponentModel> bodyComponents;
    private final int completedModuleCount;
    private final String consentLanguage;
    private final String consentVersion;
    private final String declineButtonText;
    private final String headerText;
    private final String moduleId;
    private final String processingConsent;
    private final String sessionToken;
    private final String title;
    private final int totalModuleCount;
    private final String warningMessageCloseText;
    private final String warningMessageText;

    /* compiled from: ConsentModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsentModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(BodyComponentModel.CREATOR.createFromParcel(parcel));
            }
            return new ConsentModuleModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentModuleModel[] newArray(int i) {
            return new ConsentModuleModel[i];
        }
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    /* renamed from: component11, reason: from getter */
    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    /* renamed from: component12, reason: from getter */
    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWarningMessageText() {
        return this.warningMessageText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWarningMessageCloseText() {
        return this.warningMessageCloseText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAgreeButtonText() {
        return this.agreeButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDeclineButtonText() {
        return this.declineButtonText;
    }

    public final List<BodyComponentModel> component9() {
        return this.bodyComponents;
    }

    public final ConsentModuleModel copy(String moduleId, String sessionToken, String title, String headerText, String warningMessageText, String warningMessageCloseText, String agreeButtonText, String declineButtonText, List<BodyComponentModel> bodyComponents, String consentVersion, String consentLanguage, String processingConsent, int completedModuleCount, int totalModuleCount) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(warningMessageText, "warningMessageText");
        Intrinsics.checkNotNullParameter(warningMessageCloseText, "warningMessageCloseText");
        Intrinsics.checkNotNullParameter(agreeButtonText, "agreeButtonText");
        Intrinsics.checkNotNullParameter(declineButtonText, "declineButtonText");
        Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(consentLanguage, "consentLanguage");
        Intrinsics.checkNotNullParameter(processingConsent, "processingConsent");
        return new ConsentModuleModel(moduleId, sessionToken, title, headerText, warningMessageText, warningMessageCloseText, agreeButtonText, declineButtonText, bodyComponents, consentVersion, consentLanguage, processingConsent, completedModuleCount, totalModuleCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentModuleModel)) {
            return false;
        }
        ConsentModuleModel consentModuleModel = (ConsentModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), consentModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), consentModuleModel.getSessionToken()) && Intrinsics.areEqual(this.title, consentModuleModel.title) && Intrinsics.areEqual(this.headerText, consentModuleModel.headerText) && Intrinsics.areEqual(this.warningMessageText, consentModuleModel.warningMessageText) && Intrinsics.areEqual(this.warningMessageCloseText, consentModuleModel.warningMessageCloseText) && Intrinsics.areEqual(this.agreeButtonText, consentModuleModel.agreeButtonText) && Intrinsics.areEqual(this.declineButtonText, consentModuleModel.declineButtonText) && Intrinsics.areEqual(this.bodyComponents, consentModuleModel.bodyComponents) && Intrinsics.areEqual(this.consentVersion, consentModuleModel.consentVersion) && Intrinsics.areEqual(this.consentLanguage, consentModuleModel.consentLanguage) && Intrinsics.areEqual(this.processingConsent, consentModuleModel.processingConsent) && this.completedModuleCount == consentModuleModel.completedModuleCount && this.totalModuleCount == consentModuleModel.totalModuleCount;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.title.hashCode()) * 31) + this.headerText.hashCode()) * 31) + this.warningMessageText.hashCode()) * 31) + this.warningMessageCloseText.hashCode()) * 31) + this.agreeButtonText.hashCode()) * 31) + this.declineButtonText.hashCode()) * 31) + this.bodyComponents.hashCode()) * 31) + this.consentVersion.hashCode()) * 31) + this.consentLanguage.hashCode()) * 31) + this.processingConsent.hashCode()) * 31) + Integer.hashCode(this.completedModuleCount)) * 31) + Integer.hashCode(this.totalModuleCount);
    }

    public String toString() {
        return "ConsentModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", title=" + this.title + ", headerText=" + this.headerText + ", warningMessageText=" + this.warningMessageText + ", warningMessageCloseText=" + this.warningMessageCloseText + ", agreeButtonText=" + this.agreeButtonText + ", declineButtonText=" + this.declineButtonText + ", bodyComponents=" + this.bodyComponents + ", consentVersion=" + this.consentVersion + ", consentLanguage=" + this.consentLanguage + ", processingConsent=" + this.processingConsent + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeString(this.title);
        parcel.writeString(this.headerText);
        parcel.writeString(this.warningMessageText);
        parcel.writeString(this.warningMessageCloseText);
        parcel.writeString(this.agreeButtonText);
        parcel.writeString(this.declineButtonText);
        List<BodyComponentModel> list = this.bodyComponents;
        parcel.writeInt(list.size());
        Iterator<BodyComponentModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.consentVersion);
        parcel.writeString(this.consentLanguage);
        parcel.writeString(this.processingConsent);
        parcel.writeInt(this.completedModuleCount);
        parcel.writeInt(this.totalModuleCount);
    }

    public ConsentModuleModel(String moduleId, String str, String title, String headerText, String warningMessageText, String warningMessageCloseText, String agreeButtonText, String declineButtonText, List<BodyComponentModel> bodyComponents, String consentVersion, String consentLanguage, String processingConsent, int i, int i2) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(warningMessageText, "warningMessageText");
        Intrinsics.checkNotNullParameter(warningMessageCloseText, "warningMessageCloseText");
        Intrinsics.checkNotNullParameter(agreeButtonText, "agreeButtonText");
        Intrinsics.checkNotNullParameter(declineButtonText, "declineButtonText");
        Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(consentLanguage, "consentLanguage");
        Intrinsics.checkNotNullParameter(processingConsent, "processingConsent");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.title = title;
        this.headerText = headerText;
        this.warningMessageText = warningMessageText;
        this.warningMessageCloseText = warningMessageCloseText;
        this.agreeButtonText = agreeButtonText;
        this.declineButtonText = declineButtonText;
        this.bodyComponents = bodyComponents;
        this.consentVersion = consentVersion;
        this.consentLanguage = consentLanguage;
        this.processingConsent = processingConsent;
        this.completedModuleCount = i;
        this.totalModuleCount = i2;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return this.sessionToken;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getWarningMessageText() {
        return this.warningMessageText;
    }

    public final String getWarningMessageCloseText() {
        return this.warningMessageCloseText;
    }

    public final String getAgreeButtonText() {
        return this.agreeButtonText;
    }

    public final String getDeclineButtonText() {
        return this.declineButtonText;
    }

    public final List<BodyComponentModel> getBodyComponents() {
        return this.bodyComponents;
    }

    public final String getConsentVersion() {
        return this.consentVersion;
    }

    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }
}
