package O9;

import N9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class h extends zza implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final N9.b L0(N9.b bVar, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final N9.b M0(N9.b bVar, String str, int i10, N9.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(8, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final N9.b c(N9.b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final int g(N9.b bVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final N9.b i(N9.b bVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final int i0(N9.b bVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
