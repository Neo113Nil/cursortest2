package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: SearchGetCoOwnersResponseDto.kt */
/* loaded from: classes15.dex */
public final class SearchGetCoOwnersResponseDto implements Parcelable {
    public static final Parcelable.Creator<SearchGetCoOwnersResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<SearchCoOwnersDto> items;

    @pmi0(X3.i.l)
    private final int total;

    /* compiled from: SearchGetCoOwnersResponseDto.kt */
    public static final class a implements Parcelable.Creator<SearchGetCoOwnersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchGetCoOwnersResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(SearchCoOwnersDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SearchGetCoOwnersResponseDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchGetCoOwnersResponseDto[] newArray(int i) {
            return new SearchGetCoOwnersResponseDto[i];
        }
    }

    public SearchGetCoOwnersResponseDto(int i, int i2, List<SearchCoOwnersDto> list) {
        this.total = i;
        this.count = i2;
        this.items = list;
    }

    public final List<SearchCoOwnersDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.total;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGetCoOwnersResponseDto)) {
            return false;
        }
        SearchGetCoOwnersResponseDto searchGetCoOwnersResponseDto = (SearchGetCoOwnersResponseDto) obj;
        return this.total == searchGetCoOwnersResponseDto.total && this.count == searchGetCoOwnersResponseDto.count && epx.f(this.items, searchGetCoOwnersResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.count, Integer.hashCode(this.total) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchGetCoOwnersResponseDto(total=");
        sb.append(this.total);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.total);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SearchCoOwnersDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
