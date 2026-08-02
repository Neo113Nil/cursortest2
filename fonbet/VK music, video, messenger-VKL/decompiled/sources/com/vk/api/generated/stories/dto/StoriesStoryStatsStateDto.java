package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesStoryStatsStateDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryStatsStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesStoryStatsStateDto[] $VALUES;
    public static final Parcelable.Creator<StoriesStoryStatsStateDto> CREATOR;

    @pmi0("hidden")
    public static final StoriesStoryStatsStateDto HIDDEN;

    @pmi0("off")
    public static final StoriesStoryStatsStateDto OFF;

    @pmi0("on")
    public static final StoriesStoryStatsStateDto ON;
    private final String value;

    /* compiled from: StoriesStoryStatsStateDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryStatsStateDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsStateDto createFromParcel(Parcel parcel) {
            return StoriesStoryStatsStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsStateDto[] newArray(int i) {
            return new StoriesStoryStatsStateDto[i];
        }
    }

    static {
        StoriesStoryStatsStateDto storiesStoryStatsStateDto = new StoriesStoryStatsStateDto("ON", 0, "on");
        ON = storiesStoryStatsStateDto;
        StoriesStoryStatsStateDto storiesStoryStatsStateDto2 = new StoriesStoryStatsStateDto("OFF", 1, "off");
        OFF = storiesStoryStatsStateDto2;
        StoriesStoryStatsStateDto storiesStoryStatsStateDto3 = new StoriesStoryStatsStateDto("HIDDEN", 2, "hidden");
        HIDDEN = storiesStoryStatsStateDto3;
        StoriesStoryStatsStateDto[] storiesStoryStatsStateDtoArr = {storiesStoryStatsStateDto, storiesStoryStatsStateDto2, storiesStoryStatsStateDto3};
        $VALUES = storiesStoryStatsStateDtoArr;
        $ENTRIES = new asp(storiesStoryStatsStateDtoArr);
        CREATOR = new a();
    }

    private StoriesStoryStatsStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesStoryStatsStateDto valueOf(String str) {
        return (StoriesStoryStatsStateDto) Enum.valueOf(StoriesStoryStatsStateDto.class, str);
    }

    public static StoriesStoryStatsStateDto[] values() {
        return (StoriesStoryStatsStateDto[]) $VALUES.clone();
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
