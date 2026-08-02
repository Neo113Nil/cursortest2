package com.vk.api.generated.stats.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsTrackUploadServerStateStateDto.kt */
/* loaded from: classes15.dex */
public final class StatsTrackUploadServerStateStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatsTrackUploadServerStateStateDto[] $VALUES;

    @pmi0("bad_response")
    public static final StatsTrackUploadServerStateStateDto BAD_RESPONSE;

    @pmi0("bad_server")
    public static final StatsTrackUploadServerStateStateDto BAD_SERVER;
    public static final Parcelable.Creator<StatsTrackUploadServerStateStateDto> CREATOR;

    @pmi0("no_network")
    public static final StatsTrackUploadServerStateStateDto NO_NETWORK;

    @pmi0("success")
    public static final StatsTrackUploadServerStateStateDto SUCCESS;

    @pmi0("timeout")
    public static final StatsTrackUploadServerStateStateDto TIMEOUT;

    @pmi0("unknown")
    public static final StatsTrackUploadServerStateStateDto UNKNOWN;
    private final String value;

    /* compiled from: StatsTrackUploadServerStateStateDto.kt */
    public static final class a implements Parcelable.Creator<StatsTrackUploadServerStateStateDto> {
        @Override // android.os.Parcelable.Creator
        public final StatsTrackUploadServerStateStateDto createFromParcel(Parcel parcel) {
            return StatsTrackUploadServerStateStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsTrackUploadServerStateStateDto[] newArray(int i) {
            return new StatsTrackUploadServerStateStateDto[i];
        }
    }

    static {
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto = new StatsTrackUploadServerStateStateDto("BAD_RESPONSE", 0, "bad_response");
        BAD_RESPONSE = statsTrackUploadServerStateStateDto;
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto2 = new StatsTrackUploadServerStateStateDto("BAD_SERVER", 1, "bad_server");
        BAD_SERVER = statsTrackUploadServerStateStateDto2;
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto3 = new StatsTrackUploadServerStateStateDto("NO_NETWORK", 2, "no_network");
        NO_NETWORK = statsTrackUploadServerStateStateDto3;
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto4 = new StatsTrackUploadServerStateStateDto("SUCCESS", 3, "success");
        SUCCESS = statsTrackUploadServerStateStateDto4;
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto5 = new StatsTrackUploadServerStateStateDto("TIMEOUT", 4, "timeout");
        TIMEOUT = statsTrackUploadServerStateStateDto5;
        StatsTrackUploadServerStateStateDto statsTrackUploadServerStateStateDto6 = new StatsTrackUploadServerStateStateDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = statsTrackUploadServerStateStateDto6;
        StatsTrackUploadServerStateStateDto[] statsTrackUploadServerStateStateDtoArr = {statsTrackUploadServerStateStateDto, statsTrackUploadServerStateStateDto2, statsTrackUploadServerStateStateDto3, statsTrackUploadServerStateStateDto4, statsTrackUploadServerStateStateDto5, statsTrackUploadServerStateStateDto6};
        $VALUES = statsTrackUploadServerStateStateDtoArr;
        $ENTRIES = new asp(statsTrackUploadServerStateStateDtoArr);
        CREATOR = new a();
    }

    private StatsTrackUploadServerStateStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StatsTrackUploadServerStateStateDto valueOf(String str) {
        return (StatsTrackUploadServerStateStateDto) Enum.valueOf(StatsTrackUploadServerStateStateDto.class, str);
    }

    public static StatsTrackUploadServerStateStateDto[] values() {
        return (StatsTrackUploadServerStateStateDto[]) $VALUES.clone();
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
