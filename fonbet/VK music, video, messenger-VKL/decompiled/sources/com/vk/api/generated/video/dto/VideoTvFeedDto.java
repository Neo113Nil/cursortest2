package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoTvFeedDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvFeedDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvFeedDto> CREATOR = new a();

    @pmi0("can_add_tv_feed")
    private final Boolean canAddTvFeed;

    @pmi0("tv_feed_type")
    private final TvFeedTypeDto tvFeedType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoTvFeedDto.kt */
    public static final class TvFeedTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TvFeedTypeDto[] $VALUES;
        public static final Parcelable.Creator<TvFeedTypeDto> CREATOR;

        @pmi0("for_kids")
        public static final TvFeedTypeDto FOR_KIDS;

        @pmi0("movies_and_series")
        public static final TvFeedTypeDto MOVIES_AND_SERIES;

        @pmi0("politics")
        public static final TvFeedTypeDto POLITICS;
        private final String value;

        /* compiled from: VideoTvFeedDto.kt */
        public static final class a implements Parcelable.Creator<TvFeedTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TvFeedTypeDto createFromParcel(Parcel parcel) {
                return TvFeedTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TvFeedTypeDto[] newArray(int i) {
                return new TvFeedTypeDto[i];
            }
        }

        static {
            TvFeedTypeDto tvFeedTypeDto = new TvFeedTypeDto("MOVIES_AND_SERIES", 0, "movies_and_series");
            MOVIES_AND_SERIES = tvFeedTypeDto;
            TvFeedTypeDto tvFeedTypeDto2 = new TvFeedTypeDto("FOR_KIDS", 1, "for_kids");
            FOR_KIDS = tvFeedTypeDto2;
            TvFeedTypeDto tvFeedTypeDto3 = new TvFeedTypeDto("POLITICS", 2, "politics");
            POLITICS = tvFeedTypeDto3;
            TvFeedTypeDto[] tvFeedTypeDtoArr = {tvFeedTypeDto, tvFeedTypeDto2, tvFeedTypeDto3};
            $VALUES = tvFeedTypeDtoArr;
            $ENTRIES = new asp(tvFeedTypeDtoArr);
            CREATOR = new a();
        }

        private TvFeedTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TvFeedTypeDto valueOf(String str) {
            return (TvFeedTypeDto) Enum.valueOf(TvFeedTypeDto.class, str);
        }

        public static TvFeedTypeDto[] values() {
            return (TvFeedTypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoTvFeedDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvFeedDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoTvFeedDto(valueOf, parcel.readInt() != 0 ? TvFeedTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvFeedDto[] newArray(int i) {
            return new VideoTvFeedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTvFeedDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvFeedDto)) {
            return false;
        }
        VideoTvFeedDto videoTvFeedDto = (VideoTvFeedDto) obj;
        return epx.f(this.canAddTvFeed, videoTvFeedDto.canAddTvFeed) && this.tvFeedType == videoTvFeedDto.tvFeedType;
    }

    public final int hashCode() {
        Boolean bool = this.canAddTvFeed;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        TvFeedTypeDto tvFeedTypeDto = this.tvFeedType;
        return hashCode + (tvFeedTypeDto != null ? tvFeedTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTvFeedDto(canAddTvFeed=" + this.canAddTvFeed + ", tvFeedType=" + this.tvFeedType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canAddTvFeed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        TvFeedTypeDto tvFeedTypeDto = this.tvFeedType;
        if (tvFeedTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tvFeedTypeDto.writeToParcel(parcel, i);
        }
    }

    public VideoTvFeedDto(Boolean bool, TvFeedTypeDto tvFeedTypeDto) {
        this.canAddTvFeed = bool;
        this.tvFeedType = tvFeedTypeDto;
    }

    public /* synthetic */ VideoTvFeedDto(Boolean bool, TvFeedTypeDto tvFeedTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : tvFeedTypeDto);
    }
}
