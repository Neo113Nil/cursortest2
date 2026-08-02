package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4498pe;
import java.util.Arrays;
import java.util.Objects;
import xsna.l2r0;

/* loaded from: classes13.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    @NonNull
    public final Month b;

    @NonNull
    public final Month c;

    @NonNull
    public final DateValidator d;

    @Nullable
    public Month e;
    public final int f;
    public final int g;
    public final int h;

    public interface DateValidator extends Parcelable {
        boolean Z6(long j);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {
        public static final long f = l2r0.a(Month.b(1900, 0).g);
        public static final long g = l2r0.a(Month.b(C4498pe.g, 11).g);
        public Long c;
        public int d;
        public long a = f;
        public long b = g;
        public DateValidator e = new DateValidatorPointForward(Long.MIN_VALUE);

        @NonNull
        public final CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            Month d = Month.d(this.a);
            Month d2 = Month.d(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new CalendarConstraints(d, d2, dateValidator, l == null ? null : Month.d(l.longValue()), this.d);
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.b = month;
        this.c = month2;
        this.e = month3;
        this.f = i;
        this.d = dateValidator;
        if (month3 != null && month.b.compareTo(month3.b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.b.compareTo(month2.b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > l2r0.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.h = month.j(month2) + 1;
        this.g = (month2.d - month.d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.b.equals(calendarConstraints.b) && this.c.equals(calendarConstraints.c) && Objects.equals(this.e, calendarConstraints.e) && this.f == calendarConstraints.f && this.d.equals(calendarConstraints.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.e, Integer.valueOf(this.f), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.f);
    }
}
