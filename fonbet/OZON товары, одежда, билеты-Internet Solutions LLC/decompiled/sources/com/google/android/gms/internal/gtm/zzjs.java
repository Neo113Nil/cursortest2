package com.google.android.gms.internal.gtm;

import Nh.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzjs extends zzjv {
    private zzib zza = null;
    private final String zzb;
    private final List<String> zzc;
    private final List<zzrf> zzd;

    public zzjs(zzib zzibVar, String str, List<String> list, List<zzrf> list2) {
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
    }

    public final String toString() {
        String str = this.zzb;
        String obj = this.zzc.toString();
        String obj2 = this.zzd.toString();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(obj).length() + String.valueOf(obj2).length());
        a.h(sb2, str, "\n\tparams: ", obj, "\n\t: statements: ");
        sb2.append(obj2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    public final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        try {
            zzib zza = this.zza.zza();
            for (int i11 = 0; i11 < this.zzc.size(); i11++) {
                if (zzqwVarArr.length > i11) {
                    zza.zzc(this.zzc.get(i11), zzqwVarArr[i11]);
                } else {
                    zza.zzc(this.zzc.get(i11), zzra.zze);
                }
            }
            zza.zzc("arguments", new zzrd(Arrays.asList(zzqwVarArr)));
            Iterator<zzrf> it = this.zzd.iterator();
            while (it.hasNext()) {
                zzqw zzd = zzri.zzd(zza, it.next());
                if (zzd instanceof zzra) {
                    zzra zzraVar = (zzra) zzd;
                    if (zzraVar.zzj()) {
                        return zzraVar.zzi();
                    }
                }
            }
        } catch (RuntimeException e11) {
            String str = this.zzb;
            String message = e11.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(message).length());
            sb2.append("Internal error - Function call: ");
            sb2.append(str);
            sb2.append("\n");
            sb2.append(message);
            zzhl.zza(sb2.toString());
        }
        return zzra.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(zzib zzibVar) {
        this.zza = zzibVar;
    }
}
