package com.vk.api.generated.docs.dto;

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

/* compiled from: DocsDocPreviewPhotoDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewPhotoDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewPhotoDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<DocsDocPreviewPhotoSizesDto> sizes;

    /* compiled from: DocsDocPreviewPhotoDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewPhotoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(DocsDocPreviewPhotoSizesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new DocsDocPreviewPhotoDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewPhotoDto[] newArray(int i) {
            return new DocsDocPreviewPhotoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocsDocPreviewPhotoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<DocsDocPreviewPhotoSizesDto> d() {
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
        return (obj instanceof DocsDocPreviewPhotoDto) && epx.f(this.sizes, ((DocsDocPreviewPhotoDto) obj).sizes);
    }

    public final int hashCode() {
        List<DocsDocPreviewPhotoSizesDto> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DocsDocPreviewPhotoDto(sizes="), this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<DocsDocPreviewPhotoSizesDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((DocsDocPreviewPhotoSizesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public DocsDocPreviewPhotoDto(List<DocsDocPreviewPhotoSizesDto> list) {
        this.sizes = list;
    }

    public /* synthetic */ DocsDocPreviewPhotoDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
