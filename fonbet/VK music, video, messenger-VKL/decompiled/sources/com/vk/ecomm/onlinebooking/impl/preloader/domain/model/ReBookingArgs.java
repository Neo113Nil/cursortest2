package com.vk.ecomm.onlinebooking.impl.preloader.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;

/* compiled from: ReBookingArgs.kt */
/* loaded from: classes18.dex */
public final class ReBookingArgs implements Parcelable {
    public static final Parcelable.Creator<ReBookingArgs> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final List<Integer> d;
    public final String e;

    /* compiled from: ReBookingArgs.kt */
    public static final class a implements Parcelable.Creator<ReBookingArgs> {
        @Override // android.os.Parcelable.Creator
        public final ReBookingArgs createFromParcel(Parcel parcel) {
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new ReBookingArgs(valueOf, valueOf2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReBookingArgs[] newArray(int i) {
            return new ReBookingArgs[i];
        }
    }

    public ReBookingArgs(Integer num, Integer num2, List<Integer> list, String str) {
        this.b = num;
        this.c = num2;
        this.d = list;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReBookingArgs)) {
            return false;
        }
        ReBookingArgs reBookingArgs = (ReBookingArgs) obj;
        return epx.f(this.b, reBookingArgs.b) && epx.f(this.c, reBookingArgs.c) && epx.f(this.d, reBookingArgs.d) && epx.f(this.e, reBookingArgs.e);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        return this.e.hashCode() + fw3.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReBookingArgs(recordId=");
        sb.append(this.b);
        sb.append(", masterId=");
        sb.append(this.c);
        sb.append(", servicesIds=");
        sb.append(this.d);
        sb.append(", recordHash=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.e);
    }
}
