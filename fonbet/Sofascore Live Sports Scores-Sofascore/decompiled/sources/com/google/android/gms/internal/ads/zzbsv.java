package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.c1o;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbsv extends zzbev implements zzbsw {
    public zzbsv() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzdqo zzdqoVar;
        com.google.android.gms.ads.internal.client.zzea zzeaVar = null;
        r5 = null;
        r5 = null;
        zzbms zzbmsVar = null;
        zzbsz zzbszVar = null;
        if (i == 3) {
            zzdux zzduxVar = (zzdux) this;
            Preconditions.e("#008 Must be called on the main UI thread.");
            if (zzduxVar.d) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzeaVar = zzduxVar.b;
            }
            parcel2.writeNoException();
            zzbew.e(parcel2, zzeaVar);
        } else if (i == 4) {
            zzdux zzduxVar2 = (zzdux) this;
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzduxVar2.F4();
            zzdqm zzdqmVar = zzduxVar2.c;
            if (zzdqmVar != null) {
                zzdqmVar.m();
            }
            zzduxVar2.c = null;
            zzduxVar2.a = null;
            zzduxVar2.b = null;
            zzduxVar2.d = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbszVar = queryLocalInterface instanceof zzbsz ? (zzbsz) queryLocalInterface : new zzbsx(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            zzbew.f(parcel);
            ((zzdux) this).E4(S1, zzbszVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            IObjectWrapper j = x5n.j(parcel, parcel);
            Preconditions.e("#008 Must be called on the main UI thread.");
            ((zzdux) this).E4(j, new c1o());
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            zzdux zzduxVar3 = (zzdux) this;
            Preconditions.e("#008 Must be called on the main UI thread.");
            if (zzduxVar3.d) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzdqm zzdqmVar2 = zzduxVar3.c;
                if (zzdqmVar2 != null && (zzdqoVar = zzdqmVar2.F) != null) {
                    synchronized (zzdqoVar) {
                        zzbmsVar = zzdqoVar.a;
                    }
                }
            }
            parcel2.writeNoException();
            zzbew.e(parcel2, zzbmsVar);
        }
        return true;
    }
}
