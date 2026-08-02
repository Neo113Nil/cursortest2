package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.qn01;
import xsna.qp01;
import xsna.sq01;
import xsna.yo01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    private final int zza;

    @Nullable
    private final zzdd zzb;

    @Nullable
    private final sq01 zzc;

    @Nullable
    private final yo01 zzd;

    @Nullable
    private final PendingIntent zze;

    @Nullable
    private final zzk zzf;

    @Nullable
    private final String zzg;

    public zzdf(int i, @Nullable zzdd zzddVar, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, @Nullable PendingIntent pendingIntent, @Nullable IBinder iBinder3, @Nullable String str) {
        this.zza = i;
        this.zzb = zzddVar;
        zzk zzkVar = null;
        this.zzc = iBinder != null ? qp01.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? qn01.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzkVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder3);
        }
        this.zzf = zzkVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 2, this.zzb, i, false);
        sq01 sq01Var = this.zzc;
        ozg0.h(parcel, 3, sq01Var == null ? null : sq01Var.asBinder());
        ozg0.p(parcel, 4, this.zze, i, false);
        yo01 yo01Var = this.zzd;
        ozg0.h(parcel, 5, yo01Var == null ? null : yo01Var.asBinder());
        zzk zzkVar = this.zzf;
        ozg0.h(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null);
        ozg0.q(parcel, 8, this.zzg, false);
        ozg0.x(w, parcel);
    }
}
