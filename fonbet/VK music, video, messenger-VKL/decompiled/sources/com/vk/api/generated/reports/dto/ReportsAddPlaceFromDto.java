package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsAddPlaceFromDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddPlaceFromDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddPlaceFromDto[] $VALUES;
    public static final Parcelable.Creator<ReportsAddPlaceFromDto> CREATOR;

    @pmi0("2")
    public static final ReportsAddPlaceFromDto PROFILE_REPORT_FORM;

    @pmi0("1")
    public static final ReportsAddPlaceFromDto RECOMM;
    private final int value;

    /* compiled from: ReportsAddPlaceFromDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddPlaceFromDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddPlaceFromDto createFromParcel(Parcel parcel) {
            return ReportsAddPlaceFromDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddPlaceFromDto[] newArray(int i) {
            return new ReportsAddPlaceFromDto[i];
        }
    }

    static {
        ReportsAddPlaceFromDto reportsAddPlaceFromDto = new ReportsAddPlaceFromDto("RECOMM", 0, 1);
        RECOMM = reportsAddPlaceFromDto;
        ReportsAddPlaceFromDto reportsAddPlaceFromDto2 = new ReportsAddPlaceFromDto("PROFILE_REPORT_FORM", 1, 2);
        PROFILE_REPORT_FORM = reportsAddPlaceFromDto2;
        ReportsAddPlaceFromDto[] reportsAddPlaceFromDtoArr = {reportsAddPlaceFromDto, reportsAddPlaceFromDto2};
        $VALUES = reportsAddPlaceFromDtoArr;
        $ENTRIES = new asp(reportsAddPlaceFromDtoArr);
        CREATOR = new a();
    }

    private ReportsAddPlaceFromDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ReportsAddPlaceFromDto valueOf(String str) {
        return (ReportsAddPlaceFromDto) Enum.valueOf(ReportsAddPlaceFromDto.class, str);
    }

    public static ReportsAddPlaceFromDto[] values() {
        return (ReportsAddPlaceFromDto[]) $VALUES.clone();
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
