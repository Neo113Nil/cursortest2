package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentModuleModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/models/BodyComponentModel;", "Landroid/os/Parcelable;", "id", "", AnalyticsConstantsKt.MANDATORY, "", "type", "content", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getId", "getMandatory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/socure/docv/capturesdk/models/BodyComponentModel;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BodyComponentModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BodyComponentModel> CREATOR = new Creator();
    private final String content;
    private final String id;
    private final Boolean mandatory;
    private final String type;

    /* compiled from: ConsentModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BodyComponentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BodyComponentModel createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BodyComponentModel(readString, valueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BodyComponentModel[] newArray(int i) {
            return new BodyComponentModel[i];
        }
    }

    public static /* synthetic */ BodyComponentModel copy$default(BodyComponentModel bodyComponentModel, String str, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bodyComponentModel.id;
        }
        if ((i & 2) != 0) {
            bool = bodyComponentModel.mandatory;
        }
        if ((i & 4) != 0) {
            str2 = bodyComponentModel.type;
        }
        if ((i & 8) != 0) {
            str3 = bodyComponentModel.content;
        }
        return bodyComponentModel.copy(str, bool, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final BodyComponentModel copy(String id, Boolean mandatory, String type, String content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new BodyComponentModel(id, mandatory, type, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyComponentModel)) {
            return false;
        }
        BodyComponentModel bodyComponentModel = (BodyComponentModel) other;
        return Intrinsics.areEqual(this.id, bodyComponentModel.id) && Intrinsics.areEqual(this.mandatory, bodyComponentModel.mandatory) && Intrinsics.areEqual(this.type, bodyComponentModel.type) && Intrinsics.areEqual(this.content, bodyComponentModel.content);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Boolean bool = this.mandatory;
        return ((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.type.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "BodyComponentModel(id=" + this.id + ", mandatory=" + this.mandatory + ", type=" + this.type + ", content=" + this.content + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        Boolean bool = this.mandatory;
        if (bool == null) {
            i = 0;
        } else {
            parcel.writeInt(1);
            i = bool.booleanValue();
        }
        parcel.writeInt(i);
        parcel.writeString(this.type);
        parcel.writeString(this.content);
    }

    public BodyComponentModel(String id, Boolean bool, String type, String content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.mandatory = bool;
        this.type = type;
        this.content = content;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final String getType() {
        return this.type;
    }

    public final String getContent() {
        return this.content;
    }
}
