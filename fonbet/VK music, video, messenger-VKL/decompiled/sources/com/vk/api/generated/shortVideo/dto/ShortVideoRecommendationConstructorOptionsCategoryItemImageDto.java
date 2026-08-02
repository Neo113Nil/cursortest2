package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoRecommendationConstructorOptionsCategoryItemImageDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecommendationConstructorOptionsCategoryItemImageDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> CREATOR = new a();

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    @pmi0("type")
    private final String type;

    /* compiled from: ShortVideoRecommendationConstructorOptionsCategoryItemImageDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryItemImageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoRecommendationConstructorOptionsCategoryItemImageDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoRecommendationConstructorOptionsCategoryItemImageDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryItemImageDto[] newArray(int i) {
            return new ShortVideoRecommendationConstructorOptionsCategoryItemImageDto[i];
        }
    }

    public ShortVideoRecommendationConstructorOptionsCategoryItemImageDto(String str, List<BaseImageDto> list) {
        this.type = str;
        this.sizes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoRecommendationConstructorOptionsCategoryItemImageDto)) {
            return false;
        }
        ShortVideoRecommendationConstructorOptionsCategoryItemImageDto shortVideoRecommendationConstructorOptionsCategoryItemImageDto = (ShortVideoRecommendationConstructorOptionsCategoryItemImageDto) obj;
        return epx.f(this.type, shortVideoRecommendationConstructorOptionsCategoryItemImageDto.type) && epx.f(this.sizes, shortVideoRecommendationConstructorOptionsCategoryItemImageDto.sizes);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<BaseImageDto> list = this.sizes;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoRecommendationConstructorOptionsCategoryItemImageDto(type=");
        sb.append(this.type);
        sb.append(", sizes=");
        return ms9.a(')', sb, this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        List<BaseImageDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ ShortVideoRecommendationConstructorOptionsCategoryItemImageDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
