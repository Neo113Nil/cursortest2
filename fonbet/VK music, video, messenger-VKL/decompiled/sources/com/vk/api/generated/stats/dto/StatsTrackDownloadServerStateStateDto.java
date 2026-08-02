package com.vk.api.generated.stats.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsTrackDownloadServerStateStateDto.kt */
/* loaded from: classes15.dex */
public final class StatsTrackDownloadServerStateStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatsTrackDownloadServerStateStateDto[] $VALUES;

    @pmi0("bad_server")
    public static final StatsTrackDownloadServerStateStateDto BAD_SERVER;
    public static final Parcelable.Creator<StatsTrackDownloadServerStateStateDto> CREATOR;

    @pmi0("error")
    public static final StatsTrackDownloadServerStateStateDto ERROR;

    @pmi0("success")
    public static final StatsTrackDownloadServerStateStateDto SUCCESS;

    @pmi0("timeout")
    public static final StatsTrackDownloadServerStateStateDto TIMEOUT;
    private final String value;

    /* compiled from: StatsTrackDownloadServerStateStateDto.kt */
    public static final class a implements Parcelable.Creator<StatsTrackDownloadServerStateStateDto> {
        @Override // android.os.Parcelable.Creator
        public final StatsTrackDownloadServerStateStateDto createFromParcel(Parcel parcel) {
            return StatsTrackDownloadServerStateStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsTrackDownloadServerStateStateDto[] newArray(int i) {
            return new StatsTrackDownloadServerStateStateDto[i];
        }
    }

    static {
        StatsTrackDownloadServerStateStateDto statsTrackDownloadServerStateStateDto = new StatsTrackDownloadServerStateStateDto("BAD_SERVER", 0, "bad_server");
        BAD_SERVER = statsTrackDownloadServerStateStateDto;
        StatsTrackDownloadServerStateStateDto statsTrackDownloadServerStateStateDto2 = new StatsTrackDownloadServerStateStateDto("ERROR", 1, "error");
        ERROR = statsTrackDownloadServerStateStateDto2;
        StatsTrackDownloadServerStateStateDto statsTrackDownloadServerStateStateDto3 = new StatsTrackDownloadServerStateStateDto("SUCCESS", 2, "success");
        SUCCESS = statsTrackDownloadServerStateStateDto3;
        StatsTrackDownloadServerStateStateDto statsTrackDownloadServerStateStateDto4 = new StatsTrackDownloadServerStateStateDto("TIMEOUT", 3, "timeout");
        TIMEOUT = statsTrackDownloadServerStateStateDto4;
        StatsTrackDownloadServerStateStateDto[] statsTrackDownloadServerStateStateDtoArr = {statsTrackDownloadServerStateStateDto, statsTrackDownloadServerStateStateDto2, statsTrackDownloadServerStateStateDto3, statsTrackDownloadServerStateStateDto4};
        $VALUES = statsTrackDownloadServerStateStateDtoArr;
        $ENTRIES = new asp(statsTrackDownloadServerStateStateDtoArr);
        CREATOR = new a();
    }

    private StatsTrackDownloadServerStateStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StatsTrackDownloadServerStateStateDto valueOf(String str) {
        return (StatsTrackDownloadServerStateStateDto) Enum.valueOf(StatsTrackDownloadServerStateStateDto.class, str);
    }

    public static StatsTrackDownloadServerStateStateDto[] values() {
        return (StatsTrackDownloadServerStateStateDto[]) $VALUES.clone();
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
