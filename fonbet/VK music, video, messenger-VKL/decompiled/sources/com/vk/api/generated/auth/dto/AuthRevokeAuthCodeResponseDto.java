package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthRevokeAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthRevokeAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthRevokeAuthCodeResponseDto> CREATOR = new a();

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthRevokeAuthCodeResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("0")
        public static final StatusDto AUTH_CODE_NOT_REVOKED;

        @pmi0("1")
        public static final StatusDto AUTH_CODE_REVOKED;
        public static final Parcelable.Creator<StatusDto> CREATOR;
        private final int value;

        /* compiled from: AuthRevokeAuthCodeResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("AUTH_CODE_NOT_REVOKED", 0, 0);
            AUTH_CODE_NOT_REVOKED = statusDto;
            StatusDto statusDto2 = new StatusDto("AUTH_CODE_REVOKED", 1, 1);
            AUTH_CODE_REVOKED = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: AuthRevokeAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthRevokeAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRevokeAuthCodeResponseDto createFromParcel(Parcel parcel) {
            return new AuthRevokeAuthCodeResponseDto(parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRevokeAuthCodeResponseDto[] newArray(int i) {
            return new AuthRevokeAuthCodeResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthRevokeAuthCodeResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthRevokeAuthCodeResponseDto) && this.status == ((AuthRevokeAuthCodeResponseDto) obj).status;
    }

    public final int hashCode() {
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            return 0;
        }
        return statusDto.hashCode();
    }

    public final String toString() {
        return "AuthRevokeAuthCodeResponseDto(status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
    }

    public AuthRevokeAuthCodeResponseDto(StatusDto statusDto) {
        this.status = statusDto;
    }

    public /* synthetic */ AuthRevokeAuthCodeResponseDto(StatusDto statusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : statusDto);
    }
}
