package com.vk.dzenarticle.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ReadStatState.kt */
/* loaded from: classes18.dex */
public final class ReadStatState implements Parcelable {
    public static final Parcelable.Creator<ReadStatState> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: ReadStatState.kt */
    public static final class a implements Parcelable.Creator<ReadStatState> {
        @Override // android.os.Parcelable.Creator
        public final ReadStatState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            long readLong = parcel.readLong();
            boolean z5 = false;
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (parcel.readInt() != 0) {
                z3 = z4;
            }
            return new ReadStatState(readLong, z7, z5, z6, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final ReadStatState[] newArray(int i) {
            return new ReadStatState[i];
        }
    }

    public ReadStatState() {
        this(0L, false, false, false, false, false, false, 127, null);
    }

    public static ReadStatState a(ReadStatState readStatState, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            j = readStatState.b;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = readStatState.c;
        }
        boolean z7 = z;
        if ((i & 4) != 0) {
            z2 = readStatState.d;
        }
        boolean z8 = z2;
        if ((i & 8) != 0) {
            z3 = readStatState.e;
        }
        boolean z9 = z3;
        if ((i & 16) != 0) {
            z4 = readStatState.f;
        }
        boolean z10 = z4;
        boolean z11 = (i & 32) != 0 ? readStatState.g : z5;
        boolean z12 = (i & 64) != 0 ? readStatState.h : z6;
        readStatState.getClass();
        return new ReadStatState(j2, z7, z8, z9, z10, z11, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadStatState)) {
            return false;
        }
        ReadStatState readStatState = (ReadStatState) obj;
        return this.b == readStatState.b && this.c == readStatState.c && this.d == readStatState.d && this.e == readStatState.e && this.f == readStatState.f && this.g == readStatState.g && this.h == readStatState.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadStatState(lastStartReadTimestamp=");
        sb.append(this.b);
        sb.append(", sentEventScrolled1=");
        sb.append(this.c);
        sb.append(", sentEventScrolled25=");
        sb.append(this.d);
        sb.append(", sentEventScrolled50=");
        sb.append(this.e);
        sb.append(", sentEventScrolled75=");
        sb.append(this.f);
        sb.append(", sentEventScrolled99=");
        sb.append(this.g);
        sb.append(", sentEventScrolled100=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public ReadStatState(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public /* synthetic */ ReadStatState(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6);
    }
}
