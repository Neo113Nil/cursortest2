package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzzp extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaae zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[LOOP:1: B:28:0x00fd->B:30:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143 A[EDGE_INSN: B:80:0x0143->B:48:0x0143 BREAK  A[LOOP:3: B:40:0x0124->B:78:0x0140], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzp(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, boolean z, zzgsx zzgsxVar, int i4) {
        super(i, zzbgVar, i2);
        int i5;
        int i6;
        char c;
        boolean z2;
        int i7;
        String[] split;
        int i8;
        int i9;
        int i10;
        int i11;
        zzaae zzaaeVar2;
        boolean z3;
        this.zzh = zzaaeVar;
        int i12 = 1;
        int i13 = true != zzaaeVar.zzT ? 16 : 24;
        boolean z4 = zzaaeVar.zzP;
        this.zzg = zzaaq.zzi(this.zzd.zzd);
        this.zzi = zzmw.zzac(i3, false);
        int i14 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i14 >= zzaaeVar.zzq.size()) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzq.get(i14), false);
                if (i6 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = i6;
        int i15 = this.zzd.zzf;
        int i16 = zzaaeVar.zzs;
        this.zzl = zzaaq.zzm(i15, 0);
        this.zzm = zzaaq.zzn(this.zzd, zzaaeVar.zzr);
        zzv zzvVar = this.zzd;
        int i17 = zzvVar.zzf;
        this.zzn = i17 == 0 || (i17 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c = 2;
                    z2 = (c != 0 || c == 1 || c == 2) ? true : z2;
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            this.zzx = z2;
            this.zzr = zzvVar.zzH;
            this.zzs = zzvVar.zzI;
            this.zzt = zzvVar.zzj;
            int i18 = zzvVar.zzj;
            this.zzf = (i18 != -1 || i18 <= zzaaeVar.zzu) && ((i7 = zzvVar.zzH) == -1 || i7 <= zzaaeVar.zzt) && zzgsxVar.zza(zzvVar);
            String str2 = zzfk.zza;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i8 = 0; i8 < split.length; i8++) {
                split[i8] = zzfk.zzi(split[i8]);
            }
            i9 = 0;
            while (true) {
                if (i9 < split.length) {
                    i10 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i10 = zzaaq.zzj(this.zzd, split[i9], false);
                    if (i10 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.zzo = i9;
            this.zzp = i10;
            i11 = 0;
            while (true) {
                if (i11 >= zzaaeVar.zzv.size()) {
                    break;
                }
                String str3 = this.zzd.zzp;
                if (str3 != null && str3.equals(zzaaeVar.zzv.get(i11))) {
                    i5 = i11;
                    break;
                }
                i11++;
            }
            this.zzu = i5;
            this.zzv = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) != 128;
            this.zzw = (i3 & 64) != 64;
            zzaaeVar2 = this.zzh;
            if (zzmw.zzac(i3, zzaaeVar2.zzV) && ((z3 = this.zzf) || zzaaeVar2.zzO)) {
                int i19 = zzaaeVar2.zzw.zzb;
                if (zzmw.zzac(i3, false) && z3 && this.zzd.zzj != -1) {
                    boolean z5 = zzaaeVar2.zzG;
                    boolean z6 = zzaaeVar2.zzF;
                    if ((!zzaaeVar2.zzX || !z) && (i13 & i3) != 0) {
                        i12 = 2;
                    }
                }
            } else {
                i12 = 0;
            }
            this.zze = i12;
        }
        z2 = false;
        this.zzx = z2;
        this.zzr = zzvVar.zzH;
        this.zzs = zzvVar.zzI;
        this.zzt = zzvVar.zzj;
        int i182 = zzvVar.zzj;
        this.zzf = (i182 != -1 || i182 <= zzaaeVar.zzu) && ((i7 = zzvVar.zzH) == -1 || i7 <= zzaaeVar.zzt) && zzgsxVar.zza(zzvVar);
        String str22 = zzfk.zza;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i8 < split.length) {
        }
        i9 = 0;
        while (true) {
            if (i9 < split.length) {
            }
            i9++;
        }
        this.zzo = i9;
        this.zzp = i10;
        i11 = 0;
        while (true) {
            if (i11 >= zzaaeVar.zzv.size()) {
            }
            i11++;
        }
        this.zzu = i5;
        this.zzv = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) != 128;
        this.zzw = (i3 & 64) != 64;
        zzaaeVar2 = this.zzh;
        if (zzmw.zzac(i3, zzaaeVar2.zzV)) {
            int i192 = zzaaeVar2.zzw.zzb;
            if (zzmw.zzac(i3, false)) {
                boolean z52 = zzaaeVar2.zzG;
                boolean z62 = zzaaeVar2.zzF;
                if (!zzaaeVar2.zzX) {
                }
                i12 = 2;
            }
            this.zze = i12;
        }
        i12 = 0;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzp zzzpVar) {
        zzgxt zzgxtVar;
        zzgxt zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzaaq.zzc;
        } else {
            zzgxtVar = zzaaq.zzc;
            zza = zzgxtVar.zza();
        }
        zzgvm zza2 = zzgvm.zzg().zzd(this.zzi, zzzpVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzpVar.zzk), zzgxt.zzb().zza()).zzb(this.zzj, zzzpVar.zzj).zzb(this.zzl, zzzpVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzpVar.zzm), zzgxt.zzb().zza()).zzd(this.zzq, zzzpVar.zzq).zzd(this.zzn, zzzpVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzpVar.zzo), zzgxt.zzb().zza()).zzb(this.zzp, zzzpVar.zzp).zzd(z, zzzpVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzpVar.zzu), zzgxt.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgvm zza3 = zza2.zzd(this.zzv, zzzpVar.zzv).zzd(this.zzw, zzzpVar.zzw).zzd(this.zzx, zzzpVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzpVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzpVar.zzs), zza);
        if (Objects.equals(this.zzg, zzzpVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzpVar.zzt), zza);
        }
        return zza3.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        String str;
        zzaae zzaaeVar = this.zzh;
        zzzp zzzpVar = (zzzp) zzaaiVar;
        boolean z = zzaaeVar.zzR;
        zzv zzvVar = this.zzd;
        int i = zzvVar.zzH;
        if (i == -1) {
            return false;
        }
        zzv zzvVar2 = zzzpVar.zzd;
        if (i != zzvVar2.zzH || (str = zzvVar.zzp) == null || !TextUtils.equals(str, zzvVar2.zzp)) {
            return false;
        }
        boolean z2 = zzaaeVar.zzQ;
        int i2 = zzvVar.zzI;
        if (i2 == -1 || i2 != zzvVar2.zzI) {
            return false;
        }
        boolean z3 = zzaaeVar.zzS;
        return this.zzv == zzzpVar.zzv && this.zzw == zzzpVar.zzw;
    }
}
