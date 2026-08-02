package com.vk.superapp.core.perf;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.qxm0;

/* compiled from: BrowserPerfState.kt */
/* loaded from: classes6.dex */
public final class BrowserPerfState implements Parcelable {
    public static final a CREATOR = new a();
    public final boolean b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public String h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public Integer q;
    public String r;

    /* compiled from: BrowserPerfState.kt */
    public static final class a implements Parcelable.Creator<BrowserPerfState> {
        public static final long a(a aVar) {
            aVar.getClass();
            return System.currentTimeMillis();
        }

        @Override // android.os.Parcelable.Creator
        public final BrowserPerfState createFromParcel(Parcel parcel) {
            return new BrowserPerfState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BrowserPerfState[] newArray(int i) {
            return new BrowserPerfState[i];
        }
    }

    public BrowserPerfState() {
        this.c = a.a(CREATOR);
    }

    public final long B() {
        return this.l;
    }

    public final long C() {
        return this.i;
    }

    public final String D() {
        return this.h;
    }

    public final boolean F() {
        Integer num = this.q;
        return num != null && num.intValue() == 5;
    }

    public final boolean G() {
        return this.b;
    }

    public final boolean K() {
        return this.p;
    }

    public final long d() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.o;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.n;
    }

    public final Integer i() {
        return this.q;
    }

    public final String j() {
        return this.r;
    }

    public final long k() {
        return this.e;
    }

    public final long l() {
        return this.d;
    }

    public final long n() {
        return this.g;
    }

    public final long o() {
        return this.c;
    }

    public final long p() {
        return this.j;
    }

    public final long u() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeLong(this.n);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        Integer num = this.q;
        parcel.writeInt(num != null ? num.intValue() : -1);
        parcel.writeString(this.r);
        parcel.writeLong(this.o);
    }

    public BrowserPerfState(Parcel parcel) {
        this();
        this.b = qxm0.v(parcel);
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.readString();
        this.i = parcel.readLong();
        this.j = parcel.readLong();
        this.k = parcel.readLong();
        this.l = parcel.readLong();
        this.m = parcel.readLong();
        this.n = parcel.readLong();
        this.p = qxm0.v(parcel);
        Integer valueOf = Integer.valueOf(parcel.readInt());
        this.q = valueOf.intValue() == -1 ? null : valueOf;
        this.r = parcel.readString();
        this.o = parcel.readLong();
    }
}
