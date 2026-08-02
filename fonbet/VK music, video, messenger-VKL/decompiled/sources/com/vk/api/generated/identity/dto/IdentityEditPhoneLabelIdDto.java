package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityEditPhoneLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityEditPhoneLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityEditPhoneLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityEditPhoneLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityEditPhoneLabelIdDto TYPE_1;

    @pmi0("2")
    public static final IdentityEditPhoneLabelIdDto TYPE_2;

    @pmi0("3")
    public static final IdentityEditPhoneLabelIdDto TYPE_3;
    private final int value;

    /* compiled from: IdentityEditPhoneLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityEditPhoneLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityEditPhoneLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityEditPhoneLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityEditPhoneLabelIdDto[] newArray(int i) {
            return new IdentityEditPhoneLabelIdDto[i];
        }
    }

    static {
        IdentityEditPhoneLabelIdDto identityEditPhoneLabelIdDto = new IdentityEditPhoneLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityEditPhoneLabelIdDto;
        IdentityEditPhoneLabelIdDto identityEditPhoneLabelIdDto2 = new IdentityEditPhoneLabelIdDto("TYPE_2", 1, 2);
        TYPE_2 = identityEditPhoneLabelIdDto2;
        IdentityEditPhoneLabelIdDto identityEditPhoneLabelIdDto3 = new IdentityEditPhoneLabelIdDto("TYPE_3", 2, 3);
        TYPE_3 = identityEditPhoneLabelIdDto3;
        IdentityEditPhoneLabelIdDto[] identityEditPhoneLabelIdDtoArr = {identityEditPhoneLabelIdDto, identityEditPhoneLabelIdDto2, identityEditPhoneLabelIdDto3};
        $VALUES = identityEditPhoneLabelIdDtoArr;
        $ENTRIES = new asp(identityEditPhoneLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityEditPhoneLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityEditPhoneLabelIdDto valueOf(String str) {
        return (IdentityEditPhoneLabelIdDto) Enum.valueOf(IdentityEditPhoneLabelIdDto.class, str);
    }

    public static IdentityEditPhoneLabelIdDto[] values() {
        return (IdentityEditPhoneLabelIdDto[]) $VALUES.clone();
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
