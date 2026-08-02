package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder));
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.f(parcel, 4, new ObjectWrapper(this.d));
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
