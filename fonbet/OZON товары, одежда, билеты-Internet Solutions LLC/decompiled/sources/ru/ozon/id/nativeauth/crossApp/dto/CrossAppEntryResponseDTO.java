package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppEntryResponseDTO;", "", "authToken", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "updatedTokens", "Lru/ozon/id/nativeauth/crossApp/dto/UpdatedTokensDTO;", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Lru/ozon/id/nativeauth/crossApp/dto/UpdatedTokensDTO;)V", "getAuthToken", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "getUpdatedTokens", "()Lru/ozon/id/nativeauth/crossApp/dto/UpdatedTokensDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossAppEntryResponseDTO {
    private final AuthTokenDTO authToken;
    private final UpdatedTokensDTO updatedTokens;

    public CrossAppEntryResponseDTO(AuthTokenDTO authTokenDTO, UpdatedTokensDTO updatedTokensDTO) {
        this.authToken = authTokenDTO;
        this.updatedTokens = updatedTokensDTO;
    }

    public static /* synthetic */ CrossAppEntryResponseDTO copy$default(CrossAppEntryResponseDTO crossAppEntryResponseDTO, AuthTokenDTO authTokenDTO, UpdatedTokensDTO updatedTokensDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authTokenDTO = crossAppEntryResponseDTO.authToken;
        }
        if ((i11 & 2) != 0) {
            updatedTokensDTO = crossAppEntryResponseDTO.updatedTokens;
        }
        return crossAppEntryResponseDTO.copy(authTokenDTO, updatedTokensDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    /* renamed from: component2, reason: from getter */
    public final UpdatedTokensDTO getUpdatedTokens() {
        return this.updatedTokens;
    }

    @NotNull
    public final CrossAppEntryResponseDTO copy(AuthTokenDTO authToken, UpdatedTokensDTO updatedTokens) {
        return new CrossAppEntryResponseDTO(authToken, updatedTokens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossAppEntryResponseDTO)) {
            return false;
        }
        CrossAppEntryResponseDTO crossAppEntryResponseDTO = (CrossAppEntryResponseDTO) other;
        return Intrinsics.d(this.authToken, crossAppEntryResponseDTO.authToken) && Intrinsics.d(this.updatedTokens, crossAppEntryResponseDTO.updatedTokens);
    }

    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    public final UpdatedTokensDTO getUpdatedTokens() {
        return this.updatedTokens;
    }

    public int hashCode() {
        AuthTokenDTO authTokenDTO = this.authToken;
        int hashCode = (authTokenDTO == null ? 0 : authTokenDTO.hashCode()) * 31;
        UpdatedTokensDTO updatedTokensDTO = this.updatedTokens;
        return hashCode + (updatedTokensDTO != null ? updatedTokensDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CrossAppEntryResponseDTO(authToken=" + this.authToken + ", updatedTokens=" + this.updatedTokens + ")";
    }
}
