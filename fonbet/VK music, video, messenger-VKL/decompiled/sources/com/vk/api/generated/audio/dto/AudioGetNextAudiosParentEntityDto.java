package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetNextAudiosParentEntityDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetNextAudiosParentEntityDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetNextAudiosParentEntityDto> CREATOR = new a();

    @pmi0("photo")
    private final AudioPhotoDto photo;

    @pmi0("text")
    private final String text;

    @pmi0("thumbs")
    private final List<AudioPhotoDto> thumbs;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioGetNextAudiosParentEntityDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetNextAudiosParentEntityDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosParentEntityDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            AudioPhotoDto audioPhotoDto = (AudioPhotoDto) parcel.readParcelable(AudioGetNextAudiosParentEntityDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioGetNextAudiosParentEntityDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioGetNextAudiosParentEntityDto(readString, audioPhotoDto, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosParentEntityDto[] newArray(int i) {
            return new AudioGetNextAudiosParentEntityDto[i];
        }
    }

    public AudioGetNextAudiosParentEntityDto() {
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
        if (!(obj instanceof AudioGetNextAudiosParentEntityDto)) {
            return false;
        }
        AudioGetNextAudiosParentEntityDto audioGetNextAudiosParentEntityDto = (AudioGetNextAudiosParentEntityDto) obj;
        return epx.f(this.title, audioGetNextAudiosParentEntityDto.title) && epx.f(this.photo, audioGetNextAudiosParentEntityDto.photo) && epx.f(this.thumbs, audioGetNextAudiosParentEntityDto.thumbs) && epx.f(this.text, audioGetNextAudiosParentEntityDto.text);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode2 = (hashCode + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        List<AudioPhotoDto> list = this.thumbs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.text;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetNextAudiosParentEntityDto(title=");
        sb.append(this.title);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.photo, i);
        List<AudioPhotoDto> list = this.thumbs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.text);
    }

    public AudioGetNextAudiosParentEntityDto(String str, AudioPhotoDto audioPhotoDto, List<AudioPhotoDto> list, String str2) {
        this.title = str;
        this.photo = audioPhotoDto;
        this.thumbs = list;
        this.text = str2;
    }

    public /* synthetic */ AudioGetNextAudiosParentEntityDto(String str, AudioPhotoDto audioPhotoDto, List list, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : audioPhotoDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2);
    }
}
