package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetOneTimePaymentsPaymentTypeDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetOneTimePaymentsPaymentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetOneTimePaymentsPaymentTypeDto[] $VALUES;
    public static final Parcelable.Creator<DonutGetOneTimePaymentsPaymentTypeDto> CREATOR;

    @pmi0("donut_badges")
    public static final DonutGetOneTimePaymentsPaymentTypeDto DONUT_BADGES;

    @pmi0("short_video")
    public static final DonutGetOneTimePaymentsPaymentTypeDto SHORT_VIDEO;
    private final String value;

    /* compiled from: DonutGetOneTimePaymentsPaymentTypeDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetOneTimePaymentsPaymentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsPaymentTypeDto createFromParcel(Parcel parcel) {
            return DonutGetOneTimePaymentsPaymentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsPaymentTypeDto[] newArray(int i) {
            return new DonutGetOneTimePaymentsPaymentTypeDto[i];
        }
    }

    static {
        DonutGetOneTimePaymentsPaymentTypeDto donutGetOneTimePaymentsPaymentTypeDto = new DonutGetOneTimePaymentsPaymentTypeDto("DONUT_BADGES", 0, "donut_badges");
        DONUT_BADGES = donutGetOneTimePaymentsPaymentTypeDto;
        DonutGetOneTimePaymentsPaymentTypeDto donutGetOneTimePaymentsPaymentTypeDto2 = new DonutGetOneTimePaymentsPaymentTypeDto("SHORT_VIDEO", 1, "short_video");
        SHORT_VIDEO = donutGetOneTimePaymentsPaymentTypeDto2;
        DonutGetOneTimePaymentsPaymentTypeDto[] donutGetOneTimePaymentsPaymentTypeDtoArr = {donutGetOneTimePaymentsPaymentTypeDto, donutGetOneTimePaymentsPaymentTypeDto2};
        $VALUES = donutGetOneTimePaymentsPaymentTypeDtoArr;
        $ENTRIES = new asp(donutGetOneTimePaymentsPaymentTypeDtoArr);
        CREATOR = new a();
    }

    private DonutGetOneTimePaymentsPaymentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetOneTimePaymentsPaymentTypeDto valueOf(String str) {
        return (DonutGetOneTimePaymentsPaymentTypeDto) Enum.valueOf(DonutGetOneTimePaymentsPaymentTypeDto.class, str);
    }

    public static DonutGetOneTimePaymentsPaymentTypeDto[] values() {
        return (DonutGetOneTimePaymentsPaymentTypeDto[]) $VALUES.clone();
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
