package com.vk.api.generated.audioAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioAdsAcknowledgeViewPositionDto.kt */
/* loaded from: classes14.dex */
public final class AudioAdsAcknowledgeViewPositionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioAdsAcknowledgeViewPositionDto[] $VALUES;
    public static final Parcelable.Creator<AudioAdsAcknowledgeViewPositionDto> CREATOR;

    @pmi0("midroll")
    public static final AudioAdsAcknowledgeViewPositionDto MIDROLL;

    @pmi0("postroll")
    public static final AudioAdsAcknowledgeViewPositionDto POSTROLL;

    @pmi0("preroll")
    public static final AudioAdsAcknowledgeViewPositionDto PREROLL;
    private final String value;

    /* compiled from: AudioAdsAcknowledgeViewPositionDto.kt */
    public static final class a implements Parcelable.Creator<AudioAdsAcknowledgeViewPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAdsAcknowledgeViewPositionDto createFromParcel(Parcel parcel) {
            return AudioAdsAcknowledgeViewPositionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAdsAcknowledgeViewPositionDto[] newArray(int i) {
            return new AudioAdsAcknowledgeViewPositionDto[i];
        }
    }

    static {
        AudioAdsAcknowledgeViewPositionDto audioAdsAcknowledgeViewPositionDto = new AudioAdsAcknowledgeViewPositionDto("MIDROLL", 0, "midroll");
        MIDROLL = audioAdsAcknowledgeViewPositionDto;
        AudioAdsAcknowledgeViewPositionDto audioAdsAcknowledgeViewPositionDto2 = new AudioAdsAcknowledgeViewPositionDto("POSTROLL", 1, "postroll");
        POSTROLL = audioAdsAcknowledgeViewPositionDto2;
        AudioAdsAcknowledgeViewPositionDto audioAdsAcknowledgeViewPositionDto3 = new AudioAdsAcknowledgeViewPositionDto("PREROLL", 2, "preroll");
        PREROLL = audioAdsAcknowledgeViewPositionDto3;
        AudioAdsAcknowledgeViewPositionDto[] audioAdsAcknowledgeViewPositionDtoArr = {audioAdsAcknowledgeViewPositionDto, audioAdsAcknowledgeViewPositionDto2, audioAdsAcknowledgeViewPositionDto3};
        $VALUES = audioAdsAcknowledgeViewPositionDtoArr;
        $ENTRIES = new asp(audioAdsAcknowledgeViewPositionDtoArr);
        CREATOR = new a();
    }

    private AudioAdsAcknowledgeViewPositionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioAdsAcknowledgeViewPositionDto valueOf(String str) {
        return (AudioAdsAcknowledgeViewPositionDto) Enum.valueOf(AudioAdsAcknowledgeViewPositionDto.class, str);
    }

    public static AudioAdsAcknowledgeViewPositionDto[] values() {
        return (AudioAdsAcknowledgeViewPositionDto[]) $VALUES.clone();
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
