package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zaq();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.m(parcel, 6, this.f, false);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.t(parcel, s);
    }
}
