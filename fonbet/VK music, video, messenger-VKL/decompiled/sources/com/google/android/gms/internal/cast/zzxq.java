package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzxq implements zzaar {
    private final zzxp zza;

    private zzxq(zzxp zzxpVar) {
        byte[] bArr = zzym.zzb;
        this.zza = zzxpVar;
        zzxpVar.zza = this;
    }

    public static zzxq zza(zzxp zzxpVar) {
        Object obj = zzxpVar.zza;
        return obj != null ? (zzxq) obj : new zzxq(zzxpVar);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzxr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzr(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzxr zzxrVar = (zzxr) list;
        if (!z) {
            while (i2 < zzxrVar.size()) {
                this.zza.zzg(i, Double.doubleToRawLongBits(zzxrVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzxrVar.size(); i6++) {
            zzxrVar.zze(i6);
            i5 += 8;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzxrVar.size()) {
            zzxpVar2.zzr(Double.doubleToRawLongBits(zzxrVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.zzw(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                this.zza.zzc(i, zzyeVar.zzg(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            i5 += zzxp.zzw(zzyeVar.zzg(i6));
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyeVar.size()) {
            zzxpVar2.zzn(zzyeVar.zzg(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzxc)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzm(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzxc zzxcVar = (zzxc) list;
        if (!z) {
            while (i2 < zzxcVar.size()) {
                this.zza.zzh(i, zzxcVar.zze(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzxcVar.size(); i6++) {
            zzxcVar.zze(i6);
            i5++;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzxcVar.size()) {
            zzxpVar2.zzm(zzxcVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzD(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyu)) {
            while (i2 < list.size()) {
                this.zza.zzi(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzyu zzyuVar = (zzyu) list;
        while (i2 < list.size()) {
            Object zza = zzyuVar.zza();
            if (zza instanceof String) {
                this.zza.zzi(i, (String) zza);
            } else {
                this.zza.zzj(i, (zzxk) zza);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzE(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (zzxk) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzF(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.zzv(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                this.zza.zzd(i, zzyeVar.zzg(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            i5 += zzxp.zzv(zzyeVar.zzg(i6));
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyeVar.size()) {
            zzxpVar2.zzo(zzyeVar.zzg(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzG(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzp(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                this.zza.zze(i, zzyeVar.zzg(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            zzyeVar.zzg(i6);
            i5 += 4;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyeVar.size()) {
            zzxpVar2.zzp(zzyeVar.zzg(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzr(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzyx zzyxVar = (zzyx) list;
        if (!z) {
            while (i2 < zzyxVar.size()) {
                this.zza.zzg(i, zzyxVar.zze(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyxVar.size(); i6++) {
            zzyxVar.zze(i6);
            i5 += 8;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyxVar.size()) {
            zzxpVar2.zzr(zzyxVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxp zzxpVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzxpVar.zzd(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzxp zzxpVar2 = this.zza;
            zzxpVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzxp.zzv((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzxpVar2.zzo(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzxpVar2.zzo((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                zzxp zzxpVar3 = this.zza;
                int zzg = zzyeVar.zzg(i2);
                zzxpVar3.zzd(i, (zzg >> 31) ^ (zzg + zzg));
                i2++;
            }
            return;
        }
        zzxp zzxpVar4 = this.zza;
        zzxpVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            int zzg2 = zzyeVar.zzg(i6);
            i5 += zzxp.zzv((zzg2 >> 31) ^ (zzg2 + zzg2));
        }
        zzxpVar4.zzo(i5);
        while (i2 < zzyeVar.size()) {
            int zzg3 = zzyeVar.zzg(i2);
            zzxpVar4.zzo((zzg3 >> 31) ^ (zzg3 + zzg3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyx)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxp zzxpVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzxpVar.zzf(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzxp zzxpVar2 = this.zza;
            zzxpVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzxp.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzxpVar2.zzo(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzxpVar2.zzq((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzyx zzyxVar = (zzyx) list;
        if (!z) {
            while (i2 < zzyxVar.size()) {
                zzxp zzxpVar3 = this.zza;
                long zze = zzyxVar.zze(i2);
                zzxpVar3.zzf(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzxp zzxpVar4 = this.zza;
        zzxpVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyxVar.size(); i6++) {
            long zze2 = zzyxVar.zze(i6);
            i5 += zzxp.zzw((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzxpVar4.zzo(i5);
        while (i2 < zzyxVar.size()) {
            long zze3 = zzyxVar.zze(i2);
            zzxpVar4.zzq((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zze(int i, float f) throws IOException {
        this.zza.zze(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzg(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzn(int i, zzxk zzxkVar) throws IOException {
        this.zza.zzj(i, zzxkVar);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzf(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzr(int i, Object obj, zzzs zzzsVar) throws IOException {
        zzxp zzxpVar = this.zza;
        zzwz zzwzVar = (zzwz) obj;
        zzxpVar.zzb(i, 2);
        zzxpVar.zzo(zzwzVar.zzt(zzzsVar));
        zzzsVar.zzf(zzwzVar, this);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzs(int i, Object obj, zzzs zzzsVar) throws IOException {
        zzxp zzxpVar = this.zza;
        zzxpVar.zzb(i, 3);
        zzzsVar.zzf((zzwz) obj, this);
        zzxpVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzt(int i, Object obj) throws IOException {
        if (obj instanceof zzxk) {
            this.zza.zzl(i, (zzxk) obj);
        } else {
            this.zza.zzk(i, (zzzi) obj);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.zzw(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                this.zza.zzc(i, zzyeVar.zzg(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            i5 += zzxp.zzw(zzyeVar.zzg(i6));
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyeVar.size()) {
            zzxpVar2.zzn(zzyeVar.zzg(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzv(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzye)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzp(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzye zzyeVar = (zzye) list;
        if (!z) {
            while (i2 < zzyeVar.size()) {
                this.zza.zze(i, zzyeVar.zzg(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyeVar.size(); i6++) {
            zzyeVar.zzg(i6);
            i5 += 4;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyeVar.size()) {
            zzxpVar2.zzp(zzyeVar.zzg(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.zzw(((Long) list.get(i4)).longValue());
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzyx zzyxVar = (zzyx) list;
        if (!z) {
            while (i2 < zzyxVar.size()) {
                this.zza.zzf(i, zzyxVar.zze(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyxVar.size(); i6++) {
            i5 += zzxp.zzw(zzyxVar.zze(i6));
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyxVar.size()) {
            zzxpVar2.zzq(zzyxVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.zzw(((Long) list.get(i4)).longValue());
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzyx zzyxVar = (zzyx) list;
        if (!z) {
            while (i2 < zzyxVar.size()) {
                this.zza.zzf(i, zzyxVar.zze(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyxVar.size(); i6++) {
            i5 += zzxp.zzw(zzyxVar.zze(i6));
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyxVar.size()) {
            zzxpVar2.zzq(zzyxVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzyx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzr(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzyx zzyxVar = (zzyx) list;
        if (!z) {
            while (i2 < zzyxVar.size()) {
                this.zza.zzg(i, zzyxVar.zze(i2));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzyxVar.size(); i6++) {
            zzyxVar.zze(i6);
            i5 += 8;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzyxVar.size()) {
            zzxpVar2.zzr(zzyxVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzaar
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzxy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzxp zzxpVar = this.zza;
            zzxpVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.zzo(i3);
            while (i2 < list.size()) {
                zzxpVar.zzp(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzxy zzxyVar = (zzxy) list;
        if (!z) {
            while (i2 < zzxyVar.size()) {
                this.zza.zze(i, Float.floatToRawIntBits(zzxyVar.zzg(i2)));
                i2++;
            }
            return;
        }
        zzxp zzxpVar2 = this.zza;
        zzxpVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzxyVar.size(); i6++) {
            zzxyVar.zzg(i6);
            i5 += 4;
        }
        zzxpVar2.zzo(i5);
        while (i2 < zzxyVar.size()) {
            zzxpVar2.zzp(Float.floatToRawIntBits(zzxyVar.zzg(i2)));
            i2++;
        }
    }
}
