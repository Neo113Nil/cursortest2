package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ShortVideoGetRecommendationConstructorOptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetRecommendationConstructorOptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetRecommendationConstructorOptionsResponseDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<ShortVideoRecommendationConstructorOptionsCategoryDto> categories;

    /* compiled from: ShortVideoGetRecommendationConstructorOptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetRecommendationConstructorOptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetRecommendationConstructorOptionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoRecommendationConstructorOptionsCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetRecommendationConstructorOptionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetRecommendationConstructorOptionsResponseDto[] newArray(int i) {
            return new ShortVideoGetRecommendationConstructorOptionsResponseDto[i];
        }
    }

    public ShortVideoGetRecommendationConstructorOptionsResponseDto(List<ShortVideoRecommendationConstructorOptionsCategoryDto> list) {
        this.categories = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetRecommendationConstructorOptionsResponseDto) && epx.f(this.categories, ((ShortVideoGetRecommendationConstructorOptionsResponseDto) obj).categories);
    }

    public final int hashCode() {
        return this.categories.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetRecommendationConstructorOptionsResponseDto(categories="), this.categories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.categories);
        while (a2.hasNext()) {
            ((ShortVideoRecommendationConstructorOptionsCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
