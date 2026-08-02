package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioConsumeSpecialProjectReasonDto.kt */
/* loaded from: classes14.dex */
public final class AudioConsumeSpecialProjectReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioConsumeSpecialProjectReasonDto[] $VALUES;

    @pmi0("button")
    public static final AudioConsumeSpecialProjectReasonDto BUTTON;

    @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
    public static final AudioConsumeSpecialProjectReasonDto CLOSE;
    public static final Parcelable.Creator<AudioConsumeSpecialProjectReasonDto> CREATOR;

    @pmi0("link")
    public static final AudioConsumeSpecialProjectReasonDto LINK;

    @pmi0("swipe")
    public static final AudioConsumeSpecialProjectReasonDto SWIPE;
    private final String value;

    /* compiled from: AudioConsumeSpecialProjectReasonDto.kt */
    public static final class a implements Parcelable.Creator<AudioConsumeSpecialProjectReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioConsumeSpecialProjectReasonDto createFromParcel(Parcel parcel) {
            return AudioConsumeSpecialProjectReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioConsumeSpecialProjectReasonDto[] newArray(int i) {
            return new AudioConsumeSpecialProjectReasonDto[i];
        }
    }

    static {
        AudioConsumeSpecialProjectReasonDto audioConsumeSpecialProjectReasonDto = new AudioConsumeSpecialProjectReasonDto("BUTTON", 0, "button");
        BUTTON = audioConsumeSpecialProjectReasonDto;
        AudioConsumeSpecialProjectReasonDto audioConsumeSpecialProjectReasonDto2 = new AudioConsumeSpecialProjectReasonDto("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = audioConsumeSpecialProjectReasonDto2;
        AudioConsumeSpecialProjectReasonDto audioConsumeSpecialProjectReasonDto3 = new AudioConsumeSpecialProjectReasonDto("LINK", 2, "link");
        LINK = audioConsumeSpecialProjectReasonDto3;
        AudioConsumeSpecialProjectReasonDto audioConsumeSpecialProjectReasonDto4 = new AudioConsumeSpecialProjectReasonDto("SWIPE", 3, "swipe");
        SWIPE = audioConsumeSpecialProjectReasonDto4;
        AudioConsumeSpecialProjectReasonDto[] audioConsumeSpecialProjectReasonDtoArr = {audioConsumeSpecialProjectReasonDto, audioConsumeSpecialProjectReasonDto2, audioConsumeSpecialProjectReasonDto3, audioConsumeSpecialProjectReasonDto4};
        $VALUES = audioConsumeSpecialProjectReasonDtoArr;
        $ENTRIES = new asp(audioConsumeSpecialProjectReasonDtoArr);
        CREATOR = new a();
    }

    private AudioConsumeSpecialProjectReasonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioConsumeSpecialProjectReasonDto valueOf(String str) {
        return (AudioConsumeSpecialProjectReasonDto) Enum.valueOf(AudioConsumeSpecialProjectReasonDto.class, str);
    }

    public static AudioConsumeSpecialProjectReasonDto[] values() {
        return (AudioConsumeSpecialProjectReasonDto[]) $VALUES.clone();
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
