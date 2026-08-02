package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a70;
import defpackage.lhk;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new j();
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = lhk.c(calendar);
        this.a = c;
        this.b = c.get(2);
        this.c = c.get(1);
        this.d = c.getMaximum(7);
        this.e = c.getActualMaximum(5);
        this.f = c.getTimeInMillis();
    }

    public static Month b(int i, int i2) {
        Calendar e = lhk.e(null);
        e.set(1, i);
        e.set(2, i2);
        return new Month(e);
    }

    public static Month c(long j) {
        Calendar e = lhk.e(null);
        e.setTimeInMillis(j);
        return new Month(e);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final String d() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        String format = lhk.b("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        this.g = format;
        return format;
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
        return this.b == month.b && this.c == month.c;
    }

    public final int f(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return (month.b - this.b) + ((month.c - this.c) * 12);
        }
        a70.p("Only Gregorian calendars are supported.");
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
