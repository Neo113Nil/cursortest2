package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class zzh {
    private long zzA;
    private long zzB;
    private String zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzgk zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private String zzr;
    private Boolean zzs;
    private long zzt;
    private List zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    zzh(zzgk zzgkVar, String str) {
        Preconditions.checkNotNull(zzgkVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgkVar;
        this.zzb = str;
        zzgkVar.zzaz().zzg();
    }

    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    public final String zzB() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    public final List zzC() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    public final void zzD() {
        this.zza.zzaz().zzg();
        this.zzD = false;
    }

    public final void zzE() {
        this.zza.zzaz().zzg();
        long j11 = this.zzg + 1;
        if (j11 > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzfa.zzn(this.zzb));
            j11 = 0;
        }
        this.zzD = true;
        this.zzg = j11;
    }

    public final void zzF(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzg.zza(this.zzr, str);
        this.zzr = str;
    }

    public final void zzG(boolean z11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzq != z11;
        this.zzq = z11;
    }

    public final void zzH(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzp != j11;
        this.zzp = j11;
    }

    public final void zzI(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    public final void zzJ(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    public final void zzK(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    public final void zzL(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzk != j11;
        this.zzk = j11;
    }

    public final void zzM(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzE != j11;
        this.zzE = j11;
    }

    public final void zzN(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzz != j11;
        this.zzz = j11;
    }

    public final void zzO(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzA != j11;
        this.zzA = j11;
    }

    public final void zzP(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzy != j11;
        this.zzy = j11;
    }

    public final void zzQ(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzx != j11;
        this.zzx = j11;
    }

    public final void zzR(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzB != j11;
        this.zzB = j11;
    }

    public final void zzS(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzw != j11;
        this.zzw = j11;
    }

    public final void zzT(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzn != j11;
        this.zzn = j11;
    }

    public final void zzU(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzt != j11;
        this.zzt = j11;
    }

    public final void zzV(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzF != j11;
        this.zzF = j11;
    }

    public final void zzW(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    public final void zzX(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    public final void zzY(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzm != j11;
        this.zzm = j11;
    }

    public final void zzZ(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzC, str);
        this.zzC = str;
    }

    public final long zza() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    public final void zzaa(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzi != j11;
        this.zzi = j11;
    }

    public final void zzab(long j11) {
        Preconditions.checkArgument(j11 >= 0);
        this.zza.zzaz().zzg();
        this.zzD |= this.zzg != j11;
        this.zzg = j11;
    }

    public final void zzac(long j11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzh != j11;
        this.zzh = j11;
    }

    public final void zzad(boolean z11) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzo != z11;
        this.zzo = z11;
    }

    public final void zzae(Boolean bool) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzs, bool);
        this.zzs = bool;
    }

    public final void zzaf(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    public final void zzag(List list) {
        this.zza.zzaz().zzg();
        if (zzg.zza(this.zzu, list)) {
            return;
        }
        this.zzD = true;
        this.zzu = list != null ? new ArrayList(list) : null;
    }

    public final void zzah(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzv, str);
        this.zzv = str;
    }

    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    public final boolean zzaj() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    public final boolean zzak() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }

    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzF;
    }

    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzC;
        zzZ(null);
        return str;
    }

    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }
}
