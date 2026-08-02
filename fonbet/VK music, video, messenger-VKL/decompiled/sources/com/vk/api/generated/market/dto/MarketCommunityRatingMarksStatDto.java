package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MarketCommunityRatingMarksStatDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityRatingMarksStatDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityRatingMarksStatDto> CREATOR = new a();

    @pmi0("mark")
    private final int mark;

    @pmi0("marks_count")
    private final int marksCount;

    @pmi0("percentage")
    private final int percentage;

    /* compiled from: MarketCommunityRatingMarksStatDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityRatingMarksStatDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingMarksStatDto createFromParcel(Parcel parcel) {
            return new MarketCommunityRatingMarksStatDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingMarksStatDto[] newArray(int i) {
            return new MarketCommunityRatingMarksStatDto[i];
        }
    }

    public MarketCommunityRatingMarksStatDto(int i, int i2, int i3) {
        this.mark = i;
        this.marksCount = i2;
        this.percentage = i3;
    }

    public final int d() {
        return this.mark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.marksCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityRatingMarksStatDto)) {
            return false;
        }
        MarketCommunityRatingMarksStatDto marketCommunityRatingMarksStatDto = (MarketCommunityRatingMarksStatDto) obj;
        return this.mark == marketCommunityRatingMarksStatDto.mark && this.marksCount == marketCommunityRatingMarksStatDto.marksCount && this.percentage == marketCommunityRatingMarksStatDto.percentage;
    }

    public final int f() {
        return this.percentage;
    }

    public final int hashCode() {
        return Integer.hashCode(this.percentage) + shy.a(this.marksCount, Integer.hashCode(this.mark) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityRatingMarksStatDto(mark=");
        sb.append(this.mark);
        sb.append(", marksCount=");
        sb.append(this.marksCount);
        sb.append(", percentage=");
        return vu5.b(sb, this.percentage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mark);
        parcel.writeInt(this.marksCount);
        parcel.writeInt(this.percentage);
    }
}
