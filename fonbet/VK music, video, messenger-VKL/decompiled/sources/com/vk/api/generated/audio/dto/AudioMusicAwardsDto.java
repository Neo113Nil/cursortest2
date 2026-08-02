package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioMusicAwardsDto.kt */
/* loaded from: classes14.dex */
public final class AudioMusicAwardsDto implements Parcelable {
    public static final Parcelable.Creator<AudioMusicAwardsDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioMusicAwardsDto.kt */
    public static final class a implements Parcelable.Creator<AudioMusicAwardsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioMusicAwardsDto createFromParcel(Parcel parcel) {
            return new AudioMusicAwardsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioMusicAwardsDto[] newArray(int i) {
            return new AudioMusicAwardsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioMusicAwardsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioMusicAwardsDto)) {
            return false;
        }
        AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) obj;
        return epx.f(this.title, audioMusicAwardsDto.title) && epx.f(this.url, audioMusicAwardsDto.url);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMusicAwardsDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }

    public AudioMusicAwardsDto(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    public /* synthetic */ AudioMusicAwardsDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
