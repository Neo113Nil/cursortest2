package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lcom/socure/docv/capturesdk/models/ErrorModule;", "Landroid/os/Parcelable;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "moduleId", "", "sessionToken", "title", "description", "errorCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()J", "getModuleId", "getSessionToken", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ErrorModule implements Parcelable, ModuleModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ErrorModule> CREATOR = new Creator();
    private final String description;
    private final long errorCode;
    private final String moduleId;
    private final String sessionToken;
    private final String title;

    /* compiled from: ErrorModule.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorModule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorModule createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorModule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorModule[] newArray(int i) {
            return new ErrorModule[i];
        }
    }

    public static /* synthetic */ ErrorModule copy$default(ErrorModule errorModule, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorModule.getModuleId();
        }
        if ((i & 2) != 0) {
            str2 = errorModule.getSessionToken();
        }
        if ((i & 4) != 0) {
            str3 = errorModule.title;
        }
        if ((i & 8) != 0) {
            str4 = errorModule.description;
        }
        if ((i & 16) != 0) {
            j = errorModule.errorCode;
        }
        long j2 = j;
        return errorModule.copy(str, str2, str3, str4, j2);
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
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final long getErrorCode() {
        return this.errorCode;
    }

    public final ErrorModule copy(String moduleId, String sessionToken, String title, String description, long errorCode) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ErrorModule(moduleId, sessionToken, title, description, errorCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorModule)) {
            return false;
        }
        ErrorModule errorModule = (ErrorModule) other;
        return Intrinsics.areEqual(getModuleId(), errorModule.getModuleId()) && Intrinsics.areEqual(getSessionToken(), errorModule.getSessionToken()) && Intrinsics.areEqual(this.title, errorModule.title) && Intrinsics.areEqual(this.description, errorModule.description) && this.errorCode == errorModule.errorCode;
    }

    public int hashCode() {
        return (((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.errorCode);
    }

    public String toString() {
        return "ErrorModule(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", title=" + this.title + ", description=" + this.description + ", errorCode=" + this.errorCode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeLong(this.errorCode);
    }

    public ErrorModule(String moduleId, String str, String title, String description, long j) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.title = title;
        this.description = description;
        this.errorCode = j;
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

    public final String getDescription() {
        return this.description;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }
}
