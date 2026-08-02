package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPreviewArgs.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0019H×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DownloadState;", "Landroid/os/Parcelable;", "showDownloadAction", "", "fileSavingText", "", "fileSavedText", "saveFailedText", "permissionDeniedText", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShowDownloadAction", "()Z", "getFileSavingText", "()Ljava/lang/String;", "getFileSavedText", "getSaveFailedText", "getPermissionDeniedText", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DownloadState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DownloadState> CREATOR = new Creator();
    private final String fileSavedText;
    private final String fileSavingText;
    private final String permissionDeniedText;
    private final String saveFailedText;
    private final boolean showDownloadAction;

    /* compiled from: IntercomPreviewArgs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DownloadState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DownloadState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState[] newArray(int i) {
            return new DownloadState[i];
        }
    }

    public static /* synthetic */ DownloadState copy$default(DownloadState downloadState, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadState.showDownloadAction;
        }
        if ((i & 2) != 0) {
            str = downloadState.fileSavingText;
        }
        if ((i & 4) != 0) {
            str2 = downloadState.fileSavedText;
        }
        if ((i & 8) != 0) {
            str3 = downloadState.saveFailedText;
        }
        if ((i & 16) != 0) {
            str4 = downloadState.permissionDeniedText;
        }
        String str5 = str4;
        String str6 = str2;
        return downloadState.copy(z, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }

    public final DownloadState copy(boolean showDownloadAction, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(fileSavingText, "fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "permissionDeniedText");
        return new DownloadState(showDownloadAction, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadState)) {
            return false;
        }
        DownloadState downloadState = (DownloadState) other;
        return this.showDownloadAction == downloadState.showDownloadAction && Intrinsics.areEqual(this.fileSavingText, downloadState.fileSavingText) && Intrinsics.areEqual(this.fileSavedText, downloadState.fileSavedText) && Intrinsics.areEqual(this.saveFailedText, downloadState.saveFailedText) && Intrinsics.areEqual(this.permissionDeniedText, downloadState.permissionDeniedText);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.showDownloadAction) * 31) + this.fileSavingText.hashCode()) * 31) + this.fileSavedText.hashCode()) * 31) + this.saveFailedText.hashCode()) * 31) + this.permissionDeniedText.hashCode();
    }

    public String toString() {
        return "DownloadState(showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ", permissionDeniedText=" + this.permissionDeniedText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showDownloadAction ? 1 : 0);
        dest.writeString(this.fileSavingText);
        dest.writeString(this.fileSavedText);
        dest.writeString(this.saveFailedText);
        dest.writeString(this.permissionDeniedText);
    }

    public DownloadState(boolean z, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(fileSavingText, "fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "permissionDeniedText");
        this.showDownloadAction = z;
        this.fileSavingText = fileSavingText;
        this.fileSavedText = fileSavedText;
        this.saveFailedText = saveFailedText;
        this.permissionDeniedText = permissionDeniedText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }
}
