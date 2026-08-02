package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbmr extends zzbev implements zzbms {
    public zzbmr() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzboa zzboaVar;
        switch (i) {
            case 2:
                float zze = ((zzdpz) this).zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                ((zzdpz) this).b = x5n.j(parcel, parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzg = ((zzdpz) this).zzg();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzg);
                return true;
            case 5:
                float zzh = ((zzdpz) this).zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 6:
                float zzi = ((zzdpz) this).zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(zzi);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea r = ((zzdpz) this).a.r();
                parcel2.writeNoException();
                zzbew.e(parcel2, r);
                return true;
            case 8:
                boolean zzk = ((zzdpz) this).zzk();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzboaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzboaVar = queryLocalInterface instanceof zzboa ? (zzboa) queryLocalInterface : new zzboa(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                zzbew.f(parcel);
                zzdqr zzdqrVar = ((zzdpz) this).a;
                if (zzdqrVar.r() instanceof zzcms) {
                    zzcms zzcmsVar = (zzcms) zzdqrVar.r();
                    synchronized (zzcmsVar.b) {
                        zzcmsVar.n = zzboaVar;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzl = ((zzdpz) this).zzl();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
