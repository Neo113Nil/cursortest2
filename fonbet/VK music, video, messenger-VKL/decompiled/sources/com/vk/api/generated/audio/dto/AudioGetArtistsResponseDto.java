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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetArtistsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetArtistsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetArtistsResponseDto> CREATOR = new a();

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

    @pmi0("count")
    private final Integer count;

    /* compiled from: AudioGetArtistsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetArtistsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetArtistsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioGetArtistsResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioGetArtistsResponseDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetArtistsResponseDto[] newArray(int i) {
            return new AudioGetArtistsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioGetArtistsResponseDto() {
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
        if (!(obj instanceof AudioGetArtistsResponseDto)) {
            return false;
        }
        AudioGetArtistsResponseDto audioGetArtistsResponseDto = (AudioGetArtistsResponseDto) obj;
        return epx.f(this.count, audioGetArtistsResponseDto.count) && epx.f(this.artists, audioGetArtistsResponseDto.artists);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AudioArtistDto> list = this.artists;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetArtistsResponseDto(count=");
        sb.append(this.count);
        sb.append(", artists=");
        return ms9.a(')', sb, this.artists);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AudioArtistDto> list = this.artists;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public AudioGetArtistsResponseDto(Integer num, List<AudioArtistDto> list) {
        this.count = num;
        this.artists = list;
    }

    public /* synthetic */ AudioGetArtistsResponseDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
