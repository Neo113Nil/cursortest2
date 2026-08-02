package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetOneTimePaymentsOrderDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetOneTimePaymentsOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetOneTimePaymentsOrderDto[] $VALUES;

    @pmi0("by_donut_amount")
    public static final DonutGetOneTimePaymentsOrderDto BY_DONUT_AMOUNT;

    @pmi0("by_donut_amount_friends_first")
    public static final DonutGetOneTimePaymentsOrderDto BY_DONUT_AMOUNT_FRIENDS_FIRST;

    @pmi0("by_payment_time")
    public static final DonutGetOneTimePaymentsOrderDto BY_PAYMENT_TIME;
    public static final Parcelable.Creator<DonutGetOneTimePaymentsOrderDto> CREATOR;
    private final String value;

    /* compiled from: DonutGetOneTimePaymentsOrderDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetOneTimePaymentsOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsOrderDto createFromParcel(Parcel parcel) {
            return DonutGetOneTimePaymentsOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsOrderDto[] newArray(int i) {
            return new DonutGetOneTimePaymentsOrderDto[i];
        }
    }

    static {
        DonutGetOneTimePaymentsOrderDto donutGetOneTimePaymentsOrderDto = new DonutGetOneTimePaymentsOrderDto("BY_DONUT_AMOUNT", 0, "by_donut_amount");
        BY_DONUT_AMOUNT = donutGetOneTimePaymentsOrderDto;
        DonutGetOneTimePaymentsOrderDto donutGetOneTimePaymentsOrderDto2 = new DonutGetOneTimePaymentsOrderDto("BY_DONUT_AMOUNT_FRIENDS_FIRST", 1, "by_donut_amount_friends_first");
        BY_DONUT_AMOUNT_FRIENDS_FIRST = donutGetOneTimePaymentsOrderDto2;
        DonutGetOneTimePaymentsOrderDto donutGetOneTimePaymentsOrderDto3 = new DonutGetOneTimePaymentsOrderDto("BY_PAYMENT_TIME", 2, "by_payment_time");
        BY_PAYMENT_TIME = donutGetOneTimePaymentsOrderDto3;
        DonutGetOneTimePaymentsOrderDto[] donutGetOneTimePaymentsOrderDtoArr = {donutGetOneTimePaymentsOrderDto, donutGetOneTimePaymentsOrderDto2, donutGetOneTimePaymentsOrderDto3};
        $VALUES = donutGetOneTimePaymentsOrderDtoArr;
        $ENTRIES = new asp(donutGetOneTimePaymentsOrderDtoArr);
        CREATOR = new a();
    }

    private DonutGetOneTimePaymentsOrderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetOneTimePaymentsOrderDto valueOf(String str) {
        return (DonutGetOneTimePaymentsOrderDto) Enum.valueOf(DonutGetOneTimePaymentsOrderDto.class, str);
    }

    public static DonutGetOneTimePaymentsOrderDto[] values() {
        return (DonutGetOneTimePaymentsOrderDto[]) $VALUES.clone();
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
