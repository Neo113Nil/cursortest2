package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.iq;

/* compiled from: PickerTechMetrics.kt */
/* loaded from: classes4.dex */
public final class PickerTechMetrics implements Parcelable {
    public static final Parcelable.Creator<PickerTechMetrics> CREATOR = new a();
    public final long b;
    public final Long c;
    public final Long d;

    /* compiled from: PickerTechMetrics.kt */
    public static final class a implements Parcelable.Creator<PickerTechMetrics> {
        @Override // android.os.Parcelable.Creator
        public final PickerTechMetrics createFromParcel(Parcel parcel) {
            return new PickerTechMetrics(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PickerTechMetrics[] newArray(int i) {
            return new PickerTechMetrics[i];
        }
    }

    public PickerTechMetrics(long j, Long l, Long l2) {
        this.b = j;
        this.c = l;
        this.d = l2;
    }

    public static PickerTechMetrics a(PickerTechMetrics pickerTechMetrics, long j, Long l, Long l2, int i) {
        if ((i & 1) != 0) {
            j = pickerTechMetrics.b;
        }
        if ((i & 2) != 0) {
            l = pickerTechMetrics.c;
        }
        if ((i & 4) != 0) {
            l2 = pickerTechMetrics.d;
        }
        pickerTechMetrics.getClass();
        return new PickerTechMetrics(j, l, l2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickerTechMetrics)) {
            return false;
        }
        PickerTechMetrics pickerTechMetrics = (PickerTechMetrics) obj;
        return this.b == pickerTechMetrics.b && epx.f(this.c, pickerTechMetrics.c) && epx.f(this.d, pickerTechMetrics.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerTechMetrics(startScreenElapsedTime=");
        sb.append(this.b);
        sb.append(", interactiveScreenElapsedTime=");
        sb.append(this.c);
        sb.append(", pickElapsedTime=");
        return iq.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        Long l2 = this.d;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l2);
        }
    }
}
