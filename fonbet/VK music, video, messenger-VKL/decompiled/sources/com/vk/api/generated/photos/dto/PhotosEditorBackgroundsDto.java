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
import xsna.zcl;

/* compiled from: PhotosEditorBackgroundsDto.kt */
/* loaded from: classes15.dex */
public final class PhotosEditorBackgroundsDto implements Parcelable {
    public static final Parcelable.Creator<PhotosEditorBackgroundsDto> CREATOR = new a();

    @pmi0("advice_gradients")
    private final List<PhotosEditorBackgroundItemDto> adviceGradients;

    @pmi0("colors")
    private final List<PhotosEditorBackgroundItemDto> colors;

    @pmi0("emojies")
    private final List<PhotosEditorBackgroundItemDto> emojies;

    @pmi0("gradients")
    private final List<PhotosEditorBackgroundItemDto> gradients;

    @pmi0("marusia")
    private final List<PhotosEditorBackgroundItemDto> marusia;

    /* compiled from: PhotosEditorBackgroundsDto.kt */
    public static final class a implements Parcelable.Creator<PhotosEditorBackgroundsDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosEditorBackgroundsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i = 0;
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(PhotosEditorBackgroundItemDto.CREATOR, parcel, arrayList6, i2, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(PhotosEditorBackgroundItemDto.CREATOR, parcel, arrayList7, i3, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(PhotosEditorBackgroundItemDto.CREATOR, parcel, arrayList8, i4, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(PhotosEditorBackgroundItemDto.CREATOR, parcel, arrayList9, i5, 1);
                }
                arrayList4 = arrayList9;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(PhotosEditorBackgroundItemDto.CREATOR, parcel, arrayList5, i, 1);
                }
            }
            return new PhotosEditorBackgroundsDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosEditorBackgroundsDto[] newArray(int i) {
            return new PhotosEditorBackgroundsDto[i];
        }
    }

    public PhotosEditorBackgroundsDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosEditorBackgroundsDto)) {
            return false;
        }
        PhotosEditorBackgroundsDto photosEditorBackgroundsDto = (PhotosEditorBackgroundsDto) obj;
        return epx.f(this.adviceGradients, photosEditorBackgroundsDto.adviceGradients) && epx.f(this.colors, photosEditorBackgroundsDto.colors) && epx.f(this.emojies, photosEditorBackgroundsDto.emojies) && epx.f(this.gradients, photosEditorBackgroundsDto.gradients) && epx.f(this.marusia, photosEditorBackgroundsDto.marusia);
    }

    public final int hashCode() {
        List<PhotosEditorBackgroundItemDto> list = this.adviceGradients;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PhotosEditorBackgroundItemDto> list2 = this.colors;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhotosEditorBackgroundItemDto> list3 = this.emojies;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PhotosEditorBackgroundItemDto> list4 = this.gradients;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<PhotosEditorBackgroundItemDto> list5 = this.marusia;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosEditorBackgroundsDto(adviceGradients=");
        sb.append(this.adviceGradients);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", emojies=");
        sb.append(this.emojies);
        sb.append(", gradients=");
        sb.append(this.gradients);
        sb.append(", marusia=");
        return ms9.a(')', sb, this.marusia);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PhotosEditorBackgroundItemDto> list = this.adviceGradients;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PhotosEditorBackgroundItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosEditorBackgroundItemDto> list2 = this.colors;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((PhotosEditorBackgroundItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosEditorBackgroundItemDto> list3 = this.emojies;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((PhotosEditorBackgroundItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosEditorBackgroundItemDto> list4 = this.gradients;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((PhotosEditorBackgroundItemDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosEditorBackgroundItemDto> list5 = this.marusia;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f5 = dn.f(parcel, list5, 1);
        while (f5.hasNext()) {
            ((PhotosEditorBackgroundItemDto) f5.next()).writeToParcel(parcel, i);
        }
    }

    public PhotosEditorBackgroundsDto(List<PhotosEditorBackgroundItemDto> list, List<PhotosEditorBackgroundItemDto> list2, List<PhotosEditorBackgroundItemDto> list3, List<PhotosEditorBackgroundItemDto> list4, List<PhotosEditorBackgroundItemDto> list5) {
        this.adviceGradients = list;
        this.colors = list2;
        this.emojies = list3;
        this.gradients = list4;
        this.marusia = list5;
    }

    public /* synthetic */ PhotosEditorBackgroundsDto(List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}
