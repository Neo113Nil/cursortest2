package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* loaded from: classes9.dex */
final class zztp {
    private final zzto zza;

    private zztp(zzto zztoVar) {
        zzvi.zzf(zztoVar, "output");
        this.zza = zztoVar;
        zztoVar.zza = this;
    }

    public static zztp zza(zzto zztoVar) {
        zztp zztpVar = zztoVar.zza;
        return zztpVar != null ? zztpVar : new zztp(zztoVar);
    }

    public final void zzA(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzh(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzi(list.get(i12).longValue());
            i12++;
        }
    }

    public final void zzB(int i11, int i12) throws IOException {
        this.zza.zzp(i11, (i12 >> 31) ^ (i12 + i12));
    }

    public final void zzC(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                zzto zztoVar = this.zza;
                int intValue = list.get(i12).intValue();
                zztoVar.zzp(i11, (intValue >> 31) ^ (intValue + intValue));
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int intValue2 = list.get(i14).intValue();
            i13 += zzto.zzD((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            zzto zztoVar2 = this.zza;
            int intValue3 = list.get(i12).intValue();
            zztoVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i12++;
        }
    }

    public final void zzD(int i11, long j11) throws IOException {
        this.zza.zzr(i11, (j11 >> 63) ^ (j11 + j11));
    }

    public final void zzE(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                zzto zztoVar = this.zza;
                long longValue = list.get(i12).longValue();
                zztoVar.zzr(i11, (longValue >> 63) ^ (longValue + longValue));
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            long longValue2 = list.get(i14).longValue();
            i13 += zzto.zzE((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            zzto zztoVar2 = this.zza;
            long longValue3 = list.get(i12).longValue();
            zztoVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i12++;
        }
    }

    public final void zzF(int i11) throws IOException {
        this.zza.zzo(i11, 3);
    }

    public final void zzG(int i11, String str) throws IOException {
        this.zza.zzm(i11, str);
    }

    public final void zzH(int i11, List<String> list) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzvs)) {
            while (i12 < list.size()) {
                this.zza.zzm(i11, list.get(i12));
                i12++;
            }
            return;
        }
        zzvs zzvsVar = (zzvs) list;
        while (i12 < list.size()) {
            Object zzf = zzvsVar.zzf(i12);
            if (zzf instanceof String) {
                this.zza.zzm(i11, (String) zzf);
            } else {
                this.zza.zze(i11, (zztd) zzf);
            }
            i12++;
        }
    }

    public final void zzI(int i11, int i12) throws IOException {
        this.zza.zzp(i11, i12);
    }

    public final void zzJ(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzp(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += zzto.zzD(list.get(i14).intValue());
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzq(list.get(i12).intValue());
            i12++;
        }
    }

    public final void zzK(int i11, long j11) throws IOException {
        this.zza.zzr(i11, j11);
    }

    public final void zzL(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzr(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += zzto.zzE(list.get(i14).longValue());
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzs(list.get(i12).longValue());
            i12++;
        }
    }

    public final void zzb(int i11, boolean z11) throws IOException {
        this.zza.zzd(i11, z11);
    }

    public final void zzc(int i11, List<Boolean> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzd(i11, list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13++;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzb(list.get(i12).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public final void zzd(int i11, zztd zztdVar) throws IOException {
        this.zza.zze(i11, zztdVar);
    }

    public final void zze(int i11, List<zztd> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zza.zze(i11, list.get(i12));
        }
    }

    public final void zzf(int i11, double d11) throws IOException {
        this.zza.zzh(i11, Double.doubleToRawLongBits(d11));
    }

    public final void zzg(int i11, List<Double> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzh(i11, Double.doubleToRawLongBits(list.get(i12).doubleValue()));
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(list.get(i12).doubleValue()));
            i12++;
        }
    }

    public final void zzh(int i11) throws IOException {
        this.zza.zzo(i11, 4);
    }

    public final void zzi(int i11, int i12) throws IOException {
        this.zza.zzj(i11, i12);
    }

    public final void zzj(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzj(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += zzto.zzx(list.get(i14).intValue());
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzk(list.get(i12).intValue());
            i12++;
        }
    }

    public final void zzk(int i11, int i12) throws IOException {
        this.zza.zzf(i11, i12);
    }

    public final void zzl(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzf(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzg(list.get(i12).intValue());
            i12++;
        }
    }

    public final void zzm(int i11, long j11) throws IOException {
        this.zza.zzh(i11, j11);
    }

    public final void zzn(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzh(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzi(list.get(i12).longValue());
            i12++;
        }
    }

    public final void zzo(int i11, float f7) throws IOException {
        this.zza.zzf(i11, Float.floatToRawIntBits(f7));
    }

    public final void zzp(int i11, List<Float> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzf(i11, Float.floatToRawIntBits(list.get(i12).floatValue()));
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(list.get(i12).floatValue()));
            i12++;
        }
    }

    public final void zzq(int i11, Object obj, zzwx zzwxVar) throws IOException {
        zzto zztoVar = this.zza;
        zztoVar.zzo(i11, 3);
        zzwxVar.zzn((zzwk) obj, zztoVar.zza);
        zztoVar.zzo(i11, 4);
    }

    public final void zzr(int i11, int i12) throws IOException {
        this.zza.zzj(i11, i12);
    }

    public final void zzs(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzj(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += zzto.zzx(list.get(i14).intValue());
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzk(list.get(i12).intValue());
            i12++;
        }
    }

    public final void zzt(int i11, long j11) throws IOException {
        this.zza.zzr(i11, j11);
    }

    public final void zzu(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzr(i11, list.get(i12).longValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += zzto.zzE(list.get(i14).longValue());
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzs(list.get(i12).longValue());
            i12++;
        }
    }

    public final void zzv(int i11, Object obj, zzwx zzwxVar) throws IOException {
        zzwk zzwkVar = (zzwk) obj;
        zztl zztlVar = (zztl) this.zza;
        zztlVar.zzq((i11 << 3) | 2);
        zzsh zzshVar = (zzsh) zzwkVar;
        int zzQ = zzshVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzwxVar.zza(zzshVar);
            zzshVar.zzT(zzQ);
        }
        zztlVar.zzq(zzQ);
        zzwxVar.zzn(zzwkVar, zztlVar.zza);
    }

    public final void zzw(int i11, Object obj) throws IOException {
        if (obj instanceof zztd) {
            zztl zztlVar = (zztl) this.zza;
            zztlVar.zzq(11);
            zztlVar.zzp(2, i11);
            zztlVar.zze(3, (zztd) obj);
            zztlVar.zzq(12);
            return;
        }
        zzto zztoVar = this.zza;
        zzwk zzwkVar = (zzwk) obj;
        zztl zztlVar2 = (zztl) zztoVar;
        zztlVar2.zzq(11);
        zztlVar2.zzp(2, i11);
        zztlVar2.zzq(26);
        zztlVar2.zzq(zzwkVar.zzX());
        zzwkVar.zzaq(zztoVar);
        zztlVar2.zzq(12);
    }

    public final void zzx(int i11, int i12) throws IOException {
        this.zza.zzf(i11, i12);
    }

    public final void zzy(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                this.zza.zzf(i11, list.get(i12).intValue());
                i12++;
            }
            return;
        }
        this.zza.zzo(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            list.get(i14).getClass();
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i12 < list.size()) {
            this.zza.zzg(list.get(i12).intValue());
            i12++;
        }
    }

    public final void zzz(int i11, long j11) throws IOException {
        this.zza.zzh(i11, j11);
    }
}
