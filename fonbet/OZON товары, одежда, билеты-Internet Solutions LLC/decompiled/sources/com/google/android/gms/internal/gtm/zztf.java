package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zztf extends zztj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* synthetic */ zztf(byte[] bArr, int i11, int i12, boolean z11, zzte zzteVar) {
        super(null);
        this.zzh = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzb(int i11) throws zzvk {
        int i12 = this.zzh;
        this.zzh = 0;
        int i13 = this.zzf + this.zzg;
        this.zzf = i13;
        if (i13 <= 0) {
            this.zzg = 0;
            return i12;
        }
        this.zzg = i13;
        this.zzf = 0;
        return i12;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzc() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final zztd zzd() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zze() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zzf() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzg(int i11) throws zzvk {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzh(int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzi() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzj() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzk(int i11) throws IOException {
        throw null;
    }
}
