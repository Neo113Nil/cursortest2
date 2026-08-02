package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioAudioAlbumDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioAlbumDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioAlbumDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("id")
    private final int id;

    @pmi0("main_color")
    private final String mainColor;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("thumb")
    private final AudioPhotoDto thumb;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioAudioAlbumDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioAlbumDto createFromParcel(Parcel parcel) {
            return new AudioAudioAlbumDto(parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(AudioAudioAlbumDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : AudioPhotoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioAlbumDto[] newArray(int i) {
            return new AudioAudioAlbumDto[i];
        }
    }

    public AudioAudioAlbumDto(int i, String str, UserId userId, String str2, AudioPhotoDto audioPhotoDto, String str3) {
        this.id = i;
        this.title = str;
        this.ownerId = userId;
        this.accessKey = str2;
        this.thumb = audioPhotoDto;
        this.mainColor = str3;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.mainColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioAlbumDto)) {
            return false;
        }
        AudioAudioAlbumDto audioAudioAlbumDto = (AudioAudioAlbumDto) obj;
        return this.id == audioAudioAlbumDto.id && epx.f(this.title, audioAudioAlbumDto.title) && epx.f(this.ownerId, audioAudioAlbumDto.ownerId) && epx.f(this.accessKey, audioAudioAlbumDto.accessKey) && epx.f(this.thumb, audioAudioAlbumDto.thumb) && epx.f(this.mainColor, audioAudioAlbumDto.mainColor);
    }

    public final AudioPhotoDto f() {
        return this.thumb;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.ownerId.b), 31, this.accessKey);
        AudioPhotoDto audioPhotoDto = this.thumb;
        int hashCode = (a2 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        String str = this.mainColor;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAudioAlbumDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", mainColor=");
        return ho8.a(sb, this.mainColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.accessKey);
        AudioPhotoDto audioPhotoDto = this.thumb;
        if (audioPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.mainColor);
    }

    public /* synthetic */ AudioAudioAlbumDto(int i, String str, UserId userId, String str2, AudioPhotoDto audioPhotoDto, String str3, int i2, zcl zclVar) {
        this(i, str, userId, str2, (i2 & 16) != 0 ? null : audioPhotoDto, (i2 & 32) != 0 ? null : str3);
    }
}
