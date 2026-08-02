package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: MarketItemReviewCreateTypeHintConfigDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemReviewCreateTypeHintConfigDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemReviewCreateTypeHintConfigDto> CREATOR = new a();

    @pmi0("max_text_length")
    private final int maxTextLength;

    @pmi0("min_text_length")
    private final int minTextLength;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final float progress;

    @pmi0("text_hints")
    private final List<String> textHints;

    /* compiled from: MarketItemReviewCreateTypeHintConfigDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewCreateTypeHintConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewCreateTypeHintConfigDto createFromParcel(Parcel parcel) {
            return new MarketItemReviewCreateTypeHintConfigDto(parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewCreateTypeHintConfigDto[] newArray(int i) {
            return new MarketItemReviewCreateTypeHintConfigDto[i];
        }
    }

    public MarketItemReviewCreateTypeHintConfigDto(float f, int i, int i2, List<String> list) {
        this.progress = f;
        this.minTextLength = i;
        this.maxTextLength = i2;
        this.textHints = list;
    }

    public final int d() {
        return this.maxTextLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.minTextLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewCreateTypeHintConfigDto)) {
            return false;
        }
        MarketItemReviewCreateTypeHintConfigDto marketItemReviewCreateTypeHintConfigDto = (MarketItemReviewCreateTypeHintConfigDto) obj;
        return Float.compare(this.progress, marketItemReviewCreateTypeHintConfigDto.progress) == 0 && this.minTextLength == marketItemReviewCreateTypeHintConfigDto.minTextLength && this.maxTextLength == marketItemReviewCreateTypeHintConfigDto.maxTextLength && epx.f(this.textHints, marketItemReviewCreateTypeHintConfigDto.textHints);
    }

    public final float f() {
        return this.progress;
    }

    public final List<String> g() {
        return this.textHints;
    }

    public final int hashCode() {
        return this.textHints.hashCode() + shy.a(this.maxTextLength, shy.a(this.minTextLength, Float.hashCode(this.progress) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewCreateTypeHintConfigDto(progress=");
        sb.append(this.progress);
        sb.append(", minTextLength=");
        sb.append(this.minTextLength);
        sb.append(", maxTextLength=");
        sb.append(this.maxTextLength);
        sb.append(", textHints=");
        return ms9.a(')', sb, this.textHints);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.progress);
        parcel.writeInt(this.minTextLength);
        parcel.writeInt(this.maxTextLength);
        parcel.writeStringList(this.textHints);
    }
}
