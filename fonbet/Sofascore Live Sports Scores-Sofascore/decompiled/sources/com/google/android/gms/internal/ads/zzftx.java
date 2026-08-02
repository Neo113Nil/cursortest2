package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.blo;
import defpackage.dao;
import defpackage.iao;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftx extends zzfvd {
    @Override // com.google.android.gms.internal.ads.zzfvd
    public final blo h(Context context) {
        zzftx zzftxVar;
        zzbvu zzbvuVar = (zzbvu) this.d.c.get();
        if (zzbvuVar == null) {
            return zzhcy.b(new zzftq());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzr zzd = com.google.android.gms.ads.internal.client.zzr.zzd();
        AtomicReference atomicReference = this.e;
        zzfhk zzfhkVar = (zzfhk) this.a.zzl(objectWrapper, zzd, ((zzfp) atomicReference.get()).zza, zzbvuVar, this.c);
        if (zzfhkVar == null) {
            return zzhcy.b(new zzftq());
        }
        zzhdr r = zzhdr.r();
        try {
            b(((zzfp) atomicReference.get()).zzc);
            zzftp zzftpVar = this.f;
            if (zzftpVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y)).booleanValue()) {
                    zzftxVar = this;
                    zzfhkVar.f.h.set(new zzfua(zzftpVar, this.n, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b0)).longValue(), zzftxVar));
                    zzfp zzfpVar = (zzfp) atomicReference.get();
                    iao iaoVar = new iao(zzftxVar, r);
                    String str = zzfpVar.zza;
                    dao daoVar = new dao();
                    daoVar.a = iaoVar;
                    daoVar.b = str;
                    zzfhkVar.zzI(daoVar);
                    zzfhkVar.zzd(((zzfp) atomicReference.get()).zzc);
                    return r;
                }
            }
            zzftxVar = this;
            zzfp zzfpVar2 = (zzfp) atomicReference.get();
            iao iaoVar2 = new iao(zzftxVar, r);
            String str2 = zzfpVar2.zza;
            dao daoVar2 = new dao();
            daoVar2.a = iaoVar2;
            daoVar2.b = str2;
            zzfhkVar.zzI(daoVar2);
            zzfhkVar.zzd(((zzfp) atomicReference.get()).zzc);
            return r;
        } catch (RemoteException e) {
            zzo.zzj("Failed to load app open ad.", e);
            return zzhcy.b(new zzftq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final long i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((zzbgz) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Failed to get response info for the app open ad.", e);
            return null;
        }
    }
}
