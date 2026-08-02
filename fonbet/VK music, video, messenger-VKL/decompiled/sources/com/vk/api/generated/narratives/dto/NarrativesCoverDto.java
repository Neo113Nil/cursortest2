package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NarrativesCoverDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesCoverDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesCoverDto> CREATOR = new a();

    @pmi0("cover_story_id")
    private final Integer coverStoryId;

    @pmi0("crop_height")
    private final Float cropHeight;

    @pmi0("crop_width")
    private final Float cropWidth;

    @pmi0("crop_x")
    private final Float cropX;

    @pmi0("crop_y")
    private final Float cropY;

    @pmi0("cropped_sizes")
    private final List<BaseImageDto> croppedSizes;

    @pmi0("custom_photo")
    private final PhotosPhotoDto customPhoto;

    /* compiled from: NarrativesCoverDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesCoverDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NarrativesCoverDto.class, parcel, arrayList, i, 1);
                }
            }
            return new NarrativesCoverDto(valueOf, valueOf2, valueOf3, valueOf4, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (PhotosPhotoDto) parcel.readParcelable(NarrativesCoverDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesCoverDto[] newArray(int i) {
            return new NarrativesCoverDto[i];
        }
    }

    public NarrativesCoverDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Integer d() {
        return this.coverStoryId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.cropHeight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NarrativesCoverDto)) {
            return false;
        }
        NarrativesCoverDto narrativesCoverDto = (NarrativesCoverDto) obj;
        return epx.f(this.cropX, narrativesCoverDto.cropX) && epx.f(this.cropY, narrativesCoverDto.cropY) && epx.f(this.cropWidth, narrativesCoverDto.cropWidth) && epx.f(this.cropHeight, narrativesCoverDto.cropHeight) && epx.f(this.croppedSizes, narrativesCoverDto.croppedSizes) && epx.f(this.coverStoryId, narrativesCoverDto.coverStoryId) && epx.f(this.customPhoto, narrativesCoverDto.customPhoto);
    }

    public final Float f() {
        return this.cropWidth;
    }

    public final Float g() {
        return this.cropX;
    }

    public final int hashCode() {
        Float f = this.cropX;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.cropY;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.cropWidth;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.cropHeight;
        int hashCode4 = (hashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        List<BaseImageDto> list = this.croppedSizes;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.coverStoryId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.customPhoto;
        return hashCode6 + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final Float i() {
        return this.cropY;
    }

    public final List<BaseImageDto> j() {
        return this.croppedSizes;
    }

    public final PhotosPhotoDto k() {
        return this.customPhoto;
    }

    public final String toString() {
        return "NarrativesCoverDto(cropX=" + this.cropX + ", cropY=" + this.cropY + ", cropWidth=" + this.cropWidth + ", cropHeight=" + this.cropHeight + ", croppedSizes=" + this.croppedSizes + ", coverStoryId=" + this.coverStoryId + ", customPhoto=" + this.customPhoto + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.cropX;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.cropY;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.cropWidth;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        Float f4 = this.cropHeight;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f4);
        }
        List<BaseImageDto> list = this.croppedSizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        Integer num = this.coverStoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.customPhoto, i);
    }

    public NarrativesCoverDto(Float f, Float f2, Float f3, Float f4, List<BaseImageDto> list, Integer num, PhotosPhotoDto photosPhotoDto) {
        this.cropX = f;
        this.cropY = f2;
        this.cropWidth = f3;
        this.cropHeight = f4;
        this.croppedSizes = list;
        this.coverStoryId = num;
        this.customPhoto = photosPhotoDto;
    }

    public /* synthetic */ NarrativesCoverDto(Float f, Float f2, Float f3, Float f4, List list, Integer num, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : photosPhotoDto);
    }
}
