package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseOkResponseDto.kt */
/* loaded from: classes14.dex */
public final class BaseOkResponseDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseOkResponseDto[] $VALUES;
    public static final Parcelable.Creator<BaseOkResponseDto> CREATOR;

    @pmi0("1")
    public static final BaseOkResponseDto OK;
    private final int value;

    /* compiled from: BaseOkResponseDto.kt */
    public static final class a implements Parcelable.Creator<BaseOkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOkResponseDto createFromParcel(Parcel parcel) {
            return BaseOkResponseDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOkResponseDto[] newArray(int i) {
            return new BaseOkResponseDto[i];
        }
    }

    static {
        BaseOkResponseDto baseOkResponseDto = new BaseOkResponseDto("OK", 0, 1);
        OK = baseOkResponseDto;
        BaseOkResponseDto[] baseOkResponseDtoArr = {baseOkResponseDto};
        $VALUES = baseOkResponseDtoArr;
        $ENTRIES = new asp(baseOkResponseDtoArr);
        CREATOR = new a();
    }

    private BaseOkResponseDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseOkResponseDto valueOf(String str) {
        return (BaseOkResponseDto) Enum.valueOf(BaseOkResponseDto.class, str);
    }

    public static BaseOkResponseDto[] values() {
        return (BaseOkResponseDto[]) $VALUES.clone();
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
