package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetRecentSearchResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRecentSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetRecentSearchResponseDto> CREATOR = new a();

    @pmi0("queries")
    private final List<String> queries;

    /* compiled from: MarketGetRecentSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRecentSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRecentSearchResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetRecentSearchResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRecentSearchResponseDto[] newArray(int i) {
            return new MarketGetRecentSearchResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetRecentSearchResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetRecentSearchResponseDto) && epx.f(this.queries, ((MarketGetRecentSearchResponseDto) obj).queries);
    }

    public final int hashCode() {
        List<String> list = this.queries;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketGetRecentSearchResponseDto(queries="), this.queries);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.queries);
    }

    public MarketGetRecentSearchResponseDto(List<String> list) {
        this.queries = list;
    }

    public /* synthetic */ MarketGetRecentSearchResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
