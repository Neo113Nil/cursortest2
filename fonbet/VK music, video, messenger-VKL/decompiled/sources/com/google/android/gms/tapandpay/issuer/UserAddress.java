package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.n501;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new n501();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public String o;
    public String p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.q(parcel, 10, this.j, false);
        ozg0.q(parcel, 11, this.k, false);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.q(parcel, 13, this.m, false);
        boolean z = this.n;
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 15, this.o, false);
        ozg0.q(parcel, 16, this.p, false);
        ozg0.x(w, parcel);
    }
}
