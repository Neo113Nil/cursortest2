package ru.ozon.id.nativeauth.crossApp.dto;

import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/UpdatedTokensDTO;", "", "sharedStoreRefreshToken", "", "sharedStoreAccessToken", "sharedStoreIdpToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSharedStoreRefreshToken", "()Ljava/lang/String;", "getSharedStoreAccessToken", "getSharedStoreIdpToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdatedTokensDTO {
    private final String sharedStoreAccessToken;
    private final String sharedStoreIdpToken;
    private final String sharedStoreRefreshToken;

    public UpdatedTokensDTO() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UpdatedTokensDTO copy$default(UpdatedTokensDTO updatedTokensDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = updatedTokensDTO.sharedStoreRefreshToken;
        }
        if ((i11 & 2) != 0) {
            str2 = updatedTokensDTO.sharedStoreAccessToken;
        }
        if ((i11 & 4) != 0) {
            str3 = updatedTokensDTO.sharedStoreIdpToken;
        }
        return updatedTokensDTO.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSharedStoreRefreshToken() {
        return this.sharedStoreRefreshToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSharedStoreAccessToken() {
        return this.sharedStoreAccessToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSharedStoreIdpToken() {
        return this.sharedStoreIdpToken;
    }

    @NotNull
    public final UpdatedTokensDTO copy(String sharedStoreRefreshToken, String sharedStoreAccessToken, String sharedStoreIdpToken) {
        return new UpdatedTokensDTO(sharedStoreRefreshToken, sharedStoreAccessToken, sharedStoreIdpToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatedTokensDTO)) {
            return false;
        }
        UpdatedTokensDTO updatedTokensDTO = (UpdatedTokensDTO) other;
        return Intrinsics.d(this.sharedStoreRefreshToken, updatedTokensDTO.sharedStoreRefreshToken) && Intrinsics.d(this.sharedStoreAccessToken, updatedTokensDTO.sharedStoreAccessToken) && Intrinsics.d(this.sharedStoreIdpToken, updatedTokensDTO.sharedStoreIdpToken);
    }

    public final String getSharedStoreAccessToken() {
        return this.sharedStoreAccessToken;
    }

    public final String getSharedStoreIdpToken() {
        return this.sharedStoreIdpToken;
    }

    public final String getSharedStoreRefreshToken() {
        return this.sharedStoreRefreshToken;
    }

    public int hashCode() {
        String str = this.sharedStoreRefreshToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sharedStoreAccessToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharedStoreIdpToken;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sharedStoreRefreshToken;
        String str2 = this.sharedStoreAccessToken;
        return o0.c(C3660k.d("UpdatedTokensDTO(sharedStoreRefreshToken=", str, ", sharedStoreAccessToken=", str2, ", sharedStoreIdpToken="), this.sharedStoreIdpToken, ")");
    }

    public UpdatedTokensDTO(String str, String str2, String str3) {
        this.sharedStoreRefreshToken = str;
        this.sharedStoreAccessToken = str2;
        this.sharedStoreIdpToken = str3;
    }

    public /* synthetic */ UpdatedTokensDTO(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
