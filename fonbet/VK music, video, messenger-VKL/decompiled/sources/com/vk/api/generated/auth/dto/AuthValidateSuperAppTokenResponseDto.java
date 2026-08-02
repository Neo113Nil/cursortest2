package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AuthValidateSuperAppTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateSuperAppTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateSuperAppTokenResponseDto> CREATOR = new a();

    @pmi0("need_password")
    private final NeedPasswordDto needPassword;

    @pmi0(O6.e1)
    private final String sid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidateSuperAppTokenResponseDto.kt */
    public static final class NeedPasswordDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NeedPasswordDto[] $VALUES;
        public static final Parcelable.Creator<NeedPasswordDto> CREATOR;

        @pmi0("0")
        public static final NeedPasswordDto NO;

        @pmi0("1")
        public static final NeedPasswordDto YES;
        private final int value;

        /* compiled from: AuthValidateSuperAppTokenResponseDto.kt */
        public static final class a implements Parcelable.Creator<NeedPasswordDto> {
            @Override // android.os.Parcelable.Creator
            public final NeedPasswordDto createFromParcel(Parcel parcel) {
                return NeedPasswordDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NeedPasswordDto[] newArray(int i) {
                return new NeedPasswordDto[i];
            }
        }

        static {
            NeedPasswordDto needPasswordDto = new NeedPasswordDto("NO", 0, 0);
            NO = needPasswordDto;
            NeedPasswordDto needPasswordDto2 = new NeedPasswordDto("YES", 1, 1);
            YES = needPasswordDto2;
            NeedPasswordDto[] needPasswordDtoArr = {needPasswordDto, needPasswordDto2};
            $VALUES = needPasswordDtoArr;
            $ENTRIES = new asp(needPasswordDtoArr);
            CREATOR = new a();
        }

        private NeedPasswordDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static NeedPasswordDto valueOf(String str) {
            return (NeedPasswordDto) Enum.valueOf(NeedPasswordDto.class, str);
        }

        public static NeedPasswordDto[] values() {
            return (NeedPasswordDto[]) $VALUES.clone();
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

    /* compiled from: AuthValidateSuperAppTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateSuperAppTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateSuperAppTokenResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidateSuperAppTokenResponseDto(parcel.readString(), NeedPasswordDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateSuperAppTokenResponseDto[] newArray(int i) {
            return new AuthValidateSuperAppTokenResponseDto[i];
        }
    }

    public AuthValidateSuperAppTokenResponseDto(String str, NeedPasswordDto needPasswordDto) {
        this.sid = str;
        this.needPassword = needPasswordDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateSuperAppTokenResponseDto)) {
            return false;
        }
        AuthValidateSuperAppTokenResponseDto authValidateSuperAppTokenResponseDto = (AuthValidateSuperAppTokenResponseDto) obj;
        return epx.f(this.sid, authValidateSuperAppTokenResponseDto.sid) && this.needPassword == authValidateSuperAppTokenResponseDto.needPassword;
    }

    public final int hashCode() {
        return this.needPassword.hashCode() + (this.sid.hashCode() * 31);
    }

    public final String toString() {
        return "AuthValidateSuperAppTokenResponseDto(sid=" + this.sid + ", needPassword=" + this.needPassword + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        this.needPassword.writeToParcel(parcel, i);
    }
}
