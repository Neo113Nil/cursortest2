package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoChallengeCameraParamsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeCameraParamsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeCameraParamsDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_start_time")
    private final Integer audioStartTime;

    @pmi0("effect")
    private final MasksEffectDto effect;

    @pmi0("mask")
    private final MasksMaskDto mask;

    @pmi0("tag")
    private final String tag;

    /* compiled from: ShortVideoChallengeCameraParamsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeCameraParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeCameraParamsDto createFromParcel(Parcel parcel) {
            return new ShortVideoChallengeCameraParamsDto(parcel.readString(), (AudioAudioDto) parcel.readParcelable(ShortVideoChallengeCameraParamsDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MasksMaskDto) parcel.readParcelable(ShortVideoChallengeCameraParamsDto.class.getClassLoader()), (MasksEffectDto) parcel.readParcelable(ShortVideoChallengeCameraParamsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeCameraParamsDto[] newArray(int i) {
            return new ShortVideoChallengeCameraParamsDto[i];
        }
    }

    public ShortVideoChallengeCameraParamsDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final AudioAudioDto d() {
        return this.audio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.audioStartTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeCameraParamsDto)) {
            return false;
        }
        ShortVideoChallengeCameraParamsDto shortVideoChallengeCameraParamsDto = (ShortVideoChallengeCameraParamsDto) obj;
        return epx.f(this.tag, shortVideoChallengeCameraParamsDto.tag) && epx.f(this.audio, shortVideoChallengeCameraParamsDto.audio) && epx.f(this.audioStartTime, shortVideoChallengeCameraParamsDto.audioStartTime) && epx.f(this.mask, shortVideoChallengeCameraParamsDto.mask) && epx.f(this.effect, shortVideoChallengeCameraParamsDto.effect);
    }

    public final MasksMaskDto f() {
        return this.mask;
    }

    public final String g() {
        return this.tag;
    }

    public final int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        Integer num = this.audioStartTime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        MasksMaskDto masksMaskDto = this.mask;
        int hashCode4 = (hashCode3 + (masksMaskDto == null ? 0 : masksMaskDto.hashCode())) * 31;
        MasksEffectDto masksEffectDto = this.effect;
        return hashCode4 + (masksEffectDto != null ? masksEffectDto.hashCode() : 0);
    }

    public final String toString() {
        return "ShortVideoChallengeCameraParamsDto(tag=" + this.tag + ", audio=" + this.audio + ", audioStartTime=" + this.audioStartTime + ", mask=" + this.mask + ", effect=" + this.effect + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.audio, i);
        Integer num = this.audioStartTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.mask, i);
        parcel.writeParcelable(this.effect, i);
    }

    public ShortVideoChallengeCameraParamsDto(String str, AudioAudioDto audioAudioDto, Integer num, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto) {
        this.tag = str;
        this.audio = audioAudioDto;
        this.audioStartTime = num;
        this.mask = masksMaskDto;
        this.effect = masksEffectDto;
    }

    public /* synthetic */ ShortVideoChallengeCameraParamsDto(String str, AudioAudioDto audioAudioDto, Integer num, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : masksMaskDto, (i & 16) != 0 ? null : masksEffectDto);
    }
}
