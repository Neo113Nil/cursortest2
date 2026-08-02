package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsAddReportSourceDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddReportSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddReportSourceDto[] $VALUES;
    public static final Parcelable.Creator<ReportsAddReportSourceDto> CREATOR;

    @pmi0("user")
    public static final ReportsAddReportSourceDto USER;
    private final String value;

    /* compiled from: ReportsAddReportSourceDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddReportSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddReportSourceDto createFromParcel(Parcel parcel) {
            return ReportsAddReportSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddReportSourceDto[] newArray(int i) {
            return new ReportsAddReportSourceDto[i];
        }
    }

    static {
        ReportsAddReportSourceDto reportsAddReportSourceDto = new ReportsAddReportSourceDto("USER", 0, "user");
        USER = reportsAddReportSourceDto;
        ReportsAddReportSourceDto[] reportsAddReportSourceDtoArr = {reportsAddReportSourceDto};
        $VALUES = reportsAddReportSourceDtoArr;
        $ENTRIES = new asp(reportsAddReportSourceDtoArr);
        CREATOR = new a();
    }

    private ReportsAddReportSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReportsAddReportSourceDto valueOf(String str) {
        return (ReportsAddReportSourceDto) Enum.valueOf(ReportsAddReportSourceDto.class, str);
    }

    public static ReportsAddReportSourceDto[] values() {
        return (ReportsAddReportSourceDto[]) $VALUES.clone();
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
