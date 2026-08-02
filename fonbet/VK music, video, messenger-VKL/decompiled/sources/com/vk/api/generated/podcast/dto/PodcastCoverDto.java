package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastCoverDto.kt */
/* loaded from: classes15.dex */
public final class PodcastCoverDto implements Parcelable {
    public static final Parcelable.Creator<PodcastCoverDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    /* compiled from: PodcastCoverDto.kt */
    public static final class a implements Parcelable.Creator<PodcastCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastCoverDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(PhotosPhotoSizesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PodcastCoverDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastCoverDto[] newArray(int i) {
            return new PodcastCoverDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PodcastCoverDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<PhotosPhotoSizesDto> d() {
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
        return (obj instanceof PodcastCoverDto) && epx.f(this.sizes, ((PodcastCoverDto) obj).sizes);
    }

    public final int hashCode() {
        List<PhotosPhotoSizesDto> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PodcastCoverDto(sizes="), this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PhotosPhotoSizesDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((PhotosPhotoSizesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public PodcastCoverDto(List<PhotosPhotoSizesDto> list) {
        this.sizes = list;
    }

    public /* synthetic */ PodcastCoverDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
