package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.sq01;
import xsna.yo01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();
    private final int zza;

    @Nullable
    private final IBinder zzb;

    @Nullable
    private final IBinder zzc;

    @Nullable
    private final PendingIntent zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    public zzdb(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, @Nullable PendingIntent pendingIntent, @Nullable String str, @Nullable String str2) {
        this.zza = i;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.zzf = str2;
    }

    public static zzdb zza(PendingIntent pendingIntent, @Nullable String str, @Nullable String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, xsna.yo01] */
    public static zzdb zzb(@Nullable IInterface iInterface, yo01 yo01Var, @Nullable String str, @Nullable String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, yo01Var, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, xsna.sq01] */
    public static zzdb zzc(@Nullable IInterface iInterface, sq01 sq01Var, @Nullable String str, @Nullable String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, sq01Var, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.h(parcel, 2, this.zzb);
        ozg0.h(parcel, 3, this.zzc);
        ozg0.p(parcel, 4, this.zzd, i, false);
        ozg0.q(parcel, 5, this.zze, false);
        ozg0.q(parcel, 6, this.zzf, false);
        ozg0.x(w, parcel);
    }
}
