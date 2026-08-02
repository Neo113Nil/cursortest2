package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoGetSafeModeSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSafeModeSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetSafeModeSettingsResponseDto> CREATOR = new a();

    @pmi0("age")
    private final AgeDto age;

    @pmi0("end_allowed_time")
    private final Integer endAllowedTime;

    @pmi0("short_videos_enabled")
    private final Boolean shortVideosEnabled;

    @pmi0("start_allowed_time")
    private final Integer startAllowedTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoGetSafeModeSettingsResponseDto.kt */
    public static final class AgeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AgeDto[] $VALUES;
        public static final Parcelable.Creator<AgeDto> CREATOR;

        @pmi0("0")
        public static final AgeDto TYPE_0;

        @pmi0("12")
        public static final AgeDto TYPE_12;

        @pmi0("16")
        public static final AgeDto TYPE_16;

        @pmi0("6")
        public static final AgeDto TYPE_6;
        private final int value;

        /* compiled from: VideoGetSafeModeSettingsResponseDto.kt */
        public static final class a implements Parcelable.Creator<AgeDto> {
            @Override // android.os.Parcelable.Creator
            public final AgeDto createFromParcel(Parcel parcel) {
                return AgeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AgeDto[] newArray(int i) {
                return new AgeDto[i];
            }
        }

        static {
            AgeDto ageDto = new AgeDto("TYPE_0", 0, 0);
            TYPE_0 = ageDto;
            AgeDto ageDto2 = new AgeDto("TYPE_6", 1, 6);
            TYPE_6 = ageDto2;
            AgeDto ageDto3 = new AgeDto("TYPE_12", 2, 12);
            TYPE_12 = ageDto3;
            AgeDto ageDto4 = new AgeDto("TYPE_16", 3, 16);
            TYPE_16 = ageDto4;
            AgeDto[] ageDtoArr = {ageDto, ageDto2, ageDto3, ageDto4};
            $VALUES = ageDtoArr;
            $ENTRIES = new asp(ageDtoArr);
            CREATOR = new a();
        }

        private AgeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AgeDto valueOf(String str) {
            return (AgeDto) Enum.valueOf(AgeDto.class, str);
        }

        public static AgeDto[] values() {
            return (AgeDto[]) $VALUES.clone();
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

    /* compiled from: VideoGetSafeModeSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSafeModeSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSafeModeSettingsResponseDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AgeDto createFromParcel = parcel.readInt() == 0 ? null : AgeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoGetSafeModeSettingsResponseDto(valueOf, valueOf2, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSafeModeSettingsResponseDto[] newArray(int i) {
            return new VideoGetSafeModeSettingsResponseDto[i];
        }
    }

    public VideoGetSafeModeSettingsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetSafeModeSettingsResponseDto)) {
            return false;
        }
        VideoGetSafeModeSettingsResponseDto videoGetSafeModeSettingsResponseDto = (VideoGetSafeModeSettingsResponseDto) obj;
        return epx.f(this.startAllowedTime, videoGetSafeModeSettingsResponseDto.startAllowedTime) && epx.f(this.endAllowedTime, videoGetSafeModeSettingsResponseDto.endAllowedTime) && this.age == videoGetSafeModeSettingsResponseDto.age && epx.f(this.shortVideosEnabled, videoGetSafeModeSettingsResponseDto.shortVideosEnabled);
    }

    public final int hashCode() {
        Integer num = this.startAllowedTime;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.endAllowedTime;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AgeDto ageDto = this.age;
        int hashCode3 = (hashCode2 + (ageDto == null ? 0 : ageDto.hashCode())) * 31;
        Boolean bool = this.shortVideosEnabled;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetSafeModeSettingsResponseDto(startAllowedTime=");
        sb.append(this.startAllowedTime);
        sb.append(", endAllowedTime=");
        sb.append(this.endAllowedTime);
        sb.append(", age=");
        sb.append(this.age);
        sb.append(", shortVideosEnabled=");
        return tn.a(sb, this.shortVideosEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.startAllowedTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.endAllowedTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AgeDto ageDto = this.age;
        if (ageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ageDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.shortVideosEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public VideoGetSafeModeSettingsResponseDto(Integer num, Integer num2, AgeDto ageDto, Boolean bool) {
        this.startAllowedTime = num;
        this.endAllowedTime = num2;
        this.age = ageDto;
        this.shortVideosEnabled = bool;
    }

    public /* synthetic */ VideoGetSafeModeSettingsResponseDto(Integer num, Integer num2, AgeDto ageDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : ageDto, (i & 8) != 0 ? null : bool);
    }
}
