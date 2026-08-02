package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzapt implements zzapm {
    private final zzaqp zza;
    private long zzf;
    private String zzh;
    private zzahb zzi;
    private zzaps zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final boolean[] zzg = new boolean[3];
    private final zzaqd zzc = new zzaqd(7, 128);
    private final zzaqd zzd = new zzaqd(8, 128);
    private final zzaqd zze = new zzaqd(6, 128);
    private long zzl = C.TIME_UNSET;
    private final zzes zzn = new zzes();

    public zzapt(zzaqp zzaqpVar, boolean z, boolean z2, String str) {
        this.zza = zzaqpVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = C.TIME_UNSET;
        zzgo.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaps zzapsVar = this.zzj;
        if (zzapsVar != null) {
            zzapsVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzh = zzaraVar.zzc();
        this.zzi = zzafsVar.zzu(zzaraVar.zzb(), 2);
        this.zzj = new zzaps(this.zzi, false, false);
        this.zza.zza(zzafsVar, zzaraVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // com.google.android.gms.internal.ads.zzapm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzes zzesVar) {
        int i;
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzfk.zza;
        int zzg = zzesVar.zzg();
        int zze = zzesVar.zze();
        byte[] zzi = zzesVar.zzi();
        this.zzf += zzesVar.zzd();
        this.zzi.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int zzi2 = zzgo.zzi(zzi, zzg, zze, this.zzg);
            if (zzi2 == zze) {
                zzg(zzi, zzg, zze);
                return;
            }
            int i4 = zzi[zzi2 + 3] & Ascii.US;
            if (zzi2 > 0) {
                int i5 = zzi2 - 1;
                if (zzi[i5] == 0) {
                    i2 = 4;
                    i = i5;
                    i3 = i - zzg;
                    if (i3 > 0) {
                        zzg(zzi, zzg, i);
                    }
                    int i6 = zze - i;
                    long j = this.zzf - i6;
                    zzh(j, i6, i3 >= 0 ? -i3 : 0, this.zzl);
                    zzf(j, i4, this.zzl);
                    zzg = i + i2;
                }
            }
            i = zzi2;
            i2 = 3;
            i3 = i - zzg;
            if (i3 > 0) {
            }
            int i62 = zze - i;
            long j2 = this.zzf - i62;
            zzh(j2, i62, i3 >= 0 ? -i3 : 0, this.zzl);
            zzf(j2, i4, this.zzl);
            zzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzfk.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzaqd zzaqdVar = this.zzc;
            zzaqdVar.zze(i2);
            zzaqd zzaqdVar2 = this.zzd;
            zzaqdVar2.zze(i2);
            if (this.zzk) {
                if (zzaqdVar.zzb()) {
                    zzgn zze = zzgo.zze(zzaqdVar.zza, 4, zzaqdVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzaqdVar.zza();
                } else if (zzaqdVar2.zzb()) {
                    this.zzj.zzb(zzgo.zzh(zzaqdVar2.zza, 4, zzaqdVar2.zzb));
                    zzaqdVar2.zza();
                }
            } else if (zzaqdVar.zzb() && zzaqdVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqdVar.zza, zzaqdVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqdVar2.zza, zzaqdVar2.zzb));
                zzgn zze2 = zzgo.zze(zzaqdVar.zza, 4, zzaqdVar.zzb);
                zzgm zzh = zzgo.zzh(zzaqdVar2.zza, 4, zzaqdVar2.zzb);
                String zzb = zzdp.zzb(zze2.zza, zze2.zzb, zze2.zzc);
                zzahb zzahbVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(zzb);
                zztVar.zzv(zze2.zze);
                zztVar.zzw(zze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zze2.zzg);
                zztVar.zzr(arrayList);
                int i3 = zze2.zzm;
                zztVar.zzq(i3);
                zzahbVar.zzA(zztVar.zzO());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzaqdVar.zza();
                zzaqdVar2.zza();
            }
        }
        zzaqd zzaqdVar3 = this.zze;
        if (zzaqdVar3.zze(i2)) {
            int zza = zzgo.zza(zzaqdVar3.zza, zzaqdVar3.zzb);
            zzes zzesVar = this.zzn;
            zzesVar.zzb(zzaqdVar3.zza, zza);
            zzesVar.zzh(4);
            this.zza.zzc(j2, zzesVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
