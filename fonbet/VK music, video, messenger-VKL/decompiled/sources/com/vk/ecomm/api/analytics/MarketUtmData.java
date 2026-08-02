package com.vk.ecomm.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.nr;
import xsna.zcl;

/* compiled from: MarketUtmData.kt */
/* loaded from: classes18.dex */
public final class MarketUtmData implements Parcelable {
    public static final Parcelable.Creator<MarketUtmData> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: MarketUtmData.kt */
    public static final class a implements Parcelable.Creator<MarketUtmData> {
        @Override // android.os.Parcelable.Creator
        public final MarketUtmData createFromParcel(Parcel parcel) {
            return new MarketUtmData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUtmData[] newArray(int i) {
            return new MarketUtmData[i];
        }
    }

    public MarketUtmData(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public /* synthetic */ MarketUtmData(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(num, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
