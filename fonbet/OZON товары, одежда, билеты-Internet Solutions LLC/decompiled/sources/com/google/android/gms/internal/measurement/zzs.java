package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z11, boolean z12) {
        super("log");
        this.zzc = zztVar;
        this.zza = z11;
        this.zzb = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zza(zzg zzgVar, List list) {
        int i11;
        int i12;
        zzr zzrVar;
        zzr zzrVar2;
        zzr zzrVar3;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar3 = this.zzc.zza;
            zzrVar3.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzap.zzf;
        }
        int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (zzb != 2) {
            i11 = 3;
            if (zzb == 3) {
                i12 = 1;
            } else if (zzb == 5) {
                i12 = 5;
            } else if (zzb == 6) {
                i12 = 2;
            }
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() != 2) {
                zzrVar2 = this.zzc.zza;
                zzrVar2.zza(i12, zzi, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzap.zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 2; i13 < Math.min(list.size(), 5); i13++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i13)).zzi());
            }
            zzrVar = this.zzc.zza;
            zzrVar.zza(i12, zzi, arrayList, this.zza, this.zzb);
            return zzap.zzf;
        }
        i11 = 4;
        i12 = i11;
        String zzi2 = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() != 2) {
        }
    }
}
