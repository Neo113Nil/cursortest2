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

/* compiled from: MarketItemReviewCreateTypeHintConfigsDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemReviewCreateTypeHintConfigsDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemReviewCreateTypeHintConfigsDto> CREATOR = new a();

    @pmi0("comment")
    private final List<MarketItemReviewCreateTypeHintConfigDto> comment;

    @pmi0("cons")
    private final List<MarketItemReviewCreateTypeHintConfigDto> cons;

    @pmi0("pros")
    private final List<MarketItemReviewCreateTypeHintConfigDto> pros;

    /* compiled from: MarketItemReviewCreateTypeHintConfigsDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewCreateTypeHintConfigsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewCreateTypeHintConfigsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MarketItemReviewCreateTypeHintConfigDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(MarketItemReviewCreateTypeHintConfigDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MarketItemReviewCreateTypeHintConfigDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new MarketItemReviewCreateTypeHintConfigsDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewCreateTypeHintConfigsDto[] newArray(int i) {
            return new MarketItemReviewCreateTypeHintConfigsDto[i];
        }
    }

    public MarketItemReviewCreateTypeHintConfigsDto() {
        this(null, null, null, 7, null);
    }

    public final List<MarketItemReviewCreateTypeHintConfigDto> d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketItemReviewCreateTypeHintConfigDto> e() {
        return this.cons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewCreateTypeHintConfigsDto)) {
            return false;
        }
        MarketItemReviewCreateTypeHintConfigsDto marketItemReviewCreateTypeHintConfigsDto = (MarketItemReviewCreateTypeHintConfigsDto) obj;
        return epx.f(this.pros, marketItemReviewCreateTypeHintConfigsDto.pros) && epx.f(this.cons, marketItemReviewCreateTypeHintConfigsDto.cons) && epx.f(this.comment, marketItemReviewCreateTypeHintConfigsDto.comment);
    }

    public final List<MarketItemReviewCreateTypeHintConfigDto> f() {
        return this.pros;
    }

    public final int hashCode() {
        List<MarketItemReviewCreateTypeHintConfigDto> list = this.pros;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MarketItemReviewCreateTypeHintConfigDto> list2 = this.cons;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MarketItemReviewCreateTypeHintConfigDto> list3 = this.comment;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewCreateTypeHintConfigsDto(pros=");
        sb.append(this.pros);
        sb.append(", cons=");
        sb.append(this.cons);
        sb.append(", comment=");
        return ms9.a(')', sb, this.comment);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketItemReviewCreateTypeHintConfigDto> list = this.pros;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketItemReviewCreateTypeHintConfigDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketItemReviewCreateTypeHintConfigDto> list2 = this.cons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketItemReviewCreateTypeHintConfigDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketItemReviewCreateTypeHintConfigDto> list3 = this.comment;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((MarketItemReviewCreateTypeHintConfigDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public MarketItemReviewCreateTypeHintConfigsDto(List<MarketItemReviewCreateTypeHintConfigDto> list, List<MarketItemReviewCreateTypeHintConfigDto> list2, List<MarketItemReviewCreateTypeHintConfigDto> list3) {
        this.pros = list;
        this.cons = list2;
        this.comment = list3;
    }

    public /* synthetic */ MarketItemReviewCreateTypeHintConfigsDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
