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

/* compiled from: MarketServiceRatingBenefitsDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingBenefitsDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingBenefitsDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketServiceRatingBenefitItemDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketServiceRatingBenefitsDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingBenefitsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketServiceRatingBenefitItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketServiceRatingBenefitsDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitsDto[] newArray(int i) {
            return new MarketServiceRatingBenefitsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketServiceRatingBenefitsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingBenefitsDto)) {
            return false;
        }
        MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto = (MarketServiceRatingBenefitsDto) obj;
        return epx.f(this.title, marketServiceRatingBenefitsDto.title) && epx.f(this.items, marketServiceRatingBenefitsDto.items);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MarketServiceRatingBenefitItemDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingBenefitsDto(title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<MarketServiceRatingBenefitItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketServiceRatingBenefitItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketServiceRatingBenefitsDto(String str, List<MarketServiceRatingBenefitItemDto> list) {
        this.title = str;
        this.items = list;
    }

    public /* synthetic */ MarketServiceRatingBenefitsDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
