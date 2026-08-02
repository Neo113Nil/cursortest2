package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class zzdn extends zzcx {
    private static final Logger zzb = Logger.getLogger(zzdn.class.getName());
    private static final boolean zzc = zzgz.zzx();
    zzdo zza;

    private zzdn() {
        throw null;
    }

    public static int zzA(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int zzB(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i11, zzfm zzfmVar, zzge zzgeVar) {
        int zzA = zzA(i11 << 3);
        return zzA + zzA + ((zzcq) zzfmVar).zzB(zzgeVar);
    }

    public static int zzx(zzfm zzfmVar) {
        int zzF = zzfmVar.zzF();
        return zzA(zzF) + zzF;
    }

    static int zzy(zzfm zzfmVar, zzge zzgeVar) {
        int zzB = ((zzcq) zzfmVar).zzB(zzgeVar);
        return zzA(zzB) + zzB;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzhe.zze(str);
        } catch (zzhd unused) {
            length = str.getBytes(zzep.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(String str, zzhd zzhdVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhdVar);
        byte[] bytes = str.getBytes(zzep.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzdl(e11);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b11) throws IOException;

    public abstract void zzd(int i11, boolean z11) throws IOException;

    public abstract void zze(int i11, zzdf zzdfVar) throws IOException;

    public abstract void zzf(int i11, int i12) throws IOException;

    public abstract void zzg(int i11) throws IOException;

    public abstract void zzh(int i11, long j11) throws IOException;

    public abstract void zzi(long j11) throws IOException;

    public abstract void zzj(int i11, int i12) throws IOException;

    public abstract void zzk(int i11) throws IOException;

    public abstract void zzl(byte[] bArr, int i11, int i12) throws IOException;

    abstract void zzm(int i11, zzfm zzfmVar, zzge zzgeVar) throws IOException;

    public abstract void zzn(int i11, zzfm zzfmVar) throws IOException;

    public abstract void zzo(int i11, zzdf zzdfVar) throws IOException;

    public abstract void zzp(int i11, String str) throws IOException;

    public abstract void zzr(int i11, int i12) throws IOException;

    public abstract void zzs(int i11, int i12) throws IOException;

    public abstract void zzt(int i11) throws IOException;

    public abstract void zzu(int i11, long j11) throws IOException;

    public abstract void zzv(long j11) throws IOException;

    /* synthetic */ zzdn(zzdm zzdmVar) {
    }
}
