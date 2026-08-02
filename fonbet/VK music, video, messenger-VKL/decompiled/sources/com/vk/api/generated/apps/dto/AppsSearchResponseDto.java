package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.search.dto.SearchHintDto;
import com.vk.api.generated.search.dto.SearchTagDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsSearchResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsSearchResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<SearchHintDto> items;

    @pmi0("recommended_tags")
    private final List<SearchTagDto> recommendedTags;

    @pmi0("suggested_queries")
    private final List<String> suggestedQueries;

    /* compiled from: AppsSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSearchResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(SearchHintDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(SearchTagDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new AppsSearchResponseDto(readInt, arrayList2, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSearchResponseDto[] newArray(int i) {
            return new AppsSearchResponseDto[i];
        }
    }

    public AppsSearchResponseDto(int i, List<SearchHintDto> list, List<SearchTagDto> list2, List<String> list3) {
        this.count = i;
        this.items = list;
        this.recommendedTags = list2;
        this.suggestedQueries = list3;
    }

    public final List<SearchHintDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SearchTagDto> e() {
        return this.recommendedTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsSearchResponseDto)) {
            return false;
        }
        AppsSearchResponseDto appsSearchResponseDto = (AppsSearchResponseDto) obj;
        return this.count == appsSearchResponseDto.count && epx.f(this.items, appsSearchResponseDto.items) && epx.f(this.recommendedTags, appsSearchResponseDto.recommendedTags) && epx.f(this.suggestedQueries, appsSearchResponseDto.suggestedQueries);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<SearchTagDto> list = this.recommendedTags;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.suggestedQueries;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsSearchResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", recommendedTags=");
        sb.append(this.recommendedTags);
        sb.append(", suggestedQueries=");
        return ms9.a(')', sb, this.suggestedQueries);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SearchHintDto) a2.next()).writeToParcel(parcel, i);
        }
        List<SearchTagDto> list = this.recommendedTags;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SearchTagDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.suggestedQueries);
    }

    public /* synthetic */ AppsSearchResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
