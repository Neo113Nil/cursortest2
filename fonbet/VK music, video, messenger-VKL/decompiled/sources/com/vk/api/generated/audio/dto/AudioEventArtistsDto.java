package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AudioEventArtistsDto.kt */
/* loaded from: classes14.dex */
public final class AudioEventArtistsDto implements Parcelable {
    public static final Parcelable.Creator<AudioEventArtistsDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("photos")
    private final List<AudioEventPhotosDto> photos;

    /* compiled from: AudioEventArtistsDto.kt */
    public static final class a implements Parcelable.Creator<AudioEventArtistsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioEventArtistsDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioEventPhotosDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioEventArtistsDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEventArtistsDto[] newArray(int i) {
            return new AudioEventArtistsDto[i];
        }
    }

    public AudioEventArtistsDto(String str, String str2, List<AudioEventPhotosDto> list) {
        this.name = str;
        this.id = str2;
        this.photos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEventArtistsDto)) {
            return false;
        }
        AudioEventArtistsDto audioEventArtistsDto = (AudioEventArtistsDto) obj;
        return epx.f(this.name, audioEventArtistsDto.name) && epx.f(this.id, audioEventArtistsDto.id) && epx.f(this.photos, audioEventArtistsDto.photos);
    }

    public final int hashCode() {
        return this.photos.hashCode() + urd0.a(this.name.hashCode() * 31, 31, this.id);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEventArtistsDto(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", photos=");
        return ms9.a(')', sb, this.photos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.photos);
        while (a2.hasNext()) {
            ((AudioEventPhotosDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
