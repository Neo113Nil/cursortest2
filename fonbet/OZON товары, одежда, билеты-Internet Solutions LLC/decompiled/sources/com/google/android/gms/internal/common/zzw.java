package com.google.android.gms.internal.common;

/* loaded from: classes9.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    protected zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z11;
        zzoVar = zzxVar.zza;
        this.zzc = zzoVar;
        z11 = zzxVar.zzb;
        this.zzd = z11;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r5.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r1 = r5.zzb.length();
        r5.zze = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r1 <= r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r5.zzb.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return r5.zzb.subSequence(r0, r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r5.zzf = r3 - 1;
     */
    @Override // com.google.android.gms.internal.common.zzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i11 = this.zze;
        while (true) {
            int i12 = this.zze;
            if (i12 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i12);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zze = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zze = zzc;
            }
            if (zzc == i11) {
                int i13 = zzc + 1;
                this.zze = i13;
                if (i13 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i11 < zzd) {
                    this.zzb.charAt(i11);
                }
                if (i11 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                if (!this.zzd || i11 != zzd) {
                    break;
                }
                i11 = this.zze;
            }
        }
    }

    abstract int zzc(int i11);

    abstract int zzd(int i11);
}
