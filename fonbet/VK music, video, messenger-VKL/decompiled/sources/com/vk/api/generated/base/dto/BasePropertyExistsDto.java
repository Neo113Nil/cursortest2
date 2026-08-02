package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BasePropertyExistsDto.kt */
/* loaded from: classes14.dex */
public final class BasePropertyExistsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BasePropertyExistsDto[] $VALUES;
    public static final Parcelable.Creator<BasePropertyExistsDto> CREATOR;

    @pmi0("1")
    public static final BasePropertyExistsDto PROPERTY_EXISTS;
    private final int value;

    /* compiled from: BasePropertyExistsDto.kt */
    public static final class a implements Parcelable.Creator<BasePropertyExistsDto> {
        @Override // android.os.Parcelable.Creator
        public final BasePropertyExistsDto createFromParcel(Parcel parcel) {
            return BasePropertyExistsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BasePropertyExistsDto[] newArray(int i) {
            return new BasePropertyExistsDto[i];
        }
    }

    static {
        BasePropertyExistsDto basePropertyExistsDto = new BasePropertyExistsDto("PROPERTY_EXISTS", 0, 1);
        PROPERTY_EXISTS = basePropertyExistsDto;
        BasePropertyExistsDto[] basePropertyExistsDtoArr = {basePropertyExistsDto};
        $VALUES = basePropertyExistsDtoArr;
        $ENTRIES = new asp(basePropertyExistsDtoArr);
        CREATOR = new a();
    }

    private BasePropertyExistsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BasePropertyExistsDto valueOf(String str) {
        return (BasePropertyExistsDto) Enum.valueOf(BasePropertyExistsDto.class, str);
    }

    public static BasePropertyExistsDto[] values() {
        return (BasePropertyExistsDto[]) $VALUES.clone();
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
