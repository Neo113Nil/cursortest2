package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;

/* compiled from: GameSubscription.kt */
/* loaded from: classes6.dex */
public final class GameSubscription implements Parcelable {
    public static final Parcelable.Creator<GameSubscription> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final Long r;

    /* compiled from: GameSubscription.kt */
    public static final class a implements Parcelable.Creator<GameSubscription> {
        @Override // android.os.Parcelable.Creator
        public final GameSubscription createFromParcel(Parcel parcel) {
            return new GameSubscription(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final GameSubscription[] newArray(int i) {
            return new GameSubscription[i];
        }
    }

    public GameSubscription(int i, String str, String str2, int i2, int i3, long j, long j2, long j3, String str3, String str4, String str5, long j4, long j5, int i4, boolean z, boolean z2, Long l) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = j4;
        this.n = j5;
        this.o = i4;
        this.p = z;
        this.q = z2;
        this.r = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeLong(this.m);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        Long l = this.r;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }
}
