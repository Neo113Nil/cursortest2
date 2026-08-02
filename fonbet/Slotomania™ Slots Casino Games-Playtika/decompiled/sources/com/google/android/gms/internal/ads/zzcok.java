package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcok extends zzfda {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    final zzimr zzi;
    final zzimr zzj;
    final zzimr zzk;
    final zzimr zzl;
    final zzimr zzm;
    final zzimr zzn;
    final zzimr zzo;
    final zzimr zzp;
    final zzimr zzq;
    final zzimr zzr;
    final zzimr zzs;
    final zzimr zzt;
    final zzimr zzu;
    final zzimr zzv;
    final zzimr zzw;
    private final zzfed zzx;
    private final zzcol zzy;

    zzcok(zzcol zzcolVar, zzfed zzfedVar) {
        this.zzy = zzcolVar;
        this.zzx = zzfedVar;
        zzfee zzc = zzfee.zzc(zzfedVar);
        this.zza = zzc;
        this.zzb = zzfdv.zzc(zzcqv.zza, zzfno.zza(), zzc);
        zzcqy zzcqyVar = zzcqx.zza;
        zzimr zzimrVar = zzcolVar.zzc;
        zzimr zzimrVar2 = zzcolVar.zzf;
        this.zzc = zzfec.zzc(zzcqyVar, zzimrVar, zzimrVar2);
        zzfef zzc2 = zzfef.zzc(zzfedVar);
        this.zzd = zzc2;
        zzfeg zzc3 = zzfeg.zzc(zzfedVar);
        this.zze = zzc3;
        zzfeh zzc4 = zzfeh.zzc(zzfedVar);
        this.zzf = zzc4;
        this.zzg = zzfcz.zzc(zzcqz.zza, zzimrVar2, zzimrVar, zzfno.zza(), zzc2, zzc3, zzc4);
        this.zzh = zzfet.zza(zzfno.zza());
        this.zzi = zzfdn.zzc(zzcqt.zza, zzfno.zza(), zzimrVar2);
        zzcqs zzcqsVar = zzcqr.zza;
        zzimr zzimrVar3 = zzcolVar.zzU;
        this.zzj = zzfdj.zzc(zzc, zzcqsVar, zzimrVar3, zzimrVar, zzfno.zza());
        zzfej zzc5 = zzfej.zzc(zzfedVar);
        this.zzk = zzc5;
        this.zzl = zzfep.zzc(zzimrVar3, zzc4, zzcrb.zza, zzfno.zza(), zzc, zzimrVar, zzc5);
        this.zzm = zzimh.zza(zzfpt.zza(zzcolVar.zzG));
        zzfei zzc6 = zzfei.zzc(zzfedVar);
        this.zzn = zzc6;
        zzimr zza = zzimh.zza(zzdxu.zza());
        this.zzo = zza;
        zzimr zza2 = zzimh.zza(zzdxs.zza());
        this.zzp = zza2;
        zzimr zza3 = zzimh.zza(zzdxw.zza());
        this.zzq = zza3;
        zzimr zza4 = zzimh.zza(zzdxy.zza());
        this.zzr = zza4;
        zziml zzc7 = zzimm.zzc(4);
        zzc7.zzb(zzfos.GMS_SIGNALS, zza);
        zzc7.zzb(zzfos.BUILD_URL, zza2);
        zzc7.zzb(zzfos.HTTP, zza3);
        zzc7.zzb(zzfos.PRE_PROCESS, zza4);
        zzimm zzc8 = zzc7.zzc();
        this.zzs = zzc8;
        zzimr zza5 = zzimh.zza(zzdxz.zza(zzc6, zzcolVar.zzf, zzfno.zza(), zzc8));
        this.zzt = zza5;
        zzimt zza6 = zzimu.zza(0, 1);
        zza6.zzb(zza5);
        zzimu zzc9 = zza6.zzc();
        this.zzu = zzc9;
        zzfpb zzc10 = zzfpb.zzc(zzc9);
        this.zzv = zzc10;
        this.zzw = zzimh.zza(zzfpa.zza(zzfno.zza(), zzcolVar.zzc, zzc10));
    }

    final zzfdx zza() {
        zzfed zzfedVar = this.zzx;
        zzbho zza = zzcqp.zza();
        zzhbs zzc = zzfno.zzc();
        List zzd = zzfedVar.zzd();
        zzimq.zzb(zzd);
        return new zzfdx(zza, zzc, zzd);
    }

    final zzfdd zzb() {
        zzfed zzfedVar = this.zzx;
        return new zzfdd(zzcra.zza(), zzfno.zzc(), zzfedVar.zzb(), zzfedVar.zzc(), zzfedVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfcb zzc() {
        zzimr zzimrVar = this.zzb;
        zzcol zzcolVar = this.zzy;
        Context zzd = zzcng.zzd(zzcolVar.zzI());
        zzhbs zzc = zzfno.zzc();
        zzfdt zzb = ((zzfdv) zzimrVar).zzb();
        zzimr zzimrVar2 = zzcolVar.zzc;
        return new zzfcb(zzd, zzc, zzgwj.zzn(new zzfak(zzb, 0L, (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(((zzfec) this.zzc).zzb(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfe)).longValue(), (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(((zzfcz) this.zzg).zzb(), 0L, (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(zzfet.zzc(), 0L, (ScheduledExecutorService) zzimrVar2.zzb()), ((zzfdn) this.zzi).zzb(), zza(), zzb(), (zzfby) zzcolVar.zzbD.zzb(), ((zzfdj) this.zzj).zzb(), ((zzfep) this.zzl).zzb()), (zzfps) this.zzm.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfcb zzd() {
        zzimr zzimrVar = this.zzm;
        zzimr zzimrVar2 = this.zzj;
        zzimr zzimrVar3 = this.zzl;
        zzimr zzimrVar4 = this.zzh;
        zzimr zzimrVar5 = this.zzc;
        zzimr zzimrVar6 = this.zzb;
        zzimr zzimrVar7 = this.zzi;
        zzimr zzimrVar8 = this.zzg;
        zzcol zzcolVar = this.zzy;
        return zzfek.zza(zzcng.zzd(zzcolVar.zzI()), zzcqw.zza(), zzcrc.zza(), zzcolVar.zzbD.zzb(), zzb(), zza(), zzimh.zzc(zzimrVar8), zzimh.zzc(zzimrVar7), zzimh.zzc(zzimrVar6), zzimh.zzc(zzimrVar5), zzimh.zzc(zzimrVar4), zzimh.zzc(zzimrVar3), zzimh.zzc(zzimrVar2), zzfno.zzc(), (zzfps) zzimrVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfoy zze() {
        return (zzfoy) this.zzw.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfps zzf() {
        return (zzfps) this.zzm.zzb();
    }
}
