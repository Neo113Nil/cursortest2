package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityEditAddressLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityEditAddressLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityEditAddressLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityEditAddressLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityEditAddressLabelIdDto TYPE_1;

    @pmi0("2")
    public static final IdentityEditAddressLabelIdDto TYPE_2;
    private final int value;

    /* compiled from: IdentityEditAddressLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityEditAddressLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityEditAddressLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityEditAddressLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityEditAddressLabelIdDto[] newArray(int i) {
            return new IdentityEditAddressLabelIdDto[i];
        }
    }

    static {
        IdentityEditAddressLabelIdDto identityEditAddressLabelIdDto = new IdentityEditAddressLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityEditAddressLabelIdDto;
        IdentityEditAddressLabelIdDto identityEditAddressLabelIdDto2 = new IdentityEditAddressLabelIdDto("TYPE_2", 1, 2);
        TYPE_2 = identityEditAddressLabelIdDto2;
        IdentityEditAddressLabelIdDto[] identityEditAddressLabelIdDtoArr = {identityEditAddressLabelIdDto, identityEditAddressLabelIdDto2};
        $VALUES = identityEditAddressLabelIdDtoArr;
        $ENTRIES = new asp(identityEditAddressLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityEditAddressLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityEditAddressLabelIdDto valueOf(String str) {
        return (IdentityEditAddressLabelIdDto) Enum.valueOf(IdentityEditAddressLabelIdDto.class, str);
    }

    public static IdentityEditAddressLabelIdDto[] values() {
        return (IdentityEditAddressLabelIdDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
