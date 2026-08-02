package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthSignupSexDto.kt */
/* loaded from: classes14.dex */
public final class AuthSignupSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthSignupSexDto[] $VALUES;
    public static final Parcelable.Creator<AuthSignupSexDto> CREATOR;

    @pmi0("1")
    public static final AuthSignupSexDto FEMALE;

    @pmi0("2")
    public static final AuthSignupSexDto MALE;

    @pmi0("0")
    public static final AuthSignupSexDto UNDEFINED;
    private final int value;

    /* compiled from: AuthSignupSexDto.kt */
    public static final class a implements Parcelable.Creator<AuthSignupSexDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSignupSexDto createFromParcel(Parcel parcel) {
            return AuthSignupSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSignupSexDto[] newArray(int i) {
            return new AuthSignupSexDto[i];
        }
    }

    static {
        AuthSignupSexDto authSignupSexDto = new AuthSignupSexDto("UNDEFINED", 0, 0);
        UNDEFINED = authSignupSexDto;
        AuthSignupSexDto authSignupSexDto2 = new AuthSignupSexDto("FEMALE", 1, 1);
        FEMALE = authSignupSexDto2;
        AuthSignupSexDto authSignupSexDto3 = new AuthSignupSexDto("MALE", 2, 2);
        MALE = authSignupSexDto3;
        AuthSignupSexDto[] authSignupSexDtoArr = {authSignupSexDto, authSignupSexDto2, authSignupSexDto3};
        $VALUES = authSignupSexDtoArr;
        $ENTRIES = new asp(authSignupSexDtoArr);
        CREATOR = new a();
    }

    private AuthSignupSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AuthSignupSexDto valueOf(String str) {
        return (AuthSignupSexDto) Enum.valueOf(AuthSignupSexDto.class, str);
    }

    public static AuthSignupSexDto[] values() {
        return (AuthSignupSexDto[]) $VALUES.clone();
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
