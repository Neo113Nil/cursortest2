package ru.ozon.android.inAppUpdate.internal.network;

import G.g;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/network/CheckUpdateResponseDTO;", "Landroid/os/Parcelable;", "link", "", "version", "mustUpdate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getLink", "()Ljava/lang/String;", "getVersion", "getMustUpdate", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CheckUpdateResponseDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckUpdateResponseDTO> CREATOR = new a();

    @NotNull
    private final String link;
    private final boolean mustUpdate;

    @NotNull
    private final String version;

    public static final class a implements Parcelable.Creator<CheckUpdateResponseDTO> {
        @Override // android.os.Parcelable.Creator
        public final CheckUpdateResponseDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckUpdateResponseDTO(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckUpdateResponseDTO[] newArray(int i11) {
            return new CheckUpdateResponseDTO[i11];
        }
    }

    public CheckUpdateResponseDTO(@i(name = "link") @NotNull String link, @i(name = "version") @NotNull String version, @i(name = "mustUpdate") boolean z11) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(version, "version");
        this.link = link;
        this.version = version;
        this.mustUpdate = z11;
    }

    public static /* synthetic */ CheckUpdateResponseDTO copy$default(CheckUpdateResponseDTO checkUpdateResponseDTO, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = checkUpdateResponseDTO.link;
        }
        if ((i11 & 2) != 0) {
            str2 = checkUpdateResponseDTO.version;
        }
        if ((i11 & 4) != 0) {
            z11 = checkUpdateResponseDTO.mustUpdate;
        }
        return checkUpdateResponseDTO.copy(str, str2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMustUpdate() {
        return this.mustUpdate;
    }

    @NotNull
    public final CheckUpdateResponseDTO copy(@i(name = "link") @NotNull String link, @i(name = "version") @NotNull String version, @i(name = "mustUpdate") boolean mustUpdate) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(version, "version");
        return new CheckUpdateResponseDTO(link, version, mustUpdate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUpdateResponseDTO)) {
            return false;
        }
        CheckUpdateResponseDTO checkUpdateResponseDTO = (CheckUpdateResponseDTO) other;
        return Intrinsics.d(this.link, checkUpdateResponseDTO.link) && Intrinsics.d(this.version, checkUpdateResponseDTO.version) && this.mustUpdate == checkUpdateResponseDTO.mustUpdate;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final boolean getMustUpdate() {
        return this.mustUpdate;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Boolean.hashCode(this.mustUpdate) + g.a(this.link.hashCode() * 31, 31, this.version);
    }

    @NotNull
    public String toString() {
        String str = this.link;
        String str2 = this.version;
        return Pk0.a.a(")", C3660k.d("CheckUpdateResponseDTO(link=", str, ", version=", str2, ", mustUpdate="), this.mustUpdate);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.link);
        dest.writeString(this.version);
        dest.writeInt(this.mustUpdate ? 1 : 0);
    }
}
