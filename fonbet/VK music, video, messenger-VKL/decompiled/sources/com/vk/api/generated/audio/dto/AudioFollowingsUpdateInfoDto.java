package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioFollowingsUpdateInfoDto.kt */
/* loaded from: classes14.dex */
public final class AudioFollowingsUpdateInfoDto implements Parcelable {
    public static final Parcelable.Creator<AudioFollowingsUpdateInfoDto> CREATOR = new a();

    @pmi0("covers")
    private final List<AudioPhotoDto> covers;

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioFollowingsUpdateInfoDto.kt */
    public static final class a implements Parcelable.Creator<AudioFollowingsUpdateInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioFollowingsUpdateInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioFollowingsUpdateInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioFollowingsUpdateInfoDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFollowingsUpdateInfoDto[] newArray(int i) {
            return new AudioFollowingsUpdateInfoDto[i];
        }
    }

    public AudioFollowingsUpdateInfoDto(String str, String str2, List<AudioPhotoDto> list) {
        this.title = str;
        this.id = str2;
        this.covers = list;
    }

    public final List<AudioPhotoDto> d() {
        return this.covers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFollowingsUpdateInfoDto)) {
            return false;
        }
        AudioFollowingsUpdateInfoDto audioFollowingsUpdateInfoDto = (AudioFollowingsUpdateInfoDto) obj;
        return epx.f(this.title, audioFollowingsUpdateInfoDto.title) && epx.f(this.id, audioFollowingsUpdateInfoDto.id) && epx.f(this.covers, audioFollowingsUpdateInfoDto.covers);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AudioPhotoDto> list = this.covers;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFollowingsUpdateInfoDto(title=");
        sb.append(this.title);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", covers=");
        return ms9.a(')', sb, this.covers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.id);
        List<AudioPhotoDto> list = this.covers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ AudioFollowingsUpdateInfoDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
