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

/* compiled from: MarketCustomButtonTypeWritePresetDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTypeWritePresetDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTypeWritePresetDto> CREATOR = new a();

    @pmi0("button_titles")
    private final List<MarketCustomButtonTitlesListingDto> buttonTitles;

    @pmi0("recipients")
    private final List<MarketCustomButtonListingDto> recipients;

    /* compiled from: MarketCustomButtonTypeWritePresetDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTypeWritePresetDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeWritePresetDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MarketCustomButtonListingDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(MarketCustomButtonTitlesListingDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new MarketCustomButtonTypeWritePresetDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeWritePresetDto[] newArray(int i) {
            return new MarketCustomButtonTypeWritePresetDto[i];
        }
    }

    public MarketCustomButtonTypeWritePresetDto(List<MarketCustomButtonListingDto> list, List<MarketCustomButtonTitlesListingDto> list2) {
        this.recipients = list;
        this.buttonTitles = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonTypeWritePresetDto)) {
            return false;
        }
        MarketCustomButtonTypeWritePresetDto marketCustomButtonTypeWritePresetDto = (MarketCustomButtonTypeWritePresetDto) obj;
        return epx.f(this.recipients, marketCustomButtonTypeWritePresetDto.recipients) && epx.f(this.buttonTitles, marketCustomButtonTypeWritePresetDto.buttonTitles);
    }

    public final int hashCode() {
        return this.buttonTitles.hashCode() + (this.recipients.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonTypeWritePresetDto(recipients=");
        sb.append(this.recipients);
        sb.append(", buttonTitles=");
        return ms9.a(')', sb, this.buttonTitles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.recipients);
        while (a2.hasNext()) {
            ((MarketCustomButtonListingDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.buttonTitles);
        while (a3.hasNext()) {
            ((MarketCustomButtonTitlesListingDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
