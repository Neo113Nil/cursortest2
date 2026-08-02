package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: PhonesCategoryDto.kt */
/* loaded from: classes15.dex */
public final class PhonesCategoryDto implements Parcelable {
    public static final Parcelable.Creator<PhonesCategoryDto> CREATOR = new a();

    @pmi0("category_id")
    private final int categoryId;

    @pmi0("good_type")
    private final PhonesGoodTypeDto goodType;

    @pmi0("name")
    private final String name;

    /* compiled from: PhonesCategoryDto.kt */
    public static final class a implements Parcelable.Creator<PhonesCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesCategoryDto createFromParcel(Parcel parcel) {
            return new PhonesCategoryDto(parcel.readInt(), parcel.readString(), PhonesGoodTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesCategoryDto[] newArray(int i) {
            return new PhonesCategoryDto[i];
        }
    }

    public PhonesCategoryDto(int i, String str, PhonesGoodTypeDto phonesGoodTypeDto) {
        this.categoryId = i;
        this.name = str;
        this.goodType = phonesGoodTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonesCategoryDto)) {
            return false;
        }
        PhonesCategoryDto phonesCategoryDto = (PhonesCategoryDto) obj;
        return this.categoryId == phonesCategoryDto.categoryId && epx.f(this.name, phonesCategoryDto.name) && this.goodType == phonesCategoryDto.goodType;
    }

    public final int hashCode() {
        return this.goodType.hashCode() + urd0.a(Integer.hashCode(this.categoryId) * 31, 31, this.name);
    }

    public final String toString() {
        return "PhonesCategoryDto(categoryId=" + this.categoryId + ", name=" + this.name + ", goodType=" + this.goodType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.categoryId);
        parcel.writeString(this.name);
        this.goodType.writeToParcel(parcel, i);
    }
}
