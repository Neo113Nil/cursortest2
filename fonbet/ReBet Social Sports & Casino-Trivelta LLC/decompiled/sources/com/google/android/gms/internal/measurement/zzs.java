package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z10;
        this.zzb = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(zzg zzgVar, List list) {
        int i10;
        int i11;
        zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        int zzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (zzg != 2) {
            i10 = 3;
            if (zzg == 3) {
                i11 = 1;
            } else if (zzg == 5) {
                i11 = 5;
            } else if (zzg == 6) {
                i11 = 2;
            }
            String zzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() != 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i11, zzc, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzao.zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i12)).zzc());
            }
            this.zzc.zzb().zza(i11, zzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i10 = 4;
        i11 = i10;
        String zzc2 = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
