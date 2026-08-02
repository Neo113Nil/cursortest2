package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes9.dex */
abstract class zzxo<T, B> {
    zzxo() {
    }

    abstract int zza(T t2);

    abstract int zzb(T t2);

    abstract B zzc(Object obj);

    abstract T zzd(Object obj);

    abstract T zze(T t2, T t11);

    abstract B zzf();

    abstract T zzg(B b11);

    abstract void zzh(B b11, int i11, int i12);

    abstract void zzi(B b11, int i11, long j11);

    abstract void zzj(B b11, int i11, T t2);

    abstract void zzk(B b11, int i11, zztd zztdVar);

    abstract void zzl(B b11, int i11, long j11);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, B b11);

    abstract void zzo(Object obj, T t2);

    final boolean zzp(B b11, zzww zzwwVar) throws IOException {
        int zzd = zzwwVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzl(b11, i11, zzwwVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zzi(b11, i11, zzwwVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zzk(b11, i11, zzwwVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw zzvk.zza();
            }
            zzh(b11, i11, zzwwVar.zzf());
            return true;
        }
        B zzf = zzf();
        int i13 = 4 | (i11 << 3);
        while (zzwwVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzwwVar)) {
        }
        if (i13 != zzwwVar.zzd()) {
            throw zzvk.zzb();
        }
        zzg(zzf);
        zzj(b11, i11, zzf);
        return true;
    }

    abstract boolean zzq(zzww zzwwVar);

    abstract void zzr(T t2, zztp zztpVar) throws IOException;

    abstract void zzs(T t2, zztp zztpVar) throws IOException;
}
