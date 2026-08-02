package com.vk.api.generated.marketIntegrations.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketIntegrationsGetCheckoutUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationsGetCheckoutUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationsGetCheckoutUrlResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: MarketIntegrationsGetCheckoutUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationsGetCheckoutUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGetCheckoutUrlResponseDto createFromParcel(Parcel parcel) {
            return new MarketIntegrationsGetCheckoutUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGetCheckoutUrlResponseDto[] newArray(int i) {
            return new MarketIntegrationsGetCheckoutUrlResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketIntegrationsGetCheckoutUrlResponseDto() {
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
        return (obj instanceof MarketIntegrationsGetCheckoutUrlResponseDto) && epx.f(this.url, ((MarketIntegrationsGetCheckoutUrlResponseDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketIntegrationsGetCheckoutUrlResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public MarketIntegrationsGetCheckoutUrlResponseDto(String str) {
        this.url = str;
    }

    public /* synthetic */ MarketIntegrationsGetCheckoutUrlResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
