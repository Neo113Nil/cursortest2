package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetLevelsFieldsDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetLevelsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetLevelsFieldsDto[] $VALUES;

    @pmi0("cover")
    public static final DonutGetLevelsFieldsDto COVER;
    public static final Parcelable.Creator<DonutGetLevelsFieldsDto> CREATOR;

    @pmi0("end_date")
    public static final DonutGetLevelsFieldsDto END_DATE;

    @pmi0("is_inherited_subscriber")
    public static final DonutGetLevelsFieldsDto IS_INHERITED_SUBSCRIBER;

    @pmi0("is_subscriber")
    public static final DonutGetLevelsFieldsDto IS_SUBSCRIBER;

    @pmi0("start_amount")
    public static final DonutGetLevelsFieldsDto START_AMOUNT;

    @pmi0("start_date")
    public static final DonutGetLevelsFieldsDto START_DATE;

    @pmi0("start_period")
    public static final DonutGetLevelsFieldsDto START_PERIOD;

    @pmi0("statistics")
    public static final DonutGetLevelsFieldsDto STATISTICS;

    @pmi0("subscribers_count")
    public static final DonutGetLevelsFieldsDto SUBSCRIBERS_COUNT;

    @pmi0("subscribe_info")
    public static final DonutGetLevelsFieldsDto SUBSCRIBE_INFO;

    @pmi0("year_price")
    public static final DonutGetLevelsFieldsDto YEAR_PRICE;
    private final String value;

    /* compiled from: DonutGetLevelsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetLevelsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsFieldsDto createFromParcel(Parcel parcel) {
            return DonutGetLevelsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsFieldsDto[] newArray(int i) {
            return new DonutGetLevelsFieldsDto[i];
        }
    }

    static {
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto = new DonutGetLevelsFieldsDto("YEAR_PRICE", 0, "year_price");
        YEAR_PRICE = donutGetLevelsFieldsDto;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto2 = new DonutGetLevelsFieldsDto("STATISTICS", 1, "statistics");
        STATISTICS = donutGetLevelsFieldsDto2;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto3 = new DonutGetLevelsFieldsDto("COVER", 2, "cover");
        COVER = donutGetLevelsFieldsDto3;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto4 = new DonutGetLevelsFieldsDto("IS_SUBSCRIBER", 3, "is_subscriber");
        IS_SUBSCRIBER = donutGetLevelsFieldsDto4;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto5 = new DonutGetLevelsFieldsDto("IS_INHERITED_SUBSCRIBER", 4, "is_inherited_subscriber");
        IS_INHERITED_SUBSCRIBER = donutGetLevelsFieldsDto5;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto6 = new DonutGetLevelsFieldsDto("SUBSCRIBE_INFO", 5, "subscribe_info");
        SUBSCRIBE_INFO = donutGetLevelsFieldsDto6;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto7 = new DonutGetLevelsFieldsDto("SUBSCRIBERS_COUNT", 6, "subscribers_count");
        SUBSCRIBERS_COUNT = donutGetLevelsFieldsDto7;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto8 = new DonutGetLevelsFieldsDto("START_DATE", 7, "start_date");
        START_DATE = donutGetLevelsFieldsDto8;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto9 = new DonutGetLevelsFieldsDto("START_AMOUNT", 8, "start_amount");
        START_AMOUNT = donutGetLevelsFieldsDto9;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto10 = new DonutGetLevelsFieldsDto("START_PERIOD", 9, "start_period");
        START_PERIOD = donutGetLevelsFieldsDto10;
        DonutGetLevelsFieldsDto donutGetLevelsFieldsDto11 = new DonutGetLevelsFieldsDto("END_DATE", 10, "end_date");
        END_DATE = donutGetLevelsFieldsDto11;
        DonutGetLevelsFieldsDto[] donutGetLevelsFieldsDtoArr = {donutGetLevelsFieldsDto, donutGetLevelsFieldsDto2, donutGetLevelsFieldsDto3, donutGetLevelsFieldsDto4, donutGetLevelsFieldsDto5, donutGetLevelsFieldsDto6, donutGetLevelsFieldsDto7, donutGetLevelsFieldsDto8, donutGetLevelsFieldsDto9, donutGetLevelsFieldsDto10, donutGetLevelsFieldsDto11};
        $VALUES = donutGetLevelsFieldsDtoArr;
        $ENTRIES = new asp(donutGetLevelsFieldsDtoArr);
        CREATOR = new a();
    }

    private DonutGetLevelsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetLevelsFieldsDto valueOf(String str) {
        return (DonutGetLevelsFieldsDto) Enum.valueOf(DonutGetLevelsFieldsDto.class, str);
    }

    public static DonutGetLevelsFieldsDto[] values() {
        return (DonutGetLevelsFieldsDto[]) $VALUES.clone();
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
