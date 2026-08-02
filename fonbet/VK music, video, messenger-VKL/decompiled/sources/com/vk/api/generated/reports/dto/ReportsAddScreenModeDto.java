package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsAddScreenModeDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<ReportsAddScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final ReportsAddScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final ReportsAddScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final ReportsAddScreenModeDto FULLSCREEN_PORTRAIT;

    @pmi0("preview")
    public static final ReportsAddScreenModeDto PREVIEW;
    private final String value;

    /* compiled from: ReportsAddScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddScreenModeDto createFromParcel(Parcel parcel) {
            return ReportsAddScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddScreenModeDto[] newArray(int i) {
            return new ReportsAddScreenModeDto[i];
        }
    }

    static {
        ReportsAddScreenModeDto reportsAddScreenModeDto = new ReportsAddScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = reportsAddScreenModeDto;
        ReportsAddScreenModeDto reportsAddScreenModeDto2 = new ReportsAddScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = reportsAddScreenModeDto2;
        ReportsAddScreenModeDto reportsAddScreenModeDto3 = new ReportsAddScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = reportsAddScreenModeDto3;
        ReportsAddScreenModeDto reportsAddScreenModeDto4 = new ReportsAddScreenModeDto("PREVIEW", 3, "preview");
        PREVIEW = reportsAddScreenModeDto4;
        ReportsAddScreenModeDto[] reportsAddScreenModeDtoArr = {reportsAddScreenModeDto, reportsAddScreenModeDto2, reportsAddScreenModeDto3, reportsAddScreenModeDto4};
        $VALUES = reportsAddScreenModeDtoArr;
        $ENTRIES = new asp(reportsAddScreenModeDtoArr);
        CREATOR = new a();
    }

    private ReportsAddScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReportsAddScreenModeDto valueOf(String str) {
        return (ReportsAddScreenModeDto) Enum.valueOf(ReportsAddScreenModeDto.class, str);
    }

    public static ReportsAddScreenModeDto[] values() {
        return (ReportsAddScreenModeDto[]) $VALUES.clone();
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
