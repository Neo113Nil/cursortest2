package com.vk.superapp.api.dto.market;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MarketTileInfo.kt */
/* loaded from: classes6.dex */
public final class MarketTileInfo implements Parcelable {
    public static final Parcelable.Creator<MarketTileInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: MarketTileInfo.kt */
    public static final class a implements Parcelable.Creator<MarketTileInfo> {
        @Override // android.os.Parcelable.Creator
        public final MarketTileInfo createFromParcel(Parcel parcel) {
            return new MarketTileInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketTileInfo[] newArray(int i) {
            return new MarketTileInfo[i];
        }
    }

    public MarketTileInfo(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static MarketTileInfo a(MarketTileInfo marketTileInfo, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = marketTileInfo.b;
        }
        if ((i & 2) != 0) {
            str2 = marketTileInfo.c;
        }
        if ((i & 4) != 0) {
            str3 = marketTileInfo.d;
        }
        return new MarketTileInfo(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTileInfo)) {
            return false;
        }
        MarketTileInfo marketTileInfo = (MarketTileInfo) obj;
        return epx.f(this.b, marketTileInfo.b) && epx.f(this.c, marketTileInfo.c) && epx.f(this.d, marketTileInfo.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketTileInfo(title=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", oldPrice=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
