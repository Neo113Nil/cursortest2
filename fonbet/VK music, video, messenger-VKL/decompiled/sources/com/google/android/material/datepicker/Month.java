package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import xsna.l2r0;

/* loaded from: classes13.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    @NonNull
    public final Calendar b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;

    @Nullable
    public String h;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month createFromParcel(@NonNull Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = l2r0.c(calendar);
        this.b = c;
        this.c = c.get(2);
        this.d = c.get(1);
        this.e = c.getMaximum(7);
        this.f = c.getActualMaximum(5);
        this.g = c.getTimeInMillis();
    }

    @NonNull
    public static Month b(int i, int i2) {
        Calendar e = l2r0.e(null);
        e.set(1, i);
        e.set(2, i2);
        return new Month(e);
    }

    @NonNull
    public static Month d(long j) {
        Calendar e = l2r0.e(null);
        e.setTimeInMillis(j);
        return new Month(e);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull Month month) {
        return this.b.compareTo(month.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.c == month.c && this.d == month.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    @NonNull
    public final String i() {
        if (this.h == null) {
            this.h = l2r0.b("yMMMM", Locale.getDefault()).format(new Date(this.b.getTimeInMillis()));
        }
        return this.h;
    }

    public final int j(@NonNull Month month) {
        if (!(this.b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.c - this.c) + ((month.d - this.d) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
