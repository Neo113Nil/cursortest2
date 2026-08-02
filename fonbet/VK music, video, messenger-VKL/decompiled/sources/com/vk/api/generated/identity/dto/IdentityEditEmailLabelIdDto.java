package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityEditEmailLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityEditEmailLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityEditEmailLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityEditEmailLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityEditEmailLabelIdDto TYPE_1;

    @pmi0("3")
    public static final IdentityEditEmailLabelIdDto TYPE_3;
    private final int value;

    /* compiled from: IdentityEditEmailLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityEditEmailLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityEditEmailLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityEditEmailLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityEditEmailLabelIdDto[] newArray(int i) {
            return new IdentityEditEmailLabelIdDto[i];
        }
    }

    static {
        IdentityEditEmailLabelIdDto identityEditEmailLabelIdDto = new IdentityEditEmailLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityEditEmailLabelIdDto;
        IdentityEditEmailLabelIdDto identityEditEmailLabelIdDto2 = new IdentityEditEmailLabelIdDto("TYPE_3", 1, 3);
        TYPE_3 = identityEditEmailLabelIdDto2;
        IdentityEditEmailLabelIdDto[] identityEditEmailLabelIdDtoArr = {identityEditEmailLabelIdDto, identityEditEmailLabelIdDto2};
        $VALUES = identityEditEmailLabelIdDtoArr;
        $ENTRIES = new asp(identityEditEmailLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityEditEmailLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityEditEmailLabelIdDto valueOf(String str) {
        return (IdentityEditEmailLabelIdDto) Enum.valueOf(IdentityEditEmailLabelIdDto.class, str);
    }

    public static IdentityEditEmailLabelIdDto[] values() {
        return (IdentityEditEmailLabelIdDto[]) $VALUES.clone();
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
