package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzfns extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfns> CREATOR = new zzfnt();
    public final Context a;
    public final int b;
    public final zzfnp c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;

    public zzfns(Context context, zzfnp zzfnpVar, int i, int i2, int i3, String str, String str2) {
        zzfnp.values();
        this.a = context;
        this.b = zzfnpVar.ordinal();
        this.c = zzfnpVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.j = i4;
        this.h = i4 - 1;
        this.i = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.m(parcel, 5, this.g, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.t(parcel, s);
    }

    public zzfns(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        zzfnp[] values = zzfnp.values();
        this.a = null;
        this.b = i;
        this.c = values[i];
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = i5;
        this.j = new int[]{1, 2, 3}[i5];
        this.i = i6;
        int i7 = new int[]{1}[i6];
    }
}
