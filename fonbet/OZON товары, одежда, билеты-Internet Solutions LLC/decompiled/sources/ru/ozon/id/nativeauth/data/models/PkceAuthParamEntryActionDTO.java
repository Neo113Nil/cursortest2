package ru.ozon.id.nativeauth.data.models;

import G.g;
import I0.C3173b;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTO;", "Landroid/os/Parcelable;", "codeVerifier", "", "codeChallenge", "codeChallengeMethod", "state", "scopes", "clientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCodeVerifier", "()Ljava/lang/String;", "getCodeChallenge", "getCodeChallengeMethod", "getState", "getScopes", "getClientId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PkceAuthParamEntryActionDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PkceAuthParamEntryActionDTO> CREATOR = new a();

    @NotNull
    private final String clientId;

    @NotNull
    private final String codeChallenge;

    @NotNull
    private final String codeChallengeMethod;

    @NotNull
    private final String codeVerifier;

    @NotNull
    private final String scopes;

    @NotNull
    private final String state;

    public static final class a implements Parcelable.Creator<PkceAuthParamEntryActionDTO> {
        @Override // android.os.Parcelable.Creator
        public final PkceAuthParamEntryActionDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PkceAuthParamEntryActionDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PkceAuthParamEntryActionDTO[] newArray(int i11) {
            return new PkceAuthParamEntryActionDTO[i11];
        }
    }

    public PkceAuthParamEntryActionDTO(@NotNull String codeVerifier, @NotNull String codeChallenge, @NotNull String codeChallengeMethod, @NotNull String state, @NotNull String scopes, @NotNull String clientId) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.codeVerifier = codeVerifier;
        this.codeChallenge = codeChallenge;
        this.codeChallengeMethod = codeChallengeMethod;
        this.state = state;
        this.scopes = scopes;
        this.clientId = clientId;
    }

    public static /* synthetic */ PkceAuthParamEntryActionDTO copy$default(PkceAuthParamEntryActionDTO pkceAuthParamEntryActionDTO, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pkceAuthParamEntryActionDTO.codeVerifier;
        }
        if ((i11 & 2) != 0) {
            str2 = pkceAuthParamEntryActionDTO.codeChallenge;
        }
        if ((i11 & 4) != 0) {
            str3 = pkceAuthParamEntryActionDTO.codeChallengeMethod;
        }
        if ((i11 & 8) != 0) {
            str4 = pkceAuthParamEntryActionDTO.state;
        }
        if ((i11 & 16) != 0) {
            str5 = pkceAuthParamEntryActionDTO.scopes;
        }
        if ((i11 & 32) != 0) {
            str6 = pkceAuthParamEntryActionDTO.clientId;
        }
        String str7 = str5;
        String str8 = str6;
        return pkceAuthParamEntryActionDTO.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getScopes() {
        return this.scopes;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final PkceAuthParamEntryActionDTO copy(@NotNull String codeVerifier, @NotNull String codeChallenge, @NotNull String codeChallengeMethod, @NotNull String state, @NotNull String scopes, @NotNull String clientId) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return new PkceAuthParamEntryActionDTO(codeVerifier, codeChallenge, codeChallengeMethod, state, scopes, clientId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkceAuthParamEntryActionDTO)) {
            return false;
        }
        PkceAuthParamEntryActionDTO pkceAuthParamEntryActionDTO = (PkceAuthParamEntryActionDTO) other;
        return Intrinsics.d(this.codeVerifier, pkceAuthParamEntryActionDTO.codeVerifier) && Intrinsics.d(this.codeChallenge, pkceAuthParamEntryActionDTO.codeChallenge) && Intrinsics.d(this.codeChallengeMethod, pkceAuthParamEntryActionDTO.codeChallengeMethod) && Intrinsics.d(this.state, pkceAuthParamEntryActionDTO.state) && Intrinsics.d(this.scopes, pkceAuthParamEntryActionDTO.scopes) && Intrinsics.d(this.clientId, pkceAuthParamEntryActionDTO.clientId);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @NotNull
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @NotNull
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    @NotNull
    public final String getScopes() {
        return this.scopes;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.clientId.hashCode() + g.a(g.a(g.a(g.a(this.codeVerifier.hashCode() * 31, 31, this.codeChallenge), 31, this.codeChallengeMethod), 31, this.state), 31, this.scopes);
    }

    @NotNull
    public String toString() {
        String str = this.codeVerifier;
        String str2 = this.codeChallenge;
        String str3 = this.codeChallengeMethod;
        String str4 = this.state;
        String str5 = this.scopes;
        String str6 = this.clientId;
        StringBuilder d11 = C3660k.d("PkceAuthParamEntryActionDTO(codeVerifier=", str, ", codeChallenge=", str2, ", codeChallengeMethod=");
        Nh.a.h(d11, str3, ", state=", str4, ", scopes=");
        return C3173b.c(d11, str5, ", clientId=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.codeVerifier);
        dest.writeString(this.codeChallenge);
        dest.writeString(this.codeChallengeMethod);
        dest.writeString(this.state);
        dest.writeString(this.scopes);
        dest.writeString(this.clientId);
    }
}
