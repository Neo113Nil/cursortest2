package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class zzto extends zzss {
    private static final Logger zzb = Logger.getLogger(zzto.class.getName());
    private static final boolean zzc = zzxy.zzx();
    zztp zza;

    private zzto() {
    }

    static int zzA(zzwk zzwkVar, zzwx zzwxVar) {
        zzsh zzshVar = (zzsh) zzwkVar;
        int zzQ = zzshVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzwxVar.zza(zzshVar);
            zzshVar.zzT(zzQ);
        }
        return zzD(zzQ) + zzQ;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzyd.zzc(str);
        } catch (zzyc unused) {
            length = str.getBytes(zzvi.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzC(int i11) {
        return zzD(i11 << 3);
    }

    public static int zzD(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzE(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            j11 >>>= 28;
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    public static zzto zzF(byte[] bArr) {
        return new zztl(bArr, 0, bArr.length);
    }

    public static int zzt(byte[] bArr) {
        int length = bArr.length;
        return zzD(length) + length;
    }

    public static int zzu(zztd zztdVar) {
        int zzd = zztdVar.zzd();
        return zzD(zzd) + zzd;
    }

    @Deprecated
    static int zzv(int i11, zzwk zzwkVar, zzwx zzwxVar) {
        int zzD = zzD(i11 << 3);
        int i12 = zzD + zzD;
        zzsh zzshVar = (zzsh) zzwkVar;
        int zzQ = zzshVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzwxVar.zza(zzshVar);
            zzshVar.zzT(zzQ);
        }
        return i12 + zzQ;
    }

    @Deprecated
    public static int zzw(zzwk zzwkVar) {
        return zzwkVar.zzX();
    }

    public static int zzx(int i11) {
        if (i11 >= 0) {
            return zzD(i11);
        }
        return 10;
    }

    public static int zzy(zzvq zzvqVar) {
        int zza = zzvqVar.zza();
        return zzD(zza) + zza;
    }

    public static int zzz(zzwk zzwkVar) {
        int zzX = zzwkVar.zzX();
        return zzD(zzX) + zzX;
    }

    public final void zzG() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzH(String str, zzyc zzycVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzycVar);
        byte[] bytes = str.getBytes(zzvi.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zztm e11) {
            throw e11;
        } catch (IndexOutOfBoundsException e12) {
            throw new zztm(e12);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b11) throws IOException;

    public abstract void zzd(int i11, boolean z11) throws IOException;

    public abstract void zze(int i11, zztd zztdVar) throws IOException;

    public abstract void zzf(int i11, int i12) throws IOException;

    public abstract void zzg(int i11) throws IOException;

    public abstract void zzh(int i11, long j11) throws IOException;

    public abstract void zzi(long j11) throws IOException;

    public abstract void zzj(int i11, int i12) throws IOException;

    public abstract void zzk(int i11) throws IOException;

    public abstract void zzl(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void zzm(int i11, String str) throws IOException;

    public abstract void zzo(int i11, int i12) throws IOException;

    public abstract void zzp(int i11, int i12) throws IOException;

    public abstract void zzq(int i11) throws IOException;

    public abstract void zzr(int i11, long j11) throws IOException;

    public abstract void zzs(long j11) throws IOException;

    /* synthetic */ zzto(zztn zztnVar) {
    }
}
