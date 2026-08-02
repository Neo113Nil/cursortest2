package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import x0.AbstractC6773b;

/* loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Month f35252a;

    /* renamed from: b, reason: collision with root package name */
    public final Month f35253b;

    /* renamed from: c, reason: collision with root package name */
    public final DateValidator f35254c;

    /* renamed from: d, reason: collision with root package name */
    public Month f35255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35256e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35257f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35258g;

    public interface DateValidator extends Parcelable {
        boolean isValid(long j10);
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    public boolean J(long j10) {
        if (this.f35252a.f(1) > j10) {
            return false;
        }
        Month month = this.f35253b;
        return j10 <= month.f(month.f35279e);
    }

    public void N(Month month) {
        this.f35255d = month;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f35252a.equals(calendarConstraints.f35252a) && this.f35253b.equals(calendarConstraints.f35253b) && AbstractC6773b.a(this.f35255d, calendarConstraints.f35255d) && this.f35256e == calendarConstraints.f35256e && this.f35254c.equals(calendarConstraints.f35254c);
    }

    public Month f(Month month) {
        return month.compareTo(this.f35252a) < 0 ? this.f35252a : month.compareTo(this.f35253b) > 0 ? this.f35253b : month;
    }

    public DateValidator g() {
        return this.f35254c;
    }

    public Month h() {
        return this.f35253b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35252a, this.f35253b, this.f35255d, Integer.valueOf(this.f35256e), this.f35254c});
    }

    public int i() {
        return this.f35256e;
    }

    public int j() {
        return this.f35258g;
    }

    public Month k() {
        return this.f35255d;
    }

    public Month l() {
        return this.f35252a;
    }

    public int m() {
        return this.f35257f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f35252a, 0);
        parcel.writeParcelable(this.f35253b, 0);
        parcel.writeParcelable(this.f35255d, 0);
        parcel.writeParcelable(this.f35254c, 0);
        parcel.writeInt(this.f35256e);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f35252a = month;
        this.f35253b = month2;
        this.f35255d = month3;
        this.f35256e = i10;
        this.f35254c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > w.m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f35258g = month.k(month2) + 1;
        this.f35257f = (month2.f35277c - month.f35277c) + 1;
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f35259f = w.a(Month.b(1900, 0).f35280f);

        /* renamed from: g, reason: collision with root package name */
        public static final long f35260g = w.a(Month.b(2100, 11).f35280f);

        /* renamed from: a, reason: collision with root package name */
        public long f35261a;

        /* renamed from: b, reason: collision with root package name */
        public long f35262b;

        /* renamed from: c, reason: collision with root package name */
        public Long f35263c;

        /* renamed from: d, reason: collision with root package name */
        public int f35264d;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f35265e;

        public b() {
            this.f35261a = f35259f;
            this.f35262b = f35260g;
            this.f35265e = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f35265e);
            Month c10 = Month.c(this.f35261a);
            Month c11 = Month.c(this.f35262b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f35263c;
            return new CalendarConstraints(c10, c11, dateValidator, l10 == null ? null : Month.c(l10.longValue()), this.f35264d, null);
        }

        public b b(int i10) {
            this.f35264d = i10;
            return this;
        }

        public b c(long j10) {
            this.f35263c = Long.valueOf(j10);
            return this;
        }

        public b d(DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f35265e = dateValidator;
            return this;
        }

        public b(CalendarConstraints calendarConstraints) {
            this.f35261a = f35259f;
            this.f35262b = f35260g;
            this.f35265e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f35261a = calendarConstraints.f35252a.f35280f;
            this.f35262b = calendarConstraints.f35253b.f35280f;
            this.f35263c = Long.valueOf(calendarConstraints.f35255d.f35280f);
            this.f35264d = calendarConstraints.f35256e;
            this.f35265e = calendarConstraints.f35254c;
        }
    }
}
