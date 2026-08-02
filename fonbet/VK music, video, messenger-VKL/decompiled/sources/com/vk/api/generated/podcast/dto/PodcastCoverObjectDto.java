package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastCoverObjectDto.kt */
/* loaded from: classes15.dex */
public final class PodcastCoverObjectDto implements Parcelable {
    public static final Parcelable.Creator<PodcastCoverObjectDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<AudioPhotoSizesDto> sizes;

    /* compiled from: PodcastCoverObjectDto.kt */
    public static final class a implements Parcelable.Creator<PodcastCoverObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastCoverObjectDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(PodcastCoverObjectDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PodcastCoverObjectDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastCoverObjectDto[] newArray(int i) {
            return new PodcastCoverObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PodcastCoverObjectDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<AudioPhotoSizesDto> d() {
        return this.sizes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastCoverObjectDto) && epx.f(this.sizes, ((PodcastCoverObjectDto) obj).sizes);
    }

    public final int hashCode() {
        List<AudioPhotoSizesDto> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PodcastCoverObjectDto(sizes="), this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AudioPhotoSizesDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public PodcastCoverObjectDto(List<AudioPhotoSizesDto> list) {
        this.sizes = list;
    }

    public /* synthetic */ PodcastCoverObjectDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
