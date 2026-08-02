package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthValidatePhoneCheckModeDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneCheckModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthValidatePhoneCheckModeDto[] $VALUES;
    public static final Parcelable.Creator<AuthValidatePhoneCheckModeDto> CREATOR;

    @pmi0("0")
    public static final AuthValidatePhoneCheckModeDto TYPE_0;

    @pmi0("1")
    public static final AuthValidatePhoneCheckModeDto TYPE_1;
    private final int value;

    /* compiled from: AuthValidatePhoneCheckModeDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneCheckModeDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCheckModeDto createFromParcel(Parcel parcel) {
            return AuthValidatePhoneCheckModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCheckModeDto[] newArray(int i) {
            return new AuthValidatePhoneCheckModeDto[i];
        }
    }

    static {
        AuthValidatePhoneCheckModeDto authValidatePhoneCheckModeDto = new AuthValidatePhoneCheckModeDto("TYPE_0", 0, 0);
        TYPE_0 = authValidatePhoneCheckModeDto;
        AuthValidatePhoneCheckModeDto authValidatePhoneCheckModeDto2 = new AuthValidatePhoneCheckModeDto("TYPE_1", 1, 1);
        TYPE_1 = authValidatePhoneCheckModeDto2;
        AuthValidatePhoneCheckModeDto[] authValidatePhoneCheckModeDtoArr = {authValidatePhoneCheckModeDto, authValidatePhoneCheckModeDto2};
        $VALUES = authValidatePhoneCheckModeDtoArr;
        $ENTRIES = new asp(authValidatePhoneCheckModeDtoArr);
        CREATOR = new a();
    }

    private AuthValidatePhoneCheckModeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AuthValidatePhoneCheckModeDto valueOf(String str) {
        return (AuthValidatePhoneCheckModeDto) Enum.valueOf(AuthValidatePhoneCheckModeDto.class, str);
    }

    public static AuthValidatePhoneCheckModeDto[] values() {
        return (AuthValidatePhoneCheckModeDto[]) $VALUES.clone();
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
