package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketAvitoLinkStatusDto.kt */
/* loaded from: classes15.dex */
public final class MarketAvitoLinkStatusDto implements Parcelable {
    public static final Parcelable.Creator<MarketAvitoLinkStatusDto> CREATOR = new a();

    @pmi0("status")
    private final Integer status;

    /* compiled from: MarketAvitoLinkStatusDto.kt */
    public static final class a implements Parcelable.Creator<MarketAvitoLinkStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAvitoLinkStatusDto createFromParcel(Parcel parcel) {
            return new MarketAvitoLinkStatusDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAvitoLinkStatusDto[] newArray(int i) {
            return new MarketAvitoLinkStatusDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketAvitoLinkStatusDto() {
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
        return (obj instanceof MarketAvitoLinkStatusDto) && epx.f(this.status, ((MarketAvitoLinkStatusDto) obj).status);
    }

    public final int hashCode() {
        Integer num = this.status;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("MarketAvitoLinkStatusDto(status="), this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MarketAvitoLinkStatusDto(Integer num) {
        this.status = num;
    }

    public /* synthetic */ MarketAvitoLinkStatusDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
