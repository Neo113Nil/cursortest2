package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.blo;
import defpackage.iao;
import defpackage.nao;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvi extends zzfvd {
    @Override // com.google.android.gms.internal.ads.zzfvd
    public final blo h(Context context) {
        zzfvi zzfviVar;
        zzbvu zzbvuVar = (zzbvu) this.d.c.get();
        if (zzbvuVar == null) {
            return zzhcy.b(new zzftq());
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        AtomicReference atomicReference = this.e;
        zzfku zzfkuVar = (zzfku) this.a.zzk(objectWrapper, ((zzfp) atomicReference.get()).zza, zzbvuVar, this.c);
        if (zzfkuVar == null) {
            return zzhcy.b(new zzftq());
        }
        zzhdr r = zzhdr.r();
        try {
            b(((zzfp) atomicReference.get()).zzc);
            zzftp zzftpVar = this.f;
            if (zzftpVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y)).booleanValue()) {
                    zzfviVar = this;
                    zzfkuVar.b.i.set(new zzfua(zzftpVar, this.n, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a0)).longValue(), zzfviVar));
                    com.google.android.gms.ads.internal.client.zzm zzmVar = ((zzfp) atomicReference.get()).zzc;
                    iao iaoVar = new iao(zzfviVar, r);
                    String str = ((zzfp) atomicReference.get()).zza;
                    nao naoVar = new nao();
                    naoVar.a = zzfkuVar;
                    naoVar.b = iaoVar;
                    naoVar.c = str;
                    zzfkuVar.zzb(zzmVar, naoVar);
                    return r;
                }
            }
            zzfviVar = this;
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = ((zzfp) atomicReference.get()).zzc;
            iao iaoVar2 = new iao(zzfviVar, r);
            String str2 = ((zzfp) atomicReference.get()).zza;
            nao naoVar2 = new nao();
            naoVar2.a = zzfkuVar;
            naoVar2.b = iaoVar2;
            naoVar2.c = str2;
            zzfkuVar.zzb(zzmVar2, naoVar2);
            return r;
        } catch (RemoteException unused) {
            zzo.zzi("Failed to load rewarded ad.");
            return zzhcy.b(new zzftq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final long i() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((zzcda) obj).zzl();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }
}
