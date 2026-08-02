package com.vk.ecomm.market.api.metrics.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;

/* compiled from: MarketPickerTechMetricsSession.kt */
/* loaded from: classes18.dex */
public final class MarketPickerTechMetricsSession implements Parcelable {
    public static final Parcelable.Creator<MarketPickerTechMetricsSession> CREATOR = new a();
    public final Long b;
    public final Long c;

    /* compiled from: MarketPickerTechMetricsSession.kt */
    public static final class a implements Parcelable.Creator<MarketPickerTechMetricsSession> {
        @Override // android.os.Parcelable.Creator
        public final MarketPickerTechMetricsSession createFromParcel(Parcel parcel) {
            return new MarketPickerTechMetricsSession(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPickerTechMetricsSession[] newArray(int i) {
            return new MarketPickerTechMetricsSession[i];
        }
    }

    public MarketPickerTechMetricsSession(Long l, Long l2) {
        this.b = l;
        this.c = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
    }
}
