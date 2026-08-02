package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketMarketItemIntegrationInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemIntegrationInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemIntegrationInfoDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    /* compiled from: MarketMarketItemIntegrationInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemIntegrationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemIntegrationInfoDto createFromParcel(Parcel parcel) {
            return new MarketMarketItemIntegrationInfoDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemIntegrationInfoDto[] newArray(int i) {
            return new MarketMarketItemIntegrationInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketItemIntegrationInfoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketMarketItemIntegrationInfoDto) && epx.f(this.title, ((MarketMarketItemIntegrationInfoDto) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketMarketItemIntegrationInfoDto(title="), this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }

    public MarketMarketItemIntegrationInfoDto(String str) {
        this.title = str;
    }

    public /* synthetic */ MarketMarketItemIntegrationInfoDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
