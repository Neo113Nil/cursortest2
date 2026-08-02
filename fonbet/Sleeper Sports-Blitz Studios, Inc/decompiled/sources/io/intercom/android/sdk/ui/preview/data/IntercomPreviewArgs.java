package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPreviewArgs.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\b\u0010\u001f\u001a\u00020 H\u0007J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020 H×\u0001J\t\u0010%\u001a\u00020\bH×\u0001J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "Landroid/os/Parcelable;", "uris", "", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "deleteType", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "ctaText", "", "showSendCTA", "", "downloadState", "Lio/intercom/android/sdk/ui/preview/data/DownloadState;", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/ui/preview/data/DeleteType;Ljava/lang/String;ZLio/intercom/android/sdk/ui/preview/data/DownloadState;)V", "getUris", "()Ljava/util/List;", "getDeleteType", "()Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "getCtaText", "()Ljava/lang/String;", "getShowSendCTA", "()Z", "getDownloadState", "()Lio/intercom/android/sdk/ui/preview/data/DownloadState;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomPreviewArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IntercomPreviewArgs> CREATOR = new Creator();
    private final String ctaText;
    private final DeleteType deleteType;
    private final DownloadState downloadState;
    private final boolean showSendCTA;
    private final List<IntercomPreviewFile> uris;

    /* compiled from: IntercomPreviewArgs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntercomPreviewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()));
            }
            return new IntercomPreviewArgs(arrayList, (DeleteType) parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, DownloadState.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs[] newArray(int i) {
            return new IntercomPreviewArgs[i];
        }
    }

    public IntercomPreviewArgs() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ IntercomPreviewArgs copy$default(IntercomPreviewArgs intercomPreviewArgs, List list, DeleteType deleteType, String str, boolean z, DownloadState downloadState, int i, Object obj) {
        if ((i & 1) != 0) {
            list = intercomPreviewArgs.uris;
        }
        if ((i & 2) != 0) {
            deleteType = intercomPreviewArgs.deleteType;
        }
        if ((i & 4) != 0) {
            str = intercomPreviewArgs.ctaText;
        }
        if ((i & 8) != 0) {
            z = intercomPreviewArgs.showSendCTA;
        }
        if ((i & 16) != 0) {
            downloadState = intercomPreviewArgs.downloadState;
        }
        DownloadState downloadState2 = downloadState;
        String str2 = str;
        return intercomPreviewArgs.copy(list, deleteType, str2, z, downloadState2);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.uris;
    }

    /* renamed from: component2, reason: from getter */
    public final DeleteType getDeleteType() {
        return this.deleteType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSendCTA() {
        return this.showSendCTA;
    }

    /* renamed from: component5, reason: from getter */
    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final IntercomPreviewArgs copy(List<? extends IntercomPreviewFile> uris, DeleteType deleteType, String ctaText, boolean showSendCTA, DownloadState downloadState) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(deleteType, "deleteType");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        return new IntercomPreviewArgs(uris, deleteType, ctaText, showSendCTA, downloadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomPreviewArgs)) {
            return false;
        }
        IntercomPreviewArgs intercomPreviewArgs = (IntercomPreviewArgs) other;
        return Intrinsics.areEqual(this.uris, intercomPreviewArgs.uris) && Intrinsics.areEqual(this.deleteType, intercomPreviewArgs.deleteType) && Intrinsics.areEqual(this.ctaText, intercomPreviewArgs.ctaText) && this.showSendCTA == intercomPreviewArgs.showSendCTA && Intrinsics.areEqual(this.downloadState, intercomPreviewArgs.downloadState);
    }

    public int hashCode() {
        int hashCode = ((this.uris.hashCode() * 31) + this.deleteType.hashCode()) * 31;
        String str = this.ctaText;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showSendCTA)) * 31) + this.downloadState.hashCode();
    }

    public String toString() {
        return "IntercomPreviewArgs(uris=" + this.uris + ", deleteType=" + this.deleteType + ", ctaText=" + this.ctaText + ", showSendCTA=" + this.showSendCTA + ", downloadState=" + this.downloadState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<IntercomPreviewFile> list = this.uris;
        dest.writeInt(list.size());
        Iterator<IntercomPreviewFile> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.deleteType, flags);
        dest.writeString(this.ctaText);
        dest.writeInt(this.showSendCTA ? 1 : 0);
        this.downloadState.writeToParcel(dest, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomPreviewArgs(List<? extends IntercomPreviewFile> uris, DeleteType deleteType, String str, boolean z, DownloadState downloadState) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(deleteType, "deleteType");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        this.uris = uris;
        this.deleteType = deleteType;
        this.ctaText = str;
        this.showSendCTA = z;
        this.downloadState = downloadState;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IntercomPreviewArgs(java.util.List r7, io.intercom.android.sdk.ui.preview.data.DeleteType r8, java.lang.String r9, boolean r10, io.intercom.android.sdk.ui.preview.data.DownloadState r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L8
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            io.intercom.android.sdk.ui.preview.data.DeleteType$None r8 = io.intercom.android.sdk.ui.preview.data.DeleteType.None.INSTANCE
            io.intercom.android.sdk.ui.preview.data.DeleteType r8 = (io.intercom.android.sdk.ui.preview.data.DeleteType) r8
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L15
            r9 = 0
        L15:
            r13 = r12 & 8
            if (r13 == 0) goto L1a
            r10 = 0
        L1a:
            r12 = r12 & 16
            if (r12 == 0) goto L33
            io.intercom.android.sdk.ui.preview.data.DownloadState r0 = new io.intercom.android.sdk.ui.preview.data.DownloadState
            java.lang.String r4 = "Something went wrong"
            java.lang.String r5 = "Permission denied"
            r1 = 0
            java.lang.String r2 = "Saving..."
            java.lang.String r3 = "File saved"
            r0.<init>(r1, r2, r3, r4, r5)
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r8 = r6
            goto L39
        L33:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
        L39:
            r8.<init>(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs.<init>(java.util.List, io.intercom.android.sdk.ui.preview.data.DeleteType, java.lang.String, boolean, io.intercom.android.sdk.ui.preview.data.DownloadState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<IntercomPreviewFile> getUris() {
        return this.uris;
    }

    public final DeleteType getDeleteType() {
        return this.deleteType;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final boolean getShowSendCTA() {
        return this.showSendCTA;
    }

    public final DownloadState getDownloadState() {
        return this.downloadState;
    }
}
