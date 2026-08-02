package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioBannerBlockDto.kt */
/* loaded from: classes14.dex */
public final class AudioBannerBlockDto implements Parcelable {
    public static final Parcelable.Creator<AudioBannerBlockDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("image")
    private final BaseImageDto image;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: AudioBannerBlockDto.kt */
    public static final class a implements Parcelable.Creator<AudioBannerBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBannerBlockDto createFromParcel(Parcel parcel) {
            return new AudioBannerBlockDto(parcel.readString(), (BaseImageDto) parcel.readParcelable(AudioBannerBlockDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBannerBlockDto[] newArray(int i) {
            return new AudioBannerBlockDto[i];
        }
    }

    public AudioBannerBlockDto() {
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
        if (!(obj instanceof AudioBannerBlockDto)) {
            return false;
        }
        AudioBannerBlockDto audioBannerBlockDto = (AudioBannerBlockDto) obj;
        return epx.f(this.type, audioBannerBlockDto.type) && epx.f(this.image, audioBannerBlockDto.image) && epx.f(this.text, audioBannerBlockDto.text) && epx.f(this.color, audioBannerBlockDto.color);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseImageDto baseImageDto = this.image;
        int hashCode2 = (hashCode + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBannerBlockDto(type=");
        sb.append(this.type);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", color=");
        return ho8.a(sb, this.color, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        parcel.writeString(this.color);
    }

    public AudioBannerBlockDto(String str, BaseImageDto baseImageDto, String str2, String str3) {
        this.type = str;
        this.image = baseImageDto;
        this.text = str2;
        this.color = str3;
    }

    public /* synthetic */ AudioBannerBlockDto(String str, BaseImageDto baseImageDto, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseImageDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
