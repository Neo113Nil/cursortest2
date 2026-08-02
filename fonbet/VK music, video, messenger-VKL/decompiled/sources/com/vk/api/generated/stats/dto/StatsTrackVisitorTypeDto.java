package com.vk.api.generated.stats.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsTrackVisitorTypeDto.kt */
/* loaded from: classes15.dex */
public final class StatsTrackVisitorTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatsTrackVisitorTypeDto[] $VALUES;

    @pmi0("activity")
    public static final StatsTrackVisitorTypeDto ACTIVITY;

    @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
    public static final StatsTrackVisitorTypeDto CLOSE;
    public static final Parcelable.Creator<StatsTrackVisitorTypeDto> CREATOR;

    @pmi0("open")
    public static final StatsTrackVisitorTypeDto OPEN;
    private final String value;

    /* compiled from: StatsTrackVisitorTypeDto.kt */
    public static final class a implements Parcelable.Creator<StatsTrackVisitorTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StatsTrackVisitorTypeDto createFromParcel(Parcel parcel) {
            return StatsTrackVisitorTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsTrackVisitorTypeDto[] newArray(int i) {
            return new StatsTrackVisitorTypeDto[i];
        }
    }

    static {
        StatsTrackVisitorTypeDto statsTrackVisitorTypeDto = new StatsTrackVisitorTypeDto("ACTIVITY", 0, "activity");
        ACTIVITY = statsTrackVisitorTypeDto;
        StatsTrackVisitorTypeDto statsTrackVisitorTypeDto2 = new StatsTrackVisitorTypeDto("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = statsTrackVisitorTypeDto2;
        StatsTrackVisitorTypeDto statsTrackVisitorTypeDto3 = new StatsTrackVisitorTypeDto("OPEN", 2, "open");
        OPEN = statsTrackVisitorTypeDto3;
        StatsTrackVisitorTypeDto[] statsTrackVisitorTypeDtoArr = {statsTrackVisitorTypeDto, statsTrackVisitorTypeDto2, statsTrackVisitorTypeDto3};
        $VALUES = statsTrackVisitorTypeDtoArr;
        $ENTRIES = new asp(statsTrackVisitorTypeDtoArr);
        CREATOR = new a();
    }

    private StatsTrackVisitorTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StatsTrackVisitorTypeDto valueOf(String str) {
        return (StatsTrackVisitorTypeDto) Enum.valueOf(StatsTrackVisitorTypeDto.class, str);
    }

    public static StatsTrackVisitorTypeDto[] values() {
        return (StatsTrackVisitorTypeDto[]) $VALUES.clone();
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
