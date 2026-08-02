package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadata;", "Landroid/os/Parcelable;", "status", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "institution", "Lcom/plaid/link/result/LinkInstitution;", "linkSessionId", "", "requestId", "metadataJson", "(Lcom/plaid/link/result/LinkExitMetadataStatus;Lcom/plaid/link/result/LinkInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInstitution", "()Lcom/plaid/link/result/LinkInstitution;", "getLinkSessionId", "()Ljava/lang/String;", "getMetadataJson", "getRequestId", "getStatus", "()Lcom/plaid/link/result/LinkExitMetadataStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkExitMetadata implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkExitMetadata> CREATOR = new Creator();

    @Nullable
    private final LinkInstitution institution;

    @Nullable
    private final String linkSessionId;

    @Nullable
    private final String metadataJson;

    @Nullable
    private final String requestId;

    @Nullable
    private final LinkExitMetadataStatus status;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkExitMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkExitMetadata createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkExitMetadata((LinkExitMetadataStatus) parcel.readParcelable(LinkExitMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkExitMetadata[] newArray(int i10) {
            return new LinkExitMetadata[i10];
        }
    }

    public LinkExitMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LinkExitMetadata copy$default(LinkExitMetadata linkExitMetadata, LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            linkExitMetadataStatus = linkExitMetadata.status;
        }
        if ((i10 & 2) != 0) {
            linkInstitution = linkExitMetadata.institution;
        }
        if ((i10 & 4) != 0) {
            str = linkExitMetadata.linkSessionId;
        }
        if ((i10 & 8) != 0) {
            str2 = linkExitMetadata.requestId;
        }
        if ((i10 & 16) != 0) {
            str3 = linkExitMetadata.metadataJson;
        }
        String str4 = str3;
        String str5 = str;
        return linkExitMetadata.copy(linkExitMetadataStatus, linkInstitution, str5, str2, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    @NotNull
    public final LinkExitMetadata copy(@Nullable LinkExitMetadataStatus status, @Nullable LinkInstitution institution, @Nullable String linkSessionId, @Nullable String requestId, @Nullable String metadataJson) {
        return new LinkExitMetadata(status, institution, linkSessionId, requestId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkExitMetadata)) {
            return false;
        }
        LinkExitMetadata linkExitMetadata = (LinkExitMetadata) other;
        return Intrinsics.areEqual(this.status, linkExitMetadata.status) && Intrinsics.areEqual(this.institution, linkExitMetadata.institution) && Intrinsics.areEqual(this.linkSessionId, linkExitMetadata.linkSessionId) && Intrinsics.areEqual(this.requestId, linkExitMetadata.requestId) && Intrinsics.areEqual(this.metadataJson, linkExitMetadata.metadataJson);
    }

    @Nullable
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    @Nullable
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    @Nullable
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        LinkExitMetadataStatus linkExitMetadataStatus = this.status;
        int hashCode = (linkExitMetadataStatus == null ? 0 : linkExitMetadataStatus.hashCode()) * 31;
        LinkInstitution linkInstitution = this.institution;
        int hashCode2 = (hashCode + (linkInstitution == null ? 0 : linkInstitution.hashCode())) * 31;
        String str = this.linkSessionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metadataJson;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkExitMetadata(status=" + this.status + ", institution=" + this.institution + ", linkSessionId=" + this.linkSessionId + ", requestId=" + this.requestId + ", metadataJson=" + this.metadataJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.status, flags);
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.requestId);
        parcel.writeString(this.metadataJson);
    }

    public LinkExitMetadata(@Nullable LinkExitMetadataStatus linkExitMetadataStatus, @Nullable LinkInstitution linkInstitution, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.status = linkExitMetadataStatus;
        this.institution = linkInstitution;
        this.linkSessionId = str;
        this.requestId = str2;
        this.metadataJson = str3;
    }

    public /* synthetic */ LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : linkExitMetadataStatus, (i10 & 2) != 0 ? null : linkInstitution, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}
