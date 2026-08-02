package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    public final String a;
    public final zzbf b;
    public final String c;
    public final long d;
    public final long e;

    public zzbh(zzbh zzbhVar, long j, long j2) {
        Preconditions.i(zzbhVar);
        this.a = zzbhVar.a;
        this.b = zzbhVar.b;
        this.c = zzbhVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        bf3.v(sb, "origin=", str, ",name=", str2);
        return mz1.o(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzbi.a(this, parcel, i);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j, long j2) {
        this.a = str;
        this.b = zzbfVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
