package com.vk.posting.data;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;

/* compiled from: PickerTechMetricsSession.kt */
/* loaded from: classes2.dex */
public final class PickerTechMetricsSession implements Parcelable {
    public static final Parcelable.Creator<PickerTechMetricsSession> CREATOR = new a();
    public final Long b;
    public final Long c;

    /* compiled from: PickerTechMetricsSession.kt */
    public static final class a implements Parcelable.Creator<PickerTechMetricsSession> {
        @Override // android.os.Parcelable.Creator
        public final PickerTechMetricsSession createFromParcel(Parcel parcel) {
            return new PickerTechMetricsSession(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PickerTechMetricsSession[] newArray(int i) {
            return new PickerTechMetricsSession[i];
        }
    }

    public PickerTechMetricsSession(Long l, Long l2) {
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
