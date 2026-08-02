package com.vk.api.generated.classifieds.dto;

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

/* compiled from: ClassifiedsGetSearchResultsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsGetSearchResultsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsGetSearchResultsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ClassifiedsYoulaItemExtendedDto> items;

    @pmi0("items_url")
    private final String itemsUrl;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("user_city")
    private final ClassifiedsYoulaCityDto userCity;

    /* compiled from: ClassifiedsGetSearchResultsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsGetSearchResultsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetSearchResultsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ClassifiedsYoulaItemExtendedDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClassifiedsGetSearchResultsResponseDto(readInt, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : ClassifiedsYoulaCityDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetSearchResultsResponseDto[] newArray(int i) {
            return new ClassifiedsGetSearchResultsResponseDto[i];
        }
    }

    public ClassifiedsGetSearchResultsResponseDto(int i, List<ClassifiedsYoulaItemExtendedDto> list, String str, ClassifiedsYoulaCityDto classifiedsYoulaCityDto, String str2, String str3) {
        this.count = i;
        this.items = list;
        this.itemsUrl = str;
        this.userCity = classifiedsYoulaCityDto;
        this.searchId = str2;
        this.trackCode = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsGetSearchResultsResponseDto)) {
            return false;
        }
        ClassifiedsGetSearchResultsResponseDto classifiedsGetSearchResultsResponseDto = (ClassifiedsGetSearchResultsResponseDto) obj;
        return this.count == classifiedsGetSearchResultsResponseDto.count && epx.f(this.items, classifiedsGetSearchResultsResponseDto.items) && epx.f(this.itemsUrl, classifiedsGetSearchResultsResponseDto.itemsUrl) && epx.f(this.userCity, classifiedsGetSearchResultsResponseDto.userCity) && epx.f(this.searchId, classifiedsGetSearchResultsResponseDto.searchId) && epx.f(this.trackCode, classifiedsGetSearchResultsResponseDto.trackCode);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.itemsUrl);
        ClassifiedsYoulaCityDto classifiedsYoulaCityDto = this.userCity;
        int hashCode = (a2 + (classifiedsYoulaCityDto == null ? 0 : classifiedsYoulaCityDto.hashCode())) * 31;
        String str = this.searchId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsGetSearchResultsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", itemsUrl=");
        sb.append(this.itemsUrl);
        sb.append(", userCity=");
        sb.append(this.userCity);
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ClassifiedsYoulaItemExtendedDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.itemsUrl);
        ClassifiedsYoulaCityDto classifiedsYoulaCityDto = this.userCity;
        if (classifiedsYoulaCityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaCityDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.searchId);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ ClassifiedsGetSearchResultsResponseDto(int i, List list, String str, ClassifiedsYoulaCityDto classifiedsYoulaCityDto, String str2, String str3, int i2, zcl zclVar) {
        this(i, list, str, (i2 & 8) != 0 ? null : classifiedsYoulaCityDto, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3);
    }
}
