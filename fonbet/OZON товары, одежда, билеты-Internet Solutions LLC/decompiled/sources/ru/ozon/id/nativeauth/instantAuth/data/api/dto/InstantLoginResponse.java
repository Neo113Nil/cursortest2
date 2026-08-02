package ru.ozon.id.nativeauth.instantAuth.data.api.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse;", "", "isSuccess", "", "data", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse$DataDTO;", "<init>", "(ZLru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse$DataDTO;)V", "()Z", "getData", "()Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse$DataDTO;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "DataDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstantLoginResponse {

    @NotNull
    private final DataDTO data;
    private final boolean isSuccess;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse$DataDTO;", "", "authToken", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "message", "", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Ljava/lang/String;)V", "getAuthToken", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataDTO {
        private final AuthTokenDTO authToken;
        private final String message;

        public DataDTO(AuthTokenDTO authTokenDTO, String str) {
            this.authToken = authTokenDTO;
            this.message = str;
        }

        public static /* synthetic */ DataDTO copy$default(DataDTO dataDTO, AuthTokenDTO authTokenDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authTokenDTO = dataDTO.authToken;
            }
            if ((i11 & 2) != 0) {
                str = dataDTO.message;
            }
            return dataDTO.copy(authTokenDTO, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final DataDTO copy(AuthTokenDTO authToken, String message) {
            return new DataDTO(authToken, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) other;
            return Intrinsics.d(this.authToken, dataDTO.authToken) && Intrinsics.d(this.message, dataDTO.message);
        }

        public final AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            AuthTokenDTO authTokenDTO = this.authToken;
            int hashCode = (authTokenDTO == null ? 0 : authTokenDTO.hashCode()) * 31;
            String str = this.message;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DataDTO(authToken=" + this.authToken + ", message=" + this.message + ")";
        }
    }

    public InstantLoginResponse(boolean z11, @NotNull DataDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.isSuccess = z11;
        this.data = data;
    }

    public static /* synthetic */ InstantLoginResponse copy$default(InstantLoginResponse instantLoginResponse, boolean z11, DataDTO dataDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = instantLoginResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            dataDTO = instantLoginResponse.data;
        }
        return instantLoginResponse.copy(z11, dataDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DataDTO getData() {
        return this.data;
    }

    @NotNull
    public final InstantLoginResponse copy(boolean isSuccess, @NotNull DataDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new InstantLoginResponse(isSuccess, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantLoginResponse)) {
            return false;
        }
        InstantLoginResponse instantLoginResponse = (InstantLoginResponse) other;
        return this.isSuccess == instantLoginResponse.isSuccess && Intrinsics.d(this.data, instantLoginResponse.data);
    }

    @NotNull
    public final DataDTO getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode() + (Boolean.hashCode(this.isSuccess) * 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "InstantLoginResponse(isSuccess=" + this.isSuccess + ", data=" + this.data + ")";
    }
}
