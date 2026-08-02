package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoriesTemplatePreviewDto.kt */
/* loaded from: classes15.dex */
public final class StoriesTemplatePreviewDto implements Parcelable {
    public static final Parcelable.Creator<StoriesTemplatePreviewDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    /* compiled from: StoriesTemplatePreviewDto.kt */
    public static final class a implements Parcelable.Creator<StoriesTemplatePreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesTemplatePreviewDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(StoriesTemplatePreviewDto.class, parcel, arrayList, i, 1);
            }
            return new StoriesTemplatePreviewDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesTemplatePreviewDto[] newArray(int i) {
            return new StoriesTemplatePreviewDto[i];
        }
    }

    public StoriesTemplatePreviewDto(List<BaseImageDto> list) {
        this.sizes = list;
    }

    public final List<BaseImageDto> d() {
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
        return (obj instanceof StoriesTemplatePreviewDto) && epx.f(this.sizes, ((StoriesTemplatePreviewDto) obj).sizes);
    }

    public final int hashCode() {
        return this.sizes.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoriesTemplatePreviewDto(sizes="), this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sizes);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
