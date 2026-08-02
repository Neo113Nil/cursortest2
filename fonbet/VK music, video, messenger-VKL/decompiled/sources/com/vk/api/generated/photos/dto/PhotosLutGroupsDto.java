package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosLutGroupsDto.kt */
/* loaded from: classes15.dex */
public final class PhotosLutGroupsDto implements Parcelable {
    public static final Parcelable.Creator<PhotosLutGroupsDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("luts")
    private final List<PhotosLutImagesDto> luts;

    @pmi0("name")
    private final String name;

    /* compiled from: PhotosLutGroupsDto.kt */
    public static final class a implements Parcelable.Creator<PhotosLutGroupsDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosLutGroupsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(PhotosLutImagesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PhotosLutGroupsDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosLutGroupsDto[] newArray(int i) {
            return new PhotosLutGroupsDto[i];
        }
    }

    public PhotosLutGroupsDto(int i, String str, List<PhotosLutImagesDto> list) {
        this.id = i;
        this.name = str;
        this.luts = list;
    }

    public final List<PhotosLutImagesDto> d() {
        return this.luts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosLutGroupsDto)) {
            return false;
        }
        PhotosLutGroupsDto photosLutGroupsDto = (PhotosLutGroupsDto) obj;
        return this.id == photosLutGroupsDto.id && epx.f(this.name, photosLutGroupsDto.name) && epx.f(this.luts, photosLutGroupsDto.luts);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<PhotosLutImagesDto> list = this.luts;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosLutGroupsDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", luts=");
        return ms9.a(')', sb, this.luts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        List<PhotosLutImagesDto> list = this.luts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((PhotosLutImagesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PhotosLutGroupsDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
