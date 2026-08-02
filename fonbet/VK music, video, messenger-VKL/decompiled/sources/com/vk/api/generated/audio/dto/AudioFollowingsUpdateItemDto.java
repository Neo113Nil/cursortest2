package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioFollowingsUpdateItemDto.kt */
/* loaded from: classes14.dex */
public final class AudioFollowingsUpdateItemDto implements Parcelable {
    public static final Parcelable.Creator<AudioFollowingsUpdateItemDto> CREATOR = new a();

    @pmi0("cover")
    private final AudioPhotoDto cover;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioFollowingsUpdateItemDto.kt */
    public static final class a implements Parcelable.Creator<AudioFollowingsUpdateItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioFollowingsUpdateItemDto createFromParcel(Parcel parcel) {
            return new AudioFollowingsUpdateItemDto(parcel.readString(), parcel.readString(), parcel.readString(), (AudioPhotoDto) parcel.readParcelable(AudioFollowingsUpdateItemDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFollowingsUpdateItemDto[] newArray(int i) {
            return new AudioFollowingsUpdateItemDto[i];
        }
    }

    public AudioFollowingsUpdateItemDto(String str, String str2, String str3, AudioPhotoDto audioPhotoDto, String str4, String str5) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.cover = audioPhotoDto;
        this.subtitle = str4;
        this.description = str5;
    }

    public final AudioPhotoDto d() {
        return this.cover;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFollowingsUpdateItemDto)) {
            return false;
        }
        AudioFollowingsUpdateItemDto audioFollowingsUpdateItemDto = (AudioFollowingsUpdateItemDto) obj;
        return epx.f(this.id, audioFollowingsUpdateItemDto.id) && epx.f(this.title, audioFollowingsUpdateItemDto.title) && epx.f(this.url, audioFollowingsUpdateItemDto.url) && epx.f(this.cover, audioFollowingsUpdateItemDto.cover) && epx.f(this.subtitle, audioFollowingsUpdateItemDto.subtitle) && epx.f(this.description, audioFollowingsUpdateItemDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.title);
        String str = this.url;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.cover;
        int hashCode2 = (hashCode + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFollowingsUpdateItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.cover, i);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AudioFollowingsUpdateItemDto(String str, String str2, String str3, AudioPhotoDto audioPhotoDto, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : audioPhotoDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
