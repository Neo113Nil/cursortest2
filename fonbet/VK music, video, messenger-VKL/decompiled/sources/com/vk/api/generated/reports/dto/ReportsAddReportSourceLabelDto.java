package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsAddReportSourceLabelDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddReportSourceLabelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddReportSourceLabelDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final ReportsAddReportSourceLabelDto ANTISPAM_MODAL;
    public static final Parcelable.Creator<ReportsAddReportSourceLabelDto> CREATOR;

    @pmi0("old_spam_modal")
    public static final ReportsAddReportSourceLabelDto OLD_SPAM_MODAL;
    private final String value;

    /* compiled from: ReportsAddReportSourceLabelDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddReportSourceLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddReportSourceLabelDto createFromParcel(Parcel parcel) {
            return ReportsAddReportSourceLabelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddReportSourceLabelDto[] newArray(int i) {
            return new ReportsAddReportSourceLabelDto[i];
        }
    }

    static {
        ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto = new ReportsAddReportSourceLabelDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = reportsAddReportSourceLabelDto;
        ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto2 = new ReportsAddReportSourceLabelDto("OLD_SPAM_MODAL", 1, "old_spam_modal");
        OLD_SPAM_MODAL = reportsAddReportSourceLabelDto2;
        ReportsAddReportSourceLabelDto[] reportsAddReportSourceLabelDtoArr = {reportsAddReportSourceLabelDto, reportsAddReportSourceLabelDto2};
        $VALUES = reportsAddReportSourceLabelDtoArr;
        $ENTRIES = new asp(reportsAddReportSourceLabelDtoArr);
        CREATOR = new a();
    }

    private ReportsAddReportSourceLabelDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReportsAddReportSourceLabelDto valueOf(String str) {
        return (ReportsAddReportSourceLabelDto) Enum.valueOf(ReportsAddReportSourceLabelDto.class, str);
    }

    public static ReportsAddReportSourceLabelDto[] values() {
        return (ReportsAddReportSourceLabelDto[]) $VALUES.clone();
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
