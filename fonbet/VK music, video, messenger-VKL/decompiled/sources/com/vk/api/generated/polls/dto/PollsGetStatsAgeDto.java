package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollsGetStatsAgeDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetStatsAgeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollsGetStatsAgeDto[] $VALUES;
    public static final Parcelable.Creator<PollsGetStatsAgeDto> CREATOR;

    @pmi0("1")
    public static final PollsGetStatsAgeDto TYPE_1;

    @pmi0("2")
    public static final PollsGetStatsAgeDto TYPE_2;

    @pmi0("3")
    public static final PollsGetStatsAgeDto TYPE_3;
    private final int value;

    /* compiled from: PollsGetStatsAgeDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetStatsAgeDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsAgeDto createFromParcel(Parcel parcel) {
            return PollsGetStatsAgeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsAgeDto[] newArray(int i) {
            return new PollsGetStatsAgeDto[i];
        }
    }

    static {
        PollsGetStatsAgeDto pollsGetStatsAgeDto = new PollsGetStatsAgeDto("TYPE_1", 0, 1);
        TYPE_1 = pollsGetStatsAgeDto;
        PollsGetStatsAgeDto pollsGetStatsAgeDto2 = new PollsGetStatsAgeDto("TYPE_2", 1, 2);
        TYPE_2 = pollsGetStatsAgeDto2;
        PollsGetStatsAgeDto pollsGetStatsAgeDto3 = new PollsGetStatsAgeDto("TYPE_3", 2, 3);
        TYPE_3 = pollsGetStatsAgeDto3;
        PollsGetStatsAgeDto[] pollsGetStatsAgeDtoArr = {pollsGetStatsAgeDto, pollsGetStatsAgeDto2, pollsGetStatsAgeDto3};
        $VALUES = pollsGetStatsAgeDtoArr;
        $ENTRIES = new asp(pollsGetStatsAgeDtoArr);
        CREATOR = new a();
    }

    private PollsGetStatsAgeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PollsGetStatsAgeDto valueOf(String str) {
        return (PollsGetStatsAgeDto) Enum.valueOf(PollsGetStatsAgeDto.class, str);
    }

    public static PollsGetStatsAgeDto[] values() {
        return (PollsGetStatsAgeDto[]) $VALUES.clone();
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
