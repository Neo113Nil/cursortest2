package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.bq70;
import xsna.co01;
import xsna.ozg0;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new co01();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Context e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = (Context) bq70.g(vnv.a.f(iBinder));
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.h(parcel, 4, new bq70(this.e));
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
