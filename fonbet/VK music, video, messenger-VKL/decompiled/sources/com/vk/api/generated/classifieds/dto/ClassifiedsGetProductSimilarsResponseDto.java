package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ClassifiedsGetProductSimilarsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsGetProductSimilarsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsGetProductSimilarsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ClassifiedsYoulaItemExtendedDto> items;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: ClassifiedsGetProductSimilarsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsGetProductSimilarsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetProductSimilarsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClassifiedsYoulaItemExtendedDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClassifiedsGetProductSimilarsResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetProductSimilarsResponseDto[] newArray(int i) {
            return new ClassifiedsGetProductSimilarsResponseDto[i];
        }
    }

    public ClassifiedsGetProductSimilarsResponseDto(List<ClassifiedsYoulaItemExtendedDto> list, String str) {
        this.items = list;
        this.trackCode = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsGetProductSimilarsResponseDto)) {
            return false;
        }
        ClassifiedsGetProductSimilarsResponseDto classifiedsGetProductSimilarsResponseDto = (ClassifiedsGetProductSimilarsResponseDto) obj;
        return epx.f(this.items, classifiedsGetProductSimilarsResponseDto.items) && epx.f(this.trackCode, classifiedsGetProductSimilarsResponseDto.trackCode);
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsGetProductSimilarsResponseDto(items=");
        sb.append(this.items);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ClassifiedsYoulaItemExtendedDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
    }
}
