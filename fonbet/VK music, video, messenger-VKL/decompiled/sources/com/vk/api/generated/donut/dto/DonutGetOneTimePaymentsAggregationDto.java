package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetOneTimePaymentsAggregationDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetOneTimePaymentsAggregationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetOneTimePaymentsAggregationDto[] $VALUES;

    @pmi0("by_sender")
    public static final DonutGetOneTimePaymentsAggregationDto BY_SENDER;
    public static final Parcelable.Creator<DonutGetOneTimePaymentsAggregationDto> CREATOR;
    private final String value;

    /* compiled from: DonutGetOneTimePaymentsAggregationDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetOneTimePaymentsAggregationDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsAggregationDto createFromParcel(Parcel parcel) {
            return DonutGetOneTimePaymentsAggregationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsAggregationDto[] newArray(int i) {
            return new DonutGetOneTimePaymentsAggregationDto[i];
        }
    }

    static {
        DonutGetOneTimePaymentsAggregationDto donutGetOneTimePaymentsAggregationDto = new DonutGetOneTimePaymentsAggregationDto("BY_SENDER", 0, "by_sender");
        BY_SENDER = donutGetOneTimePaymentsAggregationDto;
        DonutGetOneTimePaymentsAggregationDto[] donutGetOneTimePaymentsAggregationDtoArr = {donutGetOneTimePaymentsAggregationDto};
        $VALUES = donutGetOneTimePaymentsAggregationDtoArr;
        $ENTRIES = new asp(donutGetOneTimePaymentsAggregationDtoArr);
        CREATOR = new a();
    }

    private DonutGetOneTimePaymentsAggregationDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetOneTimePaymentsAggregationDto valueOf(String str) {
        return (DonutGetOneTimePaymentsAggregationDto) Enum.valueOf(DonutGetOneTimePaymentsAggregationDto.class, str);
    }

    public static DonutGetOneTimePaymentsAggregationDto[] values() {
        return (DonutGetOneTimePaymentsAggregationDto[]) $VALUES.clone();
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
