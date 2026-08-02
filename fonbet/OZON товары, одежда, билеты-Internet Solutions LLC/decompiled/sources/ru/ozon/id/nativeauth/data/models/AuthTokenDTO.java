package ru.ozon.id.nativeauth.data.models;

import B0.C2454a;
import C.o0;
import G.g;
import N3.C3660k;
import Pk0.i;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0006J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006%"}, d2 = {"Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "Landroid/os/Parcelable;", "accessToken", "", "tokenType", "expiresIn", "", "refreshToken", "idpToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getTokenType", "getExpiresIn", "()I", "getRefreshToken", "getIdpToken", "copy", "component1", "component2", "component3", "component4", "component5", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthTokenDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthTokenDTO> CREATOR = new a();

    @NotNull
    private final String accessToken;
    private final int expiresIn;
    private final String idpToken;

    @NotNull
    private final String refreshToken;

    @NotNull
    private final String tokenType;

    public static final class a implements Parcelable.Creator<AuthTokenDTO> {
        @Override // android.os.Parcelable.Creator
        public final AuthTokenDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthTokenDTO(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTokenDTO[] newArray(int i11) {
            return new AuthTokenDTO[i11];
        }
    }

    public AuthTokenDTO() {
        this(null, null, 0, null, null, 31, null);
    }

    public static /* synthetic */ AuthTokenDTO copy$default(AuthTokenDTO authTokenDTO, String str, String str2, int i11, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = authTokenDTO.accessToken;
        }
        if ((i12 & 2) != 0) {
            str2 = authTokenDTO.tokenType;
        }
        if ((i12 & 4) != 0) {
            i11 = authTokenDTO.expiresIn;
        }
        if ((i12 & 8) != 0) {
            str3 = authTokenDTO.refreshToken;
        }
        if ((i12 & 16) != 0) {
            str4 = authTokenDTO.idpToken;
        }
        String str5 = str4;
        int i13 = i11;
        return authTokenDTO.copy(str, str2, i13, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIdpToken() {
        return this.idpToken;
    }

    @NotNull
    public final AuthTokenDTO copy(@NotNull String accessToken, @NotNull String tokenType, int expiresIn, @NotNull String refreshToken, String idpToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new AuthTokenDTO(accessToken, tokenType, expiresIn, refreshToken, idpToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthTokenDTO)) {
            return false;
        }
        AuthTokenDTO authTokenDTO = (AuthTokenDTO) other;
        return Intrinsics.d(this.accessToken, authTokenDTO.accessToken) && Intrinsics.d(this.tokenType, authTokenDTO.tokenType) && this.expiresIn == authTokenDTO.expiresIn && Intrinsics.d(this.refreshToken, authTokenDTO.refreshToken) && Intrinsics.d(this.idpToken, authTokenDTO.idpToken);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final String getIdpToken() {
        return this.idpToken;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int a11 = g.a(C2454a.a(this.expiresIn, g.a(this.accessToken.hashCode() * 31, 31, this.tokenType), 31), 31, this.refreshToken);
        String str = this.idpToken;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.tokenType;
        int i11 = this.expiresIn;
        String str3 = this.refreshToken;
        String str4 = this.idpToken;
        StringBuilder d11 = C3660k.d("AuthTokenDTO(accessToken=", str, ", tokenType=", str2, ", expiresIn=");
        i.c(i11, ", refreshToken=", str3, ", idpToken=", d11);
        return o0.c(d11, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accessToken);
        dest.writeString(this.tokenType);
        dest.writeInt(this.expiresIn);
        dest.writeString(this.refreshToken);
        dest.writeString(this.idpToken);
    }

    public AuthTokenDTO(@NotNull String accessToken, @NotNull String tokenType, int i11, @NotNull String refreshToken, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = i11;
        this.refreshToken = refreshToken;
        this.idpToken = str;
    }

    public static /* synthetic */ AuthTokenDTO copy$default(AuthTokenDTO authTokenDTO, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = authTokenDTO.accessToken;
        }
        if ((i12 & 2) != 0) {
            str2 = authTokenDTO.tokenType;
        }
        if ((i12 & 4) != 0) {
            i11 = authTokenDTO.expiresIn;
        }
        if ((i12 & 8) != 0) {
            str3 = authTokenDTO.refreshToken;
        }
        return authTokenDTO.copy(str, str2, i11, str3);
    }

    @InterfaceC3999a
    public final /* synthetic */ AuthTokenDTO copy(String accessToken, String tokenType, int expiresIn, String refreshToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new AuthTokenDTO(accessToken, tokenType, expiresIn, refreshToken, this.idpToken);
    }

    public /* synthetic */ AuthTokenDTO(String str, String str2, int i11, String str3, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? -1 : i11, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ AuthTokenDTO(String accessToken, String tokenType, int i11, String refreshToken) {
        this(accessToken, tokenType, i11, refreshToken, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
    }
}
