package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityAddPhoneLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityAddPhoneLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityAddPhoneLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityAddPhoneLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityAddPhoneLabelIdDto TYPE_1;

    @pmi0("2")
    public static final IdentityAddPhoneLabelIdDto TYPE_2;

    @pmi0("3")
    public static final IdentityAddPhoneLabelIdDto TYPE_3;
    private final int value;

    /* compiled from: IdentityAddPhoneLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityAddPhoneLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityAddPhoneLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityAddPhoneLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityAddPhoneLabelIdDto[] newArray(int i) {
            return new IdentityAddPhoneLabelIdDto[i];
        }
    }

    static {
        IdentityAddPhoneLabelIdDto identityAddPhoneLabelIdDto = new IdentityAddPhoneLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityAddPhoneLabelIdDto;
        IdentityAddPhoneLabelIdDto identityAddPhoneLabelIdDto2 = new IdentityAddPhoneLabelIdDto("TYPE_2", 1, 2);
        TYPE_2 = identityAddPhoneLabelIdDto2;
        IdentityAddPhoneLabelIdDto identityAddPhoneLabelIdDto3 = new IdentityAddPhoneLabelIdDto("TYPE_3", 2, 3);
        TYPE_3 = identityAddPhoneLabelIdDto3;
        IdentityAddPhoneLabelIdDto[] identityAddPhoneLabelIdDtoArr = {identityAddPhoneLabelIdDto, identityAddPhoneLabelIdDto2, identityAddPhoneLabelIdDto3};
        $VALUES = identityAddPhoneLabelIdDtoArr;
        $ENTRIES = new asp(identityAddPhoneLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityAddPhoneLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityAddPhoneLabelIdDto valueOf(String str) {
        return (IdentityAddPhoneLabelIdDto) Enum.valueOf(IdentityAddPhoneLabelIdDto.class, str);
    }

    public static IdentityAddPhoneLabelIdDto[] values() {
        return (IdentityAddPhoneLabelIdDto[]) $VALUES.clone();
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
