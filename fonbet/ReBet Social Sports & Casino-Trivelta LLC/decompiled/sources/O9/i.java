package O9;

import N9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class i extends zza implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final N9.b c(N9.b bVar, String str, int i10, N9.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(2, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final N9.b g(N9.b bVar, String str, int i10, N9.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(3, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }
}
