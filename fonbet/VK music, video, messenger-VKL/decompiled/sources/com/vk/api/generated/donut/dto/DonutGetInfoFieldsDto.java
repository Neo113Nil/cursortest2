package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetInfoFieldsDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetInfoFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetInfoFieldsDto[] $VALUES;
    public static final Parcelable.Creator<DonutGetInfoFieldsDto> CREATOR;

    @pmi0("group_donut_block")
    public static final DonutGetInfoFieldsDto GROUP_DONUT_BLOCK;
    private final String value;

    /* compiled from: DonutGetInfoFieldsDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetInfoFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoFieldsDto createFromParcel(Parcel parcel) {
            return DonutGetInfoFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoFieldsDto[] newArray(int i) {
            return new DonutGetInfoFieldsDto[i];
        }
    }

    static {
        DonutGetInfoFieldsDto donutGetInfoFieldsDto = new DonutGetInfoFieldsDto("GROUP_DONUT_BLOCK", 0, "group_donut_block");
        GROUP_DONUT_BLOCK = donutGetInfoFieldsDto;
        DonutGetInfoFieldsDto[] donutGetInfoFieldsDtoArr = {donutGetInfoFieldsDto};
        $VALUES = donutGetInfoFieldsDtoArr;
        $ENTRIES = new asp(donutGetInfoFieldsDtoArr);
        CREATOR = new a();
    }

    private DonutGetInfoFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetInfoFieldsDto valueOf(String str) {
        return (DonutGetInfoFieldsDto) Enum.valueOf(DonutGetInfoFieldsDto.class, str);
    }

    public static DonutGetInfoFieldsDto[] values() {
        return (DonutGetInfoFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
