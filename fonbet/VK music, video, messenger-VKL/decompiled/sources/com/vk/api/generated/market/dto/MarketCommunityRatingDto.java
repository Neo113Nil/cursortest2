package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketCommunityRatingDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityRatingDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityRatingDto> CREATOR = new a();

    @pmi0("can_add_review")
    private final boolean canAddReview;

    @pmi0("can_add_review_error")
    private final MarketCommunityRatingCanAddReviewErrorDto canAddReviewError;

    @pmi0("can_show_button_yclients_import")
    private final Boolean canShowButtonYclientsImport;

    @pmi0("is_add_review_show")
    private final boolean isAddReviewShow;

    @pmi0("mark")
    private final Float mark;

    @pmi0("marks_stat")
    private final List<MarketCommunityRatingMarksStatDto> marksStat;

    @pmi0("review_cnt")
    private final int reviewCnt;

    /* compiled from: MarketCommunityRatingDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityRatingDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            Boolean valueOf;
            int readInt = parcel.readInt();
            boolean z = false;
            boolean z2 = 1;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                i2 = 1;
            } else {
                i2 = 1;
                z2 = i;
            }
            ArrayList arrayList = null;
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            MarketCommunityRatingCanAddReviewErrorDto createFromParcel = parcel.readInt() == 0 ? null : MarketCommunityRatingCanAddReviewErrorDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? i2 : i);
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketCommunityRatingMarksStatDto.CREATOR, parcel, arrayList2, i, i2);
                }
                arrayList = arrayList2;
            }
            return new MarketCommunityRatingDto(readInt, z, z2, valueOf2, createFromParcel, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingDto[] newArray(int i) {
            return new MarketCommunityRatingDto[i];
        }
    }

    public MarketCommunityRatingDto(int i, boolean z, boolean z2, Float f, MarketCommunityRatingCanAddReviewErrorDto marketCommunityRatingCanAddReviewErrorDto, Boolean bool, List<MarketCommunityRatingMarksStatDto> list) {
        this.reviewCnt = i;
        this.canAddReview = z;
        this.isAddReviewShow = z2;
        this.mark = f;
        this.canAddReviewError = marketCommunityRatingCanAddReviewErrorDto;
        this.canShowButtonYclientsImport = bool;
        this.marksStat = list;
    }

    public final boolean d() {
        return this.canAddReview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCommunityRatingCanAddReviewErrorDto e() {
        return this.canAddReviewError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityRatingDto)) {
            return false;
        }
        MarketCommunityRatingDto marketCommunityRatingDto = (MarketCommunityRatingDto) obj;
        return this.reviewCnt == marketCommunityRatingDto.reviewCnt && this.canAddReview == marketCommunityRatingDto.canAddReview && this.isAddReviewShow == marketCommunityRatingDto.isAddReviewShow && epx.f(this.mark, marketCommunityRatingDto.mark) && epx.f(this.canAddReviewError, marketCommunityRatingDto.canAddReviewError) && epx.f(this.canShowButtonYclientsImport, marketCommunityRatingDto.canShowButtonYclientsImport) && epx.f(this.marksStat, marketCommunityRatingDto.marksStat);
    }

    public final Boolean f() {
        return this.canShowButtonYclientsImport;
    }

    public final Float g() {
        return this.mark;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Integer.hashCode(this.reviewCnt) * 31, 31, this.canAddReview), 31, this.isAddReviewShow);
        Float f = this.mark;
        int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
        MarketCommunityRatingCanAddReviewErrorDto marketCommunityRatingCanAddReviewErrorDto = this.canAddReviewError;
        int hashCode2 = (hashCode + (marketCommunityRatingCanAddReviewErrorDto == null ? 0 : marketCommunityRatingCanAddReviewErrorDto.hashCode())) * 31;
        Boolean bool = this.canShowButtonYclientsImport;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MarketCommunityRatingMarksStatDto> list = this.marksStat;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final List<MarketCommunityRatingMarksStatDto> i() {
        return this.marksStat;
    }

    public final int j() {
        return this.reviewCnt;
    }

    public final boolean k() {
        return this.isAddReviewShow;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityRatingDto(reviewCnt=");
        sb.append(this.reviewCnt);
        sb.append(", canAddReview=");
        sb.append(this.canAddReview);
        sb.append(", isAddReviewShow=");
        sb.append(this.isAddReviewShow);
        sb.append(", mark=");
        sb.append(this.mark);
        sb.append(", canAddReviewError=");
        sb.append(this.canAddReviewError);
        sb.append(", canShowButtonYclientsImport=");
        sb.append(this.canShowButtonYclientsImport);
        sb.append(", marksStat=");
        return ms9.a(')', sb, this.marksStat);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reviewCnt);
        parcel.writeInt(this.canAddReview ? 1 : 0);
        parcel.writeInt(this.isAddReviewShow ? 1 : 0);
        Float f = this.mark;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        MarketCommunityRatingCanAddReviewErrorDto marketCommunityRatingCanAddReviewErrorDto = this.canAddReviewError;
        if (marketCommunityRatingCanAddReviewErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCommunityRatingCanAddReviewErrorDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canShowButtonYclientsImport;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<MarketCommunityRatingMarksStatDto> list = this.marksStat;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list, 1);
        while (f2.hasNext()) {
            ((MarketCommunityRatingMarksStatDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCommunityRatingDto(int i, boolean z, boolean z2, Float f, MarketCommunityRatingCanAddReviewErrorDto marketCommunityRatingCanAddReviewErrorDto, Boolean bool, List list, int i2, zcl zclVar) {
        this(i, z, z2, (i2 & 8) != 0 ? null : f, (i2 & 16) != 0 ? null : marketCommunityRatingCanAddReviewErrorDto, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : list);
    }
}
