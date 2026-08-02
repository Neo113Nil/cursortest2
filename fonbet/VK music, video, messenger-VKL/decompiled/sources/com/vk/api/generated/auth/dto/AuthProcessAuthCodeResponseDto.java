package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthProcessAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthProcessAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthProcessAuthCodeResponseDto> CREATOR = new a();

    @pmi0("auth_info")
    private final AuthCodeAuthInfoDto authInfo;

    @pmi0("codes")
    private final List<AuthIndexedCodeDto> codes;

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AuthIndexedErrorDto> errors;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final AuthCodeAuthUserDto profile;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthProcessAuthCodeResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("1")
        public static final StatusDto SUCCESS;
        private final int value;

        /* compiled from: AuthProcessAuthCodeResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("SUCCESS", 0, 1);
            SUCCESS = statusDto;
            StatusDto[] statusDtoArr = {statusDto};
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

    /* compiled from: AuthProcessAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthProcessAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthProcessAuthCodeResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AuthCodeAuthUserDto createFromParcel = parcel.readInt() == 0 ? null : AuthCodeAuthUserDto.CREATOR.createFromParcel(parcel);
            AuthCodeAuthInfoDto createFromParcel2 = parcel.readInt() == 0 ? null : AuthCodeAuthInfoDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AuthIndexedErrorDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            StatusDto createFromParcel3 = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AuthIndexedCodeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new AuthProcessAuthCodeResponseDto(createFromParcel, createFromParcel2, arrayList, createFromParcel3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthProcessAuthCodeResponseDto[] newArray(int i) {
            return new AuthProcessAuthCodeResponseDto[i];
        }
    }

    public AuthProcessAuthCodeResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final AuthCodeAuthInfoDto d() {
        return this.authInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AuthIndexedCodeDto> e() {
        return this.codes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthProcessAuthCodeResponseDto)) {
            return false;
        }
        AuthProcessAuthCodeResponseDto authProcessAuthCodeResponseDto = (AuthProcessAuthCodeResponseDto) obj;
        return epx.f(this.profile, authProcessAuthCodeResponseDto.profile) && epx.f(this.authInfo, authProcessAuthCodeResponseDto.authInfo) && epx.f(this.errors, authProcessAuthCodeResponseDto.errors) && this.status == authProcessAuthCodeResponseDto.status && epx.f(this.codes, authProcessAuthCodeResponseDto.codes);
    }

    public final AuthCodeAuthUserDto f() {
        return this.profile;
    }

    public final int hashCode() {
        AuthCodeAuthUserDto authCodeAuthUserDto = this.profile;
        int hashCode = (authCodeAuthUserDto == null ? 0 : authCodeAuthUserDto.hashCode()) * 31;
        AuthCodeAuthInfoDto authCodeAuthInfoDto = this.authInfo;
        int hashCode2 = (hashCode + (authCodeAuthInfoDto == null ? 0 : authCodeAuthInfoDto.hashCode())) * 31;
        List<AuthIndexedErrorDto> list = this.errors;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        StatusDto statusDto = this.status;
        int hashCode4 = (hashCode3 + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        List<AuthIndexedCodeDto> list2 = this.codes;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthProcessAuthCodeResponseDto(profile=");
        sb.append(this.profile);
        sb.append(", authInfo=");
        sb.append(this.authInfo);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", codes=");
        return ms9.a(')', sb, this.codes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthCodeAuthUserDto authCodeAuthUserDto = this.profile;
        if (authCodeAuthUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCodeAuthUserDto.writeToParcel(parcel, i);
        }
        AuthCodeAuthInfoDto authCodeAuthInfoDto = this.authInfo;
        if (authCodeAuthInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCodeAuthInfoDto.writeToParcel(parcel, i);
        }
        List<AuthIndexedErrorDto> list = this.errors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AuthIndexedErrorDto) f.next()).writeToParcel(parcel, i);
            }
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        List<AuthIndexedCodeDto> list2 = this.codes;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((AuthIndexedCodeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public AuthProcessAuthCodeResponseDto(AuthCodeAuthUserDto authCodeAuthUserDto, AuthCodeAuthInfoDto authCodeAuthInfoDto, List<AuthIndexedErrorDto> list, StatusDto statusDto, List<AuthIndexedCodeDto> list2) {
        this.profile = authCodeAuthUserDto;
        this.authInfo = authCodeAuthInfoDto;
        this.errors = list;
        this.status = statusDto;
        this.codes = list2;
    }

    public /* synthetic */ AuthProcessAuthCodeResponseDto(AuthCodeAuthUserDto authCodeAuthUserDto, AuthCodeAuthInfoDto authCodeAuthInfoDto, List list, StatusDto statusDto, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authCodeAuthUserDto, (i & 2) != 0 ? null : authCodeAuthInfoDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : statusDto, (i & 16) != 0 ? null : list2);
    }
}
