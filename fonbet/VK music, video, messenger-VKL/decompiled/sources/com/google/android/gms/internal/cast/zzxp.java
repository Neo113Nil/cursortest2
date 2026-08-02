package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzxp extends zzxd {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzaak.zza();
    Object zza;

    private zzxp() {
        throw null;
    }

    public static int zzv(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzw(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzg(int i, long j) throws IOException;

    public abstract void zzh(int i, boolean z) throws IOException;

    public abstract void zzi(int i, String str) throws IOException;

    public abstract void zzj(int i, zzxk zzxkVar) throws IOException;

    public abstract void zzk(int i, zzzi zzziVar) throws IOException;

    public abstract void zzl(int i, zzxk zzxkVar) throws IOException;

    public abstract void zzm(byte b) throws IOException;

    public abstract void zzn(int i) throws IOException;

    public abstract void zzo(int i) throws IOException;

    public abstract void zzp(int i) throws IOException;

    public abstract void zzq(long j) throws IOException;

    public abstract void zzr(long j) throws IOException;

    public abstract int zzu();

    public final void zzx() {
        if (zzu() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public /* synthetic */ zzxp(byte[] bArr) {
    }
}
