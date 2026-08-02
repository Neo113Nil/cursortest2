package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastSliderItemDto.kt */
/* loaded from: classes15.dex */
public final class PodcastSliderItemDto implements Parcelable {
    public static final Parcelable.Creator<PodcastSliderItemDto> CREATOR = new a();

    @pmi0("episode")
    private final AudioAudioDto episode;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("slider_type")
    private final String sliderType;

    /* compiled from: PodcastSliderItemDto.kt */
    public static final class a implements Parcelable.Creator<PodcastSliderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastSliderItemDto createFromParcel(Parcel parcel) {
            return new PodcastSliderItemDto(parcel.readString(), parcel.readString(), (AudioAudioDto) parcel.readParcelable(PodcastSliderItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastSliderItemDto[] newArray(int i) {
            return new PodcastSliderItemDto[i];
        }
    }

    public PodcastSliderItemDto() {
        this(null, null, null, 7, null);
    }

    public final AudioAudioDto d() {
        return this.episode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastSliderItemDto)) {
            return false;
        }
        PodcastSliderItemDto podcastSliderItemDto = (PodcastSliderItemDto) obj;
        return epx.f(this.itemId, podcastSliderItemDto.itemId) && epx.f(this.sliderType, podcastSliderItemDto.sliderType) && epx.f(this.episode, podcastSliderItemDto.episode);
    }

    public final String f() {
        return this.sliderType;
    }

    public final int hashCode() {
        String str = this.itemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sliderType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.episode;
        return hashCode2 + (audioAudioDto != null ? audioAudioDto.hashCode() : 0);
    }

    public final String toString() {
        return "PodcastSliderItemDto(itemId=" + this.itemId + ", sliderType=" + this.sliderType + ", episode=" + this.episode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.sliderType);
        parcel.writeParcelable(this.episode, i);
    }

    public PodcastSliderItemDto(String str, String str2, AudioAudioDto audioAudioDto) {
        this.itemId = str;
        this.sliderType = str2;
        this.episode = audioAudioDto;
    }

    public /* synthetic */ PodcastSliderItemDto(String str, String str2, AudioAudioDto audioAudioDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : audioAudioDto);
    }
}
