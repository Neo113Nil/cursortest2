package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveSettingsDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveSettingsDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveSettingsDto> CREATOR = new a();

    @pmi0("extra_image")
    private final String extraImage;

    @pmi0("is_clips_live")
    private final BaseBoolIntDto isClipsLive;

    @pmi0("is_endless")
    private final BaseBoolIntDto isEndless;

    @pmi0("layout_settings")
    private final VideoLiveLayoutSettingsDto layoutSettings;

    @pmi0("max_rewind_duration")
    private final Integer maxRewindDuration;

    @pmi0("playback_duration")
    private final Integer playbackDuration;

    /* compiled from: VideoLiveSettingsDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveSettingsDto createFromParcel(Parcel parcel) {
            return new VideoLiveSettingsDto(parcel.readInt() == 0 ? null : VideoLiveLayoutSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BaseBoolIntDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveSettingsDto[] newArray(int i) {
            return new VideoLiveSettingsDto[i];
        }
    }

    public VideoLiveSettingsDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final VideoLiveLayoutSettingsDto d() {
        return this.layoutSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.maxRewindDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveSettingsDto)) {
            return false;
        }
        VideoLiveSettingsDto videoLiveSettingsDto = (VideoLiveSettingsDto) obj;
        return epx.f(this.layoutSettings, videoLiveSettingsDto.layoutSettings) && this.isEndless == videoLiveSettingsDto.isEndless && epx.f(this.maxRewindDuration, videoLiveSettingsDto.maxRewindDuration) && epx.f(this.playbackDuration, videoLiveSettingsDto.playbackDuration) && this.isClipsLive == videoLiveSettingsDto.isClipsLive && epx.f(this.extraImage, videoLiveSettingsDto.extraImage);
    }

    public final Integer f() {
        return this.playbackDuration;
    }

    public final BaseBoolIntDto g() {
        return this.isClipsLive;
    }

    public final int hashCode() {
        VideoLiveLayoutSettingsDto videoLiveLayoutSettingsDto = this.layoutSettings;
        int hashCode = (videoLiveLayoutSettingsDto == null ? 0 : videoLiveLayoutSettingsDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isEndless;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.maxRewindDuration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.playbackDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isClipsLive;
        int hashCode5 = (hashCode4 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        String str = this.extraImage;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final BaseBoolIntDto i() {
        return this.isEndless;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLiveSettingsDto(layoutSettings=");
        sb.append(this.layoutSettings);
        sb.append(", isEndless=");
        sb.append(this.isEndless);
        sb.append(", maxRewindDuration=");
        sb.append(this.maxRewindDuration);
        sb.append(", playbackDuration=");
        sb.append(this.playbackDuration);
        sb.append(", isClipsLive=");
        sb.append(this.isClipsLive);
        sb.append(", extraImage=");
        return ho8.a(sb, this.extraImage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoLiveLayoutSettingsDto videoLiveLayoutSettingsDto = this.layoutSettings;
        if (videoLiveLayoutSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveLayoutSettingsDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto = this.isEndless;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        Integer num = this.maxRewindDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.playbackDuration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.isClipsLive;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.extraImage);
    }

    public VideoLiveSettingsDto(VideoLiveLayoutSettingsDto videoLiveLayoutSettingsDto, BaseBoolIntDto baseBoolIntDto, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto2, String str) {
        this.layoutSettings = videoLiveLayoutSettingsDto;
        this.isEndless = baseBoolIntDto;
        this.maxRewindDuration = num;
        this.playbackDuration = num2;
        this.isClipsLive = baseBoolIntDto2;
        this.extraImage = str;
    }

    public /* synthetic */ VideoLiveSettingsDto(VideoLiveLayoutSettingsDto videoLiveLayoutSettingsDto, BaseBoolIntDto baseBoolIntDto, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoLiveLayoutSettingsDto, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseBoolIntDto2, (i & 32) != 0 ? null : str);
    }
}
