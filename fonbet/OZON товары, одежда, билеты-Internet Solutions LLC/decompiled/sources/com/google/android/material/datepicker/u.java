package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes9.dex */
final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f58305a;

    /* renamed from: b, reason: collision with root package name */
    final int f58306b;

    /* renamed from: c, reason: collision with root package name */
    final int f58307c;

    /* renamed from: d, reason: collision with root package name */
    final int f58308d;

    /* renamed from: e, reason: collision with root package name */
    final int f58309e;

    /* renamed from: f, reason: collision with root package name */
    final long f58310f;

    /* renamed from: g, reason: collision with root package name */
    private String f58311g;

    final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final u createFromParcel(@NonNull Parcel parcel) {
            return u.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final u[] newArray(int i11) {
            return new u[i11];
        }
    }

    private u(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar b11 = C.b(calendar);
        this.f58305a = b11;
        this.f58306b = b11.get(2);
        this.f58307c = b11.get(1);
        this.f58308d = b11.getMaximum(7);
        this.f58309e = b11.getActualMaximum(5);
        this.f58310f = b11.getTimeInMillis();
    }

    @NonNull
    static u b(int i11, int i12) {
        Calendar d11 = C.d(null);
        d11.set(1, i11);
        d11.set(2, i12);
        return new u(d11);
    }

    @NonNull
    static u c(long j11) {
        Calendar d11 = C.d(null);
        d11.setTimeInMillis(j11);
        return new u(d11);
    }

    @NonNull
    static u d() {
        return new u(C.c());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull u uVar) {
        return this.f58305a.compareTo(uVar.f58305a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final int e() {
        Calendar calendar = this.f58305a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f58308d : firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f58306b == uVar.f58306b && this.f58307c == uVar.f58307c;
    }

    final long f(int i11) {
        Calendar b11 = C.b(this.f58305a);
        b11.set(5, i11);
        return b11.getTimeInMillis();
    }

    final int g(long j11) {
        Calendar b11 = C.b(this.f58305a);
        b11.setTimeInMillis(j11);
        return b11.get(5);
    }

    @NonNull
    final String h() {
        if (this.f58311g == null) {
            this.f58311g = DateUtils.formatDateTime(null, this.f58305a.getTimeInMillis(), 8228);
        }
        return this.f58311g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58306b), Integer.valueOf(this.f58307c)});
    }

    final long i() {
        return this.f58305a.getTimeInMillis();
    }

    @NonNull
    final u j(int i11) {
        Calendar b11 = C.b(this.f58305a);
        b11.add(2, i11);
        return new u(b11);
    }

    final int k(@NonNull u uVar) {
        if (!(this.f58305a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (uVar.f58306b - this.f58306b) + ((uVar.f58307c - this.f58307c) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeInt(this.f58307c);
        parcel.writeInt(this.f58306b);
    }
}
