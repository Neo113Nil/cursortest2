package com.google.android.gms.internal.auth;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) AbstractC3191o.m(str);
        this.zzc = (byte[]) AbstractC3191o.m(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.zza);
        b.F(parcel, 2, this.zzb, false);
        b.l(parcel, 3, this.zzc, false);
        b.b(parcel, a10);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
