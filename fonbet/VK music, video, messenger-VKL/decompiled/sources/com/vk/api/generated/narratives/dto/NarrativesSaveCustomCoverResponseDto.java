package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NarrativesSaveCustomCoverResponseDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesSaveCustomCoverResponseDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesSaveCustomCoverResponseDto> CREATOR = new a();

    @pmi0("cropped_sizes")
    private final List<BaseImageDto> croppedSizes;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    /* compiled from: NarrativesSaveCustomCoverResponseDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesSaveCustomCoverResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesSaveCustomCoverResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(NarrativesSaveCustomCoverResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NarrativesSaveCustomCoverResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NarrativesSaveCustomCoverResponseDto(photosPhotoDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesSaveCustomCoverResponseDto[] newArray(int i) {
            return new NarrativesSaveCustomCoverResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NarrativesSaveCustomCoverResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final PhotosPhotoDto d() {
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
        if (!(obj instanceof NarrativesSaveCustomCoverResponseDto)) {
            return false;
        }
        NarrativesSaveCustomCoverResponseDto narrativesSaveCustomCoverResponseDto = (NarrativesSaveCustomCoverResponseDto) obj;
        return epx.f(this.photo, narrativesSaveCustomCoverResponseDto.photo) && epx.f(this.croppedSizes, narrativesSaveCustomCoverResponseDto.croppedSizes);
    }

    public final int hashCode() {
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode = (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode()) * 31;
        List<BaseImageDto> list = this.croppedSizes;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativesSaveCustomCoverResponseDto(photo=");
        sb.append(this.photo);
        sb.append(", croppedSizes=");
        return ms9.a(')', sb, this.croppedSizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.photo, i);
        List<BaseImageDto> list = this.croppedSizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public NarrativesSaveCustomCoverResponseDto(PhotosPhotoDto photosPhotoDto, List<BaseImageDto> list) {
        this.photo = photosPhotoDto;
        this.croppedSizes = list;
    }

    public /* synthetic */ NarrativesSaveCustomCoverResponseDto(PhotosPhotoDto photosPhotoDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosPhotoDto, (i & 2) != 0 ? null : list);
    }
}
