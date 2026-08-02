package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzicx implements zzigw {
    private final zzicw zza;

    private zzicx(zzicw zzicwVar) {
        zziee.zza(zzicwVar, "output");
        this.zza = zzicwVar;
        zzicwVar.zza = this;
    }

    public static zzicx zza(zzicw zzicwVar) {
        Object obj = zzicwVar.zza;
        return obj != null ? (zzicx) obj : new zzicx(zzicwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (zzicn) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzM(int i, zzieu zzieuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            zzicwVar.zzr(zziev.zzc(zzieuVar, entry.getKey(), entry.getValue()));
            zziev.zzb(zzicwVar, zzieuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zze(int i, float f) throws IOException {
        this.zza.zze(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzg(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzn(int i, zzicn zzicnVar) throws IOException {
        this.zza.zzj(i, zzicnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzf(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzr(int i, Object obj, zzifu zzifuVar) throws IOException {
        zzicw zzicwVar = this.zza;
        zzibw zzibwVar = (zzibw) obj;
        zzicwVar.zzb(i, 2);
        zzicwVar.zzr(zzibwVar.zzaT(zzifuVar));
        zzifuVar.zzf(zzibwVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzs(int i, Object obj, zzifu zzifuVar) throws IOException {
        zzicw zzicwVar = this.zza;
        zzicwVar.zzb(i, 3);
        zzifuVar.zzf((zzibw) obj, this);
        zzicwVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzicn) {
            this.zza.zzn(i, (zzicn) obj);
        } else {
            this.zza.zzm(i, (zzifc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzien)) {
            while (i2 < list.size()) {
                this.zza.zzi(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzien zzienVar = (zzien) list;
        while (i2 < list.size()) {
            Object zzc = zzienVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzi(i, (String) zzc);
            } else {
                this.zza.zzj(i, (zzicn) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzg(i, zzieqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            zzieqVar.zzc(i6);
            i5 += 8;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zzicwVar2.zzu(zzieqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzicw.zzF(((Integer) list.get(i4)).intValue());
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                this.zza.zzd(i, zzidsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            i5 += zzicw.zzF(zzidsVar.zzf(i6));
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidsVar.size()) {
            zzicwVar2.zzr(zzidsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                this.zza.zze(i, zzidsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            zzidsVar.zzf(i6);
            i5 += 4;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidsVar.size()) {
            zzicwVar2.zzs(zzidsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzicw.zzG(((Long) list.get(i4)).longValue());
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzf(i, zzieqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            i5 += zzicw.zzG(zzieqVar.zzc(i6));
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zzicwVar2.zzt(zzieqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzicd zzicdVar = (zzicd) list;
        if (!z) {
            while (i2 < zzicdVar.size()) {
                this.zza.zzh(i, zzicdVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicdVar.size(); i6++) {
            zzicdVar.zzf(i6);
            i5++;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzicdVar.size()) {
            zzicwVar2.zzp(zzicdVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzicw.zzG(((Integer) list.get(i4)).intValue());
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                this.zza.zzc(i, zzidsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            i5 += zzicw.zzG(zzidsVar.zzf(i6));
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidsVar.size()) {
            zzicwVar2.zzq(zzidsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzidi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzidi zzidiVar = (zzidi) list;
        if (!z) {
            while (i2 < zzidiVar.size()) {
                this.zza.zze(i, Float.floatToRawIntBits(zzidiVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidiVar.size(); i6++) {
            zzidiVar.zzf(i6);
            i5 += 4;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidiVar.size()) {
            zzicwVar2.zzs(Float.floatToRawIntBits(zzidiVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzicy zzicyVar = (zzicy) list;
        if (!z) {
            while (i2 < zzicyVar.size()) {
                this.zza.zzg(i, Double.doubleToRawLongBits(zzicyVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicyVar.size(); i6++) {
            zzicyVar.zzf(i6);
            i5 += 8;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzicyVar.size()) {
            zzicwVar2.zzu(Double.doubleToRawLongBits(zzicyVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                this.zza.zze(i, zzidsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            zzidsVar.zzf(i6);
            i5 += 4;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidsVar.size()) {
            zzicwVar2.zzs(zzidsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzg(i, zzieqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            zzieqVar.zzc(i6);
            i5 += 8;
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zzicwVar2.zzu(zzieqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzicw.zzG(((Integer) list.get(i4)).intValue());
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                this.zza.zzc(i, zzidsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            i5 += zzicw.zzG(zzidsVar.zzf(i6));
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzidsVar.size()) {
            zzicwVar2.zzq(zzidsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzids)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzicw zzicwVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzicwVar.zzd(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzicw zzicwVar2 = this.zza;
            zzicwVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzicw.zzF((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzicwVar2.zzr(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzicwVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzids zzidsVar = (zzids) list;
        if (!z) {
            while (i2 < zzidsVar.size()) {
                zzicw zzicwVar3 = this.zza;
                int zzf = zzidsVar.zzf(i2);
                zzicwVar3.zzd(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzicw zzicwVar4 = this.zza;
        zzicwVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidsVar.size(); i6++) {
            int zzf2 = zzidsVar.zzf(i6);
            i5 += zzicw.zzF((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzicwVar4.zzr(i5);
        while (i2 < zzidsVar.size()) {
            int zzf3 = zzidsVar.zzf(i2);
            zzicwVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzicw zzicwVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzicwVar.zzf(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzicw zzicwVar2 = this.zza;
            zzicwVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzicw.zzG((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzicwVar2.zzr(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzicwVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                zzicw zzicwVar3 = this.zza;
                long zzc = zzieqVar.zzc(i2);
                zzicwVar3.zzf(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        zzicw zzicwVar4 = this.zza;
        zzicwVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            long zzc2 = zzieqVar.zzc(i6);
            i5 += zzicw.zzG((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzicwVar4.zzr(i5);
        while (i2 < zzieqVar.size()) {
            long zzc3 = zzieqVar.zzc(i2);
            zzicwVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzicw zzicwVar = this.zza;
            zzicwVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzicw.zzG(((Long) list.get(i4)).longValue());
            }
            zzicwVar.zzr(i3);
            while (i2 < list.size()) {
                zzicwVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzf(i, zzieqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzicw zzicwVar2 = this.zza;
        zzicwVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            i5 += zzicw.zzG(zzieqVar.zzc(i6));
        }
        zzicwVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zzicwVar2.zzt(zzieqVar.zzc(i2));
            i2++;
        }
    }
}
