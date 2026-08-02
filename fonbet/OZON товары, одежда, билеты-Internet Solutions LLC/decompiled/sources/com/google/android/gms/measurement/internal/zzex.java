package com.google.android.gms.measurement.internal;

import C.o0;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
final class zzex implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzfa zzf;

    zzex(zzfa zzfaVar, int i11, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzfaVar;
        this.zza = i11;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c11;
        long j11;
        char c12;
        long j12;
        zzfp zzm = this.zzf.zzs.zzm();
        if (!zzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzfa zzfaVar = this.zzf;
        c11 = zzfaVar.zza;
        if (c11 == 0) {
            if (zzfaVar.zzs.zzf().zzy()) {
                zzfa zzfaVar2 = this.zzf;
                zzfaVar2.zzs.zzaw();
                zzfaVar2.zza = 'C';
            } else {
                zzfa zzfaVar3 = this.zzf;
                zzfaVar3.zzs.zzaw();
                zzfaVar3.zza = 'c';
            }
        }
        zzfa zzfaVar4 = this.zzf;
        j11 = zzfaVar4.zzb;
        if (j11 < 0) {
            zzfaVar4.zzs.zzf().zzh();
            zzfaVar4.zzb = 64000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        zzfa zzfaVar5 = this.zzf;
        c12 = zzfaVar5.zza;
        j12 = zzfaVar5.zzb;
        String zzo = zzfa.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb2 = new StringBuilder("2");
        sb2.append(charAt);
        sb2.append(c12);
        sb2.append(j12);
        String c13 = o0.c(sb2, ProductContainerDTO.RATIO_DELIMITER, zzo);
        if (c13.length() > 1024) {
            c13 = this.zzb.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
        }
        zzfn zzfnVar = zzm.zzb;
        if (zzfnVar != null) {
            zzfnVar.zzb(c13, 1L);
        }
    }
}
