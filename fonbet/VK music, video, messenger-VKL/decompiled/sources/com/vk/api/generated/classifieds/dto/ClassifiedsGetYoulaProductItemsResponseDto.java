package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ClassifiedsGetYoulaProductItemsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsGetYoulaProductItemsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsGetYoulaProductItemsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ClassifiedsYoulaItemDto> items;

    /* compiled from: ClassifiedsGetYoulaProductItemsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsGetYoulaProductItemsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetYoulaProductItemsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClassifiedsYoulaItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClassifiedsGetYoulaProductItemsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetYoulaProductItemsResponseDto[] newArray(int i) {
            return new ClassifiedsGetYoulaProductItemsResponseDto[i];
        }
    }

    public ClassifiedsGetYoulaProductItemsResponseDto(List<ClassifiedsYoulaItemDto> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassifiedsGetYoulaProductItemsResponseDto) && epx.f(this.items, ((ClassifiedsGetYoulaProductItemsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ClassifiedsGetYoulaProductItemsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ClassifiedsYoulaItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
