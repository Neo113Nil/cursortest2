package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetGoalsFieldsDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetGoalsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetGoalsFieldsDto[] $VALUES;

    @pmi0("action_button")
    public static final DonutGetGoalsFieldsDto ACTION_BUTTON;
    public static final Parcelable.Creator<DonutGetGoalsFieldsDto> CREATOR;

    @pmi0("don_info")
    public static final DonutGetGoalsFieldsDto DON_INFO;
    private final String value;

    /* compiled from: DonutGetGoalsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetGoalsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetGoalsFieldsDto createFromParcel(Parcel parcel) {
            return DonutGetGoalsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetGoalsFieldsDto[] newArray(int i) {
            return new DonutGetGoalsFieldsDto[i];
        }
    }

    static {
        DonutGetGoalsFieldsDto donutGetGoalsFieldsDto = new DonutGetGoalsFieldsDto("ACTION_BUTTON", 0, "action_button");
        ACTION_BUTTON = donutGetGoalsFieldsDto;
        DonutGetGoalsFieldsDto donutGetGoalsFieldsDto2 = new DonutGetGoalsFieldsDto("DON_INFO", 1, "don_info");
        DON_INFO = donutGetGoalsFieldsDto2;
        DonutGetGoalsFieldsDto[] donutGetGoalsFieldsDtoArr = {donutGetGoalsFieldsDto, donutGetGoalsFieldsDto2};
        $VALUES = donutGetGoalsFieldsDtoArr;
        $ENTRIES = new asp(donutGetGoalsFieldsDtoArr);
        CREATOR = new a();
    }

    private DonutGetGoalsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetGoalsFieldsDto valueOf(String str) {
        return (DonutGetGoalsFieldsDto) Enum.valueOf(DonutGetGoalsFieldsDto.class, str);
    }

    public static DonutGetGoalsFieldsDto[] values() {
        return (DonutGetGoalsFieldsDto[]) $VALUES.clone();
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
