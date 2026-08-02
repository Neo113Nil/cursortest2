package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AudioHeadphoneMessageDto.kt */
/* loaded from: classes14.dex */
public final class AudioHeadphoneMessageDto implements Parcelable {
    public static final Parcelable.Creator<AudioHeadphoneMessageDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioHeadphoneMessageDto.kt */
    public static final class a implements Parcelable.Creator<AudioHeadphoneMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioHeadphoneMessageDto createFromParcel(Parcel parcel) {
            return new AudioHeadphoneMessageDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioHeadphoneMessageDto[] newArray(int i) {
            return new AudioHeadphoneMessageDto[i];
        }
    }

    public AudioHeadphoneMessageDto(String str, String str2, String str3) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioHeadphoneMessageDto)) {
            return false;
        }
        AudioHeadphoneMessageDto audioHeadphoneMessageDto = (AudioHeadphoneMessageDto) obj;
        return epx.f(this.id, audioHeadphoneMessageDto.id) && epx.f(this.title, audioHeadphoneMessageDto.title) && epx.f(this.subtitle, audioHeadphoneMessageDto.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioHeadphoneMessageDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }
}
