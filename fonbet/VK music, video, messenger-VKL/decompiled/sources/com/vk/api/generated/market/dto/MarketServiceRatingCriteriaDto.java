package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketServiceRatingCriteriaDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingCriteriaDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingCriteriaDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketServiceRatingCriteriaItemDto> items;

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketServiceRatingCriteriaDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingCriteriaDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingCriteriaDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketServiceRatingCriteriaItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketServiceRatingCriteriaDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingCriteriaDto[] newArray(int i) {
            return new MarketServiceRatingCriteriaDto[i];
        }
    }

    public MarketServiceRatingCriteriaDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingCriteriaDto)) {
            return false;
        }
        MarketServiceRatingCriteriaDto marketServiceRatingCriteriaDto = (MarketServiceRatingCriteriaDto) obj;
        return epx.f(this.slug, marketServiceRatingCriteriaDto.slug) && epx.f(this.title, marketServiceRatingCriteriaDto.title) && epx.f(this.items, marketServiceRatingCriteriaDto.items);
    }

    public final int hashCode() {
        String str = this.slug;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarketServiceRatingCriteriaItemDto> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingCriteriaDto(slug=");
        sb.append(this.slug);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        List<MarketServiceRatingCriteriaItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketServiceRatingCriteriaItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketServiceRatingCriteriaDto(String str, String str2, List<MarketServiceRatingCriteriaItemDto> list) {
        this.slug = str;
        this.title = str2;
        this.items = list;
    }

    public /* synthetic */ MarketServiceRatingCriteriaDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
