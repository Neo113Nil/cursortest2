package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosGetPhotosByIdWithTagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetPhotosByIdWithTagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetPhotosByIdWithTagsResponseDto> CREATOR = new a();

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("tags")
    private final List<PhotosPhotoTagDto> tags;

    /* compiled from: PhotosGetPhotosByIdWithTagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetPhotosByIdWithTagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetPhotosByIdWithTagsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(PhotosGetPhotosByIdWithTagsResponseDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(PhotosGetPhotosByIdWithTagsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(PhotosPhotoTagDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new PhotosGetPhotosByIdWithTagsResponseDto(arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetPhotosByIdWithTagsResponseDto[] newArray(int i) {
            return new PhotosGetPhotosByIdWithTagsResponseDto[i];
        }
    }

    public PhotosGetPhotosByIdWithTagsResponseDto(List<PhotosPhotoDto> list, List<UsersUserFullDto> list2, List<PhotosPhotoTagDto> list3) {
        this.photos = list;
        this.profiles = list2;
        this.tags = list3;
    }

    public final List<PhotosPhotoDto> d() {
        return this.photos;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UsersUserFullDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetPhotosByIdWithTagsResponseDto)) {
            return false;
        }
        PhotosGetPhotosByIdWithTagsResponseDto photosGetPhotosByIdWithTagsResponseDto = (PhotosGetPhotosByIdWithTagsResponseDto) obj;
        return epx.f(this.photos, photosGetPhotosByIdWithTagsResponseDto.photos) && epx.f(this.profiles, photosGetPhotosByIdWithTagsResponseDto.profiles) && epx.f(this.tags, photosGetPhotosByIdWithTagsResponseDto.tags);
    }

    public final List<PhotosPhotoTagDto> f() {
        return this.tags;
    }

    public final int hashCode() {
        int hashCode = this.photos.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoTagDto> list2 = this.tags;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetPhotosByIdWithTagsResponseDto(photos=");
        sb.append(this.photos);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", tags=");
        return ms9.a(')', sb, this.tags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.photos);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<PhotosPhotoTagDto> list2 = this.tags;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((PhotosPhotoTagDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PhotosGetPhotosByIdWithTagsResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
