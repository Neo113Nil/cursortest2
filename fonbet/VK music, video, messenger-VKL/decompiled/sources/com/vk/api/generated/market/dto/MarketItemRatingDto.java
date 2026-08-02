package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.so;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketItemRatingDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemRatingDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemRatingDto> CREATOR = new a();

    @pmi0("can_add_review")
    private final boolean canAddReview;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("reviews_cnt")
    private final int reviewsCnt;

    @pmi0("reviews_cnt_text")
    private final String reviewsCntText;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketItemRatingDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemRatingDto createFromParcel(Parcel parcel) {
            return new MarketItemRatingDto(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemRatingDto[] newArray(int i) {
            return new MarketItemRatingDto[i];
        }
    }

    public MarketItemRatingDto(int i, String str, boolean z, String str2, Float f) {
        this.reviewsCnt = i;
        this.reviewsCntText = str;
        this.canAddReview = z;
        this.title = str2;
        this.rating = f;
    }

    public final boolean d() {
        return this.canAddReview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.rating;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemRatingDto)) {
            return false;
        }
        MarketItemRatingDto marketItemRatingDto = (MarketItemRatingDto) obj;
        return this.reviewsCnt == marketItemRatingDto.reviewsCnt && epx.f(this.reviewsCntText, marketItemRatingDto.reviewsCntText) && this.canAddReview == marketItemRatingDto.canAddReview && epx.f(this.title, marketItemRatingDto.title) && epx.f(this.rating, marketItemRatingDto.rating);
    }

    public final int f() {
        return this.reviewsCnt;
    }

    public final String g() {
        return this.reviewsCntText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(Integer.hashCode(this.reviewsCnt) * 31, 31, this.reviewsCntText), 31, this.canAddReview);
        String str = this.title;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.rating;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemRatingDto(reviewsCnt=");
        sb.append(this.reviewsCnt);
        sb.append(", reviewsCntText=");
        sb.append(this.reviewsCntText);
        sb.append(", canAddReview=");
        sb.append(this.canAddReview);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", rating=");
        return so.b(sb, this.rating, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reviewsCnt);
        parcel.writeString(this.reviewsCntText);
        parcel.writeInt(this.canAddReview ? 1 : 0);
        parcel.writeString(this.title);
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public /* synthetic */ MarketItemRatingDto(int i, String str, boolean z, String str2, Float f, int i2, zcl zclVar) {
        this(i, str, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : f);
    }
}
