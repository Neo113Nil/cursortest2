package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzun;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes9.dex */
abstract class zzuk<T extends zzun<T>> {
    zzuk() {
    }

    abstract int zza(Map.Entry<?, ?> entry);

    abstract zzuo<T> zzb(Object obj);

    abstract zzuo<T> zzc(Object obj);

    abstract Object zzd(zzuj zzujVar, zzwk zzwkVar, int i11);

    abstract <UT, UB> UB zze(zzww zzwwVar, Object obj, zzuj zzujVar, zzuo<T> zzuoVar, UB ub2, zzxo<UT, UB> zzxoVar) throws IOException;

    abstract void zzf(Object obj);

    abstract void zzg(zzww zzwwVar, Object obj, zzuj zzujVar, zzuo<T> zzuoVar) throws IOException;

    abstract void zzh(zztd zztdVar, Object obj, zzuj zzujVar, zzuo<T> zzuoVar) throws IOException;

    abstract boolean zzi(zzwk zzwkVar);

    abstract void zzj(zztp zztpVar, Map.Entry<?, ?> entry) throws IOException;
}
