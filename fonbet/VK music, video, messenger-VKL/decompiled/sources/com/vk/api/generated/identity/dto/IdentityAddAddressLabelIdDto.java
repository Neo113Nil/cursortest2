package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityAddAddressLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityAddAddressLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityAddAddressLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityAddAddressLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityAddAddressLabelIdDto TYPE_1;

    @pmi0("2")
    public static final IdentityAddAddressLabelIdDto TYPE_2;
    private final int value;

    /* compiled from: IdentityAddAddressLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityAddAddressLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityAddAddressLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityAddAddressLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityAddAddressLabelIdDto[] newArray(int i) {
            return new IdentityAddAddressLabelIdDto[i];
        }
    }

    static {
        IdentityAddAddressLabelIdDto identityAddAddressLabelIdDto = new IdentityAddAddressLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityAddAddressLabelIdDto;
        IdentityAddAddressLabelIdDto identityAddAddressLabelIdDto2 = new IdentityAddAddressLabelIdDto("TYPE_2", 1, 2);
        TYPE_2 = identityAddAddressLabelIdDto2;
        IdentityAddAddressLabelIdDto[] identityAddAddressLabelIdDtoArr = {identityAddAddressLabelIdDto, identityAddAddressLabelIdDto2};
        $VALUES = identityAddAddressLabelIdDtoArr;
        $ENTRIES = new asp(identityAddAddressLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityAddAddressLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityAddAddressLabelIdDto valueOf(String str) {
        return (IdentityAddAddressLabelIdDto) Enum.valueOf(IdentityAddAddressLabelIdDto.class, str);
    }

    public static IdentityAddAddressLabelIdDto[] values() {
        return (IdentityAddAddressLabelIdDto[]) $VALUES.clone();
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
