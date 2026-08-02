package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaTtsMetaDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaTtsMetaDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaTtsMetaDto> CREATOR = new a();

    @pmi0("album")
    private final AudioAudioAlbumDto album;

    @pmi0("artist")
    private final String artist;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MarusiaTtsMetaDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaTtsMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsMetaDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            AudioAudioAlbumDto audioAudioAlbumDto;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                audioAudioAlbumDto = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                audioAudioAlbumDto = null;
            }
            return new MarusiaTtsMetaDto(readString, readString2, valueOf, parcel.readString(), parcel.readInt() == 0 ? audioAudioAlbumDto : AudioAudioAlbumDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsMetaDto[] newArray(int i) {
            return new MarusiaTtsMetaDto[i];
        }
    }

    public MarusiaTtsMetaDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final AudioAudioAlbumDto d() {
        return this.album;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.artist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaTtsMetaDto)) {
            return false;
        }
        MarusiaTtsMetaDto marusiaTtsMetaDto = (MarusiaTtsMetaDto) obj;
        return epx.f(this.title, marusiaTtsMetaDto.title) && epx.f(this.artist, marusiaTtsMetaDto.artist) && epx.f(this.duration, marusiaTtsMetaDto.duration) && epx.f(this.url, marusiaTtsMetaDto.url) && epx.f(this.album, marusiaTtsMetaDto.album);
    }

    public final Integer f() {
        return this.duration;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.artist;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AudioAudioAlbumDto audioAudioAlbumDto = this.album;
        return hashCode4 + (audioAudioAlbumDto != null ? audioAudioAlbumDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarusiaTtsMetaDto(title=" + this.title + ", artist=" + this.artist + ", duration=" + this.duration + ", url=" + this.url + ", album=" + this.album + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.artist);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.url);
        AudioAudioAlbumDto audioAudioAlbumDto = this.album;
        if (audioAudioAlbumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAudioAlbumDto.writeToParcel(parcel, i);
        }
    }

    public MarusiaTtsMetaDto(String str, String str2, Integer num, String str3, AudioAudioAlbumDto audioAudioAlbumDto) {
        this.title = str;
        this.artist = str2;
        this.duration = num;
        this.url = str3;
        this.album = audioAudioAlbumDto;
    }

    public /* synthetic */ MarusiaTtsMetaDto(String str, String str2, Integer num, String str3, AudioAudioAlbumDto audioAudioAlbumDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : audioAudioAlbumDto);
    }
}
