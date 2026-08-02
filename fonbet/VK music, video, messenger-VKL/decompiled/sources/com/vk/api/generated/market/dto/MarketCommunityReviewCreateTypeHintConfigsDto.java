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

/* compiled from: MarketCommunityReviewCreateTypeHintConfigsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityReviewCreateTypeHintConfigsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityReviewCreateTypeHintConfigsDto> CREATOR = new a();

    @pmi0("comment")
    private final List<MarketCommunityReviewCreateTypeHintConfigDto> comment;

    /* compiled from: MarketCommunityReviewCreateTypeHintConfigsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityReviewCreateTypeHintConfigsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewCreateTypeHintConfigsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketCommunityReviewCreateTypeHintConfigDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketCommunityReviewCreateTypeHintConfigsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewCreateTypeHintConfigsDto[] newArray(int i) {
            return new MarketCommunityReviewCreateTypeHintConfigsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCommunityReviewCreateTypeHintConfigsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<MarketCommunityReviewCreateTypeHintConfigDto> d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketCommunityReviewCreateTypeHintConfigsDto) && epx.f(this.comment, ((MarketCommunityReviewCreateTypeHintConfigsDto) obj).comment);
    }

    public final int hashCode() {
        List<MarketCommunityReviewCreateTypeHintConfigDto> list = this.comment;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketCommunityReviewCreateTypeHintConfigsDto(comment="), this.comment);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketCommunityReviewCreateTypeHintConfigDto> list = this.comment;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketCommunityReviewCreateTypeHintConfigDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketCommunityReviewCreateTypeHintConfigsDto(List<MarketCommunityReviewCreateTypeHintConfigDto> list) {
        this.comment = list;
    }

    public /* synthetic */ MarketCommunityReviewCreateTypeHintConfigsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
