package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketAddAlbumResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketAddAlbumResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketAddAlbumResponseDto> CREATOR = new a();

    @pmi0("albums_count")
    private final Integer albumsCount;

    @pmi0("market_album_id")
    private final Integer marketAlbumId;

    /* compiled from: MarketAddAlbumResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketAddAlbumResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAddAlbumResponseDto createFromParcel(Parcel parcel) {
            return new MarketAddAlbumResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAddAlbumResponseDto[] newArray(int i) {
            return new MarketAddAlbumResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketAddAlbumResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.marketAlbumId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketAddAlbumResponseDto)) {
            return false;
        }
        MarketAddAlbumResponseDto marketAddAlbumResponseDto = (MarketAddAlbumResponseDto) obj;
        return epx.f(this.marketAlbumId, marketAddAlbumResponseDto.marketAlbumId) && epx.f(this.albumsCount, marketAddAlbumResponseDto.albumsCount);
    }

    public final int hashCode() {
        Integer num = this.marketAlbumId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.albumsCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAddAlbumResponseDto(marketAlbumId=");
        sb.append(this.marketAlbumId);
        sb.append(", albumsCount=");
        return uqi.b(sb, this.albumsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.marketAlbumId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.albumsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public MarketAddAlbumResponseDto(Integer num, Integer num2) {
        this.marketAlbumId = num;
        this.albumsCount = num2;
    }

    public /* synthetic */ MarketAddAlbumResponseDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
