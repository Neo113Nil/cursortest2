package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesPreviewDto.kt */
/* loaded from: classes15.dex */
public final class StoriesPreviewDto implements Parcelable {
    public static final Parcelable.Creator<StoriesPreviewDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<PhotosImageDto> sizes;

    @pmi0("thumb_hash")
    private final String thumbHash;

    /* compiled from: StoriesPreviewDto.kt */
    public static final class a implements Parcelable.Creator<StoriesPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesPreviewDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoriesPreviewDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoriesPreviewDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesPreviewDto[] newArray(int i) {
            return new StoriesPreviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesPreviewDto() {
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
        if (!(obj instanceof StoriesPreviewDto)) {
            return false;
        }
        StoriesPreviewDto storiesPreviewDto = (StoriesPreviewDto) obj;
        return epx.f(this.sizes, storiesPreviewDto.sizes) && epx.f(this.thumbHash, storiesPreviewDto.thumbHash);
    }

    public final int hashCode() {
        List<PhotosImageDto> list = this.sizes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.thumbHash;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesPreviewDto(sizes=");
        sb.append(this.sizes);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.thumbHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PhotosImageDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.thumbHash);
    }

    public StoriesPreviewDto(List<PhotosImageDto> list, String str) {
        this.sizes = list;
        this.thumbHash = str;
    }

    public /* synthetic */ StoriesPreviewDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
