package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.List;

/* loaded from: classes9.dex */
final class zzdo implements zzhh {
    private final zzdn zza;

    private zzdo(zzdn zzdnVar) {
        byte[] bArr = zzep.zzb;
        this.zza = zzdnVar;
        zzdnVar.zza = this;
    }

    public static zzdo zza(zzdn zzdnVar) {
        zzdo zzdoVar = zzdnVar.zza;
        return zzdoVar != null ? zzdoVar : new zzdo(zzdnVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzA(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzfb)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.size()) {
                this.zza.zzh(i11, zzfbVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.size(); i16++) {
            zzfbVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzB(int i11, int i12) throws IOException {
        this.zza.zzs(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzC(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    int intValue = ((Integer) list.get(i12)).intValue();
                    zzdnVar.zzs(i11, (intValue >> 31) ^ (intValue + intValue));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue2 = ((Integer) list.get(i14)).intValue();
                i13 += zzdn.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i12)).intValue();
                zzdnVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                zzdn zzdnVar3 = this.zza;
                int zze = zzeiVar.zze(i12);
                zzdnVar3.zzs(i11, (zze >> 31) ^ (zze + zze));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            int zze2 = zzeiVar.zze(i16);
            i15 += zzdn.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            zzdn zzdnVar4 = this.zza;
            int zze3 = zzeiVar.zze(i12);
            zzdnVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzD(int i11, long j11) throws IOException {
        this.zza.zzu(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzE(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzfb)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    long longValue = ((Long) list.get(i12)).longValue();
                    zzdnVar.zzu(i11, (longValue >> 63) ^ (longValue + longValue));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue2 = ((Long) list.get(i14)).longValue();
                i13 += zzdn.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                long longValue3 = ((Long) list.get(i12)).longValue();
                zzdnVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.size()) {
                zzdn zzdnVar3 = this.zza;
                long zze = zzfbVar.zze(i12);
                zzdnVar3.zzu(i11, (zze >> 63) ^ (zze + zze));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.size(); i16++) {
            long zze2 = zzfbVar.zze(i16);
            i15 += zzdn.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzt(i15);
        while (i12 < zzfbVar.size()) {
            zzdn zzdnVar4 = this.zza;
            long zze3 = zzfbVar.zze(i12);
            zzdnVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzF(int i11) throws IOException {
        this.zza.zzr(i11, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzG(int i11, String str) throws IOException {
        this.zza.zzp(i11, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzH(int i11, List list) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzey)) {
            while (i12 < list.size()) {
                this.zza.zzp(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zzey zzeyVar = (zzey) list;
        while (i12 < list.size()) {
            Object zza = zzeyVar.zza();
            if (zza instanceof String) {
                this.zza.zzp(i11, (String) zza);
            } else {
                this.zza.zze(i11, (zzdf) zza);
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzI(int i11, int i12) throws IOException {
        this.zza.zzs(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzJ(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzs(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzdn.zzA(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzt(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                this.zza.zzs(i11, zzeiVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            i15 += zzdn.zzA(zzeiVar.zze(i16));
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            this.zza.zzt(zzeiVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzK(int i11, long j11) throws IOException {
        this.zza.zzu(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzL(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzfb)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzu(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzdn.zzB(((Long) list.get(i14)).longValue());
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzv(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.size()) {
                this.zza.zzu(i11, zzfbVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.size(); i16++) {
            i15 += zzdn.zzB(zzfbVar.zze(i16));
        }
        this.zza.zzt(i15);
        while (i12 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzb(int i11, boolean z11) throws IOException {
        this.zza.zzd(i11, z11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzc(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzcw)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zzcw zzcwVar = (zzcw) list;
        if (!z11) {
            while (i12 < zzcwVar.size()) {
                this.zza.zzd(i11, zzcwVar.zzf(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzcwVar.size(); i16++) {
            zzcwVar.zzf(i16);
            i15++;
        }
        this.zza.zzt(i15);
        while (i12 < zzcwVar.size()) {
            this.zza.zzb(zzcwVar.zzf(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzd(int i11, zzdf zzdfVar) throws IOException {
        this.zza.zze(i11, zzdfVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zze(int i11, List list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zza.zze(i11, (zzdf) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzf(int i11, double d11) throws IOException {
        this.zza.zzh(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzg(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzdp)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zzdp zzdpVar = (zzdp) list;
        if (!z11) {
            while (i12 < zzdpVar.size()) {
                this.zza.zzh(i11, Double.doubleToRawLongBits(zzdpVar.zze(i12)));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzdpVar.size(); i16++) {
            zzdpVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zzdpVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzdpVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzh(int i11) throws IOException {
        this.zza.zzr(i11, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzi(int i11, int i12) throws IOException {
        this.zza.zzj(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzj(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzj(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzdn.zzB(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzk(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                this.zza.zzj(i11, zzeiVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            i15 += zzdn.zzB(zzeiVar.zze(i16));
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzk(int i11, int i12) throws IOException {
        this.zza.zzf(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzl(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                this.zza.zzf(i11, zzeiVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            zzeiVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzm(int i11, long j11) throws IOException {
        this.zza.zzh(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzn(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzfb)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.size()) {
                this.zza.zzh(i11, zzfbVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.size(); i16++) {
            zzfbVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzo(int i11, float f7) throws IOException {
        this.zza.zzf(i11, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzp(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzdz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zzdz zzdzVar = (zzdz) list;
        if (!z11) {
            while (i12 < zzdzVar.size()) {
                this.zza.zzf(i11, Float.floatToRawIntBits(zzdzVar.zze(i12)));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzdzVar.size(); i16++) {
            zzdzVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzdzVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzdzVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzq(int i11, Object obj, zzge zzgeVar) throws IOException {
        zzdn zzdnVar = this.zza;
        zzdnVar.zzr(i11, 3);
        zzgeVar.zzi((zzfm) obj, zzdnVar.zza);
        zzdnVar.zzr(i11, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzr(int i11, int i12) throws IOException {
        this.zza.zzj(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzs(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzj(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzdn.zzB(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzk(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                this.zza.zzj(i11, zzeiVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            i15 += zzdn.zzB(zzeiVar.zze(i16));
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzt(int i11, long j11) throws IOException {
        this.zza.zzu(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzu(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzfb)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzu(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzdn.zzB(((Long) list.get(i14)).longValue());
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzv(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.size()) {
                this.zza.zzu(i11, zzfbVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.size(); i16++) {
            i15 += zzdn.zzB(zzfbVar.zze(i16));
        }
        this.zza.zzt(i15);
        while (i12 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzv(int i11, Object obj, zzge zzgeVar) throws IOException {
        this.zza.zzm(i11, (zzfm) obj, zzgeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzw(int i11, Object obj) throws IOException {
        if (obj instanceof zzdf) {
            this.zza.zzo(i11, (zzdf) obj);
        } else {
            this.zza.zzn(i11, (zzfm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzx(int i11, int i12) throws IOException {
        this.zza.zzf(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzy(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzei)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z11) {
            while (i12 < zzeiVar.size()) {
                this.zza.zzf(i11, zzeiVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzeiVar.size(); i16++) {
            zzeiVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzz(int i11, long j11) throws IOException {
        this.zza.zzh(i11, j11);
    }
}
