package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityAddEmailLabelIdDto.kt */
/* loaded from: classes14.dex */
public final class IdentityAddEmailLabelIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityAddEmailLabelIdDto[] $VALUES;
    public static final Parcelable.Creator<IdentityAddEmailLabelIdDto> CREATOR;

    @pmi0("1")
    public static final IdentityAddEmailLabelIdDto TYPE_1;

    @pmi0("3")
    public static final IdentityAddEmailLabelIdDto TYPE_3;
    private final int value;

    /* compiled from: IdentityAddEmailLabelIdDto.kt */
    public static final class a implements Parcelable.Creator<IdentityAddEmailLabelIdDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityAddEmailLabelIdDto createFromParcel(Parcel parcel) {
            return IdentityAddEmailLabelIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityAddEmailLabelIdDto[] newArray(int i) {
            return new IdentityAddEmailLabelIdDto[i];
        }
    }

    static {
        IdentityAddEmailLabelIdDto identityAddEmailLabelIdDto = new IdentityAddEmailLabelIdDto("TYPE_1", 0, 1);
        TYPE_1 = identityAddEmailLabelIdDto;
        IdentityAddEmailLabelIdDto identityAddEmailLabelIdDto2 = new IdentityAddEmailLabelIdDto("TYPE_3", 1, 3);
        TYPE_3 = identityAddEmailLabelIdDto2;
        IdentityAddEmailLabelIdDto[] identityAddEmailLabelIdDtoArr = {identityAddEmailLabelIdDto, identityAddEmailLabelIdDto2};
        $VALUES = identityAddEmailLabelIdDtoArr;
        $ENTRIES = new asp(identityAddEmailLabelIdDtoArr);
        CREATOR = new a();
    }

    private IdentityAddEmailLabelIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static IdentityAddEmailLabelIdDto valueOf(String str) {
        return (IdentityAddEmailLabelIdDto) Enum.valueOf(IdentityAddEmailLabelIdDto.class, str);
    }

    public static IdentityAddEmailLabelIdDto[] values() {
        return (IdentityAddEmailLabelIdDto[]) $VALUES.clone();
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
