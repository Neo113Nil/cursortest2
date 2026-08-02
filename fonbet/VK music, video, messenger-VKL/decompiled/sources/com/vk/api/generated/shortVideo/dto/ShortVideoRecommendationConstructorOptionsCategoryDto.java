package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoRecommendationConstructorOptionsCategoryDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecommendationConstructorOptionsCategoryDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<ShortVideoRecommendationConstructorOptionsCategoryItemDto> items;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: ShortVideoRecommendationConstructorOptionsCategoryDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoRecommendationConstructorOptionsCategoryItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoRecommendationConstructorOptionsCategoryDto(readString, readString2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryDto[] newArray(int i) {
            return new ShortVideoRecommendationConstructorOptionsCategoryDto[i];
        }
    }

    public ShortVideoRecommendationConstructorOptionsCategoryDto(String str, String str2, List<ShortVideoRecommendationConstructorOptionsCategoryItemDto> list, String str3) {
        this.id = str;
        this.type = str2;
        this.items = list;
        this.title = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoRecommendationConstructorOptionsCategoryDto)) {
            return false;
        }
        ShortVideoRecommendationConstructorOptionsCategoryDto shortVideoRecommendationConstructorOptionsCategoryDto = (ShortVideoRecommendationConstructorOptionsCategoryDto) obj;
        return epx.f(this.id, shortVideoRecommendationConstructorOptionsCategoryDto.id) && epx.f(this.type, shortVideoRecommendationConstructorOptionsCategoryDto.type) && epx.f(this.items, shortVideoRecommendationConstructorOptionsCategoryDto.items) && epx.f(this.title, shortVideoRecommendationConstructorOptionsCategoryDto.title);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.type), 31, this.items);
        String str = this.title;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoRecommendationConstructorOptionsCategoryDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoRecommendationConstructorOptionsCategoryItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
    }

    public /* synthetic */ ShortVideoRecommendationConstructorOptionsCategoryDto(String str, String str2, List list, String str3, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : str3);
    }
}
