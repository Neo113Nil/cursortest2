package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketProfileInfoLocationDto.kt */
/* loaded from: classes15.dex */
public final class MarketProfileInfoLocationDto implements Parcelable {
    public static final Parcelable.Creator<MarketProfileInfoLocationDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    /* compiled from: MarketProfileInfoLocationDto.kt */
    public static final class a implements Parcelable.Creator<MarketProfileInfoLocationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoLocationDto createFromParcel(Parcel parcel) {
            return new MarketProfileInfoLocationDto(parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoLocationDto[] newArray(int i) {
            return new MarketProfileInfoLocationDto[i];
        }
    }

    public MarketProfileInfoLocationDto(float f, float f2, String str) {
        this.latitude = f;
        this.longitude = f2;
        this.address = str;
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.latitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProfileInfoLocationDto)) {
            return false;
        }
        MarketProfileInfoLocationDto marketProfileInfoLocationDto = (MarketProfileInfoLocationDto) obj;
        return Float.compare(this.latitude, marketProfileInfoLocationDto.latitude) == 0 && Float.compare(this.longitude, marketProfileInfoLocationDto.longitude) == 0 && epx.f(this.address, marketProfileInfoLocationDto.address);
    }

    public final float f() {
        return this.longitude;
    }

    public final int hashCode() {
        int a2 = b.a(this.longitude, Float.hashCode(this.latitude) * 31, 31);
        String str = this.address;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProfileInfoLocationDto(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", address=");
        return ho8.a(sb, this.address, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
        parcel.writeString(this.address);
    }

    public /* synthetic */ MarketProfileInfoLocationDto(float f, float f2, String str, int i, zcl zclVar) {
        this(f, f2, (i & 4) != 0 ? null : str);
    }
}
