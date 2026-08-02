package com.google.android.gms.internal.wallet;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    String[] zza;
    int[] zzb;
    RemoteViews zzc;
    byte[] zzd;

    private zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.G(parcel, 1, this.zza, false);
        b.v(parcel, 2, this.zzb, false);
        b.D(parcel, 3, this.zzc, i10, false);
        b.l(parcel, 4, this.zzd, false);
        b.b(parcel, a10);
    }

    public zzm(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = remoteViews;
        this.zzd = bArr;
    }
}
