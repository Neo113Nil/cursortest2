package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzna)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z10) {
            while (i11 < zznaVar.size()) {
                this.zza.zzf(i10, zznaVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zznaVar.size(); i15++) {
            zznaVar.zzc(i15);
            i14 += 8;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzly)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z10) {
            while (i11 < zzlyVar.size()) {
                this.zza.zzd(i10, Float.floatToRawIntBits(zzlyVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlyVar.size(); i15++) {
            zzlyVar.zze(i15);
            i14 += 4;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlo)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z10) {
            while (i11 < zzloVar.size()) {
                this.zza.zzf(i10, Double.doubleToRawLongBits(zzloVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzloVar.size(); i15++) {
            zzloVar.zze(i15);
            i14 += 8;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzlm.zzA(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                this.zza.zzb(i10, zzmgVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            i14 += zzlm.zzA(zzmgVar.zzf(i15));
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzky)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z10) {
            while (i11 < zzkyVar.size()) {
                this.zza.zzg(i10, zzkyVar.zze(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkyVar.size(); i15++) {
            zzkyVar.zze(i15);
            i14++;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof zzmx)) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i11 < list.size()) {
            Object zzc = zzmxVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzh(i10, (String) zzc);
            } else {
                this.zza.zzi(i10, (zzlh) zzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzi(i10, (zzlh) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzc(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzlm.zzz(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                this.zza.zzc(i10, zzmgVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            i14 += zzlm.zzz(zzmgVar.zzf(i15));
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                this.zza.zzd(i10, zzmgVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            zzmgVar.zzf(i15);
            i14 += 4;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzna)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z10) {
            while (i11 < zznaVar.size()) {
                this.zza.zzf(i10, zznaVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zznaVar.size(); i15++) {
            zznaVar.zzc(i15);
            i14 += 8;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int intValue = ((Integer) list.get(i11)).intValue();
                    zzlmVar.zzc(i10, (intValue >> 31) ^ (intValue + intValue));
                    i11++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue2 = ((Integer) list.get(i13)).intValue();
                i12 += zzlm.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzlmVar2.zzr(i12);
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzlmVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int zzf = zzmgVar.zzf(i11);
                zzlmVar3.zzc(i10, (zzf >> 31) ^ (zzf + zzf));
                i11++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            int zzf2 = zzmgVar.zzf(i15);
            i14 += zzlm.zzz((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzlmVar4.zzr(i14);
        while (i11 < zzmgVar.size()) {
            int zzf3 = zzmgVar.zzf(i11);
            zzlmVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzna)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long longValue = ((Long) list.get(i11)).longValue();
                    zzlmVar.zze(i10, (longValue >> 63) ^ (longValue + longValue));
                    i11++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue2 = ((Long) list.get(i13)).longValue();
                i12 += zzlm.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzlmVar2.zzr(i12);
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzlmVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z10) {
            while (i11 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long zzc = zznaVar.zzc(i11);
                zzlmVar3.zze(i10, (zzc >> 63) ^ (zzc + zzc));
                i11++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zznaVar.size(); i15++) {
            long zzc2 = zznaVar.zzc(i15);
            i14 += zzlm.zzA((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzlmVar4.zzr(i14);
        while (i11 < zznaVar.size()) {
            long zzc3 = zznaVar.zzc(i11);
            zzlmVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i10, zzne zzneVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i10, long j10) {
        this.zza.zze(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i10, float f10) {
        this.zza.zzd(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i10, double d10) {
        this.zza.zzf(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i10, long j10) {
        this.zza.zze(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i10, boolean z10) {
        this.zza.zzg(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i10, String str) {
        this.zza.zzh(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i10, zzlh zzlhVar) {
        this.zza.zzi(i10, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i10, int i11) {
        this.zza.zzc(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i10, int i11) {
        this.zza.zzc(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i10, long j10) {
        this.zza.zze(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i10, Object obj, zznx zznxVar) {
        this.zza.zzl(i10, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i10, Object obj, zznx zznxVar) {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i10, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i10) {
        this.zza.zza(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i10) {
        this.zza.zza(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i10, Object obj) {
        if (obj instanceof zzlh) {
            this.zza.zzn(i10, (zzlh) obj);
        } else {
            this.zza.zzm(i10, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzlm.zzA(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                this.zza.zzb(i10, zzmgVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            i14 += zzlm.zzA(zzmgVar.zzf(i15));
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzmg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z10) {
            while (i11 < zzmgVar.size()) {
                this.zza.zzd(i10, zzmgVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzmgVar.size(); i15++) {
            zzmgVar.zzf(i15);
            i14 += 4;
        }
        zzlmVar2.zzr(i14);
        while (i11 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzna)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzlm.zzA(((Long) list.get(i13)).longValue());
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z10) {
            while (i11 < zznaVar.size()) {
                this.zza.zze(i10, zznaVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zznaVar.size(); i15++) {
            i14 += zzlm.zzA(zznaVar.zzc(i15));
        }
        zzlmVar2.zzr(i14);
        while (i11 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzna)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzlm.zzA(((Long) list.get(i13)).longValue());
            }
            zzlmVar.zzr(i12);
            while (i11 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z10) {
            while (i11 < zznaVar.size()) {
                this.zza.zze(i10, zznaVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zznaVar.size(); i15++) {
            i14 += zzlm.zzA(zznaVar.zzc(i15));
        }
        zzlmVar2.zzr(i14);
        while (i11 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i11));
            i11++;
        }
    }
}
