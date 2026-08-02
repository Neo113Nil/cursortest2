package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketCustomButtonTypeOpenPresetDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTypeOpenPresetDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTypeOpenPresetDto> CREATOR = new a();

    @pmi0("button_titles")
    private final List<MarketCustomButtonTitlesListingDto> buttonTitles;

    /* compiled from: MarketCustomButtonTypeOpenPresetDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTypeOpenPresetDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeOpenPresetDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketCustomButtonTitlesListingDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketCustomButtonTypeOpenPresetDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeOpenPresetDto[] newArray(int i) {
            return new MarketCustomButtonTypeOpenPresetDto[i];
        }
    }

    public MarketCustomButtonTypeOpenPresetDto(List<MarketCustomButtonTitlesListingDto> list) {
        this.buttonTitles = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketCustomButtonTypeOpenPresetDto) && epx.f(this.buttonTitles, ((MarketCustomButtonTypeOpenPresetDto) obj).buttonTitles);
    }

    public final int hashCode() {
        return this.buttonTitles.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketCustomButtonTypeOpenPresetDto(buttonTitles="), this.buttonTitles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.buttonTitles);
        while (a2.hasNext()) {
            ((MarketCustomButtonTitlesListingDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
