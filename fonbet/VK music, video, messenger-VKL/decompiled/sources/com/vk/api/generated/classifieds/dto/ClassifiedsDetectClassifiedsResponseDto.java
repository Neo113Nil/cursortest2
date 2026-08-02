package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsDetectClassifiedsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsDetectClassifiedsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsDetectClassifiedsResponseDto> CREATOR = new a();

    @pmi0("is_classifieds_product")
    private final boolean isClassifiedsProduct;

    @pmi0("ml_response")
    private final ClassifiedsDetectClassifiedsMlResponseDto mlResponse;

    @pmi0("price")
    private final Long price;

    @pmi0("title")
    private final String title;

    /* compiled from: ClassifiedsDetectClassifiedsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsDetectClassifiedsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsDetectClassifiedsResponseDto createFromParcel(Parcel parcel) {
            return new ClassifiedsDetectClassifiedsResponseDto(parcel.readInt() != 0, (ClassifiedsDetectClassifiedsMlResponseDto) parcel.readParcelable(ClassifiedsDetectClassifiedsResponseDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsDetectClassifiedsResponseDto[] newArray(int i) {
            return new ClassifiedsDetectClassifiedsResponseDto[i];
        }
    }

    public ClassifiedsDetectClassifiedsResponseDto(boolean z, ClassifiedsDetectClassifiedsMlResponseDto classifiedsDetectClassifiedsMlResponseDto, String str, Long l) {
        this.isClassifiedsProduct = z;
        this.mlResponse = classifiedsDetectClassifiedsMlResponseDto;
        this.title = str;
        this.price = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsDetectClassifiedsResponseDto)) {
            return false;
        }
        ClassifiedsDetectClassifiedsResponseDto classifiedsDetectClassifiedsResponseDto = (ClassifiedsDetectClassifiedsResponseDto) obj;
        return this.isClassifiedsProduct == classifiedsDetectClassifiedsResponseDto.isClassifiedsProduct && epx.f(this.mlResponse, classifiedsDetectClassifiedsResponseDto.mlResponse) && epx.f(this.title, classifiedsDetectClassifiedsResponseDto.title) && epx.f(this.price, classifiedsDetectClassifiedsResponseDto.price);
    }

    public final int hashCode() {
        int hashCode = (this.mlResponse.hashCode() + (Boolean.hashCode(this.isClassifiedsProduct) * 31)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.price;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsDetectClassifiedsResponseDto(isClassifiedsProduct=");
        sb.append(this.isClassifiedsProduct);
        sb.append(", mlResponse=");
        sb.append(this.mlResponse);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", price=");
        return iq.b(sb, this.price, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isClassifiedsProduct ? 1 : 0);
        parcel.writeParcelable(this.mlResponse, i);
        parcel.writeString(this.title);
        Long l = this.price;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ ClassifiedsDetectClassifiedsResponseDto(boolean z, ClassifiedsDetectClassifiedsMlResponseDto classifiedsDetectClassifiedsMlResponseDto, String str, Long l, int i, zcl zclVar) {
        this(z, classifiedsDetectClassifiedsMlResponseDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l);
    }
}
