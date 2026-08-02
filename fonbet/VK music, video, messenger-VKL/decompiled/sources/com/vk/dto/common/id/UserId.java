package com.vk.dto.common.id;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.a9y;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.u9y;
import xsna.uay;
import xsna.z8y;

/* compiled from: UserId.kt */
/* loaded from: classes.dex */
public final class UserId implements Parcelable {
    public final long b;
    public static final b c = new b();
    public static final UserId d = new UserId(0);
    public static final Parcelable.Creator<UserId> CREATOR = new a();

    /* compiled from: UserId.kt */
    public static final class GsonSerializer implements uay<UserId>, a9y<UserId> {
        public final boolean a;

        public GsonSerializer() {
            this(false);
        }

        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            if (b9yVar instanceof u9y) {
                return null;
            }
            long j = b9yVar.j();
            if (!this.a) {
                return new UserId(j);
            }
            boolean z = j < 0;
            long abs = Math.abs(j);
            if (abs < 2147483647L) {
                throw new IllegalStateException("abs of owner id should be >= MAX_INT");
            }
            long j2 = abs - Integer.MAX_VALUE;
            if (z) {
                j2 = -j2;
            }
            return new UserId(j2);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            long j = ((UserId) obj).b;
            if (this.a) {
                j = j < 0 ? j - Integer.MAX_VALUE : j + Integer.MAX_VALUE;
            }
            return new hay(Long.valueOf(j));
        }

        public GsonSerializer(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: UserId.kt */
    public static final class a implements Parcelable.Creator<UserId> {
        @Override // android.os.Parcelable.Creator
        public final UserId createFromParcel(Parcel parcel) {
            return new UserId(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserId[] newArray(int i) {
            return new UserId[i];
        }
    }

    /* compiled from: UserId.kt */
    public static final class b {
    }

    public UserId(long j) {
        this.b = j;
    }

    public static UserId a(UserId userId) {
        long j = userId.b;
        userId.getClass();
        return new UserId(j);
    }

    public final long d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserId) && this.b == ((UserId) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }

    public UserId(Parcel parcel) {
        this(parcel.readLong());
    }
}
