package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.blo;
import defpackage.gao;
import defpackage.iao;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfuc extends zzfvd {
    @Override // com.google.android.gms.internal.ads.zzfvd
    public final blo h(Context context) {
        zzfuc zzfucVar;
        zzbvu zzbvuVar = (zzbvu) this.d.c.get();
        if (zzbvuVar == null) {
            return zzhcy.b(new zzftq());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzr zzrVar = new com.google.android.gms.ads.internal.client.zzr();
        AtomicReference atomicReference = this.e;
        zzeui zzeuiVar = (zzeui) this.a.zzb(objectWrapper, zzrVar, ((zzfp) atomicReference.get()).zza, zzbvuVar, this.c);
        if (zzeuiVar == null) {
            return zzhcy.b(new zzftq());
        }
        zzhdr r = zzhdr.r();
        try {
            b(((zzfp) atomicReference.get()).zzc);
            zzftp zzftpVar = this.f;
            if (zzftpVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y)).booleanValue()) {
                    zzfucVar = this;
                    zzeuiVar.f.i.set(new zzfua(zzftpVar, this.n, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z)).longValue(), zzfucVar));
                    com.google.android.gms.ads.internal.client.zzm zzmVar = ((zzfp) atomicReference.get()).zzc;
                    iao iaoVar = new iao(zzfucVar, r);
                    String str = ((zzfp) atomicReference.get()).zza;
                    gao gaoVar = new gao();
                    gaoVar.a = zzeuiVar;
                    gaoVar.b = iaoVar;
                    gaoVar.c = str;
                    zzeuiVar.zzP(zzmVar, gaoVar);
                    return r;
                }
            }
            zzfucVar = this;
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = ((zzfp) atomicReference.get()).zzc;
            iao iaoVar2 = new iao(zzfucVar, r);
            String str2 = ((zzfp) atomicReference.get()).zza;
            gao gaoVar2 = new gao();
            gaoVar2.a = zzeuiVar;
            gaoVar2.b = iaoVar2;
            gaoVar2.c = str2;
            zzeuiVar.zzP(zzmVar2, gaoVar2);
            return r;
        } catch (RemoteException e) {
            zzo.zzj("Failed to load interstitial ad.", e);
            return zzhcy.b(new zzftq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final long i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbu) obj).zzs();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }
}
