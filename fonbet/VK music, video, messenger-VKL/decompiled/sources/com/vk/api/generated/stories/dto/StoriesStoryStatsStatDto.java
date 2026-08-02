package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesStoryStatsStatDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryStatsStatDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStoryStatsStatDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("state")
    private final StoriesStoryStatsStateDto state;

    /* compiled from: StoriesStoryStatsStatDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryStatsStatDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsStatDto createFromParcel(Parcel parcel) {
            return new StoriesStoryStatsStatDto(StoriesStoryStatsStateDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsStatDto[] newArray(int i) {
            return new StoriesStoryStatsStatDto[i];
        }
    }

    public StoriesStoryStatsStatDto(StoriesStoryStatsStateDto storiesStoryStatsStateDto, Integer num) {
        this.state = storiesStoryStatsStateDto;
        this.count = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryStatsStatDto)) {
            return false;
        }
        StoriesStoryStatsStatDto storiesStoryStatsStatDto = (StoriesStoryStatsStatDto) obj;
        return this.state == storiesStoryStatsStatDto.state && epx.f(this.count, storiesStoryStatsStatDto.count);
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        Integer num = this.count;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesStoryStatsStatDto(state=");
        sb.append(this.state);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.state.writeToParcel(parcel, i);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ StoriesStoryStatsStatDto(StoriesStoryStatsStateDto storiesStoryStatsStateDto, Integer num, int i, zcl zclVar) {
        this(storiesStoryStatsStateDto, (i & 2) != 0 ? null : num);
    }
}
