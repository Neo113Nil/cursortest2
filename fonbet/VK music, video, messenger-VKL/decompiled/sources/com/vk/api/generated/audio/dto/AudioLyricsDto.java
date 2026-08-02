package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioLyricsDto.kt */
/* loaded from: classes14.dex */
public final class AudioLyricsDto implements Parcelable {
    public static final Parcelable.Creator<AudioLyricsDto> CREATOR = new a();

    @pmi0(X3.i.k)
    private final String credits;

    @pmi0("lyrics")
    private final AudioLyricsDataDto lyrics;

    @pmi0("md5")
    private final String md5;

    @pmi0("text")
    private final String text;

    /* compiled from: AudioLyricsDto.kt */
    public static final class a implements Parcelable.Creator<AudioLyricsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioLyricsDto createFromParcel(Parcel parcel) {
            return new AudioLyricsDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AudioLyricsDataDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioLyricsDto[] newArray(int i) {
            return new AudioLyricsDto[i];
        }
    }

    public AudioLyricsDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.credits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AudioLyricsDataDto e() {
        return this.lyrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyricsDto)) {
            return false;
        }
        AudioLyricsDto audioLyricsDto = (AudioLyricsDto) obj;
        return epx.f(this.text, audioLyricsDto.text) && epx.f(this.md5, audioLyricsDto.md5) && epx.f(this.lyrics, audioLyricsDto.lyrics) && epx.f(this.credits, audioLyricsDto.credits);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.md5;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AudioLyricsDataDto audioLyricsDataDto = this.lyrics;
        int hashCode3 = (hashCode2 + (audioLyricsDataDto == null ? 0 : audioLyricsDataDto.hashCode())) * 31;
        String str3 = this.credits;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricsDto(text=");
        sb.append(this.text);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(", lyrics=");
        sb.append(this.lyrics);
        sb.append(", credits=");
        return ho8.a(sb, this.credits, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.md5);
        AudioLyricsDataDto audioLyricsDataDto = this.lyrics;
        if (audioLyricsDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioLyricsDataDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.credits);
    }

    public AudioLyricsDto(String str, String str2, AudioLyricsDataDto audioLyricsDataDto, String str3) {
        this.text = str;
        this.md5 = str2;
        this.lyrics = audioLyricsDataDto;
        this.credits = str3;
    }

    public /* synthetic */ AudioLyricsDto(String str, String str2, AudioLyricsDataDto audioLyricsDataDto, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : audioLyricsDataDto, (i & 8) != 0 ? null : str3);
    }
}
