package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AudioPhotosByTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioPhotosByTypeDto implements Parcelable {
    public static final Parcelable.Creator<AudioPhotosByTypeDto> CREATOR = new a();

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("type")
    private final String type;

    /* compiled from: AudioPhotosByTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioPhotosByTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPhotosByTypeDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioPhotosByTypeDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPhotosByTypeDto[] newArray(int i) {
            return new AudioPhotosByTypeDto[i];
        }
    }

    public AudioPhotosByTypeDto(String str, List<BaseImageDto> list) {
        this.type = str;
        this.photo = list;
    }

    public final List<BaseImageDto> d() {
        return this.photo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotosByTypeDto)) {
            return false;
        }
        AudioPhotosByTypeDto audioPhotosByTypeDto = (AudioPhotosByTypeDto) obj;
        return epx.f(this.type, audioPhotosByTypeDto.type) && epx.f(this.photo, audioPhotosByTypeDto.photo);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.photo.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPhotosByTypeDto(type=");
        sb.append(this.type);
        sb.append(", photo=");
        return ms9.a(')', sb, this.photo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
