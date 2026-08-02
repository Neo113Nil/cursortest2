package com.google.android.gms.internal.fido;

import B0.A0;
import C.o0;
import N3.C3660k;
import T7.E;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    private static final Comparator zza;
    public static final zzgx zzb = new zzgu(zzhc.zzd);
    private static final zzgw zzd;
    private int zzc = 0;

    static {
        int i11 = zzgn.zza;
        zzd = new zzgw(null);
        zza = new zzgp();
    }

    zzgx() {
    }

    static int zzj(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(E.a(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A0.a(i12, i13, "End index: ", " >= "));
    }

    public static zzgx zzl(byte[] bArr, int i11, int i12) {
        zzj(0, i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        return new zzgu(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zzc;
        if (i11 == 0) {
            int zzd2 = zzd();
            i11 = zzf(zzd2, 0, zzd2);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zzc = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgo(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o0.c(C3660k.c(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzhe.zza(this) : zzhe.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i11, int i12, int i13);

    protected abstract int zzf(int i11, int i12, int i13);

    public abstract zzgx zzg(int i11, int i12);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzhc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
