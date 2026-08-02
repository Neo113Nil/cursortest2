package com.vk.attachpicker.base.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;

/* compiled from: AttachPickerTechMetricsSession.kt */
/* loaded from: classes15.dex */
public final class AttachPickerTechMetricsSession implements Parcelable {
    public static final Parcelable.Creator<AttachPickerTechMetricsSession> CREATOR = new a();
    public final Long b;
    public final Long c;

    /* compiled from: AttachPickerTechMetricsSession.kt */
    public static final class a implements Parcelable.Creator<AttachPickerTechMetricsSession> {
        @Override // android.os.Parcelable.Creator
        public final AttachPickerTechMetricsSession createFromParcel(Parcel parcel) {
            return new AttachPickerTechMetricsSession(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AttachPickerTechMetricsSession[] newArray(int i) {
            return new AttachPickerTechMetricsSession[i];
        }
    }

    public AttachPickerTechMetricsSession(Long l, Long l2) {
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
