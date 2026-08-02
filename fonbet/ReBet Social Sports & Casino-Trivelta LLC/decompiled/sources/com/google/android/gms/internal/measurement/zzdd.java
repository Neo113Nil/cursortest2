package com.google.android.gms.internal.measurement;

import E9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdd(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.zza;
        int a10 = b.a(parcel);
        b.y(parcel, 1, j10);
        b.y(parcel, 2, this.zzb);
        b.g(parcel, 3, this.zzc);
        b.j(parcel, 7, this.zzd, false);
        b.F(parcel, 8, this.zze, false);
        b.b(parcel, a10);
    }
}
