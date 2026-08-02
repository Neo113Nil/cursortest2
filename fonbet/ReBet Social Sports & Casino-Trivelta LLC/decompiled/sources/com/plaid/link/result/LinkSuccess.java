package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C3564b4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/plaid/link/result/LinkSuccess;", "Lcom/plaid/link/result/LinkResult;", "publicToken", "", "metadata", "Lcom/plaid/link/result/LinkSuccessMetadata;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)V", "getMetadata", "()Lcom/plaid/link/result/LinkSuccessMetadata;", "getPublicToken", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkSuccess implements LinkResult {

    @NotNull
    private final LinkSuccessMetadata metadata;

    @NotNull
    private final String publicToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LinkSuccess> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/link/result/LinkSuccess$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/result/LinkSuccess;", "linkData", "", "", "accounts", "", "Lcom/plaid/link/result/LinkAccount;", "fromMap$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinkSuccess fromMap$link_sdk_release(@NotNull Map<String, String> linkData, @NotNull List<LinkAccount> accounts) {
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            String a10 = C3564b4.a("public_token", "", linkData);
            String a11 = C3564b4.a("institution_id", "", linkData);
            String a12 = C3564b4.a("institution_name", "", linkData);
            String linkSessionId = C3564b4.a("link_session_id", "", linkData);
            String metadataJson = C3564b4.a("metadata_json", "", linkData);
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
            Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
            return new LinkSuccess(a10, new LinkSuccessMetadata((a11 == null || a11.length() == 0 || a12 == null || a12.length() == 0) ? null : new LinkInstitution(a11, a12), accounts, linkSessionId, metadataJson));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkSuccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkSuccess createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkSuccess(parcel.readString(), LinkSuccessMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkSuccess[] newArray(int i10) {
            return new LinkSuccess[i10];
        }
    }

    public LinkSuccess(@NotNull String publicToken, @NotNull LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.publicToken = publicToken;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkSuccess copy$default(LinkSuccess linkSuccess, String str, LinkSuccessMetadata linkSuccessMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = linkSuccess.publicToken;
        }
        if ((i10 & 2) != 0) {
            linkSuccessMetadata = linkSuccess.metadata;
        }
        return linkSuccess.copy(str, linkSuccessMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPublicToken() {
        return this.publicToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final LinkSuccess copy(@NotNull String publicToken, @NotNull LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSuccess)) {
            return false;
        }
        LinkSuccess linkSuccess = (LinkSuccess) other;
        return Intrinsics.areEqual(this.publicToken, linkSuccess.publicToken) && Intrinsics.areEqual(this.metadata, linkSuccess.metadata);
    }

    @NotNull
    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getPublicToken() {
        return this.publicToken;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.publicToken.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LinkSuccess(publicToken=" + this.publicToken + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.publicToken);
        this.metadata.writeToParcel(parcel, flags);
    }
}
