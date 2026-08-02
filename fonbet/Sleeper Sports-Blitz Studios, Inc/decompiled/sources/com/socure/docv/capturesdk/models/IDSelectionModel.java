package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IDSelectionModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006-"}, d2 = {"Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "moduleId", "", "sessionToken", "title", "headerText", "docReadyText", "cameraAccessText", "buttons", "", "Lcom/socure/docv/capturesdk/models/IDSelectionModel$Button;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "getCameraAccessText", "()Ljava/lang/String;", "getDocReadyText", "getHeaderText", "getModuleId", "getSessionToken", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Button", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IDSelectionModel implements ModuleModel, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IDSelectionModel> CREATOR = new Creator();
    private final List<Button> buttons;
    private final String cameraAccessText;
    private final String docReadyText;
    private final String headerText;
    private final String moduleId;
    private final String sessionToken;
    private final String title;

    /* compiled from: IDSelectionModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IDSelectionModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IDSelectionModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Button.CREATOR.createFromParcel(parcel));
            }
            return new IDSelectionModel(readString, readString2, readString3, readString4, readString5, readString6, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IDSelectionModel[] newArray(int i) {
            return new IDSelectionModel[i];
        }
    }

    public static /* synthetic */ IDSelectionModel copy$default(IDSelectionModel iDSelectionModel, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iDSelectionModel.getModuleId();
        }
        if ((i & 2) != 0) {
            str2 = iDSelectionModel.getSessionToken();
        }
        if ((i & 4) != 0) {
            str3 = iDSelectionModel.title;
        }
        if ((i & 8) != 0) {
            str4 = iDSelectionModel.headerText;
        }
        if ((i & 16) != 0) {
            str5 = iDSelectionModel.docReadyText;
        }
        if ((i & 32) != 0) {
            str6 = iDSelectionModel.cameraAccessText;
        }
        if ((i & 64) != 0) {
            list = iDSelectionModel.buttons;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return iDSelectionModel.copy(str, str2, str9, str4, str8, str7, list2);
    }

    public final String component1() {
        return getModuleId();
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
    public final String getDocReadyText() {
        return this.docReadyText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCameraAccessText() {
        return this.cameraAccessText;
    }

    public final List<Button> component7() {
        return this.buttons;
    }

    public final IDSelectionModel copy(String moduleId, String sessionToken, String title, String headerText, String docReadyText, String cameraAccessText, List<Button> buttons) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(docReadyText, "docReadyText");
        Intrinsics.checkNotNullParameter(cameraAccessText, "cameraAccessText");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new IDSelectionModel(moduleId, sessionToken, title, headerText, docReadyText, cameraAccessText, buttons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IDSelectionModel)) {
            return false;
        }
        IDSelectionModel iDSelectionModel = (IDSelectionModel) other;
        return Intrinsics.areEqual(getModuleId(), iDSelectionModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), iDSelectionModel.getSessionToken()) && Intrinsics.areEqual(this.title, iDSelectionModel.title) && Intrinsics.areEqual(this.headerText, iDSelectionModel.headerText) && Intrinsics.areEqual(this.docReadyText, iDSelectionModel.docReadyText) && Intrinsics.areEqual(this.cameraAccessText, iDSelectionModel.cameraAccessText) && Intrinsics.areEqual(this.buttons, iDSelectionModel.buttons);
    }

    public int hashCode() {
        return (((((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.title.hashCode()) * 31) + this.headerText.hashCode()) * 31) + this.docReadyText.hashCode()) * 31) + this.cameraAccessText.hashCode()) * 31) + this.buttons.hashCode();
    }

    public String toString() {
        return "IDSelectionModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", title=" + this.title + ", headerText=" + this.headerText + ", docReadyText=" + this.docReadyText + ", cameraAccessText=" + this.cameraAccessText + ", buttons=" + this.buttons + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeString(this.title);
        parcel.writeString(this.headerText);
        parcel.writeString(this.docReadyText);
        parcel.writeString(this.cameraAccessText);
        List<Button> list = this.buttons;
        parcel.writeInt(list.size());
        Iterator<Button> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public IDSelectionModel(String moduleId, String str, String title, String headerText, String docReadyText, String cameraAccessText, List<Button> buttons) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(docReadyText, "docReadyText");
        Intrinsics.checkNotNullParameter(cameraAccessText, "cameraAccessText");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.title = title;
        this.headerText = headerText;
        this.docReadyText = docReadyText;
        this.cameraAccessText = cameraAccessText;
        this.buttons = buttons;
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

    public final String getDocReadyText() {
        return this.docReadyText;
    }

    public final String getCameraAccessText() {
        return this.cameraAccessText;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    /* compiled from: IDSelectionModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/IDSelectionModel$Button;", "Landroid/os/Parcelable;", SDKConstants.PARAM_KEY, "", Constants.ScionAnalytics.PARAM_LABEL, "value", "subText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getLabel", "getSubText", "getValue", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Button> CREATOR = new Creator();
        private final String key;
        private final String label;
        private final String subText;
        private final String value;

        /* compiled from: IDSelectionModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.key;
            }
            if ((i & 2) != 0) {
                str2 = button.label;
            }
            if ((i & 4) != 0) {
                str3 = button.value;
            }
            if ((i & 8) != 0) {
                str4 = button.subText;
            }
            return button.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }

        public final Button copy(String key, String label, String value, String subText) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Button(key, label, value, subText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(this.key, button.key) && Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.value, button.value) && Intrinsics.areEqual(this.subText, button.subText);
        }

        public int hashCode() {
            int hashCode = ((((this.key.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31;
            String str = this.subText;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Button(key=" + this.key + ", label=" + this.label + ", value=" + this.value + ", subText=" + this.subText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.key);
            parcel.writeString(this.label);
            parcel.writeString(this.value);
            parcel.writeString(this.subText);
        }

        public Button(String key, String label, String value, String str) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.label = label;
            this.value = value;
            this.subText = str;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getSubText() {
            return this.subText;
        }
    }
}
