package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketSearchSpellCheckQueryDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchSpellCheckQueryDto implements Parcelable {
    public static final Parcelable.Creator<MarketSearchSpellCheckQueryDto> CREATOR = new a();

    @pmi0("query")
    private final String query;

    /* compiled from: MarketSearchSpellCheckQueryDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchSpellCheckQueryDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchSpellCheckQueryDto createFromParcel(Parcel parcel) {
            return new MarketSearchSpellCheckQueryDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchSpellCheckQueryDto[] newArray(int i) {
            return new MarketSearchSpellCheckQueryDto[i];
        }
    }

    public MarketSearchSpellCheckQueryDto(String str) {
        this.query = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketSearchSpellCheckQueryDto) && epx.f(this.query, ((MarketSearchSpellCheckQueryDto) obj).query);
    }

    public final int hashCode() {
        return this.query.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketSearchSpellCheckQueryDto(query="), this.query, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.query);
    }
}
