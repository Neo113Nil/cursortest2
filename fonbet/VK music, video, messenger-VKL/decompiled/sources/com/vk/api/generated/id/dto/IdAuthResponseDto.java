package com.vk.api.generated.id.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: IdAuthResponseDto.kt */
/* loaded from: classes14.dex */
public final class IdAuthResponseDto implements Parcelable {
    public static final Parcelable.Creator<IdAuthResponseDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final String accessToken;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("id_token")
    private final String idToken;

    @pmi0(SharedKt.PARAM_REFRESH_TOKEN)
    private final String refreshToken;

    @pmi0("token_type")
    private final TokenTypeDto tokenType;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdAuthResponseDto.kt */
    public static final class TokenTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TokenTypeDto[] $VALUES;

        @pmi0("Bearer")
        public static final TokenTypeDto BEARER;
        public static final Parcelable.Creator<TokenTypeDto> CREATOR;
        private final String value;

        /* compiled from: IdAuthResponseDto.kt */
        public static final class a implements Parcelable.Creator<TokenTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TokenTypeDto createFromParcel(Parcel parcel) {
                return TokenTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TokenTypeDto[] newArray(int i) {
                return new TokenTypeDto[i];
            }
        }

        static {
            TokenTypeDto tokenTypeDto = new TokenTypeDto("BEARER", 0, "Bearer");
            BEARER = tokenTypeDto;
            TokenTypeDto[] tokenTypeDtoArr = {tokenTypeDto};
            $VALUES = tokenTypeDtoArr;
            $ENTRIES = new asp(tokenTypeDtoArr);
            CREATOR = new a();
        }

        private TokenTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TokenTypeDto valueOf(String str) {
            return (TokenTypeDto) Enum.valueOf(TokenTypeDto.class, str);
        }

        public static TokenTypeDto[] values() {
            return (TokenTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: IdAuthResponseDto.kt */
    public static final class a implements Parcelable.Creator<IdAuthResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final IdAuthResponseDto createFromParcel(Parcel parcel) {
            return new IdAuthResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? TokenTypeDto.CREATOR.createFromParcel(parcel) : null, (UserId) parcel.readParcelable(IdAuthResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdAuthResponseDto[] newArray(int i) {
            return new IdAuthResponseDto[i];
        }
    }

    public IdAuthResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdAuthResponseDto)) {
            return false;
        }
        IdAuthResponseDto idAuthResponseDto = (IdAuthResponseDto) obj;
        return epx.f(this.refreshToken, idAuthResponseDto.refreshToken) && epx.f(this.idToken, idAuthResponseDto.idToken) && epx.f(this.accessToken, idAuthResponseDto.accessToken) && epx.f(this.expiresIn, idAuthResponseDto.expiresIn) && this.tokenType == idAuthResponseDto.tokenType && epx.f(this.userId, idAuthResponseDto.userId);
    }

    public final int hashCode() {
        String str = this.refreshToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.expiresIn;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        TokenTypeDto tokenTypeDto = this.tokenType;
        int hashCode5 = (hashCode4 + (tokenTypeDto == null ? 0 : tokenTypeDto.hashCode())) * 31;
        UserId userId = this.userId;
        return hashCode5 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdAuthResponseDto(refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", idToken=");
        sb.append(this.idToken);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", tokenType=");
        sb.append(this.tokenType);
        sb.append(", userId=");
        return gp.b(sb, this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.refreshToken);
        parcel.writeString(this.idToken);
        parcel.writeString(this.accessToken);
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        TokenTypeDto tokenTypeDto = this.tokenType;
        if (tokenTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.userId, i);
    }

    public IdAuthResponseDto(String str, String str2, String str3, Integer num, TokenTypeDto tokenTypeDto, UserId userId) {
        this.refreshToken = str;
        this.idToken = str2;
        this.accessToken = str3;
        this.expiresIn = num;
        this.tokenType = tokenTypeDto;
        this.userId = userId;
    }

    public /* synthetic */ IdAuthResponseDto(String str, String str2, String str3, Integer num, TokenTypeDto tokenTypeDto, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : tokenTypeDto, (i & 32) != 0 ? null : userId);
    }
}
